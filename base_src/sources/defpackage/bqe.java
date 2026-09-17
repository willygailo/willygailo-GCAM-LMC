package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class bqe {
    private static final jrl a = jrl.PHOTO;

    public static float a(Intent intent) {
        return intent.getFloatExtra("override_screen_brightness", -1.0f);
    }

    public static int b(Intent intent) {
        int intExtra = intent.hasExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS") ? intent.getIntExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS", 0) : intent.getIntExtra("android.intent.extra.TIMER_DURATION_SECONDS", 0);
        if (intExtra < 3) {
            return 3;
        }
        if (intExtra > 30) {
            return 30;
        }
        return intExtra;
    }

    public static gqt c(Intent intent) {
        gqt gqtVar = gqt.OFF;
        if (intent.hasExtra("com.google.assistant.extra.CAMERA_FLASH_MODE")) {
            String stringExtra = intent.getStringExtra("com.google.assistant.extra.CAMERA_FLASH_MODE");
            if (bqf.c.containsKey(stringExtra)) {
                return (gqt) bqf.c.get(stringExtra);
            }
        }
        return gqtVar;
    }

    public static jrl d(Intent intent) {
        jrl jrlVar = a;
        if (intent == null) {
            return jrlVar;
        }
        String action = intent.getAction();
        if ("android.media.action.VIDEO_CAMERA".equals(action) || s(intent)) {
            return x(jrl.VIDEO, intent);
        }
        if ("android.media.action.VIDEO_CAPTURE".equals(action)) {
            return jrl.VIDEO_INTENT;
        }
        if ("android.media.action.PORTRAIT".equals(action)) {
            return jrl.PORTRAIT;
        }
        if ("android.media.action.NIGHTSIGHT".equals(action)) {
            return jrl.LONG_EXPOSURE;
        }
        return ("android.media.action.IMAGE_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action)) ? jrl.IMAGE_INTENT : x(jrlVar, intent);
    }

    public static ojc e(Intent intent) {
        Bundle extras = intent == null ? null : intent.getExtras();
        return extras == null ? oih.a : ojc.h((Uri) extras.getParcelable("output"));
    }

    public static void f(Intent intent) {
        intent.putExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY", true);
    }

    public static void g(Intent intent, String str, Object obj) {
        if (obj instanceof String) {
            intent.putExtra(str, (String) obj);
        } else if (obj instanceof Integer) {
            intent.putExtra(str, ((Integer) obj).intValue());
        } else {
            if (!(obj instanceof Boolean)) {
                throw new IllegalArgumentException("Not found corresponding type.");
            }
            intent.putExtra(str, ((Boolean) obj).booleanValue());
        }
    }

    public static boolean h(Context context, Uri uri) {
        return context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 2) == 0;
    }

    public static boolean i(Intent intent) {
        return intent.hasExtra("android.intent.extra.USE_FRONT_CAMERA") || intent.hasExtra("android.intent.extra.FRONT_CAMERA") || intent.hasExtra("com.google.assistant.extra.USE_FRONT_CAMERA");
    }

    public static boolean j(Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.assistant.extra.CAMERA_FLASH_MODE")) {
            return false;
        }
        return bqf.c.containsKey(intent.getStringExtra("com.google.assistant.extra.CAMERA_FLASH_MODE"));
    }

    public static boolean k(Intent intent) {
        if (intent.hasExtra("com.google.assistant.extra.CAMERA_MODE")) {
            return bqf.a.containsKey(intent.getStringExtra("com.google.assistant.extra.CAMERA_MODE"));
        }
        return false;
    }

    public static boolean l(Intent intent) {
        return "power_double_tap".equals(intent.getStringExtra("com.android.systemui.camera_launch_source"));
    }

    public static boolean m(Intent intent) {
        return intent.getBooleanExtra("android.intent.extra.USE_FRONT_CAMERA", false) || intent.getBooleanExtra("android.intent.extra.FRONT_CAMERA", false) || intent.getBooleanExtra("com.google.assistant.extra.USE_FRONT_CAMERA", false);
    }

    public static boolean n(Intent intent) {
        return "android.intent.action.MAIN".equals(intent.getAction()) && intent.getCategories() != null && intent.getCategories().contains("android.intent.category.LAUNCHER");
    }

    public static boolean o(Intent intent) {
        return intent.getBooleanExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY", false);
    }

    public static boolean p(Intent intent) {
        if (intent != null) {
            return intent.getBooleanExtra("launch_from_remote_control", false);
        }
        return false;
    }

    public static boolean q(String str) {
        return "android.media.action.STILL_IMAGE_CAMERA".equals(str) || "android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(str);
    }

    public static boolean r(Intent intent) {
        if (intent.hasExtra("android.intent.extra.STILL_IMAGE_MODE")) {
            return bqf.b.containsKey(intent.getStringExtra("android.intent.extra.STILL_IMAGE_MODE"));
        }
        return false;
    }

    public static boolean s(Intent intent) {
        return intent.getAction() != null && "android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(intent.getAction()) && intent.hasExtra("com.google.assistant.extra.OPEN_IN_VIDEO_MODE");
    }

    public static boolean t(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.assistant.extra.CAMERA_MODE")) {
            return "WIDE_ANGLE".equals(intent.getStringExtra("com.google.assistant.extra.CAMERA_MODE"));
        }
        if (intent.hasExtra("android.intent.extra.STILL_IMAGE_MODE")) {
            return "WIDE_ANGLE".equals(intent.getStringExtra("android.intent.extra.STILL_IMAGE_MODE"));
        }
        return false;
    }

    public static boolean u(emb embVar) {
        Intent intentA = embVar.a();
        if (intentA == null) {
            return false;
        }
        String action = intentA.getAction();
        return "android.media.action.VIDEO_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action);
    }

    public static boolean v(emb embVar) {
        Intent intentA = embVar.a();
        return intentA != null && q(intentA.getAction()) && (intentA.hasExtra("android.intent.extra.TIMER_DURATION_SECONDS") || intentA.hasExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS")) && !o(intentA);
    }

    public static boolean w(emb embVar) {
        String action;
        Intent intentA = embVar.a();
        if (intentA == null || (action = intentA.getAction()) == null || o(intentA)) {
            return false;
        }
        return action.equals("android.media.action.VIDEO_CAMERA") || s(intentA);
    }

    private static jrl x(jrl jrlVar, Intent intent) {
        if (intent.hasExtra("com.google.assistant.extra.CAMERA_MODE")) {
            String stringExtra = intent.getStringExtra("com.google.assistant.extra.CAMERA_MODE");
            return bqf.a.containsKey(stringExtra) ? (jrl) bqf.a.get(stringExtra) : jrlVar;
        }
        if (!intent.hasExtra("android.intent.extra.STILL_IMAGE_MODE")) {
            return jrlVar;
        }
        String stringExtra2 = intent.getStringExtra("android.intent.extra.STILL_IMAGE_MODE");
        return bqf.b.containsKey(stringExtra2) ? (jrl) bqf.b.get(stringExtra2) : jrlVar;
    }
}
