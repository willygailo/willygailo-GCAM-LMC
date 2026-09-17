package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class glk implements hih {
    final /* synthetic */ pih a;
    final /* synthetic */ lic b;
    final /* synthetic */ pih c;

    public glk(pih pihVar, lic licVar, pih pihVar2) {
        this.a = pihVar;
        this.b = licVar;
        this.c = pihVar2;
    }

    @Override // defpackage.hih
    public final void a(hiy hiyVar, hiz hizVar) {
        int[] iArr = hizVar.a;
        hix hixVar = hiyVar.b;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, hixVar.c, hixVar.b, Bitmap.Config.ARGB_8888);
        int i = hiyVar.c;
        if (i == 1) {
            this.a.o(bitmapCreateBitmap);
        } else if (i == 2) {
            Matrix matrix = new Matrix();
            matrix.postRotate(this.b.e);
            this.c.o(Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true));
        }
    }

    @Override // defpackage.hih
    public final void b(hiy hiyVar, hsp hspVar) {
        throw new IllegalStateException("No URI expected for thumbnail generation");
    }

    @Override // defpackage.hih
    public final void c(hiy hiyVar) {
    }

    @Override // defpackage.hih
    public final void d(hiy hiyVar, fcy fcyVar) {
        throw new IllegalStateException("No compressed result expected for thumbnail generation");
    }
}
