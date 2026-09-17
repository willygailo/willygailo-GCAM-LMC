package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class bcw implements bcv {
    @Override // defpackage.bcv
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.bcv
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.bcv
    public final void c() {
    }

    @Override // defpackage.bcv
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.bcv
    public final void e(int i) {
    }
}
