package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class llw {
    public byte[] a = new byte[1];
    public int b = 0;
    public int c = 0;

    public final int a() {
        return this.c - this.b;
    }

    public final void b(int i) {
        byte[] bArr = this.a;
        int length = bArr.length;
        int i2 = this.c;
        if (length - i2 < i) {
            int i3 = this.b;
            int i4 = i2 - i3;
            int i5 = i + i4;
            if (i5 > length || i5 <= (length >> 1)) {
                byte[] bArr2 = new byte[i5];
                if (i4 > 0) {
                    System.arraycopy(bArr, i3, bArr2, 0, i4);
                }
                this.a = bArr2;
            } else if (i4 > 0) {
                System.arraycopy(bArr, i3, bArr, 0, i4);
            }
            this.b = 0;
            this.c = i4;
        }
    }

    public final void c(OutputStream outputStream, int i) throws IOException {
        int i2 = this.b;
        if (i2 + i > this.c) {
            throw new IllegalStateException("Byte queue is too short");
        }
        outputStream.write(this.a, i2, i);
        this.b += i;
    }

    public final void d(int i) {
        int i2 = this.b + i;
        if (i2 > this.c) {
            throw new IllegalStateException("Byte queue is too short");
        }
        this.b = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ByteDeque [ ");
        for (int i = 0; i <= this.a.length; i++) {
            if (i == this.b) {
                sb.append("{ ");
            }
            if (i == this.c) {
                sb.append("} ");
            }
            byte[] bArr = this.a;
            if (i < bArr.length) {
                sb.append(String.format("%02X ", Byte.valueOf(bArr[i])));
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
