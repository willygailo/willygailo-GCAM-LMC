package defpackage;

import android.graphics.Bitmap;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.image.YuvUtils;
import com.google.googlex.gcam.imageproc.Resample;

/* JADX INFO: loaded from: classes.dex */
final class gjy implements gmt {
    private final lvp a;
    private final brg b;
    private final gmt c;
    private final hoh d;
    private final egm e;

    public gjy(lvp lvpVar, brg brgVar, gmt gmtVar, hoh hohVar, egm egmVar) {
        this.a = lvpVar;
        this.b = brgVar;
        this.c = gmtVar;
        this.e = egmVar;
        this.d = hohVar;
    }

    @Override // defpackage.gmt
    public final void a(final mad madVar, pht phtVar) {
        if (madVar.a() != 35) {
            madVar.close();
            return;
        }
        if (this.d.e(this.a.k())) {
            hoh.g(madVar, this.b.b());
        }
        final egm egmVar = this.e;
        boolean z = madVar.a() == 35;
        int iA = madVar.a();
        StringBuilder sb = new StringBuilder(48);
        sb.append("Expected image format YUV but found: ");
        sb.append(iA);
        obr.aG(z, sb.toString());
        egmVar.d.execute(new Runnable() { // from class: egl
            @Override // java.lang.Runnable
            public final void run() {
                egm egmVar2 = egmVar;
                mad madVar2 = madVar;
                Bitmap bitmap = null;
                try {
                    egk egkVar = egmVar2.b;
                    boolean z2 = madVar2.a() == 35;
                    int iA2 = madVar2.a();
                    StringBuilder sb2 = new StringBuilder(48);
                    sb2.append("Expected image format YUV but found: ");
                    sb2.append(iA2);
                    obr.aG(z2, sb2.toString());
                    egkVar.c.e("Downsample YUV");
                    YuvWriteView yuvWriteViewC = egkVar.a.c(madVar2);
                    int iC = yuvWriteViewC.c() & (-8);
                    int iB = yuvWriteViewC.b() & (-8);
                    if (iC != yuvWriteViewC.c() || iB != yuvWriteViewC.b()) {
                        GcamModuleJNI.YuvWriteView_FastCrop(yuvWriteViewC.c, yuvWriteViewC, 0, 0, iC, iB);
                    }
                    int i = iC / 4;
                    int i2 = iB / 4;
                    YuvImage yuvImage = new YuvImage(i, i2, 2);
                    long j = yuvWriteViewC.a;
                    long jE = YuvWriteView.e(yuvImage);
                    obr.aG(j != 0, "src is null");
                    obr.aG(jE != 0, "dst is null");
                    Resample.downsampleImpl(j, 2, jE);
                    egkVar.c.g("Rotate YUV");
                    int iIntValue = ((Integer) egkVar.b.a().fA()).intValue();
                    int iDegreesToImageRotation = GcamModuleJNI.DegreesToImageRotation(iIntValue);
                    switch (iDegreesToImageRotation) {
                        case 6:
                        case 8:
                            i2 = i;
                            i = i2;
                        case 1:
                        case 3:
                            YuvImage yuvImage2 = new YuvImage(i, i2, 2);
                            long j2 = yuvImage.a;
                            long jE2 = YuvWriteView.e(yuvImage2);
                            obr.aG(j2 != 0, "src is null");
                            obr.aG(jE2 != 0, "dst is null");
                            Resample.rotateImpl(j2, iDegreesToImageRotation, jE2);
                            egkVar.c.g("YUV to bitmap");
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                            pjh pjhVarA = pjh.a(bitmapCreateBitmap);
                            boolean zA = YuvUtils.a(yuvImage2, pjhVarA.a);
                            pjhVarA.close();
                            if (zA) {
                                egkVar.c.f();
                                bitmap = bitmapCreateBitmap;
                            } else {
                                egkVar.c.f();
                            }
                            if (bitmap != null) {
                                egmVar2.c.f(bitmap);
                                return;
                            } else {
                                ((oug) ((oug) egm.a.b()).G((char) 1151)).o("Could not map YUV to Bitmap.");
                                return;
                            }
                        default:
                            StringBuilder sb3 = new StringBuilder(65);
                            sb3.append("Invalid imageRotation=");
                            sb3.append(iDegreesToImageRotation);
                            sb3.append("; rotationObservable=");
                            sb3.append(iIntValue);
                            throw new IllegalStateException(sb3.toString());
                    }
                } catch (Exception e) {
                    ((oug) ((oug) ((oug) egm.a.b()).h(e)).G((char) 1152)).o("Could not map YUV to Bitmap");
                }
            }
        });
        this.c.a(madVar, phtVar);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }
}
