package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class bxs implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public bxs(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public bxs(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public bxs(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public final Executor a() {
        switch (this.c) {
            case 0:
                return ((bxj) this.b.get()).a((Executor) this.a.get());
            case 1:
                return new bxl((ScheduledExecutorService) this.a.get(), (pht) this.b.get());
            case 2:
                return new cyg(((liq) this.b).get(), (ddf) this.a.get(), new lax(mip.bM("CameraFatalErrorTracker")));
            default:
                bxy bxyVar = (bxy) this.b.get();
                bxj bxjVar = (bxj) this.a.get();
                lbc lbcVarA = lbd.a();
                lbcVarA.a = "FireflyProcMgr";
                lbcVarA.b(10);
                lbcVarA.c(1);
                lax laxVar = new lax(mip.bK(lbcVarA.a()));
                bxyVar.getClass();
                laxVar.execute(new hfh(bxyVar, 0));
                return bxjVar.a(laxVar);
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return a();
    }
}
