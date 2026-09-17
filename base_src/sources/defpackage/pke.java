package defpackage;

import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.creativecamera.seedark.SeeDarkNativeImpl;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class pke implements lie {
    public final pjw a;
    public final pko b;
    public final pkr c;
    public final Object d;
    public final ExecutorService e;
    public boolean f;
    public Future g;
    public Future h;
    public long i;

    public pke(lvp lvpVar, lvq lvqVar) {
        StaticMetadata staticMetadataV = pkr.v(lvpVar);
        SeeDarkNativeImpl seeDarkNativeImpl = new SeeDarkNativeImpl();
        pko pkoVar = new pko();
        pkr pkrVar = new pkr(lvpVar, lvqVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.d = new Object();
        this.f = false;
        this.i = 0L;
        this.a = seeDarkNativeImpl;
        this.b = pkoVar;
        this.c = pkrVar;
        this.e = executorServiceNewSingleThreadExecutor;
        final long jC = StaticMetadata.c(staticMetadataV);
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: pjz
            @Override // java.lang.Runnable
            public final void run() {
                pke pkeVar = this.a;
                long jCreate = pkeVar.a.create(jC, oje.c(null), oje.c(null));
                pkeVar.i = jCreate;
                obr.aR(jCreate != 0, "Failed to creative native SeeDarkSession.");
            }
        });
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            this.f = true;
            this.e.execute(new Runnable() { // from class: pjy
                @Override // java.lang.Runnable
                public final void run() {
                    pke pkeVar = this.a;
                    pkeVar.a.notifySurfaceChanged(pkeVar.i, null);
                    pkeVar.a.delete(pkeVar.i);
                    pkeVar.i = 0L;
                }
            });
            this.e.shutdown();
        }
    }
}
