package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class bwn implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public bwn(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public final ExecutorService a() {
        switch (this.b) {
            case 0:
                return bwk.h((ScheduledExecutorService) this.a.get());
            case 1:
                return bwk.g((ScheduledExecutorService) this.a.get());
            default:
                phv phvVar = (phv) this.a.get();
                ScheduledExecutorService scheduledExecutorService = bwk.a;
                qmd.ae(phvVar);
                return phvVar;
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
        }
        return a();
    }
}
