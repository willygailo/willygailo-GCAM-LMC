package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bxo implements Executor {
    private final Executor c;
    private final List b = new ArrayList();
    private boolean a = false;

    public bxo(Executor executor) {
        this.c = executor;
    }

    final synchronized void a() {
        obr.aQ(!this.a);
        this.a = true;
    }

    final synchronized void b() {
        obr.aQ(this.a);
        this.a = false;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            this.c.execute((Runnable) it.next());
        }
        this.b.clear();
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (this.a) {
            this.b.add(runnable);
        } else {
            obr.aR(this.b.isEmpty(), "LatchExecutor: Bad pending task.");
            this.c.execute(runnable);
        }
    }
}
