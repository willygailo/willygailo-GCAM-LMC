package defpackage;

import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class cqc {
    private static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/snapshot/SnapshotUtils");
    private final cpj b;
    private final fix c;
    private final jtx d;
    private final cvh e;

    public cqc(cpj cpjVar, fix fixVar, jtx jtxVar, cvh cvhVar) {
        this.b = cpjVar;
        this.c = fixVar;
        this.d = jtxVar;
        this.e = cvhVar;
    }

    public final cku a(byte[] bArr, lic licVar, lwd lwdVar) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.r(bArr);
        } catch (IOException e) {
            ((oug) ((oug) a.b()).G((char) 608)).o("fail to read EXIF from JPEG byte array.");
        }
        Integer numB = exifInterface.b(ExifInterface.ai);
        int iIntValue = numB != null ? numB.intValue() : 0;
        Integer numB2 = exifInterface.b(ExifInterface.aj);
        int iIntValue2 = numB2 != null ? numB2.intValue() : 0;
        if (exifInterface.k(ExifInterface.b) == null || exifInterface.k(ExifInterface.a) == null) {
            exifInterface.y(exifInterface.i(ExifInterface.a, Integer.valueOf(iIntValue)));
            exifInterface.y(exifInterface.i(ExifInterface.b, Integer.valueOf(iIntValue2)));
        }
        if (exifInterface.k(ExifInterface.j) == null) {
            exifInterface.y(exifInterface.i(ExifInterface.j, Short.valueOf(lmb.b(licVar).i)));
        }
        lmi lmiVar = new lmi(exifInterface);
        lmiVar.g(jCurrentTimeMillis);
        ojc ojcVarD = oih.a;
        if (((Boolean) this.b.a.c(htu.a)).booleanValue()) {
            ojcVarD = this.c.d();
            if (ojcVarD.g()) {
                lmiVar.d((Location) ojcVarD.c());
            }
        }
        lmiVar.h(lwdVar, exifInterface.a(ExifInterface.Z), exifInterface.a(ExifInterface.G));
        this.d.a(exifInterface);
        cvh cvhVar = this.e;
        hsh hshVar = cvhVar.b;
        jun junVar = cvhVar.a;
        hsg hsgVarD = hshVar.d(System.currentTimeMillis());
        hsc hscVarA = hsgVarD.a("jpg");
        try {
            long jP = mip.P(bArr, exifInterface, hscVarA.a);
            obr.aV(jP > 0, "Expected to write a positive number of bytes to %s, instead wrote %s from byteArray of size %s", hscVarA.a, Long.valueOf(jP), Integer.valueOf(bArr.length));
            lic licVarA = lmb.a(lmb.c(exifInterface));
            cku ckuVar = new cku(null);
            ckuVar.b = new File("");
            ckuVar.a = exifInterface;
            ckuVar.c = hscVarA;
            ckuVar.d = hsgVarD;
            ckuVar.e = ojcVarD;
            mbs mbsVar = mbs.JPEG;
            if (mbsVar == null) {
                throw new NullPointerException("Null mimeType");
            }
            ckuVar.f = mbsVar;
            ckuVar.g = new lig(iIntValue, iIntValue2);
            ckuVar.h = Integer.valueOf(licVarA.e);
            ckuVar.i = Long.valueOf(jCurrentTimeMillis);
            return ckuVar;
        } catch (IOException e2) {
            ((oug) ((oug) ((oug) a.b()).h(e2)).G((char) 607)).o("Failed to create file: ");
            throw e2;
        }
    }
}
