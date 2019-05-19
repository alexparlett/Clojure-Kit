// This is a generated file. Not intended for manual editing.
package org.intellij.clojure.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.clojure.psi.ClojureTypes.*;
import org.intellij.clojure.psi.*;
import com.intellij.psi.tree.IElementType;

public class CReaderMacroImpl extends CComposite implements CReaderMacro {

  public CReaderMacroImpl(@NotNull IElementType type) {
    super(type);
  }

  public void accept(@NotNull ClojureVisitor visitor) {
    visitor.visitReaderMacro(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ClojureVisitor) accept((ClojureVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CSymbol getSymbol() {
    return PsiTreeUtil.getChildOfType(this, CSymbol.class);
  }

  @Override
  @NotNull
  public String toString() {
    return ClojurePsiImplUtil.toString(this);
  }

}
