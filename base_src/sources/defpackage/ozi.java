package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public final class ozi implements Closeable {
    public static final ozh a;
    final ozh b;
    public final Deque c = new ArrayDeque(4);
    public Throwable d;

    static {
        ozh ozgVar;
        try {
            ozgVar = new ozg(Throwable.class.getMethod("addSuppressed", Throwable.class));
        } catch (Throwable th) {
            ozgVar = null;
        }
        if (ozgVar == null) {
            ozgVar = ozf.a;
        }
        a = ozgVar;
    }

    public ozi(ozh ozhVar) {
        ozhVar.getClass();
        this.b = ozhVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th = this.d;
        while (!this.c.isEmpty()) {
            Closeable closeable = (Closeable) this.c.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.b.a(closeable, th, th2);
                }
            }
        }
        if (this.d != null || th == null) {
            return;
        }
        okd.c(th, IOException.class);
        throw new AssertionError(th);
    }
}
