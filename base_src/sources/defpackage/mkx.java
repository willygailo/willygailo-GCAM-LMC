package defpackage;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class mkx {
    private final ByteBuffer a;
    private int b;
    private final int c;

    public mkx(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.b = byteBuffer.position() * 8;
        this.c = byteBuffer.limit() * 8;
    }

    public final void a(int i) {
        if (i > this.c || i < 0) {
            throw new IllegalArgumentException();
        }
        this.b = i;
    }

    public final void b(int i, int i2, long j) {
        if (i2 + i > this.c) {
            throw new BufferOverflowException();
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 + i;
            int i5 = (int) (j >> ((i2 - 1) - i3));
            if (i4 < 0) {
                throw new IndexOutOfBoundsException("index must be non-negative");
            }
            int i6 = i4 >> 3;
            byte b = this.a.get(i6);
            int i7 = 7 - (i4 & 7);
            this.a.put(i6, (byte) (i5 == 1 ? (1 << i7) | b : ((1 << i7) ^ (-1)) & b));
        }
    }

    public final void c() {
        b(this.b, 8, 1L);
        a(this.b + 8);
    }
}
