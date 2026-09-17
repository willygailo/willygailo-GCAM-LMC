package defpackage;

import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public enum lmb {
    TOP_LEFT(1),
    TOP_RIGHT(2),
    BOTTOM_RIGHT(3),
    BOTTOM_LEFT(4),
    LEFT_TOP(5),
    RIGHT_TOP(6),
    RIGHT_BOTTOM(7),
    LEFT_BOTTOM(8);

    private static final oor j;
    public final short i;

    static {
        List listAsList = Arrays.asList(values());
        brr brrVar = new brr(7);
        oon oonVarM = oor.m();
        for (Object obj : listAsList) {
            oonVarM.e(brrVar.a(obj), obj);
        }
        try {
            j = oonVarM.c();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    lmb(short s) {
        this.i = s;
    }

    public static lic a(lmb lmbVar) {
        if (lmbVar == null) {
            Log.w("CAM_ExifOrientation", "Computing rotation for an null exif orientation, returning 0");
            return lic.CLOCKWISE_0;
        }
        lic licVar = lic.CLOCKWISE_0;
        switch (lmbVar.ordinal()) {
            case 0:
                return lic.CLOCKWISE_0;
            case 2:
                return lic.CLOCKWISE_180;
            case 5:
                return lic.CLOCKWISE_90;
            case 7:
                return lic.CLOCKWISE_270;
            default:
                String strValueOf = String.valueOf(lmbVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
                sb.append("Computing rotation for an invalid orientation: ");
                sb.append(strValueOf);
                Log.w("CAM_ExifOrientation", sb.toString());
                return lic.CLOCKWISE_0;
        }
    }

    public static lmb b(lic licVar) {
        licVar.getClass();
        switch (licVar) {
            case CLOCKWISE_0:
                return TOP_LEFT;
            case CLOCKWISE_90:
                return RIGHT_TOP;
            case CLOCKWISE_180:
                return BOTTOM_RIGHT;
            case CLOCKWISE_270:
                return LEFT_BOTTOM;
            default:
                throw new IllegalArgumentException("Orientation must be one of 4 defined values!");
        }
    }

    public static lmb c(ExifInterface exifInterface) {
        Integer numB;
        if (exifInterface == null || (numB = exifInterface.b(ExifInterface.j)) == null) {
            return null;
        }
        return (lmb) j.get(Short.valueOf(numB.shortValue()));
    }
}
