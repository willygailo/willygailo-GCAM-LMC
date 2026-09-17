package com.google.mediapipe.framework;

/* JADX INFO: loaded from: classes.dex */
public class Packet {
    public long a;

    public Packet(long j) {
        this.a = j;
    }

    public static Packet create(long j) {
        return new Packet(j);
    }

    private native long nativeGetTimestamp(long j);

    private native void nativeReleasePacket(long j);

    public final long a() {
        return nativeGetTimestamp(this.a);
    }

    public long getNativeHandle() {
        return this.a;
    }

    public native long nativeCopyPacket(long j);

    public void release() {
        long j = this.a;
        if (j != 0) {
            nativeReleasePacket(j);
            this.a = 0L;
        }
    }
}
