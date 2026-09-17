package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class joa implements pys {
    private final jnu a;
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

    public joa(jnu jnuVar, qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13, qkg qkgVar14) {
        this.a = jnuVar;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.d = qkgVar3;
        this.e = qkgVar4;
        this.f = qkgVar5;
        this.g = qkgVar6;
        this.h = qkgVar7;
        this.i = qkgVar8;
        this.j = qkgVar9;
        this.k = qkgVar10;
        this.l = qkgVar11;
        this.m = qkgVar12;
        this.n = qkgVar13;
        this.o = qkgVar14;
    }

    @Override // defpackage.qkg
    public final /* bridge */ /* synthetic */ Object get() {
        jnu jnuVar = this.a;
        Context context = ((emd) this.b).get();
        bqg bqgVar = ((etg) this.c).get();
        fhv fhvVar = ((etf) this.d).get();
        Map map = ((pyu) this.e).get();
        boolean zBooleanValue = ((jui) this.f).get().booleanValue();
        ddf ddfVar = (ddf) this.g.get();
        pyn pynVarA = pyr.a(this.h);
        pyn pynVarA2 = pyr.a(this.i);
        qkg qkgVar = this.j;
        jlb jlbVar = (jlb) this.k.get();
        lar larVar = (lar) this.l.get();
        ljf ljfVar = (ljf) this.m.get();
        elw elwVar = (elw) this.n.get();
        huj hujVar = (huj) this.o.get();
        lap lapVarI = bqgVar.i();
        Map mapEmptyMap = zBooleanValue ? Collections.emptyMap() : map;
        jns jnsVar = jnuVar.b;
        jgk jgkVar = new jgk(context, lapVarI, mapEmptyMap, jnsVar.i, jnsVar.m, jlbVar, ddfVar, pynVarA, pynVarA2, qkgVar, larVar, ljfVar, elwVar, hujVar);
        enl.f(larVar, fhvVar, jgkVar);
        return jgkVar;
    }
}
