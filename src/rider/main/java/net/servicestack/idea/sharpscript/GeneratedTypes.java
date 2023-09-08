// This is a generated file. Not intended for manual editing.
package net.servicestack.idea.sharpscript;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import net.servicestack.idea.sharpscript.psi.impl.*;

public interface GeneratedTypes {

  IElementType BLOCK_HELPER = new IElementType("BLOCK_HELPER", null);
  IElementType BOOLEAN = new IElementType("BOOLEAN", null);
  IElementType CLOSE = new IElementType("CLOSE", null);
  IElementType CLOSE_BLOCK = new IElementType("CLOSE_BLOCK", null);
  IElementType CLOSE_RAW_BLOCK = new IElementType("CLOSE_RAW_BLOCK", null);
  IElementType CLOSE_SEXPR = new IElementType("CLOSE_SEXPR", null);
  IElementType COMMENT = new IElementType("COMMENT", null);
  IElementType COMMENT_CLOSE = new IElementType("COMMENT_CLOSE", null);
  IElementType COMMENT_CONTENT = new IElementType("COMMENT_CONTENT", null);
  IElementType COMMENT_OPEN = new IElementType("COMMENT_OPEN", null);
  IElementType CONTENT = new IElementType("CONTENT", null);
  IElementType DATA_PREFIX = new IElementType("DATA_PREFIX", null);
  IElementType EXPR_COMPONENT = new IElementType("EXPR_COMPONENT", null);
  IElementType EXPR_CONTENTS = new IElementType("EXPR_CONTENTS", null);
  IElementType ID = new IElementType("ID", null);
  IElementType NUMBER = new IElementType("NUMBER", null);
  IElementType OPEN = new IElementType("OPEN", null);
  IElementType OPEN_BLOCK = new IElementType("OPEN_BLOCK", null);
  IElementType OPEN_PARTIAL = new IElementType("OPEN_PARTIAL", null);
  IElementType OPEN_RAW_BLOCK = new IElementType("OPEN_RAW_BLOCK", null);
  IElementType OPEN_SEXPR = new IElementType("OPEN_SEXPR", null);
  IElementType PARTIAL = new IElementType("PARTIAL", null);
  IElementType RAW_BLOCK = new IElementType("RAW_BLOCK", null);
  IElementType ROOT_ITEM = new IElementType("ROOT_ITEM", null);
  IElementType SIMPLE_EXPR = new IElementType("SIMPLE_EXPR", null);
  IElementType STRING = new IElementType("STRING", null);

  IElementType EXPR = new IElementType("expr", null);

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BLOCK_HELPER) {
        return new SharpScriptBlockHelperImpl(node);
      }
      else if (type == BOOLEAN) {
        return new SharpScriptBooleanImpl(node);
      }
      else if (type == CLOSE) {
        return new SharpScriptCloseImpl(node);
      }
      else if (type == CLOSE_BLOCK) {
        return new SharpScriptCloseBlockImpl(node);
      }
      else if (type == CLOSE_RAW_BLOCK) {
        return new SharpScriptCloseRawBlockImpl(node);
      }
      else if (type == CLOSE_SEXPR) {
        return new SharpScriptCloseSexprImpl(node);
      }
      else if (type == COMMENT) {
        return new SharpScriptCommentImpl(node);
      }
      else if (type == COMMENT_CLOSE) {
        return new SharpScriptCommentCloseImpl(node);
      }
      else if (type == COMMENT_CONTENT) {
        return new SharpScriptCommentContentImpl(node);
      }
      else if (type == COMMENT_OPEN) {
        return new SharpScriptCommentOpenImpl(node);
      }
      else if (type == CONTENT) {
        return new SharpScriptContentImpl(node);
      }
      else if (type == DATA_PREFIX) {
        return new SharpScriptDataPrefixImpl(node);
      }
      else if (type == EXPR_COMPONENT) {
        return new SharpScriptExprComponentImpl(node);
      }
      else if (type == EXPR_CONTENTS) {
        return new SharpScriptExprContentsImpl(node);
      }
      else if (type == ID) {
        return new SharpScriptIdImpl(node);
      }
      else if (type == NUMBER) {
        return new SharpScriptNumberImpl(node);
      }
      else if (type == OPEN) {
        return new SharpScriptOpenImpl(node);
      }
      else if (type == OPEN_BLOCK) {
        return new SharpScriptOpenBlockImpl(node);
      }
      else if (type == OPEN_PARTIAL) {
        return new SharpScriptOpenPartialImpl(node);
      }
      else if (type == OPEN_RAW_BLOCK) {
        return new SharpScriptOpenRawBlockImpl(node);
      }
      else if (type == OPEN_SEXPR) {
        return new SharpScriptOpenSexprImpl(node);
      }
      else if (type == PARTIAL) {
        return new SharpScriptPartialImpl(node);
      }
      else if (type == RAW_BLOCK) {
        return new SharpScriptRawBlockImpl(node);
      }
      else if (type == ROOT_ITEM) {
        return new SharpScriptRootItemImpl(node);
      }
      else if (type == SIMPLE_EXPR) {
        return new SharpScriptSimpleExprImpl(node);
      }
      else if (type == STRING) {
        return new SharpScriptStringImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
