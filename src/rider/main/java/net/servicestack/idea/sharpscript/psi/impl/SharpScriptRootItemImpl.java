// This is a generated file. Not intended for manual editing.
package net.servicestack.idea.sharpscript.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.servicestack.idea.sharpscript.psi.*;

public class SharpScriptRootItemImpl extends ASTWrapperPsiElement implements SharpScriptRootItem {

  public SharpScriptRootItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SharpScriptVisitor visitor) {
    visitor.visitRootItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SharpScriptVisitor) accept((SharpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SharpScriptBlockHelper getBlockHelper() {
    return findChildByClass(SharpScriptBlockHelper.class);
  }

  @Override
  @Nullable
  public SharpScriptComment getComment() {
    return findChildByClass(SharpScriptComment.class);
  }

  @Override
  @Nullable
  public SharpScriptContent getContent() {
    return findChildByClass(SharpScriptContent.class);
  }

  @Override
  @Nullable
  public SharpScriptPartial getPartial() {
    return findChildByClass(SharpScriptPartial.class);
  }

  @Override
  @Nullable
  public SharpScriptRawBlock getRawBlock() {
    return findChildByClass(SharpScriptRawBlock.class);
  }

  @Override
  @Nullable
  public SharpScriptSimpleExpr getSimpleExpr() {
    return findChildByClass(SharpScriptSimpleExpr.class);
  }

}
