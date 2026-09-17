package com.google.android.apps.camera.legacy.app.activity;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import defpackage.bqe;
import defpackage.oug;
import defpackage.ouj;

/* JADX INFO: loaded from: classes.dex */
public class CaptureActivity extends CameraActivity {
    private static final ouj s = ouj.h("com/google/android/apps/camera/legacy/app/activity/CaptureActivity");

    @Override // com.google.android.apps.camera.legacy.app.activity.main.CameraActivity, defpackage.etd, defpackage.fio, defpackage.by, defpackage.ub, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        bqe.f(getIntent());
        String callingPackage = getCallingPackage();
        int i = 0;
        getIntent().putExtra("include_location_in_exif", false);
        PackageInfo packageInfo = null;
        try {
            if (callingPackage != null) {
                packageInfo = getPackageManager().getPackageInfo(callingPackage, 4096);
            } else {
                ((oug) ((oug) s.c()).G(1499)).o("getCallingPackage() returned null.");
            }
        } catch (PackageManager.NameNotFoundException e) {
            ((oug) ((oug) s.c()).G((char) 1504)).r("Unable to get PackageInfo for %s", callingPackage);
        }
        if (packageInfo == null || packageInfo.requestedPermissions == null) {
            z = false;
        } else {
            int i2 = 0;
            z = false;
            while (i < packageInfo.requestedPermissions.length) {
                if (packageInfo.requestedPermissions[i].equals("android.permission.ACCESS_COARSE_LOCATION") && (packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                    ((oug) ((oug) s.c()).G((char) 1503)).r("Coarse location is granted to %s", callingPackage);
                    i2 = 1;
                }
                if (packageInfo.requestedPermissions[i].equals("android.permission.ACCESS_FINE_LOCATION") && (packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                    ((oug) ((oug) s.c()).G((char) 1502)).r("Fine location is granted to %s", callingPackage);
                    z = true;
                }
                i++;
            }
            i = i2;
        }
        if (i == 0 && !z) {
            ((oug) ((oug) s.c()).G((char) 1501)).r("Package %s doesn't have location permissions, location info won't be included in EXIF", callingPackage);
        } else {
            ((oug) ((oug) s.c()).G((char) 1500)).o("Allowing location in intent");
            getIntent().putExtra("include_location_in_exif", true);
        }
    }
}
