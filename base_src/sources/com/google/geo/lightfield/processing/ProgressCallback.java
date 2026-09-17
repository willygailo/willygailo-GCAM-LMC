package com.google.geo.lightfield.processing;

/* JADX INFO: loaded from: classes.dex */
public interface ProgressCallback {
    void setProgress(float f);

    void setRange(float f, float f2);

    boolean wasCancelled();
}
