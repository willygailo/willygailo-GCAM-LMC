package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class mtm implements mtn {
    private final mtn a;
    private final /* synthetic */ int b;

    public mtm(mtn mtnVar, int i) {
        this.b = i;
        this.a = mtnVar;
    }

    private static int b(int i, int i2, int i3) {
        return Math.max(Math.max(i, i2), i3);
    }

    private static int c(int i, int i2, int i3) {
        return Math.min(Math.min(i, i2), i3);
    }

    private final void d(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (a(byteBuffer, byteBuffer2)) {
            return;
        }
        String strValueOf = String.valueOf(byteBuffer);
        String strValueOf2 = String.valueOf(byteBuffer2);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 56 + String.valueOf(strValueOf2).length());
        sb.append("MemCopier does not support copying from buffer '");
        sb.append(strValueOf);
        sb.append("' to '");
        sb.append(strValueOf2);
        sb.append("'!");
        throw new IllegalArgumentException(sb.toString());
    }

    private static void e(int i, int i2) {
        int i3;
        if (i2 < 0) {
            i3 = -i2;
        } else {
            i3 = i2;
            i2 = 0;
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(58);
            sb.append("Attempting to copy from negative buffer index ");
            sb.append(i2);
            sb.append("!");
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        if (i >= i3) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(86);
        sb2.append("Attempting to copy ");
        sb2.append(i3);
        sb2.append(" bytes at offset 0 on ");
        sb2.append(i);
        sb2.append("-byte buffer!");
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // defpackage.mtn
    public final boolean a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        switch (this.b) {
            case 0:
                break;
        }
        return this.a.a(byteBuffer, byteBuffer2);
    }

    @Override // defpackage.mtn
    public final void copyBytes(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3) {
        switch (this.b) {
            case 0:
                this.a.copyBytes(byteBuffer, byteBuffer2, 0, 0, i3);
                break;
            default:
                d(byteBuffer, byteBuffer2);
                int iCapacity = byteBuffer.capacity();
                int iCapacity2 = byteBuffer2.capacity();
                e(iCapacity, i3);
                e(iCapacity2, i3);
                this.a.copyBytes(byteBuffer, byteBuffer2, 0, 0, i3);
                break;
        }
    }

    @Override // defpackage.mtn
    public final void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6) {
        switch (this.b) {
            case 0:
                if (i5 == i6 && i5 == i) {
                    copyBytes(byteBuffer, byteBuffer2, 0, 0, i5 * i2);
                }
                this.a.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, i6);
                break;
            default:
                d(byteBuffer, byteBuffer2);
                int iCapacity = byteBuffer.capacity();
                int iCapacity2 = byteBuffer2.capacity();
                e(iCapacity, i2 * i5);
                e(iCapacity2, i2 * i6);
                this.a.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, i6);
                break;
        }
    }

    @Override // defpackage.mtn
    public final void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.b) {
            case 0:
                if (i5 != 1) {
                    this.a.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, 1, i7, i8);
                } else {
                    copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i7, i8);
                }
                break;
            default:
                d(byteBuffer, byteBuffer2);
                int iCapacity = byteBuffer.capacity();
                int iCapacity2 = byteBuffer2.capacity();
                int i9 = i - 1;
                int i10 = i5 * i9;
                int i11 = i2 - 1;
                int i12 = i7 * i11;
                int i13 = i12 + i10;
                int iC = c(i10, i12, i13);
                int iB = b(i10, i12, i13);
                e(iCapacity, iC);
                e(iCapacity, iB);
                int i14 = i8 * i11;
                int i15 = i14 + i9;
                int iC2 = c(i9, i14, i15);
                int iB2 = b(i9, i14, i15);
                e(iCapacity2, iC2);
                e(iCapacity2, iB2);
                this.a.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, 1, i7, i8);
                break;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                String strValueOf = String.valueOf(this.a);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
                sb.append("greedy[");
                sb.append(strValueOf);
                sb.append("]");
                return sb.toString();
            default:
                String strValueOf2 = String.valueOf(this.a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 9);
                sb2.append("checked[");
                sb2.append(strValueOf2);
                sb2.append("]");
                return sb2.toString();
        }
    }
}
