package defpackage;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class loo {
    public final lpq a;
    public final lis b;
    public boolean d;
    public boolean f;
    private final Executor g;
    public lmq c = lok.b().a();
    public boolean e = false;

    public loo(lpq lpqVar, Executor executor, lis lisVar) {
        this.a = lpqVar;
        this.g = executor;
        this.b = lisVar.a("FS3aUpdater");
    }

    public final void a(lmq lmqVar, boolean z) {
        synchronized (this) {
            lrs lrsVarB = lrs.b(this.c);
            if (!lmqVar.d().equals(lok.a)) {
                lrsVarB.a = lmqVar.d();
            }
            if (!lmqVar.b().equals(lok.a)) {
                lrsVarB.b = lmqVar.b();
            }
            if (!lmqVar.a().equals(lok.a)) {
                lrsVarB.c = lmqVar.a();
            }
            if (!lmqVar.c().equals(lok.a)) {
                lrsVarB.d = lmqVar.c();
            }
            if (!lmqVar.e().equals(lok.a)) {
                lrsVarB.e = lmqVar.e();
            }
            if (!Arrays.equals(lmqVar.g(), lok.b)) {
                lrsVarB.i = lmqVar.g();
            }
            if (!Arrays.equals(lmqVar.f(), lok.b)) {
                lrsVarB.j = lmqVar.f();
            }
            if (!Arrays.equals(lmqVar.h(), lok.b)) {
                lrsVarB.k = lmqVar.h();
            }
            this.c = lrsVarB.d();
            this.e |= z;
            if (this.f) {
                this.d = true;
                return;
            }
            this.f = true;
            try {
                this.g.execute(new Runnable() { // from class: lon
                    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
                    
                        throw r1;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
                    
                        throw r1;
                     */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instruction units count: 356
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.lon.run():void");
                    }
                });
            } catch (RejectedExecutionException e) {
                this.b.b("Task to update 3A rejected by the executor.");
            }
        }
    }
}
