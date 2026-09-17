package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lcc implements Runnable {
    final /* synthetic */ lah a;
    final /* synthetic */ lce b;

    public lcc(lce lceVar, lah lahVar) {
        this.b = lceVar;
        this.a = lahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.fB(this.b.d);
    }
}
