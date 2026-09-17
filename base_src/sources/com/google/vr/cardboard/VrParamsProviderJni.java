package com.google.vr.cardboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import defpackage.plk;
import defpackage.pos;
import defpackage.ppd;
import defpackage.ppp;
import defpackage.pvx;
import defpackage.pwo;
import defpackage.pwz;
import defpackage.pxd;
import defpackage.pxe;
import defpackage.pxf;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class VrParamsProviderJni {
    private static void a(long j, DisplayMetrics displayMetrics, float f, int i) {
        nativeUpdateNativeDisplayParamsPointer(j, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.xdpi, displayMetrics.ydpi, f, i);
    }

    private static native void nativeUpdateNativeDisplayParamsPointer(long j, int i, int i2, float f, float f2, float f3, int i3);

    private static byte[] readDeviceParams(Context context) {
        pwo pwoVarAi = plk.ai(context);
        pxd pxdVarB = pwoVarAi.b();
        pwoVarAi.e();
        if (pxdVarB == null) {
            return null;
        }
        return pxdVarB.g();
    }

    private static void readDisplayParams(Context context, long j) {
        pvx pvxVarB = null;
        int iA = 0;
        if (context == null) {
            Log.w("VrParamsProviderJni", "Missing context for phone params lookup. Results may be invalid.");
            a(j, Resources.getSystem().getDisplayMetrics(), plk.aj(null), 0);
            return;
        }
        pwo pwoVarAi = plk.ai(context);
        pxe pxeVarC = pwoVarAi.c();
        pwoVarAi.e();
        Display displayAl = plk.al(context);
        DisplayMetrics displayMetricsAk = plk.ak(displayAl);
        if (pxeVarC != null) {
            if ((pxeVarC.a & 1) != 0) {
                displayMetricsAk.xdpi = pxeVarC.b;
            }
            if ((pxeVarC.a & 2) != 0) {
                displayMetricsAk.ydpi = pxeVarC.c;
            }
        }
        float fAj = plk.aj(pxeVarC);
        try {
            Class<?> cls = Class.forName("android.view.DisplayInfo");
            Object objNewInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            Display.class.getDeclaredMethod("getDisplayInfo", cls).invoke(displayAl, objNewInstance);
            Field declaredField = cls.getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            pvxVarB = pvx.b(declaredField.get(objNewInstance));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 44);
            sb.append("Failed to fetch DisplayCutout from Display: ");
            sb.append(strValueOf);
            Log.e("AndroidPCompat", sb.toString());
        }
        if (pvxVarB != null) {
            iA = context.getResources().getConfiguration().orientation == 1 ? pvxVarB.a("getSafeInsetTop") + pvxVarB.a("getSafeInsetBottom") : pvxVarB.a("getSafeInsetLeft") + pvxVarB.a("getSafeInsetRight");
        }
        a(j, displayMetricsAk, fAj, iA);
    }

    private static byte[] readSdkConfigurationParams(Context context) {
        return pwz.a(context).g();
    }

    private static byte[] readUserPrefs(Context context) {
        pwo pwoVarAi = plk.ai(context);
        pxf pxfVarD = pwoVarAi.d();
        pwoVarAi.e();
        if (pxfVarD == null) {
            return null;
        }
        return pxfVarD.g();
    }

    private static boolean writeDeviceParams(Context context, byte[] bArr) {
        pxd pxdVar;
        pwo pwoVarAi = plk.ai(context);
        if (bArr != null) {
            try {
                pxdVar = (pxd) ppd.s(pxd.a, bArr, pos.b());
            } catch (ppp e) {
                String strValueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 31);
                sb.append("Error parsing protocol buffer: ");
                sb.append(strValueOf);
                Log.w("VrParamsProviderJni", sb.toString());
                return false;
            } finally {
                pwoVarAi.e();
            }
        } else {
            pxdVar = null;
        }
        return pwoVarAi.f(pxdVar);
    }
}
