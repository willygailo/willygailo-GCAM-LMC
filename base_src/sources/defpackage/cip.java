package defpackage;

import java.io.PipedInputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class cip extends PipedInputStream {
    private final cjd a;
    private final nih b;

    public cip(int i, int i2) {
        super(i2);
        this.a = new cjd(i, i2);
        this.b = new nih();
    }

    public final synchronized lgp a(ByteBuffer byteBuffer, int i) {
        nih nihVar = this.b;
        byte[] bArr = nihVar.a;
        if (bArr == null) {
            nihVar.a = new byte[i];
        } else if (bArr.length != i) {
            nihVar.a = new byte[i];
        }
        byte[] bArr2 = nihVar.a;
        int i2 = read(bArr2, 0, bArr2.length);
        if (i2 <= 0) {
            return null;
        }
        long jA = this.a.a(i2);
        byteBuffer.put(bArr2, 0, i2);
        return new lgp(mro.a(byteBuffer, i2, jA));
    }

    public final synchronized void b(lgp lgpVar) {
        byte[] bArrArray = lgpVar.c().array();
        int iA = lgpVar.a();
        int i = 0;
        while (iA > 0) {
            int i2 = i + 1;
            receive(bArrArray[i]);
            notifyAll();
            int i3 = iA - 1;
            if (this.in > this.out) {
                int iMin = Math.min(i3, this.buffer.length - this.in);
                System.arraycopy(bArrArray, i2, this.buffer, this.in, iMin);
                this.in += iMin;
                i2 += iMin;
                i3 -= iMin;
                if (this.in == this.buffer.length) {
                    this.in = 0;
                }
                if (i3 == 0) {
                    break;
                }
            }
            int iMin2 = Math.min(i3, this.out - this.in);
            System.arraycopy(bArrArray, i2, this.buffer, this.in, iMin2);
            this.in += iMin2;
            iA = i3 - iMin2;
            i = i2 + iMin2;
        }
        this.a.b(lgpVar.b(), lgpVar.a());
    }
}
