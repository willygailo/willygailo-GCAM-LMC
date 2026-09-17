package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class gwx implements bmq {
    public final lnc a;
    public final lbi b;
    public final gfy c;
    public final lda d;
    public pih e;
    private final bny f;
    private final lap g;
    private final hbq h;
    private final lce i;
    private final lco j;
    private final ddf k;
    private final int l;
    private volatile boolean m;

    public gwx(lnc lncVar, bny bnyVar, lap lapVar, lbi lbiVar, gfy gfyVar, huq huqVar, hbq hbqVar, lce lceVar, int i, lda ldaVar, ddf ddfVar, byte[] bArr) {
        this.a = lncVar;
        this.f = bnyVar;
        this.g = lapVar;
        this.b = lbiVar;
        this.c = gfyVar;
        this.d = huqVar.c;
        this.h = hbqVar;
        this.i = lceVar;
        this.j = ldaVar;
        this.l = i;
        this.k = ddfVar;
    }

    @Override // defpackage.bmq
    public final bpt a(bnh bnhVar) {
        lar.a();
        this.b.b();
        if (!this.k.k(ddl.br) || !((Boolean) ((lce) this.c.a).d).booleanValue()) {
            this.h.h();
        }
        boolean z = true;
        if (!this.m) {
            this.m = true;
            this.g.c(this.d.a(new lij() { // from class: gwu
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    gwx gwxVar = this.a;
                    if (((Boolean) obj).booleanValue()) {
                        gwxVar.b.b();
                    } else {
                        gwxVar.c();
                    }
                }
            }, pgr.INSTANCE));
        }
        lmp lmpVarA = this.a.a();
        int i = ((hkc) this.i.d).h;
        if (i != 0) {
            i = 1;
        }
        if (this.k.k(ddl.br) && ((Boolean) ((lce) this.c.a).d).booleanValue()) {
            z = false;
        }
        lok lokVar = (lok) lmpVarA;
        lokVar.d = Integer.valueOf(i);
        lokVar.h = this.f.b(bnhVar.a);
        if (z) {
            lokVar.i = this.f.b(bnhVar.a);
        }
        this.a.k(lmpVarA.a(), aap.g());
        c();
        pih pihVarF = pih.f();
        this.e = pihVarF;
        return new gww(this, pihVarF, bnhVar);
    }

    public final void b(boolean z, boolean z2) {
        if (z2) {
            this.h.f();
            this.c.a();
        }
        this.a.l(z, z2, false);
        lmp lmpVarA = this.a.a();
        if (z) {
            lok lokVar = (lok) lmpVarA;
            lokVar.h = this.f.a();
            lokVar.d = Integer.valueOf(((hkc) this.i.d).h);
        }
        if (z2) {
            ((lok) lmpVarA).i = this.f.a();
        }
        ((lok) lmpVarA).j = this.f.a();
        this.a.m(lmpVarA.a());
    }

    public final void c() {
        hti htiVar = (hti) this.j.fA();
        long j = this.l;
        if (!htiVar.equals(hti.AUTO)) {
            j += (long) htiVar.g;
        }
        try {
            this.b.a(new Runnable() { // from class: gwv
                @Override // java.lang.Runnable
                public final void run() {
                    pih pihVar;
                    gwx gwxVar = this.a;
                    if (((Boolean) ((lce) gwxVar.d).d).booleanValue() || (pihVar = gwxVar.e) == null) {
                        return;
                    }
                    pihVar.o(null);
                }
            }, j, TimeUnit.SECONDS);
        } catch (RejectedExecutionException e) {
        }
    }
}
