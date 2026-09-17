package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hcf {
    public final lmr a;
    public final /* synthetic */ hcg b;

    public hcf(hcg hcgVar, lmr lmrVar) {
        this.b = hcgVar;
        this.a = lmrVar;
    }

    public final lnx a() {
        lnx lnxVar;
        ope opeVar = this.a.i().c;
        if (opeVar.contains(this.b.a)) {
            lnxVar = this.b.a;
        } else if (opeVar.contains(this.b.b)) {
            lnxVar = this.b.b;
        } else if (opeVar.contains(this.b.c)) {
            lnxVar = this.b.c;
        } else {
            lnxVar = opeVar.contains(this.b.d) ? this.b.d : null;
        }
        lnxVar.getClass();
        return lnxVar;
    }

    public final lnx b() {
        hcg hcgVar = this.b;
        if (hcgVar.b == null) {
            return null;
        }
        if (hcgVar.c == null && hcgVar.d == null) {
            return null;
        }
        ope opeVar = this.a.i().c;
        if (!opeVar.contains(this.b.b)) {
            return null;
        }
        if (opeVar.contains(this.b.c)) {
            return this.b.c;
        }
        if (opeVar.contains(this.b.d)) {
            return this.b.d;
        }
        return null;
    }

    public final mad c(lnx lnxVar) {
        if (lnxVar == null) {
            return null;
        }
        try {
            return this.a.d(lnxVar);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public final mad d() {
        return c(this.b.e);
    }

    public final mad e() {
        return c(a());
    }

    public final mad f() {
        return c(b());
    }

    public final mad g() {
        return c(this.b.g);
    }

    public final boolean h() {
        return b() != null;
    }
}
