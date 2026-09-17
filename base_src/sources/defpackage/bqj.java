package defpackage;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bqj implements Runnable {
    public final /* synthetic */ bqh a;
    private final /* synthetic */ int b;

    public /* synthetic */ bqj(bqh bqhVar, int i) {
        this.b = i;
        this.a = bqhVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                this.a.fz();
                break;
            default:
                bqh bqhVar = this.a;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - bqhVar.b >= 2000) {
                    bqhVar.b = jElapsedRealtime;
                    bqhVar.a.O();
                    Intent intentA = bqhVar.f.a();
                    if (intentA != null && intentA.getAction() != null) {
                        switch (intentA.getAction()) {
                            case "android.media.action.IMAGE_CAPTURE":
                                i = 6;
                                break;
                            case "android.media.action.STILL_IMAGE_CAMERA":
                                i = 8;
                                break;
                            case "android.media.action.VIDEO_CAMERA":
                                i = 9;
                                break;
                            case "android.media.action.VIDEO_CAPTURE":
                                i = 7;
                                break;
                            case "android.media.action.STILL_IMAGE_CAMERA_SECURE":
                                i = 10;
                                break;
                            case "android.media.action.IMAGE_CAPTURE_SECURE":
                                i = 3;
                                break;
                            case "android.intent.action.MAIN":
                                i = 2;
                                break;
                            default:
                                i = 1;
                                break;
                        }
                    } else {
                        i = 1;
                    }
                    if (i == 9 || i == 8 || (intentA != null && bqe.s(intentA))) {
                        if (intentA.hasExtra("assistant_voice_interaction")) {
                            i2 = 9;
                        } else {
                            i2 = bqe.p(intentA) ? 10 : 6;
                        }
                    } else if (i == 10) {
                        Bundle extras = intentA.getExtras();
                        if (extras != null && extras.containsKey("com.android.systemui.camera_launch_source")) {
                            String string = extras.getString("com.android.systemui.camera_launch_source");
                            if ("power_double_tap".equals(string)) {
                                i2 = 2;
                            } else if ("lockscreen_affordance".equals(string)) {
                                i2 = 3;
                            } else {
                                i2 = "lift_to_launch_ml".equals(string) ? 8 : 7;
                            }
                        } else if (intentA.hasExtra("assistant_voice_interaction")) {
                            i2 = 9;
                        } else {
                            i2 = bqe.p(intentA) ? 10 : 7;
                        }
                    } else if (i != 2) {
                        i2 = i != 1 ? 6 : 1;
                    } else if (bqhVar.d.b() != 3) {
                        i2 = 4;
                    } else if (bqhVar.c) {
                        bqhVar.c = false;
                        i2 = 11;
                    } else {
                        i2 = 5;
                    }
                    jrl jrlVarD = jrl.PHOTO;
                    if (intentA != null) {
                        jrlVarD = intentA.hasExtra("launch_unknown_mode") ? jrl.UNINITIALIZED : bqe.d(intentA);
                    }
                    int iF = (jrlVarD.equals(jrl.PHOTO) && bqe.t(intentA)) ? 30 : jri.f(jrlVarD);
                    KeyguardManager keyguardManagerK = bqhVar.g.k();
                    bqhVar.a.ap(i, i2, iF, keyguardManagerK.isKeyguardLocked(), keyguardManagerK.isKeyguardSecure(), bqhVar.d.b() == 2);
                    break;
                }
                break;
        }
    }
}
