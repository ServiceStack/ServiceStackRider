// This is a generated file. Not intended for manual editing.
package net.servicestack.idea.sharpscript.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.servicestack.idea.sharpscript.psi.*;

public class SharpScriptPartialImpl extends ASTWrapperPsiElement implements SharpScriptPartial {

  public SharpScriptPartialImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SharpScriptVisitor visitor) {
    visitor.visitPartial(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SharpScriptVisitor) accept((SharpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SharpScriptClose getClose() {
    return findNotNullChildByClass(SharpScriptClose.class);
  }

  @Override
  @NotNull
  public SharpScriptOpenPartial getOpenPartial() {
    return findNotNullChildByClass(SharpScriptOpenPartial.class);
  }

}
