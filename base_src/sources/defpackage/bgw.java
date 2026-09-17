package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class bgw implements azg {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final int e(bgu bguVar, bct bctVar) {
        int iA;
        short sE;
        ByteOrder byteOrder;
        short sE2;
        int iD;
        int i;
        int i2;
        try {
            int iA2 = bguVar.a();
            if ((iA2 & 65496) != 65496 && iA2 != 19789 && iA2 != 18761) {
                return -1;
            }
            while (true) {
                if (bguVar.d() != 255) {
                    iA = -1;
                    break;
                }
                short sD = bguVar.d();
                if (sD != 218 && sD != 217) {
                    iA = bguVar.a() - 2;
                    if (sD == 225) {
                        break;
                    }
                    long j = iA;
                    if (bguVar.c(j) != j) {
                        iA = -1;
                        break;
                    }
                } else {
                    iA = -1;
                    break;
                }
            }
            if (iA == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) bctVar.a(iA, byte[].class);
            try {
                if (bguVar.b(bArr, iA) == iA && iA > a.length) {
                    int i3 = 0;
                    while (true) {
                        byte[] bArr2 = a;
                        if (i3 >= bArr2.length) {
                            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(iA);
                            switch (wk.e(6, byteBuffer)) {
                                case 18761:
                                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                                    break;
                                case 19789:
                                    byteOrder = ByteOrder.BIG_ENDIAN;
                                    break;
                                default:
                                    byteOrder = ByteOrder.BIG_ENDIAN;
                                    break;
                            }
                            byteBuffer.order(byteOrder);
                            int iD2 = wk.d(10, byteBuffer) + 6;
                            short sE3 = wk.e(iD2, byteBuffer);
                            for (int i4 = 0; i4 < sE3; i4++) {
                                int i5 = iD2 + 2 + (i4 * 12);
                                if (wk.e(i5, byteBuffer) == 274 && (sE2 = wk.e(i5 + 2, byteBuffer)) > 0 && sE2 <= 12 && (iD = wk.d(i5 + 4, byteBuffer)) >= 0 && (i = iD + b[sE2]) <= 4 && (i2 = i5 + 8) >= 0 && i2 <= byteBuffer.remaining() && i >= 0 && i + i2 <= byteBuffer.remaining()) {
                                    sE = wk.e(i2, byteBuffer);
                                }
                            }
                            sE = -1;
                        } else {
                            if (bArr[i3] != bArr2[i3]) {
                                sE = -1;
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    sE = -1;
                }
                return sE;
            } finally {
                bctVar.c(bArr);
            }
        } catch (bgt e) {
            return -1;
        }
    }

    private static final ImageHeaderParser$ImageType f(bgu bguVar) {
        try {
            int iA = bguVar.a();
            if (iA == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iD = (iA << 8) | bguVar.d();
            if (iD == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iD2 = (iD << 8) | bguVar.d();
            if (iD2 == -1991225785) {
                bguVar.c(21L);
                try {
                    return bguVar.d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (bgt e) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iD2 != 1380533830) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            bguVar.c(4L);
            if (((bguVar.a() << 16) | bguVar.a()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iA2 = (bguVar.a() << 16) | bguVar.a();
            if ((iA2 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i = iA2 & 255;
            if (i == 88) {
                bguVar.c(4L);
                return (bguVar.d() & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (i != 76) {
                return ImageHeaderParser$ImageType.WEBP;
            }
            bguVar.c(4L);
            return (bguVar.d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
        } catch (bgt e2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    @Override // defpackage.azg
    public final int a(InputStream inputStream, bct bctVar) {
        aae.s(inputStream);
        bgv bgvVar = new bgv(inputStream);
        aae.s(bctVar);
        return e(bgvVar, bctVar);
    }

    @Override // defpackage.azg
    public final int b(ByteBuffer byteBuffer, bct bctVar) {
        aae.s(byteBuffer);
        bgs bgsVar = new bgs(byteBuffer);
        aae.s(bctVar);
        return e(bgsVar, bctVar);
    }

    @Override // defpackage.azg
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        aae.s(inputStream);
        return f(new bgv(inputStream));
    }

    @Override // defpackage.azg
    public final ImageHeaderParser$ImageType d(ByteBuffer byteBuffer) {
        aae.s(byteBuffer);
        return f(new bgs(byteBuffer));
    }
}
