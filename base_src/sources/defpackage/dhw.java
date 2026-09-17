package defpackage;

import j$.time.Duration;

/* JADX INFO: loaded from: classes.dex */
public final class dhw implements pys {
    private final qkg a;

    public dhw(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Duration get() {
        Duration durationOfSeconds = Duration.ofSeconds(((Integer) ((ddf) this.a.get()).a(ddl.q).e(30)).intValue());
        qmd.ae(durationOfSeconds);
        return durationOfSeconds;
    }
}
