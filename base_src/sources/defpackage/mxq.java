package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class mxq {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final mfa e;
    public final ojz f;
    public final ojz g;
    public final int h;

    public mxq(Context context, ojc ojcVar, String str) throws Throwable {
        int i;
        this.a = context;
        this.b = context.getPackageName();
        int i2 = mwh.b;
        String packageName = context.getPackageName();
        String strB = mwh.b();
        if (strB != null && packageName != null && strB.startsWith(packageName)) {
            int length = packageName.length();
            strB = strB.length() == length ? null : strB.substring(length + 1);
        }
        this.c = strB;
        this.g = ojcVar.g() ? ((mxe) ojcVar.c()).a() : null;
        this.d = str;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
            i = 3;
        } else {
            i = packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        }
        this.h = true == packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : i;
        this.e = new mfa(context);
        this.f = obr.au(new ojz() { // from class: mxp
            @Override // defpackage.ojz
            public final Object a() {
                return Long.valueOf(this.a.e.a().getTotalSpace() / 1024);
            }
        });
    }
}
