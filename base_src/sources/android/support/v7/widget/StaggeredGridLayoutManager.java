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
import defpackage.oz;
import defpackage.pq;
import defpackage.qb;
import defpackage.qc;
import defpackage.qd;
import defpackage.qi;
import defpackage.qn;
import defpackage.qo;
import defpackage.qp;
import defpackage.ra;
import defpackage.rb;
import defpackage.rc;
import defpackage.rd;
import defpackage.re;
import defpackage.rf;
import defpackage.rg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends qc implements qn {
    private boolean E;
    private rf F;
    private int[] J;
    rg[] a;
    public pq b;
    pq c;
    private int i;
    private int j;
    private int k;
    private final oz l;
    private BitSet m;
    private boolean o;
    public boolean d = false;
    boolean e = false;
    int f = -1;
    int g = Integer.MIN_VALUE;
    re h = new re();
    private int n = 2;
    private final Rect G = new Rect();
    private final rb H = new rb(this);
    private boolean I = true;
    private final Runnable K = new ra(this);

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = -1;
        qb qbVarAs = as(context, attributeSet, i, i2);
        int i3 = qbVarAs.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        M(null);
        if (i3 != this.j) {
            this.j = i3;
            pq pqVar = this.b;
            this.b = this.c;
            this.c = pqVar;
            aN();
        }
        int i4 = qbVarAs.b;
        M(null);
        if (i4 != this.i) {
            this.h.a();
            aN();
            this.i = i4;
            this.m = new BitSet(i4);
            this.a = new rg[this.i];
            for (int i5 = 0; i5 < this.i; i5++) {
                this.a[i5] = new rg(this, i5);
            }
            aN();
        }
        F(qbVarAs.c);
        this.l = new oz();
        this.b = pq.q(this, this.j);
        this.c = pq.q(this, 1 - this.j);
    }

    private final int N(int i) {
        if (ai() == 0) {
            return this.e ? 1 : -1;
        }
        return (i < c()) != this.e ? -1 : 1;
    }

    private final int O(qp qpVar) {
        if (ai() == 0) {
            return 0;
        }
        return gh.d(qpVar, this.b, q(!this.I), l(!this.I), this, this.I);
    }

    private final int S(qp qpVar) {
        if (ai() == 0) {
            return 0;
        }
        return gh.e(qpVar, this.b, q(!this.I), l(!this.I), this, this.I, this.e);
    }

    private final int T(qp qpVar) {
        if (ai() == 0) {
            return 0;
        }
        return gh.f(qpVar, this.b, q(!this.I), l(!this.I), this, this.I);
    }

    private final int X(qi qiVar, oz ozVar, qp qpVar) {
        rg rgVar;
        int iF;
        int iB;
        int iJ;
        int iB2;
        int i;
        int i2;
        int i3;
        this.m.set(0, this.i, true);
        int i4 = this.l.i ? ozVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : ozVar.e == 1 ? ozVar.g + ozVar.b : ozVar.f - ozVar.b;
        int i5 = ozVar.e;
        for (int i6 = 0; i6 < this.i; i6++) {
            if (!this.a[i6].a.isEmpty()) {
                bz(this.a[i6], i5, i4);
            }
        }
        int iF2 = this.e ? this.b.f() : this.b.j();
        boolean z = false;
        while (ozVar.a(qpVar) && (this.l.i || !this.m.isEmpty())) {
            View viewC = qiVar.c(ozVar.c);
            ozVar.c += ozVar.d;
            rc rcVar = (rc) viewC.getLayoutParams();
            int iA = rcVar.a();
            int[] iArr = this.h.a;
            int i7 = (iArr == null || iA >= iArr.length) ? -1 : iArr[iA];
            if (i7 == -1) {
                boolean z2 = rcVar.b;
                if (bA(ozVar.e)) {
                    i2 = this.i - 1;
                    i = -1;
                    i3 = -1;
                } else {
                    i = this.i;
                    i2 = 0;
                    i3 = 1;
                }
                rg rgVar2 = null;
                if (ozVar.e == 1) {
                    int iJ2 = this.b.j();
                    int i8 = Integer.MAX_VALUE;
                    while (i2 != i) {
                        rg rgVar3 = this.a[i2];
                        int iD = rgVar3.d(iJ2);
                        int i9 = iD < i8 ? iD : i8;
                        if (iD < i8) {
                            rgVar2 = rgVar3;
                        }
                        i2 += i3;
                        i8 = i9;
                    }
                    rgVar = rgVar2;
                } else {
                    int iF3 = this.b.f();
                    int i10 = Integer.MIN_VALUE;
                    while (i2 != i) {
                        rg rgVar4 = this.a[i2];
                        int iF4 = rgVar4.f(iF3);
                        int i11 = iF4 > i10 ? iF4 : i10;
                        if (iF4 > i10) {
                            rgVar2 = rgVar4;
                        }
                        i2 += i3;
                        i10 = i11;
                    }
                    rgVar = rgVar2;
                }
                re reVar = this.h;
                reVar.b(iA);
                reVar.a[iA] = rgVar.e;
            } else {
                rgVar = this.a[i7];
            }
            rcVar.a = rgVar;
            if (ozVar.e == 1) {
                ay(viewC);
            } else {
                az(viewC, 0);
            }
            boolean z3 = rcVar.b;
            if (this.j == 1) {
                bB(viewC, aj(this.k, this.A, 0, rcVar.width, false), aj(this.D, this.B, ar() + ao(), rcVar.height, true));
            } else {
                bB(viewC, aj(this.C, this.A, ap() + aq(), rcVar.width, true), aj(this.k, this.B, 0, rcVar.height, false));
            }
            if (ozVar.e == 1) {
                boolean z4 = rcVar.b;
                iB = rgVar.d(iF2);
                iF = this.b.b(viewC) + iB;
                if (i7 == -1) {
                    boolean z5 = rcVar.b;
                }
            } else {
                boolean z6 = rcVar.b;
                iF = rgVar.f(iF2);
                iB = iF - this.b.b(viewC);
                if (i7 == -1) {
                    boolean z7 = rcVar.b;
                }
            }
            boolean z8 = rcVar.b;
            if (ozVar.e == 1) {
                rg rgVar5 = rcVar.a;
                rc rcVarN = rg.n(viewC);
                rcVarN.a = rgVar5;
                rgVar5.a.add(viewC);
                rgVar5.c = Integer.MIN_VALUE;
                if (rgVar5.a.size() == 1) {
                    rgVar5.b = Integer.MIN_VALUE;
                }
                if (rcVarN.c() || rcVarN.b()) {
                    rgVar5.d += rgVar5.f.b.b(viewC);
                }
            } else {
                rg rgVar6 = rcVar.a;
                rc rcVarN2 = rg.n(viewC);
                rcVarN2.a = rgVar6;
                rgVar6.a.add(0, viewC);
                rgVar6.b = Integer.MIN_VALUE;
                if (rgVar6.a.size() == 1) {
                    rgVar6.c = Integer.MIN_VALUE;
                }
                if (rcVarN2.c() || rcVarN2.b()) {
                    rgVar6.d += rgVar6.f.b.b(viewC);
                }
            }
            if (K() && this.j == 1) {
                boolean z9 = rcVar.b;
                iB2 = this.c.f() - (((this.i - 1) - rgVar.e) * this.k);
                iJ = iB2 - this.c.b(viewC);
            } else {
                boolean z10 = rcVar.b;
                iJ = this.c.j() + (rgVar.e * this.k);
                iB2 = this.c.b(viewC) + iJ;
            }
            if (this.j == 1) {
                bi(viewC, iJ, iB, iB2, iF);
            } else {
                bi(viewC, iB, iJ, iF, iB2);
            }
            boolean z11 = rcVar.b;
            bz(rgVar, this.l.e, i4);
            bt(qiVar, this.l);
            if (this.l.h && viewC.hasFocusable()) {
                boolean z12 = rcVar.b;
                this.m.set(rgVar.e, false);
            }
            z = true;
        }
        if (!z) {
            bt(qiVar, this.l);
        }
        int iJ3 = this.l.e == -1 ? this.b.j() - ac(this.b.j()) : Y(this.b.f()) - this.b.f();
        if (iJ3 > 0) {
            return Math.min(ozVar.b, iJ3);
        }
        return 0;
    }

    private final int Y(int i) {
        int iD = this.a[0].d(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iD2 = this.a[i2].d(i);
            if (iD2 > iD) {
                iD = iD2;
            }
        }
        return iD;
    }

    private final int ac(int i) {
        int iF = this.a[0].f(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iF2 = this.a[i2].f(i);
            if (iF2 < iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    private final void ad(qi qiVar, qp qpVar, boolean z) {
        int iF;
        int iY = Y(Integer.MIN_VALUE);
        if (iY != Integer.MIN_VALUE && (iF = this.b.f() - iY) > 0) {
            int i = iF - (-k(-iF, qiVar, qpVar));
            if (!z || i <= 0) {
                return;
            }
            this.b.n(i);
        }
    }

    private final void ae(qi qiVar, qp qpVar, boolean z) {
        int iJ;
        int iAc = ac(Integer.MAX_VALUE);
        if (iAc != Integer.MAX_VALUE && (iJ = iAc - this.b.j()) > 0) {
            int iK = iJ - k(iJ, qiVar, qpVar);
            if (!z || iK <= 0) {
                return;
            }
            this.b.n(-iK);
        }
    }

    private final boolean bA(int i) {
        if (this.j == 0) {
            return (i == -1) != this.e;
        }
        return ((i == -1) == this.e) == K();
    }

    private final void bB(View view, int i, int i2) {
        aA(view, this.G);
        rc rcVar = (rc) view.getLayoutParams();
        int iBC = bC(i, rcVar.leftMargin + this.G.left, rcVar.rightMargin + this.G.right);
        int iBC2 = bC(i2, rcVar.topMargin + this.G.top, rcVar.bottomMargin + this.G.bottom);
        if (aY(view, iBC, iBC2, rcVar)) {
            view.measure(iBC, iBC2);
        }
    }

    private static final int bC(int i, int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 0) {
                return i;
            }
            i2 = 0;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    private final void br(int i, int i2, int i3) {
        rd rdVar;
        int i4;
        int i5 = this.e ? i() : c();
        int i6 = i + i2;
        re reVar = this.h;
        int[] iArr = reVar.a;
        if (iArr != null && i < iArr.length) {
            List list = reVar.b;
            if (list == null) {
                i4 = -1;
            } else {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        rdVar = null;
                        break;
                    }
                    rdVar = (rd) reVar.b.get(size);
                    if (rdVar.a == i) {
                        break;
                    } else {
                        size--;
                    }
                }
                if (rdVar != null) {
                    reVar.b.remove(rdVar);
                }
                int size2 = reVar.b.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        i7 = -1;
                        break;
                    } else if (((rd) reVar.b.get(i7)).a >= i) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 != -1) {
                    rd rdVar2 = (rd) reVar.b.get(i7);
                    reVar.b.remove(i7);
                    i4 = rdVar2.a;
                } else {
                    i4 = -1;
                }
            }
            if (i4 == -1) {
                int[] iArr2 = reVar.a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                int length = reVar.a.length;
            } else {
                Arrays.fill(reVar.a, i, Math.min(i4 + 1, reVar.a.length), -1);
            }
        }
        switch (i3) {
            case 1:
                re reVar2 = this.h;
                int[] iArr3 = reVar2.a;
                if (iArr3 != null && i < iArr3.length) {
                    reVar2.b(i6);
                    int[] iArr4 = reVar2.a;
                    System.arraycopy(iArr4, i, iArr4, i6, (iArr4.length - i) - i2);
                    Arrays.fill(reVar2.a, i, i6, -1);
                    List list2 = reVar2.b;
                    if (list2 != null) {
                        for (int size3 = list2.size() - 1; size3 >= 0; size3--) {
                            rd rdVar3 = (rd) reVar2.b.get(size3);
                            int i8 = rdVar3.a;
                            if (i8 >= i) {
                                rdVar3.a = i8 + i2;
                            }
                        }
                    }
                }
                break;
            case 2:
                re reVar3 = this.h;
                int[] iArr5 = reVar3.a;
                if (iArr5 != null && i < iArr5.length) {
                    reVar3.b(i6);
                    int[] iArr6 = reVar3.a;
                    System.arraycopy(iArr6, i6, iArr6, i, (iArr6.length - i) - i2);
                    int[] iArr7 = reVar3.a;
                    int length2 = iArr7.length;
                    Arrays.fill(iArr7, length2 - i2, length2, -1);
                    List list3 = reVar3.b;
                    if (list3 != null) {
                        for (int size4 = list3.size() - 1; size4 >= 0; size4--) {
                            rd rdVar4 = (rd) reVar3.b.get(size4);
                            int i9 = rdVar4.a;
                            if (i9 >= i) {
                                if (i9 < i6) {
                                    reVar3.b.remove(size4);
                                } else {
                                    rdVar4.a = i9 - i2;
                                }
                            }
                        }
                    }
                }
                break;
        }
        if (i6 <= i5) {
            return;
        }
        if (i <= (this.e ? c() : i())) {
            aN();
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:233:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:247:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x01ed A[SYNTHETIC] */
    private final void bs(qi qiVar, qp qpVar, boolean z) {
        boolean z2;
        rf rfVar;
        int i;
        int iAi;
        int i2;
        int iBe;
        int iBe2;
        int iAi2;
        int i3;
        rb rbVar = this.H;
        if (!(this.F == null && this.f == -1) && qpVar.a() == 0) {
            aI(qiVar);
            rbVar.a();
            return;
        }
        boolean z3 = (rbVar.e && this.f == -1 && this.F == null) ? false : true;
        if (z3) {
            rbVar.a();
            rf rfVar2 = this.F;
            if (rfVar2 != null) {
                int i4 = rfVar2.c;
                if (i4 > 0) {
                    if (i4 == this.i) {
                        for (int i5 = 0; i5 < this.i; i5++) {
                            this.a[i5].j();
                            rf rfVar3 = this.F;
                            int iF = rfVar3.d[i5];
                            if (iF != Integer.MIN_VALUE) {
                                iF = rfVar3.i ? iF + this.b.f() : iF + this.b.j();
                            }
                            this.a[i5].l(iF);
                        }
                    } else {
                        rfVar2.b();
                        rf rfVar4 = this.F;
                        rfVar4.a = rfVar4.b;
                    }
                }
                rf rfVar5 = this.F;
                this.E = rfVar5.j;
                F(rfVar5.h);
                bw();
                rf rfVar6 = this.F;
                int i6 = rfVar6.a;
                if (i6 != -1) {
                    this.f = i6;
                    rbVar.c = rfVar6.i;
                } else {
                    rbVar.c = this.e;
                }
                if (rfVar6.e > 1) {
                    re reVar = this.h;
                    reVar.a = rfVar6.f;
                    reVar.b = rfVar6.g;
                }
            } else {
                bw();
                rbVar.c = this.e;
            }
            if (qpVar.g || (i3 = this.f) == -1) {
                if (this.o) {
                    int iA = qpVar.a();
                    iAi2 = ai() - 1;
                    while (true) {
                        if (iAi2 < 0) {
                            iBe = 0;
                            break;
                        }
                        iBe = be(au(iAi2));
                        if (iBe < 0 && iBe < iA) {
                            break;
                        } else {
                            iAi2--;
                        }
                    }
                } else {
                    int iA2 = qpVar.a();
                    iAi = ai();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iAi) {
                            iBe = 0;
                            break;
                        }
                        iBe2 = be(au(i2));
                        if (iBe2 < 0 && iBe2 < iA2) {
                            iBe = iBe2;
                            break;
                        }
                        i2++;
                    }
                }
                rbVar.a = iBe;
                rbVar.b = Integer.MIN_VALUE;
            } else if (i3 < 0 || i3 >= qpVar.a()) {
                this.f = -1;
                this.g = Integer.MIN_VALUE;
                if (this.o) {
                    int iA3 = qpVar.a();
                    iAi2 = ai() - 1;
                    while (true) {
                        if (iAi2 < 0) {
                            iBe = 0;
                            break;
                        } else {
                            iBe = be(au(iAi2));
                            if (iBe < 0) {
                            }
                            iAi2--;
                        }
                    }
                } else {
                    int iA4 = qpVar.a();
                    iAi = ai();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iAi) {
                            iBe = 0;
                            break;
                        } else {
                            iBe2 = be(au(i2));
                            if (iBe2 < 0) {
                            }
                            i2++;
                        }
                    }
                }
                rbVar.a = iBe;
                rbVar.b = Integer.MIN_VALUE;
            } else {
                rf rfVar7 = this.F;
                if (rfVar7 == null || rfVar7.a == -1 || rfVar7.c <= 0) {
                    View viewL = L(this.f);
                    if (viewL != null) {
                        rbVar.a = this.e ? i() : c();
                        if (this.g != Integer.MIN_VALUE) {
                            if (rbVar.c) {
                                rbVar.b = (this.b.f() - this.g) - this.b.a(viewL);
                            } else {
                                rbVar.b = (this.b.j() + this.g) - this.b.d(viewL);
                            }
                        } else if (this.b.b(viewL) > this.b.k()) {
                            rbVar.b = rbVar.c ? this.b.f() : this.b.j();
                        } else {
                            int iD = this.b.d(viewL) - this.b.j();
                            if (iD < 0) {
                                rbVar.b = -iD;
                            } else {
                                int iF2 = this.b.f() - this.b.a(viewL);
                                if (iF2 < 0) {
                                    rbVar.b = iF2;
                                } else {
                                    rbVar.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i7 = this.f;
                        rbVar.a = i7;
                        int i8 = this.g;
                        if (i8 == Integer.MIN_VALUE) {
                            boolean z4 = N(i7) == 1;
                            rbVar.c = z4;
                            rbVar.b = z4 ? rbVar.g.b.f() : rbVar.g.b.j();
                        } else if (rbVar.c) {
                            rbVar.b = rbVar.g.b.f() - i8;
                        } else {
                            rbVar.b = rbVar.g.b.j() + i8;
                        }
                        rbVar.d = true;
                    }
                } else {
                    rbVar.b = Integer.MIN_VALUE;
                    rbVar.a = this.f;
                }
            }
            rbVar.e = true;
        }
        if (this.F == null && this.f == -1 && (rbVar.c != this.o || K() != this.E)) {
            this.h.a();
            rbVar.d = true;
        }
        if (ai() > 0 && ((rfVar = this.F) == null || rfVar.c <= 0)) {
            if (rbVar.d) {
                for (int i9 = 0; i9 < this.i; i9++) {
                    this.a[i9].j();
                    int i10 = rbVar.b;
                    if (i10 != Integer.MIN_VALUE) {
                        this.a[i9].l(i10);
                    }
                }
            } else if (z3 || this.H.f == null) {
                int i11 = 0;
                while (i11 < this.i) {
                    rg rgVar = this.a[i11];
                    boolean z5 = this.e;
                    int i12 = rbVar.b;
                    int iD2 = z5 ? rgVar.d(Integer.MIN_VALUE) : rgVar.f(Integer.MIN_VALUE);
                    rgVar.j();
                    if (iD2 != Integer.MIN_VALUE && ((!z5 || iD2 >= rgVar.f.b.f()) && (z5 || iD2 <= rgVar.f.b.j()))) {
                        if (i12 != Integer.MIN_VALUE) {
                            iD2 += i12;
                        }
                        rgVar.c = iD2;
                        rgVar.b = iD2;
                    }
                    i11++;
                }
                rb rbVar2 = this.H;
                rg[] rgVarArr = this.a;
                int length = rgVarArr.length;
                int[] iArr = rbVar2.f;
                if (iArr == null || iArr.length < length) {
                    rbVar2.f = new int[rbVar2.g.a.length];
                    i = 0;
                } else {
                    i = 0;
                }
                while (i < length) {
                    rbVar2.f[i] = rgVarArr[i].f(Integer.MIN_VALUE);
                    i++;
                }
            } else {
                for (int i13 = 0; i13 < this.i; i13++) {
                    rg rgVar2 = this.a[i13];
                    rgVar2.j();
                    rgVar2.l(this.H.f[i13]);
                }
            }
        }
        aB(qiVar);
        this.l.a = false;
        G(this.c.k());
        by(rbVar.a, qpVar);
        if (rbVar.c) {
            bx(-1);
            X(qiVar, this.l, qpVar);
            bx(1);
            oz ozVar = this.l;
            ozVar.c = rbVar.a + ozVar.d;
            X(qiVar, ozVar, qpVar);
        } else {
            bx(1);
            X(qiVar, this.l, qpVar);
            bx(-1);
            oz ozVar2 = this.l;
            ozVar2.c = rbVar.a + ozVar2.d;
            X(qiVar, ozVar2, qpVar);
        }
        if (this.c.h() != 1073741824) {
            int iAi3 = ai();
            float fMax = 0.0f;
            for (int i14 = 0; i14 < iAi3; i14++) {
                View viewAu = au(i14);
                float fB = this.c.b(viewAu);
                if (fB >= fMax) {
                    fMax = Math.max(fMax, fB);
                }
            }
            int i15 = this.k;
            int iRound = Math.round(fMax * this.i);
            if (this.c.h() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.c.k());
            }
            G(iRound);
            if (this.k != i15) {
                for (int i16 = 0; i16 < iAi3; i16++) {
                    View viewAu2 = au(i16);
                    rc rcVar = (rc) viewAu2.getLayoutParams();
                    boolean z6 = rcVar.b;
                    if (K() && this.j == 1) {
                        int i17 = -((this.i - 1) - rcVar.a.e);
                        viewAu2.offsetLeftAndRight((this.k * i17) - (i17 * i15));
                    } else {
                        int i18 = rcVar.a.e;
                        int i19 = this.k * i18;
                        int i20 = i18 * i15;
                        if (this.j == 1) {
                            viewAu2.offsetLeftAndRight(i19 - i20);
                        } else {
                            viewAu2.offsetTopAndBottom(i19 - i20);
                        }
                    }
                }
            }
        }
        if (ai() > 0) {
            if (this.e) {
                ad(qiVar, qpVar, true);
                ae(qiVar, qpVar, false);
            } else {
                ae(qiVar, qpVar, true);
                ad(qiVar, qpVar, false);
            }
        }
        if (z && !qpVar.g && this.n != 0 && ai() > 0 && t() != null) {
            bl(this.K);
            z2 = H();
        }
        if (qpVar.g) {
            this.H.a();
        }
        this.o = rbVar.c;
        this.E = K();
        if (z2) {
            this.H.a();
            bs(qiVar, qpVar, false);
        }
    }

    private final void bt(qi qiVar, oz ozVar) {
        int iMin;
        if (!ozVar.a || ozVar.i) {
            return;
        }
        if (ozVar.b == 0) {
            if (ozVar.e == -1) {
                bu(qiVar, ozVar.g);
                return;
            } else {
                bv(qiVar, ozVar.f);
                return;
            }
        }
        int i = 1;
        if (ozVar.e == -1) {
            int i2 = ozVar.f;
            int iF = this.a[0].f(i2);
            while (i < this.i) {
                int iF2 = this.a[i].f(i2);
                if (iF2 > iF) {
                    iF = iF2;
                }
                i++;
            }
            int i3 = i2 - iF;
            bu(qiVar, i3 < 0 ? ozVar.g : ozVar.g - Math.min(i3, ozVar.b));
            return;
        }
        int i4 = ozVar.g;
        int iD = this.a[0].d(i4);
        while (i < this.i) {
            int iD2 = this.a[i].d(i4);
            if (iD2 < iD) {
                iD = iD2;
            }
            i++;
        }
        int i5 = iD - ozVar.g;
        if (i5 < 0) {
            iMin = ozVar.f;
        } else {
            iMin = Math.min(i5, ozVar.b) + ozVar.f;
        }
        bv(qiVar, iMin);
    }

    private final void bu(qi qiVar, int i) {
        for (int iAi = ai() - 1; iAi >= 0; iAi--) {
            View viewAu = au(iAi);
            if (this.b.d(viewAu) < i || this.b.m(viewAu) < i) {
                return;
            }
            rc rcVar = (rc) viewAu.getLayoutParams();
            boolean z = rcVar.b;
            if (rcVar.a.a.size() == 1) {
                return;
            }
            rg rgVar = rcVar.a;
            int size = rgVar.a.size();
            View view = (View) rgVar.a.remove(size - 1);
            rc rcVarN = rg.n(view);
            rcVarN.a = null;
            if (rcVarN.c() || rcVarN.b()) {
                rgVar.d -= rgVar.f.b.b(view);
            }
            if (size == 1) {
                rgVar.b = Integer.MIN_VALUE;
            }
            rgVar.c = Integer.MIN_VALUE;
            aK(viewAu, qiVar);
        }
    }

    private final void bv(qi qiVar, int i) {
        while (ai() > 0) {
            View viewAu = au(0);
            if (this.b.a(viewAu) > i || this.b.l(viewAu) > i) {
                return;
            }
            rc rcVar = (rc) viewAu.getLayoutParams();
            boolean z = rcVar.b;
            if (rcVar.a.a.size() == 1) {
                return;
            }
            rg rgVar = rcVar.a;
            View view = (View) rgVar.a.remove(0);
            rc rcVarN = rg.n(view);
            rcVarN.a = null;
            if (rgVar.a.size() == 0) {
                rgVar.c = Integer.MIN_VALUE;
            }
            if (rcVarN.c() || rcVarN.b()) {
                rgVar.d -= rgVar.f.b.b(view);
            }
            rgVar.b = Integer.MIN_VALUE;
            aK(viewAu, qiVar);
        }
    }

    private final void bw() {
        this.e = (this.j == 1 || !K()) ? this.d : !this.d;
    }

    private final void bx(int i) {
        oz ozVar = this.l;
        ozVar.e = i;
        ozVar.d = this.e != (i == -1) ? -1 : 1;
    }

    private final void by(int i, qp qpVar) {
        int iK;
        int iK2;
        int i2;
        oz ozVar = this.l;
        boolean z = false;
        ozVar.b = 0;
        ozVar.c = i;
        if (!aV() || (i2 = qpVar.a) == -1) {
            iK = 0;
            iK2 = 0;
        } else {
            if (this.e == (i2 < i)) {
                iK = this.b.k();
                iK2 = 0;
            } else {
                iK2 = this.b.k();
                iK = 0;
            }
        }
        RecyclerView recyclerView = this.q;
        if (recyclerView == null || !recyclerView.h) {
            this.l.g = this.b.e() + iK;
            this.l.f = -iK2;
        } else {
            this.l.f = this.b.j() - iK2;
            this.l.g = this.b.f() + iK;
        }
        oz ozVar2 = this.l;
        ozVar2.h = false;
        ozVar2.a = true;
        if (this.b.h() == 0 && this.b.e() == 0) {
            z = true;
        }
        ozVar2.i = z;
    }

    private final void bz(rg rgVar, int i, int i2) {
        int i3 = rgVar.d;
        if (i == -1) {
            if (rgVar.e() + i3 <= i2) {
                this.m.set(rgVar.e, false);
            }
        } else if (rgVar.c() - i3 >= i2) {
            this.m.set(rgVar.e, false);
        }
    }

    @Override // defpackage.qc
    public final int A(qp qpVar) {
        return T(qpVar);
    }

    @Override // defpackage.qc
    public final int B(qp qpVar) {
        return O(qpVar);
    }

    @Override // defpackage.qc
    public final int C(qp qpVar) {
        return S(qpVar);
    }

    @Override // defpackage.qc
    public final int D(qp qpVar) {
        return T(qpVar);
    }

    final void E(int i, qp qpVar) {
        int iC;
        int i2;
        if (i > 0) {
            iC = i();
            i2 = 1;
        } else {
            iC = c();
            i2 = -1;
        }
        this.l.a = true;
        by(iC, qpVar);
        bx(i2);
        oz ozVar = this.l;
        ozVar.c = iC + ozVar.d;
        ozVar.b = Math.abs(i);
    }

    public final void F(boolean z) {
        M(null);
        rf rfVar = this.F;
        if (rfVar != null && rfVar.h != z) {
            rfVar.h = z;
        }
        this.d = z;
        aN();
    }

    final void G(int i) {
        this.k = i / this.i;
        View.MeasureSpec.makeMeasureSpec(i, this.c.h());
    }

    public final boolean H() {
        int iC;
        if (ai() == 0 || this.n == 0 || !this.v) {
            return false;
        }
        if (this.e) {
            iC = i();
            c();
        } else {
            iC = c();
            i();
        }
        if (iC != 0 || t() == null) {
            return false;
        }
        this.h.a();
        this.u = true;
        aN();
        return true;
    }

    @Override // defpackage.qn
    public final PointF I(int i) {
        int iN = N(i);
        PointF pointF = new PointF();
        if (iN == 0) {
            return null;
        }
        if (this.j == 0) {
            pointF.x = iN;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iN;
        }
        return pointF;
    }

    @Override // defpackage.qc
    public final Parcelable J() {
        int iF;
        int[] iArr;
        rf rfVar = this.F;
        if (rfVar != null) {
            return new rf(rfVar);
        }
        rf rfVar2 = new rf();
        rfVar2.h = this.d;
        rfVar2.i = this.o;
        rfVar2.j = this.E;
        re reVar = this.h;
        if (reVar == null || (iArr = reVar.a) == null) {
            rfVar2.e = 0;
        } else {
            rfVar2.f = iArr;
            rfVar2.e = rfVar2.f.length;
            rfVar2.g = reVar.b;
        }
        if (ai() > 0) {
            rfVar2.a = this.o ? i() : c();
            View viewL = this.e ? l(true) : q(true);
            rfVar2.b = viewL != null ? be(viewL) : -1;
            int i = this.i;
            rfVar2.c = i;
            rfVar2.d = new int[i];
            for (int i2 = 0; i2 < this.i; i2++) {
                if (this.o) {
                    iF = this.a[i2].d(Integer.MIN_VALUE);
                    if (iF != Integer.MIN_VALUE) {
                        iF -= this.b.f();
                    }
                } else {
                    iF = this.a[i2].f(Integer.MIN_VALUE);
                    if (iF != Integer.MIN_VALUE) {
                        iF -= this.b.j();
                    }
                }
                rfVar2.d[i2] = iF;
            }
        } else {
            rfVar2.a = -1;
            rfVar2.b = -1;
            rfVar2.c = 0;
        }
        return rfVar2;
    }

    final boolean K() {
        return al() == 1;
    }

    @Override // defpackage.qc
    public final void M(String str) {
        if (this.F == null) {
            super.M(str);
        }
    }

    @Override // defpackage.qc
    public final void P(AccessibilityEvent accessibilityEvent) {
        super.P(accessibilityEvent);
        if (ai() > 0) {
            View viewQ = q(false);
            View viewL = l(false);
            if (viewQ == null || viewL == null) {
                return;
            }
            int iBe = be(viewQ);
            int iBe2 = be(viewL);
            if (iBe < iBe2) {
                accessibilityEvent.setFromIndex(iBe);
                accessibilityEvent.setToIndex(iBe2);
            } else {
                accessibilityEvent.setFromIndex(iBe2);
                accessibilityEvent.setToIndex(iBe);
            }
        }
    }

    @Override // defpackage.qc
    public final void Q(Parcelable parcelable) {
        if (parcelable instanceof rf) {
            rf rfVar = (rf) parcelable;
            this.F = rfVar;
            if (this.f != -1) {
                rfVar.a();
                this.F.b();
            }
            aN();
        }
    }

    @Override // defpackage.qc
    public final void R(int i) {
        rf rfVar = this.F;
        if (rfVar != null && rfVar.a != i) {
            rfVar.a();
        }
        this.f = i;
        this.g = Integer.MIN_VALUE;
        aN();
    }

    @Override // defpackage.qc
    public final boolean U() {
        return this.j == 0;
    }

    @Override // defpackage.qc
    public final boolean V() {
        return this.j == 1;
    }

    @Override // defpackage.qc
    public final boolean W() {
        return this.n != 0;
    }

    @Override // defpackage.qc
    public final void aD(int i) {
        super.aD(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.qc
    public final void aE(int i) {
        super.aE(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.qc
    public final void aH(int i) {
        if (i == 0) {
            H();
        }
    }

    @Override // defpackage.qc
    public final void aa(int i, int i2, qp qpVar, ou ouVar) {
        int i3;
        int i4;
        int iD;
        if (1 == this.j) {
            i = i2;
        }
        if (ai() == 0 || i == 0) {
            return;
        }
        E(i, qpVar);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.i) {
            this.J = new int[this.i];
            i3 = 0;
            i4 = 0;
        } else {
            i3 = 0;
            i4 = 0;
        }
        while (i3 < this.i) {
            oz ozVar = this.l;
            if (ozVar.d == -1) {
                int i5 = ozVar.f;
                iD = i5 - this.a[i3].f(i5);
            } else {
                iD = this.a[i3].d(ozVar.g) - this.l.g;
            }
            if (iD >= 0) {
                this.J[i4] = iD;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.J, 0, i4);
        for (int i6 = 0; i6 < i4 && this.l.a(qpVar); i6++) {
            ouVar.a(this.l.c, this.J[i6]);
            oz ozVar2 = this.l;
            ozVar2.c += ozVar2.d;
        }
    }

    @Override // defpackage.qc
    public final void af(RecyclerView recyclerView) {
        bl(this.K);
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.qc
    public final void ag(RecyclerView recyclerView, int i) {
        qo qoVar = new qo(recyclerView.getContext());
        qoVar.b = i;
        aT(qoVar);
    }

    @Override // defpackage.qc
    public final void bj() {
        this.h.a();
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
    }

    final int c() {
        if (ai() == 0) {
            return 0;
        }
        return be(au(0));
    }

    @Override // defpackage.qc
    public final int d(int i, qi qiVar, qp qpVar) {
        return k(i, qiVar, qpVar);
    }

    @Override // defpackage.qc
    public final int e(int i, qi qiVar, qp qpVar) {
        return k(i, qiVar, qpVar);
    }

    @Override // defpackage.qc
    public final qd f() {
        return this.j == 0 ? new rc(-2, -1) : new rc(-1, -2);
    }

    @Override // defpackage.qc
    public final qd g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new rc((ViewGroup.MarginLayoutParams) layoutParams) : new rc(layoutParams);
    }

    @Override // defpackage.qc
    public final qd h(Context context, AttributeSet attributeSet) {
        return new rc(context, attributeSet);
    }

    final int i() {
        int iAi = ai();
        if (iAi == 0) {
            return 0;
        }
        return be(au(iAi - 1));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0031  */
    /* JADX WARN: Code duplicated, block: B:26:0x0038 A[ADDED_TO_REGION, REMOVE] */
    @Override // defpackage.qc
    public final View j(View view, int i, qi qiVar, qp qpVar) {
        View viewAt;
        int i2;
        if (ai() == 0 || (viewAt = at(view)) == null) {
            return null;
        }
        bw();
        switch (i) {
            case 1:
                if (this.j == 1 || !K()) {
                    i2 = -1;
                }
                break;
            case 2:
                i2 = (this.j != 1 && K()) ? -1 : 1;
                break;
            case 17:
                if (this.j == 0) {
                    i2 = -1;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
                break;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                if (this.j == 1) {
                    i2 = -1;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
                break;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                if (this.j != 0) {
                    i2 = Integer.MIN_VALUE;
                }
                break;
            case 130:
                if (this.j != 1) {
                    i2 = Integer.MIN_VALUE;
                }
                break;
            default:
                i2 = Integer.MIN_VALUE;
                break;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        rc rcVar = (rc) viewAt.getLayoutParams();
        boolean z = rcVar.b;
        rg rgVar = rcVar.a;
        int i3 = i2 == 1 ? i() : c();
        by(i3, qpVar);
        bx(i2);
        oz ozVar = this.l;
        ozVar.c = ozVar.d + i3;
        ozVar.b = (int) (this.b.k() * 0.33333334f);
        oz ozVar2 = this.l;
        ozVar2.h = true;
        ozVar2.a = false;
        X(qiVar, ozVar2, qpVar);
        this.o = this.e;
        View viewG = rgVar.g(i3, i2);
        if (viewG != null && viewG != viewAt) {
            return viewG;
        }
        if (bA(i2)) {
            for (int i4 = this.i - 1; i4 >= 0; i4--) {
                View viewG2 = this.a[i4].g(i3, i2);
                if (viewG2 != null && viewG2 != viewAt) {
                    return viewG2;
                }
            }
        } else {
            for (int i5 = 0; i5 < this.i; i5++) {
                View viewG3 = this.a[i5].g(i3, i2);
                if (viewG3 != null && viewG3 != viewAt) {
                    return viewG3;
                }
            }
        }
        boolean z2 = !this.d;
        boolean z3 = i2 == -1;
        View viewL = L(z2 == z3 ? rgVar.a() : rgVar.b());
        if (viewL != null && viewL != viewAt) {
            return viewL;
        }
        if (bA(i2)) {
            for (int i6 = this.i - 1; i6 >= 0; i6--) {
                if (i6 != rgVar.e) {
                    View viewL2 = L(z2 == z3 ? this.a[i6].a() : this.a[i6].b());
                    if (viewL2 != null && viewL2 != viewAt) {
                        return viewL2;
                    }
                }
            }
        } else {
            for (int i7 = 0; i7 < this.i; i7++) {
                View viewL3 = L(z2 == z3 ? this.a[i7].a() : this.a[i7].b());
                if (viewL3 != null && viewL3 != viewAt) {
                    return viewL3;
                }
            }
        }
        return null;
    }

    final int k(int i, qi qiVar, qp qpVar) {
        if (ai() == 0 || i == 0) {
            return 0;
        }
        E(i, qpVar);
        int iX = X(qiVar, this.l, qpVar);
        if (this.l.b >= iX) {
            i = i < 0 ? -iX : iX;
        }
        this.b.n(-i);
        this.o = this.e;
        oz ozVar = this.l;
        ozVar.b = 0;
        bt(qiVar, ozVar);
        return i;
    }

    final View l(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        View view = null;
        for (int iAi = ai() - 1; iAi >= 0; iAi--) {
            View viewAu = au(iAi);
            int iD = this.b.d(viewAu);
            int iA = this.b.a(viewAu);
            if (iA > iJ && iD < iF) {
                if (iA <= iF || !z) {
                    return viewAu;
                }
                if (view == null) {
                    view = viewAu;
                }
            }
        }
        return view;
    }

    @Override // defpackage.qc
    public final void n(qi qiVar, qp qpVar) {
        bs(qiVar, qpVar, true);
    }

    @Override // defpackage.qc
    public final void o(qp qpVar) {
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // defpackage.qc
    public final void p(Rect rect, int i, int i2) {
        int iAh;
        int iAh2;
        int iAp = ap() + aq();
        int iAr = ar() + ao();
        if (this.j == 1) {
            iAh2 = ah(i2, rect.height() + iAr, am());
            iAh = ah(i, (this.k * this.i) + iAp, an());
        } else {
            iAh = ah(i, rect.width() + iAp, an());
            iAh2 = ah(i2, (this.k * this.i) + iAr, am());
        }
        aQ(iAh, iAh2);
    }

    final View q(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        int iAi = ai();
        View view = null;
        for (int i = 0; i < iAi; i++) {
            View viewAu = au(i);
            int iD = this.b.d(viewAu);
            if (this.b.a(viewAu) > iJ && iD < iF) {
                if (iD >= iJ || !z) {
                    return viewAu;
                }
                if (view == null) {
                    view = viewAu;
                }
            }
        }
        return view;
    }

    @Override // defpackage.qc
    public final boolean r(qd qdVar) {
        return qdVar instanceof rc;
    }

    @Override // defpackage.qc
    public final boolean s() {
        return this.F == null;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0030 A[SYNTHETIC] */
    final View t() {
        int i;
        boolean z;
        boolean z2;
        int iAi = ai() - 1;
        BitSet bitSet = new BitSet(this.i);
        bitSet.set(0, this.i, true);
        byte b = (this.j == 1 && K()) ? (byte) 1 : (byte) -1;
        if (this.e) {
            i = -1;
        } else {
            i = iAi + 1;
            iAi = 0;
        }
        int i2 = iAi < i ? 1 : -1;
        while (iAi != i) {
            View viewAu = au(iAi);
            rc rcVar = (rc) viewAu.getLayoutParams();
            if (bitSet.get(rcVar.a.e)) {
                rg rgVar = rcVar.a;
                if (this.e) {
                    if (rgVar.c() < this.b.f()) {
                        ArrayList arrayList = rgVar.a;
                        boolean z3 = rg.n((View) arrayList.get(arrayList.size() - 1)).b;
                        return viewAu;
                    }
                    bitSet.clear(rcVar.a.e);
                } else {
                    if (rgVar.e() > this.b.j()) {
                        boolean z4 = rg.n((View) rgVar.a.get(0)).b;
                        return viewAu;
                    }
                    bitSet.clear(rcVar.a.e);
                }
            }
            boolean z5 = rcVar.b;
            iAi += i2;
            if (iAi != i) {
                View viewAu2 = au(iAi);
                if (this.e) {
                    int iA = this.b.a(viewAu);
                    int iA2 = this.b.a(viewAu2);
                    if (iA < iA2) {
                        return viewAu;
                    }
                    if (iA == iA2) {
                        if (rcVar.a.e - ((rc) viewAu2.getLayoutParams()).a.e >= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (b >= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z == z2) {
                            return viewAu;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iD = this.b.d(viewAu);
                    int iD2 = this.b.d(viewAu2);
                    if (iD > iD2) {
                        return viewAu;
                    }
                    if (iD != iD2) {
                        continue;
                    } else {
                        if (rcVar.a.e - ((rc) viewAu2.getLayoutParams()).a.e >= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (b >= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z == z2) {
                            return viewAu;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.qc
    public final void u(int i, int i2) {
        br(i, i2, 1);
    }

    @Override // defpackage.qc
    public final void v() {
        this.h.a();
        aN();
    }

    @Override // defpackage.qc
    public final void w(int i, int i2) {
        br(i, i2, 2);
    }

    @Override // defpackage.qc
    public final void x(int i, int i2) {
        br(i, i2, 4);
    }

    @Override // defpackage.qc
    public final int y(qp qpVar) {
        return O(qpVar);
    }

    @Override // defpackage.qc
    public final int z(qp qpVar) {
        return S(qpVar);
    }
}
