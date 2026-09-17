package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import defpackage.ank;
import defpackage.ann;
import defpackage.aof;
import defpackage.gg;
import defpackage.kus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements ank {
    private static final String a = kus.g("SystemJobService");
    private aof b;
    private final Map c = new HashMap();

    private static String b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override // defpackage.ank
    public final void a(String str, boolean z) {
        JobParameters jobParameters;
        kus kusVarL = kus.l();
        String.format("%s executed on JobScheduler", str);
        kusVarL.h(new Throwable[0]);
        synchronized (this.c) {
            jobParameters = (JobParameters) this.c.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            aof aofVarE = aof.e(getApplicationContext());
            this.b = aofVarE;
            aofVarE.f.b(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            kus.l();
            kus.k(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        aof aofVar = this.b;
        if (aofVar != null) {
            aofVar.f.c(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.b == null) {
            kus.l().h(new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strB = b(jobParameters);
        if (TextUtils.isEmpty(strB)) {
            kus.l();
            kus.i(a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.c) {
            if (this.c.containsKey(strB)) {
                kus kusVarL = kus.l();
                String.format("Job is already being executed by SystemJobService: %s", strB);
                kusVarL.h(new Throwable[0]);
                return false;
            }
            kus kusVarL2 = kus.l();
            String.format("onStartJob for %s", strB);
            kusVarL2.h(new Throwable[0]);
            this.c.put(strB, jobParameters);
            gg ggVar = new gg(null);
            if (jobParameters.getTriggeredContentUris() != null) {
                Arrays.asList(jobParameters.getTriggeredContentUris());
            }
            if (jobParameters.getTriggeredContentAuthorities() != null) {
                Arrays.asList(jobParameters.getTriggeredContentAuthorities());
            }
            jobParameters.getNetwork();
            this.b.j(strB, ggVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        if (this.b == null) {
            kus.l().h(new Throwable[0]);
            return true;
        }
        String strB = b(jobParameters);
        if (TextUtils.isEmpty(strB)) {
            kus.l();
            kus.i(a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        kus kusVarL = kus.l();
        String.format("onStopJob for %s", strB);
        kusVarL.h(new Throwable[0]);
        synchronized (this.c) {
            this.c.remove(strB);
        }
        this.b.i(strB);
        ann annVar = this.b.f;
        synchronized (annVar.f) {
            zContains = annVar.e.contains(strB);
        }
        return !zContains;
    }
}
