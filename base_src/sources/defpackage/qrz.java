package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qrz {
    public static final ThreadLocal a = new ThreadLocal();

    public static final qqu a() {
        ThreadLocal threadLocal = a;
        qqu qquVar = (qqu) threadLocal.get();
        if (qquVar != null) {
            return qquVar;
        }
        qpk qpkVar = new qpk(Thread.currentThread());
        threadLocal.set(qpkVar);
        return qpkVar;
    }
}
