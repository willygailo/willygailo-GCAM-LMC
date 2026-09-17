package com.google.android.libraries.lens.lenslite.api;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface LinkChipResult {

    public interface BitmapProvider {
        Bitmap getBitmap();
    }

    int getActionType();

    BitmapProvider getBitmapProvider();

    List getBoundingBox();

    Point getCenterpoint();

    String getChipContentDescription();

    Drawable getIcon();

    long getId();

    Runnable getOnChipClickListener();

    Runnable getOnCloseButtonClickListener();

    int getResultType();

    String getText();

    long getTimeout();
}
