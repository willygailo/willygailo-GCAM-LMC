package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class cpw implements cpt {
    private static final ouj i = ouj.h("com/google/android/apps/camera/camcorder/snapshot/SnapshotTakerFrameServerImpl");
    public final cju a;
    public final cpc b;
    public final cqc c;
    public final ScheduledExecutorService d = mip.bQ("snapshot-taker");
    public int e;
    public long f;
    public pih g;
    public pht h;
    private final lam j;
    private final jhj k;
    private final cvo l;

    public cpw(cmm cmmVar, cka ckaVar, jhj jhjVar, cpc cpcVar, cvo cvoVar, cqc cqcVar) {
        this.j = cmmVar.a();
        this.k = jhjVar;
        this.a = ckaVar.a();
        this.b = cpcVar;
        this.l = cvoVar;
        this.c = cqcVar;
    }

    @Override // defpackage.cpt
    public final pht a(hsq hsqVar) {
        this.e = 0;
        pih pihVarF = pih.f();
        this.g = pihVarF;
        this.h = null;
        this.f = System.currentTimeMillis();
        c(hsqVar, null);
        return pihVarF;
    }

    @Override // defpackage.cpt
    public final pht b(lwd lwdVar, lic licVar) {
        return plk.U(new UnsupportedOperationException("Not implemented."));
    }

    public final void c(final hsq hsqVar, Throwable th) {
        pht phtVar = this.h;
        if (phtVar != null) {
            phtVar.cancel(true);
        }
        final lwd lwdVarD = this.l.d();
        int i2 = this.e;
        this.e = i2 + 1;
        if (i2 < 3) {
            this.j.execute(new Runnable() { // from class: cpu
                @Override // java.lang.Runnable
                public final void run() {
                    cpw cpwVar = this.a;
                    lwd lwdVar = lwdVarD;
                    hsq hsqVar2 = hsqVar;
                    cpwVar.h = plk.ac(cpwVar.b.c((lic) ((lce) cpwVar.a.n).d), 1000L, TimeUnit.MILLISECONDS, cpwVar.d);
                    plk.af(cpwVar.h, new cpv(cpwVar, lwdVar, hsqVar2), pgr.INSTANCE);
                }
            });
            return;
        }
        ova ovaVarB = i.b();
        th.getClass();
        ((oug) ((oug) ((oug) ovaVarB).h(th)).G((char) 600)).o("Failed to take snapshot.");
        this.g.a(th);
        this.k.a(jhi.SNAPSHOT_FAILURE);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.d.shutdown();
    }
}
