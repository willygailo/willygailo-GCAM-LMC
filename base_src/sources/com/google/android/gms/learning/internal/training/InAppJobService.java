package com.google.android.gms.learning.internal.training;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.Log;
import defpackage.kog;
import defpackage.krn;
import defpackage.krp;
import defpackage.krq;
import defpackage.krs;
import defpackage.krw;
import defpackage.krx;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class InAppJobService extends JobService {
    static final String TAG = "brella.InAppJobSvc";
    krs dynamiteImpl;

    private boolean isIdleConstraintMet(JobParameters jobParameters) {
        return !((PowerManager) getSystemService("power")).isInteractive() || jobParameters.getExtras().getInt("waive_idle_requirement", 0) == 1;
    }

    private boolean tryLoadDynamiteImpl() {
        if (this.dynamiteImpl != null) {
            return true;
        }
        try {
            krs krsVar = (krs) krp.a(this, "com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl", krw.a);
            try {
                if (krsVar.i(kog.b(this), kog.b(getBgExecutor()))) {
                    this.dynamiteImpl = krsVar;
                    return true;
                }
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "IInAppJobService.init failed");
                }
                return false;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.init", e);
                }
                return false;
            }
        } catch (krn e2) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "LoadingException during tryLoadDynamiteImpl", e2);
            }
            return false;
        }
    }

    public ExecutorService getBgExecutor() {
        return krx.a;
    }

    @Override // android.app.Service
    public void onDestroy() {
        krs krsVar = this.dynamiteImpl;
        if (krsVar != null) {
            try {
                krsVar.f();
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onDestroy", e);
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        krs krsVar = this.dynamiteImpl;
        if (krsVar != null) {
            try {
                krsVar.g(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        krs krsVar = this.dynamiteImpl;
        if (krsVar != null) {
            try {
                return krsVar.e(intent, i, i2);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onStartCommand", e);
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.job.JobService
    public synchronized boolean onStartJob(JobParameters jobParameters) {
        if (!isIdleConstraintMet(jobParameters)) {
            krq.a(this, jobParameters);
            return false;
        }
        if (!tryLoadDynamiteImpl()) {
            krq.a(this, jobParameters);
            return false;
        }
        try {
            return this.dynamiteImpl.j(jobParameters);
        } catch (RemoteException e) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "RemoteException in IInAppJobService.onStartJob", e);
            }
            krq.a(this, jobParameters);
            return false;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        krs krsVar = this.dynamiteImpl;
        if (krsVar == null) {
            return false;
        }
        try {
            return krsVar.k(jobParameters);
        } catch (RemoteException e) {
            if (!Log.isLoggable(TAG, 5)) {
                return false;
            }
            Log.w(TAG, "RemoteException in IInAppJobService.onStopJob", e);
            return false;
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        krs krsVar = this.dynamiteImpl;
        if (krsVar != null) {
            try {
                krsVar.h(i);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onTrimMemory", e);
                }
            }
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        krs krsVar = this.dynamiteImpl;
        if (krsVar != null) {
            try {
                return krsVar.l(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
