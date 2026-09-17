package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class at extends ar {
    public float af = -1.0f;
    public int ag = -1;
    public int ah = -1;
    private aq aj = this.j;
    public int ai = 0;

    public at() {
        this.q.clear();
        this.q.add(this.aj);
    }

    public final void A(int i) {
        if (this.ai == i) {
            return;
        }
        this.ai = i;
        this.q.clear();
        if (this.ai == 1) {
            this.aj = this.i;
        } else {
            this.aj = this.j;
        }
        this.q.add(this.aj);
    }

    @Override // defpackage.ar
    public final aq u(int i) {
        switch (i - 1) {
            case 1:
            case 3:
                if (this.ai == 1) {
                    return this.aj;
                }
                return null;
            case 2:
            case 4:
                if (this.ai == 0) {
                    return this.aj;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // defpackage.ar
    public final void y(an anVar) {
        ar arVar = this.r;
        if (arVar == null) {
            return;
        }
        aq aqVarU = arVar.u(2);
        aq aqVarU2 = arVar.u(4);
        if (this.ai == 0) {
            aqVarU = arVar.u(3);
            aqVarU2 = arVar.u(5);
        }
        if (this.ag != -1) {
            anVar.g(an.c(anVar, anVar.e(this.aj), anVar.e(aqVarU), this.ag, false));
            return;
        }
        if (this.ah != -1) {
            anVar.g(an.c(anVar, anVar.e(this.aj), anVar.e(aqVarU2), -this.ah, false));
            return;
        }
        if (this.af != -1.0f) {
            ap apVarE = anVar.e(this.aj);
            ap apVarE2 = anVar.e(aqVarU);
            ap apVarE3 = anVar.e(aqVarU2);
            float f = this.af;
            ak akVarA = anVar.a();
            akVarA.d.f(apVarE, -1.0f);
            akVarA.d.f(apVarE2, 1.0f - f);
            akVarA.d.f(apVarE3, f);
            anVar.g(akVarA);
        }
    }

    @Override // defpackage.ar
    public final void z() {
        if (this.r == null) {
            return;
        }
        int iP = an.p(this.aj);
        if (this.ai == 1) {
            this.w = iP;
            this.x = 0;
            k(this.r.d());
            q(0);
            return;
        }
        this.w = 0;
        this.x = iP;
        q(this.r.h());
        k(0);
    }
}
