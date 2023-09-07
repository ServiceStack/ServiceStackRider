// This is a generated file. Not intended for manual editing.
package net.servicestack.idea.sharpscript;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import net.servicestack.idea.sharpscript.psi.impl.*;

public interface GeneratedTypes {

  IElementType ARGS = new IElementType("ARGS", null);
  IElementType ARRAY = new IElementType("ARRAY", null);
  IElementType ASSIGNMENT = new IElementType("ASSIGNMENT", null);
  IElementType ELEMENT = new IElementType("ELEMENT", null);
  IElementType EXPR = new IElementType("EXPR", null);
  IElementType EXPRESSION_INSIDE = new IElementType("EXPRESSION_INSIDE", null);
  IElementType JS_LITERAL = new IElementType("JS_LITERAL", null);
  IElementType METHOD_CALL = new IElementType("METHOD_CALL", null);
  IElementType METHOD_CHAIN = new IElementType("METHOD_CHAIN", null);
  IElementType METHOD_NAME = new IElementType("METHOD_NAME", null);
  IElementType MUSTACHE_EXPR = new IElementType("MUSTACHE_EXPR", null);
  IElementType OBJECT = new IElementType("OBJECT", null);
  IElementType SHARP_SCRIPT_INSIDE = new IElementType("SHARP_SCRIPT_INSIDE", null);
  IElementType SHORTHAND_ARROW_EXPR = new IElementType("SHORTHAND_ARROW_EXPR", null);
  IElementType SHORTHAND_NOTATION = new IElementType("SHORTHAND_NOTATION", null);
  IElementType TARGET = new IElementType("TARGET", null);
  IElementType TEMPLATE_LITERAL = new IElementType("TEMPLATE_LITERAL", null);

  IElementType ARRAY_END = new IElementType("ARRAY_END", null);
  IElementType ARRAY_START = new IElementType("ARRAY_START", null);
  IElementType ARROW = new IElementType("ARROW", null);
  IElementType CLOSE_BRACE = new IElementType("CLOSE_BRACE", null);
  IElementType CLOSE_PAREN = new IElementType("CLOSE_PAREN", null);
  IElementType EXPRESSION_TOKEN = new IElementType("EXPRESSION_TOKEN", null);
  IElementType FAT_ARROW = new IElementType("FAT_ARROW", null);
  IElementType HASHTAG = new IElementType("HASHTAG", null);
  IElementType IDENTIFIER = new IElementType("IDENTIFIER", null);
  IElementType MUSTACHE_END = new IElementType("MUSTACHE_END", null);
  IElementType MUSTACHE_START = new IElementType("MUSTACHE_START", null);
  IElementType NULL = new IElementType("NULL", null);
  IElementType NUMBER = new IElementType("NUMBER", null);
  IElementType OBJECT_END = new IElementType("OBJECT_END", null);
  IElementType OBJECT_START = new IElementType("OBJECT_START", null);
  IElementType OPEN_BRACE = new IElementType("OPEN_BRACE", null);
  IElementType OPEN_PAREN = new IElementType("OPEN_PAREN", null);
  IElementType PIPE = new IElementType("PIPE", null);
  IElementType PIPE_CHAIN = new IElementType("PIPE_CHAIN", null);
  IElementType SINGLE_QUOTE = new IElementType("SINGLE_QUOTE", null);
  IElementType STRING = new IElementType("STRING", null);
  IElementType TEMPLATE_END = new IElementType("TEMPLATE_END", null);
  IElementType TEMPLATE_START = new IElementType("TEMPLATE_START", null);
  IElementType TRUE = new IElementType("TRUE", null);

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGS) {
        return new SharpScriptArgsImpl(node);
      }
      else if (type == ARRAY) {
        return new SharpScriptArrayImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new SharpScriptAssignmentImpl(node);
      }
      else if (type == ELEMENT) {
        return new SharpScriptElementImpl(node);
      }
      else if (type == EXPR) {
        return new SharpScriptExprImpl(node);
      }
      else if (type == EXPRESSION_INSIDE) {
        return new SharpScriptExpressionInsideImpl(node);
      }
      else if (type == JS_LITERAL) {
        return new SharpScriptJsLiteralImpl(node);
      }
      else if (type == METHOD_CALL) {
        return new SharpScriptMethodCallImpl(node);
      }
      else if (type == METHOD_CHAIN) {
        return new SharpScriptMethodChainImpl(node);
      }
      else if (type == METHOD_NAME) {
        return new SharpScriptMethodNameImpl(node);
      }
      else if (type == MUSTACHE_EXPR) {
        return new SharpScriptMustacheExprImpl(node);
      }
      else if (type == OBJECT) {
        return new SharpScriptObjectImpl(node);
      }
      else if (type == SHARP_SCRIPT_INSIDE) {
        return new SharpScriptSharpScriptInsideImpl(node);
      }
      else if (type == SHORTHAND_ARROW_EXPR) {
        return new SharpScriptShorthandArrowExprImpl(node);
      }
      else if (type == SHORTHAND_NOTATION) {
        return new SharpScriptShorthandNotationImpl(node);
      }
      else if (type == TARGET) {
        return new SharpScriptTargetImpl(node);
      }
      else if (type == TEMPLATE_LITERAL) {
        return new SharpScriptTemplateLiteralImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
