package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.camera.bottombar.R;
import defpackage.gh;
import defpackage.ou;
import defpackage.pb;
import defpackage.pc;
import defpackage.pd;
import defpackage.pe;
import defpackage.pq;
import defpackage.qb;
import defpackage.qc;
import defpackage.qd;
import defpackage.qi;
import defpackage.qn;
import defpackage.qo;
import defpackage.qp;
import defpackage.qs;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends qc implements qn {
    private pd a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final pc f;
    private int g;
    private int[] h;
    public int i;
    pq j;
    boolean k;
    int l;
    int m;
    pe n;
    final pb o;

    public LinearLayoutManager() {
        this.i = 1;
        this.c = false;
        this.k = false;
        this.d = false;
        this.e = true;
        this.l = -1;
        this.m = Integer.MIN_VALUE;
        this.n = null;
        this.o = new pb();
        this.f = new pc();
        this.g = 2;
        this.h = new int[2];
        S(1);
        T(false);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = 1;
        this.c = false;
        this.k = false;
        this.d = false;
        this.e = true;
        this.l = -1;
        this.m = Integer.MIN_VALUE;
        this.n = null;
        this.o = new pb();
        this.f = new pc();
        this.g = 2;
        this.h = new int[2];
        qb qbVarAs = as(context, attributeSet, i, i2);
        S(qbVarAs.a);
        T(qbVarAs.c);
        q(qbVarAs.d);
    }

    private final void bA(qi qiVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                aL(i, qiVar);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    aL(i2, qiVar);
                }
            }
        }
    }

    private final void bB() {
        this.k = (this.i == 1 || !X()) ? this.c : !this.c;
    }

    private final void bC(int i, int i2, boolean z, qp qpVar) {
        int iJ;
        this.a.m = Y();
        this.a.f = i;
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        N(qpVar, iArr);
        int iMax = Math.max(0, this.h[0]);
        int iMax2 = Math.max(0, this.h[1]);
        pd pdVar = this.a;
        int i3 = i == 1 ? iMax2 : iMax;
        pdVar.h = i3;
        if (i != 1) {
            iMax = iMax2;
        }
        pdVar.i = iMax;
        if (i == 1) {
            pdVar.h = i3 + this.j.g();
            View viewBx = bx();
            pd pdVar2 = this.a;
            pdVar2.e = true == this.k ? -1 : 1;
            int iBe = be(viewBx);
            pd pdVar3 = this.a;
            pdVar2.d = iBe + pdVar3.e;
            pdVar3.b = this.j.a(viewBx);
            iJ = this.j.a(viewBx) - this.j.f();
        } else {
            View viewBy = by();
            this.a.h += this.j.j();
            pd pdVar4 = this.a;
            pdVar4.e = true != this.k ? -1 : 1;
            int iBe2 = be(viewBy);
            pd pdVar5 = this.a;
            pdVar4.d = iBe2 + pdVar5.e;
            pdVar5.b = this.j.d(viewBy);
            iJ = (-this.j.d(viewBy)) + this.j.j();
        }
        pd pdVar6 = this.a;
        pdVar6.c = i2;
        if (z) {
            pdVar6.c = i2 - iJ;
        }
        pdVar6.g = iJ;
    }

    private final void bD(pb pbVar) {
        bE(pbVar.b, pbVar.c);
    }

    private final void bE(int i, int i2) {
        this.a.c = this.j.f() - i2;
        pd pdVar = this.a;
        pdVar.e = true != this.k ? 1 : -1;
        pdVar.d = i;
        pdVar.f = 1;
        pdVar.b = i2;
        pdVar.g = Integer.MIN_VALUE;
    }

    private final void bF(pb pbVar) {
        bG(pbVar.b, pbVar.c);
    }

    private final void bG(int i, int i2) {
        this.a.c = i2 - this.j.j();
        pd pdVar = this.a;
        pdVar.d = i;
        pdVar.e = true != this.k ? -1 : 1;
        pdVar.f = -1;
        pdVar.b = i2;
        pdVar.g = Integer.MIN_VALUE;
    }

    private final int br(qp qpVar) {
        if (ai() == 0) {
            return 0;
        }
        O();
        return gh.e(qpVar, this.j, ad(!this.e), ac(!this.e), this, this.e, this.k);
    }

    private final int bs(qp qpVar) {
        if (ai() == 0) {
            return 0;
        }
        O();
        return gh.f(qpVar, this.j, ad(!this.e), ac(!this.e), this, this.e);
    }

    private final int bt(int i, qi qiVar, qp qpVar, boolean z) {
        int iF;
        int iF2 = this.j.f() - i;
        if (iF2 <= 0) {
            return 0;
        }
        int i2 = -H(-iF2, qiVar, qpVar);
        int i3 = i + i2;
        if (!z || (iF = this.j.f() - i3) <= 0) {
            return i2;
        }
        this.j.n(iF);
        return iF + i2;
    }

    private final int bu(int i, qi qiVar, qp qpVar, boolean z) {
        int iJ;
        int iJ2 = i - this.j.j();
        if (iJ2 <= 0) {
            return 0;
        }
        int i2 = -H(iJ2, qiVar, qpVar);
        int i3 = i + i2;
        if (!z || (iJ = i3 - this.j.j()) <= 0) {
            return i2;
        }
        this.j.n(-iJ);
        return i2 - iJ;
    }

    private final View bv() {
        return K(0, ai());
    }

    private final View bw() {
        return K(ai() - 1, -1);
    }

    private final View bx() {
        return au(this.k ? 0 : ai() - 1);
    }

    private final View by() {
        return au(this.k ? ai() - 1 : 0);
    }

    private final void bz(qi qiVar, pd pdVar) {
        if (!pdVar.a || pdVar.m) {
            return;
        }
        int i = pdVar.g;
        int i2 = pdVar.i;
        if (pdVar.f == -1) {
            int iAi = ai();
            if (i < 0) {
                return;
            }
            int iE = (this.j.e() - i) + i2;
            if (this.k) {
                for (int i3 = 0; i3 < iAi; i3++) {
                    View viewAu = au(i3);
                    if (this.j.d(viewAu) < iE || this.j.m(viewAu) < iE) {
                        bA(qiVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iAi - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewAu2 = au(i5);
                if (this.j.d(viewAu2) < iE || this.j.m(viewAu2) < iE) {
                    bA(qiVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int iAi2 = ai();
            if (!this.k) {
                for (int i7 = 0; i7 < iAi2; i7++) {
                    View viewAu3 = au(i7);
                    if (this.j.a(viewAu3) > i6 || this.j.l(viewAu3) > i6) {
                        bA(qiVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = iAi2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View viewAu4 = au(i9);
                if (this.j.a(viewAu4) > i6 || this.j.l(viewAu4) > i6) {
                    bA(qiVar, i8, i9);
                    return;
                }
            }
        }
    }

    private final int c(qp qpVar) {
        if (ai() == 0) {
            return 0;
        }
        O();
        return gh.d(qpVar, this.j, ad(!this.e), ac(!this.e), this, this.e);
    }

    @Override // defpackage.qc
    public final int A(qp qpVar) {
        return bs(qpVar);
    }

    @Override // defpackage.qc
    public final int B(qp qpVar) {
        return c(qpVar);
    }

    @Override // defpackage.qc
    public final int C(qp qpVar) {
        return br(qpVar);
    }

    @Override // defpackage.qc
    public final int D(qp qpVar) {
        return bs(qpVar);
    }

    final int E(int i) {
        switch (i) {
            case 1:
                return (this.i != 1 && X()) ? 1 : -1;
            case 2:
                return (this.i != 1 && X()) ? -1 : 1;
            case 17:
                return this.i == 0 ? -1 : Integer.MIN_VALUE;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return this.i == 1 ? -1 : Integer.MIN_VALUE;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return this.i == 0 ? 1 : Integer.MIN_VALUE;
            case 130:
                return this.i == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
    }

    final int F(qi qiVar, pd pdVar, qp qpVar, boolean z) {
        int i = pdVar.c;
        int i2 = pdVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                pdVar.g = i2 + i;
            }
            bz(qiVar, pdVar);
        }
        int i3 = pdVar.c + pdVar.h;
        pc pcVar = this.f;
        while (true) {
            if ((!pdVar.m && i3 <= 0) || !pdVar.d(qpVar)) {
                break;
            }
            pcVar.a = 0;
            pcVar.b = false;
            pcVar.c = false;
            pcVar.d = false;
            k(qiVar, qpVar, pdVar, pcVar);
            if (!pcVar.b) {
                int i4 = pdVar.b;
                int i5 = pcVar.a;
                pdVar.b = i4 + (pdVar.f * i5);
                if (!pcVar.c || pdVar.l != null || !qpVar.g) {
                    pdVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = pdVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    pdVar.g = i7;
                    int i8 = pdVar.c;
                    if (i8 < 0) {
                        pdVar.g = i7 + i8;
                    }
                    bz(qiVar, pdVar);
                }
                if (z && pcVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - pdVar.c;
    }

    public final int G() {
        View viewAe = ae(0, ai(), false);
        if (viewAe == null) {
            return -1;
        }
        return be(viewAe);
    }

    final int H(int i, qi qiVar, qp qpVar) {
        if (ai() == 0 || i == 0) {
            return 0;
        }
        O();
        this.a.a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        bC(i2, iAbs, true, qpVar);
        pd pdVar = this.a;
        int iF = pdVar.g + F(qiVar, pdVar, qpVar, false);
        if (iF < 0) {
            return 0;
        }
        if (iAbs > iF) {
            i = i2 * iF;
        }
        this.j.n(-i);
        this.a.k = i;
        return i;
    }

    @Override // defpackage.qn
    public final PointF I(int i) {
        if (ai() == 0) {
            return null;
        }
        int i2 = (i < be(au(0))) != this.k ? -1 : 1;
        return this.i == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // defpackage.qc
    public final Parcelable J() {
        pe peVar = this.n;
        if (peVar != null) {
            return new pe(peVar);
        }
        pe peVar2 = new pe();
        if (ai() > 0) {
            O();
            boolean z = this.b ^ this.k;
            peVar2.c = z;
            if (z) {
                View viewBx = bx();
                peVar2.b = this.j.f() - this.j.a(viewBx);
                peVar2.a = be(viewBx);
            } else {
                View viewBy = by();
                peVar2.a = be(viewBy);
                peVar2.b = this.j.d(viewBy) - this.j.j();
            }
        } else {
            peVar2.a();
        }
        return peVar2;
    }

    final View K(int i, int i2) {
        O();
        if (i2 <= i && i2 >= i) {
            return au(i);
        }
        int iD = this.j.d(au(i));
        int iJ = this.j.j();
        int i3 = iD < iJ ? 16388 : 4097;
        int i4 = iD < iJ ? 16644 : 4161;
        return this.i == 0 ? this.r.a(i, i2, i4, i3) : this.s.a(i, i2, i4, i3);
    }

    @Override // defpackage.qc
    public final View L(int i) {
        int iAi = ai();
        if (iAi == 0) {
            return null;
        }
        int iBe = i - be(au(0));
        if (iBe >= 0 && iBe < iAi) {
            View viewAu = au(iBe);
            if (be(viewAu) == i) {
                return viewAu;
            }
        }
        return super.L(i);
    }

    @Override // defpackage.qc
    public final void M(String str) {
        if (this.n == null) {
            super.M(str);
        }
    }

    protected void N(qp qpVar, int[] iArr) {
        int iK = qpVar.a != -1 ? this.j.k() : 0;
        int i = this.a.f;
        int i2 = i == -1 ? 0 : iK;
        if (i != -1) {
            iK = 0;
        }
        iArr[0] = iK;
        iArr[1] = i2;
    }

    final void O() {
        if (this.a == null) {
            this.a = new pd();
        }
    }

    @Override // defpackage.qc
    public final void P(AccessibilityEvent accessibilityEvent) {
        super.P(accessibilityEvent);
        if (ai() > 0) {
            accessibilityEvent.setFromIndex(G());
            View viewAe = ae(ai() - 1, -1, false);
            accessibilityEvent.setToIndex(viewAe != null ? be(viewAe) : -1);
        }
    }

    @Override // defpackage.qc
    public final void Q(Parcelable parcelable) {
        if (parcelable instanceof pe) {
            pe peVar = (pe) parcelable;
            this.n = peVar;
            if (this.l != -1) {
                peVar.a();
            }
            aN();
        }
    }

    @Override // defpackage.qc
    public final void R(int i) {
        this.l = i;
        this.m = Integer.MIN_VALUE;
        pe peVar = this.n;
        if (peVar != null) {
            peVar.a();
        }
        aN();
    }

    public final void S(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        M(null);
        if (i != this.i || this.j == null) {
            pq pqVarQ = pq.q(this, i);
            this.j = pqVarQ;
            this.o.a = pqVarQ;
            this.i = i;
            aN();
        }
    }

    public final void T(boolean z) {
        M(null);
        if (z == this.c) {
            return;
        }
        this.c = z;
        aN();
    }

    @Override // defpackage.qc
    public final boolean U() {
        return this.i == 0;
    }

    @Override // defpackage.qc
    public final boolean V() {
        return this.i == 1;
    }

    @Override // defpackage.qc
    public final boolean W() {
        return true;
    }

    protected final boolean X() {
        return al() == 1;
    }

    final boolean Y() {
        return this.j.h() == 0 && this.j.e() == 0;
    }

    @Override // defpackage.qc
    public final boolean Z() {
        if (this.B != 1073741824 && this.A != 1073741824) {
            int iAi = ai();
            for (int i = 0; i < iAi; i++) {
                ViewGroup.LayoutParams layoutParams = au(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.qc
    public final void aa(int i, int i2, qp qpVar, ou ouVar) {
        if (1 == this.i) {
            i = i2;
        }
        if (ai() == 0 || i == 0) {
            return;
        }
        O();
        bC(i > 0 ? 1 : -1, Math.abs(i), true, qpVar);
        t(qpVar, this.a, ouVar);
    }

    @Override // defpackage.qc
    public final void ab(int i, ou ouVar) {
        boolean z;
        int i2;
        pe peVar = this.n;
        if (peVar == null || !peVar.b()) {
            bB();
            z = this.k;
            i2 = this.l;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            pe peVar2 = this.n;
            z = peVar2.c;
            i2 = peVar2.a;
        }
        int i3 = true != z ? 1 : -1;
        for (int i4 = 0; i4 < this.g && i2 >= 0 && i2 < i; i4++) {
            ouVar.a(i2, 0);
            i2 += i3;
        }
    }

    final View ac(boolean z) {
        return this.k ? ae(0, ai(), z) : ae(ai() - 1, -1, z);
    }

    final View ad(boolean z) {
        return this.k ? ae(ai() - 1, -1, z) : ae(0, ai(), z);
    }

    final View ae(int i, int i2, boolean z) {
        O();
        int i3 = true != z ? 320 : 24579;
        return this.i == 0 ? this.r.a(i, i2, i3, 320) : this.s.a(i, i2, i3, 320);
    }

    @Override // defpackage.qc
    public final void af(RecyclerView recyclerView) {
    }

    @Override // defpackage.qc
    public final void ag(RecyclerView recyclerView, int i) {
        qo qoVar = new qo(recyclerView.getContext());
        qoVar.b = i;
        aT(qoVar);
    }

    @Override // defpackage.qc
    public int d(int i, qi qiVar, qp qpVar) {
        if (this.i == 1) {
            return 0;
        }
        return H(i, qiVar, qpVar);
    }

    @Override // defpackage.qc
    public int e(int i, qi qiVar, qp qpVar) {
        if (this.i == 0) {
            return 0;
        }
        return H(i, qiVar, qpVar);
    }

    @Override // defpackage.qc
    public qd f() {
        return new qd(-2, -2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    public View i(qi qiVar, qp qpVar, boolean z, boolean z2) {
        int iAi;
        int i;
        O();
        int iAi2 = ai();
        int i2 = -1;
        if (z2) {
            iAi = ai() - 1;
            i = -1;
        } else {
            i2 = iAi2;
            iAi = 0;
            i = 1;
        }
        int iA = qpVar.a();
        int iJ = this.j.j();
        int iF = this.j.f();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iAi != i2) {
            View viewAu = au(iAi);
            int iBe = be(viewAu);
            int iD = this.j.d(viewAu);
            int iA2 = this.j.a(viewAu);
            if (iBe >= 0 && iBe < iA) {
                if (!((qd) viewAu.getLayoutParams()).c()) {
                    boolean z3 = iA2 <= iJ && iD < iJ;
                    boolean z4 = iD >= iF && iA2 > iF;
                    if (!z3 && !z4) {
                        return viewAu;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewAu;
                        } else if (view == null) {
                            view = viewAu;
                        }
                    } else if (z3) {
                        view2 = viewAu;
                    } else if (view == null) {
                        view = viewAu;
                    }
                } else if (view3 == null) {
                    view3 = viewAu;
                }
            }
            iAi += i;
        }
        if (view != null) {
            return view;
        }
        return view2 == null ? view3 : view2;
    }

    @Override // defpackage.qc
    public View j(View view, int i, qi qiVar, qp qpVar) {
        int iE;
        View viewBv;
        bB();
        if (ai() == 0 || (iE = E(i)) == Integer.MIN_VALUE) {
            return null;
        }
        O();
        bC(iE, (int) (this.j.k() * 0.33333334f), false, qpVar);
        pd pdVar = this.a;
        pdVar.g = Integer.MIN_VALUE;
        pdVar.a = false;
        F(qiVar, pdVar, qpVar, true);
        if (iE == -1) {
            viewBv = this.k ? bw() : bv();
            iE = -1;
        } else {
            viewBv = this.k ? bv() : bw();
        }
        View viewBy = iE == -1 ? by() : bx();
        if (!viewBy.hasFocusable()) {
            return viewBv;
        }
        if (viewBv == null) {
            return null;
        }
        return viewBy;
    }

    public void k(qi qiVar, qp qpVar, pd pdVar, pc pcVar) {
        int iAp;
        int i;
        int i2;
        int iC;
        View viewA = pdVar.a(qiVar);
        if (viewA == null) {
            pcVar.b = true;
            return;
        }
        qd qdVar = (qd) viewA.getLayoutParams();
        if (pdVar.l == null) {
            if (this.k == (pdVar.f == -1)) {
                ay(viewA);
            } else {
                az(viewA, 0);
            }
        } else {
            if (this.k == (pdVar.f == -1)) {
                aw(viewA);
            } else {
                ax(viewA, 0);
            }
        }
        qd qdVar2 = (qd) viewA.getLayoutParams();
        Rect rectE = this.q.e(viewA);
        int i3 = rectE.left;
        int i4 = rectE.right;
        int i5 = rectE.top;
        int i6 = rectE.bottom;
        int iAj = qc.aj(this.C, this.A, ap() + aq() + qdVar2.leftMargin + qdVar2.rightMargin + i3 + i4, qdVar2.width, U());
        int iAj2 = qc.aj(this.D, this.B, ar() + ao() + qdVar2.topMargin + qdVar2.bottomMargin + i5 + i6, qdVar2.height, V());
        if (aY(viewA, iAj, iAj2, qdVar2)) {
            viewA.measure(iAj, iAj2);
        }
        pcVar.a = this.j.b(viewA);
        if (this.i == 1) {
            if (X()) {
                iC = this.C - aq();
                iAp = iC - this.j.c(viewA);
            } else {
                iAp = ap();
                iC = this.j.c(viewA) + iAp;
            }
            if (pdVar.f == -1) {
                i = pdVar.b;
                i2 = i - pcVar.a;
            } else {
                i2 = pdVar.b;
                i = pcVar.a + i2;
            }
        } else {
            int iAr = ar();
            int iC2 = this.j.c(viewA) + iAr;
            if (pdVar.f == -1) {
                int i7 = pdVar.b;
                int i8 = i7 - pcVar.a;
                iC = i7;
                i = iC2;
                iAp = i8;
                i2 = iAr;
            } else {
                int i9 = pdVar.b;
                int i10 = pcVar.a + i9;
                iAp = i9;
                i = iC2;
                i2 = iAr;
                iC = i10;
            }
        }
        bi(viewA, iAp, i2, iC, i);
        if (qdVar.c() || qdVar.b()) {
            pcVar.c = true;
        }
        pcVar.d = viewA.hasFocusable();
    }

    public void l(qi qiVar, qp qpVar, pb pbVar, int i) {
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:116:0x0200  */
    /* JADX WARN: Code duplicated, block: B:117:0x0206  */
    /* JADX WARN: Code duplicated, block: B:81:0x017d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0183  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ad  */
    @Override // defpackage.qc
    public void n(qi qiVar, qp qpVar) {
        int iA;
        View viewAv;
        boolean z;
        boolean z2;
        View viewI;
        qd qdVar;
        int i;
        int i2;
        int i3;
        int i4;
        View viewL;
        int i5 = -1;
        if (!(this.n == null && this.l == -1) && qpVar.a() == 0) {
            aI(qiVar);
            return;
        }
        pe peVar = this.n;
        if (peVar != null && peVar.b()) {
            this.l = this.n.a;
        }
        O();
        this.a.a = false;
        bB();
        View viewAv2 = av();
        pb pbVar = this.o;
        if (!pbVar.e || this.l != -1 || this.n != null) {
            pbVar.d();
            pb pbVar2 = this.o;
            pbVar2.d = this.k ^ this.d;
            if (qpVar.g || (i = this.l) == -1) {
                if (ai() != 0) {
                    viewAv = av();
                    if (viewAv != null) {
                        qdVar = (qd) viewAv.getLayoutParams();
                        if (!qdVar.c() || qdVar.a() < 0 || qdVar.a() >= qpVar.a()) {
                            z = this.b;
                            z2 = this.d;
                            if (z == z2 || (viewI = i(qiVar, qpVar, pbVar2.d, z2)) == null) {
                                pbVar2.a();
                                if (this.d) {
                                    iA = qpVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                pbVar2.b = iA;
                            } else {
                                pbVar2.b(viewI, be(viewI));
                                if (!qpVar.g && s()) {
                                    int iD = this.j.d(viewI);
                                    int iA2 = this.j.a(viewI);
                                    int iJ = this.j.j();
                                    int iF = this.j.f();
                                    boolean z3 = iA2 <= iJ && iD < iJ;
                                    boolean z4 = iD >= iF && iA2 > iF;
                                    if (z3 || z4) {
                                        if (true == pbVar2.d) {
                                            iJ = iF;
                                        }
                                        pbVar2.c = iJ;
                                    }
                                }
                            }
                        } else {
                            pbVar2.c(viewAv, be(viewAv));
                        }
                    } else {
                        z = this.b;
                        z2 = this.d;
                        if (z == z2) {
                            pbVar2.a();
                            if (this.d) {
                                iA = qpVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            pbVar2.b = iA;
                        } else {
                            pbVar2.a();
                            if (this.d) {
                                iA = qpVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            pbVar2.b = iA;
                        }
                    }
                } else {
                    pbVar2.a();
                    if (this.d) {
                        iA = qpVar.a() - 1;
                    } else {
                        iA = 0;
                    }
                    pbVar2.b = iA;
                }
            } else if (i < 0 || i >= qpVar.a()) {
                this.l = -1;
                this.m = Integer.MIN_VALUE;
                if (ai() != 0) {
                    viewAv = av();
                    if (viewAv != null) {
                        qdVar = (qd) viewAv.getLayoutParams();
                        if (qdVar.c()) {
                            z = this.b;
                            z2 = this.d;
                            if (z == z2) {
                                pbVar2.a();
                                if (this.d) {
                                    iA = qpVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                pbVar2.b = iA;
                            } else {
                                pbVar2.a();
                                if (this.d) {
                                    iA = qpVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                pbVar2.b = iA;
                            }
                        } else {
                            z = this.b;
                            z2 = this.d;
                            if (z == z2) {
                                pbVar2.a();
                                if (this.d) {
                                    iA = qpVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                pbVar2.b = iA;
                            } else {
                                pbVar2.a();
                                if (this.d) {
                                    iA = qpVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                pbVar2.b = iA;
                            }
                        }
                    } else {
                        z = this.b;
                        z2 = this.d;
                        if (z == z2) {
                            pbVar2.a();
                            if (this.d) {
                                iA = qpVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            pbVar2.b = iA;
                        } else {
                            pbVar2.a();
                            if (this.d) {
                                iA = qpVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            pbVar2.b = iA;
                        }
                    }
                } else {
                    pbVar2.a();
                    if (this.d) {
                        iA = qpVar.a() - 1;
                    } else {
                        iA = 0;
                    }
                    pbVar2.b = iA;
                }
            } else {
                pbVar2.b = this.l;
                pe peVar2 = this.n;
                if (peVar2 != null && peVar2.b()) {
                    boolean z5 = this.n.c;
                    pbVar2.d = z5;
                    if (z5) {
                        pbVar2.c = this.j.f() - this.n.b;
                    } else {
                        pbVar2.c = this.j.j() + this.n.b;
                    }
                } else if (this.m == Integer.MIN_VALUE) {
                    View viewL2 = L(this.l);
                    if (viewL2 == null) {
                        if (ai() > 0) {
                            pbVar2.d = (this.l < be(au(0))) == this.k;
                        }
                        pbVar2.a();
                    } else if (this.j.b(viewL2) > this.j.k()) {
                        pbVar2.a();
                    } else if (this.j.d(viewL2) - this.j.j() < 0) {
                        pbVar2.c = this.j.j();
                        pbVar2.d = false;
                    } else if (this.j.f() - this.j.a(viewL2) < 0) {
                        pbVar2.c = this.j.f();
                        pbVar2.d = true;
                    } else {
                        pbVar2.c = pbVar2.d ? this.j.a(viewL2) + this.j.o() : this.j.d(viewL2);
                    }
                } else {
                    boolean z6 = this.k;
                    pbVar2.d = z6;
                    if (z6) {
                        pbVar2.c = this.j.f() - this.m;
                    } else {
                        pbVar2.c = this.j.j() + this.m;
                    }
                }
            }
            this.o.e = true;
        } else if (viewAv2 != null && (this.j.d(viewAv2) >= this.j.f() || this.j.a(viewAv2) <= this.j.j())) {
            this.o.c(viewAv2, be(viewAv2));
        }
        pd pdVar = this.a;
        pdVar.f = pdVar.k >= 0 ? 1 : -1;
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        N(qpVar, iArr);
        int iMax = Math.max(0, this.h[0]) + this.j.j();
        int iMax2 = Math.max(0, this.h[1]) + this.j.g();
        if (qpVar.g && (i4 = this.l) != -1 && this.m != Integer.MIN_VALUE && (viewL = L(i4)) != null) {
            int iF2 = this.k ? (this.j.f() - this.j.a(viewL)) - this.m : this.m - (this.j.d(viewL) - this.j.j());
            if (iF2 > 0) {
                iMax += iF2;
            } else {
                iMax2 -= iF2;
            }
        }
        pb pbVar3 = this.o;
        if (!pbVar3.d ? true != this.k : true == this.k) {
            i5 = 1;
        }
        l(qiVar, qpVar, pbVar3, i5);
        aB(qiVar);
        this.a.m = Y();
        pd pdVar2 = this.a;
        pdVar2.j = qpVar.g;
        pdVar2.i = 0;
        pb pbVar4 = this.o;
        if (pbVar4.d) {
            bF(pbVar4);
            pd pdVar3 = this.a;
            pdVar3.h = iMax;
            F(qiVar, pdVar3, qpVar, false);
            pd pdVar4 = this.a;
            i3 = pdVar4.b;
            int i6 = pdVar4.d;
            int i7 = pdVar4.c;
            if (i7 > 0) {
                iMax2 += i7;
            }
            bD(this.o);
            pd pdVar5 = this.a;
            pdVar5.h = iMax2;
            pdVar5.d += pdVar5.e;
            F(qiVar, pdVar5, qpVar, false);
            pd pdVar6 = this.a;
            i2 = pdVar6.b;
            int i8 = pdVar6.c;
            if (i8 > 0) {
                bG(i6, i3);
                pd pdVar7 = this.a;
                pdVar7.h = i8;
                F(qiVar, pdVar7, qpVar, false);
                i3 = this.a.b;
            }
        } else {
            bD(pbVar4);
            pd pdVar8 = this.a;
            pdVar8.h = iMax2;
            F(qiVar, pdVar8, qpVar, false);
            pd pdVar9 = this.a;
            i2 = pdVar9.b;
            int i9 = pdVar9.d;
            int i10 = pdVar9.c;
            if (i10 > 0) {
                iMax += i10;
            }
            bF(this.o);
            pd pdVar10 = this.a;
            pdVar10.h = iMax;
            pdVar10.d += pdVar10.e;
            F(qiVar, pdVar10, qpVar, false);
            pd pdVar11 = this.a;
            i3 = pdVar11.b;
            int i11 = pdVar11.c;
            if (i11 > 0) {
                bE(i9, i2);
                pd pdVar12 = this.a;
                pdVar12.h = i11;
                F(qiVar, pdVar12, qpVar, false);
                i2 = this.a.b;
            }
        }
        if (ai() > 0) {
            if (this.k ^ this.d) {
                int iBt = bt(i2, qiVar, qpVar, true);
                int i12 = i3 + iBt;
                int iBu = bu(i12, qiVar, qpVar, false);
                i3 = i12 + iBu;
                i2 = i2 + iBt + iBu;
            } else {
                int iBu2 = bu(i3, qiVar, qpVar, true);
                int i13 = i2 + iBu2;
                int iBt2 = bt(i13, qiVar, qpVar, false);
                i3 = i3 + iBu2 + iBt2;
                i2 = i13 + iBt2;
            }
        }
        if (qpVar.k && ai() != 0 && !qpVar.g && s()) {
            List list = qiVar.d;
            int size = list.size();
            int iBe = be(au(0));
            int iB = 0;
            int iB2 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                qs qsVar = (qs) list.get(i14);
                if (!qsVar.u()) {
                    if ((qsVar.b() < iBe) != this.k) {
                        iB += this.j.b(qsVar.a);
                    } else {
                        iB2 += this.j.b(qsVar.a);
                    }
                }
            }
            this.a.l = list;
            if (iB > 0) {
                bG(be(by()), i3);
                pd pdVar13 = this.a;
                pdVar13.h = iB;
                pdVar13.c = 0;
                pdVar13.b();
                F(qiVar, this.a, qpVar, false);
            }
            if (iB2 > 0) {
                bE(be(bx()), i2);
                pd pdVar14 = this.a;
                pdVar14.h = iB2;
                pdVar14.c = 0;
                pdVar14.b();
                F(qiVar, this.a, qpVar, false);
            }
            this.a.l = null;
        }
        if (qpVar.g) {
            this.o.d();
        } else {
            pq pqVar = this.j;
            pqVar.b = pqVar.k();
        }
        this.b = this.d;
    }

    @Override // defpackage.qc
    public void o(qp qpVar) {
        this.n = null;
        this.l = -1;
        this.m = Integer.MIN_VALUE;
        this.o.d();
    }

    public void q(boolean z) {
        M(null);
        if (this.d == z) {
            return;
        }
        this.d = z;
        aN();
    }

    @Override // defpackage.qc
    public boolean s() {
        return this.n == null && this.b == this.d;
    }

    public void t(qp qpVar, pd pdVar, ou ouVar) {
        int i = pdVar.d;
        if (i < 0 || i >= qpVar.a()) {
            return;
        }
        ouVar.a(i, Math.max(0, pdVar.g));
    }

    @Override // defpackage.qc
    public final int y(qp qpVar) {
        return c(qpVar);
    }

    @Override // defpackage.qc
    public final int z(qp qpVar) {
        return br(qpVar);
    }
}
