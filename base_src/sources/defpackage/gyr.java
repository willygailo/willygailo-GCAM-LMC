package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gyr implements lmv {
    public final List a = new ArrayList();
    public final int b;
    public final lmv c;
    public final Executor d;
    public lmv e;
    public boolean f;
    public final lmu g;
    public final lqd h;
    private final lnc i;

    public gyr(final lnc lncVar, lap lapVar, Executor executor, lqd lqdVar, lco lcoVar) {
        gyq gyqVar = new gyq(this);
        this.c = gyqVar;
        this.g = new lmu() { // from class: gyo
            @Override // defpackage.lmu
            public final void a(final lrr lrrVar) {
                Executor executor2;
                final gyr gyrVar = this.a;
                if (gyrVar.f || (executor2 = gyrVar.d) == null) {
                    return;
                }
                executor2.execute(new Runnable() { // from class: gyp
                    @Override // java.lang.Runnable
                    public final void run() {
                        gyr gyrVar2 = gyrVar;
                        lrr lrrVar2 = lrrVar;
                        synchronized (gyrVar2) {
                            Iterator it = gyrVar2.a.iterator();
                            while (it.hasNext()) {
                                ((lmu) it.next()).a(lrrVar2);
                            }
                        }
                    }
                });
            }
        };
        this.i = lncVar;
        this.d = executor;
        this.h = lqdVar;
        this.b = 3;
        if (((Boolean) lcoVar.fA()).booleanValue()) {
            this.e = r();
        } else {
            this.e = gyqVar;
        }
        lapVar.c(lcoVar.a(new lij() { // from class: gyn
            @Override // defpackage.lij
            public final void fB(Object obj) {
                gyr gyrVar = this.a;
                lnc lncVar2 = lncVar;
                Boolean bool = (Boolean) obj;
                synchronized (gyrVar) {
                    if (gyrVar.f) {
                        return;
                    }
                    if (!bool.booleanValue()) {
                        gyrVar.e.l(gyrVar.g);
                        fvq.x(lncVar2, gyrVar.e);
                        gyrVar.e.close();
                        gyrVar.e = gyrVar.c;
                    } else if (gyrVar.e.equals(gyrVar.c)) {
                        gyrVar.e = gyrVar.r();
                    }
                }
            }
        }, pgr.INSTANCE));
    }

    @Override // defpackage.lmv
    public final synchronized int a() {
        return this.e.a();
    }

    @Override // defpackage.lmv
    public final synchronized int b() {
        return this.e.b();
    }

    @Override // defpackage.lmv
    public final synchronized lmr c() {
        return this.e.c();
    }

    @Override // defpackage.lmv, defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f = true;
        this.a.clear();
        this.e.l(this.g);
        fvq.x(this.i, this.e);
        this.e.close();
        this.e = this.c;
    }

    @Override // defpackage.lmv
    public final synchronized lmr d(ojf ojfVar) {
        return this.e.d(ojfVar);
    }

    @Override // defpackage.lmv
    public final synchronized lmr e() {
        return this.e.e();
    }

    @Override // defpackage.lmv
    public final synchronized lmr f(ojf ojfVar) {
        return this.e.f(ojfVar);
    }

    @Override // defpackage.lmv
    public final synchronized lmr g() {
        return this.e.g();
    }

    @Override // defpackage.lmv
    public final synchronized lmr h() {
        return this.e.h();
    }

    @Override // defpackage.lmv
    public final synchronized List i() {
        return this.e.i();
    }

    @Override // defpackage.lmv
    public final synchronized List j() {
        return this.e.j();
    }

    @Override // defpackage.lmv
    public final synchronized void k(lmu lmuVar) {
        this.a.add(lmuVar);
    }

    @Override // defpackage.lmv
    public final synchronized void l(lmu lmuVar) {
        this.a.remove(lmuVar);
    }

    @Override // defpackage.lmv
    public final synchronized void m(int i) {
        this.e.m(i);
    }

    @Override // defpackage.lmv
    public final synchronized void n(lmt lmtVar) {
        this.e.n(lmtVar);
    }

    @Override // defpackage.lmv
    public final synchronized boolean o(lmw lmwVar) {
        return this.e.o(lmwVar);
    }

    @Override // defpackage.lmv
    public final synchronized boolean p() {
        return this.e.p();
    }

    @Override // defpackage.lmv
    public final synchronized lqd q() {
        return this.h;
    }

    public final lmv r() {
        lnc lncVar = this.i;
        lncVar.getClass();
        lqd lqdVar = this.h;
        lqdVar.getClass();
        lmv lmvVarR = lncVar.r(lqdVar, this.b);
        lmvVarR.k(this.g);
        return lmvVarR;
    }
}
