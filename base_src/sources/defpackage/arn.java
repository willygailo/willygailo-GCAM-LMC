package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class arn {
    static {
        kus.g("PackageManagerHelper");
    }

    public static void a(Context context, Class cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), true != z ? 2 : 1, 1);
            kus kusVarL = kus.l();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = true != z ? "disabled" : "enabled";
            String.format("%s %s", objArr);
            kusVarL.h(new Throwable[0]);
        } catch (Exception e) {
            kus kusVarL2 = kus.l();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = true == z ? "enabled" : "disabled";
            String.format("%s could not be %s", objArr2);
            kusVarL2.h(e);
        }
    }
}
