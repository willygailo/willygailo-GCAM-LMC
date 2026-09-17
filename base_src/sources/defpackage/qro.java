package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public class qro implements qrg, qpu, qru {
    public final qpe d = qnt.i(qrp.f);
    private final qpe a = qnt.i(null);

    public static final qpt J(qvh qvhVar) {
        while (qvhVar.hc()) {
            qvhVar = qvhVar.m();
        }
        while (true) {
            qvhVar = qvhVar.l();
            if (!qvhVar.hc()) {
                if (qvhVar instanceof qpt) {
                    return (qpt) qvhVar;
                }
                if (qvhVar instanceof qrr) {
                    return null;
                }
            }
        }
    }

    public static /* synthetic */ CancellationException K(qro qroVar, Throwable th) {
        return qroVar.z(th, null);
    }

    private final void L(qrk qrkVar) {
        qrr qrrVar = new qrr();
        qrrVar.d.b(qrkVar);
        qrrVar.c.b(qrkVar);
        while (qrkVar.k() == qrkVar) {
            if (qrkVar.c.c(qrkVar, qrrVar)) {
                qrrVar.o(qrkVar);
                break;
            }
        }
        this.d.c(qrkVar, qrkVar.l());
    }

    private final boolean M(Object obj, qrr qrrVar, qrk qrkVar) {
        while (true) {
            switch (qrrVar.m().j(qrkVar, qrrVar, new qrn(qrkVar, this, obj))) {
                case 1:
                    return true;
                case 2:
                    return false;
                default:
                    break;
            }
        }
    }

    private final boolean N(Throwable th) {
        if (k()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        qps qpsVarA = A();
        if (qpsVarA == null || qpsVarA == qrs.a) {
            return z;
        }
        return qpsVarA.d(th) || z;
    }

    private static final String O(Object obj) {
        if (!(obj instanceof qrm)) {
            if (obj instanceof qrb) {
                return ((qrb) obj).ha() ? "Active" : "New";
            }
            return obj instanceof qpy ? "Cancelled" : "Completed";
        }
        qrm qrmVar = (qrm) obj;
        if (qrmVar.g()) {
            return "Cancelling";
        }
        return qrmVar.h() ? "Completing" : "Active";
    }

    private static final Throwable P(Object obj) {
        return obj instanceof Throwable ? (Throwable) obj : ((qru) obj).y();
    }

    private final qrr f(qrb qrbVar) {
        qrr qrrVarGZ = qrbVar.gZ();
        if (qrrVarGZ != null) {
            return qrrVarGZ;
        }
        if (qrbVar instanceof qqt) {
            return new qrr();
        }
        if (!(qrbVar instanceof qrk)) {
            throw new IllegalStateException(qno.a("State should have list: ", qrbVar).toString());
        }
        L((qrk) qrbVar);
        return null;
    }

    private final void g(qrb qrbVar, Object obj) throws Throwable {
        qqb qqbVar;
        qps qpsVarA = A();
        if (qpsVarA != null) {
            qpsVarA.e();
            D(qrs.a);
        }
        qpy qpyVar = obj instanceof qpy ? (qpy) obj : null;
        Throwable th = qpyVar == null ? null : qpyVar.b;
        if (qrbVar instanceof qrk) {
            try {
                ((qrk) qrbVar).b(th);
                return;
            } catch (Throwable th2) {
                e(new qqb("Exception in completion handler " + qrbVar + " for " + this, th2));
                return;
            }
        }
        qrr qrrVarGZ = qrbVar.gZ();
        if (qrrVarGZ == null) {
            return;
        }
        qqb qqbVar2 = null;
        for (qvh qvhVarL = (qvh) qrrVarGZ.k(); !qno.c(qvhVarL, qrrVarGZ); qvhVarL = qvhVarL.l()) {
            if (qvhVarL instanceof qrk) {
                qrk qrkVar = (qrk) qvhVarL;
                try {
                    qrkVar.b(th);
                } catch (Throwable th3) {
                    if (qqbVar2 == null) {
                        qqbVar = null;
                    } else {
                        qmd.P(qqbVar2, th3);
                        qqbVar = qqbVar2;
                    }
                    if (qqbVar == null) {
                        qqbVar2 = new qqb("Exception in completion handler " + qrkVar + " for " + this, th3);
                    }
                }
            }
        }
        if (qqbVar2 != null) {
            e(qqbVar2);
        }
    }

    private final void i(qrr qrrVar, Throwable th) throws Throwable {
        qqb qqbVar;
        qqb qqbVar2 = null;
        for (qvh qvhVarL = (qvh) qrrVar.k(); !qno.c(qvhVarL, qrrVar); qvhVarL = qvhVarL.l()) {
            if (qvhVarL instanceof qri) {
                qrk qrkVar = (qrk) qvhVarL;
                try {
                    qrkVar.b(th);
                } catch (Throwable th2) {
                    if (qqbVar2 == null) {
                        qqbVar = null;
                    } else {
                        qmd.P(qqbVar2, th2);
                        qqbVar = qqbVar2;
                    }
                    if (qqbVar == null) {
                        qqbVar2 = new qqb("Exception in completion handler " + qrkVar + " for " + this, th2);
                    }
                }
            }
        }
        if (qqbVar2 != null) {
            e(qqbVar2);
        }
        N(th);
    }

    public final qps A() {
        return (qps) this.a.a;
    }

    public void B(Throwable th) throws Throwable {
        E(th);
    }

    protected final void C(qrg qrgVar) {
        boolean z = qql.a;
        if (qrgVar == null) {
            D(qrs.a);
            return;
        }
        qrgVar.hm();
        qps qpsVarN = qrgVar.n(this);
        D(qpsVarN);
        if (H()) {
            qpsVarN.e();
            D(qrs.a);
        }
    }

    public final void D(qps qpsVar) {
        qpe qpeVar = this.a;
        int i = qpf.a;
        qpeVar.a = qpsVar;
    }

    public final boolean E(Object obj) throws Throwable {
        Object objX = qrp.a;
        if (gY()) {
            do {
                Object objV = v();
                if (!(objV instanceof qrb) || ((objV instanceof qrm) && ((qrm) objV).h())) {
                    objX = qrp.a;
                    break;
                }
                objX = x(objV, new qpy(P(obj)));
            } while (objX == qrp.c);
            if (objX == qrp.b) {
                return true;
            }
        }
        if (objX == qrp.a) {
            Throwable thP = null;
            while (true) {
                Object objV2 = v();
                if (!(objV2 instanceof qrm)) {
                    if (!(objV2 instanceof qrb)) {
                        objX = qrp.d;
                        break;
                    }
                    if (thP == null) {
                        thP = P(obj);
                    }
                    qrb qrbVar = (qrb) objV2;
                    if (qrbVar.ha()) {
                        boolean z = qql.a;
                        qrr qrrVarF = f(qrbVar);
                        if (qrrVarF != null) {
                            if (this.d.c(qrbVar, new qrm(qrrVarF, thP))) {
                                i(qrrVarF, thP);
                                objX = qrp.a;
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Object objX2 = x(objV2, new qpy(thP));
                        if (objX2 == qrp.a) {
                            throw new IllegalStateException(qno.a("Cannot happen in ", objV2).toString());
                        }
                        if (objX2 != qrp.c) {
                            objX = objX2;
                            break;
                        }
                    }
                } else {
                    synchronized (objV2) {
                        qrm qrmVar = (qrm) objV2;
                        if (qrmVar.c() != qrp.e) {
                            boolean zG = qrmVar.g();
                            if (thP == null) {
                                thP = P(obj);
                            }
                            qrmVar.e(thP);
                            Throwable thD = true != zG ? qrmVar.d() : null;
                            if (thD != null) {
                                i(((qrm) objV2).a, thD);
                            }
                            objX = qrp.a;
                            break;
                        }
                        objX = qrp.d;
                        break;
                    }
                }
            }
        }
        if (objX == qrp.a || objX == qrp.b) {
            return true;
        }
        if (objX == qrp.d) {
            return false;
        }
        j(objX);
        return true;
    }

    public boolean F(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return E(th) && gX();
    }

    protected boolean G(Throwable th) {
        return false;
    }

    public final boolean H() {
        return !(v() instanceof qrb);
    }

    public final boolean I(qrm qrmVar, qpt qptVar, Object obj) {
        while (qno.B(qptVar.a, false, new qrl(this, qrmVar, qptVar, obj), 1) == qrs.a) {
            qptVar = J(qptVar);
            if (qptVar == null) {
                return false;
            }
        }
        return true;
    }

    protected String a() {
        return "Job was cancelled";
    }

    public void e(Throwable th) throws Throwable {
        throw th;
    }

    @Override // defpackage.qln
    public final Object fold(Object obj, qmy qmyVar) {
        return qmd.d(this, obj, qmyVar);
    }

    public boolean gX() {
        return true;
    }

    public boolean gY() {
        return false;
    }

    @Override // defpackage.qlk, defpackage.qln
    public final qlk get(qll qllVar) {
        qllVar.getClass();
        return qmd.e(this, qllVar);
    }

    @Override // defpackage.qlk
    public final qll getKey() {
        return qrg.c;
    }

    protected void h(Object obj) {
    }

    public String hg() {
        return qnm.f(this);
    }

    public final Object hj(Object obj) throws Throwable {
        Object objX;
        do {
            objX = x(v(), obj);
            if (objX == qrp.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                qpy qpyVar = obj instanceof qpy ? (qpy) obj : null;
                throw new IllegalStateException(str, qpyVar != null ? qpyVar.b : null);
            }
        } while (objX == qrp.c);
        return objX;
    }

    @Override // defpackage.qpu
    public final void hk(qru qruVar) throws Throwable {
        E(qruVar);
    }

    @Override // defpackage.qrg
    public final boolean hl() {
        Object objV = v();
        return (objV instanceof qrb) && ((qrb) objV).ha();
    }

    @Override // defpackage.qrg
    public final void hm() {
        while (true) {
            switch (t(v())) {
                case 0:
                case 1:
                    return;
                default:
                    break;
            }
        }
    }

    protected void j(Object obj) {
    }

    protected boolean k() {
        return false;
    }

    @Override // defpackage.qrg
    public final CancellationException m() {
        Object objV = v();
        if (!(objV instanceof qrm)) {
            if (objV instanceof qrb) {
                throw new IllegalStateException(qno.a("Job is still new or active: ", this).toString());
            }
            return objV instanceof qpy ? K(this, ((qpy) objV).b) : new qrh(qno.a(qnm.f(this), " has completed normally"), null, this);
        }
        Throwable thD = ((qrm) objV).d();
        if (thD != null) {
            return z(thD, qno.a(qnm.f(this), " is cancelling"));
        }
        throw new IllegalStateException(qno.a("Job is still new or active: ", this).toString());
    }

    @Override // defpackage.qln
    public final qln minusKey(qll qllVar) {
        qllVar.getClass();
        return qmd.f(this, qllVar);
    }

    @Override // defpackage.qrg
    public final qps n(qpu qpuVar) {
        return (qps) qno.B(this, true, new qpt(qpuVar), 2);
    }

    @Override // defpackage.qrg
    public final qqr o(qmu qmuVar) {
        return p(false, true, qmuVar);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0094  */
    /* JADX WARN: Code duplicated, block: B:65:0x009a  */
    /* JADX WARN: Code duplicated, block: B:87:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x002c A[SYNTHETIC] */
    @Override // defpackage.qrg
    public final qqr p(boolean z, boolean z2, qmu qmuVar) {
        qrk qrfVar;
        Throwable thD;
        if (z) {
            qrfVar = qmuVar instanceof qri ? (qri) qmuVar : null;
            if (qrfVar == null) {
                qrfVar = new qre(qmuVar);
            }
        } else {
            qrfVar = qmuVar instanceof qrk ? (qrk) qmuVar : null;
            if (qrfVar == null) {
                qrfVar = null;
            } else {
                boolean z3 = qql.a;
            }
            if (qrfVar == null) {
                qrfVar = new qrf(qmuVar);
            }
        }
        qrfVar.b = this;
        while (true) {
            Object objV = v();
            if (objV instanceof qqt) {
                boolean z4 = ((qqt) objV).a;
                if (this.d.c(objV, qrfVar)) {
                    return qrfVar;
                }
            } else {
                if (!(objV instanceof qrb)) {
                    if (z2) {
                        qpy qpyVar = objV instanceof qpy ? (qpy) objV : null;
                        qmuVar.a(qpyVar != null ? qpyVar.b : null);
                    }
                    return qrs.a;
                }
                qrr qrrVarGZ = ((qrb) objV).gZ();
                if (qrrVarGZ != null) {
                    qqr qqrVar = qrs.a;
                    if (z && (objV instanceof qrm)) {
                        synchronized (objV) {
                            qrm qrmVar = (qrm) objV;
                            thD = qrmVar.d();
                            if (thD == null || ((qmuVar instanceof qpt) && !qrmVar.h())) {
                                if (M(objV, qrrVarGZ, qrfVar)) {
                                    if (thD == null) {
                                        return qrfVar;
                                    }
                                    qqrVar = qrfVar;
                                }
                            }
                        }
                        if (thD != null) {
                            if (z2) {
                                qmuVar.a(thD);
                            }
                            return qqrVar;
                        }
                        if (M(objV, qrrVarGZ, qrfVar)) {
                            return qrfVar;
                        }
                    } else {
                        thD = null;
                        if (thD != null) {
                            if (z2) {
                                qmuVar.a(thD);
                            }
                            return qqrVar;
                        }
                        if (M(objV, qrrVarGZ, qrfVar)) {
                            return qrfVar;
                        }
                    }
                } else {
                    if (objV == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    L((qrk) objV);
                }
            }
        }
    }

    @Override // defpackage.qln
    public final qln plus(qln qlnVar) {
        qlnVar.getClass();
        return qmd.g(this, qlnVar);
    }

    @Override // defpackage.qrg
    public void q(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new qrh(a(), null, this);
        }
        B(cancellationException);
    }

    public final int t(Object obj) {
        if (obj instanceof qqt) {
            boolean z = ((qqt) obj).a;
            return 0;
        }
        if (obj instanceof qra) {
            return !this.d.c(obj, ((qra) obj).a) ? -1 : 1;
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(hg() + '{' + O(v()) + '}');
        sb.append('@');
        sb.append(qnm.g(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a8, code lost:
    
        if (r1 == null) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.qrm r9, java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qro.u(qrm, java.lang.Object):java.lang.Object");
    }

    public final Object v() {
        qpe qpeVar = this.d;
        while (true) {
            Object obj = qpeVar.a;
            if (!(obj instanceof qvm)) {
                return obj;
            }
            ((qvm) obj).c(this);
        }
    }

    public final Object x(Object obj, Object obj2) throws Throwable {
        if (!(obj instanceof qrb)) {
            return qrp.a;
        }
        if (((obj instanceof qqt) || (obj instanceof qrk)) && !(obj instanceof qpt) && !(obj2 instanceof qpy)) {
            qrb qrbVar = (qrb) obj;
            boolean z = qql.a;
            if (!this.d.c(qrbVar, qrp.a(obj2))) {
                return qrp.c;
            }
            h(obj2);
            g(qrbVar, obj2);
            return obj2;
        }
        qrb qrbVar2 = (qrb) obj;
        qrr qrrVarF = f(qrbVar2);
        if (qrrVarF == null) {
            return qrp.c;
        }
        qpt qptVarJ = null;
        qrm qrmVar = qrbVar2 instanceof qrm ? (qrm) qrbVar2 : null;
        if (qrmVar == null) {
            qrmVar = new qrm(qrrVarF, null);
        }
        synchronized (qrmVar) {
            if (qrmVar.h()) {
                return qrp.a;
            }
            qrmVar.b.c();
            if (qrmVar != qrbVar2 && !this.d.c(qrbVar2, qrmVar)) {
                return qrp.c;
            }
            boolean z2 = qql.a;
            boolean zG = qrmVar.g();
            qpy qpyVar = obj2 instanceof qpy ? (qpy) obj2 : null;
            if (qpyVar != null) {
                qrmVar.e(qpyVar.b);
            }
            Throwable thD = qrmVar.d();
            if (true == zG) {
                thD = null;
            }
            if (thD != null) {
                i(qrrVarF, thD);
            }
            qpt qptVar = qrbVar2 instanceof qpt ? (qpt) qrbVar2 : null;
            if (qptVar == null) {
                qrr qrrVarGZ = qrbVar2.gZ();
                if (qrrVarGZ != null) {
                    qptVarJ = J(qrrVarGZ);
                }
            } else {
                qptVarJ = qptVar;
            }
            return (qptVarJ == null || !I(qrmVar, qptVarJ, obj2)) ? u(qrmVar, obj2) : qrp.b;
        }
    }

    @Override // defpackage.qru
    public final CancellationException y() {
        Throwable thD;
        Object objV = v();
        if (objV instanceof qrm) {
            thD = ((qrm) objV).d();
        } else if (objV instanceof qpy) {
            thD = ((qpy) objV).b;
        } else {
            if (objV instanceof qrb) {
                throw new IllegalStateException(qno.a("Cannot be cancelling child in this state: ", objV).toString());
            }
            thD = null;
        }
        CancellationException cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        return cancellationException == null ? new qrh(qno.a("Parent job is ", O(objV)), thD, this) : cancellationException;
    }

    protected final CancellationException z(Throwable th, String str) {
        CancellationException qrhVar = th instanceof CancellationException ? (CancellationException) th : null;
        if (qrhVar == null) {
            if (str == null) {
                str = a();
            }
            qrhVar = new qrh(str, th, this);
        }
        return qrhVar;
    }
}
