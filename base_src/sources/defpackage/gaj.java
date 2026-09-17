package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
final class gaj implements gex {
    final /* synthetic */ long a;
    final /* synthetic */ gex b;
    final /* synthetic */ gal c;

    public gaj(gal galVar, long j, gex gexVar) {
        this.c = galVar;
        this.a = j;
        this.b = gexVar;
    }

    @Override // defpackage.gex
    public final void a() {
        this.c.a.a("cancelled");
        this.c.c.b(SystemClock.elapsedRealtime() - this.a, "cancelled");
        this.b.a();
    }

    @Override // defpackage.gex
    public final void b(Throwable th) {
        if (th instanceof TimeoutException) {
            this.c.a.a("timeout");
            this.c.c.b(SystemClock.elapsedRealtime() - this.a, "timeout");
        } else {
            this.c.a.a("failed");
            this.c.c.b(SystemClock.elapsedRealtime() - this.a, "failed");
        }
        this.b.b(th);
    }

    @Override // defpackage.gex
    public final void c(mad madVar) {
        this.c.a.a("success");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.c.c.b(jElapsedRealtime - this.a, "success");
        this.b.c(new gai(this, madVar, jElapsedRealtime, madVar));
    }
}
