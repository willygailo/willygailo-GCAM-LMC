package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ogm extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        myw.i();
        ogp ogpVar = new ogp();
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (ogq.a) {
            ogq.a.put(threadCurrentThread, ogpVar);
        }
        return ogpVar;
    }
}
