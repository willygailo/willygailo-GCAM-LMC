package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fzo implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;

    public fzo(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ojc get() {
        Set set = ((pyw) this.a).get();
        ddf ddfVar = (ddf) this.b.get();
        if (!set.isEmpty()) {
            ddi ddiVar = dcu.a;
            ddfVar.b();
        }
        return oih.a;
    }
}
