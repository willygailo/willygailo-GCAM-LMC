package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
abstract class kep {
    private static volatile Handler a;
    public final kdx b;
    public final Runnable c = new keo(this);
    public volatile long d;

    public kep(kdx kdxVar) {
        this.b = kdxVar;
    }

    public abstract void a();

    public final Handler b() {
        Handler handler;
        if (a != null) {
            return a;
        }
        synchronized (kep.class) {
            if (a == null) {
                a = new ksg(this.b.a.getMainLooper());
            }
            handler = a;
        }
        return handler;
    }

    public final void c() {
        this.d = 0L;
        b().removeCallbacks(this.c);
    }

    public final void d(long j) {
        c();
        if (j >= 0) {
            this.d = System.currentTimeMillis();
            if (b().postDelayed(this.c, j)) {
                return;
            }
            this.b.d().o("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean e() {
        return this.d != 0;
    }
}
