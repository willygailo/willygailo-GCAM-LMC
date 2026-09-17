package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qwp {
    public static final int a = qnm.r("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12);
    public static final qvr b = new qvr("PERMIT");
    public static final qvr c = new qvr("TAKEN");
    public static final qvr d = new qvr("BROKEN");
    public static final qvr e = new qvr("CANCELLED");
    public static final int f = qnm.r("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12);

    public static final qux a(long j, qux quxVar) {
        return new qux(j, quxVar, 0);
    }
}
