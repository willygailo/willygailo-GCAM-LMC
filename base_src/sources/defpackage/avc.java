package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class avc implements Runnable {
    final /* synthetic */ byte[] a;
    final /* synthetic */ avd b;

    public avc(avd avdVar, byte[] bArr) {
        this.b = avdVar;
        this.a = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.a(this.a);
    }
}
