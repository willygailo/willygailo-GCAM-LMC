package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ilo {
    private final lda a;
    private final lda b;
    private final lda c;
    private final lda d;
    private final hur e;
    private final huq f;
    private final huf g;
    private final hug h;

    public ilo(lda ldaVar, lda ldaVar2, lda ldaVar3, lda ldaVar4, hur hurVar, huq huqVar, huf hufVar, hug hugVar) {
        this.a = ldaVar;
        this.b = ldaVar2;
        this.c = ldaVar3;
        this.d = ldaVar4;
        this.e = hurVar;
        this.f = huqVar;
        this.g = hufVar;
        this.h = hugVar;
    }

    public final void a() {
        if (((Boolean) this.g.c(htu.F)).booleanValue()) {
            this.h.e(htu.F, false);
        }
        this.a.fB((Boolean) this.g.c(htu.H));
        this.b.fB((String) this.g.c(htu.I));
        this.c.fB((Integer) this.g.c(htu.J));
        this.h.e(htu.r, (Boolean) this.g.c(htu.K));
        this.d.fB((Boolean) this.g.c(htu.L));
        this.e.fB(htl.a((String) this.g.c(htu.M)));
        this.f.a.fB(htg.a((String) this.g.c(htu.N)));
    }

    public final void b() {
        if (!((Boolean) this.g.c(htu.F)).booleanValue()) {
            this.h.e(htu.F, true);
        }
        this.h.e(htu.H, (Boolean) this.a.fA());
        this.h.e(htu.I, (String) this.b.fA());
        this.h.e(htu.J, (Integer) this.c.fA());
        this.h.e(htu.K, (Boolean) this.g.c(htu.r));
        this.h.e(htu.L, (Boolean) this.d.fA());
        this.h.e(htu.M, ((htl) this.e.fA()).name());
        this.h.e(htu.N, ((htg) this.f.a.fA()).name());
        this.a.fB(false);
        this.b.fB("medium");
        this.c.fB(0);
        this.h.e(htu.r, true);
        this.d.fB(false);
        this.e.fB(htl.RES_1080P);
        this.f.a.fB(htg.FPS_30);
    }

    public final void c(ilv ilvVar) {
        if (ilvVar.b >= 1000000000 && ((Boolean) this.g.c(htu.F)).booleanValue() && ((Boolean) this.g.c(htu.G)).booleanValue()) {
            a();
        }
        this.h.e(htu.G, Boolean.valueOf(ilvVar.b < 1000000000));
    }
}
