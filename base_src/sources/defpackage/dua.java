package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class dua implements pys {
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
    private final /* synthetic */ int r;

    public dua(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13, qkg qkgVar14, qkg qkgVar15, qkg qkgVar16, qkg qkgVar17, int i) {
        this.r = i;
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
    }

    public dua(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13, qkg qkgVar14, qkg qkgVar15, qkg qkgVar16, qkg qkgVar17, int i, byte[] bArr) {
        this.r = i;
        this.o = qkgVar;
        this.a = qkgVar2;
        this.h = qkgVar3;
        this.k = qkgVar4;
        this.d = qkgVar5;
        this.g = qkgVar6;
        this.i = qkgVar7;
        this.j = qkgVar8;
        this.n = qkgVar9;
        this.b = qkgVar10;
        this.e = qkgVar11;
        this.l = qkgVar12;
        this.p = qkgVar13;
        this.q = qkgVar14;
        this.c = qkgVar15;
        this.m = qkgVar16;
        this.f = qkgVar17;
    }

    public dua(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13, qkg qkgVar14, qkg qkgVar15, qkg qkgVar16, qkg qkgVar17, int i, char[] cArr) {
        this.r = i;
        this.b = qkgVar;
        this.q = qkgVar2;
        this.f = qkgVar3;
        this.d = qkgVar4;
        this.m = qkgVar5;
        this.c = qkgVar6;
        this.n = qkgVar7;
        this.l = qkgVar8;
        this.k = qkgVar9;
        this.h = qkgVar10;
        this.e = qkgVar11;
        this.p = qkgVar12;
        this.g = qkgVar13;
        this.o = qkgVar14;
        this.i = qkgVar15;
        this.j = qkgVar16;
        this.a = qkgVar17;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.r) {
            case 0:
                Context context = ((emd) this.a).get();
                boolean zBooleanValue = ((Boolean) this.b.get()).booleanValue();
                pyn pynVarA = pyr.a(this.c);
                ixj ixjVar = (ixj) this.d.get();
                dej dejVar = dej.RELEASE;
                qmd.ae(dejVar);
                return new dtz(context, zBooleanValue, pynVarA, ixjVar, dejVar, ((eti) this.e).get(), (hrd) this.f.get(), (fjs) this.g.get(), ((eme) this.h).get(), (lar) this.i.get(), ((juf) this.j).get(), (jnr) this.k.get(), (ivj) this.l.get(), pyr.a(this.m), ((dtr) this.n).get(), (bqh) this.o.get(), (huf) this.p.get(), ((bpk) this.q).a().booleanValue(), null, null);
            case 1:
                ((emt) this.o).get();
                return new cnd(this.a, ((cie) this.h).get(), ((cjc) this.k).a(), (cmm) this.d.get(), (phv) this.g.get(), (ScheduledExecutorService) this.i.get(), ((cpk) this.j).get(), (ljf) this.n.get(), this.b, (fix) this.e.get(), (nvb) this.l.get(), (cvh) this.p.get(), ((cnr) this.q).get(), (cux) this.c.get(), (ddf) this.m.get(), ((cnv) this.f).get(), null, null);
            default:
                return new eqx(efb.c(), (lce) this.b.get(), (lda) this.q.get(), (erk) this.f.get(), (Executor) this.d.get(), (pko) this.m.get(), (pjl) this.c.get(), ((erq) this.n).get(), (ead) this.l.get(), (ddf) this.k.get(), ((lhr) this.h).get(), (jtx) this.e.get(), (huf) this.p.get(), (ljf) this.g.get(), ((fsr) this.o).b(), (hgm) this.i.get(), ((hoi) this.j).get(), (bui) this.a.get(), null);
        }
    }
}
