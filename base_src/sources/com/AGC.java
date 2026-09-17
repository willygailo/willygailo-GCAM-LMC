package com;

import agc.Agc;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.util.SizeF;
import com.Fix.Pref;
import com.SDE.LensValue;
import defpackage.ddx;
import defpackage.dep;
import defpackage.ghx;
import defpackage.jrl;
import defpackage.kad;
import defpackage.kbi;
import defpackage.lvp;
import defpackage.lvq;
import defpackage.lwd;
import defpackage.lzi;
import defpackage.lzv;
import defpackage.pkr;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AGC {
    public static dep dep;

    public AGC() {
        new Pref();
        initMenuValue();
    }

    public static final float a(kbi kbiVar, boolean z, jrl jrlVar) {
        if (jrlVar == jrl.PORTRAIT && kbiVar.A == lwd.FRONT) {
            kbiVar.c.b();
        }
        ghx ghxVarZ = kbiVar.Z();
        float fFloatValue = ((Float) kbiVar.o.fA()).floatValue();
        if (kbiVar.aa(ghxVarZ) && !z) {
            return kbiVar.W.a(ghxVarZ);
        }
        if (!kbiVar.X()) {
            if (jrlVar != jrl.PORTRAIT) {
                return fFloatValue;
            }
            return (kbiVar.A == lwd.FRONT && kbiVar.L) ? kbiVar.I.a(!kbiVar.c.k(ddx.H) ? 1 : 0) : kbiVar.I();
        }
        if (kbiVar.A != lwd.FRONT || !kbiVar.L) {
            return jrlVar != jrl.PORTRAIT ? fFloatValue : kbiVar.I();
        }
        boolean zY = kbiVar.Y();
        kad kadVar = kbiVar.I;
        return zY ? kadVar.a(0) : kadVar.a(1);
    }

    public static boolean getCaptureResult(lzv lzvVar) {
        return ((Integer) lzvVar.d(CaptureResult.CONTROL_AF_MODE)) != null;
    }

    public static Integer getCaptureResultKey(lzv lzvVar) {
        return (Integer) lzvVar.d(CaptureResult.CONTROL_AF_MODE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x007e  */
    public static int getGcamSensorId(lvp lvpVar, lvq lvqVar, lzv lzvVar) {
        Float f;
        Object objD;
        float fFloatValue;
        boolean z;
        lwd lwdVarK = lvpVar.k();
        lwd lwdVar = lwd.BACK;
        boolean zL = lvpVar.L();
        int iIntValue = ((Integer) lvpVar.l(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT)).intValue();
        if (zL && lzvVar == null) {
            return lwdVarK == lwdVar ? 5 : 3;
        }
        lvp lvpVarY = lzvVar != null ? pkr.y(lvpVar, lvqVar, lzvVar) : lvpVar;
        List listT = lvpVarY.t();
        if (listT.size() != 1) {
            if (lzvVar != null) {
                objD = lzvVar.d(CaptureResult.LENS_FOCAL_LENGTH);
            } else {
                f = null;
            }
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            float width = ((SizeF) lvpVarY.l(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)).getWidth();
            lzi lziVar = pkr.d;
            boolean zH = lziVar.h();
            boolean zD = lziVar.d();
            boolean z2 = lziVar.a;
            boolean z3 = lziVar.k;
            boolean z4 = lziVar.m;
            boolean zD2 = pkr.D(lzvVar);
            int iMenuValue = Pref.MenuValue(LensValue.SetLensValue("pref_gcam_lens_logic_key"));
            if (lwdVarK == lwdVar) {
                z = true;
            } else {
                z = false;
            }
            int gcamSensorID = Agc.getGcamSensorID(iMenuValue, fFloatValue, width, zD, zH, z4, z3, zD2, z, zL, z2, iIntValue);
            Agc.setSensorId(gcamSensorID);
            return gcamSensorID;
        }
        objD = listT.get(0);
        f = (Float) objD;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        float width2 = ((SizeF) lvpVarY.l(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)).getWidth();
        lzi lziVar2 = pkr.d;
        boolean zH2 = lziVar2.h();
        boolean zD3 = lziVar2.d();
        boolean z5 = lziVar2.a;
        boolean z6 = lziVar2.k;
        boolean z7 = lziVar2.m;
        boolean zD4 = pkr.D(lzvVar);
        int iMenuValue2 = Pref.MenuValue(LensValue.SetLensValue("pref_gcam_lens_logic_key"));
        if (lwdVarK == lwdVar) {
            z = true;
        } else {
            z = false;
        }
        int gcamSensorID2 = Agc.getGcamSensorID(iMenuValue2, fFloatValue, width2, zD3, zH2, z7, z6, zD4, z, zL, z5, iIntValue);
        Agc.setSensorId(gcamSensorID2);
        return gcamSensorID2;
    }

    public static long getReadoutTimeNs(lvp lvpVar) {
        return ((Integer) lvpVar.n(CameraCharacteristics.LENS_FACING)).intValue() == 0 ? 50000000L : 33331760L;
    }

    private static void initMenuValue() {
        if (!Pref.getSharedPreferences().contains("pref_menu_value_key")) {
            Pref.setMenuValue("pref_menu_value_key", 1);
        }
        if (!Pref.getSharedPreferences().contains("pref_hexagon_key")) {
            Pref.setMenuValue("pref_hexagon_key", 1);
        }
        if (!Pref.getSharedPreferences().contains("pref_video_hevc_setting_key")) {
            Pref.setMenuValue("pref_video_hevc_setting_key", 0);
        }
        if (!Pref.getSharedPreferences().contains("pref_camera_recordlocation_key")) {
            Pref.setMenuValue("pref_camera_recordlocation_key", 0);
        }
        if (!Pref.getSharedPreferences().contains("pref_vibro_button_key")) {
            Pref.setMenuValue("pref_vibro_button_key", 1);
        }
        Pref.getSharedPreferences();
    }

    public static Object minObject(List<Comparable> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Comparable comparable = list.get(0);
        for (Comparable comparable2 : list) {
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }
}
