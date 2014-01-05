/* The following code was generated by JFlex 1.4.3 on 1/5/14 1:33 AM */

package com.haskforce;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.haskforce.psi.HaskellTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 1/5/14 1:33 AM from the specification file
 * <tt>/Users/crobbins/IdeaProjects/HaskForce/src/com/haskforce/_HaskellLexer.flex</tt>
 */
public class _HaskellLexer implements FlexLexer {
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
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\2\1\1\1\0\1\2\1\1\22\0\1\2\1\45\1\5"+
    "\1\46\1\47\1\50\1\24\1\23\1\34\1\35\1\51\1\27\1\36"+
    "\1\3\1\52\1\53\1\13\7\10\2\6\1\33\1\37\1\54\1\55"+
    "\1\56\1\57\1\60\4\12\1\26\1\12\10\32\1\14\10\32\1\15"+
    "\2\32\1\40\1\16\1\41\1\4\1\30\1\42\1\17\1\20\1\62"+
    "\1\31\1\25\1\20\5\30\1\63\1\30\1\21\1\7\2\30\1\21"+
    "\1\64\1\21\1\30\1\21\1\30\1\11\2\30\1\43\1\22\1\44"+
    "\1\61\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\7"+
    "\1\10\1\6\1\11\1\7\1\12\1\13\1\14\2\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\7\1\46\1\47\1\50\1\51\1\52\2\0\1\53"+
    "\1\54\1\15\1\55\1\56\1\57\1\60\1\61\1\7"+
    "\1\62\1\63\1\64\1\65\2\7\1\66";

  private static int [] zzUnpackAction() {
    int [] result = new int[66];
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
    "\0\0\0\65\0\152\0\237\0\65\0\65\0\65\0\324"+
    "\0\u0109\0\u013e\0\u0173\0\u01a8\0\u01dd\0\65\0\65\0\65"+
    "\0\u0212\0\u0247\0\65\0\u027c\0\65\0\65\0\65\0\65"+
    "\0\65\0\65\0\65\0\u02b1\0\65\0\65\0\65\0\65"+
    "\0\65\0\65\0\u02e6\0\65\0\u031b\0\u0350\0\65\0\65"+
    "\0\65\0\65\0\u0385\0\u03ba\0\65\0\65\0\324\0\u0109"+
    "\0\u03ef\0\u0424\0\65\0\65\0\65\0\65\0\65\0\65"+
    "\0\65\0\65\0\u0459\0\u048e\0\u04c3\0\u03ef\0\u0424\0\u04f8"+
    "\0\u052d\0\u01dd";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[66];
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
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\7"+
    "\1\11\1\12\1\13\2\12\1\14\3\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\2\15\1\12\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\2\15\66\0"+
    "\2\3\65\0\1\54\40\0\1\55\11\0\1\56\14\0"+
    "\2\15\1\57\2\15\1\57\2\15\1\0\3\15\1\0"+
    "\1\15\1\0\2\15\1\0\3\15\27\0\3\15\6\0"+
    "\1\60\1\15\1\60\1\15\2\60\2\15\1\0\2\60"+
    "\1\15\1\0\1\15\1\0\2\60\1\0\1\15\1\60"+
    "\1\15\27\0\1\60\2\15\6\0\10\12\1\0\3\12"+
    "\1\0\1\12\1\0\2\12\1\0\3\12\27\0\3\12"+
    "\7\0\1\61\1\0\1\62\2\0\1\61\1\62\54\0"+
    "\1\63\10\0\6\63\1\64\46\0\10\15\1\0\3\15"+
    "\1\0\1\15\1\0\2\15\1\0\3\15\27\0\3\15"+
    "\3\0\1\65\2\0\10\15\1\0\3\15\1\0\1\15"+
    "\1\0\2\15\1\65\3\15\27\0\3\15\3\0\1\65"+
    "\2\0\10\12\1\0\3\12\1\0\1\12\1\0\2\12"+
    "\1\65\3\12\27\0\3\12\33\0\1\66\34\0\1\67"+
    "\133\0\1\70\15\0\1\71\137\0\1\72\14\0\10\15"+
    "\1\0\3\15\1\0\1\15\1\0\2\15\1\0\3\15"+
    "\27\0\1\15\1\73\1\15\1\74\1\0\2\74\1\75"+
    "\60\74\10\0\1\76\2\0\1\76\57\0\1\77\1\0"+
    "\1\77\1\0\2\77\3\0\2\77\4\0\2\77\2\0"+
    "\1\77\30\0\1\77\10\0\10\15\1\0\1\100\2\15"+
    "\1\0\1\15\1\0\2\15\1\0\3\15\27\0\3\15"+
    "\1\74\1\0\63\74\1\75\1\0\63\75\6\0\10\15"+
    "\1\0\3\15\1\0\1\15\1\0\2\15\1\0\3\15"+
    "\27\0\2\15\1\101\6\0\10\15\1\0\3\15\1\0"+
    "\1\15\1\0\2\15\1\0\3\15\27\0\2\15\1\102";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1378];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\3\11\6\1\3\11\2\1\1\11"+
    "\1\1\7\11\1\1\6\11\1\1\1\11\2\1\4\11"+
    "\2\1\2\11\2\1\2\0\10\11\10\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[66];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

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

  /* user code: */
  public _HaskellLexer() {
    this((java.io.Reader)null);
  }


  public _HaskellLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _HaskellLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 144) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
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
   * Returns the character at position <tt>pos</tt> from the
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
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
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 47: 
          { return DOUBLEPERIOD;
          }
        case 55: break;
        case 27: 
          { return DOLLAR;
          }
        case 56: break;
        case 37: 
          { return TILDE;
          }
        case 57: break;
        case 19: 
          { return SEMICOLON;
          }
        case 58: break;
        case 41: 
          { return OCTALESCAPE;
          }
        case 59: break;
        case 52: 
          { return OCTALLITERAL;
          }
        case 60: break;
        case 23: 
          { return LBRACE;
          }
        case 61: break;
        case 9: 
          { return BACKSLASH;
          }
        case 62: break;
        case 24: 
          { return RBRACE;
          }
        case 63: break;
        case 45: 
          { return DOUBLECOLON;
          }
        case 64: break;
        case 7: 
          { return VARIDREGEXP;
          }
        case 65: break;
        case 22: 
          { return BACKTICK;
          }
        case 66: break;
        case 8: 
          { return CONID;
          }
        case 67: break;
        case 46: 
          { return OPENCOM;
          }
        case 68: break;
        case 39: 
          { return CLOSECOM;
          }
        case 69: break;
        case 21: 
          { return RBRACKET;
          }
        case 70: break;
        case 6: 
          { return DIGIT;
          }
        case 71: break;
        case 18: 
          { return COMMA;
          }
        case 72: break;
        case 50: 
          { return COMMENT;
          }
        case 73: break;
        case 34: 
          { return GREATERTHAN;
          }
        case 74: break;
        case 26: 
          { return HASH;
          }
        case 75: break;
        case 5: 
          { return DOUBLEQUOTE;
          }
        case 76: break;
        case 38: 
          { return DASHES;
          }
        case 77: break;
        case 25: 
          { return EXLAMATION;
          }
        case 78: break;
        case 53: 
          { return HEXADECIMALLITERAL;
          }
        case 79: break;
        case 15: 
          { return COLON;
          }
        case 80: break;
        case 33: 
          { return EQUALS;
          }
        case 81: break;
        case 12: 
          { return AMPERSAND;
          }
        case 82: break;
        case 31: 
          { return SLASH;
          }
        case 83: break;
        case 11: 
          { return SINGLEQUOTE;
          }
        case 84: break;
        case 36: 
          { return AMPERSAT;
          }
        case 85: break;
        case 44: 
          { return NULLCHARACTER;
          }
        case 86: break;
        case 28: 
          { return PERCENT;
          }
        case 87: break;
        case 42: 
          { return HEXADECIMALESCAPE;
          }
        case 88: break;
        case 40: 
          { return RIGHTARROW;
          }
        case 89: break;
        case 20: 
          { return LBRACKET;
          }
        case 90: break;
        case 43: 
          { return CHARESC;
          }
        case 91: break;
        case 3: 
          { return MINUS;
          }
        case 92: break;
        case 13: 
          { return EXPONENTPREFIX;
          }
        case 93: break;
        case 32: 
          { return LESSTHAN;
          }
        case 94: break;
        case 48: 
          { return LEFTARROW;
          }
        case 95: break;
        case 10: 
          { return PIPE;
          }
        case 96: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 97: break;
        case 16: 
          { return LPAREN;
          }
        case 98: break;
        case 51: 
          { return HADDOCK;
          }
        case 99: break;
        case 29: 
          { return ASTERISK;
          }
        case 100: break;
        case 17: 
          { return RPAREN;
          }
        case 101: break;
        case 14: 
          { return PLUS;
          }
        case 102: break;
        case 49: 
          { return DOUBLEARROW;
          }
        case 103: break;
        case 35: 
          { return QUESTION;
          }
        case 104: break;
        case 30: 
          { return PERIOD;
          }
        case 105: break;
        case 54: 
          { return CLASSTOKEN;
          }
        case 106: break;
        case 4: 
          { return CARET;
          }
        case 107: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 108: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
