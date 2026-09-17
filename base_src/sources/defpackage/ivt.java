package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class ivt {
    private static final Bitmap b = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    public final Bitmap a;

    public ivt(Bitmap bitmap) {
        this.a = bitmap;
    }

    public static ivt a() {
        return new ivt(b);
    }

    public final boolean b() {
        return this.a == null;
    }

    public final boolean c() {
        return this.a == b;
    }
}
