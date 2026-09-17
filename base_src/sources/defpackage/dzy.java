package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.DebugParams;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.PostviewParams;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.imageio.ExifEncode;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
public final class dzy {
    private final ddf c;
    private static final ouj b = ouj.h("com/google/android/apps/camera/hdrplus/GcamUtils");
    public static final long a = (GcamModuleJNI.DEBUG_SAVE_INPUT_METERING_get() | GcamModuleJNI.DEBUG_SAVE_INPUT_PAYLOAD_get()) | GcamModuleJNI.DEBUG_SAVE_METADATA_get();

    public dzy(ddf ddfVar) {
        this.c = ddfVar;
    }

    public static ExifInterface a(int i, int i2, ShotMetadata shotMetadata, ojc ojcVar) {
        byte[] bArrEncodeGcamExif = new ExifEncode().encodeGcamExif(i, i2, ShotMetadata.c(shotMetadata));
        int length = bArrEncodeGcamExif != null ? bArrEncodeGcamExif.length : 0;
        byte[] bArr = new byte[length + 4];
        int i3 = length + 2;
        bArr[0] = -1;
        bArr[1] = -31;
        bArr[2] = (byte) ((i3 >> 8) & 255);
        bArr[3] = (byte) (i3 & 255);
        if (length > 0) {
            System.arraycopy(bArrEncodeGcamExif, 0, bArr, 4, length);
        }
        ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.r(bArr);
        } catch (IOException e) {
            ((oug) ((oug) b.c()).G((char) 1017)).r("Unable to parse EXIF: %s", e.getMessage());
        }
        if (shotMetadata.a() == 1 || shotMetadata.a() == 0 || shotMetadata.a() == 3) {
            exifInterface.bz = 1;
        } else {
            exifInterface.bz = 2;
        }
        shotMetadata.k();
        String strJ = shotMetadata.j();
        if (ojcVar.g() && ((DebugParams) ojcVar.c()).a() != null && ((DebugParams) ojcVar.c()).a().a() != null) {
            ojc ojcVarC = mde.c(strJ);
            if (ojcVarC.g()) {
                mde.j((ast) ojcVarC.c(), ((DebugParams) ojcVar.c()).a().a());
                try {
                    ast astVar = (ast) ojcVarC.c();
                    aty atyVar = new aty();
                    asv.d(astVar);
                    atyVar.f(3, false);
                    atyVar.f(2, true);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
                    hn.e((ati) astVar, byteArrayOutputStream, atyVar);
                    try {
                        strJ = byteArrayOutputStream.toString(atyVar.b());
                    } catch (UnsupportedEncodingException e2) {
                        strJ = byteArrayOutputStream.toString();
                    }
                } catch (ass e3) {
                }
            } else {
                ((oug) ((oug) b.c()).G((char) 1015)).o("Extended XMP section not found to append slowraw directory");
            }
        }
        exifInterface.bA = strJ;
        return exifInterface;
    }

    public static PostviewParams b(lvp lvpVar, gsf gsfVar) {
        int iRound;
        int iRound2;
        PostviewParams postviewParams = new PostviewParams();
        lig ligVar = pkr.h(lvpVar).b;
        postviewParams.b(5);
        float fB = lhs.h(gsfVar.b).b();
        int i = ligVar.a;
        int i2 = ligVar.b;
        if (i > i2) {
            iRound2 = Math.round(i / 6.0f);
            iRound = Math.round((iRound2 / fB) * 1.05f);
        } else {
            int iRound3 = Math.round(i2 / 6.0f);
            int iRound4 = Math.round(iRound3 * fB * 1.05f);
            iRound = iRound3;
            iRound2 = iRound4;
        }
        lig ligVar2 = new lig((iRound2 + 1) & (-2), (iRound + 1) & (-2));
        int i3 = ligVar2.a;
        if (i3 > ligVar2.b) {
            postviewParams.d(i3);
            postviewParams.c(0);
        } else {
            postviewParams.d(0);
            postviewParams.c(ligVar2.b);
        }
        return postviewParams;
    }

    public static String d(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS");
        DesugarTimeZone.getTimeZone("UTC");
        String strValueOf = String.valueOf(simpleDateFormat.format(Long.valueOf(j)));
        return strValueOf.length() != 0 ? "XXXX_".concat(strValueOf) : new String("XXXX_");
    }

    public final String c(File file, long j, String str) throws IOException {
        if (!file.exists() || !file.isDirectory()) {
            String strValueOf = String.valueOf(file.getAbsolutePath());
            throw new RuntimeException(strValueOf.length() != 0 ? "Gcam debug directory not valid or doesn't exist: ".concat(strValueOf) : new String("Gcam debug directory not valid or doesn't exist: "));
        }
        File file2 = new File(new File(new File(file, "gcam"), d(j)), str);
        if (file2.exists()) {
            String strValueOf2 = String.valueOf(file2.getAbsolutePath());
            throw new IOException(strValueOf2.length() != 0 ? "Gcam debug data folder already exists: ".concat(strValueOf2) : new String("Gcam debug data folder already exists: "));
        }
        if (file2.mkdirs()) {
            file2.getAbsolutePath();
            return file2.getAbsolutePath();
        }
        String strValueOf3 = String.valueOf(file2.getAbsolutePath());
        throw new IOException(strValueOf3.length() != 0 ? "Could not create Gcam debug data folder: ".concat(strValueOf3) : new String("Could not create Gcam debug data folder: "));
    }

    public final boolean e() {
        if (this.c.k(ddu.p)) {
            return true;
        }
        ddf ddfVar = this.c;
        ddi ddiVar = ddm.a;
        ddfVar.b();
        return false;
    }
}
