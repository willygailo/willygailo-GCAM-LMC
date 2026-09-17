package com.google.mediapipe.framework;

import defpackage.ois;
import defpackage.pmy;

/* JADX INFO: loaded from: classes.dex */
public class MediaPipeException extends RuntimeException {
    MediaPipeException(int i, byte[] bArr) {
        String str = new String(bArr, ois.a);
        String str2 = pmy.values()[i].r;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        pmy pmyVar = pmy.values()[i];
    }
}
