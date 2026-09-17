package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fpf implements maf {
    private final fpo a;
    private final fou b;

    public fpf(fpo fpoVar, fou fouVar) {
        this.a = fpoVar;
        this.b = fouVar;
    }

    @Override // defpackage.maf
    public final void a() {
        long jA = this.a.a();
        if (jA >= 0) {
            fou fouVar = this.b;
            synchronized (fouVar.e) {
                long jConvert = TimeUnit.MICROSECONDS.convert(jA, TimeUnit.NANOSECONDS);
                if (jConvert < fouVar.v) {
                    ((oug) ((oug) fou.a.b()).G(1830)).u("Out of order timestamp %d came after %d", jConvert, fouVar.v);
                }
                fouVar.v = Math.max(fouVar.v, jConvert);
                if (fouVar.w.isEmpty()) {
                    fouVar.j.b(fouVar.v - 1500000);
                }
            }
        }
    }
}
