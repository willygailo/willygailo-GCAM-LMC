package com.google.android.libraries.oliveoil.natives;

import com.google.android.libraries.oliveoil.util.JniUtil;
import defpackage.mtn;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class NativeMemCopier implements mtn {
    private final boolean a;

    public NativeMemCopier() {
        boolean z;
        try {
            int i = JniUtil.a;
            z = true;
        } catch (UnsatisfiedLinkError e) {
            z = false;
        }
        this.a = z;
    }

    @Override // defpackage.mtn
    public final boolean a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return this.a && byteBuffer.isDirect() && byteBuffer2.isDirect();
    }

    @Override // defpackage.mtn
    public native void copyBytes(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3);

    @Override // defpackage.mtn
    public native void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6);

    @Override // defpackage.mtn
    public native void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public final String toString() {
        return getClass().getSimpleName();
    }
}
