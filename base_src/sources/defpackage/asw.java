package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class asw {
    private static byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static byte[] b = new byte[255];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 255; i2++) {
            b[i2] = -1;
        }
        while (true) {
            byte[] bArr = a;
            int length = bArr.length;
            if (i >= 64) {
                byte[] bArr2 = b;
                bArr2[9] = -2;
                bArr2[10] = -2;
                bArr2[13] = -2;
                bArr2[32] = -2;
                bArr2[61] = -3;
                return;
            }
            b[bArr[i]] = (byte) i;
            i++;
        }
    }

    public static final byte[] a(byte[] bArr) {
        int length;
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = bArr.length;
            if (i + 3 > length) {
                break;
            }
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i] & 255) << 16) | ((bArr[i3] & 255) << 8) | (bArr[i4] & 255);
            int i7 = i2 + 1;
            byte[] bArr3 = a;
            bArr2[i2] = bArr3[i6 >> 18];
            int i8 = i7 + 1;
            bArr2[i7] = bArr3[(i6 >> 12) & 63];
            int i9 = i8 + 1;
            bArr2[i8] = bArr3[(i6 & 4032) >> 6];
            i2 = i9 + 1;
            bArr2[i9] = bArr3[i6 & 63];
            i = i5;
        }
        int i10 = length - i;
        if (i10 == 2) {
            int i11 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
            int i12 = i2 + 1;
            byte[] bArr4 = a;
            bArr2[i2] = bArr4[i11 >> 18];
            int i13 = i12 + 1;
            bArr2[i12] = bArr4[(i11 >> 12) & 63];
            bArr2[i13] = bArr4[(i11 & 4032) >> 6];
            bArr2[i13 + 1] = 61;
        } else if (i10 == 1) {
            int i14 = (bArr[i] & 255) << 16;
            int i15 = i2 + 1;
            byte[] bArr5 = a;
            bArr2[i2] = bArr5[i14 >> 18];
            int i16 = i15 + 1;
            bArr2[i15] = bArr5[(i14 >> 12) & 63];
            bArr2[i16] = 61;
            bArr2[i16 + 1] = 61;
        }
        return bArr2;
    }
}
