package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class dqo {
    public static final ouj a = ouj.h("com/google/android/apps/camera/featurecentral/camera/FeatureCentralFrameConsumer");
    public final List b;
    public final ojc c;
    public final lbs d;
    private final ojc e;
    private final dql f;

    public dqo(Executor executor, ojc ojcVar, ojc ojcVar2, Set set, dql dqlVar) {
        this.d = mip.bI(executor);
        this.e = ojcVar;
        this.c = ojcVar2;
        List listA = dru.a(set);
        this.b = listA;
        listA.addAll(set);
        this.f = dqlVar;
    }

    final synchronized void a(lvp lvpVar, brg brgVar) {
        obr.aQ(this.c.g());
        obr.aQ(this.e.g());
        dru.c("frame", this.b);
        this.f.a = lvpVar;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((drt) it.next()).d(lvpVar, brgVar);
        }
        ((lmv) this.e.c()).k(new lmu() { // from class: dqm
            @Override // defpackage.lmu
            public final void a(lrr lrrVar) {
                final dqo dqoVar = this.a;
                final lmr lmrVarA = lrrVar.a();
                if (lmrVarA != null) {
                    new lbq(dqoVar.d, new ean(lmrVarA, 1), pgr.INSTANCE, 1).execute(new Runnable() { // from class: dqn
                        @Override // java.lang.Runnable
                        public final void run() {
                            dqo dqoVar2 = dqoVar;
                            lmr lmrVar = lmrVarA;
                            for (drt drtVar : dqoVar2.b) {
                                if (drtVar.e()) {
                                    drtVar.b(lmrVar, (lnx) dqoVar2.c.c());
                                }
                            }
                            lmrVar.close();
                        }
                    });
                }
            }
        });
    }

    final synchronized void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((drt) it.next()).a();
        }
    }
}
