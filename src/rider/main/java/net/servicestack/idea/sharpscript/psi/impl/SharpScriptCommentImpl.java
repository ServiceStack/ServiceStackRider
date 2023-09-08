// This is a generated file. Not intended for manual editing.
package net.servicestack.idea.sharpscript.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.servicestack.idea.sharpscript.psi.*;

public class SharpScriptCommentImpl extends ASTWrapperPsiElement implements SharpScriptComment {

  public SharpScriptCommentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SharpScriptVisitor visitor) {
    visitor.visitComment(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SharpScriptVisitor) accept((SharpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SharpScriptCommentClose getCommentClose() {
    return findNotNullChildByClass(SharpScriptCommentClose.class);
  }

  @Override
  @Nullable
  public SharpScriptCommentContent getCommentContent() {
    return findChildByClass(SharpScriptCommentContent.class);
  }

  @Override
  @NotNull
  public SharpScriptCommentOpen getCommentOpen() {
    return findNotNullChildByClass(SharpScriptCommentOpen.class);
  }

}
