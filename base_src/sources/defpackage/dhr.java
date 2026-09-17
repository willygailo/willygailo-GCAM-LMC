package defpackage;

import j$.time.Instant;

/* JADX INFO: loaded from: classes.dex */
final class dhr extends dhq {
    public dhr(dhs dhsVar, long j) {
        super(dhsVar, hsq.a(null, j, "STUB", hsr.UNKNOWN), dhsVar.f.instant());
    }

    @Override // defpackage.dhq
    public final void a() {
        e("ShotStub: canceled");
    }

    @Override // defpackage.dhq
    public final void b() {
        e("ShotStub: deleted");
    }

    @Override // defpackage.dhq
    public final void c(String str) {
        f(str);
    }

    @Override // defpackage.dhq
    public final void d(Instant instant, String str) {
        f(str);
    }

    @Override // defpackage.dhq
    public final void g(Integer num) {
        f("ShotStub: makingProgress");
    }

    @Override // defpackage.dhq
    public final void h(Instant instant) {
        e("ShotStub: markStuck");
    }

    @Override // defpackage.dhq
    public final void i() {
        e("ShotStub: persisted");
    }

    @Override // defpackage.dhq
    public final void j() {
        e("ShotStub: started");
    }
}
