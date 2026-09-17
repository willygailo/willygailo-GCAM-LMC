package com.google.googlex.gcam.lasagna;

import com.google.googlex.gcam.ShotMetadata;
import defpackage.ojc;

/* JADX INFO: loaded from: classes.dex */
public interface LasagnaCallbacks {
    void a(int i, int i2, String str, ojc ojcVar);

    void b(int i, long j, int i2, String str, ShotMetadata shotMetadata);

    void onFinalStatusNative(int i, int i2, String str, byte[] bArr);

    void onImageNative(int i, long j, int i2, String str, long j2);

    void onProgress(int i, float f);

    void onPslRequest(int i, boolean z, float f, float f2);
}
