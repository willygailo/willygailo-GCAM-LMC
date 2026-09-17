package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class auc implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ awl b;
    final /* synthetic */ aud c;

    public auc(aud audVar, boolean z, awl awlVar) {
        this.c = audVar;
        this.a = z;
        this.b = awlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.a.a(this.a, this.b);
    }
}
