package defpackage;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class hhl {
    public final lis a;
    public boolean d;
    private final Runnable h;
    public final LinkedList c = new LinkedList();
    public boolean e = false;
    public pih f = pih.f();
    public final Object b = new Object();
    public int g = 3;

    public hhl(lir lirVar, Runnable runnable) {
        this.h = runnable;
        this.a = lirVar.a("ProcessingSvcMgr");
    }

    public final void a(hhn hhnVar) {
        synchronized (this.b) {
            if (this.c.contains(hhnVar)) {
                throw new IllegalArgumentException("Task already enqueued");
            }
            this.c.add(hhnVar);
            lis lisVar = this.a;
            String strValueOf = String.valueOf(hhnVar);
            int size = this.c.size();
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 42);
            sb.append("Task added [");
            sb.append(strValueOf);
            sb.append("]. Queue size now: ");
            sb.append(size);
            lisVar.b(sb.toString());
            if (!this.e) {
                b();
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            int i = this.g;
            if (i == 3) {
                this.a.f("Starting service (was DESTROYED)");
                this.h.run();
                this.g = 1;
            } else if (i == 2) {
                this.a.f("Scheduling service restart, is shutting down");
                this.d = true;
            }
        }
    }
}
