# ==============================================================================================
# ╦  ┬┌─┐┌─┐┌┐┌┌─┐┌─┐    Yaksha Programming Language
# ║  ││  ├┤ │││└─┐├┤     is Licensed with GPLv3 + exta terms. Please see below.
# ╩═╝┴└─┘└─┘┘└┘└─┘└─┘
# Note: libs - MIT license, runtime/3rd - various
# ==============================================================================================
# GPLv3:
# 
# Yaksha - Programming Language.
# Copyright (C) 2020 - 2023 Bhathiya Perera
# 
# This program is free software: you can redistribute it and/or modify it under the terms
# of the GNU General Public License as published by the Free Software Foundation,
# either version 3 of the License, or (at your option) any later version.
# 
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
# or FITNESS FOR A PARTICULAR PURPOSE.
# See the GNU General Public License for more details.
# 
# You should have received a copy of the GNU General Public License along with this program.
# If not, see https://www.gnu.org/licenses/.
# 
# ==============================================================================================
# Additional Terms:
# 
# Please note that any commercial use of the programming language's compiler source code
# (everything except compiler/runtime, compiler/libs and compiler/3rd) require a written agreement
# with author of the language (Bhathiya Perera).
# 
# If you are using it for an open source project, please give credits.
# Your own project must use GPLv3 license with these additional terms.
# 
# You may use programs written in Yaksha/YakshaLisp for any legal purpose
# (commercial, open-source, closed-source, etc) as long as it agrees
# to the licenses of linked runtime libraries (see compiler/runtime/README.md).
# 
# ==============================================================================================
# !/usr/bin/env python
"""
Update ic_token.h
Generate utility functions and enums for different types of tokens
Keyword token related functions are generated as well
Template also contains - `ic_token` & `ic_parsing_error` data structures.

Reference: https://www.quut.com/c/ANSI-C-grammar-l-2011.html
"""
import os.path

K_TOKENS_LIST = "$TOKENS$"
K_TOKEN_TO_STR = "$TOKEN_TO_STR$"
K_STR_TO_TOKEN = "$STR_TO_TOKEN$"
K_KW_TO_TOKEN = "$KW_TO_TOKEN$"
UNKNOWN = "TK_UNKNOWN_TOKEN_DETECTED"

KEYWORDS = sorted([
    "auto",
    "break",
    "case",
    "char",
    "const",
    "continue",
    "default",
    "do",
    "double",
    "else",
    "enum",
    "extern",
    "float",
    "for",
    "goto",
    "if",
    "inline",
    "int",
    "long",
    "register",
    "restrict",
    "return",
    "short",
    "signed",
    "sizeof",
    "static",
    "struct",
    "switch",
    "typedef",
    "union",
    "unsigned",
    "void",
    "volatile",
    "while",
    "_Alignas",
    "_Alignof",
    "_Atomic",
    "_Bool",
    "_Complex",
    "_Generic",
    "_Imaginary",
    "_Noreturn",
    "_Static_assert",
    "_Thread_local",
    "__func__"
])
TOKENS = sorted([
    "COMMENT", "MULTILINE_COMMENT", "INTEGER_CONSTANT", "FLOAT_CONSTANT", "STRING_LITERAL",
    "ELLIPSIS",
    "RIGHT_ASSIGN",
    "LEFT_ASSIGN",
    "ADD_ASSIGN",
    "SUB_ASSIGN",
    "MUL_ASSIGN",
    "DIV_ASSIGN",
    "MOD_ASSIGN",
    "AND_ASSIGN",
    "XOR_ASSIGN",
    "OR_ASSIGN",
    "RIGHT_OP",
    "LEFT_OP",
    "INC_OP",
    "DEC_OP",
    "PTR_OP",
    "AND_OP",
    "OR_OP",
    "LE_OP",
    "GE_OP",
    "EQ_OP",
    "NE_OP",
    "SEMICOLON",
    "OPEN_CURLY",
    "CLOSE_CURLY",
    "COMMA",
    "COLON",
    "EQ",
    "OPEN_PAREN",
    "CLOSE_PAREN",
    "OPEN_BRACKET",
    "CLOSE_BRACKET",
    "DOT",
    "AMPERSAND",
    "BOOL_NOT",
    "BITWISE_NOT",
    "ADD",
    "SUB",
    "MUL",
    "DIV",
    "MOD",
    "LESS",
    "GREATER",
    "XOR",
    "OR",
    "QUESTION",
    # -----------
    # Other
    "IDENTIFIER", "NON_IDENTIFIER",  # special to support l1 tokenizer
    "TYPEDEF_NAME", "ENUMERATION_CONSTANT", "TC_EOF",
    # ------------
    # Preprocessor
    "PP_DEFINE", "PP_UNDEF", "PP_ERROR", "PP_LINE", "PP_WARN", "PP_PRAGMA",
    "PP_INCLUDE", "PP_IF", "PP_IF_DEF", "PP_IF_N_DEF", "PP_ELSE", "PP_ELIF", "PP_ENDIF",
    "PP_DEFINED",
    # __FILE__, __LINE__, __VA_ARGS__
    "PP_DUNDER_FILE", "PP_DUNDER_LINE", "PP_DUNDER_VARARGS",
    # a##b, #b
    "PP_CONCAT", "PP_STRINGIFY",
    # ------------
    # Temporary
    # '#', '##', '\'
    "HASH", "HASH_HASH", "BACKSLASH", "NEWLINE"
]) + ["KEYWORD_" + x.upper().replace("_", "") for x in KEYWORDS]
INTEGER_TYPES = ["UNUSED_DEFAULT",
                 "I_I",
                 "I_L",
                 "I_LL",
                 "I_U",
                 "I_UL",
                 "I_ULL",
                 "I_NOTHING"]
INTEGER_BASES = ["UNUSED_DEFAULT",
                 "I_HEX",
                 "I_DEC",
                 "I_OCT",
                 "I_BIN",
                 "I_SINGLE_QUOTED",
                 "I_SINGLE_QUOTED_L"]
STRING_LIT_TYPES = [
    "UNUSED_DEFAULT",
    "S_STRING",
    "S_STRING_L"
]
FLOAT_TYPES = [
    "UNUSED_DEFAULT",
    "F_FLOAT",
    "F_DOUBLE",
    "F_LONG_DOUBLE"
]
EXTRA_ENUMS = {
    "ic_integer_type": INTEGER_TYPES,
    "ic_integer_base": INTEGER_BASES,
    "ic_string_literal_type": STRING_LIT_TYPES,
    "ic_float_type": FLOAT_TYPES
}
TEMPLATE = r"""
// ic_token.h
// generated by ic_update_tokens.py
#ifndef IC_TOKEN_H
#define IC_TOKEN_H
#include <string>
#include <filesystem>
#include <vector>
namespace yaksha {
/**
 * Most simple types of tokens we can match with tokenizing
 */
enum class ic_token_type {
$TOKENS$
};
/**
 * Convert a token to a string
 * @param t token type
 * @return token type as a std::string
 */
static inline std::string ic_token_to_str(const ic_token_type &t) {
$TOKEN_TO_STR$
}
static inline ic_token_type ic_str_to_token(const std::string &t) {
$STR_TO_TOKEN$
}
static inline ic_token_type ic_str_to_keyword(const std::string &t) {
$KW_TO_TOKEN$
}
enum class ic_integer_type {
$ic_integer_type$
};
static inline std::string ic_integer_type_to_str(const ic_integer_type &t) {
$ic_integer_type_to_str$
}
static inline ic_integer_type str_to_ic_integer_type(const std::string &t) {
$ic_integer_type_from_str$
}
enum class ic_integer_base {
$ic_integer_base$
};
static inline std::string ic_integer_base_to_str(const ic_integer_base &t) {
$ic_integer_base_to_str$
}
static inline ic_integer_base str_to_ic_integer_base(const std::string &t) {
$ic_integer_base_from_str$
}
enum class ic_string_literal_type {
$ic_string_literal_type$
};
static inline std::string ic_string_literal_type_to_str(const ic_string_literal_type &t) {
$ic_string_literal_type_to_str$
}
static inline ic_string_literal_type str_to_ic_string_literal_type(const std::string &t) {
$ic_string_literal_type_from_str$
}
enum class ic_float_type {
$ic_float_type$
};
static inline std::string ic_float_type_to_str(const ic_float_type &t) {
$ic_float_type_to_str$
}
static inline ic_float_type str_to_ic_float_type(const std::string &t) {
$ic_float_type_from_str$
}
/**
 * Single token
 */
struct ic_token {
  std::string file_;  // filename
  int line_;          // line in file
  int pos_;           // position in line
  std::string token_;
  ic_token_type type_;   // type of the token
  std::string original_;
  ic_integer_type itype_{ic_integer_type::UNUSED_DEFAULT};
  ic_integer_base ibase_{ic_integer_base::UNUSED_DEFAULT};
  ic_string_literal_type stype_{ic_string_literal_type::UNUSED_DEFAULT};
  ic_float_type ftype_{ic_float_type::UNUSED_DEFAULT};
};
/**
 * Content of an error message
 */
struct ic_parsing_error {
  std::string message_; // content of the line this error occurred
  ic_token tok_;
  bool token_set_{};
  ic_parsing_error(std::string message, ic_token* at);
  ic_parsing_error(std::string message, std::string file, int line, int pos);
};
} // namespace yaksha
#endif
""".strip()
STR_TOK_TEMPLATE = r"""
  if (t == "$K$")
    return ic_token_type::$K$;
""".strip()
TOK_STR_TEMPLATE = r"""
  if (t == ic_token_type::$K$)
    return "$K$";
""".strip()
KW_TO_TOKEN = r"""
  if (t == "$K$")
    return ic_token_type::KEYWORD_$KU$;
""".strip()
GENERIC_STR_TOK_TEMPLATE = r"""
  if (t == "$K$")
    return $T$::$K$;
""".strip()
GENERIC_TOK_STR_TEMPLATE = r"""
  if (t == $T$::$K$)
    return "$K$";
""".strip()


def add_extra_templates(code):
    edited = code
    replacements = {}
    for enum_t, items in EXTRA_ENUMS.items():
        replacements[enum_t] = ",".join(items + [UNKNOWN])
        str_tok_ = []
        tok_str_ = []
        for item in items:
            str_tok_.append(GENERIC_STR_TOK_TEMPLATE.replace("$K$", item).replace("$T$", enum_t))
            tok_str_.append(GENERIC_TOK_STR_TEMPLATE.replace("$K$", item).replace("$T$", enum_t))
        str_tok_.append("return " + enum_t + "::" + UNKNOWN + ";")
        tok_str_.append("return \"" + UNKNOWN + "\";")
        replacements[enum_t + "_to_str"] = "\n".join(tok_str_)
        replacements[enum_t + "_from_str"] = "\n".join(str_tok_)
    for r, t in replacements.items():
        edited = edited.replace("$" + r + "$", t)
    return edited


def main():
    os.chdir(os.path.dirname(os.path.dirname(__file__)))
    with open(os.path.join(".", "src", "ic2c", "ic_token.h"), "w+") as h:
        token_list = ",\n".join(["  " + x for x in TOKENS]) + ",\n  " + UNKNOWN
        str_to_tok = "\n".join(["  " + STR_TOK_TEMPLATE.replace("$K$", x) for x in TOKENS]) \
                     + "\n  return ic_token_type::" + UNKNOWN + ";"
        kw_to_tok = "\n".join(
            ["  " + KW_TO_TOKEN.replace("$K$", x).replace("$KU$", x.upper().replace("_", "")) for x in KEYWORDS]) \
                    + "\n  return ic_token_type::" + UNKNOWN + ";"
        tok_to_str = "\n".join(["  " + TOK_STR_TEMPLATE.replace("$K$", x) for x in TOKENS]) \
                     + "\n  return \"" + UNKNOWN + "\";"
        code = TEMPLATE.replace(K_TOKENS_LIST, token_list) \
            .replace(K_TOKEN_TO_STR, tok_to_str).replace(K_STR_TO_TOKEN, str_to_tok) \
            .replace(K_KW_TO_TOKEN, kw_to_tok)
        h.write(add_extra_templates(code))


if __name__ == "__main__":
    main()
