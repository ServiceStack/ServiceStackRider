// This is a generated file. Not intended for manual editing.
package net.servicestack.idea.sharpscript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SharpScriptRootItem extends PsiElement {

  @Nullable
  SharpScriptBlockHelper getBlockHelper();

  @Nullable
  SharpScriptComment getComment();

  @Nullable
  SharpScriptContent getContent();

  @Nullable
  SharpScriptPartial getPartial();

  @Nullable
  SharpScriptRawBlock getRawBlock();

  @Nullable
  SharpScriptSimpleExpr getSimpleExpr();

}
