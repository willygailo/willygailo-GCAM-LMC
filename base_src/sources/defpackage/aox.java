package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aox implements ank {
    public static final String a = kus.g("SystemAlarmDispatcher");
    final Context b;
    public final asb c;
    public final ann d;
    public final aof e;
    final aoo f;
    final List g;
    Intent h;
    public aov i;
    public final aso j;
    private final Handler k;

    public aox(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.f = new aoo(applicationContext);
        this.c = new asb();
        aof aofVarE = aof.e(context);
        this.e = aofVarE;
        ann annVar = aofVarE.f;
        this.d = annVar;
        this.j = aofVarE.i;
        annVar.b(this);
        this.g = new ArrayList();
        this.h = null;
        this.k = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.ank
    public final void a(String str, boolean z) {
        d(new aou(this, aoo.d(this.b, str, z), 0));
    }

    public final void b() {
        if (this.k.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void c() {
        kus.l().h(new Throwable[0]);
        this.d.c(this);
        asb asbVar = this.c;
        if (!asbVar.a.isShutdown()) {
            asbVar.a.shutdownNow();
        }
        this.i = null;
    }

    final void d(Runnable runnable) {
        this.k.post(runnable);
    }

    public final void e() {
        b();
        PowerManager.WakeLock wakeLockA = aru.a(this.b, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.e.i.a(new aot(this));
        } finally {
            wakeLockA.release();
        }
    }

    public final void f(Intent intent, int i) {
        kus kusVarL = kus.l();
        String.format("Adding command %s (%s)", intent, Integer.valueOf(i));
        kusVarL.h(new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            kus.l();
            kus.k(a, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.g) {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.g) {
            boolean z = !this.g.isEmpty();
            this.g.add(intent);
            if (!z) {
                e();
            }
        }
    }
}
