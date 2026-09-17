package com.google.android.apps.camera.wear.wearv2;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.PowerManager;
import defpackage.jyq;
import defpackage.kww;
import defpackage.kyw;
import defpackage.oug;
import defpackage.ouj;

/* JADX INFO: loaded from: classes.dex */
public class DataLayerListenerService extends kww {
    private static final ouj f = ouj.h("com/google/android/apps/camera/wear/wearv2/DataLayerListenerService");

    @Override // defpackage.kww, defpackage.kwk
    public final void a(kyw kywVar) {
        if (!"/start-activity".equals(kywVar.b)) {
            ((oug) ((oug) f.c()).G(3540)).r("Unsupported message path :%s", kywVar.b);
            return;
        }
        if (jyq.a) {
            return;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(268435466, "Camera:ScreenOnForWearable");
        wakeLockNewWakeLock.acquire(1000L);
        wakeLockNewWakeLock.release();
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        startActivity(new Intent((keyguardManager == null || !keyguardManager.isKeyguardLocked()) ? "android.media.action.STILL_IMAGE_CAMERA" : "android.media.action.STILL_IMAGE_CAMERA_SECURE").addFlags(335544320).putExtra("extra_turn_screen_on", true).putExtra("extra_launch_fom_wear", true).setPackage(getPackageName()));
    }
}
