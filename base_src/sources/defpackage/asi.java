package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class asi implements Runnable {
    final asl a;
    final pht b;

    public asi(asl aslVar, pht phtVar) {
        this.a = aslVar;
        this.b = phtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.d != this) {
            return;
        }
        if (asl.b.d(this.a, this, asl.a(this.b))) {
            asl.b(this.a);
        }
    }
}
