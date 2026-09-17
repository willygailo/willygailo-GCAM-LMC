package defpackage;

import android.app.ActivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class bdt {
    public final int a;
    public final int b;
    public final int c;

    public bdt(bds bdsVar) {
        int i = true != bdsVar.a.isLowRamDevice() ? 4194304 : 2097152;
        this.c = i;
        ActivityManager activityManager = bdsVar.a;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (true != activityManager.isLowRamDevice() ? 0.4f : 0.33f));
        float f = bdsVar.c.a.widthPixels * bdsVar.c.a.heightPixels * 4;
        int iRound2 = Math.round(bdsVar.b * f);
        int iRound3 = Math.round(f + f);
        int i2 = iRound - i;
        if (iRound3 + iRound2 <= i2) {
            this.b = iRound3;
            this.a = iRound2;
        } else {
            float f2 = i2 / (bdsVar.b + 2.0f);
            this.b = Math.round(f2 + f2);
            this.a = Math.round(f2 * bdsVar.b);
        }
    }
}
