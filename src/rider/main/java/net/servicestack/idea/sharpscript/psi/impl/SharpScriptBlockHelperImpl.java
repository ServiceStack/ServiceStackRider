// This is a generated file. Not intended for manual editing.
package net.servicestack.idea.sharpscript.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.servicestack.idea.sharpscript.psi.*;

public class SharpScriptBlockHelperImpl extends ASTWrapperPsiElement implements SharpScriptBlockHelper {

  public SharpScriptBlockHelperImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SharpScriptVisitor visitor) {
    visitor.visitBlockHelper(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SharpScriptVisitor) accept((SharpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SharpScriptCloseBlock getCloseBlock() {
    return findNotNullChildByClass(SharpScriptCloseBlock.class);
  }

  @Override
  @NotNull
  public SharpScriptOpenBlock getOpenBlock() {
    return findNotNullChildByClass(SharpScriptOpenBlock.class);
  }

  @Override
  @NotNull
  public SharpScriptExprContents getExprContents() {
    return findNotNullChildByClass(SharpScriptExprContents.class);
  }

}
