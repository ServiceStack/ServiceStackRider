// This is a generated file. Not intended for manual editing.
package net.servicestack.idea.sharpscript.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SharpScriptElement extends PsiElement {

  @Nullable
  SharpScriptAssignment getAssignment();

  @Nullable
  SharpScriptJsLiteral getJsLiteral();

  @Nullable
  SharpScriptMethodCall getMethodCall();

  @Nullable
  SharpScriptMethodChain getMethodChain();

  @Nullable
  SharpScriptMustacheExpr getMustacheExpr();

  @Nullable
  SharpScriptShorthandArrowExpr getShorthandArrowExpr();

  @Nullable
  SharpScriptShorthandNotation getShorthandNotation();

  @Nullable
  SharpScriptTemplateLiteral getTemplateLiteral();

}
