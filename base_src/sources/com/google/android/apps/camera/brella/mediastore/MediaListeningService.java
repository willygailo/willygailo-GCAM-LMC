package com.google.android.apps.camera.brella.mediastore;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import defpackage.cef;
import defpackage.ceg;
import defpackage.ceh;
import defpackage.enc;
import defpackage.ojc;
import defpackage.oug;
import defpackage.ouj;
import defpackage.pho;
import defpackage.plk;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class MediaListeningService extends JobService {
    public static final /* synthetic */ int c = 0;
    private static final ouj d = ouj.h("com/google/android/apps/camera/brella/mediastore/MediaListeningService");
    public cef a;
    public ExecutorService b;

    public static boolean a(Context context) {
        JobInfo.TriggerContentUri triggerContentUri = new JobInfo.TriggerContentUri(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, 1);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            return jobScheduler.schedule(new JobInfo.Builder(371692952, new ComponentName(context, (Class<?>) MediaListeningService.class)).addTriggerContentUri(triggerContentUri).setTriggerContentUpdateDelay(60000L).setTriggerContentMaxDelay(300000L).build()) == 1;
        }
        ((oug) ((oug) d.c()).G((char) 297)).o("Cannot get scheduler for media listener service.");
        return false;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Object applicationContext = getApplicationContext();
        applicationContext.getClass();
        ((ceh) ((enc) applicationContext).c(ceh.class)).fY(this);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Uri[] triggeredContentUris = jobParameters.getTriggeredContentUris();
        if (triggeredContentUris == null || (triggeredContentUris.length) == 0) {
            a(getApplicationContext());
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : triggeredContentUris) {
            uri.getQuery();
            uri.getAuthority();
            ojc ojcVarA = this.a.a(uri);
            if (ojcVarA.g()) {
                arrayList.add((String) ojcVarA.c());
            }
        }
        plk.af(pho.q(this.a.b(arrayList)), new ceg(this, jobParameters), this.b);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
