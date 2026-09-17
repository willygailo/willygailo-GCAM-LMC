package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cjl implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;
    private final qkg i;

    public cjl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
        this.i = qkgVar9;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cjk get() {
        cka ckaVar = (cka) this.a.get();
        bod bodVar = (bod) this.b.get();
        ggo ggoVar = (ggo) this.c.get();
        bta btaVar = (bta) this.d.get();
        koq koqVarC = bpw.c();
        boolean zBooleanValue = ((bpk) this.e).a().booleanValue();
        dha dhaVar = (dha) this.f.get();
        ddf ddfVar = (ddf) this.h.get();
        return new cjk(ckaVar, bodVar, ggoVar, btaVar, koqVarC, zBooleanValue, dhaVar, ddfVar, null);
    }
}
