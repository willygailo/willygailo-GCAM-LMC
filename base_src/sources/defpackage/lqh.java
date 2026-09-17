package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lqh implements lum {
    public final Set a;
    public final lqd c;
    private final lpb e;
    private int g;
    private boolean h;
    private lzv f = null;
    private boolean i = false;
    public lmw b = null;
    private final List d = new ArrayList();

    public lqh(lpb lpbVar, lqd lqdVar, Set set) {
        this.c = lqdVar;
        this.a = set;
        this.e = lpbVar;
    }

    public static lqh n(nox noxVar, lqd lqdVar, Set set) {
        ope<lun> opeVarF = ope.F(set);
        obr.ap(opeVarF.size() == lqdVar.c.size());
        for (lun lunVar : opeVarF) {
            obr.as(lqdVar.c.contains(lunVar.d()), "%s is not present in %s", lunVar.d(), lqdVar);
        }
        lpb lpbVar = (lpb) noxVar.a.get();
        lpbVar.getClass();
        lqdVar.getClass();
        opeVarF.getClass();
        lqh lqhVar = new lqh(lpbVar, lqdVar, opeVarF);
        Iterator it = opeVarF.iterator();
        while (it.hasNext()) {
            ((lun) it.next()).i(lqhVar);
        }
        return lqhVar;
    }

    private final boolean p() {
        return this.b != null && this.h && this.g == this.a.size();
    }

    private final void q(mip mipVar) {
        if (this.b == null) {
            this.e.a(mipVar, true, false, null, false, null, false, false);
        } else {
            this.e.a(mipVar, false, false, null, !this.h, null, this.g != this.a.size(), !p());
        }
    }

    public final lie a(boolean z) {
        if (this.a.isEmpty()) {
            return null;
        }
        if (this.a.size() == 1) {
            lun lunVar = (lun) this.a.iterator().next();
            return z ? lunVar.b() : lunVar.a();
        }
        lap lapVar = new lap();
        boolean z2 = true;
        for (lun lunVar2 : this.a) {
            lie lieVarB = z ? lunVar2.b() : lunVar2.a();
            z2 &= lieVarB != null;
            if (lieVarB != null) {
                lapVar.c(lieVarB);
            }
        }
        if (z2) {
            return lapVar;
        }
        lapVar.close();
        return null;
    }

    public final lie b() {
        return a(true);
    }

    public final synchronized lun c(lnx lnxVar) {
        for (lun lunVar : this.a) {
            if (lunVar.d().equals(lnxVar)) {
            }
        }
        String strValueOf = String.valueOf(lnxVar);
        String strValueOf2 = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 30 + String.valueOf(strValueOf2).length());
        sb.append("Unknown stream ");
        sb.append(strValueOf);
        sb.append(" requested for ");
        sb.append(strValueOf2);
        throw new IllegalArgumentException(sb.toString());
        return lunVar;
    }

    public final synchronized lzv d() {
        return this.f;
    }

    public final synchronized mad e(lnx lnxVar) {
        synchronized (this) {
            if (this.g >= this.a.size() && !this.i) {
                return c(lnxVar).h();
            }
            return null;
        }
    }

    public final synchronized void f() {
        if (!this.i && !p()) {
            this.i = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                q((mip) it.next());
            }
            this.d.clear();
        }
    }

    final void g() {
        lie lieVarA = a(false);
        if (lieVarA != null) {
            lieVarA.close();
        }
    }

    @Override // defpackage.lum
    public final synchronized void h() {
        boolean z = true;
        int i = this.g + 1;
        this.g = i;
        if (i > this.a.size()) {
            z = false;
        }
        obr.ap(z);
        if (this.g == this.a.size()) {
            boolean zP = p();
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                this.e.a((mip) it.next(), false, false, null, false, null, true, zP);
            }
            if (zP) {
                this.d.clear();
            }
        }
    }

    public final synchronized void i(lmw lmwVar) {
        if (this.i) {
            return;
        }
        obr.ap(true);
        obr.ar(this.b == null, "FrameId should only be set once", new Object[0]);
        obr.ar(this.f == null, "setFrameId must ALWAYS come before setMetadata.", new Object[0]);
        obr.aq(true ^ this.h, "Metadata was already set for frame %s!", lmwVar);
        this.b = lmwVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lun) it.next()).j(lmwVar);
        }
        boolean zP = p();
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            this.e.a((mip) it2.next(), false, true, this.b, false, null, false, zP);
        }
        if (zP) {
            this.d.clear();
        }
    }

    public final synchronized void j(lzv lzvVar) {
        if (this.i) {
            return;
        }
        boolean z = lzvVar == null || this.b != null;
        obr.ar(z, "setFrameId must ALWAYS come before setMetadata.", new Object[0]);
        obr.aq(!this.h, "Metadata was already set for frame %s!", this.b);
        this.h = true;
        this.f = lzvVar;
        boolean zP = p();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            this.e.a((mip) it.next(), false, false, null, true, this.f, false, zP);
        }
        if (zP) {
            this.d.clear();
        }
    }

    public final synchronized boolean k() {
        return p() || this.i;
    }

    public final synchronized boolean l() {
        return this.g == this.a.size() || k();
    }

    public final synchronized boolean m() {
        return this.h || k();
    }

    public final synchronized void o(mip mipVar) {
        boolean zP = p();
        if (this.i && !zP) {
            q(mipVar);
            return;
        }
        if (!zP) {
            this.d.add(mipVar);
        }
        lpb lpbVar = this.e;
        lmw lmwVar = this.b;
        lpbVar.a(mipVar, false, lmwVar != null, lmwVar, this.h, this.f, this.g == this.a.size(), zP);
    }

    public final synchronized String toString() {
        StringBuilder sb;
        lmw lmwVar = this.b;
        String strValueOf = String.valueOf(lmwVar == null ? null : Long.valueOf(lmwVar.c));
        sb = new StringBuilder(String.valueOf(strValueOf).length() + 6);
        sb.append("Frame-");
        sb.append(strValueOf);
        return sb.toString();
    }
}
