package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class che implements chx {
    public final lnc a;
    public final cju b;
    public final bod c;
    public final gfy d;
    public final ddf e;
    public pih g;
    private final bny i;
    private final lbi j = new lbi(mip.bP("CdrSCFocus", 1), 2, TimeUnit.SECONDS);
    public final Runnable f = new chc(this, 0);
    public final Object h = new Object();

    public che(cka ckaVar, fcy fcyVar, bod bodVar, gfy gfyVar, lzh lzhVar, ddf ddfVar, lnc lncVar, ckd ckdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        cju cjuVarA = ckaVar.a();
        this.b = cjuVarA;
        this.a = lncVar;
        this.c = bodVar;
        this.d = gfyVar;
        this.e = ddfVar;
        this.i = new bny(cjuVarA.s, fcyVar, ckdVar.c.b, lzhVar, ddfVar, null, null, null, null);
    }

    private final void c() {
        try {
            this.j.execute(new chc(this, 1, null));
        } catch (RejectedExecutionException e) {
        }
    }

    @Override // defpackage.bmq
    public final bpt a(bnh bnhVar) {
        chd chdVar;
        this.j.b();
        synchronized (this.h) {
            pih pihVar = this.g;
            if (pihVar != null) {
                pihVar.cancel(true);
            }
            this.c.c(this.f);
            lmp lmpVarA = this.a.a();
            boolean z = (this.e.k(ddl.br) && ((Boolean) ((lce) this.d.a).d).booleanValue()) ? false : true;
            ((lok) lmpVarA).d = 1;
            ((lok) lmpVarA).h = this.i.b(bnhVar.a);
            if (z) {
                ((lok) lmpVarA).i = this.i.b(bnhVar.a);
            }
            this.a.k(lmpVarA.a(), aap.g());
            this.b.g.fB(false);
            pih pihVarF = pih.f();
            this.g = pihVarF;
            c();
            chdVar = new chd(this, pihVarF, bnhVar);
        }
        return chdVar;
    }

    public final void b(boolean z, boolean z2) {
        if (z) {
            this.c.c(this.f);
            this.b.g.fB(true);
        }
        if (z2) {
            this.d.a();
        }
        this.a.l(z, z2, false);
        lmp lmpVarA = this.a.a();
        if (z) {
            ((lok) lmpVarA).h = this.i.a();
        }
        if (z2) {
            ((lok) lmpVarA).i = this.i.a();
        }
        ((lok) lmpVarA).j = this.i.a();
        this.a.m(lmpVarA.a());
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.h) {
            this.j.close();
        }
    }
}
