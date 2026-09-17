package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bwi implements Runnable {
    final /* synthetic */ bwj a;

    public bwi(bwj bwjVar) {
        this.a = bwjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.close();
    }
}
