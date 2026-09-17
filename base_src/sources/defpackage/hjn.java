package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final class hjn {
    private hjx a;
    private hjs b;
    private long d = 0;
    private final Handler c = mip.bV(Looper.getMainLooper());

    public final void a() {
        hjx hjxVar = this.a;
        obr.ao(hjxVar);
        hjxVar.b();
        f();
        g();
    }

    public final void b() {
        hjx hjxVar = this.a;
        obr.ao(hjxVar);
        hjxVar.a();
        f();
        g();
    }

    public final void c() {
        final hjs hjsVar = this.b;
        obr.ao(hjsVar);
        if (SystemClock.uptimeMillis() - this.d > 300) {
            hjsVar.b();
        } else {
            this.c.removeCallbacks(new Runnable() { // from class: hjm
                @Override // java.lang.Runnable
                public final void run() {
                    hjsVar.b();
                }
            });
            this.c.postDelayed(new Runnable() { // from class: hjm
                @Override // java.lang.Runnable
                public final void run() {
                    hjsVar.b();
                }
            }, 300L);
        }
        f();
        g();
    }

    public final void d(ProgressOverlay progressOverlay) {
        this.b = new hjs(progressOverlay);
        hjx hjxVar = new hjx(progressOverlay, this.b);
        this.a = hjxVar;
        hjxVar.f();
    }

    public final void e() {
        this.d = SystemClock.uptimeMillis();
        hjs hjsVar = this.b;
        obr.ao(hjsVar);
        hjsVar.a();
        f();
        g();
    }

    public final void f() {
        boolean z = this.a.b;
    }

    public final void g() {
        boolean z = this.b.b;
    }
}
