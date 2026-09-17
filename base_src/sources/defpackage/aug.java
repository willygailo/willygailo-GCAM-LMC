package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class aug implements Runnable {
    final /* synthetic */ byte[] a;
    final /* synthetic */ auq b;

    public aug(auq auqVar, byte[] bArr) {
        this.b = auqVar;
        this.a = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.a(this.a);
    }
}
