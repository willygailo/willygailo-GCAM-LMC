package com.google.mediapipe.framework;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidAssetUtil {
    public static synchronized void a(Context context) {
        nativeInitializeAssetManager(context, context.getCacheDir().getAbsolutePath());
    }

    private static native boolean nativeInitializeAssetManager(Context context, String str);
}
