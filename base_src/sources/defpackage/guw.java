package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class guw implements Runnable {
    final /* synthetic */ lic a;
    final /* synthetic */ gux b;

    public guw(gux guxVar, lic licVar) {
        this.b = guxVar;
        this.a = licVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.fB(this.a);
    }
}
