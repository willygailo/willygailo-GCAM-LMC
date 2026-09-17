package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class egb implements phh {
    final /* synthetic */ long a;
    final /* synthetic */ egd b;

    public egb(egd egdVar, long j) {
        this.b = egdVar;
        this.a = j;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) ((oug) ege.b.c()).h(th)).G(1132)).q("Portrait effect failed for shot %d", this.a);
        this.b.t = true;
        this.b.e(this.a, oih.a);
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            bool.booleanValue();
        }
    }
}
