package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cft implements phh {
    final /* synthetic */ Runnable a;

    public cft(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.run();
    }
}
