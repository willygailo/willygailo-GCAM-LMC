package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kdr implements Runnable {
    final /* synthetic */ kes a;
    final /* synthetic */ kds b;

    public kdr(kds kdsVar, kes kesVar) {
        this.b = kdsVar;
        this.a = kesVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.b.a.c(this.a);
    }
}
