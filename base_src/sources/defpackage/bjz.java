package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bjz implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ bka b;

    public bjz(bka bkaVar, boolean z) {
        this.b = bkaVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bka bkaVar = this.b;
        boolean z = this.a;
        bmf.i();
        bkb bkbVar = bkaVar.a;
        boolean z2 = bkbVar.a;
        bkbVar.a = z;
        if (z2 != z) {
            bkbVar.b.a(z);
        }
    }
}
