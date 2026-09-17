package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class env implements fik, fii, fig, fij, fib {
    public final WeakReference a;
    public Runnable b;
    private final Handler c;
    private final long d;

    public env(Activity activity, Handler handler, long j) {
        this.a = new WeakReference(activity);
        this.c = handler;
        this.d = j;
    }

    private final void b() {
        lar.a();
        Runnable runnable = this.b;
        if (runnable == null) {
            return;
        }
        this.c.removeCallbacks(runnable);
        this.b = null;
    }

    @Override // defpackage.fij
    public final void e() {
        lar.a();
        obr.ap(this.b == null);
        if (this.d == 0) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: enu
            @Override // java.lang.Runnable
            public final void run() {
                env envVar = this.a;
                envVar.b = null;
                lar.a();
                Activity activity = (Activity) envVar.a.get();
                if (activity == null) {
                    return;
                }
                activity.finish();
            }
        };
        this.b = runnable;
        this.c.postDelayed(runnable, this.d);
    }

    @Override // defpackage.fib
    public final void fT() {
        b();
    }

    @Override // defpackage.fig
    public final void fV() {
        b();
    }

    @Override // defpackage.fii
    public final void fW() {
        b();
    }
}
