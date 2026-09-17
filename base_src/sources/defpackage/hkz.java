package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hkz {
    public final long a;
    public final ojc b;
    public final float c;
    public final ojc d;
    public final float e;
    public final ojc f;
    public final ojc g;

    public hkz(ptd ptdVar, boolean z) {
        ojc ojcVarI;
        ojc ojcVarI2;
        float f;
        ojc ojcVarI3;
        poq poqVar = puj.j;
        ptdVar.j(poqVar);
        Object objK = ptdVar.h.k(poqVar.d);
        if (objK == null) {
            objK = poqVar.b;
        } else {
            poqVar.d(objK);
        }
        puj pujVar = (puj) objK;
        boolean z2 = false;
        if ((ptdVar.a & 128) != 0 && !z) {
            z2 = true;
        }
        this.a = (int) ptdVar.j;
        this.b = z2 ? ojc.i(Long.valueOf(ptdVar.k)) : oih.a;
        this.c = pujVar.d;
        float f2 = pujVar.e;
        float f3 = pujVar.f;
        if ((pujVar.a & 1) != 0) {
            pug pugVar = pujVar.b;
            ojcVarI = ojc.i(oom.j((pugVar == null ? pug.b : pugVar).a));
        } else {
            ojcVarI = oih.a;
        }
        this.g = ojcVarI;
        if ((pujVar.a & 2) != 0) {
            pug pugVar2 = pujVar.c;
            ojcVarI2 = ojc.i(oom.j((pugVar2 == null ? pug.b : pugVar2).a));
        } else {
            ojcVarI2 = oih.a;
        }
        this.f = ojcVarI2;
        int i = pujVar.a & 64;
        if (i != 0) {
            puk pukVar = pujVar.h;
            f = (pukVar == null ? puk.d : pukVar).c;
        } else {
            f = 0.0f;
        }
        this.e = f;
        if (i != 0) {
            puk pukVar2 = pujVar.h;
            ojcVarI3 = ojc.i(oom.j((pukVar2 == null ? puk.d : pukVar2).b));
        } else {
            ojcVarI3 = oih.a;
        }
        this.d = ojcVarI3;
    }
}
