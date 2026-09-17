package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatButton;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.fz;
import defpackage.gl;
import defpackage.jr;
import defpackage.mp;
import defpackage.nyc;
import defpackage.nyd;
import defpackage.nye;
import defpackage.nyf;
import defpackage.nzw;
import defpackage.obm;
import defpackage.obr;
import defpackage.obu;
import defpackage.obz;
import defpackage.oci;
import defpackage.odn;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, oci {
    private static final int[] b = {R.attr.state_checkable};
    private static final int[] c = {R.attr.state_checked};
    private final nye d;
    private final LinkedHashSet e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;

    public MaterialButton(Context context) {
        this(context, null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.GoogleCameraEngR18F1.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(odn.a(context, attributeSet, i, com.google.android.GoogleCameraEngR18F1.R.style.Widget_MaterialComponents_Button), attributeSet, i);
        this.e = new LinkedHashSet();
        this.m = false;
        this.n = false;
        Context context2 = getContext();
        TypedArray typedArrayA = nzw.a(context2, attributeSet, nyf.a, i, com.google.android.GoogleCameraEngR18F1.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.l = typedArrayA.getDimensionPixelSize(12, 0);
        this.f = obr.w(typedArrayA.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.g = obr.c(getContext(), typedArrayA, 14);
        this.h = obr.d(getContext(), typedArrayA, 10);
        this.o = typedArrayA.getInteger(11, 1);
        this.i = typedArrayA.getDimensionPixelSize(13, 0);
        nye nyeVar = new nye(this, obz.a(context2, attributeSet, i, com.google.android.GoogleCameraEngR18F1.R.style.Widget_MaterialComponents_Button).a());
        this.d = nyeVar;
        nyeVar.c = typedArrayA.getDimensionPixelOffset(1, 0);
        nyeVar.d = typedArrayA.getDimensionPixelOffset(2, 0);
        nyeVar.e = typedArrayA.getDimensionPixelOffset(3, 0);
        nyeVar.f = typedArrayA.getDimensionPixelOffset(4, 0);
        if (typedArrayA.hasValue(8)) {
            int dimensionPixelSize = typedArrayA.getDimensionPixelSize(8, -1);
            nyeVar.g = dimensionPixelSize;
            nyeVar.d(nyeVar.b.d(dimensionPixelSize));
        }
        nyeVar.h = typedArrayA.getDimensionPixelSize(20, 0);
        nyeVar.i = obr.w(typedArrayA.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        nyeVar.j = obr.c(nyeVar.a.getContext(), typedArrayA, 6);
        nyeVar.k = obr.c(nyeVar.a.getContext(), typedArrayA, 19);
        nyeVar.l = obr.c(nyeVar.a.getContext(), typedArrayA, 16);
        nyeVar.o = typedArrayA.getBoolean(5, false);
        nyeVar.q = typedArrayA.getDimensionPixelSize(9, 0);
        int iJ = gl.j(nyeVar.a);
        int paddingTop = nyeVar.a.getPaddingTop();
        int i2 = gl.i(nyeVar.a);
        int paddingBottom = nyeVar.a.getPaddingBottom();
        if (typedArrayA.hasValue(0)) {
            nyeVar.c();
        } else {
            MaterialButton materialButton = nyeVar.a;
            obu obuVar = new obu(nyeVar.b);
            obuVar.f(nyeVar.a.getContext());
            obuVar.setTintList(nyeVar.j);
            PorterDuff.Mode mode = nyeVar.i;
            if (mode != null) {
                obuVar.setTintMode(mode);
            }
            int i3 = nyeVar.h;
            ColorStateList colorStateList = nyeVar.k;
            obuVar.k(i3);
            obuVar.j(colorStateList);
            obu obuVar2 = new obu(nyeVar.b);
            obuVar2.setTint(0);
            obuVar2.k(nyeVar.h);
            obuVar2.j(ColorStateList.valueOf(0));
            nyeVar.m = new obu(nyeVar.b);
            nyeVar.m.setTint(-1);
            nyeVar.p = new RippleDrawable(obm.b(nyeVar.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{obuVar2, obuVar}), nyeVar.c, nyeVar.e, nyeVar.d, nyeVar.f), nyeVar.m);
            super.setBackgroundDrawable(nyeVar.p);
            obu obuVarA = nyeVar.a();
            if (obuVarA != null) {
                obuVarA.g(nyeVar.q);
            }
        }
        gl.O(nyeVar.a, iJ + nyeVar.c, paddingTop + nyeVar.e, i2 + nyeVar.d, paddingBottom + nyeVar.f);
        typedArrayA.recycle();
        setCompoundDrawablePadding(this.l);
        g(this.h != null);
    }

    private final String a() {
        return (true != e() ? Button.class : CompoundButton.class).getName();
    }

    private final void f() {
        if (j()) {
            fz.c(this, this.h, null, null);
        } else if (i()) {
            fz.c(this, null, null, this.h);
        } else if (k()) {
            fz.c(this, null, this.h, null);
        }
    }

    private final void g(boolean z) {
        Drawable drawable = this.h;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.h = drawableMutate;
            drawableMutate.setTintList(this.g);
            PorterDuff.Mode mode = this.f;
            if (mode != null) {
                this.h.setTintMode(mode);
            }
            int intrinsicWidth = this.i;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.h.getIntrinsicWidth();
            }
            int intrinsicHeight = this.i;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.h;
            int i = this.j;
            int i2 = this.k;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.h.setVisible(true, z);
        }
        if (z) {
            f();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!j() || drawable3 == this.h) && ((!i() || drawable5 == this.h) && (!k() || drawable4 == this.h))) {
            return;
        }
        f();
    }

    private final void h(int i, int i2) {
        if (this.h == null || getLayout() == null) {
            return;
        }
        if (j() || i()) {
            this.k = 0;
            int i3 = this.o;
            if (i3 == 1 || i3 == 3) {
                this.j = 0;
                g(false);
                return;
            }
            int intrinsicWidth = this.i;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.h.getIntrinsicWidth();
            }
            TextPaint paint = getPaint();
            String string = getText().toString();
            if (getTransformationMethod() != null) {
                string = getTransformationMethod().getTransformation(string, this).toString();
            }
            int iMin = (((((i - Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth())) - gl.i(this)) - intrinsicWidth) - this.l) - gl.j(this)) / 2;
            if ((gl.f(this) == 1) != (this.o == 4)) {
                iMin = -iMin;
            }
            if (this.j != iMin) {
                this.j = iMin;
                g(false);
                return;
            }
            return;
        }
        if (k()) {
            this.j = 0;
            if (this.o == 16) {
                this.k = 0;
                g(false);
                return;
            }
            int intrinsicHeight = this.i;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.h.getIntrinsicHeight();
            }
            TextPaint paint2 = getPaint();
            String string2 = getText().toString();
            if (getTransformationMethod() != null) {
                string2 = getTransformationMethod().getTransformation(string2, this).toString();
            }
            Rect rect = new Rect();
            paint2.getTextBounds(string2, 0, string2.length(), rect);
            int iMin2 = (((((i2 - Math.min(rect.height(), getLayout().getHeight())) - getPaddingTop()) - intrinsicHeight) - this.l) - getPaddingBottom()) / 2;
            if (this.k != iMin2) {
                this.k = iMin2;
                g(false);
            }
        }
    }

    private final boolean i() {
        int i = this.o;
        return i == 3 || i == 4;
    }

    private final boolean j() {
        int i = this.o;
        return i == 1 || i == 2;
    }

    private final boolean k() {
        int i = this.o;
        return i == 16 || i == 32;
    }

    private final boolean l() {
        nye nyeVar = this.d;
        return (nyeVar == null || nyeVar.n) ? false : true;
    }

    @Override // defpackage.oci
    public final void b(obz obzVar) {
        if (!l()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.d(obzVar);
    }

    public final void c(ColorStateList colorStateList) {
        if (!l()) {
            mp mpVar = this.a;
            if (mpVar != null) {
                mpVar.g(colorStateList);
                return;
            }
            return;
        }
        nye nyeVar = this.d;
        if (nyeVar.j != colorStateList) {
            nyeVar.j = colorStateList;
            if (nyeVar.a() != null) {
                nyeVar.a().setTintList(nyeVar.j);
            }
        }
    }

    public final void d(PorterDuff.Mode mode) {
        if (!l()) {
            mp mpVar = this.a;
            if (mpVar != null) {
                mpVar.h(mode);
                return;
            }
            return;
        }
        nye nyeVar = this.d;
        if (nyeVar.i != mode) {
            nyeVar.i = mode;
            if (nyeVar.a() == null || nyeVar.i == null) {
                return;
            }
            nyeVar.a().setTintMode(nyeVar.i);
        }
    }

    public final boolean e() {
        nye nyeVar = this.d;
        return nyeVar != null && nyeVar.o;
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        if (l()) {
            return this.d.j;
        }
        mp mpVar = this.a;
        if (mpVar != null) {
            return mpVar.a();
        }
        return null;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        if (l()) {
            return this.d.i;
        }
        mp mpVar = this.a;
        if (mpVar != null) {
            return mpVar.b();
        }
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.m;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (l()) {
            obr.n(this, this.d.a());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (e()) {
            mergeDrawableStates(iArrOnCreateDrawableState, b);
        }
        if (this.m) {
            mergeDrawableStates(iArrOnCreateDrawableState, c);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(a());
        accessibilityEvent.setChecked(this.m);
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(a());
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setChecked(this.m);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof nyd)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        nyd nydVar = (nyd) parcelable;
        super.onRestoreInstanceState(nydVar.d);
        setChecked(nydVar.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        nyd nydVar = new nyd(super.onSaveInstanceState());
        nydVar.a = this.m;
        return nydVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        h(i, i2);
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (!l()) {
            super.setBackgroundColor(i);
            return;
        }
        nye nyeVar = this.d;
        if (nyeVar.a() != null) {
            nyeVar.a().setTint(i);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!l()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.d.c();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? jr.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        c(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        d(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (e() && isEnabled() && this.m != z) {
            this.m = z;
            refreshDrawableState();
            if (this.n) {
                return;
            }
            this.n = true;
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((nyc) it.next()).a();
            }
            this.n = false;
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (l()) {
            this.d.a().g(f);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.m);
    }
}
