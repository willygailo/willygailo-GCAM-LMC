package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class dhv implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public dhv(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public dhv(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public dhv(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public dhv(qkg qkgVar, qkg qkgVar2, int i, int[] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public dhv(qkg qkgVar, qkg qkgVar2, int i, short[] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public dhv(qkg qkgVar, qkg qkgVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public static Set a(ddf ddfVar, qkg qkgVar) {
        Set setH = !ddfVar.k(ddc.a) ? orx.a : ope.H(aas.d(new dsw(qkgVar, 0), "sensorconsumer"));
        qmd.ae(setH);
        return setH;
    }

    public static dhv b(qkg qkgVar, qkg qkgVar2) {
        return new dhv(qkgVar, qkgVar2, 3);
    }

    public static dhv c(qkg qkgVar, qkg qkgVar2) {
        return new dhv(qkgVar, qkgVar2, 4, (char[]) null);
    }

    public static dhv d(qkg qkgVar, qkg qkgVar2) {
        return new dhv(qkgVar, qkgVar2, 7);
    }

    public static dhv e(qkg qkgVar, qkg qkgVar2) {
        return new dhv(qkgVar, qkgVar2, 8, (int[]) null);
    }

    public static dhv f(qkg qkgVar, qkg qkgVar2) {
        return new dhv(qkgVar, qkgVar2, 18);
    }

    public static dhv g(qkg qkgVar, qkg qkgVar2) {
        return new dhv(qkgVar, qkgVar2, 19, (boolean[]) null);
    }

    public static dhv h(qkg qkgVar, qkg qkgVar2) {
        return new dhv(qkgVar, qkgVar2, 20);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        Object objH;
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        switch (this.c) {
            case 0:
                return ((ddf) this.b.get()).k(ddl.aD) ? ((dht) this.a).get() : new dhz();
            case 1:
                return new jtx((ddf) this.b.get());
            case 2:
                return new djy((dju) this.b.get(), (ddf) this.a.get());
            case 3:
                ddf ddfVar = (ddf) this.a.get();
                int i4 = ddb.a;
                ddfVar.d();
                return new enl();
            case 4:
                final pyn pynVarA = pyr.a(this.b);
                final ljf ljfVar = (ljf) this.a.get();
                return new bvv() { // from class: dpe
                    @Override // defpackage.bvv
                    public final /* synthetic */ String c() {
                        return aas.g(this);
                    }

                    @Override // defpackage.bvv
                    public final pht fz() {
                        ljf ljfVar2 = ljfVar;
                        pyn pynVar = pynVarA;
                        pynVar.getClass();
                        ljfVar2.d("GpuFaceObfuscationStartup", new doa(pynVar, 2));
                        return plk.V(true);
                    }
                };
            case 5:
                return new dqa(((Boolean) this.b.get()).booleanValue(), (hug) this.a.get());
            case 6:
                ddf ddfVar2 = (ddf) this.a.get();
                qkg qkgVar = this.b;
                if (ddfVar2.k(ddl.aB)) {
                    objH = ope.H(jwv.a(new dqk((dqe) qkgVar.get()), new lcw(fob.b), jwt.ZEBRAS));
                } else {
                    objH = orx.a;
                }
                qmd.ae(objH);
                return objH;
            case 7:
                lnc lncVar = (lnc) this.a.get();
                ojc ojcVar = (ojc) this.b.get();
                return ojcVar.g() ? ojc.i(lncVar.s((lnx) ojcVar.c())) : oih.a;
            case 8:
                return ojc.h(((lnc) this.b.get()).b().b((lnz) this.a.get()));
            case 9:
                return enl.I(new hno(1), (dsz) this.a.get(), ((dsa) this.b).a());
            case 10:
                return enl.I(new hno(0), (dsz) this.a.get(), ((dsa) this.b).a());
            case 11:
                return enl.I(new hno(2), (dsz) this.a.get(), ((dsa) this.b).a());
            case 12:
                return enl.I(new hno(3), (dsz) this.a.get(), ((dsa) this.b).a());
            case 13:
                return enl.I(new hno(4), (dsz) this.a.get(), ((dsa) this.b).a());
            case 14:
                dqw dqwVar = (dqw) this.a.get();
                final hko hkoVar = (hko) this.b.get();
                dtm dtmVarA = dtn.a(dqwVar);
                dtmVarA.b(new dtk() { // from class: dsn
                    @Override // defpackage.dtk
                    public final float a(long j) {
                        switch (i3) {
                            case 0:
                                hkn hknVarC = hkoVar.c(j);
                                hla hlaVar = null;
                                if (hknVarC != null && hknVarC.p.g()) {
                                    hlaVar = (hla) hknVarC.p.c();
                                }
                                if (hlaVar != null) {
                                    return hlaVar.b;
                                }
                                return Float.NaN;
                            case 1:
                                hkn hknVarC2 = hkoVar.c(j);
                                if (hknVarC2 != null) {
                                    return hknVarC2.m;
                                }
                                return Float.NaN;
                            default:
                                hkn hknVarC3 = hkoVar.c(j);
                                if (hknVarC3 != null) {
                                    return hknVarC3.b;
                                }
                                return Float.NaN;
                        }
                    }
                });
                dtmVarA.c = hkoVar.b();
                dtm.c(hkoVar.a());
                return dtmVarA.a();
            case 15:
                dqw dqwVar2 = (dqw) this.a.get();
                final qkg qkgVar2 = this.b;
                dtm dtmVarA2 = dtn.a(dqwVar2);
                dtmVarA2.b = new dti() { // from class: dsm
                    @Override // defpackage.dti
                    public final int a(long j, float[] fArr) {
                        dwg dwgVar;
                        dwk dwkVar = (dwk) qkgVar2.get();
                        synchronized (dwkVar.c) {
                            int iG = dwkVar.a.g(j);
                            dwgVar = iG >= 0 ? dwkVar.b[iG] : null;
                        }
                        ojc ojcVarI = dwgVar != null ? ojc.i(dwgVar.b) : oih.a;
                        if (!ojcVarI.g()) {
                            fArr[0] = Float.NaN;
                            return 1;
                        }
                        List list = (List) ojcVarI.c();
                        int iMin = Math.min(list.size(), 3);
                        for (int i5 = 0; i5 < iMin; i5++) {
                            fArr[i5] = ((dwf) list.get(i5)).b;
                        }
                        return iMin;
                    }
                };
                dtmVarA2.c = ((dwk) qkgVar2.get()).a;
                dtm.c(((dwk) qkgVar2.get()).b.length);
                dtmVarA2.a = -1;
                dtmVarA2.d = 3;
                return dtmVarA2.a();
            case 16:
                dqw dqwVar3 = (dqw) this.a.get();
                final hko hkoVar2 = (hko) this.b.get();
                dtm dtmVarA3 = dtn.a(dqwVar3);
                dtmVarA3.b(new dtk() { // from class: dsn
                    @Override // defpackage.dtk
                    public final float a(long j) {
                        switch (i2) {
                            case 0:
                                hkn hknVarC = hkoVar2.c(j);
                                hla hlaVar = null;
                                if (hknVarC != null && hknVarC.p.g()) {
                                    hlaVar = (hla) hknVarC.p.c();
                                }
                                if (hlaVar != null) {
                                    return hlaVar.b;
                                }
                                return Float.NaN;
                            case 1:
                                hkn hknVarC2 = hkoVar2.c(j);
                                if (hknVarC2 != null) {
                                    return hknVarC2.m;
                                }
                                return Float.NaN;
                            default:
                                hkn hknVarC3 = hkoVar2.c(j);
                                if (hknVarC3 != null) {
                                    return hknVarC3.b;
                                }
                                return Float.NaN;
                        }
                    }
                });
                dtmVarA3.c = hkoVar2.b();
                dtm.c(hkoVar2.a());
                return dtmVarA3.a();
            case 17:
                dqw dqwVar4 = (dqw) this.a.get();
                final hko hkoVar3 = (hko) this.b.get();
                dtm dtmVarA4 = dtn.a(dqwVar4);
                dtmVarA4.b(new dtk() { // from class: dsn
                    @Override // defpackage.dtk
                    public final float a(long j) {
                        switch (i) {
                            case 0:
                                hkn hknVarC = hkoVar3.c(j);
                                hla hlaVar = null;
                                if (hknVarC != null && hknVarC.p.g()) {
                                    hlaVar = (hla) hknVarC.p.c();
                                }
                                if (hlaVar != null) {
                                    return hlaVar.b;
                                }
                                return Float.NaN;
                            case 1:
                                hkn hknVarC2 = hkoVar3.c(j);
                                if (hknVarC2 != null) {
                                    return hknVarC2.m;
                                }
                                return Float.NaN;
                            default:
                                hkn hknVarC3 = hkoVar3.c(j);
                                if (hknVarC3 != null) {
                                    return hknVarC3.b;
                                }
                                return Float.NaN;
                        }
                    }
                });
                dtmVarA4.c = hkoVar3.b();
                dtm.c(hkoVar3.a());
                return dtmVarA4.a();
            case 18:
                return new dsv(((ena) this.a).get(), ((pyw) this.b).get());
            case 19:
                return a((ddf) this.b.get(), this.a);
            default:
                Object objH2 = !((ddf) this.a.get()).k(ddc.a) ? orx.a : ope.H(new gbx(this.b, 1));
                qmd.ae(objH2);
                return objH2;
        }
    }
}
