package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class abq implements Runnable {
    final /* synthetic */ fb a;
    final /* synthetic */ Object b;

    public abq(fb fbVar, Object obj) {
        this.a = fbVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.accept(this.b);
    }
}
