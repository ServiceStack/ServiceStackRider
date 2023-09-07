// This is a generated file. Not intended for manual editing.
package net.servicestack.idea.sharpscript;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static net.servicestack.idea.sharpscript.GeneratedTypes.*;
import static net.servicestack.idea.sharpscript.SharpScriptParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SharpScriptParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return sharpScriptFile(b, l + 1);
  }

  /* ********************************************************** */
  // expr (',' expr)*
  public static boolean args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "args")) return false;
    if (!nextTokenIs(b, EXPRESSION_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && args_1(b, l + 1);
    exit_section_(b, m, ARGS, r);
    return r;
  }

  // (',' expr)*
  private static boolean args_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "args_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!args_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "args_1", c)) break;
    }
    return true;
  }

  // ',' expr
  private static boolean args_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "args_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ARRAY_START expr ARRAY_END
  public static boolean array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array")) return false;
    if (!nextTokenIs(b, ARRAY_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARRAY_START);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, ARRAY_END);
    exit_section_(b, m, ARRAY, r);
    return r;
  }

  /* ********************************************************** */
  // target '=' expr
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = target(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && expr(b, l + 1);
    exit_section_(b, m, ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // mustacheExpr
  //           | methodCall
  //           | methodChain
  //           | jsLiteral
  //           | shorthandNotation
  //           | assignment
  //           | templateLiteral
  //           | shorthandArrowExpr
  public static boolean element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT, "<element>");
    r = mustacheExpr(b, l + 1);
    if (!r) r = methodCall(b, l + 1);
    if (!r) r = methodChain(b, l + 1);
    if (!r) r = jsLiteral(b, l + 1);
    if (!r) r = shorthandNotation(b, l + 1);
    if (!r) r = assignment(b, l + 1);
    if (!r) r = templateLiteral(b, l + 1);
    if (!r) r = shorthandArrowExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EXPRESSION_TOKEN
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    if (!nextTokenIs(b, EXPRESSION_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXPRESSION_TOKEN);
    exit_section_(b, m, EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  //                    | STRING
  //                    | NUMBER
  //                    | PIPE_CHAIN
  //                    | HASHTAG
  //                    | OPEN_PAREN expressionInside CLOSE_PAREN
  //                    | OPEN_BRACE expressionInside CLOSE_BRACE
  //                    | ARROW
  public static boolean expressionInside(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionInside")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_INSIDE, "<expression inside>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, PIPE_CHAIN);
    if (!r) r = consumeToken(b, HASHTAG);
    if (!r) r = expressionInside_5(b, l + 1);
    if (!r) r = expressionInside_6(b, l + 1);
    if (!r) r = consumeToken(b, ARROW);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OPEN_PAREN expressionInside CLOSE_PAREN
  private static boolean expressionInside_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionInside_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && expressionInside(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_BRACE expressionInside CLOSE_BRACE
  private static boolean expressionInside_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionInside_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && expressionInside(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NULL
  //             | TRUE
  //             | NUMBER
  //             | STRING
  //             | ARRAY
  //             | OBJECT
  public static boolean jsLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jsLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JS_LITERAL, "<js literal>");
    r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, ARRAY);
    if (!r) r = consumeToken(b, OBJECT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // methodName '(' args ')'
  public static boolean methodCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodName(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && args(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, METHOD_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // expr PIPE methodCall (PIPE methodCall)*
  public static boolean methodChain(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodChain")) return false;
    if (!nextTokenIs(b, EXPRESSION_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && consumeToken(b, PIPE);
    r = r && methodCall(b, l + 1);
    r = r && methodChain_3(b, l + 1);
    exit_section_(b, m, METHOD_CHAIN, r);
    return r;
  }

  // (PIPE methodCall)*
  private static boolean methodChain_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodChain_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!methodChain_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodChain_3", c)) break;
    }
    return true;
  }

  // PIPE methodCall
  private static boolean methodChain_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodChain_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PIPE);
    r = r && methodCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean methodName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, METHOD_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // MUSTACHE_START sharpScriptInside MUSTACHE_END
  public static boolean mustacheExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mustacheExpr")) return false;
    if (!nextTokenIs(b, MUSTACHE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MUSTACHE_START);
    r = r && sharpScriptInside(b, l + 1);
    r = r && consumeToken(b, MUSTACHE_END);
    exit_section_(b, m, MUSTACHE_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // OBJECT_START assignment (',' assignment)* OBJECT_END
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    if (!nextTokenIs(b, OBJECT_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OBJECT_START);
    r = r && assignment(b, l + 1);
    r = r && object_2(b, l + 1);
    r = r && consumeToken(b, OBJECT_END);
    exit_section_(b, m, OBJECT, r);
    return r;
  }

  // (',' assignment)*
  private static boolean object_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_2", c)) break;
    }
    return true;
  }

  // ',' assignment
  private static boolean object_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // element*
  static boolean sharpScriptFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sharpScriptFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // expressionInside (HASHTAG expressionInside)*
  //                      | expressionInside (PIPE_CHAIN expressionInside)*
  //                      | expressionInside (OPEN_PAREN expressionInside CLOSE_PAREN)*
  //                      | expressionInside (OPEN_BRACE expressionInside CLOSE_BRACE)*
  //                      | expressionInside (ARROW expressionInside)*
  //                      | expressionInside (SINGLE_QUOTE expressionInside SINGLE_QUOTE)*
  public static boolean sharpScriptInside(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHARP_SCRIPT_INSIDE, "<sharp script inside>");
    r = sharpScriptInside_0(b, l + 1);
    if (!r) r = sharpScriptInside_1(b, l + 1);
    if (!r) r = sharpScriptInside_2(b, l + 1);
    if (!r) r = sharpScriptInside_3(b, l + 1);
    if (!r) r = sharpScriptInside_4(b, l + 1);
    if (!r) r = sharpScriptInside_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expressionInside (HASHTAG expressionInside)*
  private static boolean sharpScriptInside_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expressionInside(b, l + 1);
    r = r && sharpScriptInside_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (HASHTAG expressionInside)*
  private static boolean sharpScriptInside_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sharpScriptInside_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sharpScriptInside_0_1", c)) break;
    }
    return true;
  }

  // HASHTAG expressionInside
  private static boolean sharpScriptInside_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASHTAG);
    r = r && expressionInside(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expressionInside (PIPE_CHAIN expressionInside)*
  private static boolean sharpScriptInside_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expressionInside(b, l + 1);
    r = r && sharpScriptInside_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (PIPE_CHAIN expressionInside)*
  private static boolean sharpScriptInside_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sharpScriptInside_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sharpScriptInside_1_1", c)) break;
    }
    return true;
  }

  // PIPE_CHAIN expressionInside
  private static boolean sharpScriptInside_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PIPE_CHAIN);
    r = r && expressionInside(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expressionInside (OPEN_PAREN expressionInside CLOSE_PAREN)*
  private static boolean sharpScriptInside_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expressionInside(b, l + 1);
    r = r && sharpScriptInside_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OPEN_PAREN expressionInside CLOSE_PAREN)*
  private static boolean sharpScriptInside_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sharpScriptInside_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sharpScriptInside_2_1", c)) break;
    }
    return true;
  }

  // OPEN_PAREN expressionInside CLOSE_PAREN
  private static boolean sharpScriptInside_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PAREN);
    r = r && expressionInside(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // expressionInside (OPEN_BRACE expressionInside CLOSE_BRACE)*
  private static boolean sharpScriptInside_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expressionInside(b, l + 1);
    r = r && sharpScriptInside_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OPEN_BRACE expressionInside CLOSE_BRACE)*
  private static boolean sharpScriptInside_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_3_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sharpScriptInside_3_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sharpScriptInside_3_1", c)) break;
    }
    return true;
  }

  // OPEN_BRACE expressionInside CLOSE_BRACE
  private static boolean sharpScriptInside_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && expressionInside(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // expressionInside (ARROW expressionInside)*
  private static boolean sharpScriptInside_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expressionInside(b, l + 1);
    r = r && sharpScriptInside_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ARROW expressionInside)*
  private static boolean sharpScriptInside_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_4_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sharpScriptInside_4_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sharpScriptInside_4_1", c)) break;
    }
    return true;
  }

  // ARROW expressionInside
  private static boolean sharpScriptInside_4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_4_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARROW);
    r = r && expressionInside(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expressionInside (SINGLE_QUOTE expressionInside SINGLE_QUOTE)*
  private static boolean sharpScriptInside_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expressionInside(b, l + 1);
    r = r && sharpScriptInside_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SINGLE_QUOTE expressionInside SINGLE_QUOTE)*
  private static boolean sharpScriptInside_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_5_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sharpScriptInside_5_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sharpScriptInside_5_1", c)) break;
    }
    return true;
  }

  // SINGLE_QUOTE expressionInside SINGLE_QUOTE
  private static boolean sharpScriptInside_5_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharpScriptInside_5_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SINGLE_QUOTE);
    r = r && expressionInside(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr PIPE methodName FAT_ARROW expr
  public static boolean shorthandArrowExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shorthandArrowExpr")) return false;
    if (!nextTokenIs(b, EXPRESSION_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && consumeToken(b, PIPE);
    r = r && methodName(b, l + 1);
    r = r && consumeToken(b, FAT_ARROW);
    r = r && expr(b, l + 1);
    exit_section_(b, m, SHORTHAND_ARROW_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // 'var' IDENTIFIER '=' expr
  public static boolean shorthandNotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shorthandNotation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHORTHAND_NOTATION, "<shorthand notation>");
    r = consumeToken(b, "var");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  //              | IDENTIFIER '[' expr ']'
  //              | IDENTIFIER '.' IDENTIFIER
  public static boolean target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "target")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = target_1(b, l + 1);
    if (!r) r = target_2(b, l + 1);
    exit_section_(b, m, TARGET, r);
    return r;
  }

  // IDENTIFIER '[' expr ']'
  private static boolean target_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "target_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "[");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER '.' IDENTIFIER
  private static boolean target_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "target_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, ".");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TEMPLATE_START expr TEMPLATE_END
  public static boolean templateLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateLiteral")) return false;
    if (!nextTokenIs(b, TEMPLATE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEMPLATE_START);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, TEMPLATE_END);
    exit_section_(b, m, TEMPLATE_LITERAL, r);
    return r;
  }

}
