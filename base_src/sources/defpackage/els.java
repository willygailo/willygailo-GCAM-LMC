package defpackage;

import android.os.Handler;
import java.util.Date;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class els implements elw, kaq, jel, jrt, fik, fib, fig, fie {
    public static final Object a = new Object();
    public final lar b;
    public final fhv c;
    public lyy e;
    public ojz f;
    public elv j;
    public final lzb l;
    private final Handler m;
    private Runnable o;
    private final Set n = new HashSet();
    public final PriorityQueue d = new PriorityQueue(cdg.f);
    private boolean p = false;
    private boolean q = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public int k = 1;

    public els(lar larVar, Handler handler, fhv fhvVar, lzb lzbVar) {
        this.b = larVar;
        this.m = handler;
        this.c = fhvVar;
        this.l = lzbVar;
    }

    private final void q() {
        synchronized (a) {
            final elv elvVar = this.j;
            if (elvVar != null) {
                this.b.execute(new Runnable() { // from class: eln
                    @Override // java.lang.Runnable
                    public final void run() {
                        elvVar.g();
                    }
                });
                if (this.j.l()) {
                    this.d.remove(this.j);
                }
            }
            this.j = null;
            if (this.m.hasCallbacks(this.o)) {
                this.m.removeCallbacks(this.o);
            }
        }
    }

    private final void r(final elv elvVar, final Runnable runnable) {
        if (this.g) {
            return;
        }
        final Runnable runnable2 = new Runnable() { // from class: elm
            @Override // java.lang.Runnable
            public final void run() {
                els elsVar = this.a;
                Runnable runnable3 = runnable;
                synchronized (els.a) {
                    runnable3.run();
                    ojc ojcVarF = elsVar.f();
                    if (ojcVarF.g()) {
                        elsVar.o((elv) ojcVarF.c());
                    } else {
                        elsVar.j = null;
                    }
                    elsVar.g = false;
                }
            }
        };
        synchronized (a) {
            this.b.execute(new Runnable() { // from class: elk
                @Override // java.lang.Runnable
                public final void run() {
                    els elsVar = this.a;
                    elv elvVar2 = elvVar;
                    Runnable runnable3 = runnable2;
                    synchronized (els.a) {
                        if (elsVar.d.contains(elvVar2)) {
                            elvVar2.f(runnable3);
                        } else {
                            runnable3.run();
                        }
                    }
                }
            });
            if (this.m.hasCallbacks(this.o)) {
                this.m.removeCallbacks(this.o);
            }
        }
    }

    private final boolean s(elv elvVar) {
        synchronized (a) {
            if (!this.p && !this.q) {
                return !this.n.contains(elvVar.b());
            }
            return false;
        }
    }

    @Override // defpackage.elw
    public final lie d(final elv elvVar) {
        Object obj = a;
        synchronized (obj) {
            elvVar.i(new Date());
            final int i = 0;
            if (this.d.contains(elvVar)) {
                if (elvVar.equals(this.j)) {
                    synchronized (obj) {
                        elv elvVar2 = this.j;
                        if (elvVar2 != null && !elvVar2.m()) {
                            this.m.removeCallbacks(this.o);
                            this.m.postDelayed(this.o, this.j.a());
                            this.b.execute(new elj(this, this.j, 0));
                        }
                    }
                }
                final int i2 = 1;
                return new lie(this) { // from class: elo
                    public final /* synthetic */ els a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        switch (i2) {
                            case 0:
                                this.a.g(elvVar);
                                break;
                            default:
                                this.a.g(elvVar);
                                break;
                        }
                    }
                };
            }
            if (elvVar.l() && (!s(elvVar) || (this.j != null && (enl.s(elvVar.p()) <= enl.s(this.j.p()) || this.j.k())))) {
                return bug.j;
            }
            this.d.add(elvVar);
            if (s(elvVar)) {
                if (this.j == null) {
                    o(elvVar);
                } else if (elvVar.equals(this.d.peek())) {
                    if (this.j.k()) {
                        r(this.j, bvf.i);
                    } else {
                        q();
                        o(elvVar);
                    }
                }
            }
            return new lie(this) { // from class: elo
                public final /* synthetic */ els a;

                {
                    this.a = this;
                }

                @Override // defpackage.lie, java.lang.AutoCloseable
                public final void close() {
                    switch (i) {
                        case 0:
                            this.a.g(elvVar);
                            break;
                        default:
                            this.a.g(elvVar);
                            break;
                    }
                }
            };
        }
    }

    @Override // defpackage.elw
    public final lie e(final elx elxVar) {
        j(elxVar);
        return new lie() { // from class: elp
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                this.a.m(elxVar);
            }
        };
    }

    public final ojc f() {
        synchronized (a) {
            if (!this.p && !this.q) {
                PriorityQueue priorityQueue = new PriorityQueue(this.d);
                for (elv elvVar = (elv) priorityQueue.peek(); elvVar != null; elvVar = (elv) priorityQueue.peek()) {
                    if (s(elvVar)) {
                        return ojc.i(elvVar);
                    }
                    priorityQueue.poll();
                }
                return oih.a;
            }
            return oih.a;
        }
    }

    @Override // defpackage.fib
    public final void fT() {
        this.l.c(this.e);
    }

    @Override // defpackage.fie
    public final void fU() {
        this.q = true;
        synchronized (a) {
            for (elv elvVar : (elv[]) this.d.toArray(new elv[0])) {
                if (!elvVar.n()) {
                    g(elvVar);
                }
            }
        }
        q();
    }

    @Override // defpackage.fig
    public final void fV() {
        this.q = false;
        ojc ojcVarF = f();
        if (ojcVarF.g()) {
            o((elv) ojcVarF.c());
        }
    }

    @Override // defpackage.elw
    public final void g(elv elvVar) {
        synchronized (a) {
            if (!elvVar.equals(this.j)) {
                this.d.remove(elvVar);
            } else if (this.j.k()) {
                r(this.j, new elj(this, elvVar, 1));
                this.g = true;
            } else {
                q();
                this.d.remove(elvVar);
                ojc ojcVarF = f();
                if (ojcVarF.g()) {
                    o((elv) ojcVarF.c());
                }
            }
        }
    }

    @Override // defpackage.elw
    public final void h(Object obj) {
        synchronized (a) {
            for (elv elvVar : (elv[]) this.d.toArray(new elv[0])) {
                if (obj.equals(elvVar.c())) {
                    g(elvVar);
                }
            }
        }
    }

    @Override // defpackage.elw
    public final void i() {
        synchronized (a) {
            this.p = true;
            if (this.j != null) {
                q();
            }
        }
    }

    @Override // defpackage.elw
    public final void j(elx elxVar) {
        synchronized (a) {
            this.n.add(elxVar);
            elv elvVar = this.j;
            if (elvVar != null && this.n.contains(elvVar.b())) {
                q();
                ojc ojcVarF = f();
                if (ojcVarF.g()) {
                    o((elv) ojcVarF.c());
                }
            }
        }
    }

    @Override // defpackage.jrt
    public final void k(jrz jrzVar) {
        synchronized (a) {
            this.i = ((jbw) this.f.a()).b.p;
            this.b.execute(new elr(this, 0));
        }
    }

    @Override // defpackage.jel
    public final void l(boolean z) {
        synchronized (a) {
            this.h = z;
            this.b.execute(new elr(this, 2));
        }
    }

    @Override // defpackage.elw
    public final void m(elx elxVar) {
        synchronized (a) {
            this.n.remove(elxVar);
            ojc ojcVarF = f();
            if (ojcVarF.g() && !((elv) ojcVarF.c()).equals(this.j)) {
                q();
                o((elv) ojcVarF.c());
            }
        }
    }

    @Override // defpackage.elw
    public final void n() {
        synchronized (a) {
            this.p = false;
            this.n.clear();
            elv elvVar = (elv) this.d.peek();
            elv elvVar2 = this.j;
            if (elvVar2 == null && elvVar != null) {
                o(elvVar);
            } else if (elvVar != null && !elvVar.equals(elvVar2)) {
                q();
                o(elvVar);
            }
        }
    }

    public final void o(elv elvVar) {
        synchronized (a) {
            this.b.execute(new elj(this, elvVar, 2));
            this.j = elvVar;
            if (!elvVar.m()) {
                elr elrVar = new elr(this, 3);
                this.o = elrVar;
                this.m.postDelayed(elrVar, elvVar.a());
            }
        }
    }

    @Override // defpackage.kaq
    public final void p(final int i) {
        synchronized (a) {
            this.k = i;
            this.b.execute(new Runnable() { // from class: ell
                @Override // java.lang.Runnable
                public final void run() {
                    els elsVar = this.a;
                    int i2 = i;
                    synchronized (els.a) {
                        elv elvVar = elsVar.j;
                        if (elvVar != null) {
                            elvVar.q(i2, elsVar.h, elsVar.i);
                        }
                    }
                }
            });
        }
    }
}
