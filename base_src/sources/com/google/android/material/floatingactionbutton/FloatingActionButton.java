package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.lens.sdk.LensApi;
import defpackage.aad;
import defpackage.aae;
import defpackage.aah;
import defpackage.aas;
import defpackage.ew;
import defpackage.gl;
import defpackage.mx;
import defpackage.nwm;
import defpackage.nym;
import defpackage.nyn;
import defpackage.nyp;
import defpackage.nyv;
import defpackage.nyw;
import defpackage.nyx;
import defpackage.nzf;
import defpackage.nzg;
import defpackage.nzh;
import defpackage.nzj;
import defpackage.nzo;
import defpackage.nzw;
import defpackage.oaa;
import defpackage.obm;
import defpackage.obr;
import defpackage.obu;
import defpackage.obz;
import defpackage.oci;
import defpackage.ocn;
import defpackage.odn;
import defpackage.xf;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends oaa implements nym, oci, aad {
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private final mx m;
    private final nyn n;
    private nzf o;

    public class BaseBehavior extends aae {
        private Rect a;
        private boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nzj.c);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        private final boolean A(View view, FloatingActionButton floatingActionButton) {
            if (!y(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((aah) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.e();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        private static boolean x(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof aah) {
                return ((aah) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean y(View view, FloatingActionButton floatingActionButton) {
            return this.b && ((aah) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.d == 0;
        }

        private final boolean z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!y(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            nzo.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                floatingActionButton.e();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        @Override // defpackage.aae
        public final void a(aah aahVar) {
            if (aahVar.h == 0) {
                aahVar.h = 80;
            }
        }

        @Override // defpackage.aae
        public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List listH = coordinatorLayout.h(floatingActionButton);
            int size = listH.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) listH.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    if (x(view2) && A(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (z(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.l(floatingActionButton, i);
            Rect rect = floatingActionButton.c;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            aah aahVar = (aah) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - aahVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= aahVar.leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - aahVar.bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= aahVar.topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                gl.y(floatingActionButton, i2);
            }
            if (i4 == 0) {
                return true;
            }
            gl.x(floatingActionButton, i4);
            return true;
        }

        @Override // defpackage.aae
        public final /* bridge */ /* synthetic */ void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                z(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else if (x(view2)) {
                A(view2, floatingActionButton);
            }
        }

        @Override // defpackage.aae
        public final /* bridge */ /* synthetic */ boolean r(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }
    }

    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable layerDrawable;
        super(odn.a(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.c = new Rect();
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayA = nzw.a(context2, attributeSet, nzj.b, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.e = obr.c(context2, typedArrayA, 1);
        this.f = obr.w(typedArrayA.getInt(2, -1), null);
        this.g = obr.c(context2, typedArrayA, 12);
        this.i = typedArrayA.getInt(7, -1);
        this.j = typedArrayA.getDimensionPixelSize(6, 0);
        this.h = typedArrayA.getDimensionPixelSize(3, 0);
        float dimension = typedArrayA.getDimension(4, 0.0f);
        float dimension2 = typedArrayA.getDimension(9, 0.0f);
        float dimension3 = typedArrayA.getDimension(11, 0.0f);
        this.b = typedArrayA.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        this.k = typedArrayA.getDimensionPixelSize(10, 0);
        nwm nwmVarA = nwm.a(context2, typedArrayA, 15);
        nwm nwmVarA2 = nwm.a(context2, typedArrayA, 8);
        obz obzVarA = obz.b(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, obz.a).a();
        boolean z = typedArrayA.getBoolean(5, false);
        setEnabled(typedArrayA.getBoolean(0, true));
        typedArrayA.recycle();
        mx mxVar = new mx(this);
        this.m = mxVar;
        mxVar.b(attributeSet, i);
        this.n = new nyn(this);
        j().h(obzVarA);
        nzf nzfVarJ = j();
        ColorStateList colorStateList = this.e;
        PorterDuff.Mode mode = this.f;
        ColorStateList colorStateList2 = this.g;
        int i2 = this.h;
        nzh nzhVar = (nzh) nzfVarJ;
        obz obzVar = nzhVar.h;
        ew.c(obzVar);
        nzhVar.i = new nzg(obzVar);
        nzhVar.i.setTintList(colorStateList);
        if (mode != null) {
            nzhVar.i.setTintMode(mode);
        }
        nzhVar.i.f(nzhVar.x.getContext());
        if (i2 > 0) {
            Context context3 = nzhVar.x.getContext();
            obz obzVar2 = nzhVar.h;
            ew.c(obzVar2);
            nyp nypVar = new nyp(obzVar2);
            int iA = aas.a(context3, R.color.design_fab_stroke_top_outer_color);
            int iA2 = aas.a(context3, R.color.design_fab_stroke_top_inner_color);
            int iA3 = aas.a(context3, R.color.design_fab_stroke_end_inner_color);
            int iA4 = aas.a(context3, R.color.design_fab_stroke_end_outer_color);
            nypVar.c = iA;
            nypVar.d = iA2;
            nypVar.e = iA3;
            nypVar.f = iA4;
            float f = i2;
            if (nypVar.b != f) {
                nypVar.b = f;
                nypVar.a.setStrokeWidth(f * 1.3333f);
                nypVar.g = true;
                nypVar.invalidateSelf();
            }
            nypVar.b(colorStateList);
            nzhVar.k = nypVar;
            nyp nypVar2 = nzhVar.k;
            ew.c(nypVar2);
            obu obuVar = nzhVar.i;
            ew.c(obuVar);
            layerDrawable = new LayerDrawable(new Drawable[]{nypVar2, obuVar});
            drawable = null;
        } else {
            drawable = null;
            nzhVar.k = null;
            layerDrawable = nzhVar.i;
        }
        nzhVar.j = new RippleDrawable(obm.b(colorStateList2), layerDrawable, drawable);
        nzhVar.l = nzhVar.j;
        j().q = dimensionPixelSize;
        nzf nzfVarJ2 = j();
        if (nzfVarJ2.n != dimension) {
            nzfVarJ2.n = dimension;
            nzfVarJ2.f(dimension, nzfVarJ2.o, nzfVarJ2.p);
        }
        nzf nzfVarJ3 = j();
        if (nzfVarJ3.o != dimension2) {
            nzfVarJ3.o = dimension2;
            nzfVarJ3.f(nzfVarJ3.n, dimension2, nzfVarJ3.p);
        }
        nzf nzfVarJ4 = j();
        if (nzfVarJ4.p != dimension3) {
            nzfVarJ4.p = dimension3;
            nzfVarJ4.f(nzfVarJ4.n, nzfVarJ4.o, dimension3);
        }
        nzf nzfVarJ5 = j();
        int i3 = this.k;
        if (nzfVarJ5.v != i3) {
            nzfVarJ5.v = i3;
            nzfVarJ5.i();
        }
        j().s = nwmVarA;
        j().t = nwmVarA2;
        j().m = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private final int h(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        switch (i) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? h(1) : h(0);
            case 0:
            default:
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            case 1:
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
    }

    private static int i(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
                return Math.min(i, size);
            case 0:
                return i;
            case 1073741824:
                return size;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final nzf j() {
        if (this.o == null) {
            this.o = new nzh(this, new nyv(this));
        }
        return this.o;
    }

    @Override // defpackage.aad
    public final aae a() {
        return new Behavior();
    }

    @Override // defpackage.oci
    public final void b(obz obzVar) {
        j().h(obzVar);
    }

    public final int c() {
        return h(this.i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        j();
        getDrawableState();
    }

    final void e() {
        nzf nzfVarJ = j();
        if (nzfVarJ.x.getVisibility() == 0) {
            if (nzfVarJ.w == 1) {
                return;
            }
        } else if (nzfVarJ.w != 2) {
            return;
        }
        Animator animator = nzfVarJ.r;
        if (animator != null) {
            animator.cancel();
        }
        if (!nzfVarJ.m()) {
            nzfVarJ.x.g(4, false);
            return;
        }
        nwm nwmVar = nzfVarJ.t;
        AnimatorSet animatorSetB = nwmVar != null ? nzfVarJ.b(nwmVar, 0.0f, 0.0f, 0.0f) : nzfVarJ.c(0.0f, 0.4f, 0.4f);
        animatorSetB.addListener(new nyw(nzfVarJ));
        animatorSetB.start();
    }

    final void f() {
        nzf nzfVarJ = j();
        if (nzfVarJ.x.getVisibility() != 0) {
            if (nzfVarJ.w == 2) {
                return;
            }
        } else if (nzfVarJ.w != 1) {
            return;
        }
        Animator animator = nzfVarJ.r;
        if (animator != null) {
            animator.cancel();
        }
        nwm nwmVar = nzfVarJ.s;
        if (!nzfVarJ.m()) {
            nzfVarJ.x.g(0, false);
            nzfVarJ.x.setAlpha(1.0f);
            nzfVarJ.x.setScaleY(1.0f);
            nzfVarJ.x.setScaleX(1.0f);
            nzfVarJ.g(1.0f);
            return;
        }
        if (nzfVarJ.x.getVisibility() != 0) {
            nzfVarJ.x.setAlpha(0.0f);
            FloatingActionButton floatingActionButton = nzfVarJ.x;
            float f = nwmVar == null ? 0.4f : 0.0f;
            floatingActionButton.setScaleY(f);
            nzfVarJ.x.setScaleX(f);
            nzfVarJ.g(f);
        }
        nwm nwmVar2 = nzfVarJ.s;
        AnimatorSet animatorSetB = nwmVar2 != null ? nzfVarJ.b(nwmVar2, 1.0f, 1.0f, 1.0f) : nzfVarJ.c(1.0f, 1.0f, 1.0f);
        animatorSetB.addListener(new nyx(nzfVarJ));
        animatorSetB.start();
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        j();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nzf nzfVarJ = j();
        obu obuVar = nzfVarJ.i;
        if (obuVar != null) {
            obr.n(nzfVarJ.x, obuVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nzf nzfVarJ = j();
        nzfVarJ.x.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = nzfVarJ.y;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iC = c();
        this.a = (iC - this.k) / 2;
        j().j();
        int iMin = Math.min(i(iC, i), i(iC, i2));
        setMeasuredDimension(this.c.left + iMin + this.c.right, iMin + this.c.top + this.c.bottom);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ocn)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ocn ocnVar = (ocn) parcelable;
        super.onRestoreInstanceState(ocnVar.d);
        nyn nynVar = this.n;
        Bundle bundle = (Bundle) ocnVar.a.get("expandableWidgetHelper");
        ew.c(bundle);
        nynVar.b = bundle.getBoolean("expanded", false);
        nynVar.c = bundle.getInt("expandedComponentIdHint", 0);
        if (nynVar.b) {
            ViewParent parent = nynVar.a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).i(nynVar.a);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ocn ocnVar = new ocn(parcelableOnSaveInstanceState);
        xf xfVar = ocnVar.a;
        nyn nynVar = this.n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", nynVar.b);
        bundle.putInt("expandedComponentIdHint", nynVar.c);
        xfVar.put("expandableWidgetHelper", bundle);
        return ocnVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            if (gl.V(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                rect.left += this.c.left;
                rect.top += this.c.top;
                rect.right -= this.c.right;
                rect.bottom -= this.c.bottom;
                if (!this.l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            nzf nzfVarJ = j();
            obu obuVar = nzfVarJ.i;
            if (obuVar != null) {
                obuVar.setTintList(colorStateList);
            }
            nyp nypVar = nzfVarJ.k;
            if (nypVar != null) {
                nypVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            obu obuVar = j().i;
            if (obuVar != null) {
                obuVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        j().k(f);
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            j().i();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.m.c(i);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        j();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        j();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        j();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        j();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        j();
    }
}
