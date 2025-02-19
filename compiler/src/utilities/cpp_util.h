// ==============================================================================================
// ╦  ┬┌─┐┌─┐┌┐┌┌─┐┌─┐    Yaksha Programming Language
// ║  ││  ├┤ │││└─┐├┤     is Licensed with GPLv3 + exta terms. Please see below.
// ╩═╝┴└─┘└─┘┘└┘└─┘└─┘
// Note: libs - MIT license, runtime/3rd - various
// ==============================================================================================
// GPLv3:
//
// Yaksha - Programming Language.
// Copyright (C) 2020 - 2023 Bhathiya Perera
//
// This program is free software: you can redistribute it and/or modify it under the terms
// of the GNU General Public License as published by the Free Software Foundation,
// either version 3 of the License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
// or FITNESS FOR A PARTICULAR PURPOSE.
// See the GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License along with this program.
// If not, see https://www.gnu.org/licenses/.
//
// ==============================================================================================
// Additional Terms:
//
// Please note that any commercial use of the programming language's compiler source code
// (everything except compiler/runtime, compiler/libs and compiler/3rd) require a written agreement
// with author of the language (Bhathiya Perera).
//
// If you are using it for an open source project, please give credits.
// Your own project must use GPLv3 license with these additional terms.
//
// You may use programs written in Yaksha/YakshaLisp for any legal purpose
// (commercial, open-source, closed-source, etc) as long as it agrees
// to the licenses of linked runtime libraries (see compiler/runtime/README.md).
//
// ==============================================================================================
// cpp_util.h
/**
 * C Preprocessor utilities
 */
#ifndef CPP_UTIL_H
#define CPP_UTIL_H
#include <algorithm>
#include <iostream>
#include <sstream>
// ╔╦╗┌─┐┌┬┐┌─┐┬  ┌─┐┌┬┐┌─┐  ╔╦╗┌─┐┌─┐┬┌─┐
//  ║ ├┤ │││├─┘│  ├─┤ │ ├┤   ║║║├─┤│ ┬││
//  ╩ └─┘┴ ┴┴  ┴─┘┴ ┴ ┴ └─┘  ╩ ╩┴ ┴└─┘┴└─┘
// reference: https://stackoverflow.com/a/42198760
// enum to int with +ENUM
template<typename T>
constexpr auto operator+(T e) noexcept
    -> std::enable_if_t<std::is_enum<T>::value, std::underlying_type_t<T>> {
  return static_cast<std::underlying_type_t<T>>(e);
}
//
// ╦ ╦╔═╗╦╔═╔═╗╦ ╦╔═╗    ╔═╗╔═╗
// ╚╦╝╠═╣╠╩╗╚═╗╠═╣╠═╣    ║ ║╚═╗
//  ╩ ╩ ╩╩ ╩╚═╝╩ ╩╩ ╩────╚═╝╚═╝
#if defined(WIN32) || defined(__WIN32__) || defined(_WIN32) ||                 \
    defined(_WIN64) || defined(_MSC_VER) || defined(__MINGW32__)
#define YAKSHA_OS "WINDOWS"
#define YAKSHA_OS_WINDOWS
#elif defined(__APPLE__)
#define YAKSHA_OS "MACOS"
#define YAKSHA_OS_MACOS
#elif defined(linux) || defined(__linux) || defined(__linux__)
#define YAKSHA_OS "LINUX"
#define YAKSHA_OS_LINUX
#else
#define YAKSHA_OS "UNKNOWN"
#define YAKSHA_OS_UNKNOWN
#endif
#define YAKSHA_DEBUG_LOG(msg)                                                  \
  do {                                                                         \
    std::cout << "// [DEBUG] " << __FILE__ << ":" << __LINE__ << ": " << msg   \
              << std::endl;                                                    \
  } while (0)
//
// ╦ ╦╔═╗╦╔═╔═╗╦ ╦╔═╗    ╔╦╗╔═╗╔╗ ╦ ╦╔═╗
// ╚╦╝╠═╣╠╩╗╚═╗╠═╣╠═╣     ║║║╣ ╠╩╗║ ║║ ╦
//  ╩ ╩ ╩╩ ╩╚═╝╩ ╩╩ ╩────═╩╝╚═╝╚═╝╚═╝╚═╝
//
//// ---- less verbose during tests
#ifndef YAKSHA_FAST_TESTS
#define YAKSHA_FAST_TESTS
#endif
//// ---- debug gc pool
//#ifndef GC_POOL_DEBUG
//#define GC_POOL_DEBUG
//#endif
//// ---- print lisp data types differently (make certain tests fail)
//#ifndef YASKSHA_LISP_PRINT_TYPE
//#define YASKSHA_LISP_PRINT_TYPE
//#endif
//// ---- testing and error capturing mode enabled
#ifndef YAKSHA_TESTING
#define YAKSHA_TESTING
#endif
//// ---- yaksha compiler steps are debugged
//#ifndef YAKSHA_DEBUG_COMPILE
//#define YAKSHA_DEBUG_COMPILE
//#endif
//#define IC_TOKENIZER_PRINT_TOKENS
//#define SLOW_TESTS
//// ---- yaksha high level debug enabled if we are in possible debug mode
// #define YAKSHA_DEBUG
#if !defined(YAKSHA_DEBUG) &&                                                  \
    (defined(DEBUG) || defined(_DEBUG) || !defined(NDEBUG)) &&                 \
    !defined(YAKSHA_FAST_TESTS)
#define YAKSHA_DEBUG
#endif
// -----------------------
// ------------- debug logs for compiling ---------
#ifdef YAKSHA_DEBUG_COMPILE
#define LOG_COMP(msg) YAKSHA_DEBUG_LOG("[COMP] " << msg)
#else
#define LOG_COMP(msg)
#endif
#ifndef YAKSHA_DEADCODE_ELIMINATION
#define YAKSHA_DEADCODE_ELIMINATION
#endif
// useful stuff
namespace yaksha {
  std::string get_my_exe_path();
  // trim from start (in place)
  static inline void ltrim(std::string &s) {
    s.erase(s.begin(), std::find_if(s.begin(), s.end(), [](unsigned char ch) {
              return !std::isspace(ch);
            }));
  }
  // trim from end (in place)
  static inline void rtrim(std::string &s) {
    s.erase(std::find_if(s.rbegin(), s.rend(),
                         [](unsigned char ch) { return !std::isspace(ch); })
                .base(),
            s.end());
  }
  // trim from both ends (in place)
  static inline void trim(std::string &s) {
    ltrim(s);
    rtrim(s);
  }
  // trim from both ends (copying)
  static inline std::string trim_copy(std::string s) {
    trim(s);
    return s;
  }
  // https://stackoverflow.com/questions/5878775/how-to-find-and-replace-string
  static inline void replace_all(std::string &s, std::string const &toReplace,
                                 std::string const &replaceWith) {
    std::ostringstream oss;
    std::size_t pos = 0;
    std::size_t prevPos = pos;
    while (true) {
      prevPos = pos;
      pos = s.find(toReplace, pos);
      if (pos == std::string::npos) { break; }
      oss << s.substr(prevPos, pos - prevPos);
      oss << replaceWith;
      pos += toReplace.size();
    }
    oss << s.substr(prevPos);
    s = oss.str();
  }
}// namespace yaksha
#endif
