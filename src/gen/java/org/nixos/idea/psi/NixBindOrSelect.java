// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NixBindOrSelect extends PsiElement {

  @NotNull
  NixBindSet getBindSet();

  @Nullable
  NixContPath getContPath();

}
