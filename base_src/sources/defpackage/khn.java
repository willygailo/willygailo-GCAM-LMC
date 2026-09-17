package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class khn {
    public static final int c;

    static {
        int i = khw.c;
        c = 214006000;
    }

    public final int e(Context context) {
        return f(context, c);
    }

    public final int f(Context context, int i) {
        int iA = khw.a(context, i);
        if (khw.c(context, iA)) {
            return 18;
        }
        return iA;
    }

    public final Intent g(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                if (context != null) {
                    mip.cq(context);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("gcore_");
                sb.append(c);
                sb.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        sb.append(koe.b(context).g(context.getPackageName(), 0).versionCode);
                        break;
                    } catch (PackageManager.NameNotFoundException e) {
                    }
                }
                return kmv.a(sb.toString());
            case 3:
                return kmv.b();
            default:
                return null;
        }
    }

    public final PendingIntent h(Context context, int i, String str) {
        Intent intentG = g(context, i, str);
        if (intentG == null) {
            return null;
        }
        return mip.cf(context, intentG, 167772160);
    }
}
