package com.google.android.apps.camera.prewarm;

import android.content.Intent;
import android.service.media.CameraPrewarmService;
import com.google.android.apps.camera.prewarm.NoOpPrewarmService;
import defpackage.bux;
import defpackage.enc;
import defpackage.eoc;
import defpackage.fjs;
import defpackage.hgo;
import defpackage.lbk;
import defpackage.oug;
import defpackage.ouj;
import defpackage.qiz;

/* JADX INFO: loaded from: classes.dex */
public class NoOpPrewarmService extends CameraPrewarmService {
    public static final ouj a = ouj.h("com/google/android/apps/camera/prewarm/NoOpPrewarmService");
    public fjs b;
    public lbk c;
    public eoc d;
    public qiz e;

    @Override // android.service.media.CameraPrewarmService
    public final void onCooldown(boolean z) {
        this.c.a();
        this.b.N();
    }

    @Override // android.app.Service
    public final void onCreate() {
        ((hgo) ((enc) getApplication()).c(hgo.class)).o(this);
        super.onCreate();
        this.e.a();
    }

    @Override // android.service.media.CameraPrewarmService
    public final void onPrewarm() {
        this.c.b(new Runnable() { // from class: hgn
            @Override // java.lang.Runnable
            public final void run() {
                NoOpPrewarmService noOpPrewarmService = this.a;
                ((oug) ((oug) NoOpPrewarmService.a.b()).G((char) 2454)).o("Prewarm timed out! This should not happen.");
                noOpPrewarmService.b.F();
            }
        });
        this.b.E();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.d.a()) {
            ((bux) getApplicationContext()).b().a(2);
            return 1;
        }
        ((oug) ((oug) a.b()).G((char) 2453)).o("KeepAlive is off. Skipping.");
        return 2;
    }
}
