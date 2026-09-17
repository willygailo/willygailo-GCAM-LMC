package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class gws implements bmq {
    public final gfy a;
    public final bod b;
    public final lnc c;
    public pih d;
    public final Runnable e = new gwr(this, 1);
    private final lbi f;
    private final bny g;
    private final hbq h;
    private final lce i;
    private final ddf j;

    public gws(lnc lncVar, lbi lbiVar, bod bodVar, gfy gfyVar, bny bnyVar, hbq hbqVar, lce lceVar, ddf ddfVar) {
        this.f = lbiVar;
        this.b = bodVar;
        this.a = gfyVar;
        this.c = lncVar;
        this.g = bnyVar;
        this.h = hbqVar;
        this.i = lceVar;
        this.j = ddfVar;
    }

    private final void c() {
        try {
            this.f.execute(new gwr(this, 0));
        } catch (RejectedExecutionException e) {
        }
    }

    @Override // defpackage.bmq
    public final bpt a(bnh bnhVar) {
        this.f.b();
        pih pihVar = this.d;
        boolean z = true;
        if (pihVar != null) {
            pihVar.cancel(true);
        }
        this.b.c(this.e);
        if (!this.j.k(ddl.br) || !((Boolean) ((lce) this.a.a).d).booleanValue()) {
            this.h.h();
        }
        lmp lmpVarA = this.c.a();
        int i = ((hkc) this.i.d).h;
        if (i != 0) {
            i = 1;
        }
        if (this.j.k(ddl.br) && ((Boolean) ((lce) this.a.a).d).booleanValue()) {
            z = false;
        }
        lok lokVar = (lok) lmpVarA;
        lokVar.d = Integer.valueOf(i);
        lokVar.h = this.g.b(bnhVar.a);
        if (z) {
            lokVar.i = this.g.b(bnhVar.a);
        }
        this.c.k(lmpVarA.a(), aap.g());
        pih pihVarF = pih.f();
        this.d = pihVarF;
        c();
        return new gwq(this, pihVarF, bnhVar);
    }

    public final void b(boolean z, boolean z2) {
        if (z) {
            this.b.c(this.e);
        }
        if (z2) {
            this.h.f();
            this.a.a();
        }
        this.c.l(z, z2, false);
        lmp lmpVarA = this.c.a();
        if (z) {
            lok lokVar = (lok) lmpVarA;
            lokVar.h = this.g.a();
            lokVar.d = Integer.valueOf(((hkc) this.i.d).h);
        }
        if (z2) {
            ((lok) lmpVarA).i = this.g.a();
        }
        ((lok) lmpVarA).j = this.g.a();
        this.c.m(lmpVarA.a());
    }
}
