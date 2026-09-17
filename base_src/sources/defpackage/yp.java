package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yp {
    static final boolean[] a = new boolean[3];

    static void a(yl ylVar, ya yaVar, yk ykVar) {
        ykVar.p = -1;
        ykVar.q = -1;
        if (ylVar.ap[0] != 2 && ykVar.ap[0] == 4) {
            int i = ykVar.J.f;
            int iJ = ylVar.j() - ykVar.L.f;
            yj yjVar = ykVar.J;
            yjVar.h = yaVar.b(yjVar);
            yj yjVar2 = ykVar.L;
            yjVar2.h = yaVar.b(yjVar2);
            yaVar.f(ykVar.J.h, i);
            yaVar.f(ykVar.L.h, iJ);
            ykVar.p = 2;
            ykVar.Y = i;
            int i2 = iJ - i;
            ykVar.U = i2;
            int i3 = ykVar.ab;
            if (i2 < i3) {
                ykVar.U = i3;
            }
        }
        if (ylVar.ap[1] == 2 || ykVar.ap[1] != 4) {
            return;
        }
        int i4 = ykVar.K.f;
        int iH = ylVar.h() - ykVar.M.f;
        yj yjVar3 = ykVar.K;
        yjVar3.h = yaVar.b(yjVar3);
        yj yjVar4 = ykVar.M;
        yjVar4.h = yaVar.b(yjVar4);
        yaVar.f(ykVar.K.h, i4);
        yaVar.f(ykVar.M.h, iH);
        if (ykVar.aa > 0 || ykVar.ag == 8) {
            yj yjVar5 = ykVar.N;
            yjVar5.h = yaVar.b(yjVar5);
            yaVar.f(ykVar.N.h, ykVar.aa + i4);
        }
        ykVar.q = 2;
        ykVar.Z = i4;
        int i5 = iH - i4;
        ykVar.V = i5;
        int i6 = ykVar.ac;
        if (i5 < i6) {
            ykVar.V = i6;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
