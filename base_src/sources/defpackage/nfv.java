package defpackage;

import android.os.Process;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class nfv implements ngf {
    private static boolean b;
    public final ojz a;
    private final ojz c;
    private final int d;

    public nfv(ojz ojzVar) {
        fob fobVar = fob.k;
        this.c = ojzVar;
        this.d = Math.max(5, 10);
        this.a = fobVar;
    }

    @Override // defpackage.ngf
    public final void a() {
        synchronized (nfv.class) {
            if (!b) {
                Runnable runnable = new Runnable() { // from class: nft
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (((Boolean) this.a.a.a()).booleanValue()) {
                            Process.killProcess(Process.myPid());
                            System.exit(0);
                        }
                    }
                };
                long j = this.d;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                phw phwVar = (phw) this.c.a();
                naq.d(phwVar.schedule(new nfu(runnable, phwVar, j, timeUnit), j, timeUnit));
                b = true;
            }
        }
    }
}
