package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class bcc implements bbj, bmk {
    public azp b;
    public boolean c;
    public boolean d;
    public bcl e;
    public boolean f;
    bcg g;
    public boolean h;
    bce i;
    public volatile boolean j;
    int k;
    public final bby l;
    public final bby m;
    private final fc o;
    private final bec p;
    private final bec q;
    private final bec r;
    private boolean t;
    private bbm u;
    final bcb a = new bcb(new ArrayList(2));
    public final fuo n = fuo.d();
    private final AtomicInteger s = new AtomicInteger();

    public bcc(bec becVar, bec becVar2, bec becVar3, bby bbyVar, bby bbyVar2, fc fcVar) {
        this.p = becVar;
        this.q = becVar2;
        this.r = becVar3;
        this.m = bbyVar;
        this.l = bbyVar2;
        this.o = fcVar;
    }

    private final bec j() {
        return this.t ? this.r : this.q;
    }

    private final boolean k() {
        return this.h || this.f || this.j;
    }

    @Override // defpackage.bbj
    public final void a(bbm bbmVar) {
        j().execute(bbmVar);
    }

    public final synchronized void b(bky bkyVar, Executor executor) {
        this.n.c();
        this.a.a.add(new bca(bkyVar, executor));
        if (this.f) {
            d(1);
            executor.execute(new bbz(this, bkyVar, 0));
        } else if (!this.h) {
            aae.t(!this.j, "Cannot add callbacks to a cancelled EngineJob");
        } else {
            d(1);
            executor.execute(new bbz(this, bkyVar, 1));
        }
    }

    final void c() {
        bce bceVar;
        synchronized (this) {
            this.n.c();
            aae.t(k(), "Not yet complete!");
            int iDecrementAndGet = this.s.decrementAndGet();
            aae.t(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                bceVar = this.i;
                e();
            } else {
                bceVar = null;
            }
        }
        if (bceVar != null) {
            bceVar.f();
        }
    }

    final synchronized void d(int i) {
        bce bceVar;
        aae.t(k(), "Not yet complete!");
        if (this.s.getAndAdd(i) == 0 && (bceVar = this.i) != null) {
            bceVar.d();
        }
    }

    public final synchronized void e() {
        if (this.b == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.b = null;
        this.i = null;
        this.e = null;
        this.h = false;
        this.j = false;
        this.f = false;
        bbm bbmVar = this.u;
        if (bbmVar.c.d()) {
            bbmVar.a();
        }
        this.u = null;
        this.g = null;
        this.k = 0;
        this.o.b(this);
    }

    @Override // defpackage.bmk
    public final fuo f() {
        return this.n;
    }

    public final synchronized void g(bky bkyVar) {
        this.n.c();
        this.a.a.remove(bcb.b(bkyVar));
        if (this.a.e()) {
            if (!k()) {
                this.j = true;
                bbm bbmVar = this.u;
                bbmVar.p = true;
                bbh bbhVar = bbmVar.o;
                if (bbhVar != null) {
                    bbhVar.a();
                }
                this.m.a(this, this.b);
            }
            if ((this.f || this.h) && this.s.get() == 0) {
                e();
            }
        }
    }

    public final synchronized void h(bbm bbmVar) {
        this.u = bbmVar;
        int iC = bbmVar.c(1);
        ((iC == 2 || iC == 3) ? this.p : j()).execute(bbmVar);
    }

    public final synchronized void i(azp azpVar, boolean z, boolean z2, boolean z3) {
        this.b = azpVar;
        this.c = z;
        this.t = z2;
        this.d = z3;
    }
}
