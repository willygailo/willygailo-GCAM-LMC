package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qtz {
    static {
        qnm.o("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);
    }

    public static final qtr a(qtr qtrVar, int i) {
        if (i > 0) {
            return i == 1 ? new qtx(qtrVar) : new quh(qtrVar, i, qlo.a);
        }
        throw new IllegalArgumentException(qno.a("Expected positive concurrency level, but had ", Integer.valueOf(i)).toString());
    }
}
