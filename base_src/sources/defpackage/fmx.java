package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class fmx implements fpo {
    private final lnx b;
    private final lmv c;
    private final List d = new ArrayList();
    private final List e = new ArrayList();
    public final AtomicBoolean a = new AtomicBoolean();

    public fmx(lnx lnxVar, lmv lmvVar) {
        this.b = lnxVar;
        this.c = lmvVar;
    }

    @Override // defpackage.fpo
    public final synchronized long a() {
        if (this.a.get()) {
            if (this.d.isEmpty()) {
                return -1L;
            }
            lmw lmwVarB = ((lmr) ohh.t(this.d)).b();
            if (lmwVarB != null) {
                return lmwVarB.b;
            }
            return -1L;
        }
        lmr lmrVarE = this.c.e();
        if (lmrVarE == null) {
            return -1L;
        }
        try {
            lmw lmwVarB2 = lmrVarE.b();
            long j = lmwVarB2 != null ? lmwVarB2.b : -1L;
            lmrVarE.close();
            return j;
        } catch (Throwable th) {
            try {
                lmrVarE.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    @Override // defpackage.fpo
    public final synchronized mad b(long j) {
        mad madVarD = null;
        if (this.a.get()) {
            for (lmr lmrVar : this.d) {
                lmw lmwVarB = lmrVar.b();
                if (lmwVarB != null && lmwVarB.b > j) {
                    return lmrVar.d(this.b);
                }
            }
            return null;
        }
        lmr lmrVarD = this.c.d(new fmu(j, 1));
        if (lmrVarD != null) {
            try {
                madVarD = lmrVarD.d(this.b);
            } catch (Throwable th) {
                try {
                    lmrVarD.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        }
        if (lmrVarD != null) {
            lmrVarD.close();
        }
        return madVarD;
    }

    @Override // defpackage.fpo
    public final synchronized mad c(long j) {
        mad madVarD = null;
        if (this.a.get()) {
            for (lmr lmrVar : this.d) {
                lmw lmwVarB = lmrVar.b();
                if (lmwVarB != null && lmwVarB.b == j) {
                    return lmrVar.d(this.b);
                }
            }
            return null;
        }
        lmr lmrVarD = this.c.d(new fmu(j, 2));
        if (lmrVarD != null) {
            try {
                madVarD = lmrVarD.d(this.b);
            } catch (Throwable th) {
                try {
                    lmrVarD.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        }
        if (lmrVarD != null) {
            lmrVarD.close();
        }
        return madVarD;
    }

    @Override // defpackage.fpo
    public final synchronized mad d() {
        mad madVarD = null;
        if (this.a.get()) {
            if (this.d.isEmpty()) {
                return null;
            }
            return ((lmr) ohh.t(this.d)).d(this.b);
        }
        lmr lmrVarF = this.c.f(mcz.b);
        if (lmrVarF != null) {
            try {
                madVarD = lmrVarF.d(this.b);
            } catch (Throwable th) {
                try {
                    lmrVarF.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        }
        if (lmrVarF != null) {
            lmrVarF.close();
        }
        return madVarD;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[Catch: all -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005f, blocks: (B:18:0x0042, B:20:0x0048, B:24:0x0057), top: B:42:0x0042, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[Catch: all -> 0x0068, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x000f, B:8:0x0015, B:10:0x0021, B:12:0x0027, B:15:0x0031, B:16:0x0034, B:21:0x0052, B:26:0x005b, B:33:0x0067, B:18:0x0042, B:20:0x0048, B:24:0x0057), top: B:41:0x0001, inners: #2 }] */
    @Override // defpackage.fpo
    public final synchronized ojc e(long j) {
        ojc ojcVarI;
        ojc ojcVarI2;
        if (this.a.get()) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                lmw lmwVarB = ((lmr) it.next()).b();
                if (lmwVarB != null) {
                    long j2 = lmwVarB.b;
                    if (j2 > j) {
                        ojcVarI2 = ojc.i(Long.valueOf(j2));
                        return ojcVarI2;
                    }
                }
            }
            ojcVarI2 = oih.a;
            return ojcVarI2;
        }
        lmr lmrVarD = this.c.d(new fmu(j, 0));
        if (lmrVarD == null) {
            ojcVarI = oih.a;
            if (lmrVarD != null) {
                lmrVarD.close();
            }
            return ojcVarI;
        }
        try {
            lmw lmwVarB2 = lmrVarD.b();
            if (lmwVarB2 != null) {
                ojcVarI = ojc.i(Long.valueOf(lmwVarB2.b));
                lmrVarD.close();
            } else {
                ojcVarI = oih.a;
                if (lmrVarD != null) {
                    lmrVarD.close();
                }
            }
            return ojcVarI;
        } catch (Throwable th) {
            if (lmrVarD != null) {
                try {
                    lmrVarD.close();
                } catch (Throwable th2) {
                }
            }
            throw th;
        }
        throw th;
    }

    @Override // defpackage.fpo
    public final synchronized List f(long j) {
        ArrayList arrayList;
        this.a.set(true);
        arrayList = new ArrayList();
        otj it = ((oom) this.c.i()).iterator();
        while (it.hasNext()) {
            lmr lmrVar = (lmr) it.next();
            lmw lmwVarB = lmrVar.b();
            if (lmwVarB != null) {
                long j2 = lmwVarB.b;
                if (j2 > j) {
                    arrayList.add(Long.valueOf(j2));
                    this.d.add(lmrVar);
                }
            }
            lmrVar.close();
        }
        return arrayList;
    }

    @Override // defpackage.fpo
    public final synchronized void g(final fpn fpnVar, final Executor executor) {
        this.e.add(fpnVar);
        this.c.k(new lmu() { // from class: fmt
            @Override // defpackage.lmu
            public final void a(final lrr lrrVar) {
                lmr lmrVarA;
                fmx fmxVar = this.a;
                final fpn fpnVar2 = fpnVar;
                Executor executor2 = executor;
                fb fbVar = new fb() { // from class: fms
                    @Override // defpackage.fb
                    public final void accept(Object obj) {
                        lrr lrrVar2 = lrrVar;
                        fpn fpnVar3 = fpnVar2;
                        lmw lmwVarB = lrrVar2.b();
                        if (lmwVarB == null) {
                            return;
                        }
                        fpnVar3.a(lmwVarB.b);
                    }
                };
                if (fmxVar.a.get() || (lmrVarA = lrrVar.a()) == null) {
                    return;
                }
                lmrVarA.j(new fmw(executor2, fbVar, lmrVarA));
            }
        });
    }

    @Override // defpackage.fpo
    public final synchronized void h() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((lmr) it.next()).close();
        }
        this.d.clear();
        this.a.set(false);
    }

    @Override // defpackage.fpo
    public final void i() {
    }
}
