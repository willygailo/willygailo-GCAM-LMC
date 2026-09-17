package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class iql {
    private static final ouj l = ouj.h("com/google/android/apps/camera/timelapse/TimelapseUsageLogging");
    public final int c;
    public final boolean d;
    public final HashMap e;
    public final HashMap f;
    public final HashMap g;
    public pef h;
    public boolean i;
    public long j;
    public long k;
    public final Object a = new Object();
    private final jtf m = new jtf();
    public final String b = "";

    public iql(iqn iqnVar, boolean z) {
        this.d = z;
        iqnVar.c.size();
        this.c = iqnVar.f;
        this.h = pef.SLOW;
        this.i = false;
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new HashMap();
        for (iqm iqmVar : iqm.values()) {
            this.e.put(iqmVar, 0);
            this.f.put(iqmVar, 0L);
            this.g.put(iqmVar, 0L);
        }
    }

    public final iqm a(pef pefVar) {
        return (iqm) jtf.a(pefVar, this.m.a);
    }

    final void b(iqm iqmVar) {
        synchronized (this.a) {
            if (!this.f.containsKey(iqmVar)) {
                throw new IllegalArgumentException("unsupported speed up ratio");
            }
            this.f.put(iqmVar, Long.valueOf(((Long) this.f.get(iqmVar)).longValue() + 1));
        }
    }

    final void c(iqm iqmVar) {
        synchronized (this.a) {
            if (!this.g.containsKey(iqmVar)) {
                throw new IllegalArgumentException("unsupported speed up ratio");
            }
            this.g.put(iqmVar, Long.valueOf(((Long) this.g.get(iqmVar)).longValue() + 1));
        }
    }

    final void d(iqm iqmVar) {
        synchronized (this.a) {
            if (!this.e.containsKey(iqmVar)) {
                throw new IllegalArgumentException("unsupported speed up ratio");
            }
            this.e.put(iqmVar, Integer.valueOf(((Integer) this.e.get(iqmVar)).intValue() + 1));
        }
    }

    final void e(long j) {
        synchronized (this.a) {
            this.j = j;
        }
    }

    final void f(iqm iqmVar) {
        synchronized (this.a) {
            try {
                this.h = (pef) jtf.a(iqmVar, this.m.b);
            } catch (IllegalArgumentException e) {
                this.h = pef.SLOW;
                ((oug) ((oug) l.c()).G(3123)).r("Unsupported speed up ratio: %s", iqmVar.name());
            }
        }
    }

    final void g(long j) {
        synchronized (this.a) {
            this.k = j;
        }
    }

    final void h() {
        synchronized (this.a) {
        }
    }

    final void i() {
        synchronized (this.a) {
        }
    }
}
