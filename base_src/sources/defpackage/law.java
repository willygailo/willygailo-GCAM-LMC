package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class law implements Runnable {
    final /* synthetic */ lax a;
    private final Runnable b;

    public law(lax laxVar, Runnable runnable) {
        this.a = laxVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            this.a.b.execute(new kqn(th, 2, (byte[]) null));
        }
    }
}
