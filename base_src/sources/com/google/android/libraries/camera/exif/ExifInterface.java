package com.google.android.libraries.camera.exif;

import android.util.Log;
import android.util.SparseIntArray;
import defpackage.lid;
import defpackage.lly;
import defpackage.llz;
import defpackage.lma;
import defpackage.lmc;
import defpackage.lmf;
import defpackage.lmg;
import defpackage.lmh;
import defpackage.lmj;
import defpackage.lmn;
import defpackage.mip;
import defpackage.obr;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ExifInterface implements llz {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;
    public static final int J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int O;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final int TAG_SOFTWARE;
    public static final int U;
    public static final int V;
    public static final int W;
    public static final int X;
    public static final int Y;
    public static final int Z;
    public static final int aA;
    public static final int aB;
    public static final int aC;
    public static final int aD;
    public static final int aE;
    public static final int aF;
    public static final int aG;
    public static final int aH;
    public static final int aI;
    public static final int aJ;
    public static final int aK;
    public static final int aL;
    public static final int aM;
    public static final int aN;
    public static final int aO;
    public static final int aP;
    public static final int aQ;
    public static final int aR;
    public static final int aS;
    public static final int aT;
    public static final int aU;
    public static final int aV;
    public static final int aW;
    public static final int aX;
    public static final int aY;
    public static final int aZ;
    public static final int aa;
    public static final int ab;
    public static final int ac;
    public static final int ad;
    public static final int ae;
    public static final int af;
    public static final int ag;
    public static final int ah;
    public static final int ai;
    public static final int aj;
    public static final int ak;
    public static final int al;
    public static final int am;
    public static final int an;
    public static final int ao;
    public static final int ap;
    public static final int aq;
    public static final int ar;
    public static final int as;
    public static final int at;
    public static final int au;
    public static final int av;
    public static final int aw;
    public static final int ax;
    public static final int ay;
    public static final int az;
    private static HashSet bE;
    private static final Long bF;
    public static final int ba;
    public static final int bb;
    public static final int bc;
    public static final int bd;
    public static final int be;
    public static final int bf;
    public static final int bg;
    public static final int bh;
    public static final int bi;
    public static final int bj;
    public static final int bk;
    public static final int bl;
    public static final int bm;
    public static final int bn;
    public static final int bo;
    public static final int bp;
    public static final int bq;
    public static final int br;
    public static final int bs;
    public static final int bt;
    public static final int bu;
    public static final int bv;
    protected static HashSet bw;
    public static final Long bx;
    public static final ByteOrder by;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final int v;
    public static final int w;
    public static final int x;
    public static final int y;
    public static final int z;
    public final DateFormat bC;
    public final Calendar bD;
    private SparseIntArray bH;
    public static final int a = c(0, 256);
    public static final int b = c(0, 257);
    public static final int c = c(0, 258);
    public static final int d = c(0, 259);
    public static final int e = c(0, 262);
    public static final int f = c(0, 270);
    public static final int g = c(0, 271);
    public static final int h = c(0, 272);
    public int bz = 0;
    public String bA = "";
    public lly bB = new lly(by);
    private final DateFormat bG = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.ROOT);

    static {
        int iC = c(0, (short) 273);
        i = iC;
        j = c(0, (short) 274);
        k = c(0, (short) 277);
        l = c(0, (short) 278);
        int iC2 = c(0, (short) 279);
        m = iC2;
        n = c(0, (short) 282);
        o = c(0, (short) 283);
        p = c(0, (short) 284);
        q = c(0, (short) 296);
        r = c(0, (short) 301);
        TAG_SOFTWARE = c(0, (short) 305);
        s = c(0, (short) 306);
        t = c(0, (short) 315);
        u = c(0, (short) 318);
        v = c(0, (short) 319);
        w = c(0, (short) 529);
        x = c(0, (short) 530);
        y = c(0, (short) 531);
        z = c(0, (short) 532);
        A = c(0, (short) -32104);
        int iC3 = c(0, (short) -30871);
        B = iC3;
        int iC4 = c(0, (short) -30683);
        C = iC4;
        int iC5 = c(1, (short) 513);
        D = iC5;
        int iC6 = c(1, (short) 514);
        E = iC6;
        F = c(2, (short) -32102);
        G = c(2, (short) -32099);
        H = c(2, (short) -30686);
        I = c(2, (short) -30684);
        J = c(2, (short) -30681);
        K = c(2, (short) -30680);
        L = c(2, (short) -28672);
        M = c(2, (short) -28669);
        N = c(2, (short) -28668);
        O = c(2, (short) -28415);
        P = c(2, (short) -28414);
        Q = c(2, (short) -28159);
        R = c(2, (short) -28158);
        S = c(2, (short) -28157);
        T = c(2, (short) -28156);
        U = c(2, (short) -28155);
        V = c(2, (short) -28154);
        W = c(2, (short) -28153);
        X = c(2, (short) -28152);
        Y = c(2, (short) -28151);
        Z = c(2, (short) -28150);
        aa = c(2, (short) -28140);
        ab = c(2, (short) -28036);
        ac = c(2, (short) -28026);
        ad = c(2, (short) -28016);
        ae = c(2, (short) -28015);
        af = c(2, (short) -28014);
        ag = c(2, (short) -24576);
        ah = c(2, (short) -24575);
        ai = c(2, (short) -24574);
        aj = c(2, (short) -24573);
        ak = c(2, (short) -24572);
        int iC7 = c(2, (short) -24571);
        al = iC7;
        am = c(2, (short) -24053);
        an = c(2, (short) -24052);
        ao = c(2, (short) -24050);
        ap = c(2, (short) -24049);
        aq = c(2, (short) -24048);
        ar = c(2, (short) -24044);
        as = c(2, (short) -24043);
        at = c(2, (short) -24041);
        au = c(2, (short) -23808);
        av = c(2, (short) -23807);
        aw = c(2, (short) -23806);
        ax = c(2, (short) -23551);
        ay = c(2, (short) -23550);
        az = c(2, (short) -23549);
        aA = c(2, (short) -23548);
        aB = c(2, (short) -23547);
        aC = c(2, (short) -23546);
        aD = c(2, (short) -23545);
        aE = c(2, (short) -23544);
        aF = c(2, (short) -23543);
        aG = c(2, (short) -23542);
        aH = c(2, (short) -23541);
        aI = c(2, (short) -23540);
        aJ = c(2, (short) -23520);
        aK = c(2, (short) -23501);
        aL = c(2, (short) -23500);
        aM = c(2, (short) -28656);
        aN = c(2, (short) -28655);
        aO = c(2, (short) -28654);
        aP = c(2, (short) -27648);
        aQ = c(2, (short) -27645);
        aR = c(4, (short) 0);
        aS = c(4, (short) 1);
        aT = c(4, (short) 2);
        aU = c(4, (short) 3);
        aV = c(4, (short) 4);
        aW = c(4, (short) 5);
        aX = c(4, (short) 6);
        aY = c(4, (short) 7);
        aZ = c(4, (short) 8);
        ba = c(4, (short) 9);
        bb = c(4, (short) 10);
        bc = c(4, (short) 11);
        bd = c(4, (short) 12);
        be = c(4, (short) 13);
        bf = c(4, (short) 14);
        bg = c(4, (short) 15);
        bh = c(4, (short) 16);
        bi = c(4, (short) 17);
        bj = c(4, (short) 18);
        bk = c(4, (short) 19);
        bl = c(4, (short) 20);
        bm = c(4, (short) 23);
        bn = c(4, (short) 24);
        bo = c(4, (short) 25);
        bp = c(4, (short) 26);
        bq = c(4, (short) 27);
        br = c(4, (short) 28);
        bs = c(4, (short) 29);
        bt = c(4, (short) 30);
        bu = c(3, (short) 1);
        bv = c(3, (short) 2);
        HashSet hashSet = new HashSet();
        bE = hashSet;
        hashSet.add(Short.valueOf(n(iC4)));
        bE.add(Short.valueOf(n(iC3)));
        bE.add(Short.valueOf(n(iC5)));
        bE.add(Short.valueOf(n(iC7)));
        bE.add(Short.valueOf(n(iC)));
        HashSet hashSet2 = new HashSet(bE);
        bw = hashSet2;
        hashSet2.add(Short.valueOf(n(-1)));
        bw.add(Short.valueOf(n(iC6)));
        bw.add(Short.valueOf(n(iC2)));
        bx = 100L;
        bF = 100L;
        by = ByteOrder.BIG_ENDIAN;
    }

    public ExifInterface() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd", Locale.ROOT);
        this.bC = simpleDateFormat;
        this.bD = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        this.bH = null;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    public static int c(int i2, short s2) {
        return (i2 << 16) | ((char) s2);
    }

    protected static int d(int i2) {
        return (char) i2;
    }

    protected static int f(int[] iArr) {
        int[] iArr2 = lmj.a;
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 : iArr) {
                if (iArr2[i3] == i4) {
                    i2 |= 1 << i3;
                    break;
                }
            }
        }
        return i2;
    }

    public static int g(int i2) {
        return i2 >>> 16;
    }

    public static short n(int i2) {
        return (short) i2;
    }

    protected static short o(int i2) {
        return (short) ((i2 >> 16) & 255);
    }

    public static boolean s(int i2, int i3) {
        int i4 = i2 >>> 24;
        int[] iArr = lmj.a;
        for (int i5 = 0; i5 < 5; i5++) {
            if (i3 == iArr[i5] && ((i4 >> i5) & 1) == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean t(short s2) {
        return bE.contains(Short.valueOf(s2));
    }

    public static lid[] w(double d2) {
        double dAbs = Math.abs(d2);
        int i2 = (int) dAbs;
        double d3 = i2;
        Double.isNaN(d3);
        double d4 = (dAbs - d3) * 60.0d;
        int i3 = (int) d4;
        Long l2 = bF;
        long jLongValue = l2.longValue();
        double d5 = i3;
        Double.isNaN(d5);
        double d6 = jLongValue;
        Double.isNaN(d6);
        return new lid[]{new lid(i2, 1L), new lid(i3, 1L), new lid((int) ((d4 - d5) * 60.0d * d6), l2.longValue())};
    }

    private static final String z(long j2) {
        return obr.ax(Long.toString(j2), 2);
    }

    @Override // defpackage.llz
    public final lid a(int i2) {
        lid[] lidVarArrV = v(i2, e(i2));
        if (lidVarArrV == null || lidVarArrV.length == 0) {
            return null;
        }
        return new lid(lidVarArrV[0]);
    }

    @Override // defpackage.llz
    public final Integer b(int i2) {
        lmg lmgVarL = l(i2, e(i2));
        int[] iArrN = lmgVarL == null ? null : lmgVarL.n();
        if (iArrN == null || iArrN.length <= 0) {
            return null;
        }
        return Integer.valueOf(iArrN[0]);
    }

    public final int e(int i2) {
        if (h().get(i2) == 0) {
            return -1;
        }
        return g(i2);
    }

    @Override // defpackage.llz
    public String getTagStringValue(int i2) {
        lmg lmgVarL = l(i2, e(i2));
        if (lmgVarL == null) {
            return null;
        }
        return lmgVarL.d();
    }

    public final SparseIntArray h() {
        if (this.bH == null) {
            this.bH = new SparseIntArray();
            int iF = f(new int[]{0, 1}) << 24;
            SparseIntArray sparseIntArray = this.bH;
            sparseIntArray.getClass();
            int i2 = iF | 131072;
            int i3 = g;
            sparseIntArray.put(i3, i2);
            int i4 = iF | 262145;
            sparseIntArray.put(a, i4);
            sparseIntArray.put(b, i4);
            sparseIntArray.put(c, 196611 | iF);
            int i5 = iF | 196609;
            sparseIntArray.put(d, i5);
            sparseIntArray.put(e, i5);
            sparseIntArray.put(j, i5);
            sparseIntArray.put(k, i5);
            sparseIntArray.put(p, i5);
            sparseIntArray.put(x, iF | 196610);
            sparseIntArray.put(y, i5);
            int i6 = iF | 327681;
            sparseIntArray.put(n, i6);
            sparseIntArray.put(o, i6);
            sparseIntArray.put(q, i5);
            int i7 = 262144 | iF;
            sparseIntArray.put(i, i7);
            sparseIntArray.put(l, i4);
            sparseIntArray.put(m, i7);
            sparseIntArray.put(r, 197376 | iF);
            sparseIntArray.put(u, 327682 | iF);
            int i8 = 327686 | iF;
            sparseIntArray.put(v, i8);
            sparseIntArray.put(w, iF | 327683);
            sparseIntArray.put(z, i8);
            sparseIntArray.put(s, iF | 131092);
            sparseIntArray.put(f, i2);
            sparseIntArray.put(i3, i2);
            sparseIntArray.put(h, i2);
            sparseIntArray.put(TAG_SOFTWARE, i2);
            sparseIntArray.put(t, i2);
            sparseIntArray.put(A, i2);
            sparseIntArray.put(B, i4);
            sparseIntArray.put(C, i4);
            int iF2 = (f(new int[]{1}) << 24) | 262145;
            sparseIntArray.put(D, iF2);
            sparseIntArray.put(E, iF2);
            int iF3 = f(new int[]{2}) << 24;
            int i9 = 458756 | iF3;
            sparseIntArray.put(L, i9);
            sparseIntArray.put(ag, i9);
            int i10 = iF3 | 196609;
            sparseIntArray.put(ah, i10);
            sparseIntArray.put(O, i9);
            int i11 = iF3 | 327681;
            sparseIntArray.put(P, i11);
            int i12 = 262145 | iF3;
            sparseIntArray.put(ai, i12);
            sparseIntArray.put(aj, i12);
            int i13 = iF3 | 458752;
            sparseIntArray.put(ab, i13);
            sparseIntArray.put(ac, i13);
            sparseIntArray.put(ak, iF3 | 131085);
            int i14 = iF3 | 131092;
            sparseIntArray.put(M, i14);
            sparseIntArray.put(N, i14);
            int i15 = iF3 | 131072;
            sparseIntArray.put(ad, i15);
            sparseIntArray.put(ae, i15);
            sparseIntArray.put(af, i15);
            sparseIntArray.put(aJ, 131105 | iF3);
            sparseIntArray.put(aK, i15);
            sparseIntArray.put(aL, i15);
            sparseIntArray.put(F, i11);
            sparseIntArray.put(G, i11);
            sparseIntArray.put(H, i10);
            sparseIntArray.put(I, i15);
            int i16 = 196608 | iF3;
            sparseIntArray.put(J, i16);
            sparseIntArray.put(K, i13);
            int i17 = 655361 | iF3;
            sparseIntArray.put(Q, i17);
            sparseIntArray.put(R, i11);
            sparseIntArray.put(S, i17);
            sparseIntArray.put(T, i17);
            sparseIntArray.put(U, i11);
            sparseIntArray.put(V, i11);
            sparseIntArray.put(W, i10);
            sparseIntArray.put(X, i10);
            sparseIntArray.put(Y, i10);
            sparseIntArray.put(Z, i11);
            sparseIntArray.put(aa, i16);
            sparseIntArray.put(am, i11);
            sparseIntArray.put(an, i13);
            sparseIntArray.put(ao, i11);
            sparseIntArray.put(ap, i11);
            sparseIntArray.put(aq, i10);
            sparseIntArray.put(ar, 196610 | iF3);
            sparseIntArray.put(as, i11);
            sparseIntArray.put(at, i10);
            int i18 = 458753 | iF3;
            sparseIntArray.put(au, i18);
            sparseIntArray.put(av, i18);
            sparseIntArray.put(aw, i13);
            sparseIntArray.put(ax, i10);
            sparseIntArray.put(ay, i10);
            sparseIntArray.put(az, i10);
            sparseIntArray.put(aA, i11);
            sparseIntArray.put(aB, i10);
            sparseIntArray.put(aC, i10);
            sparseIntArray.put(aD, i11);
            sparseIntArray.put(aE, i10);
            sparseIntArray.put(aF, i10);
            sparseIntArray.put(aG, i10);
            sparseIntArray.put(aH, i13);
            sparseIntArray.put(aI, i10);
            sparseIntArray.put(al, i12);
            int i19 = iF3 | 131079;
            sparseIntArray.put(aM, i19);
            sparseIntArray.put(aO, i19);
            sparseIntArray.put(aN, i19);
            sparseIntArray.put(aP, i17);
            sparseIntArray.put(aQ, i17);
            int iF4 = f(new int[]{4}) << 24;
            sparseIntArray.put(aR, 65540 | iF4);
            int i20 = 131074 | iF4;
            sparseIntArray.put(aS, i20);
            sparseIntArray.put(aU, i20);
            int i21 = iF4 | 327683;
            sparseIntArray.put(aT, i21);
            sparseIntArray.put(aV, i21);
            sparseIntArray.put(aW, 65537 | iF4);
            int i22 = iF4 | 327681;
            sparseIntArray.put(aX, i22);
            sparseIntArray.put(aY, i21);
            int i23 = iF4 | 131072;
            sparseIntArray.put(aZ, i23);
            sparseIntArray.put(ba, i20);
            sparseIntArray.put(bb, i20);
            sparseIntArray.put(bc, i22);
            sparseIntArray.put(bd, i20);
            sparseIntArray.put(be, i22);
            sparseIntArray.put(bf, i20);
            sparseIntArray.put(bg, i22);
            sparseIntArray.put(bh, i20);
            sparseIntArray.put(bi, i22);
            sparseIntArray.put(bj, i23);
            sparseIntArray.put(bk, i20);
            sparseIntArray.put(bl, i22);
            sparseIntArray.put(bm, i20);
            sparseIntArray.put(bn, i22);
            sparseIntArray.put(bo, i20);
            sparseIntArray.put(bp, i22);
            int i24 = iF4 | 458752;
            sparseIntArray.put(bq, i24);
            sparseIntArray.put(br, i24);
            sparseIntArray.put(bs, 131083 | iF4);
            sparseIntArray.put(bt, iF4 | 196619);
            int iF5 = f(new int[]{3}) << 24;
            sparseIntArray.put(bu, 131072 | iF5);
            sparseIntArray.put(bv, iF5 | 458752);
        }
        SparseIntArray sparseIntArray2 = this.bH;
        sparseIntArray2.getClass();
        return sparseIntArray2;
    }

    public final lmg i(int i2, Object obj) {
        boolean zJ;
        int iG = g(i2);
        int i3 = h().get(i2);
        if (i3 == 0 || obj == null) {
            return null;
        }
        short sO = o(i3);
        int iD = d(i3);
        boolean z2 = iD != 0;
        if (!s(i3, iG)) {
            return null;
        }
        lmg lmgVar = new lmg(n(i2), sO, iD, iG, z2);
        if (obj instanceof Short) {
            zJ = lmgVar.h((char) ((Short) obj).shortValue());
        } else if (obj instanceof String) {
            zJ = lmgVar.i((String) obj);
        } else if (obj instanceof int[]) {
            zJ = lmgVar.k((int[]) obj);
        } else if (obj instanceof long[]) {
            zJ = lmgVar.l((long[]) obj);
        } else if (obj instanceof lid) {
            zJ = lmgVar.m(new lid[]{(lid) obj});
        } else if (obj instanceof lid[]) {
            zJ = lmgVar.m((lid[]) obj);
        } else if (obj instanceof byte[]) {
            zJ = lmgVar.j((byte[]) obj);
        } else if (obj instanceof Integer) {
            zJ = lmgVar.h(((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            zJ = lmgVar.l(new long[]{((Long) obj).longValue()});
        } else if (obj instanceof Byte) {
            zJ = lmgVar.j(new byte[]{((Byte) obj).byteValue()});
        } else if (obj instanceof Short[]) {
            Short[] shArr = (Short[]) obj;
            int[] iArr = new int[shArr.length];
            for (int i4 = 0; i4 < shArr.length; i4++) {
                Short sh = shArr[i4];
                iArr[i4] = sh == null ? (char) 0 : (char) sh.shortValue();
            }
            zJ = lmgVar.k(iArr);
        } else if (obj instanceof Integer[]) {
            Integer[] numArr = (Integer[]) obj;
            int[] iArr2 = new int[numArr.length];
            for (int i5 = 0; i5 < numArr.length; i5++) {
                Integer num = numArr[i5];
                iArr2[i5] = num == null ? 0 : num.intValue();
            }
            zJ = lmgVar.k(iArr2);
        } else if (obj instanceof Long[]) {
            Long[] lArr = (Long[]) obj;
            long[] jArr = new long[lArr.length];
            for (int i6 = 0; i6 < lArr.length; i6++) {
                Long l2 = lArr[i6];
                jArr[i6] = l2 == null ? 0L : l2.longValue();
            }
            zJ = lmgVar.l(jArr);
        } else {
            if (!(obj instanceof Byte[])) {
                return null;
            }
            Byte[] bArr = (Byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            for (int i7 = 0; i7 < bArr.length; i7++) {
                Byte b2 = bArr[i7];
                bArr2[i7] = b2 == null ? (byte) 0 : b2.byteValue();
            }
            zJ = lmgVar.j(bArr2);
        }
        if (zJ) {
            return lmgVar;
        }
        return null;
    }

    public final lmg j(int i2) {
        int i3 = h().get(i2);
        if (i3 == 0) {
            return null;
        }
        short sO = o(i3);
        int iD = d(i3);
        return new lmg(n(i2), sO, iD, g(i2), iD != 0);
    }

    public final lmg k(int i2) {
        return l(i2, e(i2));
    }

    public final lmg l(int i2, int i3) {
        if (!lmg.f(i3)) {
            return null;
        }
        short sN = n(i2);
        lmj lmjVar = this.bB.a[i3];
        if (lmjVar == null) {
            return null;
        }
        return lmjVar.b(sN);
    }

    public final OutputStream m(OutputStream outputStream) {
        return new lmn(new lmh(new BufferedOutputStream(outputStream, 65536), this, this.bB));
    }

    public final void p(int i2) {
        this.bB.h(n(i2), e(i2));
    }

    public final void q(InputStream inputStream) throws IOException {
        try {
            lmf lmfVar = new lmf(inputStream, this);
            lly llyVar = new lly(lmfVar.a.b.order());
            for (int iA = lmfVar.a(); iA != 5; iA = lmfVar.a()) {
                int iB = 0;
                switch (iA) {
                    case 0:
                        llyVar.d(new lmj(lmfVar.b));
                        continue;
                        break;
                    case 1:
                        lmg lmgVar = lmfVar.c;
                        if (lmgVar == null) {
                            continue;
                        } else if (lmgVar.e()) {
                            lmj lmjVarB = llyVar.b(lmgVar.e);
                            if (lmjVarB != null) {
                                lmjVarB.e(lmgVar);
                            }
                        } else {
                            int i2 = lmgVar.g;
                            if (i2 >= lmfVar.a.a) {
                                lmfVar.g.put(Integer.valueOf(i2), new lmc(lmgVar, true));
                            }
                        }
                        break;
                    case 2:
                        lmg lmgVar2 = lmfVar.c;
                        if (lmgVar2 != null) {
                            if (lmgVar2.b == 7) {
                                lmfVar.e(lmgVar2);
                            }
                            lmj lmjVarB2 = llyVar.b(lmgVar2.e);
                            if (lmjVarB2 != null) {
                                lmjVarB2.e(lmgVar2);
                            }
                        } else {
                            continue;
                        }
                        break;
                    case 3:
                        lmg lmgVar3 = lmfVar.f;
                        if (lmgVar3 != null) {
                            iB = (int) lmgVar3.b(0);
                        }
                        byte[] bArr = new byte[iB];
                        if (iB == lmfVar.b(bArr)) {
                            llyVar.b = bArr;
                            continue;
                        } else {
                            Log.w("CAM_ExifReader", "Failed to read the compressed thumbnail");
                        }
                        break;
                    default:
                        lmg lmgVar4 = lmfVar.e;
                        if (lmgVar4 != null) {
                            iB = (int) lmgVar4.b(0);
                        }
                        byte[] bArr2 = new byte[iB];
                        if (iB == lmfVar.b(bArr2)) {
                            int i3 = lmfVar.d.a;
                            if (i3 < llyVar.c.size()) {
                                llyVar.c.set(i3, bArr2);
                            } else {
                                for (int size = llyVar.c.size(); size < i3; size++) {
                                    llyVar.c.add(null);
                                }
                                llyVar.c.add(bArr2);
                            }
                        } else {
                            Log.w("CAM_ExifReader", "Failed to read the strip bytes");
                            continue;
                        }
                        break;
                }
                throw new IOException("Invalid exif format : ", e);
            }
            this.bB = llyVar;
        } catch (lma e2) {
            throw new IOException("Invalid exif format : ", e2);
        }
    }

    public final void r(byte[] bArr) throws IOException {
        q(new ByteArrayInputStream(bArr));
    }

    public void readExif(String str) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
        q(bufferedInputStream);
        bufferedInputStream.close();
    }

    public final lid[] u(int i2) {
        return v(i2, e(i2));
    }

    public final lid[] v(int i2, int i3) {
        lmg lmgVarL = l(i2, i3);
        if (lmgVarL == null) {
            return null;
        }
        Object obj = lmgVarL.f;
        if (obj instanceof lid[]) {
            return (lid[]) obj;
        }
        return null;
    }

    public final void x(int i2, long j2, TimeZone timeZone) {
        lmg lmgVarI;
        int i3;
        int i4;
        int i5 = s;
        if (i2 == i5 || i2 == N || i2 == M) {
            synchronized (this.bG) {
                this.bG.setTimeZone(timeZone);
                lmgVarI = i(i2, this.bG.format(Long.valueOf(j2)));
            }
            if (lmgVarI == null) {
                return;
            }
            y(lmgVarI);
            if (i2 == i5) {
                i3 = aM;
            } else if (i2 == N) {
                i3 = aO;
            } else {
                if (i2 != M) {
                    StringBuilder sb = new StringBuilder(57);
                    sb.append("Must pass a date stamp tag, unrecognized tag: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                i3 = aN;
            }
            int offset = timeZone.getOffset(j2);
            int iAbs = Math.abs(offset);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(offset < 0 ? "-" : "+");
            long j3 = iAbs;
            sb2.append(z(TimeUnit.MILLISECONDS.toHours(j3)));
            sb2.append(":");
            sb2.append(z(TimeUnit.MILLISECONDS.toMinutes(j3) % 60));
            lmg lmgVarI2 = i(i3, sb2.toString());
            if (lmgVarI2 != null) {
                y(lmgVarI2);
            }
            if (i2 == i5) {
                i4 = ad;
            } else if (i2 == N) {
                i4 = af;
            } else {
                if (i2 != M) {
                    StringBuilder sb3 = new StringBuilder(57);
                    sb3.append("Must pass a date stamp tag, unrecognized tag: ");
                    sb3.append(i2);
                    throw new IllegalArgumentException(sb3.toString());
                }
                i4 = ae;
            }
            lmg lmgVarI3 = i(i4, mip.bl(j2));
            if (lmgVarI3 == null) {
                return;
            }
            y(lmgVarI3);
        }
    }

    public final void y(lmg lmgVar) {
        this.bB.j(lmgVar);
    }
}
