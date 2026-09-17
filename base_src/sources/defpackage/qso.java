package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qso extends qsr implements qsu {
    private final Object A(int i, qlh qlhVar) {
        qpo qpoVarJ = qmd.j(qmd.c(qlhVar));
        qsj qsjVar = new qsj(qpoVarJ, i);
        while (!g(qsjVar)) {
            Object objA = a();
            if (objA instanceof qta) {
                qsjVar.c((qta) objA);
            } else if (objA != qsp.d) {
                qpoVarJ.b(qsjVar.a(objA), null);
            }
            Object objG = qpoVarJ.g();
            qlp qlpVar = qlp.COROUTINE_SUSPENDED;
            return objG;
        }
        n(qpoVarJ, qsjVar);
        Object objG2 = qpoVarJ.g();
        qlp qlpVar2 = qlp.COROUTINE_SUSPENDED;
        return objG2;
    }

    public static final void n(qpn qpnVar, qtf qtfVar) {
        qpnVar.a(new qsl(qtfVar));
    }

    protected Object a() {
        qtj qtjVarV;
        do {
            qtjVarV = v();
            if (qtjVarV == null) {
                return qsp.d;
            }
        } while (qtjVarV.i() == null);
        boolean z = qql.a;
        qtjVarV.g();
        return qtjVarV.c();
    }

    @Override // defpackage.qtg
    public final Object b(qlh qlhVar) {
        Object objA = a();
        return (objA == qsp.d || (objA instanceof qta)) ? A(0, qlhVar) : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.qtg
    public final Object c(qlh qlhVar) {
        qsn qsnVar;
        if (qlhVar instanceof qsn) {
            qsnVar = (qsn) qlhVar;
            int i = qsnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qsnVar.c = i - Integer.MIN_VALUE;
            } else {
                qsnVar = new qsn(this, qlhVar);
            }
        } else {
            qsnVar = new qsn(this, qlhVar);
        }
        Object objA = qsnVar.a;
        Object obj = qlp.COROUTINE_SUSPENDED;
        switch (qsnVar.c) {
            case 0:
                qmd.M(objA);
                Object objA2 = a();
                if (objA2 != qsp.d) {
                    return objA2 instanceof qta ? qnt.k(((qta) objA2).a) : objA2;
                }
                qsnVar.c = 1;
                objA = A(1, qsnVar);
                if (objA == obj) {
                    return obj;
                }
                break;
            case 1:
                qmd.M(objA);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((qsz) objA).b;
    }

    @Override // defpackage.qtg
    public final qsw d() {
        return new qsi(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [qvh] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // defpackage.qsr
    protected final qth e() {
        ?? r1;
        qvh qvhVarN;
        qve qveVar = this.a;
        while (true) {
            r1 = (qvh) qveVar.k();
            if (r1 != qveVar) {
                if (!(r1 instanceof qth)) {
                    r1 = 0;
                    break;
                }
                if (((((qth) r1) instanceof qta) && !r1.hc()) || (qvhVarN = r1.n()) == null) {
                    break;
                }
                qvhVarN.q();
            } else {
                r1 = 0;
                break;
            }
        }
        qth qthVar = (qth) r1;
        if (qthVar != null) {
            boolean z = qthVar instanceof qta;
        }
        return qthVar;
    }

    protected void f(boolean z) {
        qta qtaVarU = u();
        if (qtaVarU == null) {
            throw new IllegalStateException("Cannot happen".toString());
        }
        Object objA = null;
        while (true) {
            qvh qvhVarM = qtaVarU.m();
            if (qvhVarM instanceof qve) {
                break;
            }
            boolean z2 = qql.a;
            if (qvhVarM.hb()) {
                objA = qvd.a(objA, (qtj) qvhVarM);
            } else {
                qvhVarM.p();
            }
        }
        if (objA == null) {
            return;
        }
        if (!(objA instanceof ArrayList)) {
            ((qtj) objA).h(qtaVarU);
            return;
        }
        ArrayList arrayList = (ArrayList) objA;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            ((qtj) arrayList.get(size)).h(qtaVarU);
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final boolean g(qtf qtfVar) {
        return h(qtfVar);
    }

    protected boolean h(qtf qtfVar) {
        qvh qvhVarM;
        if (i()) {
            qvh qvhVar = this.a;
            do {
                qvhVarM = qvhVar.m();
                if (qvhVarM instanceof qtj) {
                    return false;
                }
            } while (!qvhVarM.r(qtfVar, qvhVar));
            return true;
        }
        qvh qvhVar2 = this.a;
        qsm qsmVar = new qsm(qtfVar, this);
        while (true) {
            qvh qvhVarM2 = qvhVar2.m();
            if (!(qvhVarM2 instanceof qtj)) {
                switch (qvhVarM2.j(qtfVar, qvhVar2, qsmVar)) {
                    case 1:
                        return true;
                    case 2:
                        return false;
                    default:
                        break;
                }
            } else {
                return false;
            }
        }
    }

    protected abstract boolean i();

    protected abstract boolean j();

    public boolean k() {
        qvh qvhVarL = this.a.l();
        qta qtaVar = null;
        qta qtaVar2 = qvhVarL instanceof qta ? (qta) qvhVarL : null;
        if (qtaVar2 != null) {
            qsr.z(qtaVar2);
            qtaVar = qtaVar2;
        }
        return qtaVar != null && j();
    }

    @Override // defpackage.qtg
    public boolean l() {
        return m();
    }

    protected final boolean m() {
        return !(this.a.l() instanceof qtj) && j();
    }

    @Override // defpackage.qtg
    public final void q(CancellationException cancellationException) {
        if (k()) {
            return;
        }
        f(w(cancellationException));
    }
}
