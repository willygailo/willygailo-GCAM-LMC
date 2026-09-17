package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hla {
    public final hkz[] a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;

    public hla(pud pudVar) {
        this.b = pudVar.j;
        puc pucVar = pudVar.i;
        float f = (pucVar == null ? puc.i : pucVar).e;
        puc pucVar2 = pudVar.i;
        this.c = (pucVar2 == null ? puc.i : pucVar2).g;
        puc pucVar3 = pudVar.i;
        this.d = (pucVar3 == null ? puc.i : pucVar3).f;
        puc pucVar4 = pudVar.i;
        this.e = (pucVar4 == null ? puc.i : pucVar4).h;
        this.f = pudVar.c;
        pte pteVar = pudVar.e;
        pteVar = pteVar == null ? pte.b : pteVar;
        this.a = new hkz[pteVar.a.size()];
        int i = 0;
        while (true) {
            hkz[] hkzVarArr = this.a;
            if (i >= hkzVarArr.length) {
                return;
            }
            hkzVarArr[i] = new hkz((ptd) pteVar.a.get(i), pudVar.g);
            i++;
        }
    }
}
