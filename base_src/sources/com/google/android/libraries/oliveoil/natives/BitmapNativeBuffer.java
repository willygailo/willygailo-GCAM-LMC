package com.google.android.libraries.oliveoil.natives;

import android.graphics.Bitmap;
import com.google.android.libraries.oliveoil.util.JniUtil;
import defpackage.mmf;
import defpackage.mor;
import defpackage.mtj;
import defpackage.mtq;
import defpackage.mtu;
import defpackage.obr;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class BitmapNativeBuffer extends mtq {
    private final Bitmap b;
    private int c;
    private ByteBuffer d;

    public BitmapNativeBuffer(Bitmap bitmap) {
        super(new mor(mmf.d(bitmap.getWidth(), bitmap.getHeight()), bitmap.getRowBytes() * 8));
        this.c = 0;
        obr.aF(bitmap.getConfig() == Bitmap.Config.ARGB_8888);
        this.b = bitmap;
        int i = JniUtil.a;
    }

    private static native ByteBuffer lockBitmapPixels(Bitmap bitmap);

    private static native void unlockBitmapPixels(Bitmap bitmap);

    public final synchronized ByteBuffer a() {
        ByteBuffer byteBuffer;
        int i = this.c;
        this.c = i + 1;
        if (i == 0) {
            this.d = lockBitmapPixels(this.b);
        }
        byteBuffer = this.d;
        if (byteBuffer == null) {
            this.c--;
            throw new RuntimeException("Could not lock bitmap pixels!");
        }
        return byteBuffer;
    }

    public final synchronized void b() {
        obr.aQ(this.d != null);
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            unlockBitmapPixels(this.b);
            this.d = null;
        }
    }

    @Override // defpackage.mtp
    public final mtu c() {
        return new mtj(this);
    }

    @Override // defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
