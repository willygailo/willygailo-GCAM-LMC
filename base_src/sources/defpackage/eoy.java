package defpackage;

import com.google.googlex.gcam.BurstSpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class eoy implements epc, eby {
    private static final ouj b = ouj.h("com/google/android/apps/camera/kepler/AstrolapseProcessorImpl");
    public final Map a = new HashMap();
    private final dzv c;
    private final eam d;
    private final Executor e;
    private final int f;
    private final eon g;
    private final ddf h;
    private final eoz i;
    private int j;
    private boolean k;
    private final nvb l;

    public eoy(dzv dzvVar, eam eamVar, nvb nvbVar, eon eonVar, eoz eozVar, ddf ddfVar, Executor executor, byte[] bArr, byte[] bArr2) {
        this.c = dzvVar;
        this.d = eamVar;
        this.g = eonVar;
        this.i = eozVar;
        this.l = nvbVar;
        this.e = executor;
        this.j = ((Integer) ddfVar.a(ddm.s).e(15)).intValue();
        this.f = ((Integer) ddfVar.a(ddm.u).e(150000)).intValue();
        this.h = ddfVar;
    }

    private final void l(edd eddVar, String str) {
        eox eoxVar = (eox) this.a.get(eddVar);
        if (eoxVar != null && eoxVar.c.get()) {
            this.g.a(eddVar);
        }
        j(eddVar, str);
    }

    @Override // defpackage.eby
    public final /* synthetic */ void b(iin iinVar, dzx dzxVar) {
    }

    @Override // defpackage.eby
    public final void c(edd eddVar, ebr ebrVar) {
        this.k = false;
        l(eddVar, ebrVar.getMessage());
    }

    @Override // defpackage.eav
    public final void d(hsp hspVar) {
        edd eddVar;
        ovd ovdVar = ovl.a;
        int i = hspVar.a;
        Iterator it = this.a.keySet().iterator();
        do {
            if (!it.hasNext()) {
                eddVar = null;
                break;
            }
            eddVar = (edd) it.next();
        } while (!eddVar.c.b.h().equals(hspVar));
        if (eddVar == null) {
            return;
        }
        l(eddVar, "Shot aborted.");
    }

    @Override // defpackage.eav
    public final void e(edd eddVar, lmr lmrVar) {
        eox eoxVar = (eox) this.a.get(eddVar);
        if (!this.d.n() || eoxVar == null) {
            lmrVar.close();
            return;
        }
        hdv hdvVar = eoxVar.a;
        if (hdvVar.j >= this.j) {
            lmrVar.close();
            return;
        }
        ovd ovdVar = ovl.a;
        hdvVar.c(lmrVar);
        boolean z = this.k;
        if (!this.h.k(ddm.al)) {
            z &= eoxVar.a.j == this.j;
        }
        if (z) {
            if (!eoxVar.c.getAndSet(true)) {
                pih pihVarF = pih.f();
                eon eonVar = this.g;
                edd eddVar2 = eoxVar.b;
                hdv hdvVar2 = eoxVar.a;
                int i = this.j;
                epb epbVar = eoxVar.d;
                epbVar.a(epbVar.a.a);
                eonVar.c(eddVar2, hdvVar2, i, epbVar.a.a, pihVarF);
                plk.af(pihVarF, new eow(this, eoxVar), this.e);
            }
            this.g.d(eoxVar.b);
        }
    }

    @Override // defpackage.eav
    public final void f(edd eddVar, BurstSpec burstSpec, lzv lzvVar) {
        if (this.d.n()) {
            ovd ovdVar = ovl.a;
            obr.aQ(!this.a.containsKey(eddVar));
            Map map = this.a;
            dzu dzuVarA = this.c.a();
            eoz eozVar = this.i;
            hsa hsaVar = eddVar.c.b;
            ddf ddfVar = eozVar.b;
            ddi ddiVar = ddm.a;
            ddfVar.e();
            map.put(eddVar, new eox(new hdv(eddVar.c, dzuVarA, burstSpec, lzvVar), eddVar, new AtomicBoolean(), new epb(eozVar.a, eozVar.c, hsaVar.k())));
            if (burstSpec != null) {
                this.j = Math.min((int) burstSpec.b().a(), this.j);
            }
        }
    }

    @Override // defpackage.eav
    public final void g(hsp hspVar) {
        this.l.f(hspVar).e(this);
    }

    @Override // defpackage.eav
    public final void h(edd eddVar) {
        ovd ovdVar = ovl.a;
        eddVar.a();
        eox eoxVar = (eox) this.a.get(eddVar);
        if (eoxVar != null) {
            if (eoxVar.c.get() && eoxVar.a.j < this.j) {
                l(eddVar, "Kelper not produced since not enough frames.");
            } else {
                if (eoxVar.c.get()) {
                    return;
                }
                j(eddVar, "Kepler was never initiated.");
            }
        }
    }

    @Override // defpackage.eav
    public final /* synthetic */ void i(edd eddVar) {
    }

    public final void j(edd eddVar, String str) {
        oug ougVar = (oug) ((oug) b.c().g(ovl.a, "KeplerProcessorImpl")).G(1321);
        int iA = eddVar.a();
        if (str == null) {
            str = "Unknown";
        }
        ougVar.t("Shot cancelled. Shot id: %d. Reason: %s", iA, str);
        eox eoxVar = (eox) this.a.remove(eddVar);
        if (eoxVar != null) {
            eoxVar.a.b();
            epb epbVar = eoxVar.d;
            epbVar.a.b();
            epbVar.b.d();
            ((iik) epbVar.c).u.o(null);
        }
    }

    @Override // defpackage.epc
    public final synchronized void k(long j) {
        ovd ovdVar = ovl.a;
        if (j >= this.f) {
            this.k = true;
        }
    }

    @Override // defpackage.eby
    public final void s(edd eddVar) {
        this.k = false;
        d(eddVar.c.b.h());
    }
}
