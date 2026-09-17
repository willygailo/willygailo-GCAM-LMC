package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes2.dex */
public final class lrd implements lij {
    public final pih a;
    private final CaptureResult.Key b;
    private final ope c;
    private final long d;
    private final long e;
    private long f = -1;
    private long g = -1;

    public lrd(CaptureResult.Key key, ope opeVar, long j, long j2) {
        this.b = key;
        this.c = opeVar;
        this.d = j <= 0 ? 3000000000L : j;
        this.e = j2 <= 0 ? 60L : j2;
        this.a = pih.f();
    }

    @Override // defpackage.lij
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void fB(lzr lzrVar) {
        if (this.a.isDone()) {
            return;
        }
        Long l = (Long) lzrVar.d(CaptureResult.SENSOR_TIMESTAMP);
        lmw lmwVar = new lmw(l == null ? -1L : l.longValue(), lzrVar.b(), lzrVar.a());
        if (this.c.isEmpty()) {
            this.a.o(lmwVar);
            return;
        }
        if (l != null) {
            if (this.f == -1) {
                this.f = l.longValue();
            }
            if (l.longValue() - this.f > this.d) {
                this.a.o(lmwVar);
                return;
            }
        }
        if (this.g == -1) {
            this.g = lzrVar.b();
        }
        if (lzrVar.b() - this.g > this.e) {
            this.a.o(lmwVar);
            return;
        }
        if (this.c.contains(lzrVar.d(this.b))) {
            this.a.o(lmwVar);
        }
    }
}
