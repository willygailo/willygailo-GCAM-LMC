package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class fqb implements fuv {
    public final hsp a;
    public final fqr b;
    public orj c;
    public final boolean f;
    public boolean g;
    final /* synthetic */ fqc h;
    public fqe i;
    public fqe j;
    public fqe k;
    public boolean e = false;
    public boolean d = false;

    public fqb(fqc fqcVar, hsp hspVar, fqr fqrVar, orj orjVar, boolean z) {
        this.h = fqcVar;
        this.a = hspVar;
        this.b = fqrVar;
        this.c = orjVar;
        this.f = z;
    }

    @Override // defpackage.fuv
    public final void a(fuj fujVar) {
        synchronized (this.h.d) {
            if (this.g) {
                return;
            }
            if (this.c.n()) {
                ((oug) ((oug) fqc.a.c()).G(1876)).y("Cancelling session %s that already ended: %s", this.a, fujVar);
                return;
            }
            if (this.f) {
                ((oug) ((oug) fqc.a.c()).G(1875)).y("Cancelled a long shot for %s: %s", this.a, fujVar);
            }
            this.g = true;
            this.h.f();
        }
    }

    @Override // defpackage.fuv
    public final void b(long j, fuz fuzVar) {
        synchronized (this.h.d) {
            if (this.c.n()) {
                ((oug) ((oug) fqc.a.c()).G(1880)).y("Ending session %s twice: %s", this.a, fuzVar);
                return;
            }
            if (this.g) {
                ((oug) ((oug) fqc.a.c()).G(1879)).y("Ending already cancelled session %s: %s", this.a, fuzVar);
                return;
            }
            if (((Long) this.c.j()).longValue() > j) {
                ((oug) ((oug) fqc.a.c()).G(1878)).B("%s: Invalid range: %d to %d, with reason: %s", this.a, this.c.j(), Long.valueOf(j), fuzVar);
            }
            this.c = orj.f((Long) this.c.j(), Long.valueOf(Math.max(j, ((Long) this.c.j()).longValue())));
            this.h.f();
            this.h.e();
        }
    }
}
