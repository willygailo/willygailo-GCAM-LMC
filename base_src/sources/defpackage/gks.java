package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gks implements gmu {
    public final Executor a;

    public gks(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.gmu
    public final gmt a(gog gogVar) {
        return new gkr(this, gogVar.b);
    }

    @Override // defpackage.gmu
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final gkr b(gog gogVar) {
        return new gkr(this, gogVar.b);
    }
}
