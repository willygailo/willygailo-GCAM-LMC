package defpackage;

import j$.util.function.Supplier;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class heq implements lmu, lie {
    public static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/temporalbinning/PckTemporalBinningShunt");
    public final ebe b;
    public final hcg c;
    public final lmv d;
    public final HashSet e = new HashSet();
    public final lbs f;
    private final Supplier g;

    public heq(ebe ebeVar, hcg hcgVar, lbs lbsVar, Supplier supplier, lmv lmvVar) {
        this.b = ebeVar;
        this.c = hcgVar;
        this.d = lmvVar;
        this.f = lbsVar;
        this.g = supplier;
    }

    @Override // defpackage.lmu
    public final void a(lrr lrrVar) {
        if (((Boolean) this.g.get()).booleanValue()) {
            mip.bj(lrrVar, new lnn() { // from class: heo
                @Override // defpackage.lnn
                public final void a(final lmr lmrVar) {
                    final heq heqVar = this.a;
                    final lie[] lieVarArr = {lmrVar};
                    new lbq(heqVar.f, new Runnable() { // from class: lbp
                        @Override // java.lang.Runnable
                        public final void run() {
                            lie[] lieVarArr2 = lieVarArr;
                            for (int i = 0; i <= 0; i++) {
                                lie lieVar = lieVarArr2[i];
                                if (lieVar != null) {
                                    lieVar.close();
                                }
                            }
                        }
                    }, pgr.INSTANCE, 0).execute(new Runnable() { // from class: hep
                        @Override // java.lang.Runnable
                        public final void run() {
                            hcf hcfVarA;
                            mad madVarE;
                            lnx lnxVarB;
                            heq heqVar2 = heqVar;
                            lmr lmrVar2 = lmrVar;
                            lmw lmwVarB = lmrVar2.b();
                            if (lmwVarB == null || (madVarE = (hcfVarA = heqVar2.c.a(lmrVar2)).e()) == null) {
                                return;
                            }
                            lzv lzvVarC = lmrVar2.c();
                            if (lzvVarC == null) {
                                madVarE.close();
                                return;
                            }
                            if (!heqVar2.b.x(lzvVarC)) {
                                madVarE.close();
                                return;
                            }
                            mad madVarD = hcfVarA.d();
                            mad madVarF = hcfVarA.f();
                            lzv lzvVarB = (madVarF == null || (lnxVarB = hcfVarA.b()) == null) ? null : hdw.b(lzvVarC, lnxVarB.c().a);
                            lap lapVar = new lap();
                            lapVar.c(madVarE);
                            if (madVarF != null) {
                                lapVar.c(madVarF);
                            }
                            if (madVarD != null) {
                                lapVar.c(madVarD);
                            }
                            try {
                                int iA = heqVar2.b.a(hdw.b(lzvVarC, hcfVarA.a().c().a));
                                heqVar2.e.add(Integer.valueOf(iA));
                                if (heqVar2.b.C(iA, lzvVarC, madVarE, madVarD, lzvVarB, madVarF)) {
                                    heqVar2.d.o(lmwVarB);
                                }
                            } catch (RuntimeException e) {
                                ((oug) ((oug) ((oug) heq.a.b()).h(e)).G((char) 2412)).o("Error binning frame");
                                lapVar.close();
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            this.b.v(((Integer) it.next()).intValue());
        }
        this.e.clear();
    }
}
