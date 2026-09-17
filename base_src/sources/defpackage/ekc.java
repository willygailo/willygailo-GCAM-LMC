package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ekc implements Runnable {
    final /* synthetic */ oiu a;
    final /* synthetic */ eke b;

    public ekc(eke ekeVar, oiu oiuVar) {
        this.b = ekeVar;
        this.a = oiuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b.d.getPreview(2));
    }
}
