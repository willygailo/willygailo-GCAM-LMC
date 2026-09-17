package defpackage;

import android.hardware.camera2.CameraManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class hvx extends CameraManager.AvailabilityCallback {
    public xr a;
    private final String[] b;
    private final ScheduledExecutorService d;
    private boolean f;
    private ScheduledFuture g;
    private final Map e = new HashMap();
    private final boolean c = true;

    public hvx(String[] strArr, ScheduledExecutorService scheduledExecutorService) {
        this.b = strArr;
        this.d = scheduledExecutorService;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this) {
            this.e.put(str, true);
        }
        synchronized (this) {
            if (this.e.size() < this.b.length) {
                return;
            }
            Iterator it = this.e.values().iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    return;
                }
            }
            if (this.f) {
                this.g = this.d.schedule(new Callable() { // from class: hvw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(this.a.a.a(true));
                    }
                }, 1000L, TimeUnit.MILLISECONDS);
            } else {
                this.a.a(true);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (!this.c) {
            this.a.a(false);
            return;
        }
        this.f = true;
        ScheduledFuture scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.g = null;
        }
        synchronized (this) {
            this.e.put(str, false);
        }
    }
}
