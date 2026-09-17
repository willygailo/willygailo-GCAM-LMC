package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class jjc implements pys {
    private final qkg a;
    private final qkg b;

    public jjc(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jjb get() {
        return new jjb((ScheduledExecutorService) this.a.get(), ((emy) this.b).get());
    }
}
