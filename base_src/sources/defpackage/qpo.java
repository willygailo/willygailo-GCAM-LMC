package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class qpo extends qqo implements qpn, qlv {
    public final qlh a;
    public final qpc b;
    public final qpe c;
    public qqr d;
    private final qln f;

    public qpo(qlh qlhVar, int i) {
        super(i);
        this.a = qlhVar;
        boolean z = qql.a;
        this.f = qlhVar.getContext();
        this.b = qnt.g(0);
        this.c = qnt.i(qph.a);
    }

    private static final void A(qmu qmuVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + qmuVar + ", already has " + obj).toString());
    }

    private static final Object B(qrt qrtVar, Object obj, int i, qmu qmuVar) {
        if (obj instanceof qpy) {
            boolean z = qql.a;
            return obj;
        }
        if (!qnm.e(i)) {
            return obj;
        }
        if (qmuVar != null || ((qrtVar instanceof qpl) && !(qrtVar instanceof qpi))) {
            return new qpx(obj, qrtVar instanceof qpl ? (qpl) qrtVar : null, qmuVar, null, 16);
        }
        return obj;
    }

    private final qqr v() {
        qrg qrgVar = (qrg) this.f.get(qrg.c);
        if (qrgVar == null) {
            return null;
        }
        qqr qqrVarB = qno.B(qrgVar, true, new qpr(this), 2);
        this.d = qqrVarB;
        return qqrVarB;
    }

    private final void w(qmu qmuVar, Throwable th) {
        try {
            qmuVar.a(th);
        } catch (Throwable th2) {
            qnm.l(this.f, new qqb(qno.a("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* JADX WARN: Switch 'out' block B:3:0x0002 for B:4:0x0005 already processed. Defaulting to fallback option. */
    private final void x(int i) {
        qpc qpcVar = this.b;
        do {
            switch (qpcVar.b) {
                case 0:
                    break;
                case 1:
                    boolean z = qql.a;
                    qlh qlhVar = this.a;
                    if (!(qlhVar instanceof quz) || qnm.e(i) != qnm.e(this.e)) {
                        qnm.d(this, qlhVar, false);
                        return;
                    }
                    qqf qqfVar = ((quz) qlhVar).a;
                    qln context = qlhVar.getContext();
                    if (qqfVar.e(context)) {
                        qqfVar.d(context, this);
                        return;
                    }
                    ThreadLocal threadLocal = qrz.a;
                    qqu qquVarA = qrz.a();
                    if (qquVarA.k()) {
                        qquVarA.h(this);
                        return;
                    }
                    qquVarA.i(true);
                    try {
                        qnm.d(this, this.a, true);
                        do {
                            break;
                        } while (qquVarA.l());
                    } catch (Throwable th) {
                        try {
                            u(th, null);
                        } finally {
                            qquVarA.g(true);
                        }
                        break;
                    }
                    return;
                default:
                    throw new IllegalStateException("Already resumed".toString());
            }
        } while (!this.b.d(0, 2));
    }

    private final void y() {
        qlh qlhVar = this.a;
        Throwable th = null;
        quz quzVar = qlhVar instanceof quz ? (quz) qlhVar : null;
        if (quzVar != null) {
            qpe qpeVar = quzVar.f;
            do {
                Object obj = qpeVar.a;
                if (obj != qva.b) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(qno.a("Inconsistent state ", obj).toString());
                    }
                    if (!quzVar.f.c(obj, null)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    th = (Throwable) obj;
                    break;
                }
            } while (!quzVar.f.c(qva.b, this));
        }
        if (th == null) {
            return;
        }
        p();
        c(th);
    }

    private final void z(Object obj, int i, qmu qmuVar) {
        Object obj2;
        qpe qpeVar = this.c;
        do {
            obj2 = qpeVar.a;
            if (!(obj2 instanceof qrt)) {
                if (obj2 instanceof qpq) {
                    qpq qpqVar = (qpq) obj2;
                    if (qpqVar.a.b()) {
                        if (qmuVar == null) {
                            return;
                        }
                        n(qmuVar, qpqVar.b);
                        return;
                    }
                }
                throw new IllegalStateException(qno.a("Already resumed, but proposed with update ", obj).toString());
            }
        } while (!this.c.c(obj2, B((qrt) obj2, obj, i, qmuVar)));
        q();
        x(i);
    }

    @Override // defpackage.qpn
    public final void a(qmu qmuVar) {
        qpl qrdVar = qmuVar instanceof qpl ? (qpl) qmuVar : new qrd(qmuVar);
        qpe qpeVar = this.c;
        while (true) {
            Object obj = qpeVar.a;
            if (obj instanceof qph) {
                if (this.c.c(obj, qrdVar)) {
                    return;
                }
            } else if (obj instanceof qpl) {
                A(qmuVar, obj);
            } else {
                if (obj instanceof qpy) {
                    qpy qpyVar = (qpy) obj;
                    if (!qpyVar.a()) {
                        A(qmuVar, obj);
                    }
                    if (obj instanceof qpq) {
                        w(qmuVar, qpyVar != null ? qpyVar.b : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof qpx) {
                    qpx qpxVar = (qpx) obj;
                    if (qpxVar.b != null) {
                        A(qmuVar, obj);
                    }
                    if (qrdVar instanceof qpi) {
                        return;
                    }
                    if (qpxVar.a()) {
                        w(qmuVar, qpxVar.e);
                        return;
                    } else {
                        if (this.c.c(obj, qpx.b(qpxVar, qrdVar, null, 29))) {
                            return;
                        }
                    }
                } else {
                    if (qrdVar instanceof qpi) {
                        return;
                    }
                    if (this.c.c(obj, new qpx(obj, qrdVar, null, null, 28))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.qpn
    public final void b(Object obj, qmu qmuVar) {
        z(obj, this.e, qmuVar);
    }

    @Override // defpackage.qpn
    public final void c(Throwable th) {
        Object obj;
        boolean z;
        qpe qpeVar = this.c;
        do {
            obj = qpeVar.a;
            if (!(obj instanceof qrt)) {
                return;
            } else {
                z = obj instanceof qpl;
            }
        } while (!this.c.c(obj, new qpq(th, z)));
        qpl qplVar = z ? (qpl) obj : null;
        if (qplVar != null) {
            m(qplVar, th);
        }
        q();
        x(this.e);
    }

    @Override // defpackage.qpn
    public final Object d(Object obj) {
        return t(obj, null);
    }

    @Override // defpackage.qpn
    public final Object e(Object obj, qmu qmuVar) {
        return t(obj, qmuVar);
    }

    @Override // defpackage.qpn
    public final void f() {
        boolean z = qql.a;
        x(this.e);
    }

    /* JADX WARN: Switch 'out' block B:3:0x0006 for B:4:0x0008 already processed. Defaulting to fallback option. */
    public final Object g() {
        qrg qrgVar;
        boolean zS = s();
        qpc qpcVar = this.b;
        do {
            switch (qpcVar.b) {
                case 0:
                    break;
                case 1:
                default:
                    throw new IllegalStateException("Already suspended".toString());
                case 2:
                    if (zS) {
                        y();
                    }
                    Object objH = h();
                    if (objH instanceof qpy) {
                        Throwable th = ((qpy) objH).b;
                        if (qql.b) {
                            throw qvq.a(th, this);
                        }
                        throw th;
                    }
                    if (!qnm.e(this.e) || (qrgVar = (qrg) this.f.get(qrg.c)) == null || qrgVar.hl()) {
                        return i(objH);
                    }
                    CancellationException cancellationExceptionM = qrgVar.m();
                    o(objH, cancellationExceptionM);
                    if (qql.b) {
                        throw qvq.a(cancellationExceptionM, this);
                    }
                    throw cancellationExceptionM;
            }
        } while (!this.b.d(0, 1));
        if (this.d == null) {
            v();
        }
        if (zS) {
            y();
        }
        return qlp.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.qlv
    public final qlv getCallerFrame() {
        qlh qlhVar = this.a;
        if (qlhVar instanceof qlv) {
            return (qlv) qlhVar;
        }
        return null;
    }

    @Override // defpackage.qlh
    public final qln getContext() {
        return this.f;
    }

    @Override // defpackage.qlv
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object h() {
        return this.c.a;
    }

    @Override // defpackage.qqo
    public final Object i(Object obj) {
        return obj instanceof qpx ? ((qpx) obj).a : obj;
    }

    @Override // defpackage.qqo
    public final Object j() {
        return h();
    }

    @Override // defpackage.qqo
    public final Throwable k(Object obj) {
        Throwable thK = super.k(obj);
        if (thK == null) {
            return null;
        }
        qlh qlhVar = this.a;
        return (qql.b && (qlhVar instanceof qlv)) ? qvq.a(thK, (qlv) qlhVar) : thK;
    }

    @Override // defpackage.qqo
    public final qlh l() {
        return this.a;
    }

    public final void m(qpl qplVar, Throwable th) {
        try {
            qplVar.b(th);
        } catch (Throwable th2) {
            qnm.l(this.f, new qqb(qno.a("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void n(qmu qmuVar, Throwable th) {
        try {
            qmuVar.a(th);
        } catch (Throwable th2) {
            qnm.l(this.f, new qqb(qno.a("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    @Override // defpackage.qqo
    public final void o(Object obj, Throwable th) {
        qpe qpeVar = this.c;
        while (true) {
            Object obj2 = qpeVar.a;
            if (obj2 instanceof qrt) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof qpy) {
                return;
            }
            if (obj2 instanceof qpx) {
                qpx qpxVar = (qpx) obj2;
                if (qpxVar.a()) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (this.c.c(obj2, qpx.b(qpxVar, null, th, 15))) {
                    qpl qplVar = qpxVar.b;
                    if (qplVar != null) {
                        m(qplVar, th);
                    }
                    qmu qmuVar = qpxVar.c;
                    if (qmuVar == null) {
                        return;
                    }
                    n(qmuVar, th);
                    return;
                }
            } else if (this.c.c(obj2, new qpx(obj2, null, null, th, 14))) {
                return;
            }
        }
    }

    public final void p() {
        qqr qqrVar = this.d;
        if (qqrVar == null) {
            return;
        }
        qqrVar.e();
        this.d = qrs.a;
    }

    public final void q() {
        if (s()) {
            return;
        }
        p();
    }

    public final void r() {
        qqr qqrVarV = v();
        if (qqrVarV == null || (h() instanceof qrt)) {
            return;
        }
        qqrVarV.e();
        this.d = qrs.a;
    }

    @Override // defpackage.qlh
    public final void resumeWith(Object obj) {
        Throwable thA = qkn.a(obj);
        if (thA != null) {
            if (qql.b) {
                thA = qvq.a(thA, this);
            }
            obj = new qpy(thA);
        }
        z(obj, this.e, null);
    }

    public final boolean s() {
        return this.e == 2 && ((quz) this.a).f.a != null;
    }

    public final qvr t(Object obj, qmu qmuVar) {
        Object obj2;
        qpe qpeVar = this.c;
        do {
            obj2 = qpeVar.a;
            if (!(obj2 instanceof qrt)) {
                boolean z = obj2 instanceof qpx;
                return null;
            }
        } while (!this.c.c(obj2, B((qrt) obj2, obj, this.e, qmuVar)));
        q();
        return qpp.a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CancellableContinuation(");
        sb.append(qnm.h(this.a));
        sb.append("){");
        Object objH = h();
        if (objH instanceof qrt) {
            str = "Active";
        } else {
            str = objH instanceof qpq ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(qnm.g(this));
        return sb.toString();
    }
}
