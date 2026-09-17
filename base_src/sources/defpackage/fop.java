package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class fop implements phh {
    final /* synthetic */ long a;
    final /* synthetic */ fou b;

    public fop(fou fouVar, long j) {
        this.b = fouVar;
        this.a = j;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) fou.a.c()).G((char) 1791)).o("Cannot get final shutter timestamp from microvideo as it failed to start!");
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final fot fotVar = (fot) obj;
        fou fouVar = this.b;
        final long jConvert = TimeUnit.MICROSECONDS.convert(this.a, TimeUnit.NANOSECONDS);
        fouVar.b.execute(new Runnable() { // from class: fod
            @Override // java.lang.Runnable
            public final void run() {
                fot fotVar2 = fotVar;
                long j = jConvert;
                if (fotVar2.h.isDone()) {
                    ((oug) ((oug) fou.a.c()).G(1806)).v("Trying to correct timestamp to %d but it was already set as %d", j, plk.ae(fotVar2.h));
                } else {
                    long j2 = fotVar2.e;
                    fotVar2.h.o(Long.valueOf(j));
                }
            }
        });
    }
}
