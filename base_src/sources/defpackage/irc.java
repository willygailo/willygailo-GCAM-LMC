package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class irc {
    public static byte[] a;
    public static float[] b;
    public static float[] c;
    public final ByteBuffer d;
    public final ire e;
    public final enl f;
    public final kfm g;
    public final mip h;

    public irc(mip mipVar, int i, int i2, enl enlVar, kfm kfmVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        this.e = new ire(mipVar, i, i2, null, null, null, null, null, null);
        int i3 = i * i2;
        a = new byte[i3];
        b = new float[9];
        c = new float[576];
        this.f = enlVar;
        this.g = kfmVar;
        this.d = ByteBuffer.allocateDirect(i3 * 3);
        this.h = mipVar;
    }
}
