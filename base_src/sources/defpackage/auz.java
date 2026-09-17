package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class auz implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ ava b;

    public auz(ava avaVar, boolean z) {
        this.b = avaVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ava avaVar = this.b;
        avaVar.b.a(this.a, avaVar.c);
    }
}
