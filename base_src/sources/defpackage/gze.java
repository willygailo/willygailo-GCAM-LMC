package defpackage;

import android.hardware.camera2.CaptureResult;
import j$.util.function.Supplier;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gze implements hen {
    public static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/commands/PckFilteredRingBuffer");
    public final onv b = onv.r();
    public final lmv c;
    private final ojz d;
    private final giq e;
    private final long f;
    private final hes g;
    private final Set h;
    private final dze i;
    private final lnc j;
    private final ljf k;
    private final int l;

    public gze(lap lapVar, giq giqVar, pht phtVar, hes hesVar, Set set, dze dzeVar, lnc lncVar, ljf ljfVar, long j, final lmv lmvVar, ojz ojzVar, int i) {
        this.e = giqVar;
        this.d = ojzVar;
        this.l = i;
        this.f = j;
        this.c = lmvVar;
        this.g = hesVar;
        this.h = set;
        this.i = dzeVar;
        this.j = lncVar;
        this.k = ljfVar;
        for (lnx lnxVar : lmvVar.q().c) {
            this.b.l(Integer.valueOf(lnxVar.a()), lnxVar);
        }
        lapVar.c(lmvVar);
        mip.ca(phtVar, new lht() { // from class: gzd
            @Override // defpackage.lht
            public final void a(Object obj) {
                lmv lmvVar2 = lmvVar;
                ojc ojcVar = (ojc) obj;
                obr.ao(ojcVar);
                if (ojcVar.g()) {
                    lmvVar2.n((lmt) ojcVar.c());
                }
            }
        }, pgr.INSTANCE);
        if (((old) this.b).a.containsKey(37) && hesVar.a.k(ddm.W)) {
            meh mehVar = hesVar.c;
            ebe ebeVar = (ebe) mehVar.c.get();
            ebeVar.getClass();
            hcg hcgVar = (hcg) mehVar.b.get();
            hcgVar.getClass();
            lbs lbsVarK = bwk.k();
            Supplier supplier = (Supplier) mehVar.a.get();
            supplier.getClass();
            heq heqVar = new heq(ebeVar, hcgVar, lbsVarK, supplier, lmvVar);
            lmvVar.k(heqVar);
            hesVar.b.c(heqVar);
            ojc.i(heqVar);
        }
    }

    @Override // defpackage.hen
    public final hem a() {
        return new hem() { // from class: gzc
            @Override // defpackage.hem
            public final void a() {
            }
        };
    }

    @Override // defpackage.hen
    public final lmr b(long j) {
        return this.c.d(new fmu(j, 3));
    }

    @Override // defpackage.hen
    public final lmr c() {
        lmr lmrVarE;
        switch (this.l - 1) {
            case 1:
                lmrVarE = this.c.e();
                break;
            default:
                lmrVarE = this.c.h();
                break;
        }
        if (lmrVarE != null) {
            mip.bh(lmrVarE);
        }
        return lmrVarE;
    }

    @Override // defpackage.hen
    public final lmr d() {
        switch (this.l - 1) {
            case 1:
                return this.c.c();
            default:
                return this.c.g();
        }
    }

    @Override // defpackage.hen
    public final lmr e() {
        lmr lmrVarH = this.c.h();
        if (lmrVarH != null) {
            mip.bh(lmrVarH);
        }
        return lmrVarH;
    }

    @Override // defpackage.hen
    public final lmv f() {
        return this.c;
    }

    @Override // defpackage.hen
    public final oom g(List list) {
        oom oomVarF;
        oom oomVarF2;
        oom oomVarF3;
        Float f;
        this.k.e("zslRingBuffer#filterAndTrim");
        this.k.e("zslRingBuffer#filterByTimestamp");
        if (list.isEmpty()) {
            oomVarF = oom.l();
        } else {
            ooh oohVarE = oom.e();
            lmw lmwVarB = ((lmr) ohh.t(list)).b();
            long jMax = (lmwVarB != null ? Math.max(lmwVarB.b, this.e.h()) : this.e.h()) - this.f;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lmr lmrVar = (lmr) it.next();
                lmw lmwVarB2 = lmrVar.b();
                if (lmwVarB2 == null || lmwVarB2.b <= jMax) {
                    lmrVar.close();
                } else {
                    oohVarE.g(lmrVar);
                }
            }
            oomVarF = oohVarE.f();
        }
        this.k.g("zslRingBuffer#trimByCapacity");
        if (oomVarF.isEmpty()) {
            oomVarF2 = oom.l();
        } else {
            LinkedList linkedList = new LinkedList(oomVarF);
            ooh oohVarE2 = oom.e();
            int iMin = Math.min(((Integer) this.d.a()).intValue(), ((orr) oomVarF).c);
            for (int i = 0; i < iMin; i++) {
                lmr lmrVar2 = (lmr) linkedList.pollLast();
                if (lmrVar2 != null) {
                    oohVarE2.g(lmrVar2);
                }
            }
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                ((lmr) it2.next()).close();
            }
            oomVarF2 = oohVarE2.f();
        }
        this.k.f();
        this.k.g("zslRingBuffer#filterByMetadata");
        if (oomVarF2.isEmpty()) {
            oomVarF3 = oom.l();
        } else {
            ooh oohVarE3 = oom.e();
            lmr lmrVar3 = (lmr) oomVarF2.get(0);
            this.k.e("zslRingBuffer#getRecentFocalLength");
            mip.bi(lmrVar3);
            lzv lzvVarC = lmrVar3.c();
            float fFloatValue = -1.0f;
            if (lzvVarC != null && (f = (Float) lzvVarC.d(CaptureResult.LENS_FOCAL_LENGTH)) != null) {
                fFloatValue = f.floatValue();
            }
            Float fValueOf = Float.valueOf(fFloatValue);
            this.k.g("zslRingBuffer#buildFilter");
            opc opcVar = new opc();
            opcVar.i(this.h);
            opcVar.d(new hfc(CaptureResult.LENS_FOCAL_LENGTH, fValueOf));
            hev hevVar = new hev(opcVar.f());
            this.k.g("findBinningStatus");
            Set setA = this.g.a(oomVarF2);
            this.k.f();
            otj it3 = oomVarF2.iterator();
            boolean z = false;
            while (it3.hasNext()) {
                lmr lmrVar4 = (lmr) it3.next();
                this.k.e("zslRingBuffer#filter");
                boolean z2 = !setA.contains(lmrVar4.b());
                if (hevVar.a(lmrVar4)) {
                    oohVarE3.g(lmrVar4);
                    if (z2) {
                        dze dzeVar = this.i;
                        lmw lmwVarB3 = lmrVar4.b();
                        lmwVarB3.getClass();
                        z |= !dzeVar.b(lmwVarB3.b);
                    } else {
                        lmrVar4.b().getClass();
                    }
                } else {
                    lmrVar4.close();
                }
                this.k.f();
            }
            oomVarF3 = oohVarE3.f();
            if (!z) {
                int i2 = ((orr) oomVarF3).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((lmr) oomVarF3.get(i3)).close();
                }
                oomVarF3 = oom.l();
            }
        }
        this.k.f();
        return oomVarF3;
    }

    @Override // defpackage.hen
    public final oom h(List list) {
        this.k.e("zslRingBuffer#filter");
        oom oomVarG = g(list);
        this.k.g("zslRingBuffer#awaitComplete");
        int i = ((orr) oomVarG).c;
        for (int i2 = 0; i2 < i; i2++) {
            mip.bh((lmr) oomVarG.get(i2));
        }
        this.k.f();
        return oomVarG;
    }

    @Override // defpackage.hen
    public final List i() {
        return m();
    }

    @Override // defpackage.hen
    public final List j() {
        return this.c.i();
    }

    @Override // defpackage.hen
    public void k(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
    }

    @Override // defpackage.hen
    public final lqd l() {
        return this.c.q();
    }

    public final List m() {
        switch (this.l - 1) {
            case 1:
                return this.c.i();
            default:
                return this.c.j();
        }
    }
}
