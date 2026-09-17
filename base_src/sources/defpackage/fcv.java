package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fcv {
    public static final fcu a;
    private static final ouj b = ouj.h("com/google/android/apps/camera/legacy/lightcycle/panorama/DeviceManager");
    private static final Map c;

    static {
        HashMap map = new HashMap();
        c = map;
        f("LGE", "hammerhead", new fcu(-1.0f, true));
        f("LGE", "g3", new fcu(-1.0f, true));
        f("LGE", "b1", new fcu(-1.0f, true));
        f("LGE", "b1w", new fcu(-1.0f, true));
        f("HTC", "m7", new fcu(56.69f, false));
        f("HTC", "m7cdtu", new fcu(56.69f, false));
        f("HTC", "m7cdug", new fcu(56.69f, false));
        f("HTC", "m7cdwg", new fcu(56.69f, false));
        f("HTC", "m7wls", new fcu(56.69f, false));
        f("HTC", "m7wlv", new fcu(56.69f, false));
        f("motorola", "ghost", new fcu(53.0f, false));
        f("Default", "", new fcu(-1.0f, false));
        String str = Build.BRAND;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append("Brand : '");
        sb.append(str);
        sb.append("' ");
        String strValueOf = String.valueOf(sb.toString());
        String str2 = Build.MANUFACTURER;
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 18 + String.valueOf(str2).length());
        sb2.append(strValueOf);
        sb2.append("Manufacturer : '");
        sb2.append(str2);
        sb2.append("' ");
        String strValueOf2 = String.valueOf(sb2.toString());
        String str3 = Build.DEVICE;
        StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf2).length() + 12 + String.valueOf(str3).length());
        sb3.append(strValueOf2);
        sb3.append("Device : '");
        sb3.append(str3);
        sb3.append("' ");
        String strValueOf3 = String.valueOf(sb3.toString());
        String str4 = Build.MODEL;
        StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf3).length() + 11 + String.valueOf(str4).length());
        sb4.append(strValueOf3);
        sb4.append("Model : '");
        sb4.append(str4);
        sb4.append("' ");
        String strValueOf4 = String.valueOf(sb4.toString());
        String str5 = Build.HARDWARE;
        StringBuilder sb5 = new StringBuilder(String.valueOf(strValueOf4).length() + 14 + String.valueOf(str5).length());
        sb5.append(strValueOf4);
        sb5.append("Hardware : '");
        sb5.append(str5);
        sb5.append("' ");
        String strValueOf5 = String.valueOf(sb5.toString());
        String str6 = Build.PRODUCT;
        StringBuilder sb6 = new StringBuilder(String.valueOf(strValueOf5).length() + 13 + String.valueOf(str6).length());
        sb6.append(strValueOf5);
        sb6.append("Product : '");
        sb6.append(str6);
        sb6.append("' ");
        String strValueOf6 = String.valueOf(sb6.toString());
        String str7 = Build.BOARD;
        String.valueOf(strValueOf6).length();
        String.valueOf(str7).length();
        map.containsKey(e());
        fcu fcuVar = (fcu) map.get(e());
        if (fcuVar == null) {
            fcuVar = (fcu) map.get("Default");
        }
        a = fcuVar;
    }

    public static float a(float f) {
        fcu fcuVar = a;
        if (fcuVar.a > 0.0f) {
            return fcuVar.a;
        }
        if (f <= 160.0f) {
            return f;
        }
        ((oug) ((oug) b.c()).G((char) 1645)).r("Reported FOV is larger than the maximum allowed at : %g", Float.valueOf(f));
        return 55.0f;
    }

    public static boolean b() {
        return Build.MODEL.startsWith("GalaxySZ");
    }

    public static boolean c() {
        return Build.MODEL.startsWith("Nexus 5");
    }

    public static boolean d(double d) {
        return Math.abs(d) > 8.0d;
    }

    private static String e() {
        String strValueOf = String.valueOf(Build.MANUFACTURER);
        String strValueOf2 = String.valueOf(Build.DEVICE);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    private static void f(String str, String str2, fcu fcuVar) {
        c.put(str2.length() != 0 ? str.concat(str2) : new String(str), fcuVar);
    }
}
