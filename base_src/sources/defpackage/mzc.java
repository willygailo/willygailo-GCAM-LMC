package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
final class mzc implements mvw, mvv, myy {
    private final Window.OnFrameMetricsAvailableListener a;
    private Activity b;
    private boolean c;
    private Handler d;

    public mzc(Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        this.a = onFrameMetricsAvailableListener;
    }

    private final void e() {
        Activity activity = this.b;
        if (activity != null) {
            Window window = activity.getWindow();
            Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = this.a;
            if (this.d == null) {
                HandlerThread handlerThread = new HandlerThread("Primes-Jank", 10);
                handlerThread.start();
                this.d = new Handler(handlerThread.getLooper());
            }
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, this.d);
        }
    }

    private final void f() {
        Activity activity = this.b;
        if (activity != null) {
            try {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this.a);
            } catch (RuntimeException e) {
            }
        }
    }

    @Override // defpackage.mvw
    public void a(Activity activity) {
        synchronized (this) {
            this.b = activity;
            if (this.c) {
                e();
            }
        }
    }

    @Override // defpackage.mvv
    public void b(Activity activity) {
        synchronized (this) {
            if (this.c) {
                f();
            }
            this.b = null;
        }
    }

    @Override // defpackage.myy
    public void c() {
        synchronized (this) {
            this.c = true;
            if (this.b != null) {
                e();
            }
        }
    }

    @Override // defpackage.myy
    public void d() {
        synchronized (this) {
            this.c = false;
            f();
        }
    }
}
