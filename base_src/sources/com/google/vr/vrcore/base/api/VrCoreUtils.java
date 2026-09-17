package com.google.vr.vrcore.base.api;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.util.Log;
import defpackage.pxi;
import defpackage.pxj;
import defpackage.qmd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class VrCoreUtils {
    public static int a(Context context) {
        List<PackageInstaller.SessionInfo> allSessions;
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            return 0;
        }
        try {
            if (!context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 0).enabled) {
                return 2;
            }
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.vr.vrcore", 64);
            if (!pxi.a(packageInfo, pxi.a)) {
                if (!(qmd.v != null ? qmd.v.booleanValue() : qmd.am(context)) || !pxi.a(packageInfo, pxi.b)) {
                    return 9;
                }
            }
            return 0;
        } catch (PackageManager.NameNotFoundException e) {
            try {
                allSessions = context.getPackageManager().getPackageInstaller().getAllSessions();
            } catch (RuntimeException e2) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 45);
                sb.append("Failure querying package installer sessions: ");
                sb.append(strValueOf);
                Log.w("VrCoreUtils", sb.toString());
                allSessions = null;
            }
            if (allSessions != null) {
                Iterator<PackageInstaller.SessionInfo> it = allSessions.iterator();
                while (it.hasNext()) {
                    if ("com.google.vr.vrcore".equals(it.next().getAppPackageName())) {
                        return 3;
                    }
                }
            }
            try {
                return context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 8192).enabled ? 3 : 1;
            } catch (PackageManager.NameNotFoundException e3) {
            }
        }
    }

    public static int getVrCoreClientApiVersion(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
            if (!applicationInfo.enabled) {
                throw new pxj(2);
            }
            if (applicationInfo.metaData != null) {
                return applicationInfo.metaData.getInt("com.google.vr.vrcore.ClientApiVersion", 0);
            }
            return 0;
        } catch (PackageManager.NameNotFoundException e) {
            throw new pxj(a(context));
        }
    }
}
