package defpackage;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class aro {
    static {
        kus.g("ProcessUtils");
    }

    public static boolean a(Context context) {
        String processName = Application.getProcessName();
        return !TextUtils.isEmpty(null) ? TextUtils.equals(processName, null) : TextUtils.equals(processName, context.getApplicationInfo().processName);
    }
}
