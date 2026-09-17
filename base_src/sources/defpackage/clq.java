package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class clq implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;
    private final qkg i;
    private final qkg j;
    private final qkg k;
    private final qkg l;
    private final /* synthetic */ int m;

    public clq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, int i) {
        this.m = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
        this.i = qkgVar9;
        this.j = qkgVar10;
        this.k = qkgVar11;
        this.l = qkgVar12;
    }

    public clq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, int i, byte[] bArr) {
        this.m = i;
        this.f = qkgVar;
        this.h = qkgVar2;
        this.k = qkgVar3;
        this.j = qkgVar4;
        this.g = qkgVar5;
        this.a = qkgVar6;
        this.e = qkgVar7;
        this.l = qkgVar8;
        this.b = qkgVar9;
        this.i = qkgVar10;
        this.c = qkgVar11;
        this.d = qkgVar12;
    }

    public clq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, int i, char[] cArr) {
        this.m = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.l = qkgVar3;
        this.e = qkgVar4;
        this.j = qkgVar5;
        this.a = qkgVar6;
        this.f = qkgVar7;
        this.h = qkgVar8;
        this.k = qkgVar9;
        this.d = qkgVar10;
        this.g = qkgVar11;
        this.i = qkgVar12;
    }

    public clq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, int i, float[] fArr) {
        this.m = i;
        this.j = qkgVar;
        this.l = qkgVar2;
        this.g = qkgVar3;
        this.k = qkgVar4;
        this.b = qkgVar5;
        this.h = qkgVar6;
        this.e = qkgVar7;
        this.d = qkgVar8;
        this.c = qkgVar9;
        this.f = qkgVar10;
        this.a = qkgVar11;
        this.i = qkgVar12;
    }

    public clq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, int i, int[] iArr) {
        this.m = i;
        this.j = qkgVar;
        this.c = qkgVar2;
        this.e = qkgVar3;
        this.a = qkgVar4;
        this.i = qkgVar5;
        this.k = qkgVar6;
        this.b = qkgVar7;
        this.f = qkgVar8;
        this.g = qkgVar9;
        this.d = qkgVar10;
        this.h = qkgVar11;
        this.l = qkgVar12;
    }

    public clq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, int i, short[] sArr) {
        this.m = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.h = qkgVar3;
        this.f = qkgVar4;
        this.d = qkgVar5;
        this.g = qkgVar6;
        this.j = qkgVar7;
        this.e = qkgVar8;
        this.a = qkgVar9;
        this.l = qkgVar10;
        this.i = qkgVar11;
        this.k = qkgVar12;
    }

    public clq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, int i, boolean[] zArr) {
        this.m = i;
        this.h = qkgVar;
        this.f = qkgVar2;
        this.b = qkgVar3;
        this.j = qkgVar4;
        this.g = qkgVar5;
        this.l = qkgVar6;
        this.k = qkgVar7;
        this.c = qkgVar8;
        this.i = qkgVar9;
        this.a = qkgVar10;
        this.e = qkgVar11;
        this.d = qkgVar12;
    }

    public clq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, int i, byte[][] bArr) {
        this.m = i;
        this.j = qkgVar;
        this.i = qkgVar2;
        this.e = qkgVar3;
        this.f = qkgVar4;
        this.d = qkgVar5;
        this.g = qkgVar6;
        this.h = qkgVar7;
        this.b = qkgVar8;
        this.a = qkgVar9;
        this.c = qkgVar10;
        this.k = qkgVar11;
        this.l = qkgVar12;
    }

    public static clq a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12) {
        return new clq(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10, qkgVar11, qkgVar12, 5, (boolean[]) null);
    }

    public static clq b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12) {
        return new clq(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10, qkgVar11, qkgVar12, 6, (float[]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.m) {
            case 0:
                return new clp((lqv) this.a.get(), ((chb) this.b).get(), this.c, ((cva) this.d).get(), ((hlj) this.e).a(), (cif) this.f.get(), ((cmg) this.g).get(), (nvb) this.h.get(), (ddf) this.i.get(), (cxz) this.j.get(), ((ckr) this.k).get(), ((coy) this.l).get(), null, null);
            case 1:
                return new chw(this.f, this.h, this.k, this.j, this.g, this.a, this.e, this.b, this.i, this.c, this.d);
            case 2:
                return new dff(((emd) this.c).get(), ((etg) this.b).get(), (dfx) this.l.get(), (dga) this.e.get(), ((dft) this.j).get(), (ljf) this.a.get(), (ddf) this.f.get(), (Executor) this.h.get(), (hpu) this.k.get(), ((Boolean) this.d.get()).booleanValue(), (huf) this.g.get(), (dfm) this.i.get());
            case 3:
                return new ejd((egs) this.b.get(), (egy) this.c.get(), (ejm) this.h.get(), (ehw) this.f.get(), (eij) this.d.get(), ((eis) this.g).get(), ((eio) this.j).get(), (eja) this.e.get(), ((eiu) this.a).get(), (eip) this.l.get(), ((eim) this.i).get(), ((emd) this.k).get());
            case 4:
                lbk lbkVar = (lbk) this.j.get();
                qkg qkgVar = this.c;
                qkg qkgVar2 = this.e;
                qkg qkgVar3 = this.a;
                qkg qkgVar4 = this.i;
                qkg qkgVar5 = this.k;
                qkg qkgVar6 = this.b;
                Executor executorA = ((bwq) this.f).a();
                return new etl(lbkVar, qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, executorA, ((dgb) this.d).get(), ((lbm) this.h).get(), (ljf) this.l.get());
            case 5:
                return new fnt((Executor) this.h.get(), (lnc) this.f.get(), ((gjo) this.b).get(), (imt) this.j.get(), ((ing) this.g).a(), (AtomicBoolean) this.l.get(), ((gjp) this.k).get(), (lzi) this.c.get(), ((gxn) this.i).get(), (AtomicBoolean) this.a.get(), (ljf) this.e.get(), (ddf) this.d.get());
            case 6:
                return new fsf((dyx) this.j.get(), (ftz) this.l.get(), (dvp) this.g.get(), ((evv) this.k).a(), ((evv) this.b).a(), (Executor) this.h.get(), (lig) this.e.get(), (hkr) this.d.get(), (hkk) this.c.get(), ((frz) this.f).get(), ((fsh) this.a).get(), eyi.c(), (ddf) this.i.get());
            default:
                return new ghv(this.j, this.i, this.e, this.f, this.d, this.g, this.h, this.b, this.a, this.c, this.k, this.l);
        }
    }
}
