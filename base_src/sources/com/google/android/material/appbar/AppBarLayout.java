package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.aad;
import defpackage.aae;
import defpackage.aah;
import defpackage.aao;
import defpackage.fp;
import defpackage.gl;
import defpackage.gy;
import defpackage.ha;
import defpackage.nwj;
import defpackage.nwo;
import defpackage.nwp;
import defpackage.nwq;
import defpackage.nwr;
import defpackage.nws;
import defpackage.nwt;
import defpackage.nwu;
import defpackage.nwv;
import defpackage.nwz;
import defpackage.nxa;
import defpackage.nxc;
import defpackage.nxd;
import defpackage.nxe;
import defpackage.nxg;
import defpackage.nxh;
import defpackage.nzn;
import defpackage.nzw;
import defpackage.obr;
import defpackage.obu;
import defpackage.odn;
import defpackage.ohh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements aad {
    public boolean a;
    public int b;
    public gy c;
    public List d;
    public boolean e;
    public final List f;
    public Drawable g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private WeakReference o;
    private ValueAnimator p;
    private int[] q;

    /* JADX INFO: loaded from: classes.dex */
    public class BaseBehavior extends nxc {
        public int a;
        public ohh b;
        private int d;
        private ValueAnimator e;
        private nwt f;
        private WeakReference g;

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private final void I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int iZ = z();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                nwv nwvVar = (nwv) childAt.getLayoutParams();
                if (K(nwvVar.a, 32)) {
                    top -= nwvVar.topMargin;
                    bottom += nwvVar.bottomMargin;
                }
                int i2 = -iZ;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                nwv nwvVar2 = (nwv) childAt2.getLayoutParams();
                int i3 = nwvVar2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int iG = -childAt2.getBottom();
                    if (i == appBarLayout.getChildCount() - 1) {
                        iG += appBarLayout.e();
                    }
                    if (K(i3, 2)) {
                        iG += gl.g(childAt2);
                    } else if (K(i3, 5)) {
                        int iG2 = gl.g(childAt2) + iG;
                        if (iZ >= iG2) {
                            iG = iG2;
                        } else {
                            i4 = iG2;
                        }
                    }
                    if (K(i3, 32)) {
                        i4 += nwvVar2.topMargin;
                        iG -= nwvVar2.bottomMargin;
                    }
                    if (iZ < (iG + i4) / 2) {
                        i4 = iG;
                    }
                    L(coordinatorLayout, appBarLayout, aao.d(i4, -appBarLayout.f(), 0));
                }
            }
        }

        private final void J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            gl.C(coordinatorLayout, ha.b.a());
            gl.C(coordinatorLayout, ha.c.a());
            View viewM = M(coordinatorLayout);
            if (viewM == null || appBarLayout.f() == 0 || !(((aah) viewM.getLayoutParams()).a instanceof ScrollingViewBehavior)) {
                return;
            }
            if (z() != (-appBarLayout.f()) && viewM.canScrollVertically(1)) {
                N(coordinatorLayout, appBarLayout, ha.b, false);
            }
            if (z() != 0) {
                if (!viewM.canScrollVertically(-1)) {
                    N(coordinatorLayout, appBarLayout, ha.c, true);
                    return;
                }
                int i = -appBarLayout.b();
                if (i != 0) {
                    gl.ab(coordinatorLayout, ha.c, new nwr(this, coordinatorLayout, appBarLayout, viewM, i));
                }
            }
        }

        private static boolean K(int i, int i2) {
            return (i & i2) == i2;
        }

        private final void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(z() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iZ = z();
            if (iZ == i) {
                ValueAnimator valueAnimator = this.e;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.e.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.e;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.e = valueAnimator3;
                valueAnimator3.setInterpolator(nwj.e);
                this.e.addUpdateListener(new nwq(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.e.setDuration(Math.min(iRound, 250));
            this.e.setIntValues(iZ, i);
            this.e.start();
        }

        private static final View M(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof fp) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static final void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ha haVar, boolean z) {
            gl.ab(coordinatorLayout, haVar, new nws(appBarLayout, z));
        }

        /* JADX WARN: Code duplicated, block: B:29:0x005d  */
        private static final void O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            boolean zL = true;
            if (childAt != null) {
                int i4 = ((nwv) childAt.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    int iG = gl.g(childAt);
                    if (i2 <= 0 || (i4 & 12) == 0) {
                        if ((i4 & 2) == 0 || (-i) < (childAt.getBottom() - iG) - appBarLayout.e()) {
                            zL = false;
                        }
                    } else if ((-i) < (childAt.getBottom() - iG) - appBarLayout.e()) {
                        zL = false;
                    }
                } else {
                    zL = false;
                }
            } else {
                zL = false;
            }
            if (appBarLayout.e) {
                zL = appBarLayout.l(M(coordinatorLayout));
            }
            boolean zK = appBarLayout.k(zL);
            if (!z) {
                if (zK) {
                    ArrayList arrayListA = coordinatorLayout.e.a(appBarLayout);
                    List arrayList = arrayListA != null ? new ArrayList(arrayListA) : null;
                    if (arrayList == null) {
                        arrayList = Collections.emptyList();
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        aae aaeVar = ((aah) ((View) arrayList.get(i5)).getLayoutParams()).a;
                        if (aaeVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) aaeVar).d == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        @Override // defpackage.nxc
        public final /* bridge */ /* synthetic */ int A(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int iSignum;
            int iE;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iZ = z();
            int i4 = 0;
            if (i2 == 0 || iZ < i2 || iZ > i3) {
                this.a = 0;
            } else {
                int iD = aao.d(i, i2, i3);
                if (iZ != iD) {
                    if (!appBarLayout.a) {
                        iSignum = iD;
                        break;
                    }
                    int iAbs = Math.abs(iD);
                    int childCount = appBarLayout.getChildCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 < childCount) {
                            View childAt = appBarLayout.getChildAt(i5);
                            nwv nwvVar = (nwv) childAt.getLayoutParams();
                            Interpolator interpolator = nwvVar.c;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i5++;
                            } else if (interpolator != null) {
                                int i6 = nwvVar.a;
                                if ((i6 & 1) != 0) {
                                    iE = childAt.getHeight() + nwvVar.topMargin + nwvVar.bottomMargin;
                                    if ((i6 & 2) != 0) {
                                        iE -= gl.g(childAt);
                                    }
                                } else {
                                    iE = 0;
                                }
                                if (gl.R(childAt)) {
                                    iE -= appBarLayout.e();
                                }
                                if (iE > 0) {
                                    float f = iE;
                                    iSignum = Integer.signum(iD) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((iAbs - childAt.getTop()) / f)));
                                    break;
                                }
                            }
                        }
                        iSignum = iD;
                        break;
                    }
                    boolean zH = H(iSignum);
                    int i7 = iZ - iD;
                    this.a = iD - iSignum;
                    if (zH) {
                        for (int i8 = 0; i8 < appBarLayout.getChildCount(); i8++) {
                            nwv nwvVar2 = (nwv) appBarLayout.getChildAt(i8).getLayoutParams();
                            nwu nwuVar = nwvVar2.b;
                            if (nwuVar != null && (nwvVar2.a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i8);
                                int iG = G();
                                Rect rect = nwuVar.a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.e());
                                float fAbs = nwuVar.a.top - Math.abs(iG);
                                if (fAbs <= 0.0f) {
                                    float fE = 1.0f - aao.e(Math.abs(fAbs / nwuVar.a.height()));
                                    float fHeight = (-fAbs) - ((nwuVar.a.height() * 0.3f) * (1.0f - (fE * fE)));
                                    childAt2.setTranslationY(fHeight);
                                    childAt2.getDrawingRect(nwuVar.b);
                                    nwuVar.b.offset(0, (int) (-fHeight));
                                    gl.J(childAt2, nwuVar.b);
                                } else {
                                    gl.J(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    } else if (appBarLayout.a) {
                        coordinatorLayout.i(appBarLayout);
                    }
                    appBarLayout.h(G());
                    O(coordinatorLayout, appBarLayout, iD, iD < iZ ? -1 : 1, false);
                    i4 = i7;
                }
            }
            J(coordinatorLayout, appBarLayout);
            return i4;
        }

        @Override // defpackage.nxc
        public final /* bridge */ /* synthetic */ void B(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            I(coordinatorLayout, appBarLayout);
            if (appBarLayout.e) {
                appBarLayout.k(appBarLayout.l(M(coordinatorLayout)));
            }
        }

        @Override // defpackage.nxc
        public final /* bridge */ /* synthetic */ boolean C(View view) {
            if (this.b != null) {
                return false;
            }
            WeakReference weakReference = this.g;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int iB;
            if (i != 0) {
                if (i < 0) {
                    int i3 = -appBarLayout.f();
                    i2 = i3;
                    iB = appBarLayout.b() + i3;
                } else {
                    i2 = -appBarLayout.f();
                    iB = 0;
                }
                if (i2 != iB) {
                    iArr[1] = E(coordinatorLayout, appBarLayout, i, i2, iB);
                }
            }
            if (appBarLayout.e) {
                appBarLayout.k(appBarLayout.l(view));
            }
        }

        @Override // defpackage.aae
        public final /* bridge */ /* synthetic */ void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.d == 0 || i == 1) {
                I(coordinatorLayout, appBarLayout);
                if (appBarLayout.e) {
                    appBarLayout.k(appBarLayout.l(view2));
                }
            }
            this.g = new WeakReference(view2);
        }

        @Override // defpackage.nxf, defpackage.aae
        public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.e(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.b;
            nwt nwtVar = this.f;
            if (nwtVar == null || (i2 & 8) != 0) {
                if (i2 != 0) {
                    int i3 = i2 & 4;
                    if ((i2 & 2) != 0) {
                        int i4 = -appBarLayout.f();
                        if (i3 != 0) {
                            L(coordinatorLayout, appBarLayout, i4);
                        } else {
                            F(coordinatorLayout, appBarLayout, i4);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (i3 != 0) {
                            L(coordinatorLayout, appBarLayout, 0);
                        } else {
                            F(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (nwtVar.a) {
                F(coordinatorLayout, appBarLayout, -appBarLayout.f());
            } else {
                View childAt = appBarLayout.getChildAt(nwtVar.b);
                int i5 = -childAt.getBottom();
                F(coordinatorLayout, appBarLayout, this.f.f ? i5 + gl.g(childAt) + appBarLayout.e() : i5 + Math.round(childAt.getHeight() * this.f.e));
            }
            appBarLayout.b = 0;
            this.f = null;
            H(aao.d(G(), -appBarLayout.f(), 0));
            O(coordinatorLayout, appBarLayout, G(), 0, true);
            appBarLayout.h(G());
            J(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // defpackage.aae
        public final /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((aah) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.o(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.aae
        public final /* bridge */ /* synthetic */ void m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
            D(coordinatorLayout, (AppBarLayout) view, view2, i, iArr);
        }

        @Override // defpackage.aae
        public final /* bridge */ /* synthetic */ void n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                iArr[1] = E(coordinatorLayout, appBarLayout, i3, -appBarLayout.c(), 0);
            }
            if (i3 == 0) {
                J(coordinatorLayout, appBarLayout);
            }
        }

        @Override // defpackage.aae
        public final /* bridge */ /* synthetic */ void o(View view, Parcelable parcelable) {
            if (!(parcelable instanceof nwt)) {
                this.f = null;
                return;
            }
            nwt nwtVar = (nwt) parcelable;
            this.f = nwtVar;
            Parcelable parcelable2 = nwtVar.d;
        }

        @Override // defpackage.aae
        public final /* bridge */ /* synthetic */ Parcelable p(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int iG = G();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iG;
                if (childAt.getTop() + iG <= 0 && bottom >= 0) {
                    nwt nwtVar = new nwt(absSavedState);
                    nwtVar.a = (-G()) >= appBarLayout.f();
                    nwtVar.b = i;
                    nwtVar.f = bottom == gl.g(childAt) + appBarLayout.e();
                    nwtVar.e = bottom / childAt.getHeight();
                    return nwtVar;
                }
            }
            return absSavedState;
        }

        @Override // defpackage.aae
        public final /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = true;
            if ((i & 2) == 0 || (!appBarLayout.e && (appBarLayout.f() == 0 || coordinatorLayout.getHeight() - view2.getHeight() > appBarLayout.getHeight()))) {
                z = false;
            }
            if (z && (valueAnimator = this.e) != null) {
                valueAnimator.cancel();
            }
            this.g = null;
            this.d = i2;
            return z;
        }

        @Override // defpackage.nxc
        public final /* bridge */ /* synthetic */ int x(View view) {
            return -((AppBarLayout) view).c();
        }

        @Override // defpackage.nxc
        public final /* synthetic */ int y(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.nxc
        public final int z() {
            return G() + this.a;
        }
    }

    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class ScrollingViewBehavior extends nxd {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nxe.e);
            this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        static final AppBarLayout A(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.nxf, defpackage.aae
        public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.e(coordinatorLayout, view, i);
            return true;
        }

        @Override // defpackage.aae
        public final boolean f(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutA = A(coordinatorLayout.h(view));
            if (appBarLayoutA != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutA.i(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.aae
        public final boolean h(View view) {
            return view instanceof AppBarLayout;
        }

        @Override // defpackage.aae
        public final void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            aae aaeVar = ((aah) view2.getLayoutParams()).a;
            if (aaeVar instanceof BaseBehavior) {
                gl.y(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) aaeVar).a) + this.c) - B(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.e) {
                    appBarLayout.k(appBarLayout.l(view));
                }
            }
        }

        @Override // defpackage.aae
        public final void j(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                gl.C(coordinatorLayout, ha.b.a());
                gl.C(coordinatorLayout, ha.c.a());
            }
        }

        @Override // defpackage.aae
        public final /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            gy gyVar;
            int i4 = view.getLayoutParams().height;
            if (i4 != -1) {
                if (i4 != -2) {
                    return false;
                }
                i4 = -2;
            }
            View viewZ = z(coordinatorLayout.h(view));
            if (viewZ == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (gl.R(viewZ) && (gyVar = coordinatorLayout.f) != null) {
                size += gyVar.d() + gyVar.a();
            }
            coordinatorLayout.o(view, i, i2, View.MeasureSpec.makeMeasureSpec((size + y(viewZ)) - viewZ.getMeasuredHeight(), i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
            return true;
        }

        @Override // defpackage.nxd
        public final float x(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int iF = appBarLayout.f();
                int iB = appBarLayout.b();
                aae aaeVar = ((aah) appBarLayout.getLayoutParams()).a;
                int iZ = aaeVar instanceof BaseBehavior ? ((BaseBehavior) aaeVar).z() : 0;
                if ((iB == 0 || iF + iZ > iB) && (i = iF - iB) != 0) {
                    return (iZ / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // defpackage.nxd
        public final int y(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.nxd
        public final /* bridge */ /* synthetic */ View z(List list) {
            return A(list);
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(odn.a(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.b = 0;
        this.f = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            int[] iArr = nxh.a;
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        int[] iArr2 = nxh.a;
        Context context3 = getContext();
        TypedArray typedArrayA = nzw.a(context3, attributeSet, nxh.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayA.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayA.getResourceId(0, 0)));
            }
            typedArrayA.recycle();
            TypedArray typedArrayA2 = nzw.a(context2, attributeSet, nxe.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            gl.G(this, typedArrayA2.getDrawable(0));
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                obu obuVar = new obu();
                obuVar.h(ColorStateList.valueOf(colorDrawable.getColor()));
                obuVar.f(context2);
                gl.G(this, obuVar);
            }
            if (typedArrayA2.hasValue(4)) {
                p(typedArrayA2.getBoolean(4, false), false, false);
            }
            if (typedArrayA2.hasValue(3)) {
                int dimensionPixelSize = typedArrayA2.getDimensionPixelSize(3, 0);
                int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
                StateListAnimator stateListAnimator = new StateListAnimator();
                long j = integer;
                stateListAnimator.addState(new int[]{android.R.attr.state_enabled, R.attr.state_liftable, -2130969724}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j));
                stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, ObjectAnimator.ofFloat(this, "elevation", dimensionPixelSize).setDuration(j));
                stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
                setStateListAnimator(stateListAnimator);
            }
            if (typedArrayA2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayA2.getBoolean(2, false));
            }
            if (typedArrayA2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayA2.getBoolean(1, false));
            }
            this.e = typedArrayA2.getBoolean(5, false);
            this.n = typedArrayA2.getResourceId(6, -1);
            Drawable drawable = typedArrayA2.getDrawable(7);
            Drawable drawable2 = this.g;
            if (drawable2 != drawable) {
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
                this.g = drawableMutate;
                if (drawableMutate != null) {
                    if (drawableMutate.isStateful()) {
                        this.g.setState(getDrawableState());
                    }
                    this.g.setLayoutDirection(gl.f(this));
                    this.g.setVisible(getVisibility() == 0, false);
                    this.g.setCallback(this);
                }
                j();
                gl.z(this);
            }
            typedArrayA2.recycle();
            gl.N(this, new nwo(this));
        } catch (Throwable th) {
            typedArrayA.recycle();
            throw th;
        }
    }

    protected static final nwv m() {
        return new nwv();
    }

    protected static final nwv n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new nwv((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new nwv((ViewGroup.MarginLayoutParams) layoutParams) : new nwv(layoutParams);
    }

    private final void o() {
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    private final void p(boolean z, boolean z2, boolean z3) {
        this.b = (true != z ? 2 : 1) | (true != z2 ? 0 : 4) | (true == z3 ? 8 : 0);
        requestLayout();
    }

    private final boolean q() {
        return this.g != null && e() > 0;
    }

    private final boolean r() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !gl.R(childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aad
    public final aae a() {
        return new Behavior();
    }

    final int b() {
        int i = this.j;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            nwv nwvVar = (nwv) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = nwvVar.a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int i4 = nwvVar.topMargin + nwvVar.bottomMargin;
                int iG = (i3 & 8) != 0 ? i4 + gl.g(childAt) : (i3 & 2) != 0 ? i4 + (measuredHeight - gl.g(childAt)) : i4 + measuredHeight;
                if (childCount == 0 && gl.R(childAt)) {
                    iG = Math.min(iG, measuredHeight - e());
                }
                i2 += iG;
            }
        }
        int iMax = Math.max(0, i2);
        this.j = iMax;
        return iMax;
    }

    final int c() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int iG = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            nwv nwvVar = (nwv) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + nwvVar.topMargin + nwvVar.bottomMargin;
            int i3 = nwvVar.a;
            if ((i3 & 1) == 0) {
                break;
            }
            iG += measuredHeight;
            if ((i3 & 2) != 0) {
                iG -= gl.g(childAt);
                break;
            }
        }
        int iMax = Math.max(0, iG);
        this.k = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof nwv;
    }

    public final int d() {
        int iE = e();
        int iG = gl.g(this);
        if (iG != 0) {
            return iG + iG + iE;
        }
        int childCount = getChildCount();
        int iG2 = childCount > 0 ? gl.g(getChildAt(childCount - 1)) : 0;
        return iG2 != 0 ? iG2 + iG2 + iE : getHeight() / 3;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (q()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.h);
            this.g.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.g;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    final int e() {
        gy gyVar = this.c;
        if (gyVar != null) {
            return gyVar.d();
        }
        return 0;
    }

    public final int f() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int iG = 0;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            nwv nwvVar = (nwv) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = nwvVar.a;
            if ((i3 & 1) == 0) {
                break;
            }
            iG += measuredHeight + nwvVar.topMargin + nwvVar.bottomMargin;
            if (i2 == 0) {
                if (gl.R(childAt)) {
                    iG -= e();
                    i2 = 0;
                } else {
                    i2 = 0;
                }
            }
            if ((i3 & 2) != 0) {
                iG -= gl.g(childAt);
                break;
            }
            i2++;
        }
        int iMax = Math.max(0, iG);
        this.i = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final nwv generateLayoutParams(AttributeSet attributeSet) {
        return new nwv(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return m();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }

    final void h(int i) {
        this.h = i;
        if (!willNotDraw()) {
            gl.z(this);
        }
        List list = this.d;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                nxa nxaVar = (nxa) this.d.get(i2);
                if (nxaVar != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = nxaVar.a;
                    collapsingToolbarLayout.d = i;
                    gy gyVar = collapsingToolbarLayout.e;
                    int iD = gyVar != null ? gyVar.d() : 0;
                    int childCount = nxaVar.a.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = nxaVar.a.getChildAt(i3);
                        nwz nwzVar = (nwz) childAt.getLayoutParams();
                        nxg nxgVarC = CollapsingToolbarLayout.c(childAt);
                        switch (nwzVar.a) {
                            case 1:
                                nxgVarC.c(aao.d(-i, 0, nxaVar.a.a(childAt)));
                                break;
                            case 2:
                                nxgVarC.c(Math.round((-i) * nwzVar.b));
                                break;
                        }
                    }
                    nxaVar.a.g();
                    CollapsingToolbarLayout collapsingToolbarLayout2 = nxaVar.a;
                    if (collapsingToolbarLayout2.c != null && iD > 0) {
                        gl.z(collapsingToolbarLayout2);
                    }
                    int height = nxaVar.a.getHeight();
                    int iG = (height - gl.g(nxaVar.a)) - iD;
                    int iB = nxaVar.a.b();
                    nzn nznVar = nxaVar.a.a;
                    float f = iG;
                    nznVar.c = Math.min(1.0f, (height - iB) / f);
                    nznVar.d = nznVar.a();
                    CollapsingToolbarLayout collapsingToolbarLayout3 = nxaVar.a;
                    nzn nznVar2 = collapsingToolbarLayout3.a;
                    nznVar2.e = collapsingToolbarLayout3.d + iG;
                    float fE = aao.e(Math.abs(i) / f);
                    if (fE != nznVar2.a) {
                        nznVar2.a = fE;
                        nznVar2.c();
                    }
                }
            }
        }
    }

    public final void i(boolean z, boolean z2) {
        p(z, z2, true);
    }

    public final void j() {
        setWillNotDraw(!q());
    }

    final boolean k(boolean z) {
        if (this.m == z) {
            return false;
        }
        this.m = z;
        refreshDrawableState();
        if (this.e && (getBackground() instanceof obu)) {
            obu obuVar = (obu) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f = true != z ? dimension : 0.0f;
            if (true != z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, dimension);
            this.p = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.p.setInterpolator(nwj.a);
            this.p.addUpdateListener(new nwp(this, obuVar));
            this.p.start();
        }
        return true;
    }

    final boolean l(View view) {
        int i;
        if (this.o == null && (i = this.n) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.n);
            }
            if (viewFindViewById != null) {
                this.o = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.o;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        obr.m(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        boolean z;
        if (this.q == null) {
            this.q = new int[4];
        }
        int[] iArr = this.q;
        int length = iArr.length;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z2 = this.l;
        boolean z3 = false;
        iArr[0] = true != z2 ? -2130969723 : R.attr.state_liftable;
        int i2 = -2130969724;
        if (!z2) {
            z = false;
            z3 = true;
        } else if (this.m) {
            i2 = R.attr.state_lifted;
            z = true;
        } else {
            z = true;
        }
        iArr[1] = i2;
        iArr[2] = true != z3 ? R.attr.state_collapsible : -2130969721;
        int i3 = -2130969720;
        if (z && this.m) {
            i3 = R.attr.state_collapsed;
        }
        iArr[3] = i3;
        return mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (gl.R(this) && r()) {
            int iE = e();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                gl.y(getChildAt(childCount), iE);
            }
        }
        o();
        boolean z2 = false;
        this.a = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((nwv) getChildAt(i5).getLayoutParams()).c != null) {
                this.a = true;
                break;
            }
        }
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), e());
        }
        if (!this.e) {
            int childCount3 = getChildCount();
            for (int i6 = 0; i6 < childCount3; i6++) {
                int i7 = ((nwv) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = true;
        }
        if (this.l != z2) {
            this.l = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && gl.R(this) && r()) {
            int measuredHeight = getMeasuredHeight();
            switch (mode) {
                case Integer.MIN_VALUE:
                    measuredHeight = aao.d(getMeasuredHeight() + e(), 0, View.MeasureSpec.getSize(i2));
                    break;
                case 0:
                    measuredHeight += e();
                    break;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        o();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        obr.l(this, f);
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.g;
    }
}
