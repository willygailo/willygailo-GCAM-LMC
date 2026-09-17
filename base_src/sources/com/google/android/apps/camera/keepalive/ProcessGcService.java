package com.google.android.apps.camera.keepalive;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.apps.camera.keepalive.ProcessGcService;
import defpackage.enc;
import defpackage.enw;
import defpackage.eoc;
import defpackage.eoi;
import defpackage.fjs;
import defpackage.mos;
import defpackage.ouj;
import defpackage.pdt;
import defpackage.poy;

/* JADX INFO: loaded from: classes.dex */
public class ProcessGcService extends JobService {
    public static final ouj a = ouj.h("com/google/android/apps/camera/keepalive/ProcessGcService");
    public fjs b;
    public enw c;
    public Handler d;
    public mos e;
    private boolean f = false;

    public final void a(int i) {
        fjs fjsVar = this.b;
        poy poyVarM = pdt.d.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pdt pdtVar = (pdt) poyVarM.b;
        pdtVar.b = i - 1;
        pdtVar.a |= 1;
        long jUptimeMillis = SystemClock.uptimeMillis() - Process.getStartUptimeMillis();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pdt pdtVar2 = (pdt) poyVarM.b;
        pdtVar2.a |= 2;
        pdtVar2.c = jUptimeMillis;
        fjsVar.G((pdt) poyVarM.j());
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        if (!this.f) {
            ((eoi) ((enc) getApplication()).c(eoi.class)).i(this);
            this.f = true;
        }
        if (jobParameters.getExtras().getLong("keepalive_sig", -1L) == this.e.a) {
            this.d.post(new Runnable() { // from class: eoh
                @Override // java.lang.Runnable
                public final void run() {
                    final ProcessGcService processGcService = this.a;
                    JobParameters jobParameters2 = jobParameters;
                    if (!processGcService.c.c()) {
                        processGcService.jobFinished(jobParameters2, false);
                        processGcService.a(2);
                        processGcService.d.postDelayed(new Runnable() { // from class: eog
                            @Override // java.lang.Runnable
                            public final void run() {
                                ProcessGcService processGcService2 = processGcService;
                                if (!processGcService2.c.c()) {
                                    System.exit(1234);
                                } else {
                                    processGcService2.a(5);
                                    eoc.b(processGcService2);
                                }
                            }
                        }, 500L);
                    } else {
                        ((oug) ((oug) ProcessGcService.a.c()).G((char) 1287)).o("Process is Alive! Rescheduling.");
                        processGcService.a(3);
                        processGcService.jobFinished(jobParameters2, true);
                        eoc.b(processGcService);
                    }
                }
            });
            return true;
        }
        a(4);
        eoc.b(this);
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
