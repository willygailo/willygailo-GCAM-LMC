package com.google.android.libraries.lens.lenslite.api;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public interface LinkHighResBitmapRequester {

    public interface LinkHighResBitmapCallback {
        void onNewHighResBitmap(Bitmap bitmap, int i);
    }

    boolean requestHighResBitmap(long j, LinkHighResBitmapCallback linkHighResBitmapCallback);
}
