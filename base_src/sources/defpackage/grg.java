package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class grg implements lmu, lie {
    public final Object a = new Object();
    public boolean b;
    final /* synthetic */ gri c;
    private final ojz d;
    private long e;

    public grg(gri griVar, ojz ojzVar) {
        this.c = griVar;
        this.d = ojzVar;
    }

    @Override // defpackage.lmu
    public final void a(lrr lrrVar) {
        final lmw lmwVarB = lrrVar.b();
        if (lmwVarB == null) {
            return;
        }
        long j = lmwVarB.c;
        if (j < this.e + ((long) ((Integer) this.d.a()).intValue())) {
            return;
        }
        this.e = j;
        mip.bj(lrrVar, new lnn() { // from class: gre
            @Override // defpackage.lnn
            public final void a(final lmr lmrVar) {
                final grg grgVar = this.a;
                grgVar.c.g.execute(new Runnable() { // from class: grf
                    @Override // java.lang.Runnable
                    public final void run() {
                        mad madVarK;
                        grg grgVar2 = grgVar;
                        lmr lmrVar2 = lmrVar;
                        synchronized (grgVar2.a) {
                            if (grgVar2.b) {
                                gri griVar = grgVar2.c;
                                lzv lzvVarC = lmrVar2.c();
                                if (lzvVarC != null && griVar.h.a(lmrVar2)) {
                                    griVar.i.e("extractImage");
                                    hcf hcfVarA = griVar.f.a(lmrVar2);
                                    mad madVarE = hcfVarA.e();
                                    griVar.i.f();
                                    if (madVarE != null) {
                                        synchronized (griVar.c) {
                                            ouj.b.H(TimeUnit.MILLISECONDS);
                                            hcfVarA.a();
                                            griVar.i.e("fork");
                                            lwk lwkVar = new lwk(madVarE);
                                            mad madVarK2 = lwkVar.k();
                                            if (madVarK2 != null) {
                                                griVar.i.g("viewfinderFrameToFlashDecision");
                                                griVar.e.fB(new gjs(madVarK2, plk.V(lzvVarC)));
                                            }
                                            griVar.i.g("process");
                                            gjs gjsVar = new gjs(new lwl(lwkVar), plk.V(lzvVarC));
                                            grb grbVar = griVar.m;
                                            synchronized (grbVar.d) {
                                                if (grbVar.g) {
                                                    gjsVar.close();
                                                } else if (gjsVar.m()) {
                                                    lwk lwkVar2 = grbVar.e;
                                                    if (lwkVar2 != null) {
                                                        lwkVar2.l();
                                                    }
                                                    lwk lwkVar3 = new lwk(gjsVar);
                                                    grbVar.f = lzvVarC;
                                                    if (((Boolean) grbVar.c.a()).booleanValue() && (madVarK = lwkVar3.k()) != null) {
                                                        grbVar.b.r(grbVar.b.a(lzvVarC), madVarK, lzvVarC);
                                                    }
                                                    grbVar.e = lwkVar3;
                                                } else {
                                                    ((oug) ((oug) grb.a.c()).G(2095)).o("No Image Data! Ignoring the metering frames.");
                                                    gjsVar.close();
                                                }
                                            }
                                            griVar.i.f();
                                        }
                                    }
                                }
                            }
                        }
                        lmrVar2.close();
                    }
                });
            }
        });
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c.c) {
            this.c.m.c();
        }
    }
}
