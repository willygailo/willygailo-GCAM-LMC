package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class amj {
    public final Executor a = a(false);
    public final Executor b = a(true);
    public final ani c;
    public final int d;
    public final int e;
    public final anj f;

    public amj(amh amhVar) {
        ani aniVar = amhVar.a;
        if (aniVar == null) {
            this.c = ani.c();
        } else {
            this.c = aniVar;
        }
        this.f = new anj();
        this.d = Integer.MAX_VALUE;
        this.e = 20;
    }

    private static final Executor a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new amg(z));
    }
}
