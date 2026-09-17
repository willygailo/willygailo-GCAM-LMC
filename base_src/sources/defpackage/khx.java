package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.provider.Settings;
import android.util.Log;
import android.view.WindowManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class khx {
    private static khx b;
    public final Context a;

    public khx(Context context) {
        this.a = context.getApplicationContext();
    }

    public khx(Context context, byte[] bArr) {
        this.a = context;
    }

    public khx(Context context, byte[] bArr, byte[] bArr2) {
        this.a = context;
    }

    public khx(Context context, char[] cArr) {
        this.a = context;
    }

    public khx(Context context, short[] sArr) {
        this.a = context;
    }

    public static khx a(Context context) {
        mip.dk(context);
        synchronized (khx.class) {
            if (b == null) {
                khv.a(context);
                b = new khx(context);
            }
        }
        return b;
    }

    static final kmz b(PackageInfo packageInfo, kmz... kmzVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        khs khsVar = new khs(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < kmzVarArr.length; i++) {
            if (kmzVarArr[i].equals(khsVar)) {
                return kmzVarArr[i];
            }
        }
        return null;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? b(packageInfo, khu.a) : b(packageInfo, khu.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public static final boolean j(String str, int i, int i2) {
        Matcher matcher = Pattern.compile("^([0-9]+)\\.([0-9]+).*").matcher(str);
        if (!matcher.find()) {
            return false;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        int i3 = Integer.parseInt(strGroup);
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return i3 > i || (i3 == i && Integer.parseInt(strGroup2) >= i2);
    }

    public static Object m(Context context, String str) {
        try {
            return context.getSystemService(str);
        } catch (Exception e) {
            return null;
        }
    }

    public final boolean d() {
        return Settings.Secure.getInt(this.a.getContentResolver(), "camera_double_twist_to_flip_enabled", 1) == 1;
    }

    public final int e(String str) {
        return this.a.checkCallingOrSelfPermission(str);
    }

    public final ApplicationInfo f(String str, int i) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo g(String str, int i) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public final String h(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            return "";
        }
    }

    public final String i() {
        return h("com.google.vr.apps.ornament");
    }

    public final KeyguardManager k() {
        return (KeyguardManager) m(this.a, "keyguard");
    }

    public final SensorManager l() {
        return (SensorManager) m(this.a, "sensor");
    }

    public final WindowManager n() {
        return (WindowManager) m(this.a, "window");
    }
}
