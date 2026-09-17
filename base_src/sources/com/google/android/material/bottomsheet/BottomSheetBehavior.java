package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.aae;
import defpackage.aah;
import defpackage.aca;
import defpackage.acb;
import defpackage.gl;
import defpackage.ha;
import defpackage.hj;
import defpackage.nxm;
import defpackage.nxn;
import defpackage.nxo;
import defpackage.nxp;
import defpackage.nxq;
import defpackage.nxr;
import defpackage.nxt;
import defpackage.nxu;
import defpackage.nyb;
import defpackage.nzx;
import defpackage.nzy;
import defpackage.nzz;
import defpackage.obr;
import defpackage.obu;
import defpackage.obz;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior extends aae {
    public boolean A;
    private int B;
    private float C;
    private boolean D;
    private int E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private boolean K;
    private obz L;
    private boolean M;
    private nxu N;
    private ValueAnimator O;
    private boolean P;
    private int Q;
    private boolean R;
    private int S;
    private VelocityTracker T;
    private int U;
    private Map V;
    private int W;
    private final aca X;
    public boolean a;
    public int b;
    public obu c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    int j;
    public int k;
    public int l;
    float m;
    public int n;
    float o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public acb t;
    int u;
    public int v;
    public WeakReference w;
    public WeakReference x;
    public final ArrayList y;
    public int z;

    public BottomSheetBehavior() {
        this.B = 0;
        this.a = true;
        this.H = -1;
        this.I = -1;
        this.N = null;
        this.m = 0.5f;
        this.o = -1.0f;
        this.r = true;
        this.s = 4;
        this.y = new ArrayList();
        this.W = -1;
        this.X = new nxp(this);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = 0;
        this.a = true;
        this.H = -1;
        this.I = -1;
        this.N = null;
        this.m = 0.5f;
        this.o = -1.0f;
        this.r = true;
        this.s = 4;
        this.y = new ArrayList();
        this.W = -1;
        this.X = new nxp(this);
        this.F = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nyb.a);
        this.G = typedArrayObtainStyledAttributes.hasValue(17);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            P(context, attributeSet, true, obr.c(context, typedArrayObtainStyledAttributes, 3));
        } else {
            P(context, attributeSet, false, null);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.O = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(250L);
        this.O.addUpdateListener(new nxn(this));
        this.o = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue == null || typedValuePeekValue.data != -1) {
            E(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            E(typedValuePeekValue.data);
        }
        D(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.a != z) {
            this.a = z;
            if (this.w != null) {
                N();
            }
            G((this.a && this.s == 6) ? 3 : this.s);
            S();
        }
        this.q = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.r = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.B = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.m = f;
        if (this.w != null) {
            O();
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            C(typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0));
        } else {
            C(typedValuePeekValue2.data);
        }
        this.e = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.f = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.g = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(16, true);
        typedArrayObtainStyledAttributes.recycle();
        this.C = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private final int L() {
        int i;
        if (this.D) {
            return Math.min(Math.max(this.E, this.v - ((this.u * 9) / 16)), this.S) + this.h;
        }
        return (this.J || this.e || (i = this.d) <= 0) ? this.b + this.h : Math.max(this.b, i + this.F);
    }

    private final hj M(int i) {
        return new nxq(this, i);
    }

    private final void N() {
        int iL = L();
        if (this.a) {
            this.n = Math.max(this.v - iL, this.k);
        } else {
            this.n = this.v - iL;
        }
    }

    private final void O() {
        this.l = (int) (this.v * (1.0f - this.m));
    }

    private final void P(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.G) {
            this.L = obz.a(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
            obu obuVar = new obu(this.L);
            this.c = obuVar;
            obuVar.f(context);
            if (z && colorStateList != null) {
                this.c.h(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.c.setTint(typedValue.data);
        }
    }

    private final void Q(View view, ha haVar, int i) {
        gl.ab(view, haVar, M(i));
    }

    private final void R() {
        this.z = -1;
        VelocityTracker velocityTracker = this.T;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.T = null;
        }
    }

    private final void S() {
        View view;
        int iA;
        WeakReference weakReference = this.w;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        gl.C(view, 524288);
        gl.C(view, 262144);
        gl.C(view, 1048576);
        int i = this.W;
        if (i != -1) {
            gl.C(view, i);
        }
        if (!this.a && this.s != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            hj hjVarM = M(6);
            List listV = gl.v(view);
            int i2 = 0;
            while (true) {
                if (i2 >= listV.size()) {
                    int i3 = -1;
                    int i4 = 0;
                    while (true) {
                        int length = gl.a.length;
                        if (i4 >= 32 || i3 != -1) {
                            break;
                        }
                        i3 = gl.a[i4];
                        boolean z = true;
                        for (int i5 = 0; i5 < listV.size(); i5++) {
                            z &= ((ha) listV.get(i5)).a() != i3;
                        }
                        if (true != z) {
                            i3 = -1;
                        }
                        i4++;
                    }
                    iA = i3;
                    break;
                }
                if (TextUtils.equals(string, ((ha) listV.get(i2)).b())) {
                    iA = ((ha) listV.get(i2)).a();
                    break;
                }
                i2++;
            }
            if (iA != -1) {
                gl.w(view, new ha(null, iA, string, hjVarM, null));
            }
            this.W = iA;
        }
        if (this.p && this.s != 5) {
            Q(view, ha.f, 5);
        }
        switch (this.s) {
            case 3:
                Q(view, ha.e, true == this.a ? 4 : 6);
                break;
            case 4:
                Q(view, ha.d, true == this.a ? 3 : 6);
                break;
            case 6:
                Q(view, ha.e, 4);
                Q(view, ha.d, 3);
                break;
        }
    }

    private final void T(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.M != z) {
            this.M = z;
            if (this.c == null || (valueAnimator = this.O) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.O.reverse();
                return;
            }
            float f = i == 3 ? 0.0f : 1.0f;
            this.O.setFloatValues(1.0f - f, f);
            this.O.start();
        }
    }

    private final void U(boolean z) {
        WeakReference weakReference = this.w;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.V != null) {
                    return;
                } else {
                    this.V = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.w.get() && z) {
                    this.V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.V = null;
        }
    }

    private final boolean V() {
        if (this.t != null) {
            return this.r || this.s == 1;
        }
        return false;
    }

    private static final int W(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        switch (mode) {
            case 1073741824:
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
            default:
                if (size != 0) {
                    i3 = Math.min(size, i3);
                }
                return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
    }

    public static BottomSheetBehavior z(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof aah)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        aae aaeVar = ((aah) layoutParams).a;
        if (aaeVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) aaeVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public final void A(nxr nxrVar) {
        if (this.y.contains(nxrVar)) {
            return;
        }
        this.y.add(nxrVar);
    }

    public final void B(int i) {
        View view = (View) this.w.get();
        if (view == null || this.y.isEmpty()) {
            return;
        }
        int i2 = this.n;
        if (i <= i2 && i2 != x()) {
            x();
        }
        for (int i3 = 0; i3 < this.y.size(); i3++) {
            ((nxr) this.y.get(i3)).b(view);
        }
    }

    public final void C(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.j = i;
    }

    public final void D(boolean z) {
        if (this.p != z) {
            this.p = z;
            if (!z && this.s == 5) {
                F(4);
            }
            S();
        }
    }

    public final void E(int i) {
        if (i == -1) {
            if (this.D) {
                return;
            } else {
                this.D = true;
            }
        } else {
            if (!this.D && this.b == i) {
                return;
            }
            this.D = false;
            this.b = Math.max(0, i);
        }
        K();
    }

    public final void F(int i) {
        if (i == this.s) {
            return;
        }
        WeakReference weakReference = this.w;
        if (weakReference == null) {
            if (i != 4 && i != 3 && i != 6) {
                if (!this.p || i != 5) {
                    return;
                } else {
                    i = 5;
                }
            }
            this.s = i;
            return;
        }
        View view = (View) weakReference.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && gl.U(view)) {
            view.post(new nxm(this, view, i));
        } else {
            H(view, i);
        }
    }

    public final void G(int i) {
        View view;
        if (this.s == i) {
            return;
        }
        this.s = i;
        int i2 = 4;
        if (i != 4 && i != 3 && i != 6 && this.p && i == 5) {
            i = 5;
        }
        WeakReference weakReference = this.w;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            U(true);
        } else {
            if (i == 6 || i == 5) {
                i2 = i;
            } else if (i == 4) {
            }
            U(false);
            i = i2;
        }
        T(i);
        for (int i3 = 0; i3 < this.y.size(); i3++) {
            ((nxr) this.y.get(i3)).a(view, i);
        }
        S();
    }

    public final void H(View view, int i) {
        int iX;
        int i2;
        if (i == 4) {
            iX = this.n;
        } else if (i == 6) {
            iX = this.l;
            if (this.a && iX <= (i2 = this.k)) {
                iX = i2;
                i = 3;
            }
        } else if (i == 3) {
            iX = x();
        } else {
            if (!this.p || i != 5) {
                StringBuilder sb = new StringBuilder(35);
                sb.append("Illegal state argument: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            iX = this.v;
            i = 5;
        }
        I(view, i, iX, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r0.i(r3.getLeft(), r5) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(android.view.View r3, int r4, int r5, boolean r6) {
        /*
            r2 = this;
            acb r0 = r2.t
            if (r0 == 0) goto L53
            if (r6 == 0) goto L11
            int r6 = r3.getLeft()
            boolean r5 = r0.i(r6, r5)
            if (r5 == 0) goto L53
            goto L2d
        L11:
            int r6 = r3.getLeft()
            r0.d = r3
            r1 = -1
            r0.c = r1
            r1 = 0
            boolean r5 = r0.g(r6, r5, r1, r1)
            if (r5 != 0) goto L2d
            int r3 = r0.a
            if (r3 != 0) goto L53
            android.view.View r3 = r0.d
            if (r3 == 0) goto L53
            r3 = 0
            r0.d = r3
            goto L53
        L2d:
            r5 = 2
            r2.G(r5)
            r2.T(r4)
            nxu r5 = r2.N
            if (r5 != 0) goto L3f
            nxu r5 = new nxu
            r5.<init>(r2, r3, r4)
            r2.N = r5
        L3f:
            nxu r5 = r2.N
            boolean r6 = r5.a
            if (r6 != 0) goto L50
            r5.b = r4
            defpackage.gl.A(r3, r5)
            nxu r3 = r2.N
            r4 = 1
            r3.a = r4
            return
        L50:
            r5.b = r4
            return
        L53:
            r2.G(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.I(android.view.View, int, int, boolean):void");
    }

    public final boolean J(View view, float f) {
        if (this.q) {
            return true;
        }
        if (view.getTop() < this.n) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.n)) / ((float) L()) > 0.5f;
    }

    public final void K() {
        View view;
        if (this.w != null) {
            N();
            if (this.s != 4 || (view = (View) this.w.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.aae
    public final void a(aah aahVar) {
        this.w = null;
        this.t = null;
    }

    @Override // defpackage.aae
    public final void b() {
        this.w = null;
        this.t = null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    @Override // defpackage.aae
    public final void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int top;
        int iX;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == x()) {
            G(3);
            return;
        }
        WeakReference weakReference = this.x;
        if (weakReference != null && view2 == weakReference.get() && this.R) {
            if (this.Q > 0) {
                if (this.a) {
                    iX = this.k;
                } else {
                    int top3 = view.getTop();
                    int i4 = this.l;
                    if (top3 > i4) {
                        iX = i4;
                        i3 = 6;
                    } else {
                        iX = x();
                    }
                }
            } else if (this.p) {
                VelocityTracker velocityTracker = this.T;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.C);
                    yVelocity = this.T.getYVelocity(this.z);
                }
                if (J(view, yVelocity)) {
                    iX = this.v;
                    i3 = 5;
                } else if (this.Q == 0) {
                    top2 = view.getTop();
                    if (this.a) {
                        i2 = this.l;
                        if (top2 < i2) {
                            if (top2 < Math.abs(top2 - this.n)) {
                                iX = x();
                            } else {
                                iX = this.l;
                                i3 = 6;
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.n)) {
                            iX = this.l;
                            i3 = 6;
                        } else {
                            iX = this.n;
                            i3 = 4;
                        }
                    } else if (Math.abs(top2 - this.k) < Math.abs(top2 - this.n)) {
                        iX = this.k;
                    } else {
                        iX = this.n;
                        i3 = 4;
                    }
                } else if (this.a) {
                    iX = this.n;
                    i3 = 4;
                } else {
                    top = view.getTop();
                    if (Math.abs(top - this.l) < Math.abs(top - this.n)) {
                        iX = this.l;
                        i3 = 6;
                    } else {
                        iX = this.n;
                        i3 = 4;
                    }
                }
            } else if (this.Q == 0) {
                top2 = view.getTop();
                if (this.a) {
                    i2 = this.l;
                    if (top2 < i2) {
                        if (top2 < Math.abs(top2 - this.n)) {
                            iX = x();
                        } else {
                            iX = this.l;
                            i3 = 6;
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.n)) {
                        iX = this.l;
                        i3 = 6;
                    } else {
                        iX = this.n;
                        i3 = 4;
                    }
                } else if (Math.abs(top2 - this.k) < Math.abs(top2 - this.n)) {
                    iX = this.k;
                } else {
                    iX = this.n;
                    i3 = 4;
                }
            } else if (this.a) {
                iX = this.n;
                i3 = 4;
            } else {
                top = view.getTop();
                if (Math.abs(top - this.l) < Math.abs(top - this.n)) {
                    iX = this.l;
                    i3 = 6;
                } else {
                    iX = this.n;
                    i3 = 4;
                }
            }
            I(view, i3, iX, false);
            this.R = false;
        }
    }

    @Override // defpackage.aae
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        acb acbVar;
        if (!view.isShown() || !this.r) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            R();
            actionMasked = 0;
        }
        if (this.T == null) {
            this.T = VelocityTracker.obtain();
        }
        this.T.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                int x = (int) motionEvent.getX();
                this.U = (int) motionEvent.getY();
                if (this.s != 2) {
                    WeakReference weakReference = this.x;
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && coordinatorLayout.m(view2, x, this.U)) {
                        this.z = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.A = true;
                    }
                }
                this.P = this.z == -1 && !coordinatorLayout.m(view, x, this.U);
                break;
            case 1:
            case 3:
                this.A = false;
                this.z = -1;
                if (this.P) {
                    this.P = false;
                    return false;
                }
                break;
        }
        if (!this.P && (acbVar = this.t) != null && acbVar.j(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.x;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.P || this.s == 1 || coordinatorLayout.m(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.t == null || Math.abs(((float) this.U) - motionEvent.getY()) <= ((float) this.t.b)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    @Override // defpackage.aae
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        obu obuVar;
        if (gl.R(coordinatorLayout) && !gl.R(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.w == null) {
            this.E = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (this.J || this.D) ? false : true;
            if (this.e || this.f || this.g) {
                gl.N(view, new nzx(new nxo(this, z), new nzz(gl.j(view), view.getPaddingTop(), gl.i(view), view.getPaddingBottom())));
                if (gl.U(view)) {
                    gl.D(view);
                } else {
                    view.addOnAttachStateChangeListener(new nzy());
                }
            } else if (z) {
                z = true;
                gl.N(view, new nzx(new nxo(this, z), new nzz(gl.j(view), view.getPaddingTop(), gl.i(view), view.getPaddingBottom())));
                if (gl.U(view)) {
                    gl.D(view);
                } else {
                    view.addOnAttachStateChangeListener(new nzy());
                }
            }
            this.w = new WeakReference(view);
            if (this.G && (obuVar = this.c) != null) {
                gl.G(view, obuVar);
            }
            obu obuVar2 = this.c;
            if (obuVar2 != null) {
                float fA = this.o;
                if (fA == -1.0f) {
                    fA = gl.a(view);
                }
                obuVar2.g(fA);
                int i2 = this.s;
                this.M = i2 == 3;
                this.c.i(i2 == 3 ? 0.0f : 1.0f);
            }
            S();
            if (gl.d(view) == 0) {
                gl.M(view, 1);
            }
        }
        if (this.t == null) {
            this.t = acb.b(coordinatorLayout, this.X);
        }
        int top = view.getTop();
        coordinatorLayout.l(view, i);
        this.u = coordinatorLayout.getWidth();
        this.v = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.S = height;
        int i3 = this.v;
        int i4 = this.i;
        if (i3 - height < i4) {
            if (this.K) {
                this.S = i3;
                height = i3;
            } else {
                height = i3 - i4;
                this.S = height;
            }
        }
        this.k = Math.max(0, i3 - height);
        O();
        N();
        int i5 = this.s;
        if (i5 == 3) {
            gl.y(view, x());
        } else if (i5 == 6) {
            gl.y(view, this.l);
        } else if (this.p && i5 == 5) {
            gl.y(view, this.v);
        } else if (i5 == 4) {
            gl.y(view, this.n);
        } else if (i5 == 1 || i5 == 2) {
            gl.y(view, top - view.getTop());
        }
        this.x = new WeakReference(y(view));
        return true;
    }

    @Override // defpackage.aae
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.s == 1 && actionMasked == 0) {
            return true;
        }
        if (V()) {
            this.t.e(motionEvent);
        }
        if (actionMasked == 0) {
            R();
        }
        if (this.T == null) {
            this.T = VelocityTracker.obtain();
        }
        this.T.addMovement(motionEvent);
        if (V() && actionMasked == 2 && !this.P) {
            float fAbs = Math.abs(this.U - motionEvent.getY());
            acb acbVar = this.t;
            if (fAbs > acbVar.b) {
                acbVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    @Override // defpackage.aae
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(W(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.H, marginLayoutParams.width), W(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.I, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.aae
    public final boolean l(View view) {
        WeakReference weakReference = this.x;
        return (weakReference == null || view != weakReference.get() || this.s == 3) ? false : true;
    }

    @Override // defpackage.aae
    public final void m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
        if (i2 == 1) {
            return;
        }
        WeakReference weakReference = this.x;
        if (view2 == (weakReference != null ? (View) weakReference.get() : null)) {
            int top = view.getTop();
            int i3 = top - i;
            if (i > 0) {
                if (i3 < x()) {
                    int iX = top - x();
                    iArr[1] = iX;
                    gl.y(view, -iX);
                    G(3);
                } else {
                    if (!this.r) {
                        return;
                    }
                    iArr[1] = i;
                    gl.y(view, -i);
                    G(1);
                }
            } else if (i < 0 && !view2.canScrollVertically(-1)) {
                int i4 = this.n;
                if (i3 > i4 && !this.p) {
                    int i5 = top - i4;
                    iArr[1] = i5;
                    gl.y(view, -i5);
                    G(4);
                } else {
                    if (!this.r) {
                        return;
                    }
                    iArr[1] = i;
                    gl.y(view, -i);
                    G(1);
                }
            }
            B(view.getTop());
            this.Q = i;
            this.R = true;
        }
    }

    @Override // defpackage.aae
    public final void n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // defpackage.aae
    public final void o(View view, Parcelable parcelable) {
        nxt nxtVar = (nxt) parcelable;
        int i = this.B;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.b = nxtVar.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = nxtVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.p = nxtVar.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.q = nxtVar.g;
            }
        }
        int i2 = nxtVar.a;
        if (i2 == 1 || i2 == 2) {
            this.s = 4;
        } else {
            this.s = i2;
        }
    }

    @Override // defpackage.aae
    public final Parcelable p(View view) {
        return new nxt(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.aae
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.Q = 0;
        this.R = false;
        return (i & 2) != 0;
    }

    public final int x() {
        if (this.a) {
            return this.k;
        }
        return Math.max(this.j, this.K ? 0 : this.i);
    }

    final View y(View view) {
        if (gl.W(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewY = y(viewGroup.getChildAt(i));
            if (viewY != null) {
                return viewY;
            }
        }
        return null;
    }
}
