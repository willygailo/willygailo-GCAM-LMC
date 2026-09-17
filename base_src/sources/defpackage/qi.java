package defpackage;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qi {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    int e;
    qh f;
    public final /* synthetic */ RecyclerView g;

    public qi(RecyclerView recyclerView) {
        this.g = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
    }

    public final int a(int i) {
        if (i >= 0 && i < this.g.L.a()) {
            RecyclerView recyclerView = this.g;
            return !recyclerView.L.g ? i : recyclerView.e.a(i);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.g.L.a() + this.g.k());
    }

    public final qh b() {
        if (this.f == null) {
            this.f = new qh();
        }
        return this.f;
    }

    public final View c(int i) {
        return n(i, Long.MAX_VALUE).a;
    }

    final void d(qs qsVar, boolean z) {
        RecyclerView.q(qsVar);
        View view = qsVar.a;
        qu quVar = this.g.P;
        if (quVar != null) {
            fg fgVarK = quVar.k();
            gl.F(view, fgVarK instanceof qt ? (fg) ((qt) fgVarK).c.remove(view) : null);
        }
        if (z) {
            int size = this.g.n.size();
            for (int i = 0; i < size; i++) {
                ((qj) this.g.n.get(i)).a();
            }
            RecyclerView recyclerView = this.g;
            if (recyclerView.L != null) {
                recyclerView.g.h(qsVar);
            }
        }
        qsVar.r = null;
        qsVar.q = null;
        qh qhVarB = b();
        int i2 = qsVar.f;
        ArrayList arrayList = qhVarB.a(i2).a;
        int i3 = ((qg) qhVarB.a.get(i2)).b;
        if (arrayList.size() >= 5) {
            return;
        }
        qsVar.k();
        arrayList.add(qsVar);
    }

    public final void e() {
        this.a.clear();
        g();
    }

    final void f(View view) {
        qs qsVarH = RecyclerView.h(view);
        qsVarH.m = null;
        qsVarH.n = false;
        qsVarH.h();
        j(qsVarH);
    }

    public final void g() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            h(size);
        }
        this.c.clear();
        int i = RecyclerView.S;
        this.g.K.b();
    }

    public final void h(int i) {
        d((qs) this.c.get(i), true);
        this.c.remove(i);
    }

    public final void i(View view) {
        qs qsVarH = RecyclerView.h(view);
        if (qsVarH.w()) {
            this.g.removeDetachedView(view, false);
        }
        if (qsVarH.v()) {
            qsVarH.o();
        } else if (qsVarH.A()) {
            qsVarH.h();
        }
        j(qsVarH);
        if (this.g.E == null || qsVarH.t()) {
            return;
        }
        this.g.E.h(qsVarH);
    }

    final void j(qs qsVar) {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        if (qsVar.v() || qsVar.a.getParent() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(qsVar.v());
            sb.append(" isAttached:");
            sb.append(qsVar.a.getParent() != null);
            sb.append(this.g.k());
            throw new IllegalArgumentException(sb.toString());
        }
        if (qsVar.w()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + qsVar + this.g.k());
        }
        if (qsVar.z()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + this.g.k());
        }
        boolean z4 = (qsVar.j & 16) == 0 && gl.T(qsVar.a);
        if (qsVar.t()) {
            if (this.e <= 0 || qsVar.p(526)) {
                z = false;
            } else {
                int size = this.c.size();
                if (size >= this.e && size > 0) {
                    h(0);
                    size--;
                }
                if (size > 0 && !this.g.K.d(qsVar.c)) {
                    int i = size - 1;
                    while (i >= 0) {
                        if (!this.g.K.d(((qs) this.c.get(i)).c)) {
                            break;
                        } else {
                            i--;
                        }
                    }
                    size = i + 1;
                }
                this.c.add(size, qsVar);
                z = true;
            }
            if (z) {
                z3 = z;
                z2 = false;
            } else {
                d(qsVar, true);
                z3 = z;
            }
        } else {
            z2 = false;
        }
        this.g.g.h(qsVar);
        if (z3 || z2 || !z4) {
            return;
        }
        qsVar.r = null;
        qsVar.q = null;
    }

    final void k(View view) {
        qs qsVarH = RecyclerView.h(view);
        if (!qsVarH.p(12) && qsVarH.x() && this.g.E != null && qsVarH.c().isEmpty() && !qsVarH.s()) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            qsVarH.n(this, true);
            this.b.add(qsVarH);
            return;
        }
        if (!qsVarH.s() || qsVarH.u() || this.g.l.b) {
            qsVarH.n(this, false);
            this.a.add(qsVarH);
        } else {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.g.k());
        }
    }

    public final void l(qs qsVar) {
        if (qsVar.n) {
            this.b.remove(qsVar);
        } else {
            this.a.remove(qsVar);
        }
        qsVar.m = null;
        qsVar.n = false;
        qsVar.h();
    }

    public final void m() {
        qc qcVar = this.g.m;
        this.e = (qcVar != null ? qcVar.y : 0) + 2;
        for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.e; size--) {
            h(size);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0203  */
    /* JADX WARN: Code duplicated, block: B:115:0x020d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0218  */
    /* JADX WARN: Code duplicated, block: B:118:0x021e  */
    /* JADX WARN: Code duplicated, block: B:223:0x0431  */
    final qs n(int i, long j) {
        qs qsVarH;
        boolean z;
        boolean z2;
        ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
        qs qsVar;
        View view;
        int size;
        int iA;
        if (i < 0 || i >= this.g.L.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + this.g.L.a() + this.g.k());
        }
        boolean z3 = false;
        if (this.g.L.g) {
            ArrayList arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        RecyclerView recyclerView = this.g;
                        if (recyclerView.l.b && (iA = recyclerView.e.a(i)) > 0 && iA < this.g.l.a()) {
                            long jC = this.g.l.c(iA);
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    qsVarH = null;
                                    break;
                                }
                                qs qsVar2 = (qs) this.b.get(i3);
                                if (!qsVar2.A() && qsVar2.e == jC) {
                                    qsVar2.e(32);
                                    qsVarH = qsVar2;
                                    break;
                                }
                                i3++;
                            }
                        } else {
                            qsVarH = null;
                            break;
                        }
                    } else {
                        qsVarH = (qs) this.b.get(i2);
                        if (!qsVarH.A() && qsVarH.b() == i) {
                            qsVarH.e(32);
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                qsVarH = null;
            }
            z = qsVarH != null;
        } else {
            qsVarH = null;
            z = false;
        }
        if (qsVarH == null) {
            int size2 = this.a.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    ny nyVar = this.g.f;
                    int size3 = nyVar.b.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size3) {
                            view = null;
                            break;
                        }
                        view = (View) nyVar.b.get(i5);
                        pz pzVar = nyVar.c;
                        qs qsVarH2 = RecyclerView.h(view);
                        if (qsVarH2.b() == i && !qsVarH2.s() && !qsVarH2.u()) {
                            break;
                        }
                        i5++;
                    }
                    if (view == null) {
                        int size4 = this.c.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size4) {
                                qsVarH = null;
                                break;
                            }
                            qs qsVar3 = (qs) this.c.get(i6);
                            if (!qsVar3.s() && qsVar3.b() == i && !qsVar3.q()) {
                                this.c.remove(i6);
                                qsVarH = qsVar3;
                                break;
                            }
                            i6++;
                        }
                    } else {
                        qsVarH = RecyclerView.h(view);
                        ny nyVar2 = this.g.f;
                        int iG = nyVar2.c.g(view);
                        if (iG < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                        if (!nyVar2.a.f(iG)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        nyVar2.a.b(iG);
                        nyVar2.l(view);
                        int iD = this.g.f.d(view);
                        if (iD != -1) {
                            this.g.f.i(iD);
                            k(view);
                            qsVarH.e(8224);
                            break;
                        }
                        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + qsVarH + this.g.k());
                    }
                } else {
                    qs qsVar4 = (qs) this.a.get(i4);
                    if (!qsVar4.A() && qsVar4.b() == i && !qsVar4.s() && (this.g.L.g || !qsVar4.u())) {
                        qsVar4.e(32);
                        qsVarH = qsVar4;
                        break;
                    }
                    i4++;
                }
            }
            if (qsVarH != null) {
                if (!qsVarH.u()) {
                    int i7 = qsVarH.c;
                    if (i7 < 0 || i7 >= this.g.l.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + qsVarH + this.g.k());
                    }
                    RecyclerView recyclerView2 = this.g;
                    if (recyclerView2.L.g || recyclerView2.l.b(qsVarH.c) == qsVarH.f) {
                        pu puVar = this.g.l;
                        if (!puVar.b || qsVarH.e == puVar.c(qsVarH.c)) {
                            z = true;
                        } else {
                            qsVarH.e(4);
                            if (qsVarH.v()) {
                                this.g.removeDetachedView(qsVarH.a, false);
                                qsVarH.o();
                            } else if (qsVarH.A()) {
                                qsVarH.h();
                            }
                            j(qsVarH);
                            qsVarH = null;
                        }
                    } else {
                        qsVarH.e(4);
                        if (qsVarH.v()) {
                            this.g.removeDetachedView(qsVarH.a, false);
                            qsVarH.o();
                        } else if (qsVarH.A()) {
                            qsVarH.h();
                        }
                        j(qsVarH);
                        qsVarH = null;
                    }
                } else if (this.g.L.g) {
                    z = true;
                } else {
                    qsVarH.e(4);
                    if (qsVarH.v()) {
                        this.g.removeDetachedView(qsVarH.a, false);
                        qsVarH.o();
                    } else if (qsVarH.A()) {
                        qsVarH.h();
                    }
                    j(qsVarH);
                    qsVarH = null;
                }
            }
        }
        if (qsVarH == null) {
            int iA2 = this.g.e.a(i);
            if (iA2 < 0 || iA2 >= this.g.l.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iA2 + ").state:" + this.g.L.a() + this.g.k());
            }
            int iB = this.g.l.b(iA2);
            pu puVar2 = this.g.l;
            if (puVar2.b) {
                long jC2 = puVar2.c(iA2);
                int size5 = this.a.size() - 1;
                while (true) {
                    if (size5 < 0) {
                        int size6 = this.c.size() - 1;
                        while (true) {
                            if (size6 >= 0) {
                                qs qsVar5 = (qs) this.c.get(size6);
                                if (qsVar5.e != jC2 || qsVar5.q()) {
                                    size6--;
                                } else {
                                    if (iB == qsVar5.f) {
                                        this.c.remove(size6);
                                        qsVarH = qsVar5;
                                        break;
                                    }
                                    h(size6);
                                }
                            }
                            qsVarH = null;
                            break;
                        }
                    }
                    qsVarH = (qs) this.a.get(size5);
                    if (qsVarH.e == jC2 && !qsVarH.A()) {
                        if (iB == qsVarH.f) {
                            qsVarH.e(32);
                            if (!qsVarH.u() || this.g.L.g) {
                                break;
                                break;
                            }
                            qsVarH.l(2, 14);
                            break;
                        }
                        this.a.remove(size5);
                        this.g.removeDetachedView(qsVarH.a, false);
                        f(qsVarH.a);
                    }
                    size5--;
                }
                if (qsVarH != null) {
                    qsVarH.c = iA2;
                    z = true;
                }
            }
            if (qsVarH == null) {
                qg qgVar = (qg) b().a.get(iB);
                if (qgVar != null && !qgVar.a.isEmpty()) {
                    ArrayList arrayList2 = qgVar.a;
                    int size7 = arrayList2.size() - 1;
                    while (true) {
                        if (size7 < 0) {
                            qsVar = null;
                            break;
                        }
                        if (!((qs) arrayList2.get(size7)).q()) {
                            qsVar = (qs) arrayList2.remove(size7);
                            break;
                        }
                        size7--;
                    }
                } else {
                    qsVar = null;
                    break;
                }
                if (qsVar != null) {
                    qsVar.k();
                }
                qsVarH = qsVar;
            }
            if (qsVarH == null) {
                long jNanoTime = System.nanoTime();
                if (j != Long.MAX_VALUE) {
                    long j2 = this.f.a(iB).c;
                    if (j2 != 0 && j2 + jNanoTime >= j) {
                        return null;
                    }
                }
                RecyclerView recyclerView3 = this.g;
                pu puVar3 = recyclerView3.l;
                try {
                    Trace.beginSection("RV CreateView");
                    qs qsVarD = puVar3.d(recyclerView3, iB);
                    if (qsVarD.a.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    qsVarD.f = iB;
                    Trace.endSection();
                    RecyclerView recyclerViewI = RecyclerView.i(qsVarD.a);
                    if (recyclerViewI != null) {
                        qsVarD.b = new WeakReference(recyclerViewI);
                    }
                    long jNanoTime2 = System.nanoTime();
                    qg qgVarA = this.f.a(iB);
                    qgVarA.c = qh.b(qgVarA.c, jNanoTime2 - jNanoTime);
                    qsVarH = qsVarD;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        }
        if (z && !this.g.L.g && qsVarH.p(8192)) {
            qsVarH.l(0, 8192);
            if (this.g.L.j) {
                py.d(qsVarH);
                qsVarH.c();
                this.g.P(qsVarH, py.e(qsVarH));
            }
        }
        if (this.g.L.g && qsVarH.r()) {
            qsVarH.g = i;
            z2 = false;
        } else if (!qsVarH.r() || qsVarH.y() || qsVarH.s()) {
            int iA3 = this.g.e.a(i);
            qsVarH.r = null;
            qsVarH.q = this.g;
            int i8 = qsVarH.f;
            long jNanoTime3 = System.nanoTime();
            if (j != Long.MAX_VALUE) {
                long j3 = this.f.a(i8).d;
                if (j3 != 0 && j3 + jNanoTime3 >= j) {
                    z2 = false;
                }
            }
            pu puVar4 = this.g.l;
            pu puVar5 = qsVarH.r;
            if (puVar5 == null) {
                qsVarH.c = iA3;
                if (puVar4.b) {
                    qsVarH.e = puVar4.c(iA3);
                }
                qsVarH.l(1, 519);
                Trace.beginSection("RV OnBindView");
            }
            qsVarH.r = puVar4;
            qsVarH.c();
            puVar4.e(qsVarH, iA3);
            if (puVar5 == null) {
                qsVarH.g();
                ViewGroup.LayoutParams layoutParams = qsVarH.a.getLayoutParams();
                if (layoutParams instanceof qd) {
                    ((qd) layoutParams).e = true;
                }
                Trace.endSection();
            }
            long jNanoTime4 = System.nanoTime();
            qg qgVarA2 = this.f.a(qsVarH.f);
            qgVarA2.d = qh.b(qgVarA2.d, jNanoTime4 - jNanoTime3);
            if (this.g.ag()) {
                View view2 = qsVarH.a;
                if (gl.d(view2) == 0) {
                    gl.M(view2, 1);
                }
                qu quVar = this.g.P;
                if (quVar != null) {
                    fg fgVarK = quVar.k();
                    if (fgVarK instanceof qt) {
                        qt qtVar = (qt) fgVarK;
                        fg fgVarN = gl.n(view2);
                        if (fgVarN != null && fgVarN != qtVar) {
                            qtVar.c.put(view2, fgVarN);
                        }
                    }
                    gl.F(view2, fgVarK);
                }
            }
            if (this.g.L.g) {
                qsVarH.g = i;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        ViewGroup.LayoutParams layoutParams2 = qsVarH.a.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParamsGenerateLayoutParams = this.g.generateDefaultLayoutParams();
            qsVarH.a.setLayoutParams(layoutParamsGenerateLayoutParams);
        } else if (this.g.checkLayoutParams(layoutParams2)) {
            layoutParamsGenerateLayoutParams = (qd) layoutParams2;
        } else {
            layoutParamsGenerateLayoutParams = this.g.generateLayoutParams(layoutParams2);
            qsVarH.a.setLayoutParams(layoutParamsGenerateLayoutParams);
        }
        qd qdVar = (qd) layoutParamsGenerateLayoutParams;
        qdVar.c = qsVarH;
        if (z && z2) {
            z3 = true;
        }
        qdVar.f = z3;
        return qsVarH;
    }
}
