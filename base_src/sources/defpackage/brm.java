package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class brm implements bse {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public brm(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        qkgVar.getClass();
        this.a = qkgVar;
        qkgVar2.getClass();
        this.b = qkgVar2;
        qkgVar3.getClass();
        this.c = qkgVar3;
    }

    @Override // defpackage.bse
    public final /* synthetic */ bsd a(brk brkVar) {
        elw elwVar = (elw) this.a.get();
        elwVar.getClass();
        Context context = ((emd) this.b).get();
        ddf ddfVar = (ddf) this.c.get();
        ddfVar.getClass();
        return new brl(elwVar, context, ddfVar, brkVar);
    }
}
