// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface YakshaDefStatement extends YakshaNamedElement {

  @NotNull
  YakshaDataType getDataType();

  @NotNull
  List<YakshaDefBits> getDefBitsList();

  @Nullable
  YakshaDefParams getDefParams();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
