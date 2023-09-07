// This is a generated file. Not intended for manual editing.
package net.servicestack.idea.sharpscript.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.servicestack.idea.sharpscript.psi.*;

public class SharpScriptObjectImpl extends ASTWrapperPsiElement implements SharpScriptObject {

  public SharpScriptObjectImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SharpScriptVisitor visitor) {
    visitor.visitObject(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SharpScriptVisitor) accept((SharpScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SharpScriptAssignment> getAssignmentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SharpScriptAssignment.class);
  }

}
