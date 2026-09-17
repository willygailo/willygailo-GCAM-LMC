package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class goj implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ gok b;

    public goj(gok gokVar, float f) {
        this.b = gokVar;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.b(lif.b(this.a));
    }
}
