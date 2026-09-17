package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class ead {
    public final ddf a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final float h;

    public ead(gxm gxmVar, ddf ddfVar, byte[] bArr) {
        int iIntValue;
        this.a = ddfVar;
        int iMax = Math.max(1, ((Integer) ddfVar.a(ddm.h).c()).intValue());
        this.b = iMax;
        int iIntValue2 = ((Integer) ddfVar.a(ddm.g).c()).intValue();
        ddfVar.b();
        int iMax2 = Math.max(1, iIntValue2);
        int iIntValue3 = ((Integer) ddfVar.a(ddm.r).c()).intValue();
        obr.aQ(iIntValue3 >= 10);
        iIntValue3 = true != c(ddfVar) ? iMax2 : iIntValue3;
        if (d(ddfVar)) {
            iIntValue = ((Integer) ddfVar.a(ddm.q).c()).intValue();
        } else {
            ddfVar.b();
            iIntValue = iMax2;
        }
        int iMax3 = Math.max(iIntValue3, iIntValue);
        int i = true != gxmVar.d() ? 0 : 4;
        boolean zD = gxmVar.d();
        if (gxmVar.d() && ddfVar.k(dds.w)) {
            int iMax4 = Math.max(i + iMax2, (zD ? 1 : 0) + iMax3);
            this.c = iMax4;
            this.e = gxmVar.d() ? iMax4 - iMax2 : 0;
            this.f = gxmVar.d() ? iMax4 - iMax3 : 0;
        } else {
            int iMax5 = Math.max(i + iMax2, iMax3);
            this.c = iMax5;
            this.e = gxmVar.d() ? iMax5 - iMax2 : 0;
            this.f = 0;
        }
        this.d = (int) (this.c * ((Float) ddfVar.g(ddm.Z).c()).floatValue());
        obr.aQ(iMax > 0);
        obr.aQ(iMax <= this.c);
        this.g = ddfVar.k(ddm.A);
        ddfVar.d();
        ddfVar.c();
        this.h = ((Float) ddfVar.g(dde.a).c()).floatValue();
    }

    static String a(eac eacVar) {
        switch (eacVar.ordinal()) {
            case 2:
                return "y";
            case 3:
                return "r";
            case 4:
                return "h";
            default:
                return "";
        }
    }

    public static boolean c(ddf ddfVar) {
        if (ddfVar.k(ddm.W)) {
            return false;
        }
        return ddfVar.k(ddm.V);
    }

    public static boolean d(ddf ddfVar) {
        return ddfVar.k(ddm.O);
    }

    public final boolean b() {
        ddf ddfVar = this.a;
        ddi ddiVar = ddm.a;
        ddfVar.c();
        return new File("/dev/adsprpc-smd").canRead();
    }
}
