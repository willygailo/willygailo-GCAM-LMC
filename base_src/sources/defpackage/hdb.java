package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class hdb implements gfu {
    private static final AtomicInteger e = new AtomicInteger(0);
    public final lap a;
    public final lis b;
    public final lbu c;
    public pht d;
    private final lnc f;
    private final hco g;
    private final Executor h;
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final bmq j;
    private final dkg k;
    private final hdi l;
    private final gmy m;

    public hdb(lap lapVar, lnc lncVar, lis lisVar, goi goiVar, lar larVar, ggo ggoVar, lco lcoVar, lco lcoVar2, lco lcoVar3, lco lcoVar4, pht phtVar, Executor executor, gmy gmyVar, lbu lbuVar, bmq bmqVar, gqs gqsVar, dkg dkgVar) {
        this.a = lapVar;
        this.f = lncVar;
        int andIncrement = e.getAndIncrement();
        StringBuilder sb = new StringBuilder(24);
        sb.append("PckOneCamera-");
        sb.append(andIncrement);
        this.b = lisVar.a(sb.toString());
        this.g = new hco(goiVar, larVar);
        this.h = executor;
        this.m = gmyVar;
        this.c = lbuVar;
        this.j = bmqVar;
        this.k = dkgVar;
        this.l = new hdi(goiVar, ggoVar.a, lcoVar, lcoVar2, lcoVar3, lcoVar4, phtVar, gqsVar);
    }

    @Override // defpackage.bmq
    public final bpt a(bnh bnhVar) {
        return this.j.a(bnhVar);
    }

    @Override // defpackage.gfu
    public final lie c(lmo lmoVar) {
        return this.k.c(lmoVar);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.i.compareAndSet(false, true)) {
            this.f.close();
            this.h.execute(new Runnable() { // from class: hda
                @Override // java.lang.Runnable
                public final void run() {
                    hdb hdbVar = this.a;
                    hdbVar.b.f("Closing one camera.");
                    lbx.a(hdbVar.c, hdbVar.a);
                    synchronized (hdbVar) {
                        pht phtVar = hdbVar.d;
                        if (phtVar != null) {
                            phtVar.cancel(true);
                        }
                    }
                    hdbVar.b.f("OneCamera closed.");
                }
            });
        }
    }

    @Override // defpackage.gfu
    public final ojc d() {
        return ojc.i(this.f);
    }

    @Override // defpackage.gfu
    public final pht e() {
        this.b.b("start");
        this.f.f();
        pht phtVarW = plk.W(this.m.a());
        synchronized (this) {
            dgg.c(this.b, phtVarW, "OneCamera started.", "OneCamera failed to start!");
            this.d = phtVarW;
        }
        return phtVarW;
    }

    @Override // defpackage.gfu
    public final pht f(gfs gfsVar, hsa hsaVar) {
        hco hcoVar = this.g;
        goi goiVar = hcoVar.a;
        lar larVar = hcoVar.b;
        return goiVar.c(new gog(gfsVar, hsaVar, new gob(gfsVar, larVar, hsaVar), new gok(hsaVar, larVar)));
    }

    @Override // defpackage.gfu
    public final boolean g() {
        return this.i.get();
    }

    @Override // defpackage.gfu
    public final hdi h() {
        return this.l;
    }

    @Override // defpackage.gfu
    public final lap i() {
        return this.a;
    }
}
