package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qsr implements qtk {
    public final qve a = new qve();
    private final qpe b = qnt.i(null);

    private static final Throwable a(qta qtaVar) {
        z(qtaVar);
        return qtaVar.f();
    }

    private static final void hf(qlh qlhVar, qta qtaVar) {
        z(qtaVar);
        qlhVar.resumeWith(qmd.L(qtaVar.f()));
    }

    public static final void z(qta qtaVar) {
        Object objA = null;
        while (true) {
            qvh qvhVarM = qtaVar.m();
            qtf qtfVar = qvhVarM instanceof qtf ? (qtf) qvhVarM : null;
            if (qtfVar == null) {
                break;
            } else if (qtfVar.hb()) {
                objA = qvd.a(objA, qtfVar);
            } else {
                qtfVar.p();
            }
        }
        if (objA != null) {
            if (objA instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objA;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        ((qtf) arrayList.get(size)).c(qtaVar);
                        if (i < 0) {
                            break;
                        } else {
                            size = i;
                        }
                    }
                }
            } else {
                ((qtf) objA).c(qtaVar);
            }
        }
        qtaVar.getClass();
    }

    protected qth e() {
        throw null;
    }

    protected Object o(qtj qtjVar) {
        qvh qvhVarM;
        if (!x()) {
            qvh qvhVar = this.a;
            qsq qsqVar = new qsq(qtjVar, this);
            while (true) {
                qvh qvhVarM2 = qvhVar.m();
                if (!(qvhVarM2 instanceof qth)) {
                    switch (qvhVarM2.j(qtjVar, qvhVar, qsqVar)) {
                        case 1:
                            return null;
                        case 2:
                            return qsp.e;
                        default:
                            break;
                    }
                } else {
                    return qvhVarM2;
                }
            }
        } else {
            qvh qvhVar2 = this.a;
            do {
                qvhVarM = qvhVar2.m();
                if (qvhVarM instanceof qth) {
                    return qvhVarM;
                }
            } while (!qvhVarM.r(qtjVar, qvhVar2));
            return null;
        }
    }

    protected Object p(Object obj) {
        qth qthVarE;
        do {
            qthVarE = e();
            if (qthVarE == null) {
                return qsp.c;
            }
        } while (qthVarE.d(obj) == null);
        boolean z = qql.a;
        qthVarE.b(obj);
        return qthVarE.he();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e A[EDGE_INSN: B:30:0x006e->B:31:0x0073 BREAK  A[LOOP:0: B:5:0x0010->B:48:?]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[LOOP:0: B:5:0x0010->B:48:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.qtk
    public final Object r(Object obj, qlh qlhVar) {
        Object objP;
        if (p(obj) == qsp.b) {
            return qks.a;
        }
        qpo qpoVarJ = qmd.j(qmd.c(qlhVar));
        while (true) {
            if ((this.a.l() instanceof qth) || !y()) {
                objP = p(obj);
                if (objP == qsp.b) {
                    qpoVarJ.resumeWith(qks.a);
                    break;
                }
                if (objP != qsp.c) {
                    if (objP instanceof qta) {
                        throw new IllegalStateException(qno.a("offerInternal returned ", objP).toString());
                    }
                    hf(qpoVarJ, (qta) objP);
                    break;
                }
            } else {
                qtl qtlVar = new qtl(obj, qpoVarJ);
                Object objO = o(qtlVar);
                if (objO == null) {
                    qpoVarJ.a(new qrv(qtlVar));
                    break;
                }
                if (objO instanceof qta) {
                    hf(qpoVarJ, (qta) objO);
                    break;
                }
                if (objO != qsp.e && !(objO instanceof qtf)) {
                    throw new IllegalStateException(qno.a("enqueueSend returned ", objO).toString());
                }
                objP = p(obj);
                if (objP == qsp.b) {
                    qpoVarJ.resumeWith(qks.a);
                    break;
                }
                if (objP != qsp.c) {
                    if (objP instanceof qta) {
                        throw new IllegalStateException(qno.a("offerInternal returned ", objP).toString());
                    }
                    hf(qpoVarJ, (qta) objP);
                    break;
                }
            }
        }
        Object objG = qpoVarJ.g();
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        if (objG != qlp.COROUTINE_SUSPENDED) {
            objG = qks.a;
        }
        return objG == qlp.COROUTINE_SUSPENDED ? objG : qks.a;
    }

    @Override // defpackage.qtk
    public final Object s(Object obj) {
        Object objP = p(obj);
        if (objP == qsp.b) {
            return qks.a;
        }
        if (objP == qsp.c) {
            qta qtaVarU = u();
            return qtaVarU == null ? qsz.a : qnt.k(a(qtaVarU));
        }
        if (objP instanceof qta) {
            return qnt.k(a((qta) objP));
        }
        throw new IllegalStateException(qno.a("trySend returned ", objP).toString());
    }

    protected String t() {
        return "";
    }

    public final String toString() {
        String strA;
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(qnm.f(this));
        sb.append('@');
        sb.append(qnm.g(this));
        sb.append('{');
        qvh qvhVarL = this.a.l();
        if (qvhVarL == this.a) {
            string = "EmptyQueue";
        } else {
            if (qvhVarL instanceof qta) {
                strA = qvhVarL.toString();
            } else if (qvhVarL instanceof qtf) {
                strA = "ReceiveQueued";
            } else {
                strA = qvhVarL instanceof qtj ? "SendQueued" : qno.a("UNEXPECTED:", qvhVarL);
            }
            qvh qvhVarM = this.a.m();
            if (qvhVarM != qvhVarL) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strA);
                sb2.append(",queueSize=");
                qve qveVar = this.a;
                int i = 0;
                for (qvh qvhVarL2 = (qvh) qveVar.k(); !qno.c(qvhVarL2, qveVar); qvhVarL2 = qvhVarL2.l()) {
                    if (qvhVarL2 instanceof qvh) {
                        i++;
                    }
                }
                sb2.append(i);
                string = sb2.toString();
                if (qvhVarM instanceof qta) {
                    string = string + ",closedForSend=" + qvhVarM;
                }
            } else {
                string = strA;
            }
        }
        sb.append(string);
        sb.append('}');
        sb.append(t());
        return sb.toString();
    }

    protected final qta u() {
        qvh qvhVarM = this.a.m();
        qta qtaVar = qvhVarM instanceof qta ? (qta) qvhVarM : null;
        if (qtaVar == null) {
            return null;
        }
        z(qtaVar);
        return qtaVar;
    }

    protected final qtj v() {
        qvh qvhVar;
        qvh qvhVarN;
        qve qveVar = this.a;
        while (true) {
            qvhVar = (qvh) qveVar.k();
            if (qvhVar != qveVar) {
                if (!(qvhVar instanceof qtj)) {
                    qvhVar = null;
                    break;
                }
                if (((((qtj) qvhVar) instanceof qta) && !qvhVar.hc()) || (qvhVarN = qvhVar.n()) == null) {
                    break;
                }
                qvhVarN.q();
            } else {
                qvhVar = null;
                break;
            }
        }
        return (qtj) qvhVar;
    }

    @Override // defpackage.qtk
    public final boolean w(Throwable th) {
        boolean z;
        Object obj;
        qta qtaVar = new qta(th);
        qvh qvhVar = this.a;
        while (true) {
            qvh qvhVarM = qvhVar.m();
            if (qvhVarM instanceof qta) {
                z = false;
                break;
            }
            if (qvhVarM.r(qtaVar, qvhVar)) {
                z = true;
                break;
            }
        }
        if (!z) {
            qtaVar = (qta) this.a.m();
        }
        z(qtaVar);
        if (z && (obj = this.b.a) != null && obj != qsp.f && this.b.c(obj, qsp.f)) {
            qnt.a(obj, 1);
            ((qmu) obj).a(th);
        }
        return z;
    }

    protected abstract boolean x();

    protected abstract boolean y();
}
