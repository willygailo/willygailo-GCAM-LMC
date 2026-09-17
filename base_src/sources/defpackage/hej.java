package defpackage;

import com.google.googlex.gcam.BurstSpec;
import j$.util.Map;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hej implements eav, ebn, eby {
    private final hcg a;
    private final HashMap b = new HashMap();
    private final ljf c;
    private final nvb d;

    public hej(hcg hcgVar, nvb nvbVar, ljf ljfVar, byte[] bArr, byte[] bArr2) {
        this.a = hcgVar;
        this.d = nvbVar;
        this.c = ljfVar;
    }

    @Override // defpackage.ebn
    public final void a(edd eddVar, int i, long j, lzv lzvVar) {
        HashMap map;
        mad madVar;
        new HashMap();
        synchronized (this) {
            if (!this.b.containsKey(eddVar)) {
                throw new IllegalStateException("Shot hasn't been started yet!");
            }
            map = (HashMap) this.b.remove(eddVar);
        }
        this.c.e("onBaseFrameSelected#getCandidate");
        if (map != null) {
            Long lValueOf = Long.valueOf(j);
            if (map.containsKey(lValueOf) && (madVar = (mad) map.remove(lValueOf)) != null) {
                this.c.g("processBaseFrameImage");
                k(eddVar, madVar);
            }
        }
        this.c.g("clear");
        if (map != null) {
            Map.EL.forEach(map, hei.a);
            map.clear();
        }
        this.c.f();
    }

    @Override // defpackage.eby
    public final /* synthetic */ void b(iin iinVar, dzx dzxVar) {
    }

    @Override // defpackage.eby
    public final void c(edd eddVar, ebr ebrVar) {
        j(eddVar);
    }

    @Override // defpackage.eav
    public final synchronized void d(hsp hspVar) {
        edd eddVar;
        Iterator it = this.b.keySet().iterator();
        do {
            if (!it.hasNext()) {
                eddVar = null;
                break;
            }
            eddVar = (edd) it.next();
        } while (!eddVar.c.b.h().equals(hspVar));
        if (eddVar != null) {
            j(eddVar);
        }
    }

    @Override // defpackage.eav
    public final synchronized void e(edd eddVar, lmr lmrVar) {
        if (this.b.containsKey(eddVar)) {
            mad madVarG = this.a.a(lmrVar).g();
            lmw lmwVarB = lmrVar.b();
            if (lmwVarB != null) {
                ((HashMap) this.b.get(eddVar)).put(Long.valueOf(lmwVarB.b), madVarG);
            }
        }
        lmrVar.close();
    }

    @Override // defpackage.eav
    public final synchronized void f(edd eddVar, BurstSpec burstSpec, lzv lzvVar) {
        this.b.put(eddVar, new HashMap());
    }

    @Override // defpackage.eav
    public final void g(hsp hspVar) {
        ede edeVarF = this.d.f(hspVar);
        edeVarF.a(new ebn() { // from class: heh
            @Override // defpackage.ebn
            public final void a(edd eddVar, int i, long j, lzv lzvVar) {
                this.a.a(eddVar, i, j, lzvVar);
            }
        });
        edeVarF.e(this);
    }

    @Override // defpackage.eav
    public final void h(edd eddVar) {
    }

    @Override // defpackage.eav
    public final /* synthetic */ void i(edd eddVar) {
    }

    protected final synchronized void j(edd eddVar) {
        HashMap map = (HashMap) this.b.remove(eddVar);
        if (map != null) {
            Map.EL.forEach(map, hei.b);
            map.clear();
        }
    }

    protected abstract void k(edd eddVar, mad madVar);

    @Override // defpackage.eby
    public final synchronized void s(edd eddVar) {
        j(eddVar);
    }
}
