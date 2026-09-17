package com.google.android.gms.analytics;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import defpackage.kdx;
import defpackage.ken;
import defpackage.kfa;
import defpackage.kfk;
import defpackage.kfl;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsJobService extends JobService implements kfk {
    private kfl a;

    private final kfl c() {
        if (this.a == null) {
            this.a = new kfl(this);
        }
        return this.a;
    }

    @Override // defpackage.kfk
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.kfk
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        c().a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        c().e(intent, i2);
        return 2;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final kfl kflVarC = c();
        kdx kdxVarC = kdx.c(kflVarC.b);
        final kfa kfaVarD = kdxVarC.d();
        String string = jobParameters.getExtras().getString("action");
        ken kenVar = kdxVarC.c;
        kfaVarD.r("Local AnalyticsJobService called. action", string);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            return true;
        }
        kflVarC.c(new Runnable() { // from class: kfi
            @Override // java.lang.Runnable
            public final void run() {
                kfl kflVar = kflVarC;
                kfa kfaVar = kfaVarD;
                JobParameters jobParameters2 = jobParameters;
                kfaVar.q("AnalyticsJobService processed last dispatch request");
                ((kfk) kflVar.b).b(jobParameters2);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
