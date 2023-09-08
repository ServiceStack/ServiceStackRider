package net.servicestack.idea.sharpscript;

import com.intellij.psi.tree.IElementType;
import com.intellij.lexer.FlexLexer;
import com.intellij.util.containers.Stack;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static net.servicestack.idea.sharpscript.GeneratedTypes.*;

@SuppressWarnings ({"FieldCanBeLocal", "UnusedDeclaration", "WeakerAccess", "SameParameterValue", "CanBeFinal", "SameReturnValue", "RedundantThrows", "ConstantConditions"})
%%

%{
  public _SharpScriptLexer() {
    this((java.io.Reader)null);
  }

  private Stack<Integer> stack = new Stack<>();
  private Stack<String> blockStack = new Stack<>();

  public void yypushState(int newState) {
    stack.push(yystate());
    yybegin(newState);
  }

  public void yypopState() {
    yybegin(stack.pop());
  }

  String blockName;  // to store the block name like 'if', 'each', etc.

%}

%public
%class _SharpScriptLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

%state IN_OPEN_CLOSE, IN_OPENBLOCK_CLOSEBLOCK, IN_OPEN_RAW_BLOCK, IN_OPEN_BLOCK_NAME
%state IN_COMMENT
%state IN_BACKTICK


EOL=\R
OPEN = \{\{
CLOSE = \}\}
OPEN_BLOCK = \{\{\#
CLOSE_BLOCK = \}\}\#
OPEN_PARTIAL = \{\{\>
COMMENT_OPEN = \{\{\!--
COMMENT_CLOSE = --\}\}
OPEN_RAW_BLOCK = \{\{\{\{
CLOSE_RAW_BLOCK = \}\}\}\}
BOOLEAN = true|false
ID = [a-zA-Z_][a-zA-Z_0-9]*
STRING = ("(\\[\"\\btnfr]|[^\"\\\R])*" | '(\\[\'\\btnfr]|[^\'\\\R])*')
NUMBER = [0-9]+(\.[0-9]+)?
DATA_PREFIX = @
OPEN_SEXPR = \(
CLOSE_SEXPR = \)
WHITE_SPACE = [ \t\n\r]+

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }
  {OPEN}             { yybegin(IN_OPEN_CLOSE); return OPEN; }
  {OPEN_BLOCK}       { yybegin(IN_OPEN_BLOCK_NAME); return OPEN_BLOCK; }
  {OPEN_PARTIAL}     { return OPEN_PARTIAL; }
  {OPEN_RAW_BLOCK}   { return OPEN_RAW_BLOCK; }
  {CLOSE_RAW_BLOCK}  { return CLOSE_RAW_BLOCK; }
    \{\{\#([a-zA-Z0-9]+) {
      String blockName = yytext().toString().substring(3); // Extract block name
      blockStack.push(blockName);  // Push block name onto stack
      yybegin(IN_OPENBLOCK_CLOSEBLOCK);
      return OPEN_BLOCK;
    }
}

<IN_OPEN_CLOSE, IN_OPENBLOCK_CLOSEBLOCK> {
    {BOOLEAN}          { return BOOLEAN; }
    {NUMBER}           { return NUMBER; }
    {DATA_PREFIX}      { return DATA_PREFIX; }
    {OPEN_SEXPR}       { return OPEN_SEXPR; }
    {CLOSE_SEXPR}      { return CLOSE_SEXPR; }
    {ID}      { return ID; }
    {STRING}  { return STRING; }

}

<IN_OPEN_CLOSE> {
    {CLOSE}  { yybegin(YYINITIAL); return CLOSE; }
}

<IN_OPENBLOCK_CLOSEBLOCK> {
    \{\{\/([a-zA-Z0-9]+)\}\} {
        String closeName = yytext().toString().substring(3, yytext().length() - 2);  // Extract block name from closing tag
        if (!blockStack.isEmpty() && closeName.equals(blockStack.peek())) {  // Check if it matches the last opened block
          blockStack.pop();  // Pop the last opened block
          yybegin(YYINITIAL);
          return CLOSE_BLOCK;
        }
        // Handle unmatched blocks here (optional)
      }
}


<IN_OPEN_CLOSE, IN_OPENBLOCK_CLOSEBLOCK, YYINITIAL> {
    {COMMENT_OPEN}   { yybegin(IN_COMMENT); return COMMENT_OPEN; }
}

<IN_COMMENT> {
    {COMMENT_CLOSE}  { yybegin(YYINITIAL); return COMMENT_CLOSE; }
    . / {COMMENT_CLOSE} { /* do nothing, as COMMENT_CLOSE is upcoming */ }
    . { return COMMENT_CONTENT; }
}

[^] { return BAD_CHARACTER; }
