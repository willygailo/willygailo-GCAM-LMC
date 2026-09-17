package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class guu implements Runnable {
    final /* synthetic */ lic a;
    final /* synthetic */ guv b;

    public guu(guv guvVar, lic licVar) {
        this.b = guvVar;
        this.a = licVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.fB(this.a);
    }
}
