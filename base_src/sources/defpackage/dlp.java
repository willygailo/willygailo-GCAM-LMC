package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class dlp implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public dlp(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dlo get() {
        Context contextA = ((emp) this.a).a();
        ddf ddfVar = (ddf) this.b.get();
        ((djt) this.c).get();
        return new dlo(contextA, ddfVar, ((dgb) this.d).get());
    }
}
