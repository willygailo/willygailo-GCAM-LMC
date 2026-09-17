package com.google.vr.ndk.base;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.StrictMode;
import defpackage.pwq;
import defpackage.pwy;
import defpackage.pxa;
import defpackage.pxb;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class GvrApi {

    interface IdleListener {
        void onIdleChanged(boolean z);
    }

    public interface PoseTracker {
        void getHeadPoseInStartSpace(float[] fArr, long j);
    }

    static {
        "robolectric".equals(Build.FINGERPRINT);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            pwy.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static native long nativeGetUserPrefs(long j);

    private static native boolean nativeIsFeatureSupported(long j, int i);

    public static native boolean nativeUserPrefsIsFeatureEnabled(long j, int i);

    private static void requestFeatures(Context context, long j, int[] iArr, int[] iArr2, PendingIntent pendingIntent) {
        pxa[] pxaVarArrA = pxa.a(iArr);
        pxa[] pxaVarArrA2 = pxa.a(iArr2);
        pxb pxbVar = new pxb(nativeGetUserPrefs(j));
        Intent flags = new Intent("com.google.intent.action.vr.REQUEST_FEATURE").setComponent(pwq.a).setFlags(268435456);
        ArrayList arrayList = new ArrayList();
        for (pxa pxaVar : pxaVarArrA) {
            if (nativeIsFeatureSupported(j, pxaVar.c) && !pxbVar.a(pxaVar)) {
                arrayList.add(pxaVar.d);
            }
        }
        if (!arrayList.isEmpty()) {
            flags.putExtra("required_features", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        ArrayList arrayList2 = new ArrayList();
        for (pxa pxaVar2 : pxaVarArrA2) {
            if (nativeIsFeatureSupported(j, pxaVar2.c) && !pxbVar.a(pxaVar2)) {
                arrayList2.add(pxaVar2.d);
            }
        }
        if (!arrayList2.isEmpty()) {
            flags.putExtra("optional_features", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        if (flags.getExtras() != null) {
            flags.putExtra("pending_intent", pendingIntent);
            context.startActivity(flags);
        }
    }

    public long getNativeGvrContext() {
        throw null;
    }
}
