package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class eet implements pys {
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

    public eet(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10) {
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
    }

    public static eet b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10) {
        return new eet(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ees get() {
        eew eewVar = (eew) this.a.get();
        ghx ghxVar = ((gjo) this.b).get();
        dzv dzvVar = ((dzw) this.c).get();
        pyn pynVarA = pyr.a(this.d);
        dxp dxpVar = (dxp) this.e.get();
        Executor executor = (Executor) this.f.get();
        ddf ddfVar = (ddf) this.g.get();
        ljf ljfVar = (ljf) this.h.get();
        gsf gsfVar = ((gsi) this.i).get();
        return new ees(eewVar, ghxVar, dzvVar, pynVarA, dxpVar, executor, ddfVar, ljfVar, gsfVar);
    }
}
