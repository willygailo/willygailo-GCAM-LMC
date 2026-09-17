package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class dlo {
    private final Context a;
    private final ddf b;
    private final lis c;

    public dlo(Context context, ddf ddfVar, lir lirVar) {
        this.a = context;
        this.b = ddfVar;
        this.c = lirVar.a("ShotFailureHdlr");
    }

    public final void a(dmc dmcVar) {
        this.c.i("Shot Exception!", dmcVar);
        buk.a(this.a, dmcVar);
        ddf ddfVar = this.b;
        ddi ddiVar = ddl.a;
        ddfVar.d();
    }
}
