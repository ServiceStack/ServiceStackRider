// This is a generated file. Not intended for manual editing.
package net.servicestack.idea.sharpscript.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.servicestack.idea.sharpscript.psi.*;

public class SharpScriptElementImpl extends ASTWrapperPsiElement implements SharpScriptElement {

  public SharpScriptElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SharpScriptVisitor visitor) {
    visitor.visitElement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SharpScriptVisitor) accept((SharpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SharpScriptAssignment getAssignment() {
    return findChildByClass(SharpScriptAssignment.class);
  }

  @Override
  @Nullable
  public SharpScriptJsLiteral getJsLiteral() {
    return findChildByClass(SharpScriptJsLiteral.class);
  }

  @Override
  @Nullable
  public SharpScriptMethodCall getMethodCall() {
    return findChildByClass(SharpScriptMethodCall.class);
  }

  @Override
  @Nullable
  public SharpScriptMethodChain getMethodChain() {
    return findChildByClass(SharpScriptMethodChain.class);
  }

  @Override
  @Nullable
  public SharpScriptMustacheExpr getMustacheExpr() {
    return findChildByClass(SharpScriptMustacheExpr.class);
  }

  @Override
  @Nullable
  public SharpScriptShorthandArrowExpr getShorthandArrowExpr() {
    return findChildByClass(SharpScriptShorthandArrowExpr.class);
  }

  @Override
  @Nullable
  public SharpScriptShorthandNotation getShorthandNotation() {
    return findChildByClass(SharpScriptShorthandNotation.class);
  }

  @Override
  @Nullable
  public SharpScriptTemplateLiteral getTemplateLiteral() {
    return findChildByClass(SharpScriptTemplateLiteral.class);
  }

}
