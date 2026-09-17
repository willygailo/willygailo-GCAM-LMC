package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kqp extends JobService {
    private static final long a = TimeUnit.DAYS.toMillis(1);

    public static boolean b(Context context, Class cls) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            return false;
        }
        JobInfo pendingJob = jobScheduler.getPendingJob(216934020);
        JobInfo.Builder requiresCharging = new JobInfo.Builder(216934020, new ComponentName(context, (Class<?>) cls)).setPersisted(true).setRequiresCharging(true);
        long j = a;
        JobInfo jobInfoBuild = requiresCharging.setPeriodic(j).build();
        if (pendingJob != null && pendingJob.isRequireCharging() == jobInfoBuild.isRequireCharging() && pendingJob.getIntervalMillis() == j) {
            return true;
        }
        try {
            return jobScheduler.schedule(jobInfoBuild) == 1;
        } catch (IllegalArgumentException e) {
            Log.e("ExampleStrDataTtlSvc", "Buggy schedule() implementation!", e);
            return false;
        }
    }

    protected abstract kqw a(Context context);

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        plk.af(a(this).b.a(new lgj(TimeUnit.DAYS.toMillis(30L), 1)), new kqo(this, jobParameters), pgr.INSTANCE);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
