package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.ku;
import defpackage.kv;
import defpackage.kw;
import defpackage.kz;
import defpackage.lj;
import defpackage.lm;
import defpackage.mh;
import defpackage.mi;
import defpackage.mj;
import defpackage.mk;
import defpackage.ml;
import defpackage.pa;
import defpackage.ro;
import defpackage.sd;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements kv, lm {
    public kw a;
    public boolean b;
    public mh c;
    public ku d;
    public ro e;
    private Context i;
    private int j;
    private lj k;
    private boolean l;
    private int m;
    private int n;
    private int o;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s();
        float f = context.getResources().getDisplayMetrics().density;
        this.n = (int) (56.0f * f);
        this.o = (int) (f * 4.0f);
        this.i = context;
        this.j = 0;
    }

    public static final mk m() {
        mk mkVar = new mk();
        mkVar.gravity = 16;
        return mkVar;
    }

    public static final mk n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m();
        }
        mk mkVar = layoutParams instanceof mk ? new mk((mk) layoutParams) : new mk(layoutParams);
        if (mkVar.gravity <= 0) {
            mkVar.gravity = 16;
        }
        return mkVar;
    }

    @Override // defpackage.lm
    public final void a(kw kwVar) {
        this.a = kwVar;
    }

    @Override // defpackage.kv
    public final boolean b(kz kzVar) {
        return this.a.z(kzVar, 0);
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final mk generateLayoutParams(AttributeSet attributeSet) {
        return new mk(getContext(), attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof mk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ pa generateDefaultLayoutParams() {
        return m();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final Menu g() {
        if (this.a == null) {
            Context context = getContext();
            kw kwVar = new kw(context);
            this.a = kwVar;
            kwVar.p(new ml(this));
            mh mhVar = new mh(context);
            this.c = mhVar;
            mhVar.p();
            mh mhVar2 = this.c;
            lj mjVar = this.k;
            if (mjVar == null) {
                mjVar = new mj();
            }
            mhVar2.e = mjVar;
            this.a.h(this.c, this.i);
            this.c.j(this);
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: gC */
    public final /* bridge */ /* synthetic */ pa generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m();
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }

    public final void h() {
        mh mhVar = this.c;
        if (mhVar != null) {
            mhVar.n();
        }
    }

    public final void i(lj ljVar, ku kuVar) {
        this.k = ljVar;
        this.d = kuVar;
    }

    public final void j(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void k(mh mhVar) {
        this.c = mhVar;
        mhVar.j(this);
    }

    protected final boolean l(int i) {
        boolean zC = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof mi)) {
            zC = ((mi) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof mi)) ? zC : ((mi) childAt2).d() | zC;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mh mhVar = this.c;
        if (mhVar != null) {
            mhVar.i();
            if (this.c.l()) {
                this.c.k();
                this.c.m();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.l) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int i6 = this.h;
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean zB = sd.b(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                mk mkVar = (mk) childAt.getLayoutParams();
                if (mkVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i10)) {
                        measuredWidth += i6;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + mkVar.leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - mkVar.rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + mkVar.leftMargin) + mkVar.rightMargin;
                    l(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1) {
            if (i8 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i12 = (i7 / 2) - (measuredWidth2 / 2);
                int i13 = i5 - (measuredHeight2 / 2);
                childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
                return;
            }
            childCount = 1;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                mk mkVar2 = (mk) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !mkVar2.a) {
                    int i16 = width2 - mkVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + mkVar2.leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            mk mkVar3 = (mk) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !mkVar3.a) {
                int i19 = paddingLeft2 + mkVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = i19 + measuredWidth4 + mkVar3.rightMargin + iMax;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v40 */
    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ?? r6;
        int i3;
        kw kwVar;
        boolean z5 = this.l;
        boolean z6 = View.MeasureSpec.getMode(i) == 1073741824;
        this.l = z6;
        if (z5 != z6) {
            this.m = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.l && (kwVar = this.a) != null && size != this.m) {
            this.m = size;
            kwVar.l(true);
        }
        int childCount = getChildCount();
        if (!this.l || childCount <= 0) {
            int i4 = 0;
            while (i4 < childCount) {
                mk mkVar = (mk) getChildAt(i4).getLayoutParams();
                mkVar.rightMargin = 0;
                mkVar.leftMargin = 0;
                i4++;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i5 = size2 - (paddingLeft + paddingRight);
        int i6 = this.n;
        int i7 = i5 / i6;
        int i8 = i5 % i6;
        if (i7 == 0) {
            setMeasuredDimension(i5, 0);
            return;
        }
        int i9 = i6 + (i8 / i7);
        int childCount2 = getChildCount();
        int i10 = 0;
        int iMax = 0;
        int i11 = 0;
        boolean z7 = false;
        long j = 0;
        int iMax2 = 0;
        int i12 = 0;
        while (i11 < childCount2) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                size3 = size3;
            } else {
                boolean z8 = childAt instanceof ActionMenuItemView;
                int i13 = i10 + 1;
                if (z8) {
                    int i14 = this.o;
                    r6 = 0;
                    childAt.setPadding(i14, 0, i14, 0);
                } else {
                    r6 = 0;
                }
                mk mkVar2 = (mk) childAt.getLayoutParams();
                mkVar2.f = r6;
                mkVar2.c = r6;
                mkVar2.b = r6;
                mkVar2.d = r6;
                mkVar2.leftMargin = r6;
                mkVar2.rightMargin = r6;
                mkVar2.e = z8 && ((ActionMenuItemView) childAt).b();
                int i15 = true != mkVar2.a ? i7 : 1;
                mk mkVar3 = (mk) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z8 ? (ActionMenuItemView) childAt : null;
                boolean z9 = actionMenuItemView != null && actionMenuItemView.b();
                if (i15 <= 0 || (z9 && i15 < 2)) {
                    i3 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i9, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i3 = measuredWidth / i9;
                    if (measuredWidth % i9 != 0) {
                        i3++;
                    }
                    if (z9 && i3 < 2) {
                        i3 = 2;
                    }
                }
                mkVar3.d = !mkVar3.a && z9;
                mkVar3.b = i3;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i3 * i9, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i3);
                if (mkVar2.d) {
                    i12++;
                }
                z7 |= mkVar2.a;
                i7 -= i3;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i3 == 1) {
                    j |= (long) (1 << i11);
                }
                i10 = i13;
            }
            i11++;
            size3 = size3;
            paddingTop = paddingTop;
            i5 = i5;
        }
        int i16 = i5;
        int i17 = size3;
        int i18 = iMax2;
        if (z7 && i10 == 2) {
            z = true;
            i10 = 2;
        } else {
            z = false;
        }
        boolean z10 = false;
        while (true) {
            if (i12 <= 0 || i7 <= 0) {
                z2 = z10;
                break;
            }
            int i19 = Integer.MAX_VALUE;
            int i20 = 0;
            int i21 = 0;
            long j2 = 0;
            while (i20 < childCount2) {
                mk mkVar4 = (mk) getChildAt(i20).getLayoutParams();
                boolean z11 = z10;
                if (mkVar4.d) {
                    int i22 = mkVar4.b;
                    if (i22 < i19) {
                        j2 = 1 << i20;
                        i19 = i22;
                        i21 = 1;
                    } else if (i22 == i19) {
                        j2 |= 1 << i20;
                        i21++;
                    }
                }
                i20++;
                z10 = z11;
            }
            z2 = z10;
            j |= j2;
            if (i21 > i7) {
                break;
            }
            int i23 = i19 + 1;
            int i24 = 0;
            while (i24 < childCount2) {
                View childAt2 = getChildAt(i24);
                mk mkVar5 = (mk) childAt2.getLayoutParams();
                int i25 = iMax;
                long j3 = 1 << i24;
                if ((j2 & j3) != 0) {
                    if (z && mkVar5.e && i7 == 1) {
                        int i26 = this.o;
                        childAt2.setPadding(i26 + i9, 0, i26, 0);
                        i7 = 1;
                    }
                    mkVar5.b++;
                    mkVar5.f = true;
                    i7--;
                } else if (mkVar5.b == i23) {
                    j |= j3;
                }
                i24++;
                iMax = i25;
            }
            z10 = true;
        }
        if (z7 || i10 != 1) {
            z3 = false;
        } else {
            z3 = true;
            i10 = 1;
        }
        if (i7 <= 0 || j == 0 || (i7 >= i10 - 1 && !z3 && i18 <= 1)) {
            z4 = z2;
        } else {
            float fBitCount = Long.bitCount(j);
            if (!z3) {
                if ((j & 1) != 0 && !((mk) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i27 = childCount2 - 1;
                if ((j & ((long) (1 << i27))) != 0 && !((mk) getChildAt(i27).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i28 = fBitCount > 0.0f ? (int) ((i7 * i9) / fBitCount) : 0;
            boolean z12 = z2;
            int i29 = 0;
            while (i29 < childCount2) {
                if ((j & ((long) (1 << i29))) != 0) {
                    View childAt3 = getChildAt(i29);
                    mk mkVar6 = (mk) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        mkVar6.c = i28;
                        mkVar6.f = true;
                        if (i29 == 0) {
                            if (!mkVar6.e) {
                                mkVar6.leftMargin = (-i28) / 2;
                            }
                            i29 = 0;
                        }
                        z12 = true;
                    } else if (mkVar6.a) {
                        mkVar6.c = i28;
                        mkVar6.f = true;
                        mkVar6.rightMargin = (-i28) / 2;
                        z12 = true;
                    } else {
                        if (i29 != 0) {
                            mkVar6.leftMargin = i28 / 2;
                        }
                        if (i29 != childCount2 - 1) {
                            mkVar6.rightMargin = i28 / 2;
                        }
                    }
                }
                i29++;
            }
            z4 = z12;
        }
        if (z4) {
            for (int i30 = 0; i30 < childCount2; i30++) {
                View childAt4 = getChildAt(i30);
                mk mkVar7 = (mk) childAt4.getLayoutParams();
                if (mkVar7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((mkVar7.b * i9) + mkVar7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i16, mode != 1073741824 ? iMax : i17);
    }
}
