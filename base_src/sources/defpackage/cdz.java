package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class cdz implements iho, fik {
    private final lar a;
    public final Context f;
    protected final Executor g;
    protected final String h;
    public final fhv i;

    public cdz(Context context, Executor executor, lar larVar, fhv fhvVar, String str) {
        this.f = context;
        this.g = executor;
        this.a = larVar;
        this.i = fhvVar;
        this.h = str.length() != 0 ? "camera/".concat(str) : new String("camera/");
    }

    public final void c() {
        JobScheduler jobScheduler = (JobScheduler) this.f.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(351853807);
            jobScheduler.cancel(10281993);
            jobScheduler.cancel(216934020);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.execute(new Runnable() { // from class: cdy
            @Override // java.lang.Runnable
            public final void run() {
                cdz cdzVar = this.a;
                cdzVar.i.e(cdzVar);
            }
        });
    }
}
