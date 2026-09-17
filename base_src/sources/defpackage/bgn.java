package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class bgn implements bcl, bch {
    private final Bitmap a;
    private final bcv b;

    public bgn(Bitmap bitmap, bcv bcvVar) {
        aae.w(bitmap, "Bitmap must not be null");
        this.a = bitmap;
        aae.w(bcvVar, "BitmapPool must not be null");
        this.b = bcvVar;
    }

    public static bgn f(Bitmap bitmap, bcv bcvVar) {
        if (bitmap == null) {
            return null;
        }
        return new bgn(bitmap, bcvVar);
    }

    @Override // defpackage.bcl
    public final int a() {
        return bmf.a(this.a);
    }

    @Override // defpackage.bcl
    public final Class b() {
        return Bitmap.class;
    }

    @Override // defpackage.bcl
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // defpackage.bch
    public final void d() {
        this.a.prepareToDraw();
    }

    @Override // defpackage.bcl
    public final void e() {
        this.b.d(this.a);
    }
}
