package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hdj implements pys {
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
    private final qkg m;
    private final qkg n;
    private final qkg o;
    private final qkg p;
    private final qkg q;
    private final qkg r;

    public hdj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13, qkg qkgVar14, qkg qkgVar15, qkg qkgVar16, qkg qkgVar17, qkg qkgVar18) {
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
        this.m = qkgVar13;
        this.n = qkgVar14;
        this.o = qkgVar15;
        this.p = qkgVar16;
        this.q = qkgVar17;
        this.r = qkgVar18;
    }

    public static hdj b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13, qkg qkgVar14, qkg qkgVar15, qkg qkgVar16, qkg qkgVar17, qkg qkgVar18) {
        return new hdj(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10, qkgVar11, qkgVar12, qkgVar13, qkgVar14, qkgVar15, qkgVar16, qkgVar17, qkgVar18);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hdb get() {
        lap lapVar = (lap) this.a.get();
        lnc lncVar = (lnc) this.b.get();
        lis lisVar = ((liq) this.c).get();
        goi goiVar = (goi) this.d.get();
        lar larVar = (lar) this.e.get();
        return new hdb(lapVar, lncVar, lisVar, goiVar, larVar, (ggo) this.g.get(), (lco) this.h.get(), (lco) this.i.get(), (lco) this.j.get(), (lco) this.k.get(), (pht) this.l.get(), (Executor) this.m.get(), ((gna) this.n).get(), (lbu) this.o.get(), (bmq) this.p.get(), (gqs) this.q.get(), (dkg) this.r.get());
    }
}
