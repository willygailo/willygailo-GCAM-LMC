package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class mtk implements mtn {
    private final /* synthetic */ int a;

    public mtk(int i) {
        this.a = i;
    }

    private static final void b(ByteBuffer byteBuffer, int i, int i2) {
    }

    @Override // defpackage.mtn
    public final boolean a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        switch (this.a) {
            default:
                if (!byteBuffer.hasArray() || !byteBuffer2.hasArray()) {
                    return false;
                }
            case 0:
                return true;
        }
    }

    @Override // defpackage.mtn
    public final void copyBytes(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                b(byteBufferDuplicate, 0, i3);
                ByteBuffer byteBufferDuplicate2 = byteBuffer2.duplicate();
                b(byteBufferDuplicate2, 0, i3);
                byteBufferDuplicate2.put(byteBufferDuplicate);
                break;
            default:
                byteBuffer2.put(byteBuffer.array(), 0, i3);
                break;
        }
    }

    @Override // defpackage.mtn
    public final void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        switch (this.a) {
            case 0:
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                ByteBuffer byteBufferDuplicate2 = byteBuffer2.duplicate();
                int i8 = 0;
                int i9 = 0;
                while (i7 < i2) {
                    b(byteBufferDuplicate, i8, i);
                    b(byteBufferDuplicate2, i9, i);
                    byteBufferDuplicate2.put(byteBufferDuplicate);
                    i8 += i5;
                    i9 += i6;
                    i7++;
                }
                break;
            default:
                int i10 = 0;
                while (i7 < i2) {
                    byteBuffer2.put(byteBuffer.array(), i10, i5);
                    i10 += i5;
                    i7++;
                }
                break;
        }
    }

    @Override // defpackage.mtn
    public final void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                for (int i9 = 0; i9 < i2; i9++) {
                    int i10 = i7 * i9;
                    int i11 = i8 * i9;
                    for (int i12 = 0; i12 < i; i12++) {
                        byteBuffer2.put(i11, byteBuffer.get(i10));
                        i10 += i5;
                        i11++;
                    }
                }
                break;
            default:
                byte[] bArrArray = byteBuffer.array();
                byte[] bArrArray2 = byteBuffer2.array();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < i2; i15++) {
                    int i16 = i13;
                    int i17 = i14;
                    for (int i18 = 0; i18 < i; i18++) {
                        bArrArray2[i17] = bArrArray[i16];
                        i16 += i5;
                        i17++;
                    }
                    i13 += i7;
                    i14 += i8;
                }
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                break;
        }
        return getClass().getSimpleName();
    }
}
