package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class lqz {
    public final lap a;
    public final lxq b;
    public final ltc c;
    public final qkg d;
    public Runnable e;
    public final mhm f;

    public lqz(ltc ltcVar, lap lapVar, mhm mhmVar, qkg qkgVar, byte[] bArr) {
        this.c = ltcVar;
        this.a = lapVar;
        this.f = mhmVar;
        this.d = qkgVar;
        lxq lxqVar = new lxq(1L);
        lapVar.c(lxqVar);
        this.b = lxqVar;
    }

    final lqx a() throws InterruptedException, llv {
        pht phtVarC = this.b.c(1L);
        try {
            lxn lxnVar = (lxn) phtVarC.get();
            if (this.a.a()) {
                lxnVar.close();
                throw new llv("Frameserver is closed.");
            }
            lap lapVar = this.a;
            lqx lqxVarA = this.f.a(lxnVar, this.e, this.c, ((lrh) this.d).get());
            lapVar.c(lqxVarA);
            return lqxVarA;
        } catch (InterruptedException e) {
            phtVarC.cancel(true);
            try {
                ((lxn) plk.ad(phtVarC)).close();
            } catch (CancellationException e2) {
            } catch (ExecutionException e3) {
            }
            throw e;
        } catch (ExecutionException e4) {
            throw new llv(e4);
        }
    }
}
