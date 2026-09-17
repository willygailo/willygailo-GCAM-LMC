package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class jcu implements phh {
    final /* synthetic */ xr a;

    public jcu(xr xrVar) {
        this.a = xrVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        this.a.a(false);
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        this.a.a(Boolean.valueOf(bool == null ? false : bool.booleanValue()));
    }
}
