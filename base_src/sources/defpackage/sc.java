package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sc {
    public final xf a = new xf();
    public final xd b = new xd();

    public final px a(qs qsVar, int i) {
        sb sbVar;
        px pxVar;
        int iC = this.a.c(qsVar);
        if (iC >= 0 && (sbVar = (sb) this.a.i(iC)) != null) {
            int i2 = sbVar.b;
            if ((i2 & i) != 0) {
                int i3 = (i ^ (-1)) & i2;
                sbVar.b = i3;
                if (i == 4) {
                    pxVar = sbVar.c;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    pxVar = sbVar.d;
                }
                if ((i3 & 12) == 0) {
                    this.a.g(iC);
                    sb.b(sbVar);
                }
                return pxVar;
            }
        }
        return null;
    }

    final void b(qs qsVar) {
        sb sbVarA = (sb) this.a.get(qsVar);
        if (sbVarA == null) {
            sbVarA = sb.a();
            this.a.put(qsVar, sbVarA);
        }
        sbVarA.b |= 1;
    }

    public final void c(long j, qs qsVar) {
        this.b.g(j, qsVar);
    }

    public final void d(qs qsVar, px pxVar) {
        sb sbVarA = (sb) this.a.get(qsVar);
        if (sbVarA == null) {
            sbVarA = sb.a();
            this.a.put(qsVar, sbVarA);
        }
        sbVarA.d = pxVar;
        sbVarA.b |= 8;
    }

    public final void e(qs qsVar, px pxVar) {
        sb sbVarA = (sb) this.a.get(qsVar);
        if (sbVarA == null) {
            sbVarA = sb.a();
            this.a.put(qsVar, sbVarA);
        }
        sbVarA.c = pxVar;
        sbVarA.b |= 4;
    }

    public final void f() {
        this.a.clear();
        this.b.e();
    }

    final void g(qs qsVar) {
        sb sbVar = (sb) this.a.get(qsVar);
        if (sbVar == null) {
            return;
        }
        sbVar.b &= -2;
    }

    final void h(qs qsVar) {
        for (int iA = this.b.a() - 1; iA >= 0; iA--) {
            if (qsVar == this.b.d(iA)) {
                xd xdVar = this.b;
                if (xdVar.d[iA] == xd.a) {
                    break;
                }
                xdVar.d[iA] = xd.a;
                xdVar.b = true;
                break;
            }
        }
        sb sbVar = (sb) this.a.remove(qsVar);
        if (sbVar != null) {
            sb.b(sbVar);
        }
    }

    public final boolean i(qs qsVar) {
        sb sbVar = (sb) this.a.get(qsVar);
        return (sbVar == null || (sbVar.b & 1) == 0) ? false : true;
    }
}
