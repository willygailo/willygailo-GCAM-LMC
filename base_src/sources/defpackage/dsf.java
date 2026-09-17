package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dsf implements dqs {
    public final lxb a;
    public final Object b = new Object();
    public lxa c;
    public final dsz d;

    public dsf(lxb lxbVar, dsz dszVar) {
        this.a = lxbVar;
        this.d = dszVar;
    }

    @Override // defpackage.dqs
    public final void b(lmr lmrVar, lnx lnxVar) {
        lmw lmwVarB;
        synchronized (this.b) {
            lxa lxaVar = this.c;
            if (lxaVar != null && (lmwVarB = lmrVar.b()) != null) {
                final long j = lmwVarB.b;
                lxaVar.b((-3000000) + j, 3000000 + j, new lwz() { // from class: dse
                    @Override // defpackage.lwz
                    public final void a(List list) {
                        lxc lxcVar;
                        dsf dsfVar = this.a;
                        long j2 = j;
                        if (list.size() > 10) {
                            ((oug) ((oug) dyq.a.c()).G((char) 993)).o("Warning: Samples used for vector determination is larger than 10 elements. This code is O(n) and expects small list sizes!");
                        }
                        Iterator it = list.iterator();
                        float[] fArr = null;
                        lxc lxcVar2 = null;
                        while (true) {
                            if (!it.hasNext()) {
                                lxcVar = null;
                                break;
                            }
                            lxcVar = (lxc) it.next();
                            boolean z = lxcVar2 == null || lxcVar.e > lxcVar2.e;
                            obr.aG(z, "samples must be sorted ascending in time");
                            if (lxcVar.e > j2) {
                                break;
                            } else {
                                lxcVar2 = lxcVar;
                            }
                        }
                        if (lxcVar2 == null) {
                            if (lxcVar != null) {
                                fArr = new float[]{lxcVar.f, lxcVar.g, lxcVar.h};
                            }
                        } else if (lxcVar == null) {
                            fArr = new float[]{lxcVar2.f, lxcVar2.g, lxcVar2.h};
                        } else {
                            long j3 = lxcVar2.e;
                            double d = j2 - j3;
                            double d2 = lxcVar.e - j3;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            double d3 = d / d2;
                            fArr = new float[]{dyq.a(lxcVar2.f, lxcVar.f, d3), dyq.a(lxcVar2.g, lxcVar.g, d3), dyq.a(lxcVar2.h, lxcVar.h, d3)};
                        }
                        if (fArr != null) {
                            dsfVar.d.h(j2, fArr);
                        }
                    }
                });
            }
        }
    }
}
