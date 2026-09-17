package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hel extends hej {
    public final hoh a;
    public final ljf b;
    public final ddf c;
    public final ghx d;
    private final Executor e;

    public hel(hcg hcgVar, nvb nvbVar, hoh hohVar, ghx ghxVar, Executor executor, ljf ljfVar, ddf ddfVar, byte[] bArr, byte[] bArr2) {
        super(hcgVar, nvbVar, ljfVar, null, null);
        this.d = ghxVar;
        this.a = hohVar;
        this.e = executor;
        this.b = ljfVar;
        this.c = ddfVar;
    }

    @Override // defpackage.hej
    protected final void k(final edd eddVar, final mad madVar) {
        this.e.execute(new Runnable() { // from class: hek
            @Override // java.lang.Runnable
            public final void run() {
                hel helVar = this.a;
                mad madVar2 = madVar;
                edd eddVar2 = eddVar;
                try {
                    helVar.b.e("ThumbnailProcessor#processBaseFrameImage");
                    helVar.b.e("convert");
                    Bitmap bitmapA = YuvUtilNative.a(madVar2);
                    helVar.b.g("flip");
                    int iD = brg.d(eddVar2.c.a.a, helVar.d, helVar.c);
                    int i = true != helVar.a.e(helVar.d.k()) ? iD : 0;
                    hoh hohVar = helVar.a;
                    bitmapA.getClass();
                    Bitmap bitmapA2 = hohVar.a(bitmapA, iD, helVar.d.k());
                    if (i != 0 && bitmapA2 != null) {
                        helVar.b.g("rotateBitmap");
                        Matrix matrix = new Matrix();
                        matrix.postRotate(i);
                        bitmapA2 = Bitmap.createBitmap(bitmapA2, 0, 0, bitmapA2.getWidth(), bitmapA2.getHeight(), matrix, true);
                    }
                    helVar.b.g("updateIndicator");
                    eddVar2.c.b.U(bitmapA2, 0);
                    eddVar2.c.b.W(bitmapA2);
                } finally {
                    madVar2.close();
                    helVar.b.f();
                    helVar.b.f();
                }
            }
        });
    }
}
