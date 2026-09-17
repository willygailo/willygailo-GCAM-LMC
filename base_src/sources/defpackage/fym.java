package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class fym implements Runnable {
    final /* synthetic */ fyd a;

    public fym(fyd fydVar, byte[] bArr) {
        this.a = fydVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.v();
    }
}
