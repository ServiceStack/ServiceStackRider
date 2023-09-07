// This is a generated file. Not intended for manual editing.
package net.servicestack.idea.sharpscript.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.servicestack.idea.sharpscript.psi.*;

public class SharpScriptMethodChainImpl extends ASTWrapperPsiElement implements SharpScriptMethodChain {

  public SharpScriptMethodChainImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SharpScriptVisitor visitor) {
    visitor.visitMethodChain(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SharpScriptVisitor) accept((SharpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SharpScriptExpr getExpr() {
    return findNotNullChildByClass(SharpScriptExpr.class);
  }

  @Override
  @NotNull
  public List<SharpScriptMethodCall> getMethodCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SharpScriptMethodCall.class);
  }

}
