package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class gcz implements gfg {
    final /* synthetic */ gdf a;
    final /* synthetic */ gdj b;

    public gcz(gdj gdjVar, gdf gdfVar) {
        this.b = gdjVar;
        this.a = gdfVar;
    }

    @Override // defpackage.gfg
    public final void a() {
        Handler handler = this.b.h;
        final gdf gdfVar = this.a;
        handler.post(new Runnable() { // from class: gcy
            @Override // java.lang.Runnable
            public final void run() {
                gcz gczVar = this.a;
                gdf gdfVar2 = gdfVar;
                synchronized (gczVar.b) {
                    lis lisVar = gczVar.b.b;
                    long jLongValue = ((Long) gdfVar2.d.j()).longValue();
                    StringBuilder sb = new StringBuilder(55);
                    sb.append("Microvideo started at <");
                    sb.append(jLongValue / 1000);
                    sb.append("> cancelled.");
                    lisVar.b(sb.toString());
                    gczVar.b.c(gdfVar2);
                    gczVar.b.r();
                }
            }
        });
    }

    @Override // defpackage.gfg
    public final void b(final long j) {
        Handler handler = this.b.h;
        final gdf gdfVar = this.a;
        handler.post(new Runnable() { // from class: gcx
            @Override // java.lang.Runnable
            public final void run() {
                gcz gczVar = this.a;
                long j2 = j;
                gdf gdfVar2 = gdfVar;
                lis lisVar = gczVar.b.b;
                StringBuilder sb = new StringBuilder(42);
                sb.append("Microvideo ended at <");
                sb.append(j2);
                sb.append(">");
                lisVar.b(sb.toString());
                synchronized (gczVar.b) {
                    gdfVar2.d = orj.f((Long) gdfVar2.d.j(), Long.valueOf(TimeUnit.NANOSECONDS.convert(j2, TimeUnit.MICROSECONDS)));
                    gczVar.b.r();
                }
            }
        });
    }
}
