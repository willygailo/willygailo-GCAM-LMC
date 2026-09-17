package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ecg {
    public final lis a;
    public final ddf b;
    public final jtx c;
    public final ljf d;
    private final gkw e;
    private final dxp f;

    public ecg(ddf ddfVar, jtx jtxVar, gkw gkwVar, dxp dxpVar, lis lisVar, ljf ljfVar) {
        this.b = ddfVar;
        this.c = jtxVar;
        this.e = gkwVar;
        this.f = dxpVar;
        this.a = lisVar.a("JpegCompressSaving");
        this.d = ljfVar;
    }

    public final void a(gog gogVar, lap lapVar, int i, int i2, byte[] bArr, ojc ojcVar) {
        ExifInterface exifInterface;
        int i3 = gogVar.a.c;
        try {
            if (ojcVar.g()) {
                exifInterface = (ExifInterface) ojcVar.c();
            } else {
                ExifInterface exifInterface2 = new ExifInterface();
                exifInterface2.r(bArr);
                exifInterface = exifInterface2;
            }
            lmb lmbVarC = lmb.c(exifInterface);
            if (i3 >= 0) {
                lmg lmgVarI = exifInterface.i(ExifInterface.bh, "M");
                lmg lmgVarI2 = exifInterface.i(ExifInterface.bi, new lid(i3, 1L));
                exifInterface.y(lmgVarI);
                exifInterface.y(lmgVarI2);
            }
            byte[] bArr2 = gogVar.a.e;
            if (bArr2.length > 0) {
                exifInterface.y(exifInterface.i(ExifInterface.f, new String(bArr2)));
            }
            lig.h(i, i2);
            c(gogVar, lapVar, bArr, lmb.a(lmbVarC).e, exifInterface);
        } catch (IOException e) {
            this.a.i("Could not read exif from gcam jpeg", e);
            throw new IllegalStateException("Could not read exif from gcam jpeg", e);
        }
    }

    public final void b(ecq ecqVar, String str) {
        gog gogVar = ecqVar.k;
        edo edoVar = ecqVar.b;
        if (edoVar == null) {
            throw new IllegalStateException("Expected YUV image but it's missing");
        }
        if (this.b.k(ddl.bf)) {
            this.d.e("rotationCalculation");
            plk.E(ecqVar.d);
            ecp ecpVarC = ecqVar.c();
            ecpVarC.e(lic.CLOCKWISE_0);
            ecpVarC.a();
            this.d.f();
        }
        ExifInterface exifInterfaceA = dzy.a(edoVar.c(), edoVar.b(), ecqVar.d, ecqVar.k.b.m());
        him himVarA = hin.a(edoVar);
        himVarA.a = gogVar.a.d;
        himVarA.c = ecqVar.e;
        himVarA.c(ecqVar.f);
        himVarA.f = new Rect(0, 0, edoVar.c(), edoVar.b());
        himVarA.e = gogVar.b.k();
        himVarA.h = ((dzt) ecqVar.h).a;
        hin hinVarA = himVarA.a();
        plk.af(this.e.a(hinVarA), new ecf(this, hinVarA, exifInterfaceA, str, gogVar), pgr.INSTANCE);
    }

    public final void c(gog gogVar, lap lapVar, byte[] bArr, int i, ExifInterface exifInterface) {
        ((iik) gogVar.b.k()).k = Long.valueOf(bArr.length);
        new lmi(exifInterface).h(gogVar.a.d, exifInterface.a(ExifInterface.Z), exifInterface.a(ExifInterface.G));
        this.c.a(exifInterface);
        ikc ikcVar = new ikc(mbs.JPEG);
        ikcVar.a(exifInterface);
        ikcVar.b(lic.b(i));
        gogVar.b.r(bArr, ikcVar);
        lapVar.close();
    }
}
