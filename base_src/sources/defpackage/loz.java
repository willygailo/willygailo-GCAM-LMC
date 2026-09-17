package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class loz extends mip implements lie {
    private final lot a;
    private final loy b;
    private final lqn c;
    private final Set d;
    private Set g;
    private Set h = null;
    private boolean i = false;
    private boolean j = false;
    private final boolean k;

    public loz(lot lotVar, loy loyVar, lqn lqnVar, ope opeVar, Set set, Set set2) {
        this.a = lotVar;
        this.b = loyVar;
        this.c = lqnVar;
        this.d = set;
        this.g = ope.F(set2);
        this.k = opeVar.contains(lns.ABORT_FRAME_ON_FAILURE_BEFORE_START);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.i) {
                return;
            }
            this.i = true;
            Set set = this.g;
            this.g = null;
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((lqh) it.next()).g();
            }
        }
    }

    @Override // defpackage.mip
    public final synchronized void fJ(lmw lmwVar) {
        Set<lqh> setC;
        this.j = true;
        Set<lnx> set = this.h;
        set.getClass();
        obr.aR(!this.i, "on started invoked after FrameDistributor was closed!");
        lap lapVar = new lap();
        try {
            lapVar.c(this.a.a());
            for (lnx lnxVar : set) {
                if (lnxVar instanceof ltw) {
                    lapVar.c(((ltw) lnxVar).b.a());
                }
            }
            Set set2 = this.g;
            this.g = null;
            if (set2 == null || set2.isEmpty()) {
                setC = this.a.c(this.d);
            } else {
                setC = this.a.d(this.d, set2);
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    obr.aQ(setC.contains((lqh) it.next()));
                }
            }
            HashMap map = new HashMap();
            HashSet hashSet = new HashSet();
            for (lqh lqhVar : setC) {
                for (lnx lnxVar2 : lqhVar.c.c) {
                    if ((lnxVar2 instanceof lui) && ((lui) lnxVar2).h() == loa.IMAGE_READER) {
                        hashSet.add(lqhVar.c(lnxVar2));
                    }
                }
                lqhVar.i(lmwVar);
                map.put(lqhVar.c, lqhVar);
            }
            this.c.x(setC);
            Iterator it2 = hashSet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                lun lunVar = (lun) it2.next();
                lnx lnxVarD = lunVar.d();
                if (lnxVarD instanceof ltw) {
                    if (set.contains(lnxVarD)) {
                        lug lugVar = ((ltw) lnxVarD).a;
                        obr.aF(lunVar.d().a() == lugVar.b);
                        obr.aF(lugVar.c.equals(lunVar.d().b()));
                        lugVar.j.add(lunVar);
                        lugVar.d.execute(lugVar.e);
                    } else {
                        lunVar.k(null);
                    }
                }
            }
            loy loyVar = this.b;
            Set setKeySet = map.keySet();
            opc opcVar = new opc();
            synchronized (loyVar) {
                for (low lowVar : loyVar.b) {
                    if (setKeySet.contains(lowVar.h)) {
                        opcVar.d(lowVar);
                    }
                }
            }
            for (final low lowVar2 : opcVar.f()) {
                lqh lqhVar2 = (lqh) map.get(lowVar2.h);
                lqhVar2.getClass();
                final lrr lrrVar = new lrr(lqhVar2.c, lqhVar2, lqhVar2.a(false));
                obr.aG(lrrVar.b == lowVar2.h, "Frame does not match source!");
                synchronized (lowVar2) {
                    if (lowVar2.g) {
                        lrrVar.c();
                    } else {
                        lowVar2.b.addLast(lrrVar);
                        if (lrrVar.d()) {
                            lowVar2.d.addLast(lrrVar);
                        } else {
                            lowVar2.c.addLast(lrrVar);
                        }
                        lowVar2.s();
                        synchronized (lowVar2.f) {
                            Iterator it3 = lowVar2.f.iterator();
                            while (it3.hasNext()) {
                                ((lms) it3.next()).a(lrrVar);
                            }
                        }
                        lowVar2.a.execute(new Runnable() { // from class: lov
                            @Override // java.lang.Runnable
                            public final void run() {
                                low lowVar3 = lowVar2;
                                lrr lrrVar2 = lrrVar;
                                synchronized (lowVar3.e) {
                                    Iterator it4 = lowVar3.e.iterator();
                                    while (it4.hasNext()) {
                                        ((lmu) it4.next()).a(lrrVar2);
                                    }
                                }
                            }
                        });
                    }
                }
            }
            Iterator it4 = setC.iterator();
            while (it4.hasNext()) {
                ((lqh) it4.next()).g();
            }
            if (set2 != null && !set2.isEmpty()) {
                close();
            }
            lapVar.close();
        } catch (Throwable th) {
            try {
                lapVar.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    @Override // defpackage.mip
    public final synchronized void fv(lnx lnxVar, long j) {
        Set<lnx> set = this.h;
        set.getClass();
        for (lnx lnxVar2 : set) {
            if (lnxVar == lnxVar2 && (lnxVar2 instanceof ltw)) {
                ((ltw) lnxVar2).a.c(lnxVar, j);
            }
        }
    }

    @Override // defpackage.mip
    public final synchronized void fw(lux luxVar) {
        Set<lqh> set = this.g;
        if (set != null) {
            boolean z = false;
            if (luxVar != null && luxVar.c()) {
                z = true;
            }
            if ((this.k && !this.j) || !z) {
                for (lqh lqhVar : set) {
                    lqhVar.g();
                    lqhVar.f();
                }
                this.g = null;
            }
        }
    }

    @Override // defpackage.mip
    public final synchronized void l(long j, Set set) {
        this.h = set;
    }
}
