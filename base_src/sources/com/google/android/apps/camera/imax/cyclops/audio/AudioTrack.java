package com.google.android.apps.camera.imax.cyclops.audio;

/* JADX INFO: loaded from: classes.dex */
public class AudioTrack {
    private final byte[] audioData;
    private final String mime;

    public AudioTrack(String str, byte[] bArr) {
        this.mime = str;
        this.audioData = bArr;
    }
}
