package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class mrj {
    public final int a;
    public final mod b;
    public final int c;
    final /* synthetic */ int d;
    final /* synthetic */ float[] e;

    public mrj(int i, mod modVar, int i2, int i3, float[] fArr) {
        this.d = i3;
        this.e = fArr;
        this.a = i;
        this.b = modVar;
        this.c = i2;
    }

    public static mrj a(float... fArr) {
        return d(fArr, 2);
    }

    public static mrj b(float... fArr) {
        return d(fArr, 4);
    }

    private static mrj d(float[] fArr, int i) {
        int length = fArr.length;
        obr.aF(length % i == 0);
        return new mrj(length / i, mop.h, i, i, fArr);
    }

    public final void c(int i, ByteBuffer byteBuffer) {
        int i2 = 0;
        while (true) {
            int i3 = this.d;
            if (i2 >= i3) {
                return;
            }
            byteBuffer.putFloat(this.e[(i3 * i) + i2]);
            i2++;
        }
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(64);
        sb.append("GLVertexData{vertexCount=");
        sb.append(i);
        sb.append(", type=");
        sb.append(i2);
        sb.append("D float32}");
        return sb.toString();
    }
}
