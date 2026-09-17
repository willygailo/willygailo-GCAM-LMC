package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cgr implements phh {
    final /* synthetic */ cgs a;

    public cgr(cgs cgsVar) {
        this.a = cgsVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cmz cmzVar = (cmz) obj;
        synchronized (this.a.d) {
            this.a.c = cmzVar;
        }
    }
}
