/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.psi.YakshaTokenType;
import org.intellij.sdk.language.psi.YakshaTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Yaksha.flex</tt>
 */
class YakshaLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [8, 6, 7]
   * Total runtime size is 1040 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>13]|((ch>>7)&0x3f)]|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 136 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\207\100");

  /* The ZZ_CMAP_Y table has 128 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\177\200");

  /* The ZZ_CMAP_A table has 256 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\2\0\1\1\22\0\1\4\1\72\1\26\1\5\3\0\1\24\1\60\1\61\1\66\1\23"+
    "\1\75\1\64\1\21\1\67\1\10\1\16\1\15\1\56\1\57\1\17\1\55\1\17\1\54\1\11\1\74"+
    "\1\0\1\70\1\71\1\65\1\0\1\73\4\14\1\22\1\20\3\6\1\76\1\6\1\12\1\6\1\53\5\6"+
    "\1\52\3\6\1\13\2\6\1\62\1\25\1\63\1\0\1\7\1\0\1\27\1\31\1\35\1\40\1\33\1\45"+
    "\1\6\1\51\1\43\1\76\1\34\1\36\1\46\1\41\1\37\1\47\1\6\1\32\1\30\1\42\1\44"+
    "\1\6\1\50\1\13\2\6\205\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\2\3\1\4\1\5\2\6\1\5"+
    "\1\7\1\10\2\11\20\5\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\1\1\23\1\24"+
    "\1\25\1\3\2\4\3\6\1\0\4\6\1\0\1\5"+
    "\6\11\1\26\12\5\1\27\4\5\1\30\1\5\1\31"+
    "\7\5\1\32\1\17\1\3\4\6\1\0\1\5\3\11"+
    "\1\33\11\5\1\34\1\35\1\36\6\5\1\37\2\6"+
    "\1\5\4\0\3\5\1\40\1\41\5\5\1\42\1\5"+
    "\1\43\1\44\2\6\1\45\2\0\1\46\2\5\1\47"+
    "\1\50\1\5\1\51\1\5\1\52\2\6\1\53\2\5"+
    "\1\54\2\6\2\5\2\6\1\5\1\55\2\6\1\5"+
    "\2\6\1\5\1\0\1\6\1\5\1\0\1\6\1\5"+
    "\1\0\1\6\1\5\1\0\1\6\1\56\1\0\1\6"+
    "\1\0\1\6\1\0\1\6\1\0\5\6";

  private static int [] zzUnpackAction() {
    int [] result = new int[200];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\77\0\176\0\77\0\275\0\374\0\u013b\0\u017a"+
    "\0\u01b9\0\u01f8\0\u0237\0\u0276\0\77\0\u02b5\0\u02f4\0\u0333"+
    "\0\u0372\0\u03b1\0\u03f0\0\u042f\0\u046e\0\u04ad\0\u04ec\0\u052b"+
    "\0\u056a\0\u05a9\0\u05e8\0\u0627\0\u0666\0\u06a5\0\u06e4\0\77"+
    "\0\77\0\77\0\77\0\u0723\0\u0762\0\77\0\77\0\u0762"+
    "\0\u0762\0\77\0\77\0\77\0\u07a1\0\u07e0\0\77\0\u081f"+
    "\0\u085e\0\77\0\u089d\0\u08dc\0\u091b\0\u095a\0\u0999\0\u09d8"+
    "\0\u0a17\0\u0a56\0\u0a95\0\u0ad4\0\u0b13\0\u0b52\0\u0b91\0\u017a"+
    "\0\u0bd0\0\u0c0f\0\u0c4e\0\u0c8d\0\u0ccc\0\u0d0b\0\u0d4a\0\u0d89"+
    "\0\u0dc8\0\u0e07\0\u017a\0\u0e46\0\u0e85\0\u0ec4\0\u0f03\0\u017a"+
    "\0\u0f42\0\u017a\0\u0f81\0\u0fc0\0\u0fff\0\u103e\0\u107d\0\u10bc"+
    "\0\u10fb\0\77\0\77\0\u113a\0\u1179\0\u11b8\0\u11f7\0\u1236"+
    "\0\u1275\0\u12b4\0\77\0\u12f3\0\u1332\0\u017a\0\u1371\0\u13b0"+
    "\0\u13ef\0\u142e\0\u146d\0\u14ac\0\u14eb\0\u152a\0\u1569\0\u017a"+
    "\0\u15a8\0\u017a\0\u15e7\0\u1626\0\u1665\0\u16a4\0\u16e3\0\u1722"+
    "\0\u1761\0\u17a0\0\u17df\0\u181e\0\u185d\0\u189c\0\u18db\0\u191a"+
    "\0\u1959\0\u1998\0\u19d7\0\u017a\0\u017a\0\u1a16\0\u1a55\0\u1a94"+
    "\0\u1ad3\0\u1b12\0\u017a\0\u1b51\0\u017a\0\u017a\0\u1b90\0\u1bcf"+
    "\0\u017a\0\u1c0e\0\u1c4d\0\u017a\0\u1c8c\0\u1ccb\0\u017a\0\u017a"+
    "\0\u1d0a\0\u017a\0\u1d49\0\u017a\0\u1d88\0\u1dc7\0\u017a\0\u1e06"+
    "\0\u1e45\0\u017a\0\u1e84\0\u1ec3\0\u1f02\0\u1f41\0\u1f80\0\u1fbf"+
    "\0\u1ffe\0\u017a\0\u203d\0\u207c\0\u20bb\0\u20fa\0\u2139\0\u2178"+
    "\0\u21b7\0\u21f6\0\u2235\0\u2274\0\u22b3\0\u22f2\0\u2331\0\u2370"+
    "\0\u23af\0\u23ee\0\u242d\0\u017a\0\u246c\0\u24ab\0\u24ea\0\u2529"+
    "\0\u2568\0\u25a7\0\u25e6\0\u2625\0\u2664\0\u26a3\0\u26e2\0\u2721";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[200];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\2"+
    "\1\11\1\12\3\10\3\12\1\13\1\14\1\10\1\15"+
    "\1\16\1\2\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\10\1\25\1\10\1\26\1\27\1\30\1\10\1\31"+
    "\1\32\1\33\1\10\1\34\1\35\1\10\1\36\1\37"+
    "\4\12\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\45\1\50\1\51\1\52\1\53\1\54\1\10"+
    "\101\0\1\4\77\0\2\5\1\7\74\0\1\5\1\55"+
    "\1\7\71\0\1\7\1\56\1\57\74\7\6\0\13\10"+
    "\1\0\1\10\4\0\31\10\16\0\1\10\10\0\1\60"+
    "\1\61\1\62\1\63\1\0\1\64\1\65\1\64\1\66"+
    "\1\67\1\70\10\0\1\70\2\0\1\62\6\0\1\66"+
    "\6\0\1\61\3\64\27\0\2\12\1\62\2\0\3\12"+
    "\1\66\1\67\1\70\10\0\1\70\2\0\1\62\6\0"+
    "\1\66\6\0\4\12\25\0\13\10\1\0\1\10\4\0"+
    "\1\71\30\10\16\0\1\10\10\0\2\67\3\0\3\67"+
    "\34\0\4\67\17\0\1\72\2\0\21\72\1\73\1\74"+
    "\51\72\1\75\2\0\22\75\1\76\1\77\50\75\6\0"+
    "\13\10\1\0\1\10\4\0\1\10\1\100\10\10\1\101"+
    "\16\10\16\0\1\10\6\0\13\10\1\0\1\10\4\0"+
    "\13\10\1\102\15\10\16\0\1\10\6\0\13\10\1\0"+
    "\1\10\4\0\3\10\1\103\4\10\1\104\20\10\16\0"+
    "\1\10\6\0\13\10\1\0\1\10\4\0\4\10\1\105"+
    "\10\10\1\106\13\10\16\0\1\10\6\0\13\10\1\0"+
    "\1\10\4\0\7\10\1\107\21\10\16\0\1\10\6\0"+
    "\13\10\1\0\1\10\4\0\6\10\1\110\1\111\1\112"+
    "\20\10\16\0\1\10\6\0\13\10\1\0\1\10\4\0"+
    "\3\10\1\113\25\10\16\0\1\10\6\0\13\10\1\0"+
    "\1\10\4\0\4\10\1\114\24\10\16\0\1\10\6\0"+
    "\13\10\1\0\1\10\4\0\10\10\1\115\20\10\16\0"+
    "\1\10\6\0\10\10\1\116\2\10\1\0\1\10\4\0"+
    "\12\10\1\117\3\10\1\120\1\121\5\10\1\122\1\123"+
    "\1\124\1\10\16\0\1\10\6\0\10\10\1\116\2\10"+
    "\1\0\1\10\4\0\25\10\1\122\1\123\1\124\1\10"+
    "\16\0\1\10\6\0\13\10\1\0\1\10\4\0\7\10"+
    "\1\125\16\10\1\123\1\124\1\10\16\0\1\10\6\0"+
    "\13\10\1\0\1\10\4\0\1\126\30\10\16\0\1\10"+
    "\6\0\13\10\1\0\1\10\4\0\22\10\1\127\6\10"+
    "\16\0\1\10\6\0\13\10\1\0\1\10\4\0\3\10"+
    "\1\130\25\10\16\0\1\10\6\0\13\10\1\0\1\10"+
    "\4\0\10\10\1\131\20\10\16\0\1\10\65\0\1\132"+
    "\102\0\1\133\10\0\1\5\1\134\1\7\73\0\1\57"+
    "\104\0\1\60\1\61\1\62\2\0\1\64\1\65\1\64"+
    "\1\66\1\67\1\70\10\0\1\70\2\0\1\62\6\0"+
    "\1\66\6\0\1\61\3\64\27\0\2\61\3\0\3\61"+
    "\1\66\1\67\1\70\10\0\1\70\11\0\1\66\6\0"+
    "\4\61\27\0\1\135\1\136\2\0\5\136\1\0\1\136"+
    "\4\0\1\136\1\0\1\136\1\0\1\136\1\0\1\136"+
    "\2\0\1\136\4\0\1\136\6\0\4\136\27\0\1\137"+
    "\1\61\1\62\2\0\3\137\1\66\1\67\1\70\10\0"+
    "\1\70\2\0\1\62\6\0\1\66\6\0\1\61\3\137"+
    "\27\0\1\64\1\61\1\62\2\0\3\64\1\66\1\67"+
    "\1\70\10\0\1\70\2\0\1\62\6\0\1\66\6\0"+
    "\1\61\3\64\115\0\1\62\10\0\2\67\3\0\3\67"+
    "\1\66\1\0\1\70\10\0\1\70\11\0\1\66\6\0"+
    "\4\67\27\0\2\140\3\0\3\140\3\0\1\141\30\0"+
    "\4\140\4\0\1\141\20\0\13\10\1\0\1\10\4\0"+
    "\7\10\1\142\21\10\16\0\1\10\1\72\2\0\21\72"+
    "\1\143\1\74\51\72\24\0\1\144\52\0\77\72\1\75"+
    "\2\0\22\75\1\76\1\143\147\75\26\0\1\145\56\0"+
    "\13\10\1\0\1\10\4\0\11\10\1\146\17\10\16\0"+
    "\1\10\6\0\13\10\1\0\1\10\4\0\3\10\1\122"+
    "\25\10\16\0\1\10\6\0\13\10\1\0\1\10\4\0"+
    "\4\10\1\147\24\10\16\0\1\10\6\0\13\10\1\0"+
    "\1\10\4\0\10\10\1\150\20\10\16\0\1\10\6\0"+
    "\13\10\1\0\1\10\4\0\13\10\1\151\15\10\16\0"+
    "\1\10\6\0\13\10\1\0\1\10\4\0\12\10\1\152"+
    "\16\10\16\0\1\10\6\0\13\10\1\0\1\10\4\0"+
    "\1\10\1\153\12\10\1\154\14\10\16\0\1\10\6\0"+
    "\13\10\1\0\1\10\4\0\10\10\1\155\20\10\16\0"+
    "\1\10\6\0\13\10\1\0\1\10\4\0\1\156\30\10"+
    "\16\0\1\10\6\0\13\10\1\0\1\10\4\0\12\10"+
    "\1\157\16\10\16\0\1\10\6\0\13\10\1\0\1\10"+
    "\4\0\7\10\1\160\6\10\1\161\12\10\16\0\1\10"+
    "\6\0\13\10\1\0\1\10\4\0\13\10\1\162\15\10"+
    "\16\0\1\10\6\0\13\10\1\0\1\10\4\0\26\10"+
    "\1\122\2\10\16\0\1\10\6\0\13\10\1\0\1\10"+
    "\4\0\13\10\1\122\15\10\16\0\1\10\6\0\13\10"+
    "\1\0\1\10\4\0\20\10\1\163\10\10\16\0\1\10"+
    "\6\0\13\10\1\0\1\10\4\0\30\10\1\122\16\0"+
    "\1\10\6\0\7\10\1\122\3\10\1\0\1\10\4\0"+
    "\31\10\16\0\1\10\6\0\13\10\1\0\1\10\4\0"+
    "\10\10\1\164\20\10\16\0\1\10\6\0\13\10\1\0"+
    "\1\10\4\0\1\10\1\165\27\10\16\0\1\10\6\0"+
    "\13\10\1\0\1\10\4\0\14\10\1\166\14\10\16\0"+
    "\1\10\6\0\13\10\1\0\1\10\4\0\15\10\1\167"+
    "\13\10\16\0\1\10\6\0\13\10\1\0\1\10\4\0"+
    "\12\10\1\170\16\10\16\0\1\10\3\0\1\5\1\171"+
    "\1\7\101\0\1\135\1\136\1\62\1\0\5\136\1\0"+
    "\1\136\4\0\1\136\1\0\1\136\1\0\1\136\1\0"+
    "\1\136\1\62\1\0\1\136\4\0\1\136\6\0\4\136"+
    "\27\0\2\172\1\62\1\0\5\172\1\0\1\172\4\0"+
    "\1\172\1\0\1\172\1\0\1\172\1\0\1\172\1\62"+
    "\1\0\1\172\4\0\1\172\6\0\4\172\27\0\1\173"+
    "\1\61\1\62\2\0\3\173\1\66\1\67\1\70\10\0"+
    "\1\70\2\0\1\62\6\0\1\66\6\0\1\61\3\173"+
    "\27\0\2\140\3\0\3\140\1\66\24\0\1\66\6\0"+
    "\4\140\27\0\2\140\3\0\3\140\34\0\4\140\25\0"+
    "\13\10\1\0\1\10\4\0\1\10\1\174\27\10\16\0"+
    "\1\10\24\144\1\175\1\176\51\144\25\145\1\177\1\200"+
    "\50\145\6\0\13\10\1\0\1\10\4\0\1\201\30\10"+
    "\16\0\1\10\6\0\13\10\1\0\1\10\4\0\7\10"+
    "\1\122\21\10\16\0\1\10\6\0\13\10\1\0\1\10"+
    "\4\0\15\10\1\202\13\10\16\0\1\10\6\0\13\10"+
    "\1\0\1\10\4\0\13\10\1\203\15\10\16\0\1\10"+
    "\6\0\13\10\1\0\1\10\4\0\4\10\1\204\24\10"+
    "\16\0\1\10\6\0\13\10\1\0\1\10\4\0\16\10"+
    "\1\205\12\10\16\0\1\10\6\0\13\10\1\0\1\10"+
    "\4\0\11\10\1\206\17\10\16\0\1\10\6\0\13\10"+
    "\1\0\1\10\4\0\1\10\1\207\27\10\16\0\1\10"+
    "\6\0\13\10\1\0\1\10\4\0\13\10\1\210\15\10"+
    "\16\0\1\10\6\0\13\10\1\0\1\10\4\0\4\10"+
    "\1\211\24\10\16\0\1\10\6\0\13\10\1\0\1\10"+
    "\4\0\10\10\1\212\20\10\16\0\1\10\6\0\13\10"+
    "\1\0\1\10\4\0\1\117\30\10\16\0\1\10\6\0"+
    "\13\10\1\0\1\10\4\0\1\10\1\213\27\10\16\0"+
    "\1\10\6\0\13\10\1\0\1\10\4\0\7\10\1\214"+
    "\21\10\16\0\1\10\6\0\13\10\1\0\1\10\4\0"+
    "\4\10\1\215\24\10\16\0\1\10\6\0\13\10\1\0"+
    "\1\10\4\0\4\10\1\216\24\10\16\0\1\10\3\0"+
    "\1\5\1\6\1\7\101\0\2\217\1\62\1\0\5\217"+
    "\1\0\1\217\4\0\1\217\1\0\1\217\1\0\1\217"+
    "\1\0\1\217\1\62\1\0\1\217\4\0\1\217\6\0"+
    "\4\217\27\0\1\220\1\61\1\62\2\0\3\220\1\66"+
    "\1\67\1\70\10\0\1\70\2\0\1\62\6\0\1\66"+
    "\6\0\1\61\3\220\25\0\13\10\1\0\1\10\4\0"+
    "\4\10\1\221\24\10\16\0\1\10\24\144\1\222\1\176"+
    "\150\144\124\145\1\177\1\223\50\145\6\0\13\10\1\0"+
    "\1\10\4\0\5\10\1\224\23\10\16\0\1\10\6\0"+
    "\13\10\1\0\1\10\4\0\3\10\1\225\25\10\16\0"+
    "\1\10\6\0\13\10\1\0\1\10\4\0\14\10\1\226"+
    "\14\10\16\0\1\10\6\0\13\10\1\0\1\10\4\0"+
    "\4\10\1\227\24\10\16\0\1\10\6\0\13\10\1\0"+
    "\1\10\4\0\1\10\1\230\27\10\16\0\1\10\6\0"+
    "\13\10\1\0\1\10\4\0\14\10\1\231\14\10\16\0"+
    "\1\10\6\0\13\10\1\0\1\10\4\0\3\10\1\232"+
    "\25\10\16\0\1\10\6\0\13\10\1\0\1\10\4\0"+
    "\3\10\1\233\25\10\16\0\1\10\6\0\13\10\1\0"+
    "\1\10\4\0\4\10\1\234\24\10\16\0\1\10\10\0"+
    "\2\235\1\62\1\0\5\235\1\0\1\235\4\0\1\235"+
    "\1\0\1\235\1\0\1\235\1\0\1\235\1\62\1\0"+
    "\1\235\4\0\1\235\6\0\4\235\27\0\1\236\1\61"+
    "\1\62\2\0\3\236\1\66\1\67\1\70\10\0\1\70"+
    "\2\0\1\62\6\0\1\66\6\0\1\61\3\236\17\0"+
    "\24\144\1\143\1\176\51\144\25\145\1\177\1\143\50\145"+
    "\6\0\13\10\1\0\1\10\4\0\12\10\1\237\16\10"+
    "\16\0\1\10\6\0\13\10\1\0\1\10\4\0\17\10"+
    "\1\240\11\10\16\0\1\10\6\0\13\10\1\0\1\10"+
    "\4\0\12\10\1\241\16\10\16\0\1\10\6\0\13\10"+
    "\1\0\1\10\4\0\13\10\1\242\15\10\16\0\1\10"+
    "\10\0\2\243\1\62\1\0\5\243\1\0\1\243\4\0"+
    "\1\243\1\0\1\243\1\0\1\243\1\0\1\243\1\62"+
    "\1\0\1\243\4\0\1\243\6\0\4\243\27\0\1\244"+
    "\1\61\1\62\2\0\3\244\1\66\1\67\1\70\10\0"+
    "\1\70\2\0\1\62\6\0\1\66\6\0\1\61\3\244"+
    "\25\0\13\10\1\0\1\10\4\0\4\10\1\245\24\10"+
    "\16\0\1\10\6\0\13\10\1\0\1\10\4\0\15\10"+
    "\1\246\13\10\16\0\1\10\10\0\2\247\1\62\1\0"+
    "\5\247\1\0\1\247\4\0\1\247\1\0\1\247\1\0"+
    "\1\247\1\0\1\247\1\62\1\0\1\247\4\0\1\247"+
    "\6\0\4\247\27\0\1\250\1\61\1\62\2\0\3\250"+
    "\1\66\1\67\1\70\10\0\1\70\2\0\1\62\6\0"+
    "\1\66\6\0\1\61\3\250\25\0\13\10\1\0\1\10"+
    "\4\0\16\10\1\251\12\10\16\0\1\10\6\0\13\10"+
    "\1\0\1\10\4\0\4\10\1\252\24\10\16\0\1\10"+
    "\10\0\2\253\1\62\1\0\5\253\1\0\1\253\4\0"+
    "\1\253\1\0\1\253\1\0\1\253\1\0\1\253\1\62"+
    "\1\0\1\253\4\0\1\253\6\0\4\253\27\0\1\254"+
    "\1\61\1\62\2\0\3\254\1\66\1\67\1\70\10\0"+
    "\1\70\2\0\1\62\6\0\1\66\6\0\1\61\3\254"+
    "\25\0\13\10\1\0\1\10\4\0\4\10\1\255\24\10"+
    "\16\0\1\10\10\0\2\256\1\62\1\0\5\256\1\0"+
    "\1\256\4\0\1\256\1\0\1\256\1\0\1\256\1\0"+
    "\1\256\1\62\1\0\1\256\4\0\1\256\6\0\4\256"+
    "\27\0\1\257\1\61\1\62\2\0\3\257\1\66\1\67"+
    "\1\70\10\0\1\70\2\0\1\62\6\0\1\66\6\0"+
    "\1\61\3\257\25\0\13\10\1\0\1\10\4\0\1\260"+
    "\30\10\16\0\1\10\10\0\2\261\1\62\1\0\5\261"+
    "\1\0\1\261\4\0\1\261\1\0\1\261\1\0\1\261"+
    "\1\0\1\261\1\62\1\0\1\261\4\0\1\261\6\0"+
    "\4\261\27\0\1\262\1\61\1\62\2\0\3\262\1\66"+
    "\1\67\1\70\10\0\1\70\2\0\1\62\6\0\1\66"+
    "\6\0\1\61\3\262\25\0\13\10\1\0\1\10\4\0"+
    "\13\10\1\263\15\10\16\0\1\10\10\0\2\264\1\62"+
    "\1\0\5\264\1\0\1\264\4\0\1\264\1\0\1\264"+
    "\1\0\1\264\1\0\1\264\1\62\1\0\1\264\4\0"+
    "\1\264\6\0\4\264\27\0\1\265\1\61\1\62\2\0"+
    "\3\265\1\66\1\67\1\70\10\0\1\70\2\0\1\62"+
    "\6\0\1\66\6\0\1\61\3\265\25\0\13\10\1\0"+
    "\1\10\4\0\15\10\1\266\13\10\16\0\1\10\10\0"+
    "\2\267\1\62\1\0\5\267\1\0\1\267\4\0\1\267"+
    "\1\0\1\267\1\0\1\267\1\0\1\267\1\62\1\0"+
    "\1\267\4\0\1\267\6\0\4\267\27\0\1\270\1\61"+
    "\1\62\2\0\3\270\1\66\1\67\1\70\10\0\1\70"+
    "\2\0\1\62\6\0\1\66\6\0\1\61\3\270\25\0"+
    "\13\10\1\0\1\10\4\0\3\10\1\271\25\10\16\0"+
    "\1\10\10\0\2\272\1\62\1\0\5\272\1\0\1\272"+
    "\4\0\1\272\1\0\1\272\1\0\1\272\1\0\1\272"+
    "\1\62\1\0\1\272\4\0\1\272\6\0\4\272\27\0"+
    "\1\273\1\61\1\62\2\0\3\273\1\66\1\67\1\70"+
    "\10\0\1\70\2\0\1\62\6\0\1\66\6\0\1\61"+
    "\3\273\25\0\13\10\1\0\1\10\4\0\4\10\1\274"+
    "\24\10\16\0\1\10\10\0\2\275\1\62\1\0\5\275"+
    "\1\0\1\275\4\0\1\275\1\0\1\275\1\0\1\275"+
    "\1\0\1\275\1\62\1\0\1\275\4\0\1\275\6\0"+
    "\4\275\27\0\1\276\1\61\1\62\2\0\3\276\1\66"+
    "\1\67\1\70\10\0\1\70\2\0\1\62\6\0\1\66"+
    "\6\0\1\61\3\276\27\0\2\277\1\62\1\0\5\277"+
    "\1\0\1\277\4\0\1\277\1\0\1\277\1\0\1\277"+
    "\1\0\1\277\1\62\1\0\1\277\4\0\1\277\6\0"+
    "\4\277\27\0\1\300\1\61\1\62\2\0\3\300\1\66"+
    "\1\67\1\70\10\0\1\70\2\0\1\62\6\0\1\66"+
    "\6\0\1\61\3\300\27\0\2\301\1\62\1\0\5\301"+
    "\1\0\1\301\4\0\1\301\1\0\1\301\1\0\1\301"+
    "\1\0\1\301\1\62\1\0\1\301\4\0\1\301\6\0"+
    "\4\301\27\0\1\302\1\61\1\62\2\0\3\302\1\66"+
    "\1\67\1\70\10\0\1\70\2\0\1\62\6\0\1\66"+
    "\6\0\1\61\3\302\27\0\2\303\1\62\1\0\5\303"+
    "\1\0\1\303\4\0\1\303\1\0\1\303\1\0\1\303"+
    "\1\0\1\303\1\62\1\0\1\303\4\0\1\303\6\0"+
    "\4\303\27\0\1\304\1\61\1\62\2\0\3\304\1\66"+
    "\1\67\1\70\10\0\1\70\2\0\1\62\6\0\1\66"+
    "\6\0\1\61\3\304\31\0\1\62\23\0\1\62\50\0"+
    "\1\305\1\61\1\62\2\0\3\305\1\66\1\67\1\70"+
    "\10\0\1\70\2\0\1\62\6\0\1\66\6\0\1\61"+
    "\3\305\27\0\1\306\1\61\1\62\2\0\3\306\1\66"+
    "\1\67\1\70\10\0\1\70\2\0\1\62\6\0\1\66"+
    "\6\0\1\61\3\306\27\0\1\307\1\61\1\62\2\0"+
    "\3\307\1\66\1\67\1\70\10\0\1\70\2\0\1\62"+
    "\6\0\1\66\6\0\1\61\3\307\27\0\1\310\1\61"+
    "\1\62\2\0\3\310\1\66\1\67\1\70\10\0\1\70"+
    "\2\0\1\62\6\0\1\66\6\0\1\61\3\310\27\0"+
    "\2\61\1\62\2\0\3\61\1\66\1\67\1\70\10\0"+
    "\1\70\2\0\1\62\6\0\1\66\6\0\4\61\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10080];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\10\1\1\11\22\1\4\11"+
    "\2\1\2\11\2\1\3\11\2\1\1\11\2\1\1\11"+
    "\1\0\4\1\1\0\41\1\2\11\5\1\1\0\1\1"+
    "\1\11\31\1\4\0\21\1\2\0\35\1\1\0\2\1"+
    "\1\0\2\1\1\0\2\1\1\0\2\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[200];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  YakshaLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 47: break;
          case 2: 
            { return YakshaTypes.NL;
            } 
            // fall through
          case 48: break;
          case 3: 
            { return YakshaTypes.S;
            } 
            // fall through
          case 49: break;
          case 4: 
            { return YakshaTypes.COMMENT;
            } 
            // fall through
          case 50: break;
          case 5: 
            { return YakshaTypes.IDENTIFIER;
            } 
            // fall through
          case 51: break;
          case 6: 
            { return YakshaTypes.NUMBER;
            } 
            // fall through
          case 52: break;
          case 7: 
            { return YakshaTypes.OPERATOR_DOT;
            } 
            // fall through
          case 53: break;
          case 8: 
            { return YakshaTypes.OPERATOR_PLUS;
            } 
            // fall through
          case 54: break;
          case 9: 
            { return YakshaTypes.STRING;
            } 
            // fall through
          case 55: break;
          case 10: 
            { return YakshaTypes.OPERATOR_OPEN_P;
            } 
            // fall through
          case 56: break;
          case 11: 
            { return YakshaTypes.OPERATOR_CLOSE_P;
            } 
            // fall through
          case 57: break;
          case 12: 
            { return YakshaTypes.OPERATOR_OPEN_SQB;
            } 
            // fall through
          case 58: break;
          case 13: 
            { return YakshaTypes.OPERATOR_CLOSE_SQB;
            } 
            // fall through
          case 59: break;
          case 14: 
            { return YakshaTypes.OPERATOR_MINUS;
            } 
            // fall through
          case 60: break;
          case 15: 
            { return YakshaTypes.OPERATOR_COMPARISON;
            } 
            // fall through
          case 61: break;
          case 16: 
            { return YakshaTypes.OPERATOR_MUL;
            } 
            // fall through
          case 62: break;
          case 17: 
            { return YakshaTypes.OPERATOR_DIV;
            } 
            // fall through
          case 63: break;
          case 18: 
            { return YakshaTypes.OPERATOR_EQ;
            } 
            // fall through
          case 64: break;
          case 19: 
            { return YakshaTypes.OPERATOR_AT;
            } 
            // fall through
          case 65: break;
          case 20: 
            { return YakshaTypes.OPERATOR_COLON;
            } 
            // fall through
          case 66: break;
          case 21: 
            { return YakshaTypes.OPERATOR_COMMA;
            } 
            // fall through
          case 67: break;
          case 22: 
            { return YakshaTypes.KW_AS;
            } 
            // fall through
          case 68: break;
          case 23: 
            { return YakshaTypes.OPERATOR_OR;
            } 
            // fall through
          case 69: break;
          case 24: 
            { return YakshaTypes.KW_IF;
            } 
            // fall through
          case 70: break;
          case 25: 
            { return YakshaTypes.PRIMITIVE_DATA_TYPE;
            } 
            // fall through
          case 71: break;
          case 26: 
            { return YakshaTypes.OPERATOR_ARROW;
            } 
            // fall through
          case 72: break;
          case 27: 
            { return YakshaTypes.OPERATOR_AND;
            } 
            // fall through
          case 73: break;
          case 28: 
            { return YakshaTypes.KW_DEL;
            } 
            // fall through
          case 74: break;
          case 29: 
            { return YakshaTypes.KW_DEF;
            } 
            // fall through
          case 75: break;
          case 30: 
            { return YakshaTypes.OPERATOR_NOT;
            } 
            // fall through
          case 76: break;
          case 31: 
            { return YakshaTypes.I;
            } 
            // fall through
          case 77: break;
          case 32: 
            { return YakshaTypes.KW_ELSE;
            } 
            // fall through
          case 78: break;
          case 33: 
            { return YakshaTypes.KW_ELIF;
            } 
            // fall through
          case 79: break;
          case 34: 
            { return YakshaTypes.KW_PASS;
            } 
            // fall through
          case 80: break;
          case 35: 
            { return YakshaTypes.KW_TRUE;
            } 
            // fall through
          case 81: break;
          case 36: 
            { return YakshaTypes.KW_NONE;
            } 
            // fall through
          case 82: break;
          case 37: 
            { return YakshaTypes.KW_FALSE;
            } 
            // fall through
          case 83: break;
          case 38: 
            { return YakshaTypes.KW_BREAK;
            } 
            // fall through
          case 84: break;
          case 39: 
            { return YakshaTypes.KW_CCODE;
            } 
            // fall through
          case 85: break;
          case 40: 
            { return YakshaTypes.KW_CLASS;
            } 
            // fall through
          case 86: break;
          case 41: 
            { return YakshaTypes.KW_DEFER;
            } 
            // fall through
          case 87: break;
          case 42: 
            { return YakshaTypes.KW_WHILE;
            } 
            // fall through
          case 88: break;
          case 43: 
            { return YakshaTypes.KW_RETURN;
            } 
            // fall through
          case 89: break;
          case 44: 
            { return YakshaTypes.KW_IMPORT;
            } 
            // fall through
          case 90: break;
          case 45: 
            { return YakshaTypes.KW_CONTINUE;
            } 
            // fall through
          case 91: break;
          case 46: 
            { return YakshaTypes.KW_RUNTIMEFEATURE;
            } 
            // fall through
          case 92: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
