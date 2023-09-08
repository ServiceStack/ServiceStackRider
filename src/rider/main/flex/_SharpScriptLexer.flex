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

  public void yypushState(int newState) {
    stack.push(yystate());
    yybegin(newState);
  }

  public void yypopState() {
    yybegin(stack.pop());
  }

%}

%public
%class _SharpScriptLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

%state IN_OPEN_CLOSE, IN_OPENBLOCK_CLOSEBLOCK


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
  {OPEN_BLOCK}       { yybegin(IN_OPENBLOCK_CLOSEBLOCK); return OPEN_BLOCK; }
  {CLOSE_BLOCK}      { return CLOSE_BLOCK; }
  {OPEN_PARTIAL}     { return OPEN_PARTIAL; }
  {COMMENT_OPEN}     { return COMMENT_OPEN; }
  {COMMENT_CLOSE}    { return COMMENT_CLOSE; }
  {OPEN_RAW_BLOCK}   { return OPEN_RAW_BLOCK; }
  {CLOSE_RAW_BLOCK}  { return CLOSE_RAW_BLOCK; }
  {BOOLEAN}          { return BOOLEAN; }
  {NUMBER}           { return NUMBER; }
  {DATA_PREFIX}      { return DATA_PREFIX; }
  {OPEN_SEXPR}       { return OPEN_SEXPR; }
  {CLOSE_SEXPR}      { return CLOSE_SEXPR; }
}

<IN_OPEN_CLOSE, IN_OPENBLOCK_CLOSEBLOCK> {
    {ID}      { return ID; }
    {STRING}  { return STRING; }
}

<IN_OPEN_CLOSE> {
    {CLOSE}  { yybegin(YYINITIAL); return CLOSE; }
}
<IN_OPENBLOCK_CLOSEBLOCK> {
    {CLOSE_BLOCK}  { yybegin(YYINITIAL); return CLOSE_BLOCK; }
}


[^] { return BAD_CHARACTER; }
