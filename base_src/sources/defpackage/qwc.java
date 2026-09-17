package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qwc extends qwd {
    public static final qwc b;
    public static final qqf d;

    static {
        qwc qwcVar = new qwc();
        b = qwcVar;
        d = new qwe(qwcVar, qnm.r("kotlinx.coroutines.io.parallelism", qno.f(64, qvs.a), 0, 0, 12));
    }

    private qwc() {
        super(qwj.b, qwj.c, qwj.d);
    }

    @Override // defpackage.qwd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.qwd, defpackage.qqf
    public final String toString() {
        return "Dispatchers.Default";
    }
}
