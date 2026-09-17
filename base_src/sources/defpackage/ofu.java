package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ofu {
    public final ofr a;
    public final pih d;
    public final AtomicLong b = new AtomicLong(b(Integer.MIN_VALUE, Integer.MIN_VALUE));
    public final AtomicReference c = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);
    private final Executor f = plk.M(pgr.INSTANCE);

    public ofu(pgj pgjVar, Executor executor) {
        pih pihVarF = pih.f();
        this.d = pihVarF;
        ofr ofrVar = new ofr(pgjVar, executor);
        this.a = ofrVar;
        pihVarF.d(ofrVar, pgr.INSTANCE);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long b(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final pht c() {
        long j;
        final int iA;
        if (this.d.isDone()) {
            return this.d;
        }
        do {
            j = this.b.get();
            iA = a(j);
        } while (!this.b.compareAndSet(j, b(iA, ((int) j) + 1)));
        final pih pihVarF = pih.f();
        pht phtVar = (pht) this.e.getAndSet(pihVarF);
        pihVarF.e(phtVar == null ? plk.aa(ogl.a(new pgj() { // from class: ofo
            @Override // defpackage.pgj
            public final pht a() {
                return this.a.d(iA);
            }
        }), pgr.INSTANCE) : pfj.i(phtVar, Throwable.class, ogl.b(new pgk() { // from class: ofp
            @Override // defpackage.pgk
            public final pht a(Object obj) {
                return this.a.d(iA);
            }
        }), this.f));
        final ofs ofsVar = new ofs(this, iA);
        pihVarF.d(new Runnable() { // from class: ofq
            @Override // java.lang.Runnable
            public final void run() {
                ofu ofuVar = this.a;
                pih pihVar = pihVarF;
                ofs ofsVar2 = ofsVar;
                try {
                    ofuVar.d.o(plk.ad(pihVar));
                    ofsVar2.e(ofuVar.d);
                } catch (Throwable th) {
                    ofsVar2.e(pihVar);
                }
            }
        }, pgr.INSTANCE);
        return ofsVar;
    }

    public final pht d(int i) {
        oft oftVar;
        if (a(this.b.get()) > i) {
            return plk.T();
        }
        oft oftVar2 = new oft(i);
        do {
            oftVar = (oft) this.c.get();
            if (oftVar != null && oftVar.a > i) {
                return plk.T();
            }
        } while (!this.c.compareAndSet(oftVar, oftVar2));
        if (a(this.b.get()) > i) {
            oftVar2.cancel(true);
            this.c.compareAndSet(oftVar2, null);
            return oftVar2;
        }
        ofr ofrVar = this.a;
        pgj pgjVar = ofrVar.a;
        Executor executor = ofrVar.b;
        if (pgjVar == null || executor == null) {
            oftVar2.e(this.d);
        } else {
            oftVar2.e(plk.aa(ogl.a(pgjVar), executor));
        }
        return oftVar2;
    }
}
