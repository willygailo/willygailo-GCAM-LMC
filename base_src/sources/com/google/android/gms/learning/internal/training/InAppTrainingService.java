package com.google.android.gms.learning.internal.training;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import defpackage.kog;
import defpackage.krk;
import defpackage.krn;
import defpackage.krp;
import defpackage.krv;
import defpackage.krw;

/* JADX INFO: loaded from: classes.dex */
public final class InAppTrainingService extends Service {
    private static final String TAG = "brella.InAppTrngSvc";
    krv dynamiteImpl;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        krv krvVar = this.dynamiteImpl;
        if (krvVar != null) {
            try {
                return krvVar.f(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onBind", e);
                }
            }
        }
        return new krk("No IInAppTrainingService implementation found");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            krv krvVar = (krv) krp.a(this, "com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl", krw.d);
            this.dynamiteImpl = krvVar;
            try {
                krvVar.g(kog.b(this));
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException during onCreate", e);
                }
            }
        } catch (krn e2) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "LoadingException during onCreate", e2);
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        krv krvVar = this.dynamiteImpl;
        if (krvVar != null) {
            try {
                krvVar.h();
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onDestroy", e);
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        krv krvVar = this.dynamiteImpl;
        if (krvVar != null) {
            try {
                krvVar.i(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        krv krvVar = this.dynamiteImpl;
        if (krvVar != null) {
            try {
                return krvVar.e(intent, i, i2);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onStartCommand", e);
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        krv krvVar = this.dynamiteImpl;
        if (krvVar != null) {
            try {
                krvVar.j(i);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onTrimMemory", e);
                }
            }
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        krv krvVar = this.dynamiteImpl;
        if (krvVar != null) {
            try {
                return krvVar.k(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
