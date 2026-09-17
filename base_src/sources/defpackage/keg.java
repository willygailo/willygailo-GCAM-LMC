package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class keg extends kdu {
    private final kdi a;

    public keg(kdx kdxVar) {
        super(kdxVar);
        this.a = new kdi();
    }

    @Override // defpackage.kdu
    protected final void a() {
        kdo kdoVarE = e();
        if (kdoVarE.d == null) {
            synchronized (kdoVarE) {
                if (kdoVarE.d == null) {
                    kdi kdiVar = new kdi();
                    PackageManager packageManager = kdoVarE.b.getPackageManager();
                    String packageName = kdoVarE.b.getPackageName();
                    kdiVar.c = packageName;
                    kdiVar.d = packageManager.getInstallerPackageName(packageName);
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(kdoVarE.b.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            try {
                                str = packageInfo.versionName;
                            } catch (PackageManager.NameNotFoundException e) {
                                String strValueOf = String.valueOf(packageName);
                                Log.e("GAv4", strValueOf.length() != 0 ? "Error retrieving package info: appName set to ".concat(strValueOf) : new String("Error retrieving package info: appName set to "));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                    }
                    kdiVar.a = packageName;
                    kdiVar.b = str;
                    kdoVarE.d = kdiVar;
                }
            }
        }
        kdi kdiVar2 = kdoVarE.d;
        kdi kdiVar3 = this.a;
        if (!TextUtils.isEmpty(kdiVar2.a)) {
            kdiVar3.a = kdiVar2.a;
        }
        if (!TextUtils.isEmpty(kdiVar2.b)) {
            kdiVar3.b = kdiVar2.b;
        }
        if (!TextUtils.isEmpty(kdiVar2.c)) {
            kdiVar3.c = kdiVar2.c;
        }
        if (!TextUtils.isEmpty(kdiVar2.d)) {
            kdiVar3.d = kdiVar2.d;
        }
        kfn kfnVarK = k();
        kfnVarK.z();
        String str2 = kfnVarK.c;
        if (str2 != null) {
            this.a.a = str2;
        }
        kfnVarK.z();
        String str3 = kfnVarK.a;
        if (str3 != null) {
            this.a.b = str3;
        }
    }
}
