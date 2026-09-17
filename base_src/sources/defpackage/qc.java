package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qc {
    public int A;
    public int B;
    public int C;
    public int D;
    private final rz L;
    private final rz M;
    ny p;
    public RecyclerView q;
    public final sa r;
    public final sa s;
    public qo t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public qc() {
        qa qaVar = new qa(this, 1);
        this.L = qaVar;
        qa qaVar2 = new qa(this, 0);
        this.M = qaVar2;
        this.r = new sa(qaVar);
        this.s = new sa(qaVar2);
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = true;
    }

    public static boolean aU(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        switch (mode) {
            case Integer.MIN_VALUE:
                return size >= i;
            case 0:
                return true;
            case 1073741824:
                return size == i;
            default:
                return false;
        }
    }

    public static int ah(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                return Math.min(size, Math.max(i2, i3));
            case 1073741824:
                return size;
            default:
                return Math.max(i2, i3);
        }
    }

    public static int aj(int i, int i2, int i3, int i4, boolean z) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else {
                if (i4 == -1) {
                    switch (i2) {
                        case Integer.MIN_VALUE:
                        case 1073741824:
                            i4 = iMax;
                            break;
                    }
                }
                i2 = 0;
                i4 = 0;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else {
            if (i4 != -1) {
                if (i4 == -2) {
                    i2 = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? Integer.MIN_VALUE : 0;
                } else {
                    i2 = 0;
                    i4 = 0;
                }
            }
            i4 = iMax;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static qb as(Context context, AttributeSet attributeSet, int i, int i2) {
        qb qbVar = new qb();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jt.a, i, i2);
        qbVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        qbVar.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        qbVar.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        qbVar.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return qbVar;
    }

    private final void bH(View view, int i, boolean z) {
        qs qsVarH = RecyclerView.h(view);
        if (z || qsVarH.u()) {
            this.q.g.b(qsVarH);
        } else {
            this.q.g.g(qsVarH);
        }
        qd qdVar = (qd) view.getLayoutParams();
        if (qsVarH.A() || qsVarH.v()) {
            if (qsVarH.v()) {
                qsVarH.o();
            } else {
                qsVarH.h();
            }
            this.p.h(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.q) {
            int iD = this.p.d(view);
            if (i == -1) {
                i = this.p.a();
            }
            if (iD == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.q.indexOfChild(view) + this.q.k());
            }
            if (iD != i) {
                qc qcVar = this.q.m;
                View viewAu = qcVar.au(iD);
                if (viewAu == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iD + qcVar.q.toString());
                }
                qcVar.aC(iD);
                qd qdVar2 = (qd) viewAu.getLayoutParams();
                qs qsVarH2 = RecyclerView.h(viewAu);
                if (qsVarH2.u()) {
                    qcVar.q.g.b(qsVarH2);
                } else {
                    qcVar.q.g.g(qsVarH2);
                }
                qcVar.p.h(viewAu, i, qdVar2, qsVarH2.u());
            }
        } else {
            this.p.g(view, i, false);
            qdVar.e = true;
            qo qoVar = this.t;
            if (qoVar != null && qoVar.f && qo.i(view) == qoVar.b) {
                qoVar.g = view;
            }
        }
        if (qdVar.f) {
            qsVarH.a.invalidate();
            qdVar.f = false;
        }
    }

    public static final int ba(View view) {
        return ((qd) view.getLayoutParams()).d.bottom;
    }

    public static final int bb(View view) {
        Rect rect = ((qd) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int bc(View view) {
        Rect rect = ((qd) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bd(View view) {
        return ((qd) view.getLayoutParams()).d.left;
    }

    public static final int be(View view) {
        return ((qd) view.getLayoutParams()).a();
    }

    public static final int bf(View view) {
        return ((qd) view.getLayoutParams()).d.right;
    }

    public static final int bg(View view) {
        return ((qd) view.getLayoutParams()).d.top;
    }

    public static final void bi(View view, int i, int i2, int i3, int i4) {
        qd qdVar = (qd) view.getLayoutParams();
        Rect rect = qdVar.d;
        view.layout(i + rect.left + qdVar.leftMargin, i2 + rect.top + qdVar.topMargin, (i3 - rect.right) - qdVar.rightMargin, (i4 - rect.bottom) - qdVar.bottomMargin);
    }

    public static final int bn(View view) {
        return view.getBottom() + ba(view);
    }

    public static final int bo(View view) {
        return view.getLeft() - bd(view);
    }

    public static final int bp(View view) {
        return view.getRight() + bf(view);
    }

    public static final int bq(View view) {
        return view.getTop() - bg(view);
    }

    public int A(qp qpVar) {
        throw null;
    }

    public int B(qp qpVar) {
        throw null;
    }

    public int C(qp qpVar) {
        throw null;
    }

    public int D(qp qpVar) {
        throw null;
    }

    public Parcelable J() {
        throw null;
    }

    public View L(int i) {
        int iAi = ai();
        for (int i2 = 0; i2 < iAi; i2++) {
            View viewAu = au(i2);
            qs qsVarH = RecyclerView.h(viewAu);
            if (qsVarH != null && qsVarH.b() == i && !qsVarH.z() && (this.q.L.g || !qsVarH.u())) {
                return viewAu;
            }
        }
        return null;
    }

    public void M(String str) {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            recyclerView.p(str);
        }
    }

    public void P(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.q;
        qi qiVar = recyclerView.c;
        qp qpVar = recyclerView.L;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.q.canScrollVertically(-1) && !this.q.canScrollHorizontally(-1) && !this.q.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        pu puVar = this.q.l;
        if (puVar != null) {
            accessibilityEvent.setItemCount(puVar.a());
        }
    }

    public void Q(Parcelable parcelable) {
    }

    public void R(int i) {
        throw null;
    }

    public boolean U() {
        throw null;
    }

    public boolean V() {
        throw null;
    }

    public boolean W() {
        throw null;
    }

    public boolean Z() {
        return false;
    }

    public int a(qi qiVar, qp qpVar) {
        return -1;
    }

    public final void aA(View view, Rect rect) {
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.e(view));
        }
    }

    public final void aB(qi qiVar) {
        for (int iAi = ai() - 1; iAi >= 0; iAi--) {
            View viewAu = au(iAi);
            qs qsVarH = RecyclerView.h(viewAu);
            if (!qsVarH.z()) {
                if (!qsVarH.s() || qsVarH.u() || this.q.l.b) {
                    aC(iAi);
                    qiVar.k(viewAu);
                    this.q.g.g(qsVarH);
                } else {
                    aM(iAi);
                    qiVar.j(qsVarH);
                }
            }
        }
    }

    public final void aC(int i) {
        au(i);
        this.p.i(i);
    }

    public void aD(int i) {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            int iA = recyclerView.f.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.f.e(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void aE(int i) {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            int iA = recyclerView.f.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.f.e(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void aF(qi qiVar, qp qpVar, hb hbVar) {
        if (this.q.canScrollVertically(-1) || this.q.canScrollHorizontally(-1)) {
            hbVar.b(8192);
            hbVar.i(true);
        }
        if (this.q.canScrollVertically(1) || this.q.canScrollHorizontally(1)) {
            hbVar.b(4096);
            hbVar.i(true);
        }
        hbVar.f(kkm.d(b(qiVar, qpVar), a(qiVar, qpVar), 0));
    }

    public final void aG(View view, hb hbVar) {
        qs qsVarH = RecyclerView.h(view);
        if (qsVarH == null || qsVarH.u() || this.p.k(qsVarH.a)) {
            return;
        }
        RecyclerView recyclerView = this.q;
        m(recyclerView.c, recyclerView.L, view, hbVar);
    }

    public void aH(int i) {
    }

    public final void aI(qi qiVar) {
        for (int iAi = ai() - 1; iAi >= 0; iAi--) {
            if (!RecyclerView.h(au(iAi)).z()) {
                aL(iAi, qiVar);
            }
        }
    }

    public final void aJ(qi qiVar) {
        int size = qiVar.a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((qs) qiVar.a.get(i)).a;
            qs qsVarH = RecyclerView.h(view);
            if (!qsVarH.z()) {
                qsVarH.m(false);
                if (qsVarH.w()) {
                    this.q.removeDetachedView(view, false);
                }
                py pyVar = this.q.E;
                if (pyVar != null) {
                    pyVar.h(qsVarH);
                }
                qsVarH.m(true);
                qiVar.f(view);
            }
        }
        qiVar.a.clear();
        ArrayList arrayList = qiVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.q.invalidate();
        }
    }

    public final void aK(View view, qi qiVar) {
        ny nyVar = this.p;
        int iG = nyVar.c.g(view);
        if (iG >= 0) {
            if (nyVar.a.g(iG)) {
                nyVar.l(view);
            }
            nyVar.c.j(iG);
        }
        qiVar.i(view);
    }

    public final void aL(int i, qi qiVar) {
        View viewAu = au(i);
        aM(i);
        qiVar.i(viewAu);
    }

    public final void aM(int i) {
        ny nyVar;
        int iB;
        View viewH;
        if (au(i) == null || (viewH = nyVar.c.h((iB = (nyVar = this.p).b(i)))) == null) {
            return;
        }
        if (nyVar.a.g(iB)) {
            nyVar.l(viewH);
        }
        nyVar.c.j(iB);
    }

    public final void aN() {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void aO(RecyclerView recyclerView) {
        aP(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void aP(int i, int i2) {
        this.C = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A = mode;
        if (mode == 0) {
            int i3 = RecyclerView.S;
        }
        this.D = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.B = mode2;
        if (mode2 == 0) {
            int i4 = RecyclerView.S;
        }
    }

    public final void aQ(int i, int i2) {
        this.q.setMeasuredDimension(i, i2);
    }

    public final void aR(int i, int i2) {
        int iAi = ai();
        if (iAi == 0) {
            this.q.u(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iAi; i7++) {
            View viewAu = au(i7);
            Rect rect = this.q.j;
            RecyclerView.E(viewAu, rect);
            if (rect.left < i5) {
                i5 = rect.left;
            }
            if (rect.right > i3) {
                i3 = rect.right;
            }
            if (rect.top < i6) {
                i6 = rect.top;
            }
            if (rect.bottom > i4) {
                i4 = rect.bottom;
            }
        }
        this.q.j.set(i5, i6, i3, i4);
        p(this.q.j, i, i2);
    }

    public final void aS(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.q = null;
            this.p = null;
            this.C = 0;
            this.D = 0;
        } else {
            this.q = recyclerView;
            this.p = recyclerView.f;
            this.C = recyclerView.getWidth();
            this.D = recyclerView.getHeight();
        }
        this.A = 1073741824;
        this.B = 1073741824;
    }

    public final void aT(qo qoVar) {
        qo qoVar2 = this.t;
        if (qoVar2 != null && qoVar != qoVar2 && qoVar2.f) {
            qoVar2.f();
        }
        this.t = qoVar;
        RecyclerView recyclerView = this.q;
        recyclerView.I.c();
        if (qoVar.h) {
            Log.w("RecyclerView", "An instance of " + qoVar.getClass().getSimpleName() + " was started more than once. Each instance of" + qoVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        qoVar.c = recyclerView;
        qoVar.d = this;
        int i = qoVar.b;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        RecyclerView recyclerView2 = qoVar.c;
        recyclerView2.L.a = i;
        qoVar.f = true;
        qoVar.e = true;
        qoVar.g = recyclerView2.m.L(qoVar.b);
        qoVar.c.I.a();
        qoVar.h = true;
    }

    public final boolean aV() {
        qo qoVar = this.t;
        return qoVar != null && qoVar.f;
    }

    public boolean aW(qi qiVar, qp qpVar, int i, Bundle bundle) {
        int iAr;
        int iAp;
        RecyclerView recyclerView = this.q;
        int i2 = 0;
        if (recyclerView == null) {
            return false;
        }
        switch (i) {
            case 4096:
                iAr = recyclerView.canScrollVertically(1) ? (this.D - ar()) - ao() : 0;
                iAp = !this.q.canScrollHorizontally(1) ? 0 : (this.C - ap()) - aq();
                break;
            case 8192:
                iAr = recyclerView.canScrollVertically(-1) ? -((this.D - ar()) - ao()) : 0;
                iAp = !this.q.canScrollHorizontally(-1) ? 0 : -((this.C - ap()) - aq());
                break;
            default:
                iAr = 0;
                iAp = 0;
                break;
        }
        if (iAr != 0) {
            i2 = iAr;
        } else if (iAp == 0) {
            return false;
        }
        this.q.ak(iAp, i2, true);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00be  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        if (r3 != 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean aX(android.support.v7.widget.RecyclerView r17, android.view.View r18, android.graphics.Rect r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qc.aX(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final boolean aY(View view, int i, int i2, qd qdVar) {
        return (!view.isLayoutRequested() && this.w && aU(view.getWidth(), i, qdVar.width) && aU(view.getHeight(), i2, qdVar.height)) ? false : true;
    }

    public final void aZ() {
        this.v = true;
    }

    public void aa(int i, int i2, qp qpVar, ou ouVar) {
    }

    public void ab(int i, ou ouVar) {
    }

    public void af(RecyclerView recyclerView) {
    }

    public void ag(RecyclerView recyclerView, int i) {
        throw null;
    }

    public final int ai() {
        ny nyVar = this.p;
        if (nyVar != null) {
            return nyVar.a();
        }
        return 0;
    }

    public final int ak() {
        RecyclerView recyclerView = this.q;
        pu puVar = recyclerView != null ? recyclerView.l : null;
        if (puVar != null) {
            return puVar.a();
        }
        return 0;
    }

    public final int al() {
        return gl.f(this.q);
    }

    public final int am() {
        return gl.g(this.q);
    }

    public final int an() {
        return gl.h(this.q);
    }

    public final int ao() {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int ap() {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int aq() {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int ar() {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final View at(View view) {
        View viewJ;
        RecyclerView recyclerView = this.q;
        if (recyclerView == null || (viewJ = recyclerView.j(view)) == null || this.p.k(viewJ)) {
            return null;
        }
        return viewJ;
    }

    public final View au(int i) {
        ny nyVar = this.p;
        if (nyVar != null) {
            return nyVar.e(i);
        }
        return null;
    }

    public final View av() {
        View focusedChild;
        RecyclerView recyclerView = this.q;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.p.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void aw(View view) {
        ax(view, -1);
    }

    public final void ax(View view, int i) {
        bH(view, i, true);
    }

    public final void ay(View view) {
        az(view, -1);
    }

    public final void az(View view, int i) {
        bH(view, i, false);
    }

    public int b(qi qiVar, qp qpVar) {
        return -1;
    }

    public final void bh(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((qd) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.q != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.q.k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void bj() {
    }

    public final void bk(int i, int i2) {
        this.q.u(i, i2);
    }

    public final void bl(Runnable runnable) {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    public final void bm(RecyclerView recyclerView) {
        this.v = false;
        af(recyclerView);
    }

    public int d(int i, qi qiVar, qp qpVar) {
        throw null;
    }

    public int e(int i, qi qiVar, qp qpVar) {
        throw null;
    }

    public abstract qd f();

    public qd g(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof qd) {
            return new qd((qd) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new qd((ViewGroup.MarginLayoutParams) layoutParams) : new qd(layoutParams);
    }

    public qd h(Context context, AttributeSet attributeSet) {
        return new qd(context, attributeSet);
    }

    public View j(View view, int i, qi qiVar, qp qpVar) {
        throw null;
    }

    public void m(qi qiVar, qp qpVar, View view, hb hbVar) {
    }

    public void n(qi qiVar, qp qpVar) {
        throw null;
    }

    public void o(qp qpVar) {
    }

    public void p(Rect rect, int i, int i2) {
        int iWidth = rect.width();
        int iAp = ap();
        int iAq = aq();
        int iHeight = rect.height();
        int iAr = ar();
        aQ(ah(i, iWidth + iAp + iAq, an()), ah(i2, iHeight + iAr + ao(), am()));
    }

    public boolean r(qd qdVar) {
        return qdVar != null;
    }

    public boolean s() {
        throw null;
    }

    public void u(int i, int i2) {
    }

    public void v() {
    }

    public void w(int i, int i2) {
    }

    public void x(int i, int i2) {
    }

    public int y(qp qpVar) {
        throw null;
    }

    public int z(qp qpVar) {
        throw null;
    }
}
