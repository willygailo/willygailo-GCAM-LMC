package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qqv extends qqu {
    public final qpe e = qnt.i(null);
    public final qpe f = qnt.i(null);
    private final qpb b = qnt.f(false);

    @Override // defpackage.qqf
    public final void d(qln qlnVar, Runnable runnable) {
        qlnVar.getClass();
        o(runnable);
    }

    @Override // defpackage.qqu
    public final long f() {
        Runnable runnable;
        if (l()) {
            return 0L;
        }
        qnm qnmVar = (qnm) this.f.a;
        if (qnmVar != null && !qnm.n()) {
            System.nanoTime();
            synchronized (qnmVar) {
            }
        }
        qpe qpeVar = this.e;
        while (true) {
            Object obj = qpeVar.a;
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof qvk)) {
                if (obj == qqw.a) {
                    break;
                }
                if (this.e.c(obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                qvk qvkVar = (qvk) obj;
                Object objB = qvkVar.b();
                if (objB != qvk.a) {
                    runnable = (Runnable) objB;
                    break;
                }
                this.e.c(obj, qvkVar.c());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        qut qutVar = this.d;
        long j = (qutVar == null || qutVar.a()) ? Long.MAX_VALUE : 0L;
        if (j == 0) {
            return 0L;
        }
        Object obj2 = this.e.a;
        if (obj2 != null) {
            if (!(obj2 instanceof qvk)) {
                return obj2 == qqw.a ? Long.MAX_VALUE : 0L;
            }
            if (!((qvk) obj2).e()) {
                return 0L;
            }
        }
        qnm qnmVar2 = (qnm) this.f.a;
        if (qnmVar2 == null) {
            return Long.MAX_VALUE;
        }
        synchronized (qnmVar2) {
        }
        return Long.MAX_VALUE;
    }

    @Override // defpackage.qqu
    protected final void j() {
        ThreadLocal threadLocal = qrz.a;
        qrz.a.set(null);
        this.b.c();
        boolean z = qql.a;
        qpe qpeVar = this.e;
        while (true) {
            Object obj = qpeVar.a;
            if (obj != null) {
                if (!(obj instanceof qvk)) {
                    if (obj == qqw.a) {
                        break;
                    }
                    qvk qvkVar = new qvk(8, true);
                    qvkVar.a((Runnable) obj);
                    if (this.e.c(obj, qvkVar)) {
                        break;
                    }
                } else {
                    ((qvk) obj).d();
                    break;
                }
            } else if (this.e.c(null, qqw.a)) {
                break;
            }
        }
        while (f() <= 0) {
        }
        System.nanoTime();
        qnm qnmVar = (qnm) this.f.a;
        if (qnmVar == null) {
            return;
        }
        synchronized (qnmVar) {
            throw null;
        }
    }

    public final void o(Runnable runnable) {
        qpe qpeVar = this.e;
        while (true) {
            Object obj = qpeVar.a;
            if (!this.b.a()) {
                if (obj == null) {
                    if (this.e.c(null, runnable)) {
                    }
                } else {
                    if (obj instanceof qvk) {
                        qvk qvkVar = (qvk) obj;
                        switch (qvkVar.a(runnable)) {
                            case 0:
                                break;
                            case 1:
                                this.e.c(obj, qvkVar.c());
                                break;
                            default:
                                break;
                        }
                    }
                    if (obj != qqw.a) {
                        qvk qvkVar2 = new qvk(8, true);
                        qvkVar2.a((Runnable) obj);
                        qvkVar2.a(runnable);
                        if (this.e.c(obj, qvkVar2)) {
                        }
                    }
                }
            }
            qqm.b.o(runnable);
            return;
        }
        Thread threadC = c();
        if (Thread.currentThread() != threadC) {
            LockSupport.unpark(threadC);
        }
    }

    protected final boolean p() {
        qut qutVar = this.d;
        if (qutVar != null && !qutVar.a()) {
            return false;
        }
        if (((qnm) this.f.a) != null && !qnm.n()) {
            return false;
        }
        Object obj = this.e.a;
        if (obj == null) {
            return true;
        }
        if (obj instanceof qvk) {
            return ((qvk) obj).e();
        }
        return obj == qqw.a;
    }
}
