package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import defpackage.alc;
import defpackage.ald;
import defpackage.alf;
import defpackage.alg;
import defpackage.alh;
import defpackage.ali;
import defpackage.alj;
import defpackage.alk;
import defpackage.all;
import defpackage.alm;
import defpackage.aln;
import defpackage.alp;
import defpackage.als;
import defpackage.alt;
import defpackage.alu;
import defpackage.alv;
import defpackage.alw;
import defpackage.fx;
import defpackage.gb;
import defpackage.gd;
import defpackage.gl;
import defpackage.gr;
import defpackage.gy;
import defpackage.ps;
import defpackage.pu;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    static boolean a = true;
    private static final gy l = fx.l(new gr((byte[]) null));
    public alf b;
    public int c;
    public boolean d;
    LinearLayoutManager e;
    public RecyclerView f;
    public alj g;
    public boolean h;
    public int i;
    public gd j;
    public gb k;
    private final Rect m;
    private final Rect n;
    private int o;
    private Parcelable p;
    private ps q;
    private alf r;
    private alg s;
    private alh t;

    public ViewPager2(Context context) {
        super(context);
        this.m = new Rect();
        this.n = new Rect();
        this.b = new alf();
        this.d = false;
        this.j = new alk(this);
        this.o = -1;
        this.h = true;
        this.i = -1;
        i(context, null);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new Rect();
        this.n = new Rect();
        this.b = new alf();
        this.d = false;
        this.j = new alk(this);
        this.o = -1;
        this.h = true;
        this.i = -1;
        i(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new Rect();
        this.n = new Rect();
        this.b = new alf();
        this.d = false;
        this.j = new alk(this);
        this.o = -1;
        this.h = true;
        this.i = -1;
        i(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.m = new Rect();
        this.n = new Rect();
        this.b = new alf();
        this.d = false;
        this.j = new alk(this);
        this.o = -1;
        this.h = true;
        this.i = -1;
        i(context, attributeSet);
    }

    private final void i(Context context, AttributeSet attributeSet) {
        this.k = a ? new als(this) : new aln(this);
        alu aluVar = new alu(this, context);
        this.f = aluVar;
        aluVar.setId(gl.c());
        this.f.setDescendantFocusability(131072);
        alp alpVar = new alp(this);
        this.e = alpVar;
        this.f.V(alpVar);
        RecyclerView recyclerView = this.f;
        recyclerView.F = ViewConfiguration.get(recyclerView.getContext()).getScaledPagingTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alc.a);
        gl.E(this, context, alc.a, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            this.e.S(typedArrayObtainStyledAttributes.getInt(0, 0));
            this.k.p();
            typedArrayObtainStyledAttributes.recycle();
            this.f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            RecyclerView recyclerView2 = this.f;
            gb gbVar = new gb();
            if (recyclerView2.x == null) {
                recyclerView2.x = new ArrayList();
            }
            recyclerView2.x.add(gbVar);
            this.g = new alj(this);
            this.s = new alg(this.g);
            alt altVar = new alt(this);
            this.q = altVar;
            RecyclerView recyclerView3 = this.f;
            RecyclerView recyclerView4 = altVar.a;
            if (recyclerView4 != recyclerView3) {
                if (recyclerView4 != null) {
                    recyclerView4.ao(altVar.b);
                    altVar.a.G = null;
                }
                altVar.a = recyclerView3;
                RecyclerView recyclerView5 = altVar.a;
                if (recyclerView5 != null) {
                    if (recyclerView5.G != null) {
                        throw new IllegalStateException("An instance of OnFlingListener already set.");
                    }
                    recyclerView5.an(altVar.b);
                    RecyclerView recyclerView6 = altVar.a;
                    recyclerView6.G = altVar;
                    new Scroller(recyclerView6.getContext(), new DecelerateInterpolator());
                    altVar.f();
                }
            }
            this.f.an(this.g);
            alf alfVar = new alf();
            this.r = alfVar;
            this.g.f = alfVar;
            all allVar = new all(this);
            alm almVar = new alm(this);
            this.r.s(allVar);
            this.r.s(almVar);
            this.k.v(this.f);
            this.r.s(this.b);
            alh alhVar = new alh();
            this.t = alhVar;
            this.r.s(alhVar);
            RecyclerView recyclerView7 = this.f;
            attachViewToParent(recyclerView7, 0, recyclerView7.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int a() {
        return this.e.i;
    }

    public final pu b() {
        return this.f.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        pu puVarB;
        if (this.o == -1 || (puVarB = b()) == 0) {
            return;
        }
        if (this.p != null) {
            if (puVarB instanceof ald) {
                ((ald) puVarB).b();
            }
            this.p = null;
        }
        int iMax = Math.max(0, Math.min(this.o, puVarB.a() - 1));
        this.c = iMax;
        this.o = -1;
        this.f.S(iMax);
        this.k.l();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f.canScrollVertically(i);
    }

    public final void d(int i, boolean z) {
        h();
        e(i, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof alv) {
            int i = ((alv) parcelable).a;
            sparseArray.put(this.f.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        c();
    }

    public final void e(int i, boolean z) {
        pu puVarB = b();
        if (puVarB == null) {
            if (this.o != -1) {
                this.o = Math.max(i, 0);
                return;
            }
            return;
        }
        if (puVarB.a() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), puVarB.a() - 1);
        if (iMin == this.c && this.g.k()) {
            return;
        }
        int i2 = this.c;
        if (iMin == i2 && z) {
            return;
        }
        double d = i2;
        this.c = iMin;
        this.k.o();
        if (!this.g.k()) {
            alj aljVar = this.g;
            aljVar.j();
            ali aliVar = aljVar.c;
            double d2 = aliVar.a;
            double d3 = aliVar.b;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = d2 + d3;
        }
        alj aljVar2 = this.g;
        aljVar2.a = true != z ? 3 : 2;
        int i3 = aljVar2.d;
        aljVar2.d = iMin;
        aljVar2.i(2);
        if (i3 != iMin) {
            aljVar2.h(iMin);
        }
        if (!z) {
            this.f.S(iMin);
            return;
        }
        double d4 = iMin;
        Double.isNaN(d4);
        if (Math.abs(d4 - d) <= 3.0d) {
            this.f.Y(iMin);
            return;
        }
        this.f.S(d4 > d ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f;
        recyclerView.post(new alw(iMin, recyclerView));
    }

    public final void f() {
        ps psVar = this.q;
        if (psVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewC = psVar.c(this.e);
        if (viewC == null) {
            return;
        }
        int iBe = LinearLayoutManager.be(viewC);
        if (iBe != this.c && this.g.b == 0) {
            this.r.r(iBe);
        }
        this.d = false;
    }

    public final boolean g() {
        return this.e.al() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return this.k.r() ? this.k.f() : super.getAccessibilityClassName();
    }

    public final void h() {
        alj aljVar = this.s.a;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        if (windowInsetsOnApplyWindowInsets.isConsumed()) {
            return windowInsetsOnApplyWindowInsets;
        }
        int childCount = this.f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.f.getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsetsOnApplyWindowInsets));
        }
        gy gyVar = l;
        return gyVar.n() != null ? gyVar.n() : windowInsets.consumeSystemWindowInsets().consumeStableInsets();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.k.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f.getMeasuredWidth();
        int measuredHeight = this.f.getMeasuredHeight();
        this.m.left = getPaddingLeft();
        this.m.right = (i3 - i) - getPaddingRight();
        this.m.top = getPaddingTop();
        this.m.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.m, this.n);
        this.f.layout(this.n.left, this.n.top, this.n.right, this.n.bottom);
        if (this.d) {
            f();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.f, i, i2);
        int measuredWidth = this.f.getMeasuredWidth();
        int measuredHeight = this.f.getMeasuredHeight();
        int measuredState = this.f.getMeasuredState();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(measuredWidth + paddingLeft + paddingRight, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(measuredHeight + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof alv)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        alv alvVar = (alv) parcelable;
        super.onRestoreInstanceState(alvVar.getSuperState());
        this.o = alvVar.b;
        this.p = alvVar.c;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        alv alvVar = new alv(super.onSaveInstanceState());
        alvVar.a = this.f.getId();
        int i = this.o;
        if (i == -1) {
            i = this.c;
        }
        alvVar.b = i;
        Parcelable parcelable = this.p;
        if (parcelable != null) {
            alvVar.c = parcelable;
        } else {
            Object obj = this.f.l;
            if (obj instanceof ald) {
                alvVar.c = ((ald) obj).a();
            }
        }
        return alvVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(getClass().getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!this.k.u(i)) {
            return super.performAccessibilityAction(i, bundle);
        }
        this.k.x(i);
        return true;
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.k.n();
    }
}
