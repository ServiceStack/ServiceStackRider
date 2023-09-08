// This is a generated file. Not intended for manual editing.
package net.servicestack.idea.sharpscript.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.servicestack.idea.sharpscript.psi.*;

public class SharpScriptExprComponentImpl extends ASTWrapperPsiElement implements SharpScriptExprComponent {

  public SharpScriptExprComponentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SharpScriptVisitor visitor) {
    visitor.visitExprComponent(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SharpScriptVisitor) accept((SharpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SharpScriptBoolean getBoolean() {
    return findChildByClass(SharpScriptBoolean.class);
  }

  @Override
  @Nullable
  public SharpScriptCloseSexpr getCloseSexpr() {
    return findChildByClass(SharpScriptCloseSexpr.class);
  }

  @Override
  @Nullable
  public SharpScriptDataPrefix getDataPrefix() {
    return findChildByClass(SharpScriptDataPrefix.class);
  }

  @Override
  @Nullable
  public SharpScriptNumber getNumber() {
    return findChildByClass(SharpScriptNumber.class);
  }

  @Override
  @Nullable
  public SharpScriptOpenSexpr getOpenSexpr() {
    return findChildByClass(SharpScriptOpenSexpr.class);
  }

  @Override
  @Nullable
  public SharpScriptString getString() {
    return findChildByClass(SharpScriptString.class);
  }

  @Override
  @Nullable
  public SharpScriptBacktickExpr getBacktickExpr() {
    return findChildByClass(SharpScriptBacktickExpr.class);
  }

}
