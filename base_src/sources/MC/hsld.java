package MC;

import com.Fix.Pref;
import com.SDE.LensValue;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.ddm;
import defpackage.ddq;
import defpackage.ddx;
import defpackage.dep;

/* JADX INFO: loaded from: classes4.dex */
public class hsld {
    public static dep dep;

    public static float setAEautomax() {
        switch (Pref.MenuValue(LensValue.SetLensValue("pref_aeautomax_key"))) {
            case 0:
            default:
                return 2000.0f;
            case 1:
                return 1000.0f;
            case 2:
                return 500.0f;
            case 3:
                return 333.333f;
            case 4:
                return 250.0f;
            case 5:
                return 200.0f;
            case 6:
                return 166.66667f;
            case 7:
                return 142.857f;
            case 8:
                return 125.0f;
            case 9:
                return 111.111115f;
            case 10:
                return 100.0f;
            case 11:
                return 83.333f;
            case 12:
                return 66.666f;
            case 13:
                return 58.823f;
            case 14:
                return 50.0f;
            case 15:
                return 30.0f;
            case 16:
                return 20.0f;
            case 17:
                return 15.0f;
            case 18:
                return 10.0f;
            case 19:
                return 5.0f;
            case 20:
                return 2.0f;
            case 21:
                return 1.0f;
        }
    }

    public static void setDeveloperSettings(dep depVar) {
        dep = depVar;
        depVar.s(ddx.r, false);
        depVar.s(ddm.A, true);
        depVar.s(ddm.D, true);
        depVar.s(ddq.h, true);
        depVar.s(ddx.o, false);
        depVar.s(ddx.p, false);
    }

    public static int setEV() {
        int iMenuValue = Pref.MenuValue("pref_evslidersize_key");
        return iMenuValue != 0 ? iMenuValue : R.id.evcomp;
    }

    public static float setHDRregion() {
        switch (Pref.MenuValue(LensValue.SetLensValue("pref_hdrregion_key"))) {
            case 0:
            default:
                return 0.1f;
            case 1:
                return 1.0f;
            case 2:
                return 5.0f;
            case 3:
                return 10.0f;
            case 4:
                return 20.0f;
            case 5:
                return 25.0f;
            case 6:
                return 35.0f;
            case 7:
                return 45.0f;
            case 8:
                return 60.0f;
            case 9:
                return 70.0f;
            case 10:
                return 80.0f;
            case 11:
                return 90.0f;
            case 12:
                return 100.0f;
            case 13:
                return 110.0f;
            case 14:
                return 125.0f;
            case 15:
                return 150.0f;
            case 16:
                return 175.0f;
            case 17:
                return 200.0f;
            case 18:
                return 225.0f;
            case 19:
                return 250.0f;
            case 20:
                return 275.0f;
            case 21:
                return 300.0f;
        }
    }

    public static int setZSLFrames() {
        int iMenuValue = Pref.MenuValue(LensValue.SetLensValue1("pref_zsl_frames_key"));
        if (iMenuValue != 0) {
            return iMenuValue;
        }
        return 7;
    }
}
