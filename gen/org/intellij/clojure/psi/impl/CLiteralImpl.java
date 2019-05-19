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

public class CLiteralImpl extends CSFormImpl implements CLiteral {

  public CLiteralImpl(@NotNull IElementType type) {
    super(type);
  }

  public void accept(@NotNull ClojureVisitor visitor) {
    visitor.visitLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ClojureVisitor) accept((ClojureVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IElementType getLiteralType() {
    return ClojurePsiImplUtil.getLiteralType(this);
  }

  @Override
  @NotNull
  public String getLiteralText() {
    return ClojurePsiImplUtil.getLiteralText(this);
  }

}
