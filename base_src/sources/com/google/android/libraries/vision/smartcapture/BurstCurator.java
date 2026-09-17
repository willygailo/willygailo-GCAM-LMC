package com.google.android.libraries.vision.smartcapture;

import defpackage.ojr;
import defpackage.poq;
import defpackage.por;
import defpackage.pos;
import defpackage.puj;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class BurstCurator implements Closeable {
    public final pos a;
    public final long b;
    public boolean c;

    static {
        try {
            System.loadLibrary("smartcapture_native");
        } catch (UnsatisfiedLinkError e) {
            if ("Dalvik".equals(ojr.JAVA_VM_NAME.a())) {
                throw e;
            }
        }
    }

    public BurstCurator(long j) {
        if (j == 0) {
            throw new IllegalStateException("Could not initialize BurstCurator.");
        }
        this.b = j;
        this.c = false;
        pos posVarC = pos.c();
        this.a = posVarC;
        poq poqVar = puj.j;
        posVarC.b.put(new por(poqVar.a, poqVar.a()), poqVar);
    }

    private native void nativeClose(long j);

    public static native long nativeCreateFromOptions(byte[] bArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        nativeClose(this.b);
        this.c = true;
    }

    protected final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public native byte[] nativeProcessMetadata(long j, byte[] bArr);

    public native byte[] nativeProcessYUV(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, ByteBuffer byteBuffer3, int i5, int i6, int i7, int i8, byte[] bArr);
}
