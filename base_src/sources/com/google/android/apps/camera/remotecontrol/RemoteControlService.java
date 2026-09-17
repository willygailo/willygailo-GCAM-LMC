package com.google.android.apps.camera.remotecontrol;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.afp;
import defpackage.ddf;
import defpackage.ddl;
import defpackage.dei;
import defpackage.enc;
import defpackage.fhi;
import defpackage.fip;
import defpackage.hlt;
import defpackage.hlv;
import defpackage.hlx;
import defpackage.hly;
import defpackage.hlz;
import defpackage.kcw;
import defpackage.obr;
import defpackage.oug;
import defpackage.ouj;

/* JADX INFO: loaded from: classes.dex */
public class RemoteControlService extends Service {
    public static final ouj a = ouj.h("com/google/android/apps/camera/remotecontrol/RemoteControlService");
    public fhi b;
    public int d;
    public ddf e;
    public dei f;
    public hlv g;
    private PackageManager i;
    private afp k;
    private int j = Integer.MIN_VALUE;
    public kcw h = null;
    public boolean c = false;
    private final ServiceConnection l = new hlx(this);
    private final hlt m = new hlt(this);

    protected final synchronized ddf a() {
        if (this.e == null) {
            Object applicationContext = getApplicationContext();
            applicationContext.getClass();
            ((hly) ((enc) applicationContext).c(hly.class)).r(this);
        }
        return this.e;
    }

    protected final synchronized dei b() {
        if (this.f == null) {
            Object applicationContext = getApplicationContext();
            applicationContext.getClass();
            ((hly) ((enc) applicationContext).c(hly.class)).r(this);
        }
        return this.f;
    }

    public final synchronized hlv c() {
        if (this.g == null) {
            Object applicationContext = getApplicationContext();
            applicationContext.getClass();
            ((hly) ((enc) applicationContext).c(hly.class)).r(this);
        }
        return this.g;
    }

    public final void d(int i, boolean z) {
        Intent intent = new Intent("com.google.android.apps.camera.remotecontrol.remotekey");
        intent.putExtra("key_value", i);
        intent.putExtra("key_down", z);
        this.k.d(intent);
    }

    public final void e(boolean z) {
        kcw kcwVar;
        if (!this.c || (kcwVar = this.h) == null) {
            return;
        }
        try {
            if (z) {
                kcwVar.A(1, kcwVar.a());
            } else {
                kcwVar.A(2, kcwVar.a());
            }
        } catch (RemoteException e) {
            ((oug) ((oug) a.b()).G((char) 2545)).o("Error when calling into Photos service");
            e.printStackTrace();
        }
    }

    public final boolean f() {
        int callingUid = Binder.getCallingUid();
        boolean z = false;
        if (!a().k(ddl.ba)) {
            ((oug) ((oug) a.b()).G((char) 2549)).o("Feature not enabled.");
            return false;
        }
        if (this.j == callingUid) {
            return true;
        }
        String[] packagesForUid = this.i.getPackagesForUid(callingUid);
        if (packagesForUid == null || packagesForUid.length == 0) {
            ((oug) ((oug) a.b()).G((char) 2547)).o("Failed to get calling package name.");
            return false;
        }
        if (b() != dei.ENG) {
            int i = hlz.a;
            if (!hlz.a(packagesForUid[0], this.i)) {
                ((oug) ((oug) a.b()).G((char) 2548)).o("Failed to verify calling package.");
                return false;
            }
        }
        int iCheckPermission = this.i.checkPermission("android.permission.CAMERA", packagesForUid[0]);
        int iCheckPermission2 = this.i.checkPermission("android.permission.RECORD_AUDIO", packagesForUid[0]);
        boolean z2 = this.i.checkPermission("android.permission.ACCESS_FINE_LOCATION", packagesForUid[0]) == 0 || this.i.checkPermission("android.permission.ACCESS_COARSE_LOCATION", packagesForUid[0]) == 0;
        if (iCheckPermission == 0 && iCheckPermission2 == 0 && z2) {
            z = true;
        }
        if (z) {
            this.j = callingUid;
        }
        return z;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (!a().k(ddl.ba)) {
            return null;
        }
        this.j = Integer.MIN_VALUE;
        return this.m;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.i = getPackageManager();
        this.b = ((fip) getApplication()).k;
        super.onCreate();
        this.k = afp.a(this);
        this.d = 0;
        hlv hlvVarC = c();
        hlvVarC.a = false;
        hlvVarC.c = Integer.MIN_VALUE;
        hlvVarC.d = Float.MIN_VALUE;
        hlvVarC.e = 0L;
        hlvVarC.f = Float.MIN_VALUE;
        hlvVarC.g = 0L;
        this.g.c(true);
        Intent intent = new Intent();
        intent.setClassName("com.google.android.apps.photos", "com.google.android.apps.photos.cameraassistant.CameraAssistantService");
        bindService(intent, this.l, 1);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ServiceConnection serviceConnection = this.l;
        obr.ao(serviceConnection);
        unbindService(serviceConnection);
        this.g.c(false);
        super.onDestroy();
    }
}
