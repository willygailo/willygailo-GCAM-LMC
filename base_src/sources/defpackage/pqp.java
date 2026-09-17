package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class pqp implements prb {
    private final pqm a;
    private final boolean b;
    private final plk c;

    private pqp(plk plkVar, pqm pqmVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = plkVar;
        this.b = pqmVar instanceof ppb;
        this.a = pqmVar;
    }

    static pqp c(plk plkVar, plk plkVar2, pqm pqmVar) {
        return new pqp(plkVar, pqmVar, null, null, null);
    }

    @Override // defpackage.prb
    public final int a(Object obj) {
        prn prnVarAF = plk.aF(obj);
        int iAc = prnVarAF.e;
        if (iAc == -1) {
            iAc = 0;
            for (int i = 0; i < prnVarAF.b; i++) {
                int i2 = prnVarAF.c[i];
                poc pocVar = (poc) prnVarAF.d[i];
                int iAb = pom.ab(1);
                iAc += iAb + iAb + pom.ac(2, psa.a(i2)) + pom.H(3, pocVar);
            }
            prnVarAF.e = iAc;
        }
        if (!this.b) {
            return iAc;
        }
        pou pouVarG = plk.g(obj);
        int iB = 0;
        for (int i3 = 0; i3 < pouVarG.b.a(); i3++) {
            iB += pouVarG.b(pouVarG.b.f(i3));
        }
        Iterator it = pouVarG.b.c().iterator();
        while (it.hasNext()) {
            iB += pouVarG.b((Map.Entry) it.next());
        }
        return iAc + iB;
    }

    @Override // defpackage.prb
    public final int b(Object obj) {
        int iHashCode = plk.aF(obj).hashCode();
        return this.b ? (iHashCode * 53) + plk.g(obj).hashCode() : iHashCode;
    }

    @Override // defpackage.prb
    public final Object e() {
        return this.a.fC().k();
    }

    @Override // defpackage.prb
    public final void f(Object obj) {
        plk.aI(obj);
        plk.k(obj);
    }

    @Override // defpackage.prb
    public final void g(Object obj, Object obj2) {
        prc.V(obj, obj2);
        if (this.b) {
            prc.T(obj, obj2);
        }
    }

    @Override // defpackage.prb
    public final void h(Object obj, pqx pqxVar, pos posVar) {
        boolean zU;
        plk plkVar = this.c;
        Object objAH = plk.aH(obj);
        pou pouVarH = plk.h(obj);
        while (pqxVar.c() != Integer.MAX_VALUE) {
            try {
                int iD = pqxVar.d();
                if (iD != psa.a) {
                    if (psa.b(iD) == 2) {
                        poq poqVarD = posVar.d(this.a, psa.a(iD));
                        if (poqVarD != null) {
                            plk.i(pqxVar, poqVarD, posVar, pouVarH);
                        } else {
                            zU = plkVar.aC(objAH, pqxVar);
                        }
                    } else {
                        zU = pqxVar.U();
                    }
                    if (!zU) {
                        break;
                    }
                } else {
                    int iJ = 0;
                    poq poqVarD2 = null;
                    poc pocVarQ = null;
                    while (pqxVar.c() != Integer.MAX_VALUE) {
                        int iD2 = pqxVar.d();
                        if (iD2 == psa.c) {
                            iJ = pqxVar.j();
                            poqVarD2 = posVar.d(this.a, iJ);
                        } else if (iD2 == psa.d) {
                            if (poqVarD2 != null) {
                                plk.i(pqxVar, poqVarD2, posVar, pouVarH);
                            } else {
                                pocVarQ = pqxVar.q();
                            }
                        } else if (!pqxVar.U()) {
                            break;
                        }
                    }
                    if (pqxVar.d() != psa.b) {
                        throw ppp.b();
                    }
                    if (pocVarQ == null) {
                        continue;
                    } else if (poqVarD2 != null) {
                        pqm pqmVarK = poqVarD2.c.fC().k();
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(pocVarQ.B());
                        if (!byteBufferWrap.hasArray()) {
                            throw new IllegalArgumentException("Direct buffers not yet supported");
                        }
                        pns pnsVar = new pns(byteBufferWrap);
                        pqu.a.b(pqmVarK).h(pqmVarK, pnsVar, posVar);
                        pouVarH.l(poqVarD2.d, pqmVarK);
                        if (pnsVar.c() != Integer.MAX_VALUE) {
                            throw ppp.b();
                        }
                    } else {
                        plk.aD(objAH, iJ, pocVarQ);
                    }
                }
            } catch (Throwable th) {
                plk.aG(obj, (prn) objAH);
                throw th;
            }
        }
        plk.aG(obj, (prn) objAH);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0074. Please report as an issue. */
    @Override // defpackage.prb
    public final void i(Object obj, byte[] bArr, int i, int i2, pnr pnrVar) throws ppp {
        ppd ppdVar = (ppd) obj;
        prn prnVarB = ppdVar.aF;
        if (prnVarB == prn.a) {
            prnVarB = prn.b();
            ppdVar.aF = prnVarB;
        }
        pou pouVarI = ((ppb) obj).i();
        poq poqVarD = null;
        while (i < i2) {
            int iX = plk.x(bArr, i, pnrVar);
            int i3 = pnrVar.a;
            if (i3 == psa.a) {
                int i4 = 0;
                poc pocVar = null;
                while (iX < i2) {
                    iX = plk.x(bArr, iX, pnrVar);
                    int i5 = pnrVar.a;
                    int iB = psa.b(i5);
                    switch (psa.a(i5)) {
                        case 2:
                            if (iB == 0) {
                                iX = plk.x(bArr, iX, pnrVar);
                                i4 = pnrVar.a;
                                poqVarD = pnrVar.d.d(this.a, i4);
                            } else if (i5 != psa.b) {
                                iX = plk.B(i5, bArr, iX, i2, pnrVar);
                            }
                            break;
                        case 3:
                            if (poqVarD != null) {
                                iX = plk.r(pqu.a.a(poqVarD.c.getClass()), bArr, iX, i2, pnrVar);
                                pouVarI.l(poqVarD.d, pnrVar.c);
                            } else if (iB == 2) {
                                iX = plk.o(bArr, iX, pnrVar);
                                pocVar = (poc) pnrVar.c;
                            } else if (i5 != psa.b) {
                                iX = plk.B(i5, bArr, iX, i2, pnrVar);
                            }
                            break;
                        default:
                            if (i5 != psa.b) {
                                iX = plk.B(i5, bArr, iX, i2, pnrVar);
                            }
                            break;
                    }
                    if (pocVar != null) {
                        prnVarB.d(psa.c(i4, 2), pocVar);
                    }
                    i = iX;
                }
                if (pocVar != null) {
                    prnVarB.d(psa.c(i4, 2), pocVar);
                }
                i = iX;
            } else if (psa.b(i3) == 2) {
                poq poqVarD2 = pnrVar.d.d(this.a, psa.a(i3));
                if (poqVarD2 != null) {
                    i = plk.r(pqu.a.a(poqVarD2.c.getClass()), bArr, iX, i2, pnrVar);
                    pouVarI.l(poqVarD2.d, pnrVar.c);
                    poqVarD = poqVarD2;
                } else {
                    i = plk.w(i3, bArr, iX, i2, prnVarB, pnrVar);
                    poqVarD = poqVarD2;
                }
            } else {
                i = plk.B(i3, bArr, iX, i2, pnrVar);
            }
        }
        if (i != i2) {
            throw ppp.g();
        }
    }

    @Override // defpackage.prb
    public final boolean j(Object obj, Object obj2) {
        if (!plk.aF(obj).equals(plk.aF(obj2))) {
            return false;
        }
        if (this.b) {
            return plk.g(obj).equals(plk.g(obj2));
        }
        return true;
    }

    @Override // defpackage.prb
    public final boolean k(Object obj) {
        return plk.g(obj).i();
    }

    @Override // defpackage.prb
    public final void l(Object obj, pon ponVar) {
        Iterator itD = plk.g(obj).d();
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            ppc ppcVar = (ppc) entry.getKey();
            if (ppcVar.a() != prz.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof pps) {
                ponVar.l(ppcVar.b, ((ppu) ((pps) entry).a.getValue()).a());
            } else {
                ponVar.l(ppcVar.b, entry.getValue());
            }
        }
        prn prnVarAF = plk.aF(obj);
        for (int i = 0; i < prnVarAF.b; i++) {
            ponVar.l(psa.a(prnVarAF.c[i]), prnVarAF.d[i]);
        }
    }
}
