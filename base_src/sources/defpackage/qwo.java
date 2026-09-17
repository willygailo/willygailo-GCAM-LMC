package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qwo implements qwm {
    public final qpe a;
    public final qpc c;
    public final qmu d;
    private final int e;
    private final qpe f;
    private final qpd g = qnt.h(0);
    public final qpd b = qnt.h(0);

    public qwo(int i) {
        this.e = i;
        qux quxVar = new qux(0L, null, 2);
        this.f = qnt.i(quxVar);
        this.a = qnt.i(quxVar);
        this.c = qnt.g(i);
        this.d = new qwn(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [qux] */
    /* JADX WARN: Type inference failed for: r6v2, types: [qvr] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // defpackage.qwm
    public final void a() {
        int i;
        Object obj;
        while (true) {
            qpc qpcVar = this.c;
            do {
                i = qpcVar.b;
                int i2 = this.e;
                if (i >= i2) {
                    throw new IllegalStateException(qno.a("The number of released permits cannot be greater than ", Integer.valueOf(i2)).toString());
                }
            } while (!qpcVar.d(i, i + 1));
            if (i >= 0) {
                return;
            }
            qux quxVar = (qux) this.f.a;
            long jB = this.g.b();
            long j = jB / ((long) qwp.f);
            qpe qpeVar = this.f;
            while (true) {
                obj = quxVar;
                while (true) {
                    if (obj.b >= j && !obj.g()) {
                        break;
                    }
                    Object objA = obj.a();
                    if (objA == quw.a) {
                        obj = quw.a;
                        break;
                    }
                    qux quxVar2 = (qux) objA;
                    if (quxVar2 != null) {
                        obj = quxVar2;
                    } else {
                        qux quxVarA = qwp.a(obj.b + 1, obj);
                        if (obj.e(quxVarA)) {
                            if (obj.g()) {
                                obj.c();
                            }
                            obj = quxVarA;
                        }
                    }
                }
                if (qvp.a(obj)) {
                    break;
                }
                qux quxVarB = qvp.b(obj);
                while (true) {
                    qux quxVar3 = (qux) qpeVar.a;
                    if (quxVar3.b >= quxVarB.b) {
                        break;
                    }
                    if (!quxVarB.h()) {
                        break;
                    }
                    if (qpeVar.c(quxVar3, quxVarB)) {
                        if (!quxVar3.f()) {
                            break;
                        }
                        quxVar3.c();
                        break;
                    } else if (quxVarB.f()) {
                        quxVarB.c();
                    }
                }
            }
            qux quxVarB2 = qvp.b(obj);
            quxVarB2.a.b(null);
            if (quxVarB2.b <= j) {
                int i3 = (int) (jB % ((long) qwp.f));
                Object objA2 = quxVarB2.d.a(i3).a(qwp.b);
                if (objA2 == null) {
                    int i4 = qwp.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (quxVarB2.d.a(i3).a == qwp.c) {
                            return;
                        }
                    }
                    if (!quxVarB2.d.a(i3).c(qwp.b, qwp.d)) {
                        return;
                    }
                } else if (objA2 != qwp.e) {
                    qpn qpnVar = (qpn) objA2;
                    if (qpnVar.e(qks.a, this.d) != null) {
                        qpnVar.f();
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
