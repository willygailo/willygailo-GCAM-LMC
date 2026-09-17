package defpackage;

import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
abstract class bcu {
    private final Queue a = bmf.h(20);

    public abstract bdf a();

    final bdf b() {
        bdf bdfVar = (bdf) this.a.poll();
        return bdfVar == null ? a() : bdfVar;
    }

    public final void c(bdf bdfVar) {
        if (this.a.size() < 20) {
            this.a.offer(bdfVar);
        }
    }
}
