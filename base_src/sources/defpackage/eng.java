package defpackage;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class eng {
    private static final ouj a = ouj.h("com/google/android/apps/camera/intentlaunch/IntentRouter");

    public static final void a(Intent intent, boolean z, Activity activity, hug hugVar) {
        if (activity.isVoiceInteractionRoot()) {
            if (z) {
                intent.putExtra("launch_unknown_mode", true);
            }
            intent.putExtra("assistant_voice_interaction", true);
        }
        if (bqe.o(intent)) {
            return;
        }
        hugVar.e(htu.h, true);
    }

    public static final ojc b(Intent intent, Activity activity, ojz ojzVar, lqv lqvVar) {
        boolean zC;
        ojc ojcVarI = ojc.i(bqe.d(intent));
        if (!intent.hasExtra("com.google.assistant.extra.CAMERA_MODE") && !intent.hasExtra("android.intent.extra.STILL_IMAGE_MODE")) {
            return ojcVarI;
        }
        if (!bqe.k(intent) && !bqe.r(intent)) {
            return oih.a;
        }
        jrl jrlVar = (jrl) ((ojj) ojcVarI).a;
        if (((oor) ojzVar.a()).containsKey(jrlVar)) {
            Boolean bool = (Boolean) ((oor) ojzVar.a()).get(jrlVar);
            obr.ao(bool);
            zC = bool.booleanValue();
        } else if (bqe.t(activity.getIntent())) {
            lvs lvsVarE = lqvVar.a.e(lwd.FRONT);
            lvsVarE.getClass();
            zC = lqvVar.a.a(lvsVarE).C();
        } else {
            zC = true;
        }
        return zC ? ojcVarI : oih.a;
    }

    public static final ojc c(ojc ojcVar, Intent intent, jcw jcwVar, qkg qkgVar, jtx jtxVar, Activity activity, fjs fjsVar, khx khxVar, ojz ojzVar, hug hugVar, lqv lqvVar) {
        e(intent);
        if (!ojcVar.g()) {
            ((oug) ((oug) a.c()).G((char) 1264)).o("the mode is unknown or unsupported");
            return oih.a;
        }
        ((oug) ((oug) a.c()).G((char) 1263)).r("launch mode: %s", ((jrl) ojcVar.c()).name());
        if (activity.isVoiceInteractionRoot()) {
            if (activity.getIntent().hasExtra("com.google.assistant.extra.CAMERA_MODE")) {
                String stringExtra = activity.getIntent().getStringExtra("com.google.assistant.extra.CAMERA_MODE");
                stringExtra.getClass();
                bqe.g(intent, "com.google.assistant.extra.CAMERA_MODE", stringExtra);
            }
        } else if (activity.getIntent().hasExtra("android.intent.extra.STILL_IMAGE_MODE")) {
            String stringExtra2 = activity.getIntent().getStringExtra("android.intent.extra.STILL_IMAGE_MODE");
            stringExtra2.getClass();
            bqe.g(intent, "android.intent.extra.STILL_IMAGE_MODE", stringExtra2);
        }
        if (activity.isVoiceInteractionRoot()) {
            f(intent, activity.getIntent().getBooleanExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY", false));
        } else {
            f(intent, true);
        }
        switch (((jrl) ojcVar.c()).ordinal()) {
            case 1:
                if (bqe.t(activity.getIntent())) {
                    i(intent, true, activity);
                } else {
                    i(intent, bqe.m(activity.getIntent()), activity);
                }
                h(intent, activity);
                g(intent, activity);
                break;
            case 2:
                i(intent, bqe.m(activity.getIntent()), activity);
                break;
            case 3:
                h(intent, activity);
                break;
            case 6:
                i(intent, bqe.m(activity.getIntent()), activity);
                h(intent, activity);
                g(intent, activity);
                break;
            case 12:
                i(intent, bqe.m(activity.getIntent()), activity);
                h(intent, activity);
                break;
        }
        if (!intent.hasExtra("launch_unknown_mode")) {
            return ojcVar;
        }
        e(intent);
        return oih.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    public static final boolean d(jrl jrlVar, jcw jcwVar, qkg qkgVar, jtx jtxVar, Activity activity, fjs fjsVar, khx khxVar) {
        boolean z;
        int i;
        if (jrlVar.equals(jrl.LENS)) {
            jcwVar.b();
            z = true;
        } else if (jrlVar.equals(jrl.TIARA) && jtx.f(activity.getBaseContext())) {
            ((jho) qkgVar).get().c();
            z = true;
        } else if (jrlVar.equals(jrl.ORNAMENT) && jtxVar.d(activity.getBaseContext())) {
            ((jho) qkgVar).get().a();
            z = true;
        } else {
            ((oug) ((oug) a.c()).G((char) 1267)).o("Attempted to launch unsupported external activity!");
            z = false;
        }
        if (z) {
            String action = activity.getIntent().getAction();
            if (action != null) {
                switch (action) {
                    case "android.media.action.STILL_IMAGE_CAMERA":
                        i = 8;
                        break;
                    case "android.media.action.STILL_IMAGE_CAMERA_SECURE":
                        i = 10;
                        break;
                    case "android.media.action.VIDEO_CAMERA":
                        i = 9;
                        break;
                    default:
                        i = 1;
                        break;
                }
            } else {
                i = 1;
            }
            int i2 = true != activity.isVoiceInteractionRoot() ? 7 : 9;
            KeyguardManager keyguardManagerK = khxVar.k();
            fjsVar.ap(i, i2, jri.f(jrlVar), keyguardManagerK.isKeyguardLocked(), keyguardManagerK.isKeyguardSecure(), true);
        }
        return z;
    }

    private static final void e(Intent intent) {
        intent.removeExtra("com.google.assistant.extra.CAMERA_MODE");
        intent.removeExtra("com.google.assistant.extra.USE_FRONT_CAMERA");
        intent.removeExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS");
        intent.removeExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY");
        intent.removeExtra("com.google.assistant.extra.CAMERA_FLASH_MODE");
        intent.removeExtra("android.intent.extra.STILL_IMAGE_MODE");
        intent.removeExtra("android.intent.extra.FRONT_CAMERA");
        intent.removeExtra("android.intent.extra.USE_FRONT_CAMERA");
        intent.removeExtra("android.intent.extra.TIMER_DURATION_SECONDS");
    }

    private static final void f(Intent intent, boolean z) {
        if (intent.hasExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY")) {
            return;
        }
        bqe.g(intent, "com.google.assistant.extra.CAMERA_OPEN_ONLY", Boolean.valueOf(z));
    }

    private static final void g(Intent intent, Activity activity) {
        if (activity.isVoiceInteractionRoot() && activity.getIntent().hasExtra("com.google.assistant.extra.CAMERA_FLASH_MODE")) {
            String stringExtra = activity.getIntent().getStringExtra("com.google.assistant.extra.CAMERA_FLASH_MODE");
            if (!bqe.j(activity.getIntent())) {
                bqe.g(intent, "launch_unknown_mode", true);
            } else {
                stringExtra.getClass();
                bqe.g(intent, "com.google.assistant.extra.CAMERA_FLASH_MODE", stringExtra);
            }
        }
    }

    private static final void h(Intent intent, Activity activity) {
        if (activity.isVoiceInteractionRoot()) {
            bqe.g(intent, "com.google.assistant.extra.TIMER_DURATION_SECONDS", Integer.valueOf(bqe.b(activity.getIntent())));
        }
    }

    private static final void i(Intent intent, boolean z, Activity activity) {
        if (activity.isVoiceInteractionRoot()) {
            bqe.g(intent, "com.google.assistant.extra.USE_FRONT_CAMERA", Boolean.valueOf(z));
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        bqe.g(intent, "android.intent.extra.FRONT_CAMERA", boolValueOf);
        bqe.g(intent, "android.intent.extra.USE_FRONT_CAMERA", boolValueOf);
    }
}
