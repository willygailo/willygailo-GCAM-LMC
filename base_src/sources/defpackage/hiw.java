package defpackage;

import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class hiw extends hja {
    protected final lig a;
    protected final int b;
    private final ljf i;

    public hiw(hin hinVar, Executor executor, hil hilVar, int i, hsa hsaVar, lig ligVar, int i2, ljf ljfVar) {
        super(hinVar, executor, hilVar, i, hsaVar);
        this.a = ligVar;
        this.b = i2;
        this.i = ljfVar;
    }

    protected static int a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (i8 * (i5 / i3)) + (i7 * (i6 / i3)) + ((i2 / i4) * i5) + ((i / i4) * i6);
    }

    protected static final int d(int i, int i2) {
        return (Math.min(i2, i) / 2) + 1;
    }

    protected static final void f(hin hinVar) {
        hinVar.a.c();
        hinVar.a.b();
    }

    protected static final int[] g(mad madVar, Rect rect, int i, boolean z) {
        int i2;
        int iK;
        int i3;
        int iK2;
        int i4;
        int i5;
        int i6;
        int iK3;
        Rect rectI = i(madVar, rect);
        List listG = madVar.g();
        if (listG.size() != 3) {
            int size = listG.size();
            StringBuilder sb = new StringBuilder(57);
            sb.append("Incorrect number planes (");
            sb.append(size);
            sb.append(") in YUV Image Object");
            throw new IllegalArgumentException(sb.toString());
        }
        int iWidth = rectI.width() / i;
        int iHeight = rectI.height() / i;
        ByteBuffer buffer = ((mac) listG.get(0)).getBuffer();
        ByteBuffer buffer2 = ((mac) listG.get(1)).getBuffer();
        ByteBuffer buffer3 = ((mac) listG.get(2)).getBuffer();
        int rowStride = ((mac) listG.get(0)).getRowStride() * i;
        int rowStride2 = ((mac) listG.get(1)).getRowStride() * i;
        int rowStride3 = ((mac) listG.get(2)).getRowStride() * i;
        int pixelStride = ((mac) listG.get(0)).getPixelStride() * i;
        int pixelStride2 = ((mac) listG.get(1)).getPixelStride() * i;
        int pixelStride3 = ((mac) listG.get(2)).getPixelStride() * i;
        int iK4 = k(rectI.top);
        int iK5 = k(rectI.left);
        if (z) {
            int iD = d(iWidth, iHeight);
            i2 = iD * iD * 4;
            int i7 = iD + iD;
            if (iWidth > iHeight) {
                int i8 = iWidth / 2;
                iK3 = k(i8 - iD);
                iWidth = k(i8 + iD);
                i6 = 0;
            } else {
                int i9 = iHeight / 2;
                int iK6 = k(i9 - iD);
                iHeight = k(i9 + iD);
                i6 = iK6;
                iK3 = 0;
            }
            i4 = i6;
            i3 = i7;
            i5 = iK3;
            iK = iWidth;
            iK2 = iHeight;
        } else {
            i2 = iWidth * iHeight;
            iK = k(iWidth);
            i3 = iWidth;
            iK2 = k(iHeight);
            i4 = 0;
            i5 = 0;
        }
        int[] iArr = new int[i2];
        ((mac) listG.get(1)).getRowStride();
        ((mac) listG.get(1)).getPixelStride();
        ((mac) listG.get(2)).getRowStride();
        ((mac) listG.get(2)).getPixelStride();
        int i10 = i4;
        while (i10 < iK2) {
            int i11 = (i10 - i4) * i3;
            int i12 = i5;
            int i13 = i10;
            int[] iArr2 = iArr;
            int i14 = iK2;
            int i15 = iK;
            int iA = a(i12, i10, i, 1, rowStride, pixelStride, iK5, iK4);
            int i16 = iK5 / 2;
            int i17 = iK4 / 2;
            int iA2 = a(i12, i13, i, 2, rowStride2, pixelStride2, i16, i17);
            int iA3 = a(i12, i13, i, 2, rowStride3, pixelStride3, i16, i17);
            int i18 = i5;
            int i19 = iA;
            int i20 = iA2;
            while (i18 < i15) {
                int i21 = (buffer2.get(i20) & 255) - 128;
                int i22 = (buffer3.get(iA3) & 255) - 128;
                int i23 = (i22 * 358) >> 8;
                int i24 = ((i21 * (-88)) + (i22 * (-182))) >> 8;
                int i25 = (i21 * 453) >> 8;
                int i26 = buffer.get(i19) & 255;
                int i27 = i26 + i24;
                int i28 = i26 + i25;
                int i29 = i26 + i23;
                int i30 = i27 < 0 ? 0 : i27;
                if (i29 < 0) {
                    i29 = 0;
                }
                int i31 = i15;
                int i32 = i28 < 0 ? 0 : i28;
                ByteBuffer byteBuffer = buffer2;
                if (i30 > 255) {
                    i30 = 255;
                }
                if (i29 > 255) {
                    i29 = 255;
                }
                if (i32 > 255) {
                    i32 = 255;
                }
                iArr2[i11] = (i30 << 8) | (i29 << 16) | i32 | (-16777216);
                int i33 = buffer.get(i19 + pixelStride) & 255;
                int i34 = i33 + i24;
                int i35 = i33 + i25;
                int i36 = i33 + i23;
                if (i34 < 0) {
                    i34 = 0;
                }
                if (i36 < 0) {
                    i36 = 0;
                }
                if (i35 < 0) {
                    i35 = 0;
                }
                if (i34 > 255) {
                    i34 = 255;
                }
                if (i36 > 255) {
                    i36 = 255;
                }
                if (i35 > 255) {
                    i35 = 255;
                }
                iArr2[i11 + 1] = (i36 << 16) | (i34 << 8) | i35 | (-16777216);
                int i37 = i19 + rowStride;
                int i38 = buffer.get(i37) & 255;
                int i39 = i38 + i24;
                int i40 = i38 + i25;
                int i41 = i38 + i23;
                if (i39 < 0) {
                    i39 = 0;
                }
                if (i41 < 0) {
                    i41 = 0;
                }
                if (i40 < 0) {
                    i40 = 0;
                }
                ByteBuffer byteBuffer2 = buffer3;
                if (i39 > 255) {
                    i39 = 255;
                }
                if (i41 > 255) {
                    i41 = 255;
                }
                if (i40 > 255) {
                    i40 = 255;
                }
                int i42 = i11 + i3;
                iArr2[i42] = (i41 << 16) | (i39 << 8) | i40 | (-16777216);
                int i43 = buffer.get(i37 + pixelStride) & 255;
                int i44 = i24 + i43;
                int i45 = i25 + i43;
                int i46 = i43 + i23;
                int i47 = i44 < 0 ? 0 : i44;
                if (i46 < 0) {
                    i46 = 0;
                }
                if (i45 < 0) {
                    i45 = 0;
                }
                if (i47 > 255) {
                    i47 = 255;
                }
                if (i46 > 255) {
                    i46 = 255;
                }
                if (i45 > 255) {
                    i45 = 255;
                }
                iArr2[i42 + 1] = i45 | (i46 << 16) | (i47 << 8) | (-16777216);
                i18 += 2;
                i19 += pixelStride + pixelStride;
                i11 += 2;
                i20 += pixelStride2;
                iA3 += pixelStride3;
                i15 = i31;
                buffer2 = byteBuffer;
                buffer3 = byteBuffer2;
            }
            i10 = i13 + 2;
            iArr = iArr2;
            iK2 = i14;
            iK = i15;
        }
        return iArr;
    }

    private static int k(int i) {
        int i2 = i / 2;
        return i2 + i2;
    }

    protected final hix b(hin hinVar, int i) {
        int iWidth;
        int iHeight;
        Rect rectI = i(hinVar.a, hinVar.e);
        if (this.b == 5) {
            iWidth = rectI.width() / i;
            iHeight = rectI.height() / i;
        } else {
            int iD = d(rectI.width() / i, rectI.height() / i);
            iWidth = iD + iD;
            iHeight = iWidth;
        }
        return new hix(hinVar.b, iWidth, iHeight);
    }

    protected final int[] c(mad madVar, Rect rect, int i) {
        int iK;
        int iK2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ByteBuffer byteBuffer;
        int i7 = 0;
        switch (this.b - 1) {
            case 2:
                Rect rectI = i(madVar, rect);
                List listG = madVar.g();
                if (listG.size() != 3) {
                    int size = listG.size();
                    StringBuilder sb = new StringBuilder(57);
                    sb.append("Incorrect number planes (");
                    sb.append(size);
                    sb.append(") in YUV Image Object");
                    throw new IllegalArgumentException(sb.toString());
                }
                int iWidth = rectI.width() / i;
                int iHeight = rectI.height() / i;
                int iD = d(iWidth, iHeight);
                int iK3 = k(rectI.top);
                int iK4 = k(rectI.left);
                if (iWidth > iHeight) {
                    int i8 = iWidth / 2;
                    int iK5 = k(i8 - iD);
                    iK2 = k(i8 + iD);
                    iK = iHeight;
                    i3 = iK5;
                    i2 = 0;
                } else {
                    int i9 = iHeight / 2;
                    int iK6 = k(i9 - iD);
                    iK = k(i9 + iD);
                    iK2 = iWidth;
                    i2 = iK6;
                    i3 = 0;
                }
                ByteBuffer buffer = ((mac) listG.get(0)).getBuffer();
                ByteBuffer buffer2 = ((mac) listG.get(1)).getBuffer();
                ByteBuffer buffer3 = ((mac) listG.get(2)).getBuffer();
                int rowStride = ((mac) listG.get(0)).getRowStride() * i;
                int rowStride2 = ((mac) listG.get(1)).getRowStride() * i;
                int rowStride3 = ((mac) listG.get(2)).getRowStride() * i;
                int pixelStride = ((mac) listG.get(0)).getPixelStride() * i;
                int pixelStride2 = ((mac) listG.get(1)).getPixelStride() * i;
                int pixelStride3 = ((mac) listG.get(2)).getPixelStride() * i;
                int i10 = iD + iD;
                int i11 = iHeight / 2;
                int i12 = iWidth / 2;
                int i13 = iD * iD;
                int[] iArr = new int[i13 * 4];
                ((mac) listG.get(1)).getRowStride();
                ((mac) listG.get(1)).getPixelStride();
                ((mac) listG.get(2)).getRowStride();
                ((mac) listG.get(2)).getPixelStride();
                int i14 = i2;
                while (i14 < iK) {
                    int i15 = (i14 - i2) * i10;
                    int i16 = i3;
                    ByteBuffer byteBuffer2 = buffer3;
                    int i17 = i14;
                    int[] iArr2 = iArr;
                    ByteBuffer byteBuffer3 = buffer2;
                    ByteBuffer byteBuffer4 = buffer;
                    int iA = a(i16, i14, i, 1, rowStride, pixelStride, iK4, iK3);
                    int i18 = iK4 / 2;
                    int i19 = iK3 / 2;
                    int iA2 = a(i16, i17, i, 2, rowStride2, pixelStride2, i18, i19);
                    int iA3 = a(i16, i17, i, 2, rowStride3, pixelStride3, i18, i19);
                    int i20 = i17 - i11;
                    int iSqrt = (int) (Math.sqrt(i13 - (i20 * i20)) + 0.5d);
                    int i21 = i12 - iSqrt;
                    int i22 = i12 + iSqrt;
                    int i23 = (i17 + 1) - i11;
                    int iSqrt2 = (int) (Math.sqrt(i13 - (i23 * i23)) + 0.5d);
                    int i24 = i12 - iSqrt2;
                    int i25 = i12 + iSqrt2;
                    int i26 = i3;
                    int i27 = iA;
                    int i28 = iA2;
                    while (i26 < iK2) {
                        if ((i26 <= i22 || i26 <= i25) && ((i4 = i26 + 1) >= i21 || i26 >= i24)) {
                            int i29 = (byteBuffer3.get(i28) & 255) - 128;
                            i5 = iK3;
                            i6 = iK4;
                            byteBuffer = byteBuffer2;
                            int i30 = (byteBuffer.get(iA3) & 255) - 128;
                            int i31 = (i30 * 358) >> 8;
                            int i32 = ((i29 * (-88)) + (i30 * (-182))) >> 8;
                            int i33 = (i29 * 453) >> 8;
                            int i34 = -16777216;
                            if (i26 > i22 || i26 < i21) {
                                iArr2[i15] = 0;
                            } else {
                                int i35 = (i26 == i22 || i26 == i21) ? Integer.MIN_VALUE : -16777216;
                                byteBuffer = byteBuffer;
                                byteBuffer4 = byteBuffer4;
                                iK = iK;
                                iK2 = iK2;
                                int i36 = byteBuffer4.get(i27) & 255;
                                int i37 = i36 + i32;
                                int i38 = i36 + i33;
                                int i39 = i36 + i31;
                                if (i37 < 0) {
                                    i37 = 0;
                                }
                                if (i39 < 0) {
                                    i39 = 0;
                                }
                                int i40 = i38 < 0 ? 0 : i38;
                                iA3 = iA3;
                                if (i37 > 255) {
                                    i37 = 255;
                                }
                                if (i39 > 255) {
                                    i39 = 255;
                                }
                                if (i40 > 255) {
                                    i40 = 255;
                                }
                                iArr2[i15] = (i39 << 16) | (i37 << 8) | i40 | i35;
                            }
                            if (i4 > i22 || i4 < i21) {
                                iArr2[i15 + 1] = 0;
                            } else {
                                int i41 = (i4 == i22 || i4 == i21) ? Integer.MIN_VALUE : -16777216;
                                int i42 = byteBuffer4.get(i27 + pixelStride) & 255;
                                int i43 = i42 + i32;
                                int i44 = i42 + i33;
                                int i45 = i42 + i31;
                                if (i43 < 0) {
                                    i43 = 0;
                                }
                                if (i45 < 0) {
                                    i45 = 0;
                                }
                                if (i44 < 0) {
                                    i44 = 0;
                                }
                                i22 = i22;
                                if (i43 > 255) {
                                    i43 = 255;
                                }
                                if (i45 > 255) {
                                    i45 = 255;
                                }
                                if (i44 > 255) {
                                    i44 = 255;
                                }
                                iArr2[i15 + 1] = i41 | (i45 << 16) | (i43 << 8) | i44;
                            }
                            if (i26 > i25 || i26 < i24) {
                                iArr2[i15 + i10] = 0;
                            } else {
                                int i46 = (i26 == i25 || i26 == i24) ? Integer.MIN_VALUE : -16777216;
                                int i47 = byteBuffer4.get(i27 + rowStride) & 255;
                                int i48 = i47 + i32;
                                int i49 = i47 + i33;
                                int i50 = i47 + i31;
                                if (i48 < 0) {
                                    i48 = 0;
                                }
                                if (i50 < 0) {
                                    i50 = 0;
                                }
                                if (i49 < 0) {
                                    i49 = 0;
                                }
                                if (i48 > 255) {
                                    i48 = 255;
                                }
                                if (i50 > 255) {
                                    i50 = 255;
                                }
                                if (i49 > 255) {
                                    i49 = 255;
                                }
                                iArr2[i15 + i10] = i46 | (i50 << 16) | (i48 << 8) | i49;
                            }
                            if (i4 > i25 || i4 < i24) {
                                iArr2[i15 + i10 + 1] = 0;
                            } else {
                                if (i4 == i25 || i4 == i24) {
                                    i34 = Integer.MIN_VALUE;
                                }
                                int i51 = byteBuffer4.get(i27 + rowStride + pixelStride) & 255;
                                int i52 = i51 + i32;
                                int i53 = i51 + i33;
                                int i54 = i51 + i31;
                                if (i52 < 0) {
                                    i52 = 0;
                                }
                                if (i54 < 0) {
                                    i54 = 0;
                                }
                                if (i53 < 0) {
                                    i53 = 0;
                                }
                                if (i52 > 255) {
                                    i52 = 255;
                                }
                                if (i54 > 255) {
                                    i54 = 255;
                                }
                                iArr2[i15 + i10 + 1] = (i54 << 16) | (i52 << 8) | (i53 > 255 ? 255 : i53) | i34;
                            }
                        } else {
                            iArr2[i15] = i7;
                            iArr2[i15 + 1] = i7;
                            int i55 = i15 + i10;
                            iArr2[i55] = i7;
                            iArr2[i55 + 1] = i7;
                            iA3 = iA3;
                            i22 = i22;
                            i5 = iK3;
                            i6 = iK4;
                            iK2 = iK2;
                            byteBuffer = byteBuffer2;
                            byteBuffer4 = byteBuffer4;
                            iK = iK;
                        }
                        i26 += 2;
                        i27 += pixelStride + pixelStride;
                        i15 += 2;
                        i28 += pixelStride2;
                        iA3 += pixelStride3;
                        iK4 = i6;
                        iK = iK;
                        i22 = i22;
                        byteBuffer2 = byteBuffer;
                        iK2 = iK2;
                        i7 = 0;
                        byteBuffer4 = byteBuffer4;
                        iK3 = i5;
                    }
                    i14 = i17 + 2;
                    buffer = byteBuffer4;
                    iArr = iArr2;
                    buffer2 = byteBuffer3;
                    buffer3 = byteBuffer2;
                    i7 = 0;
                    iK3 = iK3;
                }
                return iArr;
            case 3:
                return g(madVar, rect, i, true);
            default:
                return g(madVar, rect, i, false);
        }
    }

    public final void e(hix hixVar, int[] iArr, int i) {
        ((hia) this.c).k.a(new hiy(this.e, hixVar, i), new hiz(iArr));
    }

    @Override // java.lang.Runnable
    public void run() {
        this.i.e("CAM_TaskRGBPreview");
        hin hinVar = this.f;
        Rect rectI = i(hinVar.a, hinVar.e);
        f(hinVar);
        lig ligVar = new lig(rectI.width(), rectI.height());
        int i = this.b;
        int iT = 2;
        if (i == 3 || i == 4) {
            lig ligVar2 = this.a;
            int iMin = Math.min(ligVar.a / ligVar2.a, ligVar.b / ligVar2.b);
            if (iMin > 0) {
                int iMin2 = Math.min(ligVar.a, ligVar.b);
                while (iMin >= 2) {
                    if (fcy.u(iMin2, iMin)) {
                        iT = iMin;
                        break;
                    }
                    iMin--;
                }
            } else {
                iT = 1;
            }
        } else {
            iT = fcy.t(ligVar, this.a);
        }
        hix hixVarB = b(hinVar, iT);
        try {
            j(this.e, hixVarB, 1);
            hinVar.a.c();
            hinVar.a.b();
            int[] iArrC = c(hinVar.a, rectI, iT);
            this.c.b(hinVar.a, this.d);
            e(hixVarB, iArrC, 1);
            this.i.f();
        } catch (Throwable th) {
            this.c.b(hinVar.a, this.d);
            throw th;
        }
    }
}
