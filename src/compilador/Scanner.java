/* The following code was generated by JFlex 1.4.1 on 21/04/15 09:32 PM */

package compilador;

import java_cup.runtime.*;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 21/04/15 09:32 PM from the specification file
 * <tt>C:/Users/ManuelRangel/Desktop/Proyecto Compiladores/Modificacion-Tiny/especificacion_lexica/lexico.flex</tt>
 */
class Scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  6,  4,  0,  0,  5,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     6, 27,  0,  0,  0,  0,  0,  0, 32, 33, 30, 29, 35,  2,  0, 31, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 24, 34, 26, 25, 28,  0, 
     0,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3, 
     3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  0,  0,  0,  0,  0, 
     0,  8, 22,  3, 17,  9, 11,  3, 13, 10,  3,  3, 15,  3, 14, 21, 
    19,  3, 18, 16, 12,  7,  3, 20, 23,  3,  3, 36,  0, 37,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\1\1\6"+
    "\12\4\1\1\1\7\1\10\1\1\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\1\1\5\5\4"+
    "\1\21\5\4\1\22\1\4\1\23\1\24\1\25\1\26"+
    "\1\0\1\4\1\27\1\30\2\4\1\31\1\32\5\4"+
    "\1\33\1\4\1\34\1\4\1\35\1\36\2\4\1\37"+
    "\1\40\2\4\1\41\1\4\1\42\1\43";

  private static int [] zzUnpackAction() {
    int [] result = new int[78];
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
    "\0\0\0\46\0\114\0\114\0\162\0\230\0\276\0\344"+
    "\0\u010a\0\u0130\0\u0156\0\u017c\0\u01a2\0\u01c8\0\u01ee\0\u0214"+
    "\0\u023a\0\u0260\0\u0286\0\46\0\u02ac\0\u02d2\0\u02f8\0\46"+
    "\0\46\0\46\0\46\0\46\0\46\0\46\0\u031e\0\46"+
    "\0\u0344\0\u036a\0\u0390\0\u03b6\0\u03dc\0\162\0\u0402\0\u0428"+
    "\0\u044e\0\u0474\0\u049a\0\162\0\u04c0\0\46\0\46\0\46"+
    "\0\46\0\u04e6\0\u050c\0\162\0\162\0\u0532\0\u0558\0\162"+
    "\0\162\0\u057e\0\u05a4\0\u05ca\0\u05f0\0\u0616\0\46\0\u063c"+
    "\0\162\0\u0662\0\162\0\162\0\u0688\0\u06ae\0\162\0\162"+
    "\0\u06d4\0\u06fa\0\162\0\u0720\0\162\0\162";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[78];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\5\5\1\17\1\5"+
    "\1\20\1\21\1\22\1\5\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\2\47\0\1\3\47\0\1\5\3\0\21\5"+
    "\23\0\1\40\44\0\1\40\47\0\1\10\42\0\1\5"+
    "\3\0\7\5\1\41\11\5\21\0\1\5\3\0\7\5"+
    "\1\42\11\5\21\0\1\5\3\0\7\5\1\43\1\44"+
    "\7\5\1\45\21\0\1\5\3\0\4\5\1\46\2\5"+
    "\1\47\11\5\21\0\1\5\3\0\16\5\1\50\2\5"+
    "\21\0\1\5\3\0\6\5\1\51\12\5\21\0\1\5"+
    "\3\0\2\5\1\52\16\5\21\0\1\5\3\0\13\5"+
    "\1\53\5\5\21\0\1\5\3\0\13\5\1\54\5\5"+
    "\21\0\1\5\3\0\16\5\1\55\2\5\47\0\1\56"+
    "\45\0\1\57\45\0\1\60\45\0\1\61\14\0\45\62"+
    "\4\0\1\5\3\0\5\5\1\63\13\5\21\0\1\5"+
    "\3\0\12\5\1\64\6\5\21\0\1\5\3\0\12\5"+
    "\1\65\6\5\21\0\1\5\3\0\11\5\1\66\7\5"+
    "\21\0\1\5\3\0\14\5\1\67\4\5\21\0\1\5"+
    "\3\0\5\5\1\70\13\5\21\0\1\5\3\0\13\5"+
    "\1\71\5\5\21\0\1\5\3\0\2\5\1\72\16\5"+
    "\21\0\1\5\3\0\1\5\1\73\12\5\1\74\4\5"+
    "\21\0\1\5\3\0\3\5\1\75\15\5\21\0\1\5"+
    "\3\0\16\5\1\76\2\5\16\0\45\62\1\77\3\0"+
    "\1\5\3\0\3\5\1\100\15\5\21\0\1\5\3\0"+
    "\2\5\1\101\16\5\21\0\1\5\3\0\17\5\1\102"+
    "\1\5\21\0\1\5\3\0\7\5\1\103\11\5\21\0"+
    "\1\5\3\0\12\5\1\104\6\5\21\0\1\5\3\0"+
    "\2\5\1\105\16\5\21\0\1\5\3\0\5\5\1\106"+
    "\13\5\21\0\1\5\3\0\10\5\1\107\10\5\21\0"+
    "\1\5\3\0\10\5\1\110\10\5\21\0\1\5\3\0"+
    "\16\5\1\111\2\5\21\0\1\5\3\0\1\5\1\112"+
    "\17\5\21\0\1\5\3\0\2\5\1\113\16\5\21\0"+
    "\1\5\3\0\16\5\1\114\2\5\21\0\1\5\3\0"+
    "\5\5\1\115\13\5\21\0\1\5\3\0\10\5\1\116"+
    "\10\5\16\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1862];
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
    "\1\0\1\11\21\1\1\11\3\1\7\11\1\1\1\11"+
    "\15\1\4\11\1\0\14\1\1\11\17\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[78];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

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

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	public Scanner(java.io.InputStream r, SymbolFactory sf){
		this(r);
		this.sf=sf;
		lineanum=0;
		debug=true;
	}
	private SymbolFactory sf;
	private int lineanum;
	private boolean debug;



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
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
        case 32: 
          { if(debug) System.out.println("token UNTIL");
			return sf.newSymbol("UNTIL",sym.UNTIL);
          }
        case 36: break;
        case 22: 
          { if(debug) System.out.println("token GRTEQ");
                        return sf.newSymbol("GRTEQ",sym.GRTEQ);
          }
        case 37: break;
        case 4: 
          { if(debug) System.out.println("token ID");
			return sf.newSymbol("ID",sym.ID,new String(yytext()));
          }
        case 38: break;
        case 19: 
          { if(debug) System.out.println("token ASSIGN");
			return sf.newSymbol("ASSIGN",sym.ASSIGN);
          }
        case 39: break;
        case 12: 
          { if(debug) System.out.println("token OVER");
			return sf.newSymbol("OVER",sym.OVER);
          }
        case 40: break;
        case 7: 
          { if(debug) System.out.println("token EQ");
			return sf.newSymbol("EQ",sym.EQ);
          }
        case 41: break;
        case 35: 
          { if(debug) System.out.println("token EXPBOOL");
			return sf.newSymbol("EXPBOOL",sym.EXPBOOL,new Boolean(yytext()));
          }
        case 42: break;
        case 29: 
          { if(debug) System.out.println("token THEN");
			return sf.newSymbol("THEN",sym.THEN);
          }
        case 43: break;
        case 27: 
          { /* salto comentarios */ if(debug) System.out.println("token COMENTARIO");
          }
        case 44: break;
        case 16: 
          { if(debug) System.out.println("token COMA");
			return sf.newSymbol("SEMI",sym.COMA);
          }
        case 45: break;
        case 18: 
          { if(debug) System.out.println("token OR");
                        return sf.newSymbol("OR",sym.OR);
          }
        case 46: break;
        case 9: 
          { if(debug) System.out.println("token GRT");
                        return sf.newSymbol("GRT",sym.GRT);
          }
        case 47: break;
        case 10: 
          { if(debug) System.out.println("token PLUS");
			return sf.newSymbol("PLUS",sym.PLUS);
          }
        case 48: break;
        case 17: 
          { if(debug) System.out.println("token IF");
			return sf.newSymbol("IF",sym.IF);
          }
        case 49: break;
        case 31: 
          { if(debug) System.out.println("token BOOL");
			return sf.newSymbol("BOOL",sym.BOOL);
          }
        case 50: break;
        case 5: 
          { lineanum++;
          }
        case 51: break;
        case 1: 
          { System.err.println("Caracter Ilegal encontrado en analisis lexico: " + yytext() + "\n");
          }
        case 52: break;
        case 33: 
          { if(debug) System.out.println("token WRITE");
			return sf.newSymbol("WRITE",sym.WRITE);
          }
        case 53: break;
        case 2: 
          { if(debug) System.out.println("token NUM");
			return sf.newSymbol("NUM",sym.NUM,new Integer(yytext()));
          }
        case 54: break;
        case 14: 
          { if(debug) System.out.println("token RPAREN");
			return sf.newSymbol("RPAREN",sym.RPAREN);
          }
        case 55: break;
        case 20: 
          { if(debug) System.out.println("token LTEQ");
                        return sf.newSymbol("LTEQ",sym.LTEQ);
          }
        case 56: break;
        case 23: 
          { if(debug) System.out.println("token AND");
                        return sf.newSymbol("AND",sym.AND);
          }
        case 57: break;
        case 6: 
          { /* saltos espacios en blanco*/
          }
        case 58: break;
        case 25: 
          { if(debug) System.out.println("token INT");
			return sf.newSymbol("INT",sym.INT);
          }
        case 59: break;
        case 13: 
          { if(debug) System.out.println("token LPAREN");
			return sf.newSymbol("LPAREN",sym.LPAREN);
          }
        case 60: break;
        case 3: 
          { if(debug) System.out.println("token MINUS");
			return sf.newSymbol("MINUS",sym.MINUS);
          }
        case 61: break;
        case 8: 
          { if(debug) System.out.println("token LT");
			return sf.newSymbol("LT",sym.LT);
          }
        case 62: break;
        case 15: 
          { if(debug) System.out.println("token SEMI");
			return sf.newSymbol("SEMI",sym.SEMI);
          }
        case 63: break;
        case 24: 
          { if(debug) System.out.println("token END");
			return sf.newSymbol("END",sym.END);
          }
        case 64: break;
        case 28: 
          { if(debug) System.out.println("token ELSE");
			return sf.newSymbol("ELSE",sym.ELSE);
          }
        case 65: break;
        case 26: 
          { if(debug) System.out.println("token FOR");
			return sf.newSymbol("FOR",sym.FOR);
          }
        case 66: break;
        case 30: 
          { if(debug) System.out.println("token READ");
			return sf.newSymbol("READ",sym.READ);
          }
        case 67: break;
        case 11: 
          { if(debug) System.out.println("token TIMES");
			return sf.newSymbol("TIMES",sym.TIMES);
          }
        case 68: break;
        case 34: 
          { if(debug) System.out.println("token REPEAT");
			return sf.newSymbol("REPEAT",sym.REPEAT);
          }
        case 69: break;
        case 21: 
          { if(debug) System.out.println("token NEQ");
                        return sf.newSymbol("NEQ",sym.NEQ);
          }
        case 70: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {     return sf.newSymbol("EOF",sym.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
