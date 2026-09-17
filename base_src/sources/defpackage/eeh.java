package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eeh implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public eeh(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public eeh(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public eeh(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public eeh(qkg qkgVar, qkg qkgVar2, int i, float[] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public eeh(qkg qkgVar, qkg qkgVar2, int i, int[] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public eeh(qkg qkgVar, qkg qkgVar2, int i, short[] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public eeh(qkg qkgVar, qkg qkgVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public eeh(qkg qkgVar, qkg qkgVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public static eeh a(qkg qkgVar, qkg qkgVar2) {
        return new eeh(qkgVar, qkgVar2, 0);
    }

    public static eeh b(qkg qkgVar, qkg qkgVar2) {
        return new eeh(qkgVar, qkgVar2, 1, (byte[]) null);
    }

    public static eeh c(qkg qkgVar, qkg qkgVar2) {
        return new eeh(qkgVar, qkgVar2, 2);
    }

    public static eeh d(qkg qkgVar, qkg qkgVar2) {
        return new eeh(qkgVar, qkgVar2, 3);
    }

    public static eeh e(qkg qkgVar, qkg qkgVar2) {
        return new eeh(qkgVar, qkgVar2, 4);
    }

    public static eeh f(qkg qkgVar, qkg qkgVar2) {
        return new eeh(qkgVar, qkgVar2, 5);
    }

    public static eeh g(qkg qkgVar, qkg qkgVar2) {
        return new eeh(qkgVar, qkgVar2, 6);
    }

    public static eeh h(qkg qkgVar, qkg qkgVar2) {
        return new eeh(qkgVar, qkgVar2, 7);
    }

    public static eeh i(qkg qkgVar, qkg qkgVar2) {
        return new eeh(qkgVar, qkgVar2, 8, (char[]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        int[] iArr;
        switch (this.c) {
            case 0:
                return ((ffg) this.a).a().booleanValue() ? ojc.i(((eet) this.b).get()) : oih.a;
            case 1:
                return ((ffg) this.b).a().booleanValue() ? new edy((lco) this.a.get()) : gqi.b;
            case 2:
                return ((ffg) this.a).a().booleanValue() ? aas.d((Runnable) this.b.get(), "debfus") : bwb.a;
            case 3:
                boolean zBooleanValue = ((ffg) this.a).a().booleanValue();
                ddf ddfVar = (ddf) this.b.get();
                if (zBooleanValue && kdd.n != null) {
                    ddi ddiVar = ddm.a;
                    ddfVar.d();
                }
                return fcy.l();
            case 4:
                mip mipVar = ((ffg) this.a).a().booleanValue() ? (mip) this.b.get() : lnb.a;
                qmd.ae(mipVar);
                return mipVar;
            case 5:
                Object objH = ((ffg) this.a).a().booleanValue() ? ope.H((eav) this.b.get()) : orx.a;
                qmd.ae(objH);
                return objH;
            case 6:
                return ((Boolean) ((lda) this.b.get()).fA()).booleanValue() ? ojc.i(((gkt) this.a).get()) : oih.a;
            case 7:
                lco lcoVarG = (!((ddf) this.a.get()).k(ddm.X) || kdb.n == null) ? lcv.g(fcy.l()) : fcy.m(kdb.n, (lco) this.b.get());
                qmd.ae(lcoVarG);
                return lcoVarG;
            case 8:
                qkg qkgVar = this.b;
                lvp lvpVar = ((gjp) this.a).get();
                Integer num = null;
                if (kdb.h != null) {
                    try {
                        iArr = (int[]) lvpVar.l(kdb.h);
                    } catch (IllegalArgumentException e) {
                        e.getMessage();
                        iArr = null;
                    }
                    if (iArr != null) {
                        for (int i : iArr) {
                            if (i == 1) {
                                num = 1;
                            }
                        }
                    }
                    break;
                }
                lco lcoVarM = num != null ? fcy.m(kdb.i, (lco) qkgVar.get()) : lcv.g(fcy.l());
                qmd.ae(lcoVarM);
                return lcoVarM;
            case 9:
                return new ehw((ekf) this.b.get(), (eke) this.a.get(), lzg.a());
            case 10:
                return new ejm(((lhr) this.a).get(), (ddf) this.b.get());
            case 11:
                return new egs(oom.n((eke) this.a.get(), (ehw) this.b.get()));
            case 12:
                return new env(((eme) this.a).get(), efb.b(), ((Integer) ((ddf) this.b.get()).a(ddl.k).c()).intValue());
            case 13:
                ddf ddfVar2 = (ddf) this.a.get();
                Object obj = (ddfVar2.k(ddl.ak) && ddfVar2.k(ddl.al)) ? (iho) pyr.a(this.b).get() : bqi.f;
                qmd.ae(obj);
                return obj;
            case 14:
                return new eoa((ddf) this.a.get(), ((enb) this.b).get());
            case 15:
                return new eoc(((emp) this.b).a(), (eoa) this.a.get());
            case 16:
                return new eof(((emo) this.b).get(), (enw) this.a.get());
            case 17:
                ddf ddfVar3 = (ddf) this.a.get();
                fcy.a(ddfVar3);
                orx orxVar = orx.a;
                qmd.ae(orxVar);
                return orxVar;
            case 18:
                Object objH2 = ((ddf) this.a.get()).k(ddt.e) ? ope.H((eav) this.b.get()) : orx.a;
                qmd.ae(objH2);
                return objH2;
            case 19:
                return new eqy(((emd) this.a).get(), (ddf) this.b.get());
            default:
                return new jdy((ddf) this.b.get(), ((emd) this.a).get());
        }
    }
}
