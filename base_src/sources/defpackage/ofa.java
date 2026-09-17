package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ofa implements Runnable {
    final /* synthetic */ off a;
    final /* synthetic */ ofb b;

    public ofa(ofb ofbVar, off offVar) {
        this.b = ofbVar;
        this.a = offVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        synchronized (this.b.a) {
            off offVar = this.a;
            synchronized (offVar.a) {
                exc = offVar.e;
            }
            ((oug) ((oug) ((oug) jtb.a.c()).h(exc)).G((char) 3505)).o("Failed to get app update info");
        }
    }
}
