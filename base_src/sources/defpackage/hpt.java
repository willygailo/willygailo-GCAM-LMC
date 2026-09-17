package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hpt implements hpr {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;
    private final qkg i;

    public hpt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9) {
        qkgVar.getClass();
        this.a = qkgVar;
        qkgVar2.getClass();
        this.b = qkgVar2;
        qkgVar3.getClass();
        this.c = qkgVar3;
        qkgVar4.getClass();
        this.d = qkgVar4;
        qkgVar5.getClass();
        this.e = qkgVar5;
        qkgVar6.getClass();
        this.f = qkgVar6;
        qkgVar7.getClass();
        this.g = qkgVar7;
        qkgVar8.getClass();
        this.h = qkgVar8;
        qkgVar9.getClass();
        this.i = qkgVar9;
    }

    @Override // defpackage.hpr
    public final hps a(hsr hsrVar, String str, bww bwwVar, hsg hsgVar, hhl hhlVar, ojc ojcVar) {
        Executor executor = (Executor) this.a.get();
        executor.getClass();
        Object obj = this.b.get();
        hqb hqbVarA = hrf.a();
        iik iikVar = ((iil) this.c).get();
        dib dibVar = (dib) this.d.get();
        dibVar.getClass();
        hrx hrxVar = (hrx) this.e.get();
        hrxVar.getClass();
        jtx jtxVar = (jtx) this.f.get();
        jtxVar.getClass();
        ((fw) this.g.get()).getClass();
        ((lar) this.h.get()).getClass();
        ((ddf) this.i.get()).getClass();
        hsrVar.getClass();
        return new hps(executor, (hrc) obj, hqbVarA, iikVar, dibVar, hrxVar, jtxVar, hsrVar, str, bwwVar, hsgVar, hhlVar, ojcVar);
    }
}
