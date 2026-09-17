package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.util.Log;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
final class lsw {
    public static OutputConfiguration a(lui luiVar, Surface surface) {
        try {
            OutputConfiguration outputConfiguration = new OutputConfiguration(surface);
            b(luiVar, outputConfiguration);
            return outputConfiguration;
        } catch (IllegalArgumentException e) {
            Log.w("OutputConfigs", "The illegal argument may be caused by invalid surface.");
            return null;
        }
    }

    public static void b(lui luiVar, OutputConfiguration outputConfiguration) {
        if (luiVar.g) {
            obr.aR(true, "Physical camera ids are only available on Android P and greater.");
            outputConfiguration.setPhysicalCameraId(luiVar.f.a);
        }
    }
}
