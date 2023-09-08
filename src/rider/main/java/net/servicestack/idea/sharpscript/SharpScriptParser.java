// This is a generated file. Not intended for manual editing.
package net.servicestack.idea.sharpscript;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static net.servicestack.idea.sharpscript.GeneratedTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
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
    return sharp_script(b, l + 1);
  }

  /* ********************************************************** */
  // 'boolean'
  public static boolean BOOLEAN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BOOLEAN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN, "<boolean>");
    r = consumeToken(b, "boolean");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '}}'
  public static boolean CLOSE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLOSE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLOSE, "<close>");
    r = consumeToken(b, "}}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '}}'
  public static boolean CLOSE_BLOCK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLOSE_BLOCK")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLOSE_BLOCK, "<close block>");
    r = consumeToken(b, "}}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '}}}}'
  public static boolean CLOSE_RAW_BLOCK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLOSE_RAW_BLOCK")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLOSE_RAW_BLOCK, "<close raw block>");
    r = consumeToken(b, "}}}}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ')'
  public static boolean CLOSE_SEXPR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLOSE_SEXPR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLOSE_SEXPR, "<close sexpr>");
    r = consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '--}}'
  public static boolean COMMENT_CLOSE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT_CLOSE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT_CLOSE, "<comment close>");
    r = consumeToken(b, "--}}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'comment_content'
  public static boolean COMMENT_CONTENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT_CONTENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT_CONTENT, "<comment content>");
    r = consumeToken(b, "comment_content");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{{!--'
  public static boolean COMMENT_OPEN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT_OPEN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT_OPEN, "<comment open>");
    r = consumeToken(b, "{{!--");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'content'
  public static boolean CONTENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CONTENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTENT, "<content>");
    r = consumeToken(b, "content");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '@'
  public static boolean DATA_PREFIX(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DATA_PREFIX")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_PREFIX, "<data prefix>");
    r = consumeToken(b, "@");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'id'
  public static boolean ID(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ID")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID, "<id>");
    r = consumeToken(b, "id");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'number'
  public static boolean NUMBER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NUMBER")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER, "<number>");
    r = consumeToken(b, "number");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{{'
  public static boolean OPEN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPEN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPEN, "<open>");
    r = consumeToken(b, "{{");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{{#'
  public static boolean OPEN_BLOCK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPEN_BLOCK")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPEN_BLOCK, "<open block>");
    r = consumeToken(b, "{{#");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{{>'
  public static boolean OPEN_PARTIAL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPEN_PARTIAL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPEN_PARTIAL, "<open partial>");
    r = consumeToken(b, "{{>");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{{{{'
  public static boolean OPEN_RAW_BLOCK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPEN_RAW_BLOCK")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPEN_RAW_BLOCK, "<open raw block>");
    r = consumeToken(b, "{{{{");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '('
  public static boolean OPEN_SEXPR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPEN_SEXPR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPEN_SEXPR, "<open sexpr>");
    r = consumeToken(b, "(");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'string'
  public static boolean STRING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STRING")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING, "<string>");
    r = consumeToken(b, "string");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPEN_BLOCK expr_contents CLOSE_BLOCK
  public static boolean block_helper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_helper")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_HELPER, "<block helper>");
    r = OPEN_BLOCK(b, l + 1);
    r = r && expr_contents(b, l + 1);
    r = r && CLOSE_BLOCK(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMMENT_OPEN COMMENT_CONTENT? COMMENT_CLOSE
  public static boolean comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT, "<comment>");
    r = COMMENT_OPEN(b, l + 1);
    r = r && comment_1(b, l + 1);
    r = r && COMMENT_CLOSE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMENT_CONTENT?
  private static boolean comment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment_1")) return false;
    COMMENT_CONTENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // CONTENT
  public static boolean content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTENT, "<content>");
    r = CONTENT(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // id | STRING | NUMBER | BOOLEAN | DATA_PREFIX | OPEN_SEXPR CLOSE_SEXPR
  public static boolean expr_component(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_component")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_COMPONENT, "<expr component>");
    r = consumeToken(b, ID);
    if (!r) r = STRING(b, l + 1);
    if (!r) r = NUMBER(b, l + 1);
    if (!r) r = BOOLEAN(b, l + 1);
    if (!r) r = DATA_PREFIX(b, l + 1);
    if (!r) r = expr_component_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OPEN_SEXPR CLOSE_SEXPR
  private static boolean expr_component_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_component_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OPEN_SEXPR(b, l + 1);
    r = r && CLOSE_SEXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr_component*
  public static boolean expr_contents(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_contents")) return false;
    Marker m = enter_section_(b, l, _NONE_, EXPR_CONTENTS, "<expr contents>");
    while (true) {
      int c = current_position_(b);
      if (!expr_component(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_contents", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // OPEN_PARTIAL id CLOSE
  public static boolean partial(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partial")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARTIAL, "<partial>");
    r = OPEN_PARTIAL(b, l + 1);
    r = r && consumeToken(b, ID);
    r = r && CLOSE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPEN_RAW_BLOCK CONTENT CLOSE_RAW_BLOCK
  public static boolean raw_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RAW_BLOCK, "<raw block>");
    r = OPEN_RAW_BLOCK(b, l + 1);
    r = r && CONTENT(b, l + 1);
    r = r && CLOSE_RAW_BLOCK(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // content | simple_expr | block_helper | partial | comment | raw_block
  public static boolean root_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROOT_ITEM, "<root item>");
    r = content(b, l + 1);
    if (!r) r = simple_expr(b, l + 1);
    if (!r) r = block_helper(b, l + 1);
    if (!r) r = partial(b, l + 1);
    if (!r) r = comment(b, l + 1);
    if (!r) r = raw_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // root_item*
  static boolean sharp_script(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharp_script")) return false;
    while (true) {
      int c = current_position_(b);
      if (!root_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sharp_script", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OPEN expr CLOSE
  public static boolean simple_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_EXPR, "<simple expr>");
    r = OPEN(b, l + 1);
    r = r && consumeToken(b, EXPR);
    r = r && CLOSE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
