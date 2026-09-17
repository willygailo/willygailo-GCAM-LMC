package defpackage;

import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.common.io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class lmf {
    private static final Charset h = Charset.forName("US-ASCII");
    private static final short i = ExifInterface.n(ExifInterface.B);
    private static final short j = ExifInterface.n(ExifInterface.C);
    private static final short k = ExifInterface.n(ExifInterface.al);
    private static final short l = ExifInterface.n(ExifInterface.D);
    private static final short m = ExifInterface.n(ExifInterface.E);
    private static final short n = ExifInterface.n(ExifInterface.i);
    private static final short o = ExifInterface.n(ExifInterface.m);
    public final llx a;
    public int b;
    public lmg c;
    public lme d;
    public lmg e;
    public lmg f;
    private boolean r;
    private boolean s;
    private int t;
    private byte[] u;
    private int v;
    private final ExifInterface w;
    private int p = 0;
    private int q = 0;
    public final TreeMap g = new TreeMap();

    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public lmf(InputStream inputStream, ExifInterface exifInterface) throws lma, IOException {
        boolean z;
        llx llxVar;
        short sD;
        long jC;
        int i2;
        this.s = false;
        this.w = exifInterface;
        llx llxVar2 = new llx(inputStream);
        short sD2 = llxVar2.d();
        while (true) {
            if (sD2 != -39 && !mip.bk(sD2)) {
                if (sD2 == -40) {
                    sD2 = llxVar2.d();
                } else {
                    int iB = llxVar2.b();
                    if (sD2 == -31 && iB >= 8) {
                        int iA = llxVar2.a();
                        short sD3 = llxVar2.d();
                        iB -= 6;
                        if (iA == 1165519206 && sD3 == 0) {
                            this.t = iB;
                            z = true;
                        }
                        this.s = z;
                        llxVar = new llx(inputStream);
                        this.a = llxVar;
                        if (this.s) {
                            sD = llxVar.d();
                            if (sD == 18761) {
                                llxVar.e(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                if (sD == 19789) {
                                    throw new lma("Invalid TIFF header");
                                }
                                llxVar.e(ByteOrder.BIG_ENDIAN);
                            }
                            if (llxVar.d() == 42) {
                                throw new lma("Invalid TIFF header");
                            }
                            jC = llxVar.c();
                            if (jC <= 2147483647L) {
                                StringBuilder sb = new StringBuilder(35);
                                sb.append("Invalid offset ");
                                sb.append(jC);
                                throw new lma(sb.toString());
                            }
                            i2 = (int) jC;
                            this.v = i2;
                            this.b = 0;
                            g(0, jC);
                            if (jC != 8) {
                                byte[] bArr = new byte[i2 - 8];
                                this.u = bArr;
                                b(bArr);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (iB >= 2) {
                        try {
                            ByteStreams.skipFully(llxVar2, iB - 2);
                            sD2 = llxVar2.d();
                        } catch (IOException e) {
                        }
                    }
                    Log.w("CAM_ExifParser", "Invalid JPEG format.");
                }
            }
            z = false;
            this.s = z;
            llxVar = new llx(inputStream);
            this.a = llxVar;
            if (this.s) {
                sD = llxVar.d();
                if (sD == 18761) {
                    llxVar.e(ByteOrder.LITTLE_ENDIAN);
                } else {
                    if (sD == 19789) {
                        throw new lma("Invalid TIFF header");
                    }
                    llxVar.e(ByteOrder.BIG_ENDIAN);
                }
                if (llxVar.d() == 42) {
                    throw new lma("Invalid TIFF header");
                }
                jC = llxVar.c();
                if (jC <= 2147483647L) {
                    StringBuilder sb2 = new StringBuilder(35);
                    sb2.append("Invalid offset ");
                    sb2.append(jC);
                    throw new lma(sb2.toString());
                }
                i2 = (int) jC;
                this.v = i2;
                this.b = 0;
                g(0, jC);
                if (jC != 8) {
                    byte[] bArr2 = new byte[i2 - 8];
                    this.u = bArr2;
                    b(bArr2);
                    return;
                }
                return;
            }
            return;
        }
    }

    private final void f(lmg lmgVar) {
        if (lmgVar == null || lmgVar.d == 0) {
            return;
        }
        short s = lmgVar.a;
        int i2 = lmgVar.e;
        if (s == i && i(i2, ExifInterface.B)) {
            g(2, lmgVar.b(0));
            return;
        }
        if (s == j && i(i2, ExifInterface.C)) {
            g(4, lmgVar.b(0));
            return;
        }
        if (s == k && i(i2, ExifInterface.al)) {
            g(3, lmgVar.b(0));
            return;
        }
        if (s == l && i(i2, ExifInterface.D)) {
            this.g.put(Integer.valueOf((int) lmgVar.b(0)), new lme());
            return;
        }
        if (s == m && i(i2, ExifInterface.E)) {
            this.f = lmgVar;
            return;
        }
        if (s != n || !i(i2, ExifInterface.i)) {
            if (s == o && i(i2, ExifInterface.m) && lmgVar.e()) {
                this.e = lmgVar;
                return;
            }
            return;
        }
        if (!lmgVar.e()) {
            this.g.put(Integer.valueOf(lmgVar.g), new lmc(lmgVar, false));
            return;
        }
        for (int i3 = 0; i3 < lmgVar.d; i3++) {
            if (lmgVar.b == 3) {
                h(i3, lmgVar.b(i3));
            } else {
                h(i3, lmgVar.b(i3));
            }
        }
    }

    private final void g(int i2, long j2) {
        this.g.put(Integer.valueOf((int) j2), new lmd(i2));
    }

    private final void h(int i2, long j2) {
        this.g.put(Integer.valueOf((int) j2), new lme(i2));
    }

    private final boolean i(int i2, int i3) {
        int i4 = this.w.h().get(i3);
        if (i4 == 0) {
            return false;
        }
        return ExifInterface.s(i4, i2);
    }

    public final int a() {
        int iIntValue;
        lmg lmgVar;
        if (!this.s) {
            return 5;
        }
        llx llxVar = this.a;
        int i2 = llxVar.a;
        int i3 = this.p + 2 + (this.q * 12);
        boolean z = true;
        if (i2 < i3) {
            short sD = llxVar.d();
            short sD2 = this.a.d();
            long jC = this.a.c();
            if (jC > 2147483647L) {
                throw new lma("Number of component is larger then Integer.MAX_VALUE");
            }
            if (lmg.g(sD2)) {
                int i4 = (int) jC;
                lmg lmgVar2 = new lmg(sD, sD2, i4, this.b, i4 != 0);
                int iA = lmgVar2.a();
                if (iA > 4) {
                    long jC2 = this.a.c();
                    if (jC2 > 2147483647L) {
                        throw new lma("offset is larger then Integer.MAX_VALUE");
                    }
                    if (jC2 >= this.v || sD2 != 7) {
                        lmgVar2.g = (int) jC2;
                    } else {
                        byte[] bArr = new byte[i4];
                        System.arraycopy(this.u, ((int) jC2) - 8, bArr, 0, i4);
                        lmgVar2.j(bArr);
                    }
                } else {
                    boolean z2 = lmgVar2.c;
                    lmgVar2.c = false;
                    e(lmgVar2);
                    lmgVar2.c = z2;
                    ByteStreams.skipFully(this.a, 4 - iA);
                    lmgVar2.g = this.a.a - 4;
                }
                lmgVar = lmgVar2;
            } else {
                Log.w("CAM_ExifParser", String.format("Tag %04x: Invalid data type %d", Short.valueOf(sD), Short.valueOf(sD2)));
                ByteStreams.skipFully(this.a, 4L);
                lmgVar = null;
            }
            this.c = lmgVar;
            if (lmgVar == null) {
                return a();
            }
            if (this.r) {
                f(lmgVar);
            }
            return 1;
        }
        if (i2 == i3) {
            if (this.b == 0) {
                long jD = d();
                if (jD != 0) {
                    g(1, jD);
                }
            } else {
                if (this.g.size() > 0) {
                    Map.Entry entryFirstEntry = this.g.firstEntry();
                    entryFirstEntry.getClass();
                    iIntValue = ((Integer) entryFirstEntry.getKey()).intValue() - this.a.a;
                } else {
                    iIntValue = 4;
                }
                if (iIntValue < 4) {
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Invalid size of link to next IFD: ");
                    sb.append(iIntValue);
                    Log.w("CAM_ExifParser", sb.toString());
                } else {
                    long jD2 = d();
                    if (jD2 != 0) {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Invalid link to next IFD: ");
                        sb2.append(jD2);
                        Log.w("CAM_ExifParser", sb2.toString());
                    }
                }
            }
        }
        while (this.g.size() != 0) {
            Map.Entry entryPollFirstEntry = this.g.pollFirstEntry();
            entryPollFirstEntry.getClass();
            Object value = entryPollFirstEntry.getValue();
            try {
                int iIntValue2 = ((Integer) entryPollFirstEntry.getKey()).intValue();
                llx llxVar2 = this.a;
                ByteStreams.skipFully(llxVar2, ((long) iIntValue2) - ((long) llxVar2.a));
                while (!this.g.isEmpty() && ((Integer) this.g.firstKey()).intValue() < iIntValue2) {
                    this.g.pollFirstEntry();
                }
                if (value instanceof lmd) {
                    lmd lmdVar = (lmd) value;
                    this.b = lmdVar.a;
                    this.q = this.a.b();
                    int iIntValue3 = ((Integer) entryPollFirstEntry.getKey()).intValue();
                    this.p = iIntValue3;
                    if ((this.q * 12) + iIntValue3 + 2 > this.t) {
                        int i5 = this.b;
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("Invalid size of IFD ");
                        sb3.append(i5);
                        Log.w("CAM_ExifParser", sb3.toString());
                        return 5;
                    }
                    switch (this.b) {
                        case 0:
                        case 1:
                        case 2:
                            break;
                        default:
                            z = false;
                            break;
                    }
                    this.r = z;
                    boolean z3 = lmdVar.b;
                    return 0;
                }
                if (value instanceof lme) {
                    lme lmeVar = (lme) value;
                    this.d = lmeVar;
                    return lmeVar.b;
                }
                lmc lmcVar = (lmc) value;
                lmg lmgVar3 = lmcVar.a;
                this.c = lmgVar3;
                if (lmgVar3 != null && lmgVar3.b != 7) {
                    e(lmgVar3);
                    f(this.c);
                }
                if (lmcVar.b) {
                    return 2;
                }
            } catch (IOException e) {
                String strValueOf = String.valueOf(entryPollFirstEntry.getKey());
                String name = value.getClass().getName();
                StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf).length() + 57 + String.valueOf(name).length());
                sb4.append("Failed to skip to data at: ");
                sb4.append(strValueOf);
                sb4.append(" for ");
                sb4.append(name);
                sb4.append(", the file may be broken.");
                Log.w("CAM_ExifParser", sb4.toString());
            }
        }
        return 5;
    }

    public final int b(byte[] bArr) {
        return ByteStreams.read(this.a, bArr, 0, bArr.length);
    }

    protected final int c() {
        return this.a.a();
    }

    protected final long d() {
        return ((long) c()) & 4294967295L;
    }

    public final void e(lmg lmgVar) {
        String str;
        short s = lmgVar.b;
        if (s == 2 || s == 7 || s == 1) {
            int i2 = lmgVar.d;
            if (this.g.size() > 0) {
                Map.Entry entryFirstEntry = this.g.firstEntry();
                entryFirstEntry.getClass();
                if (((Integer) entryFirstEntry.getKey()).intValue() < this.a.a + i2) {
                    Map.Entry entryFirstEntry2 = this.g.firstEntry();
                    entryFirstEntry2.getClass();
                    Object value = entryFirstEntry2.getValue();
                    if (value instanceof lme) {
                        String strValueOf = String.valueOf(lmgVar.toString());
                        Log.w("CAM_ExifParser", strValueOf.length() != 0 ? "Thumbnail overlaps value for tag: \n".concat(strValueOf) : new String("Thumbnail overlaps value for tag: \n"));
                        Map.Entry entryPollFirstEntry = this.g.pollFirstEntry();
                        entryPollFirstEntry.getClass();
                        String strValueOf2 = String.valueOf(entryPollFirstEntry.getKey());
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf2).length() + 26);
                        sb.append("Invalid thumbnail offset: ");
                        sb.append(strValueOf2);
                        Log.w("CAM_ExifParser", sb.toString());
                    } else {
                        if (value instanceof lmd) {
                            int i3 = ((lmd) value).a;
                            String string = lmgVar.toString();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 41);
                            sb2.append("Ifd ");
                            sb2.append(i3);
                            sb2.append(" overlaps value for tag: \n");
                            sb2.append(string);
                            Log.w("CAM_ExifParser", sb2.toString());
                        } else if (value instanceof lmc) {
                            String string2 = ((lmc) value).a.toString();
                            String string3 = lmgVar.toString();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(string2).length() + 46 + String.valueOf(string3).length());
                            sb3.append("Tag value for tag: \n");
                            sb3.append(string2);
                            sb3.append(" overlaps value for tag: \n");
                            sb3.append(string3);
                            Log.w("CAM_ExifParser", sb3.toString());
                        }
                        Map.Entry entryFirstEntry3 = this.g.firstEntry();
                        entryFirstEntry3.getClass();
                        int iIntValue = ((Integer) entryFirstEntry3.getKey()).intValue() - this.a.a;
                        String string4 = lmgVar.toString();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(string4).length() + 52);
                        sb4.append("Invalid size of tag: \n");
                        sb4.append(string4);
                        sb4.append(" setting count to: ");
                        sb4.append(iIntValue);
                        Log.w("CAM_ExifParser", sb4.toString());
                        lmgVar.d = iIntValue;
                    }
                }
            }
        }
        int i4 = 0;
        switch (lmgVar.b) {
            case 1:
            case 7:
                byte[] bArr = new byte[lmgVar.d];
                b(bArr);
                lmgVar.j(bArr);
                break;
            case 2:
                int i5 = lmgVar.d;
                Charset charset = h;
                if (i5 > 0) {
                    byte[] bArr2 = new byte[i5];
                    this.a.f(bArr2, i5);
                    str = new String(bArr2, charset);
                } else {
                    str = "";
                }
                lmgVar.i(str);
                break;
            case 3:
                int i6 = lmgVar.d;
                int[] iArr = new int[i6];
                while (i4 < i6) {
                    iArr[i4] = (char) this.a.d();
                    i4++;
                }
                lmgVar.k(iArr);
                break;
            case 4:
                int i7 = lmgVar.d;
                long[] jArr = new long[i7];
                while (i4 < i7) {
                    jArr[i4] = d();
                    i4++;
                }
                lmgVar.l(jArr);
                break;
            case 5:
                int i8 = lmgVar.d;
                lid[] lidVarArr = new lid[i8];
                while (i4 < i8) {
                    lidVarArr[i4] = new lid(d(), d());
                    i4++;
                }
                lmgVar.m(lidVarArr);
                break;
            case 9:
                int i9 = lmgVar.d;
                int[] iArr2 = new int[i9];
                while (i4 < i9) {
                    iArr2[i4] = c();
                    i4++;
                }
                lmgVar.k(iArr2);
                break;
            case 10:
                int i10 = lmgVar.d;
                lid[] lidVarArr2 = new lid[i10];
                while (i4 < i10) {
                    lidVarArr2[i4] = new lid(c(), c());
                    i4++;
                }
                lmgVar.m(lidVarArr2);
                break;
        }
    }
}
