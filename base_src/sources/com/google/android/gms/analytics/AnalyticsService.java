package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import defpackage.kfk;
import defpackage.kfl;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsService extends Service implements kfk {
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
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        c();
        return null;
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
}
