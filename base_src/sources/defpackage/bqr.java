package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class bqr implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public bqr(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public static bqr a(qkg qkgVar) {
        return new bqr(qkgVar, 1);
    }

    public static bqr b(qkg qkgVar) {
        return new bqr(qkgVar, 18);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return new emb(((eme) this.a).get());
            case 1:
                lco lcoVarM = fcy.m(CaptureRequest.CONTROL_AF_MODE, lcv.j((lce) this.a.get(), new brr(1)));
                qmd.ae(lcoVarM);
                return lcoVarM;
            case 2:
                return new bsk((pht) this.a.get());
            case 3:
                return new btl(((emp) this.a).a());
            case 4:
                return new fwl(((jnr) this.a.get()).a);
            case 5:
                return bwk.d((ScheduledExecutorService) this.a.get());
            case 6:
                phv phvVarA = bwk.a((ScheduledExecutorService) this.a.get());
                qmd.ae(phvVarA);
                return phvVarA;
            case 7:
                return bwk.e(((bwn) this.a).a());
            case 8:
                ExecutorService executorServiceA = ((bwn) this.a).a();
                ScheduledExecutorService scheduledExecutorService = bwk.a;
                return executorServiceA;
            case 9:
                return bwk.b((lar) this.a.get());
            case 10:
                return bwk.f((Executor) this.a.get());
            case 11:
                phv phvVarC = bwk.c((ScheduledExecutorService) this.a.get());
                qmd.ae(phvVarC);
                return phvVarC;
            case 12:
                return new lbz((ljf) this.a.get());
            case 13:
                return ((bxf) this.a.get()).c;
            case 14:
                return ((bxf) this.a.get()).b;
            case 15:
                return new lar(new bxl(lar.a, (pht) this.a.get()));
            case 16:
                return ((bxf) this.a.get()).a;
            case 17:
                return new bxy(pyr.a(this.a));
            case 18:
                return new bzu((jdy) this.a.get(), byr.a(), null, null);
            case 19:
                dte dteVarH = enl.H((dqw) this.a.get());
                dteVarH.c(500L, TimeUnit.MILLISECONDS);
                dteVarH.b();
                dteVarH.a = 3;
                dteVarH.c = 4;
                return dteVarH.a();
            default:
                phw phwVarL = plk.L((ScheduledExecutorService) this.a.get());
                qmd.ae(phwVarL);
                return phwVarL;
        }
    }
}
