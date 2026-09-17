package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class cny implements lff, lfd {
    private static final ouj d = ouj.h("com/google/android/apps/camera/camcorder/media/metadata/TopshotMetadataEncoderImpl");
    private final lfe e;
    private final lda f;
    private final ctd g;
    private final lie h;
    private final cib i;
    private boolean k;
    private long l;
    public final AtomicLong b = new AtomicLong(-1);
    private boolean j = false;
    public boolean c = true;
    private final Object n = new Object();
    public final String a = "application/microvideo-image-meta";
    private cnx m = cnx.READY;

    public cny(lfe lfeVar, lda ldaVar, ctd ctdVar, cib cibVar) {
        this.e = lfeVar;
        this.f = ldaVar;
        this.g = ctdVar;
        this.h = ldaVar.a(new lij() { // from class: cnw
            @Override // defpackage.lij
            public final void fB(Object obj) {
                cny cnyVar = this.a;
                Long l = (Long) obj;
                if (cnyVar.c) {
                    cnyVar.c = false;
                } else {
                    cnyVar.b.compareAndSet(-1L, l.longValue());
                }
            }
        }, pgr.INSTANCE);
        this.i = cibVar;
    }

    private final long m(long j) {
        n();
        return j + this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        if (this.k) {
            return;
        }
        this.l = (SystemClock.elapsedRealtimeNanos() / 1000) - (SystemClock.uptimeMillis() * 1000);
        this.k = true;
    }

    private void o() {
        new Object[1][0] = this;
    }

    @Override // defpackage.lfd
    public final void b(long j) {
        ctd ctdVar = this.g;
        long jM = m(j);
        boolean z = true;
        if (!ctdVar.d.isEmpty() && jM < ((Long) ohh.t(ctdVar.d)).longValue()) {
            z = false;
        }
        obr.aQ(z);
        ctdVar.d.add(Long.valueOf(jM));
    }

    @Override // defpackage.lfd
    public final void c() {
        synchronized (this.n) {
            if (this.m == cnx.CLOSED) {
                return;
            }
            this.h.close();
            this.m = cnx.CLOSED;
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.lfd
    public final void d(long j) {
        ctd ctdVar = this.g;
        long jM = m(j);
        boolean z = true;
        if (!ctdVar.e.isEmpty() && jM < ((Long) ohh.t(ctdVar.e)).longValue()) {
            z = false;
        }
        obr.aQ(z);
        ctdVar.e.add(Long.valueOf(jM));
    }

    @Override // defpackage.lfd
    public final void e() {
        synchronized (this.n) {
            if (this.m != cnx.READY) {
                ((oug) ((oug) d.b()).G(579)).r("Trying to start with state %s", this.m);
            } else {
                this.e.c(this);
                this.m = cnx.STARTED;
            }
        }
    }

    @Override // defpackage.lff
    public final void f() {
    }

    @Override // defpackage.lgb
    public final void fE(lga lgaVar) {
    }

    @Override // defpackage.lff
    public final void g() {
        synchronized (this.n) {
            if (this.i.j()) {
                o();
            }
        }
    }

    @Override // defpackage.lff
    public final void h() {
    }

    @Override // defpackage.lff
    public final void i() {
        synchronized (this.n) {
            this.b.set(((Long) ((lce) this.f).d).longValue());
            this.g.a();
            this.j = false;
        }
    }

    @Override // defpackage.lff
    public final void j(long j, long j2) {
    }

    @Override // defpackage.lfd
    public final void k() {
        synchronized (this.n) {
            if (this.m != cnx.STARTED) {
                ((oug) ((oug) d.b()).G(581)).r("Trying to stop with state %s", this.m);
                return;
            }
            this.m = cnx.STOPPED;
            this.e.g(this);
            if (this.b.get() == -1) {
                ((oug) ((oug) d.b()).G(580)).o("No video frame is received yet.");
            } else {
                o();
            }
        }
    }

    @Override // defpackage.lfd
    public final void l(cmj cmjVar, long j) {
    }
}
