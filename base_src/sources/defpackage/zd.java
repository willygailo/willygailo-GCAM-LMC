package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zd {
    public static int a;
    zg b;
    final ArrayList c = new ArrayList();

    public zd(zg zgVar) {
        this.b = null;
        a++;
        this.b = zgVar;
    }

    public final long a(yx yxVar, long j) {
        zg zgVar = yxVar.d;
        if (zgVar instanceof zb) {
            return j;
        }
        int size = yxVar.j.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            yv yvVar = (yv) yxVar.j.get(i);
            if (yvVar instanceof yx) {
                yx yxVar2 = (yx) yvVar;
                if (yxVar2.d != zgVar) {
                    jMin = Math.min(jMin, a(yxVar2, ((long) yxVar2.e) + j));
                }
            }
        }
        if (yxVar != zgVar.j) {
            return jMin;
        }
        long jA = j - zgVar.a();
        return Math.min(Math.min(jMin, a(zgVar.i, jA)), jA - ((long) zgVar.i.e));
    }

    public final long b(yx yxVar, long j) {
        zg zgVar = yxVar.d;
        if (zgVar instanceof zb) {
            return j;
        }
        int size = yxVar.j.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            yv yvVar = (yv) yxVar.j.get(i);
            if (yvVar instanceof yx) {
                yx yxVar2 = (yx) yvVar;
                if (yxVar2.d != zgVar) {
                    jMax = Math.max(jMax, b(yxVar2, ((long) yxVar2.e) + j));
                }
            }
        }
        if (yxVar != zgVar.i) {
            return jMax;
        }
        long jA = j + zgVar.a();
        return Math.max(Math.max(jMax, b(zgVar.j, jA)), jA - ((long) zgVar.j.e));
    }
}
