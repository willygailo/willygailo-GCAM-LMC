package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class qtd extends qso {
    private final ReentrantLock b = new ReentrantLock();
    private Object c = qsp.a;

    @Override // defpackage.qso
    protected final Object a() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            if (this.c != qsp.a) {
                Object obj = this.c;
                this.c = qsp.a;
                return obj;
            }
            Object objU = u();
            if (objU == null) {
                objU = qsp.d;
            }
            return objU;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.qso
    protected final void f(boolean z) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.c = qsp.a;
            reentrantLock.unlock();
            super.f(z);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.qso
    protected final boolean h(qtf qtfVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            return super.h(qtfVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.qso
    protected final boolean i() {
        return false;
    }

    @Override // defpackage.qso
    protected final boolean j() {
        return this.c == qsp.a;
    }

    @Override // defpackage.qso, defpackage.qtg
    public final boolean l() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            return m();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.qsr
    protected final Object p(Object obj) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            qta qtaVarU = u();
            if (qtaVarU != null) {
                reentrantLock.unlock();
                return qtaVarU;
            }
            if (this.c == qsp.a) {
                while (true) {
                    qth qthVarE = e();
                    if (qthVarE == null) {
                        break;
                    }
                    if (qthVarE instanceof qta) {
                        reentrantLock.unlock();
                        return qthVarE;
                    }
                    if (qthVarE.d(obj) != null) {
                        boolean z = qql.a;
                        reentrantLock.unlock();
                        qthVarE.b(obj);
                        return qthVarE.he();
                    }
                }
            }
            this.c = obj;
            qvr qvrVar = qsp.b;
            reentrantLock.unlock();
            return qvrVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.qsr
    protected final String t() {
        return "(value=" + this.c + ')';
    }

    @Override // defpackage.qsr
    protected final boolean x() {
        return false;
    }

    @Override // defpackage.qsr
    protected final boolean y() {
        return false;
    }
}
