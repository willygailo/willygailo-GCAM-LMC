package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mvn extends ThreadLocal {
    final /* synthetic */ mvq a;

    public mvn(mvq mvqVar) {
        this.a = mvqVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        mvs mvsVar = new mvs();
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (this.a.a) {
            this.a.a.put(threadCurrentThread, mvsVar);
        }
        return mvsVar;
    }
}
