package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class kfg {
    public static final Object a = new Object();
    public static kut b;
    static Boolean c;

    public static boolean a(Context context) {
        mip.dk(context);
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zDI = mip.dI(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        c = Boolean.valueOf(zDI);
        return zDI;
    }
}
