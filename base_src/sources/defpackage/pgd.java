package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pgd implements Runnable {
    final /* synthetic */ ood a;
    final /* synthetic */ pge b;

    public pgd(pge pgeVar, ood oodVar) {
        this.b = pgeVar;
        this.a = oodVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.i(this.a);
    }
}
