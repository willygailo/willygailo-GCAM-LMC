package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class jer implements phh {
    final /* synthetic */ jrl a;
    final /* synthetic */ jet b;

    public jer(jet jetVar, jrl jrlVar) {
        this.b = jetVar;
        this.a = jrlVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) jet.a.c()).G(3275)).r("Unable to launch mode for: %s", this.a);
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.b.j(this.a, true);
        }
    }
}
