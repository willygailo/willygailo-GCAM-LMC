package defpackage;

import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class dht implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;
    private final qkg i;

    public dht(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
        this.i = qkgVar9;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dhs get() {
        final dhs dhsVar = new dhs((lar) this.b.get(), ((liq) this.c).get(), (ljf) this.d.get(), csm.d(), ((dhw) this.e).get(), ((bpk) this.f).a().booleanValue(), (ScheduledExecutorService) this.g.get(), (dia) this.h.get());
        ((bus) this.i.get()).a(new bur() { // from class: dhl
            @Override // defpackage.bur
            public final void a(Throwable th) {
                HashSet hashSet;
                dhs dhsVar2 = dhsVar;
                dhsVar2.d.h("Uncaught exception. Annotating all active shots.");
                dhsVar2.d.b("annotateAllActiveShots begin");
                synchronized (dhsVar2) {
                    hashSet = new HashSet(dhsVar2.j.keySet());
                }
                dhsVar2.h.j(hashSet, dhsVar2.f.instant());
                dhsVar2.d.b("annotateAllActiveShots end");
            }
        });
        return dhsVar;
    }
}
