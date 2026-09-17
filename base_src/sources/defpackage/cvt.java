package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cvt implements cwl {
    public final jtx a;
    private final lar b;
    private final cxz c;
    private final cwk d;
    private final fjs e;
    private final lis f;
    private final cwf g;

    public cvt(cwk cwkVar, lar larVar, cxz cxzVar, jtx jtxVar, fjs fjsVar, lis lisVar, cwf cwfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = cwkVar;
        this.b = larVar;
        this.c = cxzVar;
        this.a = jtxVar;
        this.e = fjsVar;
        this.g = cwfVar;
        this.f = lisVar.a("CamUnavailableHndlr");
    }

    @Override // defpackage.cwl
    public final void a() {
        this.c.i();
    }

    @Override // defpackage.cwl
    public final void b() {
        this.c.j();
        plk.af(this.c.c(), new cvs(this, 0), this.b);
    }

    @Override // defpackage.cwl
    public final void c() {
        this.c.k();
        plk.af(this.c.d(), new cvs(this, 1), this.b);
    }

    public final void d(cxs cxsVar, int i, int i2, int i3) {
        ie ieVarC;
        this.f.b(cxsVar.toString());
        int iF = akf.f(cxsVar, i, i2, this.a.r());
        if (iF == 4) {
            ieVarC = this.d.a(i3);
        } else {
            ieVarC = iF == 3 ? this.d.c(i3) : this.d.b(i3);
        }
        if (this.g.b(ieVarC)) {
            lis lisVar = this.f;
            String strA = cwn.a(i3);
            String strS = oxh.s(iF);
            StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 88 + strS.length());
            sb.append("Showing hardware help dialog for unavailability of any cameras due to reason: ");
            sb.append(strA);
            sb.append(" at stage ");
            sb.append(strS);
            lisVar.b(sb.toString());
            this.e.T(2, iF, i3, null, 0);
        }
    }
}
