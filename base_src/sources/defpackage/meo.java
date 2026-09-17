package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class meo implements Runnable {
    final /* synthetic */ kuc a;

    public meo(kuc kucVar) {
        this.a = kucVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b();
    }
}
