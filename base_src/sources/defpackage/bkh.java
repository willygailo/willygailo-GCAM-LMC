package defpackage;

import android.content.Context;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public class bkh {
    public static ayn b(axv axvVar, bjp bjpVar, bjv bjvVar, Context context) {
        return new ayn(axvVar, bjpVar, bjvVar, context);
    }

    public static Pair c(fto ftoVar) {
        jua juaVar = new jua();
        float[] fArr = new float[16];
        mip.ee(ftoVar.a, juaVar);
        juaVar.b(fArr);
        float fAsin = (float) Math.asin(fArr[4]);
        float fAsin2 = (float) Math.asin(fArr[5]);
        if (fArr[6] > 0.0f) {
            fAsin = -fAsin;
            fAsin2 = -fAsin2;
        }
        return new Pair(Float.valueOf(fAsin), Float.valueOf(fAsin2));
    }

    public static boolean d(float f, float f2) {
        double dAbs = Math.abs(Math.toDegrees(f));
        double dAbs2 = Math.abs(Math.toDegrees(f2 - f));
        if (dAbs <= 1.0d) {
            return dAbs2 >= 0.1d;
        }
        return dAbs2 >= 0.5d;
    }
}
