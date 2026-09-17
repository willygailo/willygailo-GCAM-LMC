package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qux {
    public final qpe a;
    public final long b;
    public final qpc c;
    private final qpe e = qnt.i(null);
    public final qpa d = qnt.e(qwp.f);

    public qux(long j, qux quxVar, int i) {
        this.a = qnt.i(quxVar);
        this.b = j;
        this.c = qnt.g(i << 16);
    }

    public final Object a() {
        return this.e.a;
    }

    public final qux b() {
        Object objA = a();
        if (objA == quw.a) {
            return null;
        }
        return (qux) objA;
    }

    public final void c() {
        boolean z = qql.a;
        while (true) {
            qux quxVar = (qux) this.a.a;
            while (quxVar != null && quxVar.g()) {
                quxVar = (qux) quxVar.a.a;
            }
            qux quxVarB = b();
            quxVarB.getClass();
            while (quxVarB.g()) {
                quxVarB = quxVarB.b();
                quxVarB.getClass();
            }
            qpe qpeVar = quxVarB.a;
            int i = qpf.a;
            qpeVar.a = quxVar;
            if (quxVar != null) {
                quxVar.e.a = quxVarB;
            }
            if (!quxVarB.g() && (quxVar == null || !quxVar.g())) {
                return;
            }
        }
    }

    public final boolean d() {
        return b() == null;
    }

    public final boolean e(qux quxVar) {
        return this.e.c(null, quxVar);
    }

    public final boolean f() {
        qpc qpcVar = this.c;
        int i = qpf.a;
        return qpc.a.addAndGet(qpcVar, -65536) == qwp.f && !d();
    }

    public final boolean g() {
        return this.c.b == qwp.f && !d();
    }

    public final boolean h() {
        int i;
        qpc qpcVar = this.c;
        do {
            i = qpcVar.b;
            if (i == qwp.f && !d()) {
                return false;
            }
        } while (!qpcVar.d(i, 65536 + i));
        return true;
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.b + ", hashCode=" + hashCode() + ']';
    }
}
