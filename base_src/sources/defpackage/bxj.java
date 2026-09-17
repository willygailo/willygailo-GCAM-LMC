package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class bxj {
    public final ScheduledExecutorService a;
    private final ljk b;
    private int c = 0;
    private final List d = new ArrayList();

    public bxj(ljf ljfVar, ScheduledExecutorService scheduledExecutorService) {
        ljk ljkVarB = ljfVar.b("InteractivityReadinessLatch");
        this.b = ljkVarB;
        this.a = scheduledExecutorService;
        ljkVarB.c(this.c);
    }

    public final synchronized bxo a(Executor executor) {
        bxo bxoVar;
        bxoVar = new bxo(executor);
        if (this.c > 0) {
            bxoVar.a();
        }
        this.d.add(bxoVar);
        return bxoVar;
    }

    public final synchronized lie b() {
        int i = this.c + 1;
        this.c = i;
        this.b.c(i);
        if (this.c == 1) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((bxo) it.next()).a();
            }
        }
        return new bxi(this);
    }

    public final synchronized void c() {
        int i = this.c - 1;
        this.c = i;
        this.b.c(i);
        obr.aQ(this.c >= 0);
        if (this.c == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((bxo) it.next()).b();
            }
        }
    }
}
