// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.YakshaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.sdk.language.psi.*;

public class YakshaLspExprImpl extends ASTWrapperPsiElement implements YakshaLspExpr {

  public YakshaLspExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YakshaVisitor visitor) {
    visitor.visitLspExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YakshaVisitor) accept((YakshaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YakshaAllAllowedSymbols getAllAllowedSymbols() {
    return findChildByClass(YakshaAllAllowedSymbols.class);
  }

  @Override
  @Nullable
  public YakshaLspQExpr getLspQExpr() {
    return findChildByClass(YakshaLspQExpr.class);
  }

  @Override
  @Nullable
  public YakshaLspSExpr getLspSExpr() {
    return findChildByClass(YakshaLspSExpr.class);
  }

}
