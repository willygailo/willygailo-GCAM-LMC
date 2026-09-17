package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ggr implements pys {
    private final qkg a;
    private final qkg b;

    public ggr(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static ggr a(qkg qkgVar, qkg qkgVar2) {
        return new ggr(qkgVar, qkgVar2);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lbi get() {
        return new lbi((ScheduledExecutorService) this.a.get(), ((cbe) this.b).a().intValue(), TimeUnit.SECONDS);
    }
}
