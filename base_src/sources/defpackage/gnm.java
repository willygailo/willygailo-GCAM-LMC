package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class gnm extends lap {
    private static final ouj a = ouj.h("com/google/android/apps/camera/one/lifecycle/TwoStageShutdown");
    private final qkg b;
    private final AtomicBoolean c;

    public gnm(qkg qkgVar, lbu lbuVar) {
        super(lbuVar);
        this.b = qkgVar;
        this.c = new AtomicBoolean(false);
    }

    @Override // defpackage.lap
    public final boolean a() {
        return this.c.get();
    }

    @Override // defpackage.lap, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.c.getAndSet(true)) {
            return;
        }
        Iterator it = ((pyw) this.b).get().iterator();
        Throwable th = null;
        while (it.hasNext()) {
            try {
                ((gnl) it.next()).run();
            } catch (Throwable th2) {
                th = th2;
                ((oug) ((oug) ((oug) a.b()).h(th)).G((char) 2091)).o("Error thrown while running shutdown task");
            }
        }
        super.close();
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
