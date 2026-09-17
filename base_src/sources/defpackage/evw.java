package defpackage;

import j$.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final class evw implements qkg {
    private final qkg a;

    public evw(qkg qkgVar) {
        qkgVar.getClass();
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Optional get() {
        return Optional.of(this.a.get());
    }
}
