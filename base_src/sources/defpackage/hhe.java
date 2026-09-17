package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hhe implements hhq {
    public final long b;
    public final lco c;
    private final lht f;
    private final hhl i;
    public final lce a = new lce(0L);
    private final LinkedList g = new LinkedList();
    public final Object d = new Object();
    public boolean e = false;
    private List h = new ArrayList();

    public hhe(fmf fmfVar, mos mosVar, hhl hhlVar, byte[] bArr) {
        lce lceVar;
        this.i = hhlVar;
        this.b = Math.min(300000000L, mosVar.a);
        hha hhaVar = new hha(this);
        synchronized (fmfVar.a) {
            if (fmfVar.c.containsKey(flz.LIGHTCYCLE)) {
                flz.LIGHTCYCLE.name();
            } else {
                flz.LIGHTCYCLE.name();
                fmfVar.c.put(flz.LIGHTCYCLE, new fme(hhaVar, new lce(false), oom.n(hhaVar.b().a(new fmd(fmfVar, 1), fmfVar.b), hhaVar.a().a(new fmd(fmfVar, 0), fmfVar.b))));
                fmfVar.a();
            }
        }
        flz flzVar = flz.LIGHTCYCLE;
        synchronized (fmfVar.a) {
            if (!fmfVar.c.containsKey(flzVar)) {
                String strValueOf = String.valueOf(flzVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 24);
                sb.append("Feature not registered: ");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
            }
            lceVar = ((fme) fmfVar.c.get(flzVar)).a;
        }
        this.c = lceVar;
        lceVar.a(new hhb(this), plk.K());
        this.f = new hhc(this);
    }

    private final void d(hhn hhnVar) {
        synchronized (this.d) {
            this.e = true;
            lce lceVar = this.a;
            lceVar.fB(Long.valueOf(((Long) lceVar.d).longValue() + this.b));
            hhnVar.c(this.f);
            this.i.a(hhnVar);
        }
    }

    private final void e() {
        synchronized (this.d) {
            this.g.size();
            List list = this.h;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((hhd) it.next()).a();
                }
            }
        }
    }

    @Override // defpackage.hhq
    public final long a() {
        return this.b;
    }

    @Override // defpackage.hhq
    public final void b(hhn hhnVar) {
        synchronized (this.d) {
            if (((Boolean) ((lce) this.c).d).booleanValue()) {
                d(hhnVar);
            } else {
                this.g.add(hhnVar);
                e();
            }
        }
    }

    public final void c() {
        synchronized (this.d) {
            if (!this.g.isEmpty()) {
                d((hhn) this.g.removeFirst());
                e();
            }
        }
    }
}
