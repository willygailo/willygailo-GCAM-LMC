package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class bds {
    final ActivityManager a;
    float b;
    final egi c;

    public bds(Context context) {
        this.b = 1.0f;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.a = activityManager;
        this.c = new egi(context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.b = 0.0f;
        }
    }
}
