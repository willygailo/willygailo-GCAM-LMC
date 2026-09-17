package com.google.android.apps.camera.jni.facebeautification;

import android.graphics.Point;
import android.graphics.Rect;
import defpackage.enk;

/* JADX INFO: loaded from: classes.dex */
public abstract class FaceInfo {
    public static enk builder(Rect rect) {
        enk enkVar = new enk();
        if (rect == null) {
            throw new NullPointerException("Null bounds");
        }
        enkVar.a = rect;
        return enkVar;
    }

    public abstract Rect bounds();

    public abstract float[] faceAttributes();

    public abstract Point leftEarTragion();

    public abstract Point leftEye();

    public abstract Point mouthCenter();

    public abstract Point noseTip();

    public abstract Point rightEarTragion();

    public abstract Point rightEye();
}
