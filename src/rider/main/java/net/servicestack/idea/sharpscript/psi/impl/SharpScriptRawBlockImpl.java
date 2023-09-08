// This is a generated file. Not intended for manual editing.
package net.servicestack.idea.sharpscript.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.servicestack.idea.sharpscript.psi.*;

public class SharpScriptRawBlockImpl extends ASTWrapperPsiElement implements SharpScriptRawBlock {

  public SharpScriptRawBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SharpScriptVisitor visitor) {
    visitor.visitRawBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SharpScriptVisitor) accept((SharpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SharpScriptCloseRawBlock getCloseRawBlock() {
    return findNotNullChildByClass(SharpScriptCloseRawBlock.class);
  }

  @Override
  @NotNull
  public SharpScriptContent getContent() {
    return findNotNullChildByClass(SharpScriptContent.class);
  }

  @Override
  @NotNull
  public SharpScriptOpenRawBlock getOpenRawBlock() {
    return findNotNullChildByClass(SharpScriptOpenRawBlock.class);
  }

}
