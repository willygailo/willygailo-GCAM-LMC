package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
final class mzb implements myy, mvt {
    private final Window.OnFrameMetricsAvailableListener a;
    private Handler b;

    public mzb(Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        this.a = onFrameMetricsAvailableListener;
    }

    @Override // defpackage.mvt
    public void a(Activity activity, Bundle bundle) {
        Window window = activity.getWindow();
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = this.a;
        if (this.b == null) {
            HandlerThread handlerThread = new HandlerThread("Primes-Jank", 10);
            handlerThread.start();
            this.b = new Handler(handlerThread.getLooper());
        }
        window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, this.b);
    }

    @Override // defpackage.myy
    public void c() {
    }

    @Override // defpackage.myy
    public void d() {
    }
}
