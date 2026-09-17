package defpackage;

import MC.Device;
import android.hardware.camera2.CameraCharacteristics;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.StaticMetadataVector;

/* JADX INFO: loaded from: classes.dex */
public final class eas {
    public static final ouj a = ouj.h("com/google/android/apps/camera/hdrplus/HdrPlusModule");
    private static final int[] b = new int[0];

    public static float a(StaticMetadataVector staticMetadataVector, int i) {
        float f = -1.0f;
        float f2 = Float.POSITIVE_INFINITY;
        for (int i2 = 0; i2 < GcamModuleJNI.StaticMetadataVector_size(staticMetadataVector.a, staticMetadataVector); i2++) {
            StaticMetadata staticMetadata = new StaticMetadata(GcamModuleJNI.StaticMetadataVector_get(staticMetadataVector.a, staticMetadataVector, i2), false);
            if (staticMetadata.a() == i) {
                int iB = staticMetadata.b();
                if (!GcamModuleJNI.IsLogical(iB) && GcamModuleJNI.IsRgb(iB)) {
                    float fStaticMetadata_FocalLength35mm = GcamModuleJNI.StaticMetadata_FocalLength35mm(staticMetadata.a, staticMetadata);
                    if (fStaticMetadata_FocalLength35mm > 0.0f) {
                        float fAbs = Math.abs((-28.0f) + fStaticMetadata_FocalLength35mm);
                        if (fAbs < f2) {
                            f = fStaticMetadata_FocalLength35mm;
                            f2 = fAbs;
                        }
                    }
                }
            }
        }
        return f;
    }

    public static boolean b(lvp lvpVar) {
        if (Device.isXiaomi12()) {
            int[] iArr = (int[]) lvpVar.m(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, b);
            int length = iArr.length;
            for (int i = 0; i < length && iArr[i] != 3; i++) {
            }
            return true;
        }
        for (int i2 : (int[]) lvpVar.m(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, b)) {
            if (i2 == 3) {
                return true;
            }
        }
        return false;
    }
}
