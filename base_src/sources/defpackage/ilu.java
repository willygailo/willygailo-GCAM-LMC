package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ilu {
    public final ScheduledExecutorService a;
    public final ilx c;
    private ScheduledFuture e;
    public volatile ilv b = ilv.a;
    private final Object d = new Object();

    public ilu(ilx ilxVar, ScheduledExecutorService scheduledExecutorService) {
        this.c = ilxVar;
        this.a = scheduledExecutorService;
    }

    public final void a() {
        synchronized (this.d) {
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.e = null;
            }
        }
    }

    public final void b(final ilt iltVar) {
        synchronized (this.d) {
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.e = this.a.scheduleAtFixedRate(new Runnable() { // from class: ils
                @Override // java.lang.Runnable
                public final void run() {
                    final ilu iluVar = this.a;
                    final ilt iltVar2 = iltVar;
                    mip.ca(iluVar.c.b(iluVar.a), new lht() { // from class: ilr
                        @Override // defpackage.lht
                        public final void a(Object obj) {
                            ilu iluVar2 = iluVar;
                            ilt iltVar3 = iltVar2;
                            ilv ilvVar = (ilv) obj;
                            ilvVar.getClass();
                            iluVar2.b = ilvVar;
                            iltVar3.a(ilvVar);
                        }
                    }, iluVar.a);
                }
            }, 0L, 30000L, TimeUnit.MILLISECONDS);
        }
    }
}
