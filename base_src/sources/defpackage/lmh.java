package defpackage;

import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class lmh extends lmm {
    public static final /* synthetic */ int a = 0;
    private static final byte[] f = {69, 120, 105, 102, 0, 0};
    private static final byte[] g = {73, 67, 67, 95, 80, 82, 79, 70, 73, 76, 69, 0};
    private final lly h;
    private final ExifInterface i;
    private short j;
    private short k;
    private int l;
    private boolean m;

    public lmh(OutputStream outputStream, ExifInterface exifInterface, lly llyVar) {
        super(outputStream, new llw());
        this.j = (short) 0;
        this.k = (short) 0;
        this.l = 0;
        this.m = true;
        this.i = exifInterface;
        this.h = llyVar;
    }

    private static void k(int i, short s) {
        if (i < 0) {
            throw new IllegalStateException(String.format("Negative section length: section length read was 0x%02X%02X", Integer.valueOf((s >> 8) & 255), Integer.valueOf(s & 255)));
        }
    }

    private static void l(lmg lmgVar, lmk lmkVar) throws IOException {
        short s = lmgVar.b;
        int i = 0;
        switch (s) {
            case 1:
            case 7:
                int i2 = lmgVar.d;
                byte[] bArr = new byte[i2];
                if (s != 7 && s != 1) {
                    String strC = lmg.c(s);
                    throw new IllegalArgumentException(strC.length() != 0 ? "Cannot get BYTE value from ".concat(strC) : new String("Cannot get BYTE value from "));
                }
                Object obj = lmgVar.f;
                obj.getClass();
                System.arraycopy(obj, 0, bArr, 0, i2);
                lmkVar.write(bArr);
                return;
            case 2:
                Object obj2 = lmgVar.f;
                obj2.getClass();
                byte[] bArr2 = (byte[]) obj2;
                int length = bArr2.length;
                if (length != lmgVar.d || length <= 0) {
                    lmkVar.write(bArr2);
                    lmkVar.write(0);
                    return;
                } else {
                    bArr2[length - 1] = 0;
                    lmkVar.write(bArr2);
                    return;
                }
            case 3:
                int i3 = lmgVar.d;
                while (i < i3) {
                    lmkVar.b((short) lmgVar.b(i));
                    i++;
                }
                return;
            case 4:
            case 9:
                int i4 = lmgVar.d;
                while (i < i4) {
                    lmkVar.a((int) lmgVar.b(i));
                    i++;
                }
                return;
            case 5:
            case 10:
                int i5 = lmgVar.d;
                while (i < i5) {
                    short s2 = lmgVar.b;
                    if (s2 != 10 && s2 != 5) {
                        String strC2 = lmg.c(s2);
                        throw new IllegalArgumentException(strC2.length() != 0 ? "Cannot get RATIONAL value from ".concat(strC2) : new String("Cannot get RATIONAL value from "));
                    }
                    Object obj3 = lmgVar.f;
                    obj3.getClass();
                    lid lidVar = ((lid[]) obj3)[i];
                    lmkVar.a((int) lidVar.a);
                    lmkVar.a((int) lidVar.b);
                    i++;
                }
                return;
            case 6:
            case 8:
            default:
                return;
        }
    }

    private static final int m(lmj lmjVar, int i) {
        int iA = i + (lmjVar.a() * 12) + 6;
        for (lmg lmgVar : lmjVar.d()) {
            if (lmgVar != null && lmgVar.a() > 4) {
                lmgVar.g = iA;
                iA += lmgVar.a();
            }
        }
        return iA;
    }

    private static final void n(lmj lmjVar, lmk lmkVar) throws IOException {
        lmg[] lmgVarArrD = lmjVar.d();
        lmkVar.b((short) lmgVarArrD.length);
        for (lmg lmgVar : lmgVarArrD) {
            if (lmgVar != null) {
                lmkVar.b(lmgVar.a);
                lmkVar.b(lmgVar.b);
                lmkVar.a(lmgVar.d);
                if (lmgVar.a() > 4) {
                    lmkVar.a(lmgVar.g);
                } else {
                    l(lmgVar, lmkVar);
                    int iA = 4 - lmgVar.a();
                    for (int i = 0; i < iA; i++) {
                        lmkVar.write(0);
                    }
                }
            }
        }
        lmkVar.a(lmjVar.c);
        for (lmg lmgVar2 : lmgVarArrD) {
            if (lmgVar2 != null && lmgVar2.a() > 4) {
                l(lmgVar2, lmkVar);
            }
        }
    }

    @Override // defpackage.lmm
    protected final int a(int i) throws lml, IOException {
        lly llyVar;
        int iM;
        switch (i) {
            case 0:
                short sB = b(0);
                this.j = sB;
                if ((sB & (-256)) != -256) {
                    throw new IllegalStateException(String.format("Unexpected section marker: %02X%02X", Integer.valueOf((sB >> 8) & 255), Integer.valueOf(this.j & 255)));
                }
                if (sB == -40 || sB == -39) {
                    h(sB);
                    if (this.j == -40 && (llyVar = this.h) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (lmg lmgVar : llyVar.c()) {
                            if (lmgVar.f == null && !ExifInterface.t(lmgVar.a)) {
                                llyVar.h(lmgVar.a, lmgVar.e);
                                arrayList.add(lmgVar);
                            }
                        }
                        lmj lmjVarB = this.h.b(0);
                        if (lmjVarB == null) {
                            lmjVarB = new lmj(0);
                            this.h.d(lmjVarB);
                        }
                        lmg lmgVarJ = this.i.j(ExifInterface.B);
                        if (lmgVarJ == null) {
                            int i2 = ExifInterface.B;
                            StringBuilder sb = new StringBuilder(47);
                            sb.append("No definition for crucial exif tag: ");
                            sb.append(i2);
                            throw new IOException(sb.toString());
                        }
                        lmjVarB.e(lmgVarJ);
                        lmj lmjVarB2 = this.h.b(2);
                        if (lmjVarB2 == null) {
                            lmjVarB2 = new lmj(2);
                            this.h.d(lmjVarB2);
                        }
                        if (this.h.b(4) != null) {
                            lmg lmgVarJ2 = this.i.j(ExifInterface.C);
                            if (lmgVarJ2 == null) {
                                int i3 = ExifInterface.C;
                                StringBuilder sb2 = new StringBuilder(47);
                                sb2.append("No definition for crucial exif tag: ");
                                sb2.append(i3);
                                throw new IOException(sb2.toString());
                            }
                            lmjVarB.e(lmgVarJ2);
                        }
                        if (this.h.b(3) != null) {
                            lmg lmgVarJ3 = this.i.j(ExifInterface.al);
                            if (lmgVarJ3 == null) {
                                int i4 = ExifInterface.al;
                                StringBuilder sb3 = new StringBuilder(47);
                                sb3.append("No definition for crucial exif tag: ");
                                sb3.append(i4);
                                throw new IOException(sb3.toString());
                            }
                            lmjVarB2.e(lmgVarJ3);
                        }
                        lmj lmjVarB3 = this.h.b(1);
                        if (this.h.f()) {
                            if (lmjVarB3 == null) {
                                lmjVarB3 = new lmj(1);
                                this.h.d(lmjVarB3);
                            }
                            lmg lmgVarJ4 = this.i.j(ExifInterface.D);
                            if (lmgVarJ4 == null) {
                                int i5 = ExifInterface.D;
                                StringBuilder sb4 = new StringBuilder(47);
                                sb4.append("No definition for crucial exif tag: ");
                                sb4.append(i5);
                                throw new IOException(sb4.toString());
                            }
                            lmjVarB3.e(lmgVarJ4);
                            lmg lmgVarJ5 = this.i.j(ExifInterface.E);
                            if (lmgVarJ5 == null) {
                                int i6 = ExifInterface.E;
                                StringBuilder sb5 = new StringBuilder(47);
                                sb5.append("No definition for crucial exif tag: ");
                                sb5.append(i6);
                                throw new IOException(sb5.toString());
                            }
                            byte[] bArr = this.h.b;
                            bArr.getClass();
                            lmgVarJ5.h(bArr.length);
                            lmjVarB3.e(lmgVarJ5);
                            lmjVarB3.c(ExifInterface.n(ExifInterface.i));
                            lmjVarB3.c(ExifInterface.n(ExifInterface.m));
                        } else if (this.h.g()) {
                            if (lmjVarB3 == null) {
                                lmjVarB3 = new lmj(1);
                                this.h.d(lmjVarB3);
                            }
                            int iA = this.h.a();
                            lmg lmgVarJ6 = this.i.j(ExifInterface.i);
                            if (lmgVarJ6 == null) {
                                int i7 = ExifInterface.i;
                                StringBuilder sb6 = new StringBuilder(47);
                                sb6.append("No definition for crucial exif tag: ");
                                sb6.append(i7);
                                throw new IOException(sb6.toString());
                            }
                            lmg lmgVarJ7 = this.i.j(ExifInterface.m);
                            if (lmgVarJ7 == null) {
                                int i8 = ExifInterface.m;
                                StringBuilder sb7 = new StringBuilder(47);
                                sb7.append("No definition for crucial exif tag: ");
                                sb7.append(i8);
                                throw new IOException(sb7.toString());
                            }
                            long[] jArr = new long[iA];
                            for (int i9 = 0; i9 < this.h.a(); i9++) {
                                jArr[i9] = this.h.i(i9).length;
                            }
                            lmgVarJ7.l(jArr);
                            lmjVarB3.e(lmgVarJ6);
                            lmjVarB3.e(lmgVarJ7);
                            lmjVarB3.c(ExifInterface.n(ExifInterface.D));
                            lmjVarB3.c(ExifInterface.n(ExifInterface.E));
                        } else if (lmjVarB3 != null) {
                            lmjVarB3.c(ExifInterface.n(ExifInterface.i));
                            lmjVarB3.c(ExifInterface.n(ExifInterface.m));
                            lmjVarB3.c(ExifInterface.n(ExifInterface.D));
                            lmjVarB3.c(ExifInterface.n(ExifInterface.E));
                        }
                        ArrayList arrayList2 = new ArrayList(this.h.c());
                        if (this.h.f()) {
                            byte[] bArr2 = this.h.b;
                            bArr2.getClass();
                            arrayList2.add(new lmg((short) 0, (short) 1, bArr2.length, 0, false));
                        }
                        Collections.sort(arrayList2, cdg.p);
                        lmj lmjVarB4 = this.h.b(0);
                        if (lmjVarB4 == null) {
                            iM = 8;
                        } else {
                            iM = m(lmjVarB4, 8);
                            lmg lmgVarB = lmjVarB4.b(ExifInterface.n(ExifInterface.B));
                            lmgVarB.getClass();
                            lmgVarB.h(iM);
                            lmj lmjVarB5 = this.h.b(2);
                            if (lmjVarB5 != null) {
                                iM = m(lmjVarB5, iM);
                                lmj lmjVarB6 = this.h.b(3);
                                if (lmjVarB6 != null) {
                                    lmg lmgVarB2 = lmjVarB5.b(ExifInterface.n(ExifInterface.al));
                                    lmgVarB2.getClass();
                                    lmgVarB2.h(iM);
                                    iM = m(lmjVarB6, iM);
                                }
                                lmj lmjVarB7 = this.h.b(4);
                                if (lmjVarB7 != null) {
                                    lmg lmgVarB3 = lmjVarB4.b(ExifInterface.n(ExifInterface.C));
                                    lmgVarB3.getClass();
                                    lmgVarB3.h(iM);
                                    iM = m(lmjVarB7, iM);
                                }
                                lmj lmjVarB8 = this.h.b(1);
                                if (lmjVarB8 != null) {
                                    lmjVarB4.c = iM;
                                    iM = m(lmjVarB8, iM);
                                }
                                if (this.h.f()) {
                                    if (lmjVarB8 != null) {
                                        lmg lmgVarB4 = lmjVarB8.b(ExifInterface.n(ExifInterface.D));
                                        lmgVarB4.getClass();
                                        lmgVarB4.h(iM);
                                    }
                                    byte[] bArr3 = this.h.b;
                                    bArr3.getClass();
                                    iM += bArr3.length;
                                } else if (this.h.g()) {
                                    long[] jArr2 = new long[this.h.a()];
                                    for (int i10 = 0; i10 < this.h.a(); i10++) {
                                        jArr2[i10] = iM;
                                        iM += this.h.i(i10).length;
                                    }
                                    if (lmjVarB8 != null) {
                                        lmg lmgVarB5 = lmjVarB8.b(ExifInterface.n(ExifInterface.i));
                                        lmgVarB5.getClass();
                                        lmgVarB5.l(jArr2);
                                    }
                                }
                            }
                        }
                        for (int i11 = 0; i11 < arrayList2.size() && iM > 65535; i11++) {
                            lmg lmgVar2 = (lmg) arrayList2.get(i11);
                            short s = lmgVar2.a;
                            if (s == 0) {
                                lly llyVar2 = this.h;
                                llyVar2.e();
                                llyVar2.a[1] = null;
                                int iA2 = lmgVar2.a();
                                StringBuilder sb8 = new StringBuilder(76);
                                sb8.append("Removed thumbnail with size ");
                                sb8.append(iA2);
                                sb8.append(" as Exif data exceeds max size 65535!");
                                Log.w("CAM_ExifTransFSM", sb8.toString());
                                iM -= lmgVar2.a();
                            } else if (s != ExifInterface.n(ExifInterface.B) && s != ExifInterface.n(ExifInterface.al) && s != ExifInterface.n(ExifInterface.C) && s != ExifInterface.n(ExifInterface.D) && s != ExifInterface.n(ExifInterface.i) && this.h.h(lmgVar2.a, lmgVar2.e)) {
                                short s2 = lmgVar2.a;
                                int iA3 = lmgVar2.a();
                                StringBuilder sb9 = new StringBuilder(75);
                                sb9.append("Removed tag ");
                                sb9.append((int) s2);
                                sb9.append(" of size ");
                                sb9.append(iA3);
                                sb9.append(" as Exif data exceeds max size 65535!");
                                Log.w("CAM_ExifTransFSM", sb9.toString());
                                iM -= lmgVar2.a();
                            }
                        }
                        if (iM > 65535) {
                            throw new IOException("Exif header is too large (>65535), even after pruning non-essential tags!");
                        }
                        h((short) -31);
                        h((short) (iM + 8));
                        g(f);
                        if (llyVar.d == ByteOrder.BIG_ENDIAN) {
                            h((short) 19789);
                        } else {
                            h((short) 18761);
                        }
                        lmk lmkVar = new lmk(this.c);
                        lmkVar.a.order(llyVar.d);
                        lmkVar.b((short) 42);
                        lmkVar.a(8);
                        lmj lmjVarB9 = this.h.b(0);
                        lmjVarB9.getClass();
                        n(lmjVarB9, lmkVar);
                        lmj lmjVarB10 = this.h.b(2);
                        lmjVarB10.getClass();
                        n(lmjVarB10, lmkVar);
                        lmj lmjVarB11 = this.h.b(3);
                        if (lmjVarB11 != null) {
                            n(lmjVarB11, lmkVar);
                        }
                        lmj lmjVarB12 = this.h.b(4);
                        if (lmjVarB12 != null) {
                            n(lmjVarB12, lmkVar);
                        }
                        lmj lmjVarB13 = this.h.b(1);
                        if (lmjVarB13 != null) {
                            n(lmjVarB13, lmkVar);
                        }
                        if (this.h.f()) {
                            byte[] bArr4 = this.h.b;
                            bArr4.getClass();
                            lmkVar.write(bArr4);
                        } else if (this.h.g()) {
                            for (int i12 = 0; i12 < this.h.a(); i12++) {
                                lmkVar.write(this.h.i(i12));
                            }
                        }
                        int size = arrayList.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            llyVar.j((lmg) arrayList.get(i13));
                        }
                    }
                    return 0;
                }
                boolean zBk = mip.bk(sB);
                short s3 = -30;
                if (zBk) {
                    if (this.m) {
                        char[] cArr = this.i.bz == 2 ? qbb.a : qbc.a;
                        int length = cArr.length;
                        obr.aG(true, "ICC profile does not fit in one marker segment!");
                        h((short) -30);
                        h((short) (length + length + 16));
                        g(g);
                        h((short) 257);
                        for (char c : cArr) {
                            h((short) c);
                        }
                    }
                    h(this.j);
                    return 4;
                }
                if (this.h != null && this.j == -31) {
                    return 2;
                }
                short s4 = this.j;
                if (s4 != -30) {
                    s3 = s4;
                } else {
                    if (this.i.bz != 0) {
                        return 5;
                    }
                    this.m = false;
                }
                h(s3);
                break;
            case 1:
                short sB2 = b(1);
                this.k = sB2;
                h(sB2);
                int i14 = ((char) this.k) - 2;
                this.l = i14;
                k(i14, this.j);
                i(this.l);
                return 0;
            case 2:
                short sB3 = b(2);
                this.k = sB3;
                int i15 = ((char) sB3) - 2;
                this.l = i15;
                k(i15, this.j);
                if (this.l < 5) {
                    h(this.j);
                    h(this.k);
                    i(this.l);
                    return 0;
                }
            case 3:
                super.c(4, 3);
                super.d();
                llw llwVar = this.b;
                int i16 = llwVar.b;
                if (i16 + 4 > llwVar.c) {
                    throw new IllegalStateException("Byte queue is too short");
                }
                byte[] bArr5 = new byte[4];
                System.arraycopy(llwVar.a, i16, bArr5, 0, 4);
                llwVar.b += 4;
                this.l -= 4;
                for (int i17 = 0; i17 < 4; i17++) {
                    if (bArr5[i17] != f[i17]) {
                        h(this.j);
                        h(this.k);
                        g(bArr5);
                        i(this.l);
                        return 0;
                    }
                }
                j(this.l);
                return 0;
            case 4:
                super.d();
                llw llwVar2 = this.b;
                llwVar2.c(this.c, llwVar2.a());
                this.e = -1;
                return 4;
            default:
                short sB4 = b(5);
                this.k = sB4;
                int i18 = ((char) sB4) - 2;
                this.l = i18;
                k(i18, this.j);
                j(this.l);
                return 0;
        }
    }
}
