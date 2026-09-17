package com.google.googlex.gcam;

import defpackage.obr;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class BufferUtils {
    private BufferUtils() {
    }

    public static long a(Buffer buffer) {
        buffer.getClass();
        return getDirectBufferAddressImpl(buffer);
    }

    public static ByteBuffer b(long j, int i) {
        obr.aG(j != 0, "ptr must not be 0.");
        obr.aI(i > 0, "capacity must be positive, got: %s", i);
        return byteBufferViewOfNativePointerImpl(j, i).order(ByteOrder.nativeOrder());
    }

    private static native ByteBuffer byteBufferViewOfNativePointerImpl(long j, int i);

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return d(byteBuffer, byteBuffer.isDirect());
    }

    public static ByteBuffer d(ByteBuffer byteBuffer, boolean z) {
        ByteBuffer byteBufferAllocateDirect = z ? ByteBuffer.allocateDirect(byteBuffer.capacity()) : ByteBuffer.allocate(byteBuffer.capacity());
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byteBufferAllocateDirect.put(byteBufferAsReadOnlyBuffer);
        byteBufferAllocateDirect.order(byteBuffer.order());
        return byteBufferAllocateDirect;
    }

    private static native long getDirectBufferAddressImpl(Buffer buffer);

    private static native long getDirectBufferCapacityImpl(Buffer buffer);

    public static native void setByteVectorImpl(byte[] bArr, long j);

    public static native void setFloatVectorImpl(float[] fArr, long j);
}
