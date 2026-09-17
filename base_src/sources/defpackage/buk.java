package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class buk {
    private static final ouj a = ouj.h("com/google/android/apps/camera/app/silentfeedback/SilentFeedback");

    public static void a(Context context, Throwable th) {
        PackageInfo packageInfo;
        String strConcat = String.valueOf(context.getPackageName()).concat(".SILENT_FEEDBACK");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intent intent = null;
        if (th.getStackTrace().length != 0) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 4);
            } catch (PackageManager.NameNotFoundException e) {
                ((oug) ((oug) ((oug) a.b()).h(e)).G('s')).o("Could not find our own package. This should never happen. Not sending crash info.");
                packageInfo = null;
            }
            String str = null;
            for (ServiceInfo serviceInfo : packageInfo.services) {
                if (serviceInfo.name.equals("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService")) {
                    str = serviceInfo.name;
                }
            }
            if (str == null) {
                ((oug) ((oug) a.b()).G('r')).o("Could not find SilentFeedbackService, not sending crash info.");
            } else {
                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(context.getApplicationContext(), str));
                intent2.setPackage(context.getApplicationContext().getPackageName());
                StringBuilder sb = new StringBuilder();
                b(th, sb, new HashSet(), null);
                StackTraceElement stackTraceElement = stackTrace[0];
                String fileName = stackTraceElement.getFileName() != null ? stackTraceElement.getFileName() : "Unknown Source";
                intent2.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.exceptionClass", th.getClass().getName());
                intent2.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.stackTrace", sb.toString());
                intent2.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingClass", stackTraceElement.getClassName());
                intent2.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingFile", fileName);
                intent2.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingLine", stackTraceElement.getLineNumber());
                intent2.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingMethod", stackTraceElement.getMethodName());
                if (strConcat != null) {
                    intent2.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.categoryTag", strConcat);
                }
                intent = intent2;
            }
        }
        if (intent != null) {
            try {
                context.startService(intent);
            } catch (IllegalStateException e2) {
                ((oug) ((oug) ((oug) a.b()).h(th)).G('v')).o("failed to start silent feedback service");
            }
        }
    }

    private static void b(Throwable th, StringBuilder sb, Set set, String str) {
        if (th == null || set.contains(th)) {
            return;
        }
        set.add(th);
        if (str != null) {
            sb.append(str);
        }
        sb.append(th.getClass().getName());
        sb.append(':');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\n\tat ");
            sb.append(stackTraceElement);
        }
        Throwable[] thArr = new Throwable[0];
        if (th.getCause() != null) {
            b(th.getCause(), sb, set, "\nCaused by: ");
        }
    }
}
