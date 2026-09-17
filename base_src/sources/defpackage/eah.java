package defpackage;

import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class eah {
    public Future c;
    private final Gcam d;
    private final ScheduledExecutorService e;
    public final Object a = new Object();
    public final List b = new ArrayList();
    private float f = 1.0f;

    public eah(Gcam gcam, ScheduledExecutorService scheduledExecutorService) {
        this.d = gcam;
        this.e = scheduledExecutorService;
    }

    public final void a() {
        synchronized (this.a) {
            Future future = this.c;
            if (future != null) {
                future.cancel(false);
            }
        }
        this.e.execute(new eag(this, 1));
    }

    public final void b() {
        this.e.execute(new eag(this, 0));
        synchronized (this.a) {
            this.c = this.e.schedule(new eag(this, 2), 2000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void c(float f) {
        synchronized (this.a) {
            if (f == this.f) {
                return;
            }
            this.f = f;
            oom oomVarJ = oom.j(this.b);
            int size = oomVarJ.size();
            for (int i = 0; i < size; i++) {
                int i2 = ((nle) oomVarJ.get(i)).a;
                Gcam gcam = this.d;
                GcamModuleJNI.Gcam_LimitShotCpuUsage(gcam.a, gcam, i2, f);
            }
        }
    }
}
