package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
final class nn extends pk implements np {
    public CharSequence a;
    ListAdapter b;
    public final Rect c;
    final /* synthetic */ nq d;
    private int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(nq nqVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.d = nqVar;
        this.c = new Rect();
        this.l = nqVar;
        y();
        this.m = new nk(this);
    }

    @Override // defpackage.np
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.pk, defpackage.np
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.np
    public final void h(int i) {
        this.r = i;
    }

    @Override // defpackage.np
    public final void i(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.np
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean zU = u();
        n();
        x();
        super.s();
        om omVar = this.e;
        omVar.setChoiceMode(1);
        omVar.setTextDirection(i);
        omVar.setTextAlignment(i2);
        int selectedItemPosition = this.d.getSelectedItemPosition();
        om omVar2 = this.e;
        if (u() && omVar2 != null) {
            omVar2.a = false;
            omVar2.setSelection(selectedItemPosition);
            if (omVar2.getChoiceMode() != 0) {
                omVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zU || (viewTreeObserver = this.d.getViewTreeObserver()) == null) {
            return;
        }
        nl nlVar = new nl(this);
        viewTreeObserver.addOnGlobalLayoutListener(nlVar);
        v(new nm(this, nlVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.widget.ListAdapter, android.widget.SpinnerAdapter] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    final void n() {
        Drawable drawableC = c();
        int i = 0;
        if (drawableC != null) {
            drawableC.getPadding(this.d.d);
            i = sd.b(this.d) ? this.d.d.right : -this.d.d.left;
        } else {
            Rect rect = this.d.d;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = this.d.getPaddingLeft();
        int paddingRight = this.d.getPaddingRight();
        int width = this.d.getWidth();
        nq nqVar = this.d;
        int i2 = nqVar.c;
        if (i2 == -2) {
            int iA = nqVar.a(this.b, c());
            int i3 = (this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.d.left) - this.d.d.right;
            if (iA > i3) {
                iA = i3;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.g = sd.b(this.d) ? i + (((width - paddingRight) - this.f) - this.r) : i + paddingLeft + this.r;
    }
}
