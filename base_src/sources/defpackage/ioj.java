package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ioj implements Runnable {
    public final /* synthetic */ ioq a;
    private final /* synthetic */ int b;

    public /* synthetic */ ioj(ioq ioqVar, int i) {
        this.b = i;
        this.a = ioqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ioq ioqVar = this.a;
                ldv ldvVar = ioqVar.ad;
                synchronized (ldvVar.d) {
                    obr.aN(ldvVar.e == ldu.READY, "%s is expected but we get %s", ldu.READY, ldvVar.e);
                    ldvVar.e = ldu.STARTED;
                    plk.af(ldvVar.a.j(ldvVar.f), new ldq(ldvVar, 1), ldvVar.b);
                    break;
                }
                if (ioqVar.d.k(deg.d)) {
                    ioqVar.c();
                } else {
                    ink inkVar = ioqVar.l;
                    inkVar.c.set(false);
                    inkVar.d.set(false);
                    inkVar.b.set(false);
                    inkVar.i.set(0L);
                    inkVar.j.set(0L);
                    inkVar.k.set(0L);
                    inkVar.h.set(0);
                    inkVar.l.set(0L);
                    inkVar.g.set(0);
                    inkVar.o.set(0L);
                    inkVar.q.set(0L);
                    inkVar.r.set(0L);
                    inkVar.t.set(0L);
                    inkVar.m.set(0L);
                    inkVar.n.set(0L);
                    inkVar.e.set(true);
                    inkVar.I = oih.a;
                    ioqVar.l.N = ioqVar.ad;
                }
                inx inxVar = ioqVar.u;
                inxVar.b.set(true);
                if (((Boolean) ((lce) inxVar.f.c()).d).booleanValue()) {
                    inxVar.e.set(true);
                    return;
                } else {
                    inxVar.o.o(false);
                    return;
                }
            case 1:
                this.a.ad.a();
                return;
            default:
                ioq ioqVar2 = this.a;
                Iterator it = ioqVar2.F.iterator();
                while (it.hasNext()) {
                    ioqVar2.C.g(((hsq) it.next()).b, null);
                }
                return;
        }
    }
}
