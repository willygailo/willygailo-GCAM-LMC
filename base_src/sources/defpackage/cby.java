package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class cby extends JobService {
    private static final long a = TimeUnit.DAYS.toMillis(1);
    public static final /* synthetic */ int e = 0;

    public static boolean f(Context context, Class cls) {
        JobInfo next;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            return false;
        }
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getId() != 216934020);
        JobInfo.Builder requiresCharging = new JobInfo.Builder(216934020, new ComponentName(context, (Class<?>) cls)).setPersisted(true).setRequiresCharging(true);
        long j = a;
        JobInfo jobInfoBuild = requiresCharging.setPeriodic(j).build();
        return (next != null && next.isRequireCharging() == jobInfoBuild.isRequireCharging() && next.getIntervalMillis() == j) || jobScheduler.schedule(jobInfoBuild) == 1;
    }

    public abstract pht c();

    public abstract pht d();

    protected abstract ExecutorService e();

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        plk.af(pgb.i(pho.q(c()), new pgk() { // from class: cbw
            @Override // defpackage.pgk
            public final pht a(Object obj) {
                return this.a.d();
            }
        }, e()), new cbx(this, jobParameters), e());
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
