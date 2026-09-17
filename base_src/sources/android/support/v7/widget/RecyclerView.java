package android.support.v7.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.aby;
import defpackage.fp;
import defpackage.fq;
import defpackage.ge;
import defpackage.gf;
import defpackage.gg;
import defpackage.gl;
import defpackage.hn;
import defpackage.jt;
import defpackage.mm;
import defpackage.mn;
import defpackage.ny;
import defpackage.or;
import defpackage.ou;
import defpackage.ow;
import defpackage.pq;
import defpackage.pr;
import defpackage.ps;
import defpackage.pt;
import defpackage.pu;
import defpackage.px;
import defpackage.py;
import defpackage.pz;
import defpackage.qc;
import defpackage.qd;
import defpackage.qe;
import defpackage.qf;
import defpackage.qg;
import defpackage.qh;
import defpackage.qi;
import defpackage.qk;
import defpackage.ql;
import defpackage.qn;
import defpackage.qo;
import defpackage.qp;
import defpackage.qq;
import defpackage.qr;
import defpackage.qs;
import defpackage.qu;
import defpackage.sb;
import defpackage.sc;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements fp {
    public static final /* synthetic */ int S = 0;
    private static final int[] T = {R.attr.nestedScrollingEnabled};
    private static final Class[] U = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    public static final Interpolator a = new aby(1);
    static final qq b = new qq();
    public EdgeEffect A;
    public EdgeEffect B;
    public EdgeEffect C;
    public EdgeEffect D;
    public py E;
    public int F;
    public qe G;
    public final int H;
    public final qr I;
    public ow J;
    public ou K;
    public final qp L;
    public boolean M;
    public boolean N;
    public boolean O;
    public qu P;
    public final int[] Q;
    final List R;
    private final qk V;
    private final Rect W;
    private pz aA;
    private ge aB;
    private final pz aC;
    private int aa;
    private boolean ab;
    private int ac;
    private final AccessibilityManager ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private VelocityTracker ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private final int an;
    private float ao;
    private float ap;
    private boolean aq;
    private List ar;
    private final int[] as;
    private fq at;
    private final int[] au;
    private final int[] av;
    private Runnable aw;
    private boolean ax;
    private int ay;
    private int az;
    public final qi c;
    ql d;
    public mn e;
    public ny f;
    public final sc g;
    boolean h;
    public final Runnable i;
    public final Rect j;
    public final RectF k;
    public pu l;
    public qc m;
    public final List n;
    public final ArrayList o;
    public final ArrayList p;
    public qf q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public List x;
    public boolean y;
    boolean z;

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.GoogleCameraEngR18F1.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.V = new qk(this);
        this.c = new qi(this);
        this.g = new sc();
        this.i = new pt(this, 1);
        this.j = new Rect();
        this.W = new Rect();
        this.k = new RectF();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.aa = 0;
        this.y = false;
        this.z = false;
        this.ae = 0;
        this.af = 0;
        this.aB = b;
        this.E = new py(null);
        this.ag = 0;
        this.ah = -1;
        this.ao = Float.MIN_VALUE;
        this.ap = Float.MIN_VALUE;
        this.aq = true;
        this.I = new qr(this);
        this.K = new ou();
        this.L = new qp();
        this.M = false;
        this.N = false;
        this.aA = new pz(this);
        this.O = false;
        this.as = new int[2];
        this.au = new int[2];
        this.av = new int[2];
        this.Q = new int[2];
        this.R = new ArrayList();
        this.aw = new pt(this, 0);
        this.ay = 0;
        this.az = 0;
        this.aC = new pz(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.F = viewConfiguration.getScaledTouchSlop();
        this.ao = viewConfiguration.getScaledHorizontalScrollFactor();
        this.ap = viewConfiguration.getScaledVerticalScrollFactor();
        this.H = viewConfiguration.getScaledMinimumFlingVelocity();
        this.an = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.E.a = this.aA;
        this.e = new mn(new pz(this), null);
        this.f = new ny(new pz(this), null);
        if (gl.e(this) == 0) {
            gl.ac(this);
        }
        if (gl.d(this) == 0) {
            gl.M(this, 1);
        }
        this.ad = (AccessibilityManager) getContext().getSystemService("accessibility");
        T(new qu(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jt.a, i, 0);
        gl.E(this, context, jt.a, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.h = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + k());
            }
            Resources resources = getContext().getResources();
            new or(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.google.android.GoogleCameraEngR18F1.R.dimen.fastscroll_margin));
        }
        typedArrayObtainStyledAttributes.recycle();
        aD(context, string, attributeSet, i);
        int[] iArr = T;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        gl.E(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
    }

    public static void E(View view, Rect rect) {
        qd qdVar = (qd) view.getLayoutParams();
        Rect rect2 = qdVar.d;
        rect.set((view.getLeft() - rect2.left) - qdVar.leftMargin, (view.getTop() - rect2.top) - qdVar.topMargin, view.getRight() + rect2.right + qdVar.rightMargin, view.getBottom() + rect2.bottom + qdVar.bottomMargin);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    private final int a(int i, float f) {
        float fB;
        int iRound;
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.A;
        float f2 = 0.0f;
        if (edgeEffect == null || hn.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && hn.a(edgeEffect2) != 0.0f) {
                fB = hn.b(this.C, width, height);
                if (hn.a(this.C) == 0.0f) {
                    this.C.onRelease();
                }
            }
            iRound = Math.round(f2 * getWidth());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fB = -hn.b(this.A, -width, 1.0f - height);
        if (hn.a(this.A) == 0.0f) {
            this.A.onRelease();
        }
        f2 = fB;
        iRound = Math.round(f2 * getWidth());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    private final void aA() {
        qo qoVar;
        this.I.c();
        qc qcVar = this.m;
        if (qcVar == null || (qoVar = qcVar.t) == null) {
            return;
        }
        qoVar.f();
    }

    private final boolean aB(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            qf qfVar = (qf) this.p.get(i);
            if (qfVar.i(motionEvent) && action != 3) {
                this.q = qfVar;
                return true;
            }
        }
        return false;
    }

    private final boolean aC() {
        return this.E != null && this.m.s();
    }

    private final void aD(Context context, String str, AttributeSet attributeSet, int i) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            if (strTrim.charAt(0) == '.') {
                strTrim = context.getPackageName() + strTrim;
            } else if (!strTrim.contains(".")) {
                strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
            }
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(qc.class);
                try {
                    constructor = clsAsSubclass.getConstructor(U);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e2);
                    }
                }
                constructor.setAccessible(true);
                V((qc) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    private final int ap(int i, float f) {
        float fB;
        int iRound;
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.B;
        float f2 = 0.0f;
        if (edgeEffect == null || hn.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.D;
            if (edgeEffect2 != null && hn.a(edgeEffect2) != 0.0f) {
                fB = hn.b(this.D, height, 1.0f - width);
                if (hn.a(this.D) == 0.0f) {
                    this.D.onRelease();
                }
            }
            iRound = Math.round(f2 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fB = -hn.b(this.B, -height, width);
        if (hn.a(this.B) == 0.0f) {
            this.B.onRelease();
        }
        f2 = fB;
        iRound = Math.round(f2 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    private final fq aq() {
        if (this.at == null) {
            this.at = new fq(this);
        }
        return this.at;
    }

    private final void ar() {
        az();
        W(0);
    }

    private final void as() {
        sb sbVar;
        View viewJ;
        this.L.b(1);
        D(this.L);
        this.L.i = false;
        Z();
        this.g.f();
        K();
        aw();
        qs qsVarG = null;
        View focusedChild = (this.aq && hasFocus() && this.l != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewJ = j(focusedChild)) != null) {
            qsVarG = g(viewJ);
        }
        if (qsVarG == null) {
            ay();
        } else {
            qp qpVar = this.L;
            qpVar.m = this.l.b ? qsVarG.e : -1L;
            qpVar.l = this.y ? -1 : qsVarG.u() ? qsVarG.d : qsVarG.a();
            qp qpVar2 = this.L;
            View focusedChild2 = qsVarG.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            qpVar2.n = id;
        }
        qp qpVar3 = this.L;
        qpVar3.h = qpVar3.j && this.N;
        this.N = false;
        this.M = false;
        qpVar3.g = qpVar3.k;
        qpVar3.e = this.l.a();
        au(this.as);
        if (this.L.j) {
            int iA = this.f.a();
            for (int i = 0; i < iA; i++) {
                qs qsVarH = h(this.f.e(i));
                if (!qsVarH.z() && (!qsVarH.s() || this.l.b)) {
                    py.d(qsVarH);
                    qsVarH.c();
                    this.g.e(qsVarH, py.e(qsVarH));
                    if (this.L.h && qsVarH.x() && !qsVarH.u() && !qsVarH.z() && !qsVarH.s()) {
                        this.g.c(d(qsVarH), qsVarH);
                    }
                }
            }
        }
        if (this.L.k) {
            int iC = this.f.c();
            for (int i2 = 0; i2 < iC; i2++) {
                qs qsVarH2 = h(this.f.f(i2));
                if (!qsVarH2.z() && qsVarH2.d == -1) {
                    qsVarH2.d = qsVarH2.c;
                }
            }
            qp qpVar4 = this.L;
            boolean z = qpVar4.f;
            qpVar4.f = false;
            this.m.n(this.c, qpVar4);
            this.L.f = z;
            for (int i3 = 0; i3 < this.f.a(); i3++) {
                qs qsVarH3 = h(this.f.e(i3));
                if (!qsVarH3.z() && ((sbVar = (sb) this.g.a.get(qsVarH3)) == null || (sbVar.b & 4) == 0)) {
                    py.d(qsVarH3);
                    boolean zP = qsVarH3.p(8192);
                    qsVarH3.c();
                    px pxVarE = py.e(qsVarH3);
                    if (zP) {
                        P(qsVarH3, pxVarE);
                    } else {
                        sc scVar = this.g;
                        sb sbVarA = (sb) scVar.a.get(qsVarH3);
                        if (sbVarA == null) {
                            sbVarA = sb.a();
                            scVar.a.put(qsVarH3, sbVarA);
                        }
                        sbVarA.b |= 2;
                        sbVarA.c = pxVarE;
                    }
                }
            }
            r();
        } else {
            r();
        }
        L();
        aa(false);
        this.L.d = 2;
    }

    private final void at() {
        Z();
        K();
        this.L.b(6);
        this.e.e();
        this.L.e = this.l.a();
        this.L.c = 0;
        ql qlVar = this.d;
        if (qlVar != null) {
            int i = this.l.c;
            Parcelable parcelable = qlVar.a;
            if (parcelable != null) {
                this.m.Q(parcelable);
            }
            this.d = null;
        }
        qp qpVar = this.L;
        qpVar.g = false;
        this.m.n(this.c, qpVar);
        qp qpVar2 = this.L;
        qpVar2.f = false;
        qpVar2.j = qpVar2.j && this.E != null;
        qpVar2.d = 4;
        L();
        aa(false);
    }

    private final void au(int[] iArr) {
        int iA = this.f.a();
        if (iA == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iA; i3++) {
            qs qsVarH = h(this.f.e(i3));
            if (!qsVarH.z()) {
                int iB = qsVarH.b();
                if (iB < i) {
                    i = iB;
                }
                if (iB > i2) {
                    i2 = iB;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    private final void av(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ah) {
            int i = actionIndex == 0 ? 1 : 0;
            this.ah = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.al = x;
            this.aj = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.am = y;
            this.ak = y;
        }
    }

    private final void aw() {
        boolean z;
        if (this.y) {
            this.e.j();
            if (this.z) {
                this.m.v();
            }
        }
        if (aC()) {
            this.e.g();
        } else {
            this.e.e();
        }
        boolean z2 = this.M || this.N;
        qp qpVar = this.L;
        boolean z3 = this.t && this.E != null && ((z = this.y) || z2 || this.m.u) && (!z || this.l.b);
        qpVar.j = z3;
        qpVar.k = z3 && z2 && !this.y && aC();
    }

    private final void ax(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof qd) {
            qd qdVar = (qd) layoutParams;
            if (!qdVar.e) {
                Rect rect = qdVar.d;
                this.j.left -= rect.left;
                this.j.right += rect.right;
                this.j.top -= rect.top;
                this.j.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.j);
            offsetRectIntoDescendantCoords(view, this.j);
        } else {
            view2 = null;
        }
        this.m.aX(this, view, this.j, !this.t, view2 == null);
    }

    private final void ay() {
        qp qpVar = this.L;
        qpVar.m = -1L;
        qpVar.l = -1;
        qpVar.n = -1;
    }

    private final void az() {
        VelocityTracker velocityTracker = this.ai;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        ab(0);
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.A.isFinished();
        }
        EdgeEffect edgeEffect2 = this.B;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            gl.z(this);
        }
    }

    public static qs h(View view) {
        if (view == null) {
            return null;
        }
        return ((qd) view.getLayoutParams()).c;
    }

    public static RecyclerView i(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewI = i(viewGroup.getChildAt(i));
            if (recyclerViewI != null) {
                return recyclerViewI;
            }
        }
        return null;
    }

    public static void q(qs qsVar) {
        WeakReference weakReference = qsVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == qsVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            qsVar.b = null;
        }
    }

    public final void A() {
        if (this.A != null) {
            return;
        }
        EdgeEffect edgeEffectB = this.aB.b(this);
        this.A = edgeEffectB;
        if (this.h) {
            edgeEffectB.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectB.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.C != null) {
            return;
        }
        EdgeEffect edgeEffectB = this.aB.b(this);
        this.C = edgeEffectB;
        if (this.h) {
            edgeEffectB.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectB.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void C() {
        if (this.B != null) {
            return;
        }
        EdgeEffect edgeEffectB = this.aB.b(this);
        this.B = edgeEffectB;
        if (this.h) {
            edgeEffectB.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectB.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void D(qp qpVar) {
        if (this.ag != 2) {
            qpVar.o = 0;
            qpVar.p = 0;
        } else {
            OverScroller overScroller = this.I.c;
            qpVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            qpVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    final void F() {
        this.D = null;
        this.B = null;
        this.C = null;
        this.A = null;
    }

    public final void G() {
        if (this.o.size() == 0) {
            return;
        }
        qc qcVar = this.m;
        if (qcVar != null) {
            qcVar.M("Cannot invalidate item decorations during a scroll or layout");
        }
        I();
        requestLayout();
    }

    public final void H(int i) {
        if (this.m == null) {
            return;
        }
        W(2);
        this.m.R(i);
        awakenScrollBars();
    }

    public final void I() {
        int iC = this.f.c();
        for (int i = 0; i < iC; i++) {
            ((qd) this.f.f(i).getLayoutParams()).e = true;
        }
        qi qiVar = this.c;
        int size = qiVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            qd qdVar = (qd) ((qs) qiVar.c.get(i2)).a.getLayoutParams();
            if (qdVar != null) {
                qdVar.e = true;
            }
        }
    }

    public final void J(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iC = this.f.c();
        for (int i4 = 0; i4 < iC; i4++) {
            qs qsVarH = h(this.f.f(i4));
            if (qsVarH != null && !qsVarH.z()) {
                int i5 = qsVarH.c;
                if (i5 >= i3) {
                    qsVarH.j(-i2, z);
                    this.L.f = true;
                } else if (i5 >= i) {
                    qsVarH.e(8);
                    qsVarH.j(-i2, z);
                    qsVarH.c = i - 1;
                    this.L.f = true;
                }
            }
        }
        qi qiVar = this.c;
        for (int size = qiVar.c.size() - 1; size >= 0; size--) {
            qs qsVar = (qs) qiVar.c.get(size);
            if (qsVar != null) {
                int i6 = qsVar.c;
                if (i6 >= i3) {
                    qsVar.j(-i2, z);
                } else if (i6 >= i) {
                    qsVar.e(8);
                    qiVar.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void K() {
        this.ae++;
    }

    final void L() {
        M(true);
    }

    public final void M(boolean z) {
        int i;
        int i2 = this.ae - 1;
        this.ae = i2;
        if (i2 <= 0) {
            this.ae = 0;
            if (z) {
                int i3 = this.ac;
                this.ac = 0;
                if (i3 != 0 && ag()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                for (int size = this.R.size() - 1; size >= 0; size--) {
                    qs qsVar = (qs) this.R.get(size);
                    if (qsVar.a.getParent() == this && !qsVar.z() && (i = qsVar.p) != -1) {
                        gl.M(qsVar.a, i);
                        qsVar.p = -1;
                    }
                }
                this.R.clear();
            }
        }
    }

    public final void N() {
        if (this.O || !this.r) {
            return;
        }
        gl.A(this, this.aw);
        this.O = true;
    }

    public final void O(boolean z) {
        this.z = z | this.z;
        this.y = true;
        int iC = this.f.c();
        for (int i = 0; i < iC; i++) {
            qs qsVarH = h(this.f.f(i));
            if (qsVarH != null && !qsVarH.z()) {
                qsVarH.e(6);
            }
        }
        I();
        qi qiVar = this.c;
        int size = qiVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            qs qsVar = (qs) qiVar.c.get(i2);
            if (qsVar != null) {
                qsVar.e(6);
                qsVar.d(null);
            }
        }
        pu puVar = qiVar.g.l;
        if (puVar == null || !puVar.b) {
            qiVar.g();
        }
    }

    public final void P(qs qsVar, px pxVar) {
        qsVar.l(0, 8192);
        if (this.L.h && qsVar.x() && !qsVar.u() && !qsVar.z()) {
            this.g.c(d(qsVar), qsVar);
        }
        this.g.e(qsVar, pxVar);
    }

    public final void Q() {
        py pyVar = this.E;
        if (pyVar != null) {
            pyVar.i();
        }
        qc qcVar = this.m;
        if (qcVar != null) {
            qcVar.aI(this.c);
            this.m.aJ(this.c);
        }
        this.c.e();
    }

    public final void R(int i, int i2, int[] iArr) {
        qs qsVar;
        Z();
        K();
        Trace.beginSection("RV Scroll");
        D(this.L);
        int iD = i != 0 ? this.m.d(i, this.c, this.L) : 0;
        int iE = i2 != 0 ? this.m.e(i2, this.c, this.L) : 0;
        Trace.endSection();
        int iA = this.f.a();
        for (int i3 = 0; i3 < iA; i3++) {
            View viewE = this.f.e(i3);
            qs qsVarG = g(viewE);
            if (qsVarG != null && (qsVar = qsVarG.i) != null) {
                View view = qsVar.a;
                int left = viewE.getLeft();
                int top = viewE.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        L();
        aa(false);
        if (iArr != null) {
            iArr[0] = iD;
            iArr[1] = iE;
        }
    }

    public final void S(int i) {
        if (this.v) {
            return;
        }
        ac();
        qc qcVar = this.m;
        if (qcVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qcVar.R(i);
            awakenScrollBars();
        }
    }

    public final void T(qu quVar) {
        this.P = quVar;
        gl.F(this, quVar);
    }

    public final void U(pu puVar) {
        suppressLayout(false);
        pu puVar2 = this.l;
        if (puVar2 != null) {
            puVar2.i(this.V);
        }
        Q();
        this.e.j();
        pu puVar3 = this.l;
        this.l = puVar;
        if (puVar != null) {
            puVar.h(this.V);
        }
        qc qcVar = this.m;
        if (qcVar != null) {
            qcVar.bj();
        }
        qi qiVar = this.c;
        pu puVar4 = this.l;
        qiVar.e();
        qh qhVarB = qiVar.b();
        if (puVar3 != null) {
            qhVarB.b--;
        }
        if (qhVarB.b == 0) {
            for (int i = 0; i < qhVarB.a.size(); i++) {
                ((qg) qhVarB.a.valueAt(i)).a.clear();
            }
        }
        if (puVar4 != null) {
            qhVarB.b++;
        }
        this.L.f = true;
        O(false);
        requestLayout();
    }

    public final void V(qc qcVar) {
        if (qcVar == this.m) {
            return;
        }
        ac();
        if (this.m != null) {
            py pyVar = this.E;
            if (pyVar != null) {
                pyVar.i();
            }
            this.m.aI(this.c);
            this.m.aJ(this.c);
            this.c.e();
            if (this.r) {
                this.m.bm(this);
            }
            this.m.aS(null);
            this.m = null;
        } else {
            this.c.e();
        }
        ny nyVar = this.f;
        nyVar.a.d();
        for (int size = nyVar.b.size() - 1; size >= 0; size--) {
            nyVar.c.i((View) nyVar.b.get(size));
            nyVar.b.remove(size);
        }
        pz pzVar = nyVar.c;
        int iF = pzVar.f();
        for (int i = 0; i < iF; i++) {
            View viewH = pzVar.h(i);
            pzVar.a.v(viewH);
            viewH.clearAnimation();
        }
        pzVar.a.removeAllViews();
        this.m = qcVar;
        if (qcVar != null) {
            if (qcVar.q != null) {
                throw new IllegalArgumentException("LayoutManager " + qcVar + " is already attached to a RecyclerView:" + qcVar.q.k());
            }
            this.m.aS(this);
            if (this.r) {
                this.m.aZ();
            }
        }
        this.c.m();
        requestLayout();
    }

    public final void W(int i) {
        if (i == this.ag) {
            return;
        }
        this.ag = i;
        if (i != 2) {
            aA();
        }
        qc qcVar = this.m;
        if (qcVar != null) {
            qcVar.aH(i);
        }
        List list = this.ar;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((gg) this.ar.get(size)).d(i);
            }
        }
    }

    public final void X(int i, int i2) {
        ak(i, i2, false);
    }

    public final void Y(int i) {
        if (this.v) {
            return;
        }
        qc qcVar = this.m;
        if (qcVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qcVar.ag(this, i);
        }
    }

    public final void Z() {
        int i = this.aa + 1;
        this.aa = i;
        if (i != 1 || this.v) {
            return;
        }
        this.u = false;
    }

    public final void aa(boolean z) {
        int i = this.aa;
        if (i <= 0) {
            this.aa = 1;
            i = 1;
        }
        if (!z && !this.v) {
            this.u = false;
        }
        if (i == 1) {
            if (z && this.u && !this.v && this.m != null && this.l != null) {
                w();
            }
            if (!this.v) {
                this.u = false;
            }
        }
        this.aa--;
    }

    public final void ab(int i) {
        aq().b(i);
    }

    public final void ac() {
        W(0);
        aA();
    }

    public final boolean ae(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return aq().e(i, i2, iArr, iArr2, i3);
    }

    public final boolean af() {
        return !this.t || this.y || this.e.l();
    }

    public final boolean ag() {
        AccessibilityManager accessibilityManager = this.ad;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean ah() {
        return this.ae > 0;
    }

    final boolean ai(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        t();
        if (this.l != null) {
            int[] iArr = this.Q;
            iArr[0] = 0;
            iArr[1] = 0;
            R(i, i2, iArr);
            int[] iArr2 = this.Q;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.o.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.Q;
        iArr3[0] = 0;
        iArr3[1] = 0;
        x(i5, i4, i6, i7, this.au, i3, iArr3);
        int[] iArr4 = this.Q;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z2 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.al;
        int[] iArr5 = this.au;
        int i15 = iArr5[0];
        this.al = i14 - i15;
        this.am -= iArr5[1];
        int[] iArr6 = this.av;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x = motionEvent.getX();
                float f = i11;
                float y = motionEvent.getY();
                float f2 = i13;
                if (f < 0.0f) {
                    A();
                    hn.b(this.A, (-f) / getWidth(), 1.0f - (y / getHeight()));
                    z = true;
                } else if (f > 0.0f) {
                    B();
                    hn.b(this.C, f / getWidth(), y / getHeight());
                    z = true;
                } else {
                    z = false;
                }
                if (f2 < 0.0f) {
                    C();
                    hn.b(this.B, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    z();
                    hn.b(this.D, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else if (z || f != 0.0f || f2 != 0.0f) {
                }
                gl.z(this);
            }
            s(i, i2);
        }
        if (i5 != 0) {
            y(i5, i4);
        } else if (i4 != 0) {
            i5 = 0;
            y(i5, i4);
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i4 == 0) ? false : true;
    }

    public final void aj(qs qsVar, int i) {
        if (!ah()) {
            gl.M(qsVar.a, i);
        } else {
            qsVar.p = i;
            this.R.add(qsVar);
        }
    }

    public final void ak(int i, int i2, boolean z) {
        qc qcVar = this.m;
        if (qcVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        if (true != qcVar.U()) {
            i = 0;
        }
        if (true != this.m.V()) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return;
            } else {
                i = 0;
            }
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            al(i3, 1);
        }
        this.I.b(i, i2, Integer.MIN_VALUE, null);
    }

    public final void al(int i, int i2) {
        aq().i(i, i2);
    }

    public final void am(gf gfVar) {
        qc qcVar = this.m;
        if (qcVar != null) {
            qcVar.M("Cannot add item decoration during a scroll  or layout");
        }
        if (this.o.isEmpty()) {
            setWillNotDraw(false);
        }
        this.o.add(gfVar);
        I();
        requestLayout();
    }

    public final void an(gg ggVar) {
        if (this.ar == null) {
            this.ar = new ArrayList();
        }
        this.ar.add(ggVar);
    }

    public final void ao(gg ggVar) {
        List list = this.ar;
        if (list != null) {
            list.remove(ggVar);
        }
    }

    public final int b(qs qsVar) {
        if (qsVar.p(524) || !qsVar.r()) {
            return -1;
        }
        mn mnVar = this.e;
        int i = qsVar.c;
        int size = mnVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            mm mmVar = (mm) mnVar.a.get(i2);
            switch (mmVar.a) {
                case 1:
                    if (mmVar.b <= i) {
                        i += mmVar.d;
                    }
                    break;
                case 2:
                    int i3 = mmVar.b;
                    if (i3 > i) {
                        continue;
                    } else {
                        int i4 = mmVar.d;
                        if (i3 + i4 > i) {
                            return -1;
                        }
                        i -= i4;
                    }
                    break;
            }
        }
        return i;
    }

    public final int c(View view) {
        qs qsVarH = h(view);
        if (qsVarH != null) {
            return qsVarH.a();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof qd) && this.m.r((qd) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        qc qcVar = this.m;
        if (qcVar != null && qcVar.U()) {
            return this.m.y(this.L);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        qc qcVar = this.m;
        if (qcVar != null && qcVar.U()) {
            return this.m.z(this.L);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        qc qcVar = this.m;
        if (qcVar != null && qcVar.U()) {
            return this.m.A(this.L);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        qc qcVar = this.m;
        if (qcVar != null && qcVar.V()) {
            return this.m.B(this.L);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        qc qcVar = this.m;
        if (qcVar != null && qcVar.V()) {
            return this.m.C(this.L);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        qc qcVar = this.m;
        if (qcVar != null && qcVar.V()) {
            return this.m.D(this.L);
        }
        return 0;
    }

    final long d(qs qsVar) {
        return this.l.b ? qsVar.e : qsVar.c;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return aq().c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return aq().d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return aq().e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return aq().f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.o.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((gf) this.o.get(i)).c(canvas, this);
        }
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.A;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.B;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.C;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.C;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.D;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.D;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if (z || (this.E != null && this.o.size() > 0 && this.E.l())) {
            gl.z(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final Rect e(View view) {
        qd qdVar = (qd) view.getLayoutParams();
        if (!qdVar.e) {
            return qdVar.d;
        }
        if (this.L.g && (qdVar.b() || qdVar.c.s())) {
            return qdVar.d;
        }
        Rect rect = qdVar.d;
        rect.set(0, 0, 0, 0);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            this.j.set(0, 0, 0, 0);
            ((gf) this.o.get(i)).b(this.j, view, this);
            rect.left += this.j.left;
            rect.top += this.j.top;
            rect.right += this.j.right;
            rect.bottom += this.j.bottom;
        }
        qdVar.e = false;
        return rect;
    }

    public final qs f(int i) {
        qs qsVar = null;
        if (this.y) {
            return null;
        }
        int iC = this.f.c();
        for (int i2 = 0; i2 < iC; i2++) {
            qs qsVarH = h(this.f.f(i2));
            if (qsVarH != null && !qsVarH.u() && b(qsVarH) == i) {
                if (!this.f.k(qsVarH.a)) {
                    return qsVarH;
                }
                qsVar = qsVarH;
            }
        }
        return qsVar;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c3 A[DONT_INVERT, PHI: r1
      0x01c3: PHI (r1v1 boolean) = (r1v0 boolean), (r1v0 boolean), (r1v2 boolean), (r1v0 boolean), (r1v0 boolean) binds: [B:123:0x01b9, B:126:0x01bf, B:128:0x01c2, B:118:0x01b0, B:121:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x003b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0043  */
    /* JADX WARN: Code duplicated, block: B:30:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x004d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0052  */
    /* JADX WARN: Code duplicated, block: B:37:0x0056  */
    /* JADX WARN: Code duplicated, block: B:38:0x0059  */
    /* JADX WARN: Code duplicated, block: B:41:0x0061  */
    /* JADX WARN: Code duplicated, block: B:43:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x006b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a4, code lost:
    
        if (r4 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a7, code lost:
    
        if (r5 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01aa, code lost:
    
        if (r4 < 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ad, code lost:
    
        if (r5 < 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01c3, code lost:
    
        if (r1 != false) goto L131;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r9, int r10) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final qs g(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return h(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        qc qcVar = this.m;
        if (qcVar != null) {
            return qcVar.f();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + k());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        qc qcVar = this.m;
        if (qcVar != null) {
            return qcVar.h(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + k());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        qc qcVar = this.m;
        if (qcVar != null) {
            return qcVar.g(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + k());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.m != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.h;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return aq().h(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return aq().a;
    }

    public final View j(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final String k() {
        return " " + super.toString() + ", adapter:" + this.l + ", layout:" + this.m + ", context:" + getContext();
    }

    public final void o(qs qsVar) {
        View view = qsVar.a;
        ViewParent parent = view.getParent();
        this.c.l(g(view));
        if (qsVar.w()) {
            this.f.h(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (parent != this) {
            this.f.g(view, -1, true);
            return;
        }
        ny nyVar = this.f;
        int iG = nyVar.c.g(view);
        if (iG >= 0) {
            nyVar.a.e(iG);
            nyVar.j(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ae = 0;
        this.r = true;
        this.t = this.t && !isLayoutRequested();
        qc qcVar = this.m;
        if (qcVar != null) {
            qcVar.aZ();
        }
        this.O = false;
        ow owVar = (ow) ow.a.get();
        this.J = owVar;
        if (owVar == null) {
            this.J = new ow();
            Display displayT = gl.t(this);
            float f = 60.0f;
            if (!isInEditMode() && displayT != null) {
                float refreshRate = displayT.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            this.J.e = (long) (1.0E9f / f);
            ow.a.set(this.J);
        }
        this.J.c.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        py pyVar = this.E;
        if (pyVar != null) {
            pyVar.i();
        }
        ac();
        this.r = false;
        qc qcVar = this.m;
        if (qcVar != null) {
            qcVar.bm(this);
        }
        this.R.clear();
        removeCallbacks(this.aw);
        while (sb.a.a() != null) {
        }
        ow owVar = this.J;
        if (owVar != null) {
            owVar.c.remove(this);
            this.J = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.m != null && !this.v && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.m.V() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.m.U() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.m.V()) {
                    f = -axisValue;
                    axisValue = 0.0f;
                } else if (this.m.U()) {
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                int i = (int) (axisValue * this.ao);
                int i2 = (int) (f * this.ap);
                qc qcVar = this.m;
                if (qcVar == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.v) {
                    int[] iArr = this.Q;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zU = qcVar.U();
                    boolean zV = this.m.V();
                    int i3 = zU ? 1 : 0;
                    if (zV) {
                        i3 |= 2;
                    }
                    float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
                    float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
                    int iA = i - a(i, height);
                    int iAp = i2 - ap(i2, width);
                    al(i3, 1);
                    if (ae(true != zU ? 0 : iA, true != zV ? 0 : iAp, this.Q, this.au, 1)) {
                        int[] iArr2 = this.Q;
                        iA -= iArr2[0];
                        iAp -= iArr2[1];
                    }
                    ai(true != zU ? 0 : iA, true != zV ? 0 : iAp, motionEvent, 1);
                    ow owVar = this.J;
                    if (owVar != null) {
                        if (iA != 0) {
                            owVar.a(this, iA, iAp);
                        } else if (iAp != 0) {
                            iA = 0;
                            owVar.a(this, iA, iAp);
                        }
                    }
                    ab(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0186  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        boolean z2;
        if (this.v) {
            return false;
        }
        this.q = null;
        if (aB(motionEvent)) {
            ar();
            return true;
        }
        qc qcVar = this.m;
        if (qcVar == null) {
            return false;
        }
        boolean zU = qcVar.U();
        boolean zV = this.m.V();
        if (this.ai == null) {
            this.ai = VelocityTracker.obtain();
        }
        this.ai.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        switch (actionMasked) {
            case 0:
                if (this.ab) {
                    this.ab = false;
                }
                this.ah = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.al = x;
                this.aj = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.am = y;
                this.ak = y;
                EdgeEffect edgeEffect = this.A;
                if (edgeEffect == null || hn.a(edgeEffect) == 0.0f) {
                    z = false;
                } else {
                    hn.b(this.A, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                    z = true;
                }
                EdgeEffect edgeEffect2 = this.C;
                if (edgeEffect2 != null && hn.a(edgeEffect2) != 0.0f) {
                    hn.b(this.C, 0.0f, motionEvent.getY() / getHeight());
                    z = true;
                }
                EdgeEffect edgeEffect3 = this.B;
                if (edgeEffect3 != null && hn.a(edgeEffect3) != 0.0f) {
                    hn.b(this.B, 0.0f, motionEvent.getX() / getWidth());
                    z = true;
                }
                EdgeEffect edgeEffect4 = this.D;
                if (edgeEffect4 == null || hn.a(edgeEffect4) == 0.0f) {
                    if (z || this.ag == 2) {
                    }
                    int[] iArr = this.av;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    i = zU;
                    if (zV) {
                        i = (zU ? 1 : 0) | 2;
                    }
                    al(i, 0);
                } else {
                    hn.b(this.D, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                W(1);
                ab(1);
                int[] iArr2 = this.av;
                iArr2[1] = 0;
                iArr2[0] = 0;
                i = zU;
                if (zV) {
                    i = (zU ? 1 : 0) | 2;
                }
                al(i, 0);
                break;
            case 1:
                this.ai.clear();
                ab(0);
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.ah);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ah + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                if (this.ag != 1) {
                    int i2 = x2 - this.aj;
                    int i3 = y2 - this.ak;
                    if (!zU || Math.abs(i2) <= this.F) {
                        z2 = false;
                    } else {
                        this.al = x2;
                        z2 = true;
                    }
                    if (zV && Math.abs(i3) > this.F) {
                        this.am = y2;
                    } else if (z2) {
                    }
                    W(1);
                }
                break;
            case 3:
                ar();
                break;
            case 5:
                this.ah = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.al = x3;
                this.aj = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.am = y3;
                this.ak = y3;
                break;
            case 6:
                av(motionEvent);
                break;
        }
        return this.ag == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        w();
        Trace.endSection();
        this.t = true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        qc qcVar = this.m;
        if (qcVar == null) {
            u(i, i2);
            return;
        }
        boolean z = false;
        if (qcVar.W()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.m.bk(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.ax = z;
            if (z || this.l == null) {
                return;
            }
            if (this.L.d == 1) {
                as();
            }
            this.m.aP(i, i2);
            this.L.i = true;
            at();
            this.m.aR(i, i2);
            if (this.m.Z()) {
                this.m.aP(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.L.i = true;
                at();
                this.m.aR(i, i2);
            }
            this.ay = getMeasuredWidth();
            this.az = getMeasuredHeight();
            return;
        }
        if (this.s) {
            this.m.bk(i, i2);
            return;
        }
        if (this.w) {
            Z();
            K();
            aw();
            L();
            qp qpVar = this.L;
            if (qpVar.k) {
                qpVar.g = true;
            } else {
                this.e.e();
                this.L.g = false;
            }
            this.w = false;
            aa(false);
        } else if (this.L.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        pu puVar = this.l;
        if (puVar != null) {
            this.L.e = puVar.a();
        } else {
            this.L.e = 0;
        }
        Z();
        this.m.bk(i, i2);
        aa(false);
        this.L.g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (ah()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ql)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ql qlVar = (ql) parcelable;
        this.d = qlVar;
        super.onRestoreInstanceState(qlVar.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        ql qlVar = new ql(super.onSaveInstanceState());
        ql qlVar2 = this.d;
        if (qlVar2 != null) {
            qlVar.a = qlVar2.a;
        } else {
            qc qcVar = this.m;
            qlVar.a = qcVar != null ? qcVar.J() : null;
        }
        return qlVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        F();
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0219  */
    /* JADX WARN: Code duplicated, block: B:125:0x022d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0231  */
    /* JADX WARN: Code duplicated, block: B:131:0x0241  */
    /* JADX WARN: Code duplicated, block: B:136:0x0255  */
    /* JADX WARN: Code duplicated, block: B:138:0x0259  */
    /* JADX WARN: Code duplicated, block: B:142:0x0269 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x026b  */
    /* JADX WARN: Code duplicated, block: B:144:0x026d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0271 A[PHI: r2
      0x0271: PHI (r2v10 int) = (r2v9 int), (r2v13 int) binds: [B:141:0x0267, B:143:0x026b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:147:0x0279  */
    /* JADX WARN: Code duplicated, block: B:148:0x027b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x0281 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:154:0x0289  */
    /* JADX WARN: Code duplicated, block: B:199:0x0330  */
    /* JADX WARN: Code duplicated, block: B:234:0x038d A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:236:0x0391 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:237:0x0393  */
    /* JADX WARN: Code duplicated, block: B:240:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:242:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x0197  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        float f;
        float f2;
        boolean z;
        qe qeVar;
        qr qrVar;
        Interpolator interpolator;
        Interpolator interpolator2;
        RecyclerView recyclerView;
        qc qcVar;
        boolean z2;
        pq pqVarA;
        boolean z3;
        int iBe;
        PointF pointFI;
        MotionEvent motionEvent3;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        EdgeEffect edgeEffect3;
        EdgeEffect edgeEffect4;
        MotionEvent motionEvent4;
        int i;
        boolean z4;
        int i2 = 0;
        if (this.v || this.ab) {
            return false;
        }
        qf qfVar = this.q;
        if (qfVar != null) {
            qfVar.k(motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.q = null;
            }
        } else if (motionEvent.getAction() == 0 || !aB(motionEvent)) {
            qc qcVar2 = this.m;
            if (qcVar2 == null) {
                return false;
            }
            boolean zU = qcVar2.U();
            boolean zV = this.m.V();
            if (this.ai == null) {
                this.ai = VelocityTracker.obtain();
            }
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                int[] iArr = this.av;
                iArr[1] = 0;
                iArr[0] = 0;
                actionMasked = 0;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            int[] iArr2 = this.av;
            motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
            switch (actionMasked) {
                case 0:
                    this.ah = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.al = x;
                    this.aj = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.am = y;
                    this.ak = y;
                    int i3 = zU;
                    if (zV) {
                        i3 = (zU ? 1 : 0) | 2;
                    }
                    al(i3, 0);
                    motionEvent4 = motionEventObtain;
                    this.ai.addMovement(motionEvent4);
                    motionEvent4.recycle();
                    return true;
                case 1:
                    this.ai.addMovement(motionEventObtain);
                    this.ai.computeCurrentVelocity(1000, this.an);
                    float f3 = zU ? -this.ai.getXVelocity(this.ah) : 0.0f;
                    float f4 = zV ? -this.ai.getYVelocity(this.ah) : 0.0f;
                    if (f3 == 0.0f && f4 == 0.0f) {
                        motionEvent2 = motionEventObtain;
                    } else {
                        int i4 = (int) f3;
                        int i5 = (int) f4;
                        qc qcVar3 = this.m;
                        if (qcVar3 == null) {
                            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            motionEvent2 = motionEventObtain;
                        } else {
                            if (!this.v) {
                                int iU = qcVar3.U();
                                boolean zV2 = this.m.V();
                                if (iU == 0 || Math.abs(i4) < this.H) {
                                    i4 = 0;
                                }
                                if (!zV2 || Math.abs(i5) < this.H) {
                                    i5 = 0;
                                }
                                if (i4 != 0) {
                                    if (i4 != 0) {
                                        edgeEffect3 = this.A;
                                        if (edgeEffect3 != null || hn.a(edgeEffect3) == 0.0f) {
                                            edgeEffect4 = this.C;
                                            if (edgeEffect4 != null && hn.a(edgeEffect4) != 0.0f) {
                                                this.C.onAbsorb(i4);
                                                i4 = 0;
                                            }
                                        } else {
                                            this.A.onAbsorb(-i4);
                                            i4 = 0;
                                        }
                                    }
                                    if (i5 != 0) {
                                        edgeEffect = this.B;
                                        if (edgeEffect != null || hn.a(edgeEffect) == 0.0f) {
                                            edgeEffect2 = this.D;
                                            if (edgeEffect2 != null && hn.a(edgeEffect2) != 0.0f) {
                                                this.D.onAbsorb(i5);
                                                i5 = 0;
                                            }
                                        } else {
                                            this.B.onAbsorb(-i5);
                                            i5 = 0;
                                        }
                                    }
                                    if (i4 != 0) {
                                        f = i4;
                                        f2 = i5;
                                        if (dispatchNestedPreFling(f, f2)) {
                                            motionEvent2 = motionEventObtain;
                                        } else {
                                            z = iU != 0 || zV2;
                                            dispatchNestedFling(f, f2, z);
                                            qeVar = this.G;
                                            if (qeVar != null || (qcVar = (recyclerView = qeVar.a).m) == 0 || recyclerView.l == null) {
                                                motionEvent2 = motionEventObtain;
                                            } else {
                                                int i6 = recyclerView.H;
                                                if ((Math.abs(i5) > i6 || Math.abs(i4) > i6) && ((z2 = qcVar instanceof qn))) {
                                                    ps psVar = (ps) qeVar;
                                                    pr prVar = new pr(psVar, psVar.a.getContext());
                                                    int iAk = qcVar.ak();
                                                    if (iAk == 0) {
                                                        motionEvent2 = motionEventObtain;
                                                        iBe = -1;
                                                    } else {
                                                        if (qcVar.V()) {
                                                            pqVarA = psVar.b(qcVar);
                                                        } else {
                                                            pqVarA = qcVar.U() ? psVar.a(qcVar) : null;
                                                        }
                                                        if (pqVarA == null) {
                                                            motionEvent2 = motionEventObtain;
                                                            iBe = -1;
                                                        } else {
                                                            int iAi = qcVar.ai();
                                                            int i7 = 0;
                                                            int i8 = Integer.MIN_VALUE;
                                                            int i9 = Integer.MAX_VALUE;
                                                            View view = null;
                                                            View view2 = null;
                                                            while (i7 < iAi) {
                                                                int i10 = iAi;
                                                                View viewAu = qcVar.au(i7);
                                                                if (viewAu == null) {
                                                                    motionEvent3 = motionEventObtain;
                                                                } else {
                                                                    motionEvent3 = motionEventObtain;
                                                                    int iE = ps.e(viewAu, pqVarA);
                                                                    if (iE <= 0 && iE > i8) {
                                                                        view2 = viewAu;
                                                                        i8 = iE;
                                                                    }
                                                                    if (iE >= 0 && iE < i9) {
                                                                        view = viewAu;
                                                                        i9 = iE;
                                                                    }
                                                                }
                                                                i7++;
                                                                iAi = i10;
                                                                motionEventObtain = motionEvent3;
                                                            }
                                                            motionEvent2 = motionEventObtain;
                                                            if (qcVar.U()) {
                                                                if (i4 > 0) {
                                                                    z3 = true;
                                                                } else {
                                                                    z3 = false;
                                                                }
                                                            } else if (i5 > 0) {
                                                                z3 = true;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            if (z3 && view != null) {
                                                                iBe = qc.be(view);
                                                            } else if (z3 || view2 == null) {
                                                                if (true == z3) {
                                                                    view = view2;
                                                                }
                                                                if (view == null) {
                                                                    iBe = -1;
                                                                } else {
                                                                    iBe = ((z2 && (pointFI = ((qn) qcVar).I(qcVar.ak() + (-1))) != null && ((pointFI.x > 0.0f ? 1 : (pointFI.x == 0.0f ? 0 : -1)) < 0 || (pointFI.y > 0.0f ? 1 : (pointFI.y == 0.0f ? 0 : -1)) < 0)) == z3 ? -1 : 1) + qc.be(view);
                                                                    if (iBe < 0 || iBe >= iAk) {
                                                                        iBe = -1;
                                                                    }
                                                                }
                                                            } else {
                                                                iBe = qc.be(view2);
                                                            }
                                                        }
                                                    }
                                                    if (iBe != -1) {
                                                        prVar.b = iBe;
                                                        qcVar.aT(prVar);
                                                    }
                                                } else {
                                                    motionEvent2 = motionEventObtain;
                                                }
                                            }
                                            if (z) {
                                                if (zV2) {
                                                    iU = (iU == true ? 1 : 0) | 2;
                                                }
                                                al(iU, 1);
                                                int i11 = this.an;
                                                int iMax = Math.max(-i11, Math.min(i4, i11));
                                                int i12 = this.an;
                                                int iMax2 = Math.max(-i12, Math.min(i5, i12));
                                                qrVar = this.I;
                                                qrVar.e.W(2);
                                                qrVar.b = 0;
                                                qrVar.a = 0;
                                                interpolator = qrVar.d;
                                                interpolator2 = a;
                                                if (interpolator != interpolator2) {
                                                    qrVar.d = interpolator2;
                                                    qrVar.c = new OverScroller(qrVar.e.getContext(), interpolator2);
                                                }
                                                qrVar.c.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                qrVar.a();
                                            }
                                        }
                                    } else if (i5 != 0) {
                                        i4 = 0;
                                        f = i4;
                                        f2 = i5;
                                        if (dispatchNestedPreFling(f, f2)) {
                                            if (iU != 0) {
                                                z = true;
                                            }
                                            dispatchNestedFling(f, f2, z);
                                            qeVar = this.G;
                                            if (qeVar != null) {
                                                motionEvent2 = motionEventObtain;
                                            } else {
                                                motionEvent2 = motionEventObtain;
                                            }
                                            if (z) {
                                                if (zV2) {
                                                    iU = (iU == true ? 1 : 0) | 2;
                                                }
                                                al(iU, 1);
                                                int i13 = this.an;
                                                int iMax3 = Math.max(-i13, Math.min(i4, i13));
                                                int i14 = this.an;
                                                int iMax4 = Math.max(-i14, Math.min(i5, i14));
                                                qrVar = this.I;
                                                qrVar.e.W(2);
                                                qrVar.b = 0;
                                                qrVar.a = 0;
                                                interpolator = qrVar.d;
                                                interpolator2 = a;
                                                if (interpolator != interpolator2) {
                                                    qrVar.d = interpolator2;
                                                    qrVar.c = new OverScroller(qrVar.e.getContext(), interpolator2);
                                                }
                                                qrVar.c.fling(0, 0, iMax3, iMax4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                qrVar.a();
                                            }
                                        } else {
                                            motionEvent2 = motionEventObtain;
                                        }
                                    } else {
                                        motionEvent2 = motionEventObtain;
                                    }
                                } else if (i5 != 0) {
                                    i4 = 0;
                                    if (i4 != 0) {
                                        edgeEffect3 = this.A;
                                        if (edgeEffect3 != null) {
                                            edgeEffect4 = this.C;
                                            if (edgeEffect4 != null) {
                                                this.C.onAbsorb(i4);
                                                i4 = 0;
                                            }
                                        } else {
                                            edgeEffect4 = this.C;
                                            if (edgeEffect4 != null) {
                                                this.C.onAbsorb(i4);
                                                i4 = 0;
                                            }
                                        }
                                    }
                                    if (i5 != 0) {
                                        edgeEffect = this.B;
                                        if (edgeEffect != null) {
                                            edgeEffect2 = this.D;
                                            if (edgeEffect2 != null) {
                                                this.D.onAbsorb(i5);
                                                i5 = 0;
                                            }
                                        } else {
                                            edgeEffect2 = this.D;
                                            if (edgeEffect2 != null) {
                                                this.D.onAbsorb(i5);
                                                i5 = 0;
                                            }
                                        }
                                    }
                                    if (i4 != 0) {
                                        f = i4;
                                        f2 = i5;
                                        if (dispatchNestedPreFling(f, f2)) {
                                            if (iU != 0) {
                                                z = true;
                                            }
                                            dispatchNestedFling(f, f2, z);
                                            qeVar = this.G;
                                            if (qeVar != null) {
                                                motionEvent2 = motionEventObtain;
                                            } else {
                                                motionEvent2 = motionEventObtain;
                                            }
                                            if (z) {
                                                if (zV2) {
                                                    iU = (iU == true ? 1 : 0) | 2;
                                                }
                                                al(iU, 1);
                                                int i15 = this.an;
                                                int iMax5 = Math.max(-i15, Math.min(i4, i15));
                                                int i16 = this.an;
                                                int iMax6 = Math.max(-i16, Math.min(i5, i16));
                                                qrVar = this.I;
                                                qrVar.e.W(2);
                                                qrVar.b = 0;
                                                qrVar.a = 0;
                                                interpolator = qrVar.d;
                                                interpolator2 = a;
                                                if (interpolator != interpolator2) {
                                                    qrVar.d = interpolator2;
                                                    qrVar.c = new OverScroller(qrVar.e.getContext(), interpolator2);
                                                }
                                                qrVar.c.fling(0, 0, iMax5, iMax6, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                qrVar.a();
                                            }
                                        } else {
                                            motionEvent2 = motionEventObtain;
                                        }
                                    } else if (i5 != 0) {
                                        i4 = 0;
                                        f = i4;
                                        f2 = i5;
                                        if (dispatchNestedPreFling(f, f2)) {
                                            if (iU != 0) {
                                                z = true;
                                            }
                                            dispatchNestedFling(f, f2, z);
                                            qeVar = this.G;
                                            if (qeVar != null) {
                                                motionEvent2 = motionEventObtain;
                                            } else {
                                                motionEvent2 = motionEventObtain;
                                            }
                                            if (z) {
                                                if (zV2) {
                                                    iU = (iU == true ? 1 : 0) | 2;
                                                }
                                                al(iU, 1);
                                                int i17 = this.an;
                                                int iMax7 = Math.max(-i17, Math.min(i4, i17));
                                                int i18 = this.an;
                                                int iMax8 = Math.max(-i18, Math.min(i5, i18));
                                                qrVar = this.I;
                                                qrVar.e.W(2);
                                                qrVar.b = 0;
                                                qrVar.a = 0;
                                                interpolator = qrVar.d;
                                                interpolator2 = a;
                                                if (interpolator != interpolator2) {
                                                    qrVar.d = interpolator2;
                                                    qrVar.c = new OverScroller(qrVar.e.getContext(), interpolator2);
                                                }
                                                qrVar.c.fling(0, 0, iMax7, iMax8, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                qrVar.a();
                                            }
                                        } else {
                                            motionEvent2 = motionEventObtain;
                                        }
                                    } else {
                                        motionEvent2 = motionEventObtain;
                                    }
                                } else {
                                    motionEvent2 = motionEventObtain;
                                }
                                az();
                                motionEvent4 = motionEvent2;
                                motionEvent4.recycle();
                                return true;
                            }
                            motionEvent2 = motionEventObtain;
                        }
                    }
                    W(0);
                    az();
                    motionEvent4 = motionEvent2;
                    motionEvent4.recycle();
                    return true;
                case 2:
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.ah);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ah + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    int iMax9 = this.al - x2;
                    int iMax10 = this.am - y2;
                    if (this.ag != 1) {
                        if (zU) {
                            iMax9 = iMax9 > 0 ? Math.max(0, iMax9 - this.F) : Math.min(0, iMax9 + this.F);
                            z4 = iMax9 != 0;
                        } else {
                            z4 = false;
                        }
                        if (zV) {
                            iMax10 = iMax10 > 0 ? Math.max(0, iMax10 - this.F) : Math.min(0, iMax10 + this.F);
                            if (iMax10 != 0) {
                                z4 = true;
                            }
                        }
                        if (z4) {
                            W(1);
                        }
                    }
                    if (this.ag == 1) {
                        int[] iArr3 = this.Q;
                        iArr3[0] = 0;
                        iArr3[1] = 0;
                        int iA = iMax9 - a(iMax9, motionEvent.getY());
                        int iAp = iMax10 - ap(iMax10, motionEvent.getX());
                        if (ae(true != zU ? 0 : iA, true != zV ? 0 : iAp, this.Q, this.au, 0)) {
                            int[] iArr4 = this.Q;
                            iA -= iArr4[0];
                            int i19 = iAp - iArr4[1];
                            int[] iArr5 = this.av;
                            int i20 = iArr5[0];
                            int[] iArr6 = this.au;
                            iArr5[0] = i20 + iArr6[0];
                            iArr5[1] = iArr5[1] + iArr6[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                            i = i19;
                        } else {
                            i = iAp;
                        }
                        int[] iArr7 = this.au;
                        this.al = x2 - iArr7[0];
                        this.am = y2 - iArr7[1];
                        if (ai(true != zU ? 0 : iA, true != zV ? 0 : i, motionEvent, 0)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        ow owVar = this.J;
                        if (owVar != null) {
                            if (iA != 0) {
                                i2 = iA;
                            } else if (i != 0) {
                            }
                            owVar.a(this, i2, i);
                        }
                    }
                    motionEvent4 = motionEventObtain;
                    this.ai.addMovement(motionEvent4);
                    motionEvent4.recycle();
                    return true;
                case 3:
                    ar();
                    motionEvent4 = motionEventObtain;
                    this.ai.addMovement(motionEvent4);
                    motionEvent4.recycle();
                    return true;
                case 4:
                default:
                    motionEvent4 = motionEventObtain;
                    this.ai.addMovement(motionEvent4);
                    motionEvent4.recycle();
                    return true;
                case 5:
                    this.ah = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.al = x3;
                    this.aj = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.am = y3;
                    this.ak = y3;
                    motionEvent4 = motionEventObtain;
                    this.ai.addMovement(motionEvent4);
                    motionEvent4.recycle();
                    return true;
                case 6:
                    av(motionEvent);
                    motionEvent4 = motionEventObtain;
                    this.ai.addMovement(motionEvent4);
                    motionEvent4.recycle();
                    return true;
            }
        }
        ar();
        return true;
    }

    public final void p(String str) {
        if (ah()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + k());
        }
        if (this.af > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + k()));
        }
    }

    final void r() {
        int iC = this.f.c();
        for (int i = 0; i < iC; i++) {
            qs qsVarH = h(this.f.f(i));
            if (!qsVarH.z()) {
                qsVarH.f();
            }
        }
        qi qiVar = this.c;
        int size = qiVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((qs) qiVar.c.get(i2)).f();
        }
        int size2 = qiVar.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((qs) qiVar.a.get(i3)).f();
        }
        ArrayList arrayList = qiVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((qs) qiVar.b.get(i4)).f();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        qs qsVarH = h(view);
        if (qsVarH != null) {
            if (qsVarH.w()) {
                qsVarH.i();
            } else if (!qsVarH.z()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + qsVarH + k());
            }
        }
        view.clearAnimation();
        v(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.m.aV() && !ah() && view2 != null) {
            ax(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.m.aX(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            ((qf) this.p.get(i)).j();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.aa != 0 || this.v) {
            this.u = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2) {
        EdgeEffect edgeEffect = this.A;
        boolean zIsFinished = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.A.onRelease();
            zIsFinished = this.A.isFinished();
        }
        EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.C.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.B.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.D.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            gl.z(this);
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        qc qcVar = this.m;
        if (qcVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        boolean zU = qcVar.U();
        boolean zV = this.m.V();
        if (!zU) {
            if (!zV) {
                return;
            } else {
                zV = true;
            }
        }
        if (true != zU) {
            i = 0;
        }
        if (true != zV) {
            i2 = 0;
        }
        ai(i, i2, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!ah()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.ac |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.h) {
            F();
        }
        this.h = z;
        super.setClipToPadding(z);
        if (this.t) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        aq().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return aq().i(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        aq().b(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.v) {
            p("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.v = true;
                this.ab = true;
                ac();
                return;
            }
            this.v = false;
            if (this.u && this.m != null && this.l != null) {
                requestLayout();
            }
            this.u = false;
        }
    }

    public final void t() {
        if (!this.t || this.y) {
            Trace.beginSection("RV FullInvalidate");
            w();
            Trace.endSection();
            return;
        }
        if (this.e.l()) {
            if (!this.e.k(4) || this.e.k(11)) {
                if (this.e.l()) {
                    Trace.beginSection("RV FullInvalidate");
                    w();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            Z();
            K();
            this.e.g();
            if (!this.u) {
                int iA = this.f.a();
                for (int i = 0; i < iA; i++) {
                    qs qsVarH = h(this.f.e(i));
                    if (qsVarH != null && !qsVarH.z() && qsVarH.x()) {
                        w();
                    }
                }
                this.e.d();
            }
            aa(true);
            L();
            Trace.endSection();
        }
    }

    public final void u(int i, int i2) {
        setMeasuredDimension(qc.ah(i, getPaddingLeft() + getPaddingRight(), gl.h(this)), qc.ah(i2, getPaddingTop() + getPaddingBottom(), gl.g(this)));
    }

    public final void v(View view) {
        h(view);
        List list = this.x;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x030c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0316  */
    /* JADX WARN: Code duplicated, block: B:163:0x0351  */
    /* JADX WARN: Code duplicated, block: B:171:0x036a  */
    /* JADX WARN: Code duplicated, block: B:173:0x0372  */
    /* JADX WARN: Code duplicated, block: B:176:0x037a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0382  */
    /* JADX WARN: Code duplicated, block: B:182:0x0389  */
    /* JADX WARN: Code duplicated, block: B:185:0x0394 A[LOOP:4: B:178:0x0380->B:185:0x0394, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:188:0x039f  */
    /* JADX WARN: Code duplicated, block: B:191:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:194:0x03b1 A[LOOP:5: B:187:0x039d->B:194:0x03b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:197:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:237:0x0397 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0397 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0391 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x03b5 A[EDGE_INSN: B:242:0x03b5->B:196:0x03b5 BREAK  A[LOOP:5: B:187:0x039d->B:194:0x03b1], SYNTHETIC] */
    final void w() {
        long j;
        qs qsVar;
        int i;
        int iA;
        int i2;
        int iMin;
        qs qsVarF;
        qs qsVarF2;
        int i3;
        View viewFindViewById;
        pu puVar;
        if (this.l == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.L.i = false;
        boolean z = this.ax ? (this.ay == getWidth() && this.az == getHeight()) ? false : true : false;
        this.ay = 0;
        this.az = 0;
        this.ax = false;
        if (this.L.d == 1) {
            as();
            this.m.aO(this);
            at();
        } else {
            mn mnVar = this.e;
            if ((mnVar.b.isEmpty() || mnVar.a.isEmpty()) && !z && this.m.C == getWidth() && this.m.D == getHeight()) {
                this.m.aO(this);
            } else {
                this.m.aO(this);
                at();
            }
        }
        int i4 = 4;
        this.L.b(4);
        Z();
        K();
        qp qpVar = this.L;
        qpVar.d = 1;
        View view = null;
        if (qpVar.j) {
            int iA2 = this.f.a() - 1;
            while (iA2 >= 0) {
                qs qsVarH = h(this.f.e(iA2));
                if (!qsVarH.z()) {
                    long jD = d(qsVarH);
                    px pxVarC = py.c();
                    pxVarC.a(qsVarH);
                    qs qsVar2 = (qs) this.g.b.c(jD);
                    if (qsVar2 == null || qsVar2.z()) {
                        this.g.d(qsVarH, pxVarC);
                    } else {
                        boolean zI = this.g.i(qsVar2);
                        boolean zI2 = this.g.i(qsVarH);
                        if (zI && qsVar2 == qsVarH) {
                            this.g.d(qsVarH, pxVarC);
                        } else {
                            px pxVarA = this.g.a(qsVar2, i4);
                            this.g.d(qsVarH, pxVarC);
                            px pxVarA2 = this.g.a(qsVarH, 8);
                            if (pxVarA == null) {
                                int iA3 = this.f.a();
                                for (int i5 = 0; i5 < iA3; i5++) {
                                    qs qsVarH2 = h(this.f.e(i5));
                                    if (qsVarH2 != qsVarH && d(qsVarH2) == jD) {
                                        pu puVar2 = this.l;
                                        if (puVar2 == null || !puVar2.b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + qsVarH2 + " \n View Holder 2:" + qsVarH + k());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + qsVarH2 + " \n View Holder 2:" + qsVarH + k());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + qsVar2 + " cannot be found but it is necessary for " + qsVarH + k());
                            } else {
                                qsVar2.m(false);
                                if (zI) {
                                    o(qsVar2);
                                }
                                if (qsVar2 != qsVarH) {
                                    if (zI2) {
                                        o(qsVarH);
                                    }
                                    qsVar2.h = qsVarH;
                                    o(qsVar2);
                                    this.c.l(qsVar2);
                                    qsVarH.m(false);
                                    qsVarH.i = qsVar2;
                                }
                                if (this.E.f(qsVar2, qsVarH, pxVarA, pxVarA2)) {
                                    N();
                                }
                            }
                        }
                    }
                }
                iA2--;
                i4 = 4;
            }
            sc scVar = this.g;
            pz pzVar = this.aC;
            for (int i6 = scVar.a.j - 1; i6 >= 0; i6--) {
                qs qsVar3 = (qs) scVar.a.f(i6);
                sb sbVar = (sb) scVar.a.g(i6);
                int i7 = sbVar.b;
                if ((i7 & 3) == 3) {
                    pzVar.m(qsVar3);
                } else if ((i7 & 1) != 0) {
                    px pxVar = sbVar.c;
                    if (pxVar == null) {
                        pzVar.m(qsVar3);
                    } else {
                        pzVar.l(qsVar3, pxVar, sbVar.d);
                    }
                } else if ((i7 & 14) == 14) {
                    pzVar.k(qsVar3, sbVar.c, sbVar.d);
                } else if ((i7 & 12) == 12) {
                    px pxVar2 = sbVar.c;
                    px pxVar3 = sbVar.d;
                    qsVar3.m(false);
                    RecyclerView recyclerView = pzVar.a;
                    if (!recyclerView.y) {
                        py pyVar = recyclerView.E;
                        int i8 = pxVar2.a;
                        int i9 = pxVar3.a;
                        if (i8 == i9 && pxVar2.b == pxVar3.b) {
                            pyVar.a(qsVar3);
                        } else if (pyVar.k(qsVar3, i8, pxVar2.b, i9, pxVar3.b)) {
                            pzVar.a.N();
                        }
                    } else if (recyclerView.E.f(qsVar3, qsVar3, pxVar2, pxVar3)) {
                        pzVar.a.N();
                    }
                } else if ((i7 & 4) != 0) {
                    pzVar.l(qsVar3, sbVar.c, null);
                } else if ((i7 & 8) != 0) {
                    pzVar.k(qsVar3, sbVar.c, sbVar.d);
                }
                sb.b(sbVar);
            }
        }
        this.m.aJ(this.c);
        qp qpVar2 = this.L;
        qpVar2.b = qpVar2.e;
        this.y = false;
        this.z = false;
        qpVar2.j = false;
        qpVar2.k = false;
        this.m.u = false;
        ArrayList arrayList = this.c.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        qc qcVar = this.m;
        if (qcVar.z) {
            qcVar.y = 0;
            qcVar.z = false;
            this.c.m();
        }
        this.m.o(this.L);
        L();
        aa(false);
        this.g.f();
        int[] iArr = this.as;
        int i10 = iArr[0];
        int i11 = iArr[1];
        au(iArr);
        int[] iArr2 = this.as;
        if (iArr2[0] != i10 || iArr2[1] != i11) {
            y(0, 0);
        }
        if (this.aq && this.l != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = this.L.m;
                if (j != -1) {
                    puVar = this.l;
                    if (puVar.b) {
                        qsVar = null;
                    } else {
                        qsVar = null;
                    }
                } else {
                    qsVar = null;
                }
                if (qsVar != null) {
                    if (this.f.a() > 0) {
                        qp qpVar3 = this.L;
                        int i12 = qpVar3.l;
                        if (i12 != -1) {
                        }
                        iA = qpVar3.a();
                        i2 = i;
                        while (true) {
                            if (i2 < iA) {
                                qsVarF2 = f(i2);
                                if (qsVarF2 != null) {
                                    if (qsVarF2.a.hasFocusable()) {
                                        view = qsVarF2.a;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            for (iMin = Math.min(iA, i) - 1; iMin >= 0; iMin--) {
                                qsVarF = f(iMin);
                                if (qsVarF == null) {
                                    break;
                                    break;
                                } else {
                                    if (qsVarF.a.hasFocusable()) {
                                        view = qsVarF.a;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (this.f.a() > 0) {
                    qp qpVar4 = this.L;
                    int i13 = qpVar4.l;
                    if (i13 != -1) {
                    }
                    iA = qpVar4.a();
                    i2 = i;
                    while (true) {
                        if (i2 < iA) {
                            qsVarF2 = f(i2);
                            if (qsVarF2 != null) {
                                if (qsVarF2.a.hasFocusable()) {
                                    view = qsVarF2.a;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            qsVarF = f(iMin);
                            if (qsVarF == null) {
                                break;
                                break;
                            } else {
                                if (qsVarF.a.hasFocusable()) {
                                    view = qsVarF.a;
                                    break;
                                }
                            }
                        }
                    }
                }
                if (view != null) {
                    i3 = this.L.n;
                    if (i3 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            } else if (this.f.k(getFocusedChild())) {
                j = this.L.m;
                if (j != -1) {
                    puVar = this.l;
                    if (puVar.b || puVar == null) {
                        qsVar = null;
                    } else {
                        int iC = this.f.c();
                        qsVar = null;
                        for (int i14 = 0; i14 < iC; i14++) {
                            qs qsVarH3 = h(this.f.f(i14));
                            if (qsVarH3 != null && !qsVarH3.u() && qsVarH3.e == j) {
                                if (!this.f.k(qsVarH3.a)) {
                                    qsVar = qsVarH3;
                                    break;
                                }
                                qsVar = qsVarH3;
                            }
                        }
                    }
                } else {
                    qsVar = null;
                }
                if (qsVar != null && !this.f.k(qsVar.a) && qsVar.a.hasFocusable()) {
                    view = qsVar.a;
                } else if (this.f.a() > 0) {
                    qp qpVar5 = this.L;
                    int i15 = qpVar5.l;
                    i = i15 != -1 ? i15 : 0;
                    iA = qpVar5.a();
                    i2 = i;
                    while (true) {
                        if (i2 < iA) {
                            qsVarF2 = f(i2);
                            if (qsVarF2 != null) {
                                if (qsVarF2.a.hasFocusable()) {
                                    view = qsVarF2.a;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            qsVarF = f(iMin);
                            if (qsVarF == null) {
                                break;
                            }
                            if (qsVarF.a.hasFocusable()) {
                                view = qsVarF.a;
                                break;
                            }
                        }
                    }
                }
                if (view != null) {
                    i3 = this.L.n;
                    if (i3 != -1 && (viewFindViewById = view.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            }
        }
        ay();
    }

    public final void x(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        aq().g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void y(int i, int i2) {
        this.af++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        List list = this.ar;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((gg) this.ar.get(size)).c(this, i, i2);
            }
        }
        this.af--;
    }

    public final void z() {
        if (this.D != null) {
            return;
        }
        EdgeEffect edgeEffectB = this.aB.b(this);
        this.D = edgeEffectB;
        if (this.h) {
            edgeEffectB.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectB.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
