package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import android.view.Window;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class jjj implements jje, fik, fhy, fii, fie, fig, lie, fgq, fgv {
    private static final ouj b = ouj.h("com/google/android/apps/camera/ui/screenon/ScreenOnControllerImpl");
    private final Window c;
    private final lbi d;
    private final Runnable e;
    private final Intent f;
    private final PowerManager g;
    private final epj h;
    private final jjd i;
    private final lie j;
    private boolean k = false;
    private boolean l = true;
    private int m = 1;
    public int a = 1;

    public jjj(final lar larVar, Window window, epj epjVar, jjd jjdVar, ScheduledExecutorService scheduledExecutorService, bus busVar, Intent intent, PowerManager powerManager) {
        this.c = window;
        this.f = intent;
        this.g = powerManager;
        this.h = epjVar;
        this.i = jjdVar;
        this.d = new lbi(scheduledExecutorService, 120000L, TimeUnit.MILLISECONDS);
        this.j = busVar.a(new bur() { // from class: jjf
            @Override // defpackage.bur
            public final void a(Throwable th) {
                larVar.execute(new jjh(this.a, 1, null));
            }
        });
        this.e = new jji(larVar, new jjh(this, 0));
    }

    private final void j(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("extra_turn_screen_on", false)) {
            return;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = this.g.newWakeLock(268435466, "camera_screen_on");
        wakeLockNewWakeLock.acquire();
        wakeLockNewWakeLock.release();
    }

    private final void k() {
        if (this.l) {
            return;
        }
        i();
    }

    @Override // defpackage.fhy
    public final void F() {
        h();
        j(this.f);
        epj epjVar = this.h;
        jjg jjgVar = new jjg(this);
        synchronized (epjVar.e) {
            epjVar.c.add(jjgVar);
        }
    }

    @Override // defpackage.jje, defpackage.fgv
    public final void a() {
        if (this.m != 3) {
            h();
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        this.k = true;
        this.j.close();
    }

    @Override // defpackage.jje
    public final synchronized void e() {
        if (this.k) {
            ((oug) ((oug) b.c()).G((char) 3410)).o("session closed. will NOT mute ringtone.");
        } else {
            this.i.a();
        }
    }

    @Override // defpackage.jje
    public final synchronized void f() {
        if (this.k) {
            ((oug) ((oug) b.c()).G((char) 3411)).o("session closed. will NOT restore ringtone.");
        } else {
            this.i.d();
        }
    }

    @Override // defpackage.fie
    public final void fU() {
        this.l = true;
        this.a = 1;
        f();
        i();
        this.i.b();
    }

    @Override // defpackage.fig
    public final void fV() {
        this.l = false;
        i();
        this.i.c();
    }

    @Override // defpackage.fii
    public final void fW() {
        h();
    }

    @Override // defpackage.jje
    public final void g() {
        this.a = 3;
        k();
    }

    @Override // defpackage.jje
    public final void h() {
        this.a = 2;
        k();
    }

    public final void i() {
        lar.a();
        if (this.a == 1 && this.m != 1) {
            this.c.clearFlags(128);
        }
        if (this.a != 1 && this.m == 1) {
            this.c.addFlags(128);
        }
        this.d.b();
        if (this.a == 2) {
            this.d.execute(this.e);
        }
        this.m = this.a;
    }

    @Override // defpackage.fgq
    public final void z(Intent intent) {
        j(intent);
    }
}
