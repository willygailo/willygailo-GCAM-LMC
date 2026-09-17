package defpackage;

import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class fmk {
    public static final ouj a = ouj.h("com/google/android/apps/camera/metadata/panorama/PanoMetadata");
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;

    public fmk(int i, int i2) {
        Calendar.getInstance();
        Calendar.getInstance();
        this.b = true;
        this.c = i;
        this.d = i2;
        this.e = i;
        this.f = i2;
        this.g = true;
    }

    public fmk(boolean z, int i, int i2, int i3, int i4) {
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = false;
    }

    public static int a(ast astVar, String str) {
        if (astVar.e("http://ns.google.com/photos/1.0/panorama/", str)) {
            return astVar.b("http://ns.google.com/photos/1.0/panorama/", str).intValue();
        }
        return 0;
    }

    public static boolean b(ast astVar, String str) {
        if (astVar.e("http://ns.google.com/photos/1.0/panorama/", str)) {
            return ((Boolean) ((ati) astVar).l("http://ns.google.com/photos/1.0/panorama/", str, 1)).booleanValue();
        }
        return false;
    }

    public static boolean c(double d, double d2, double d3) {
        return Math.abs(d - d2) < d3;
    }

    public static void d(ast astVar, String str) {
        if (astVar.e("http://ns.google.com/photos/1.0/panorama/", str)) {
        }
    }
}
