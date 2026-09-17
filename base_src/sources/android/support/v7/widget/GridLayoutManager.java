package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.hb;
import defpackage.kkm;
import defpackage.ou;
import defpackage.ox;
import defpackage.oy;
import defpackage.pb;
import defpackage.pc;
import defpackage.pd;
import defpackage.qc;
import defpackage.qd;
import defpackage.qi;
import defpackage.qp;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean a;
    int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    oy g;
    final Rect h;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new oy();
        this.h = new Rect();
        int i3 = as(context, attributeSet, i, i2).b;
        if (i3 == this.b) {
            return;
        }
        this.a = true;
        if (i3 > 0) {
            this.b = i3;
            this.g.b();
            aN();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i3);
        }
    }

    private final int br(qi qiVar, qp qpVar, int i) {
        if (!qpVar.g) {
            return oy.c(i, this.b);
        }
        int iA = qiVar.a(i);
        if (iA != -1) {
            return oy.c(iA, this.b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    private final int bs(qi qiVar, qp qpVar, int i) {
        if (!qpVar.g) {
            return i % this.b;
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iA = qiVar.a(i);
        if (iA != -1) {
            return iA % this.b;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    private final int bt(qi qiVar, qp qpVar, int i) {
        if (!qpVar.g) {
            return 1;
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (qiVar.a(i) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        }
        return 1;
    }

    private final void bu(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        if (iArr == null || (length = iArr.length) != i3 + 1 || iArr[length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.c = iArr;
    }

    private final void bv() {
        View[] viewArr = this.d;
        if (viewArr == null || viewArr.length != this.b) {
            this.d = new View[this.b];
        }
    }

    private final void bw(View view, int i, boolean z) {
        int iAj;
        int iAj2;
        ox oxVar = (ox) view.getLayoutParams();
        Rect rect = oxVar.d;
        int i2 = rect.top + rect.bottom + oxVar.topMargin + oxVar.bottomMargin;
        int i3 = rect.left + rect.right + oxVar.leftMargin + oxVar.rightMargin;
        int iC = c(oxVar.a, oxVar.b);
        if (this.i == 1) {
            iAj2 = aj(iC, i, i3, oxVar.width, false);
            iAj = aj(this.j.k(), this.B, i2, oxVar.height, true);
        } else {
            int iAj3 = aj(iC, i, i2, oxVar.height, false);
            int iAj4 = aj(this.j.k(), this.A, i3, oxVar.width, true);
            iAj = iAj3;
            iAj2 = iAj4;
        }
        bx(view, iAj2, iAj, z);
    }

    private final void bx(View view, int i, int i2, boolean z) {
        qd qdVar = (qd) view.getLayoutParams();
        boolean zAY = true;
        if (!z) {
            zAY = aY(view, i, i2, qdVar);
        } else if (this.w && qc.aU(view.getMeasuredWidth(), i, qdVar.width) && qc.aU(view.getMeasuredHeight(), i2, qdVar.height)) {
            zAY = false;
        }
        if (zAY) {
            view.measure(i, i2);
        }
    }

    private final void by() {
        bu(this.i == 1 ? (this.C - aq()) - ap() : (this.D - ao()) - ar());
    }

    @Override // defpackage.qc
    public final int a(qi qiVar, qp qpVar) {
        if (this.i == 1) {
            return this.b;
        }
        if (qpVar.a() <= 0) {
            return 0;
        }
        return br(qiVar, qpVar, qpVar.a() - 1) + 1;
    }

    @Override // defpackage.qc
    public final int b(qi qiVar, qp qpVar) {
        if (this.i == 0) {
            return this.b;
        }
        if (qpVar.a() <= 0) {
            return 0;
        }
        return br(qiVar, qpVar, qpVar.a() - 1) + 1;
    }

    final int c(int i, int i2) {
        if (this.i != 1 || !X()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qc
    public final int d(int i, qi qiVar, qp qpVar) {
        by();
        bv();
        return super.d(i, qiVar, qpVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qc
    public final int e(int i, qi qiVar, qp qpVar) {
        by();
        bv();
        return super.e(i, qiVar, qpVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qc
    public final qd f() {
        return this.i == 0 ? new ox(-2, -1) : new ox(-1, -2);
    }

    @Override // defpackage.qc
    public final qd g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ox((ViewGroup.MarginLayoutParams) layoutParams) : new ox(layoutParams);
    }

    @Override // defpackage.qc
    public final qd h(Context context, AttributeSet attributeSet) {
        return new ox(context, attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final View i(qi qiVar, qp qpVar, boolean z, boolean z2) {
        int iAi;
        int i;
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
        O();
        int iJ = this.j.j();
        int iF = this.j.f();
        View view = null;
        View view2 = null;
        while (iAi != i2) {
            View viewAu = au(iAi);
            int iBe = be(viewAu);
            if (iBe >= 0 && iBe < iA && bs(qiVar, qpVar, iBe) == 0) {
                if (((qd) viewAu.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewAu;
                    }
                } else {
                    if (this.j.d(viewAu) < iF && this.j.a(viewAu) >= iJ) {
                        return viewAu;
                    }
                    if (view == null) {
                        view = viewAu;
                    }
                }
            }
            iAi += i;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        if (r13 != (r2 > r15)) goto L55;
     */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View j(android.view.View r23, int r24, defpackage.qi r25, defpackage.qp r26) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.j(android.view.View, int, qi, qp):android.view.View");
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void k(qi qiVar, qp qpVar, pd pdVar, pc pcVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int iAp;
        int iC;
        int iC2;
        int iAr;
        int iAj;
        int iAj2;
        boolean z;
        View viewA;
        int i5 = this.j.i();
        int i6 = ai() > 0 ? this.c[this.b] : 0;
        if (i5 != 1073741824) {
            by();
        }
        int i7 = pdVar.e;
        int iBs = this.b;
        if (i7 != 1) {
            iBs = bs(qiVar, qpVar, pdVar.d) + bt(qiVar, qpVar, pdVar.d);
            i = 0;
        } else {
            i = 0;
        }
        while (i < this.b && pdVar.d(qpVar) && iBs > 0) {
            int i8 = pdVar.d;
            int iBt = bt(qiVar, qpVar, i8);
            if (iBt > this.b) {
                throw new IllegalArgumentException("Item at position " + i8 + " requires " + iBt + " spans but GridLayoutManager has only " + this.b + " spans.");
            }
            iBs -= iBt;
            if (iBs < 0 || (viewA = pdVar.a(qiVar)) == null) {
                break;
            }
            this.d[i] = viewA;
            i++;
        }
        if (i == 0) {
            pcVar.b = true;
            return;
        }
        if (i7 == 1) {
            i3 = i;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        int i9 = 0;
        while (i2 != i3) {
            View view = this.d[i2];
            ox oxVar = (ox) view.getLayoutParams();
            int iBt2 = bt(qiVar, qpVar, be(view));
            oxVar.b = iBt2;
            oxVar.a = i9;
            i9 += iBt2;
            i2 += i4;
        }
        float f = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            View view2 = this.d[i11];
            if (pdVar.l != null) {
                z = false;
                if (i7 == 1) {
                    aw(view2);
                } else {
                    ax(view2, 0);
                }
            } else if (i7 == 1) {
                ay(view2);
                z = false;
            } else {
                z = false;
                az(view2, 0);
            }
            aA(view2, this.h);
            bw(view2, i5, z);
            int iB = this.j.b(view2);
            if (iB > i10) {
                i10 = iB;
            }
            float fC = this.j.c(view2) / ((ox) view2.getLayoutParams()).b;
            if (fC > f) {
                f = fC;
            }
        }
        if (i5 != 1073741824) {
            bu(Math.max(Math.round(f * this.b), i6));
            i10 = 0;
            for (int i12 = 0; i12 < i; i12++) {
                View view3 = this.d[i12];
                bw(view3, 1073741824, true);
                int iB2 = this.j.b(view3);
                if (iB2 > i10) {
                    i10 = iB2;
                }
            }
        }
        for (int i13 = 0; i13 < i; i13++) {
            View view4 = this.d[i13];
            if (this.j.b(view4) != i10) {
                ox oxVar2 = (ox) view4.getLayoutParams();
                Rect rect = oxVar2.d;
                int i14 = rect.top + rect.bottom + oxVar2.topMargin + oxVar2.bottomMargin;
                int i15 = rect.left + rect.right + oxVar2.leftMargin + oxVar2.rightMargin;
                int iC3 = c(oxVar2.a, oxVar2.b);
                if (this.i == 1) {
                    iAj2 = aj(iC3, 1073741824, i15, oxVar2.width, false);
                    iAj = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iAj = aj(iC3, 1073741824, i14, oxVar2.height, false);
                    iAj2 = iMakeMeasureSpec;
                }
                bx(view4, iAj2, iAj, true);
            }
        }
        pcVar.a = i10;
        if (this.i == 1) {
            if (pdVar.f == -1) {
                int i16 = pdVar.b;
                iAr = i16 - i10;
                iC = i16;
                iAp = 0;
                iC2 = 0;
            } else {
                int i17 = pdVar.b;
                iC = i17 + i10;
                iAr = i17;
                iAp = 0;
                iC2 = 0;
            }
        } else if (pdVar.f == -1) {
            iC2 = pdVar.b;
            iAp = iC2 - i10;
            iAr = 0;
            iC = 0;
        } else {
            int i18 = pdVar.b;
            iAp = i18;
            iC = 0;
            iC2 = i18 + i10;
            iAr = 0;
        }
        for (int i19 = 0; i19 < i; i19++) {
            View view5 = this.d[i19];
            ox oxVar3 = (ox) view5.getLayoutParams();
            if (this.i != 1) {
                iAr = ar() + this.c[oxVar3.a];
                iC = this.j.c(view5) + iAr;
            } else if (X()) {
                int iAp2 = ap() + this.c[this.b - oxVar3.a];
                iC2 = iAp2;
                iAp = iAp2 - this.j.c(view5);
            } else {
                iAp = ap() + this.c[oxVar3.a];
                iC2 = this.j.c(view5) + iAp;
            }
            bi(view5, iAp, iAr, iC2, iC);
            if (oxVar3.c() || oxVar3.b()) {
                pcVar.c = true;
            }
            pcVar.d = view5.hasFocusable() | pcVar.d;
        }
        Arrays.fill(this.d, (Object) null);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void l(qi qiVar, qp qpVar, pb pbVar, int i) {
        by();
        if (qpVar.a() > 0 && !qpVar.g) {
            int iBs = bs(qiVar, qpVar, pbVar.b);
            if (i == 1) {
                while (iBs > 0) {
                    int i2 = pbVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    pbVar.b = i3;
                    iBs = bs(qiVar, qpVar, i3);
                }
            } else {
                int iA = qpVar.a() - 1;
                int i4 = pbVar.b;
                while (i4 < iA) {
                    int i5 = i4 + 1;
                    int iBs2 = bs(qiVar, qpVar, i5);
                    if (iBs2 <= iBs) {
                        break;
                    }
                    i4 = i5;
                    iBs = iBs2;
                }
                pbVar.b = i4;
            }
        }
        bv();
    }

    @Override // defpackage.qc
    public final void m(qi qiVar, qp qpVar, View view, hb hbVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ox)) {
            super.aG(view, hbVar);
            return;
        }
        ox oxVar = (ox) layoutParams;
        int iBr = br(qiVar, qpVar, oxVar.a());
        if (this.i == 0) {
            hbVar.g(kkm.c(oxVar.a, oxVar.b, iBr, 1, false));
        } else {
            hbVar.g(kkm.c(iBr, 1, oxVar.a, oxVar.b, false));
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qc
    public final void n(qi qiVar, qp qpVar) {
        if (qpVar.g) {
            int iAi = ai();
            for (int i = 0; i < iAi; i++) {
                ox oxVar = (ox) au(i).getLayoutParams();
                int iA = oxVar.a();
                this.e.put(iA, oxVar.b);
                this.f.put(iA, oxVar.a);
            }
        }
        super.n(qiVar, qpVar);
        this.e.clear();
        this.f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qc
    public final void o(qp qpVar) {
        super.o(qpVar);
        this.a = false;
    }

    @Override // defpackage.qc
    public final void p(Rect rect, int i, int i2) {
        int iAh;
        int iAh2;
        if (this.c == null) {
            super.p(rect, i, i2);
        }
        int iAp = ap() + aq();
        int iAr = ar() + ao();
        if (this.i == 1) {
            iAh2 = ah(i2, rect.height() + iAr, am());
            int[] iArr = this.c;
            iAh = ah(i, iArr[iArr.length - 1] + iAp, an());
        } else {
            iAh = ah(i, rect.width() + iAp, an());
            int[] iArr2 = this.c;
            iAh2 = ah(i2, iArr2[iArr2.length - 1] + iAr, am());
        }
        aQ(iAh, iAh2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void q(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.q(false);
    }

    @Override // defpackage.qc
    public final boolean r(qd qdVar) {
        return qdVar instanceof ox;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.qc
    public final boolean s() {
        return this.n == null && !this.a;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void t(qp qpVar, pd pdVar, ou ouVar) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && pdVar.d(qpVar) && i > 0; i2++) {
            ouVar.a(pdVar.d, Math.max(0, pdVar.g));
            i--;
            pdVar.d += pdVar.e;
        }
    }

    @Override // defpackage.qc
    public final void u(int i, int i2) {
        this.g.b();
        this.g.a();
    }

    @Override // defpackage.qc
    public final void v() {
        this.g.b();
        this.g.a();
    }

    @Override // defpackage.qc
    public final void w(int i, int i2) {
        this.g.b();
        this.g.a();
    }

    @Override // defpackage.qc
    public final void x(int i, int i2) {
        this.g.b();
        this.g.a();
    }
}
