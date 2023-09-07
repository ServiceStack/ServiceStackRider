package net.servicestack.idea.sharpscript;

import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static net.servicestack.idea.sharpscript.GeneratedTypes.*;

%%

%{
  public _SharpScriptLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _SharpScriptLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*
PIPE_CHAIN      =\|\>
HASHTAG         =\#
OPEN_PAREN      =\(
CLOSE_PAREN     =\)
OPEN_BRACE      =\{
CLOSE_BRACE     =\}
ARROW           =\=>
SINGLE_QUOTE    =\'


%%
<YYINITIAL> {
  {WHITE_SPACE}          { return WHITE_SPACE; }

  "\["                   { return ARRAY_START; }
  "\]"                   { return ARRAY_END; }
  "\{"                   { return OBJECT_START; }
  "\}"                   { return OBJECT_END; }
  "\{\{"                 { return MUSTACHE_START; }
  "\}\}"                 { return MUSTACHE_END; }
  "null"                 { return NULL; }
  "true"                 { return TRUE; }
  "\|"                   { return PIPE; }
  [0-9]+                 { return NUMBER; }
  "=>"                   { return FAT_ARROW; }
  "#"                    { return HASHTAG; }
  "\|>"                  { return PIPE_CHAIN; }
  "\("                   { return OPEN_PAREN; }
  "\)"                   { return CLOSE_PAREN; }
  "\'"                   { return SINGLE_QUOTE; }

  "\"([^\"\\]|\\.)*\""      { return STRING; }
  [a-zA-Z_][a-zA-Z_0-9]* { return IDENTIFIER; }
  (\+|\-|\*|\/|\(|\))    { return EXPRESSION_TOKEN; }// Define a regex for EXPRESSION_TOKEN if necessary
}

[^] { return BAD_CHARACTER; }
