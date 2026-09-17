package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ol implements Runnable {
    final /* synthetic */ om a;

    public ol(om omVar) {
        this.a = omVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        om omVar = this.a;
        omVar.b = null;
        omVar.drawableStateChanged();
    }
}
