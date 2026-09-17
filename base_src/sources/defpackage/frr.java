package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class frr implements frn {
    private static final ouj u = ouj.h("com/google/android/apps/camera/microvideo/encoder/VideoTrackSamplerImpl");
    private dxz I;
    public final fpo a;
    public final frm b;
    public final fqy c;
    public final Handler d;
    public final Handler e;
    public final ojc f;
    public final fqx g;
    public final mpi o;
    public final frv p;
    public mqk q;
    public mri r;
    private final ojc w;
    private fqn y;
    private volatile fru z;
    private final juj M = mip.ed(((int) TimeUnit.SECONDS.convert(3000000, TimeUnit.MICROSECONDS)) * 60);
    private final AtomicBoolean v = new AtomicBoolean(false);
    private final mou x = mou.b();
    public volatile boolean h = false;
    private final AtomicLong A = new AtomicLong();
    private final AtomicLong B = new AtomicLong();
    public final AtomicLong i = new AtomicLong();
    public final AtomicLong j = new AtomicLong();
    public final AtomicLong k = new AtomicLong();
    private final AtomicLong C = new AtomicLong();
    private final AtomicLong D = new AtomicLong();
    private final AtomicLong E = new AtomicLong();
    private final AtomicLong F = new AtomicLong();
    public final AtomicLong l = new AtomicLong();
    private final AtomicLong G = new AtomicLong();
    private final AtomicLong H = new AtomicLong();
    public final AtomicInteger m = new AtomicInteger();
    public final AtomicInteger n = new AtomicInteger();
    private final AtomicInteger J = new AtomicInteger();
    public boolean s = false;
    public boolean t = false;
    private long K = 0;
    private List L = new ArrayList();

    public frr(jtx jtxVar, fpo fpoVar, frm frmVar, fqx fqxVar, fqy fqyVar, ojc ojcVar, fry fryVar, ddf ddfVar, byte[] bArr, byte[] bArr2) {
        ddi ddiVar = ddr.a;
        ddfVar.d();
        this.a = fpoVar;
        this.b = frmVar;
        this.g = fqxVar;
        this.c = fqyVar;
        this.e = mip.bW(new lap(), "mv-vid-encode");
        this.d = mip.bW(new lap(), "mv-vid-update");
        this.f = ojcVar;
        ddfVar.b();
        mpi mpiVarH = jtxVar.h("stabilized-vid-track");
        this.o = mpiVarH;
        ddfVar.b();
        fqxVar.g();
        this.p = new frv(mpiVarH);
        dxz dxzVar = new dxz(mpiVarH, 1);
        this.I = dxzVar;
        this.q = dxzVar.a();
        this.r = this.I.b(Collections.singletonList(mou.b()));
        this.w = !fryVar.b.e(fryVar.c.k()) ? oih.a : ojc.i(fry.a);
        ddfVar.b();
        ddi ddiVar2 = ddl.a;
        ddfVar.e();
    }

    private final fqm i(long j) {
        fqm fqmVar;
        synchronized (this.M) {
            fqmVar = (fqm) this.M.a(j);
            if (fqmVar == null) {
                fqmVar = new fqm(j, pih.f(), pih.f());
                this.M.e(j, fqmVar);
            }
        }
        return fqmVar;
    }

    private final void j() {
        this.t = false;
        this.c.b(false);
        h();
        this.A.set(0L);
        this.B.set(0L);
        this.i.set(0L);
        this.j.set(0L);
        this.C.set(0L);
        this.E.set(0L);
        this.F.set(0L);
    }

    @Override // defpackage.fqh
    public final void a(long j) {
        i(j).b.cancel(true);
        this.d.post(new frp(this, 4));
    }

    @Override // defpackage.fqh
    public final void b(long j, List list) {
        if (this.h) {
            return;
        }
        i(j).b.o(list);
        this.d.post(new frp(this, 4));
    }

    @Override // defpackage.frn
    public final synchronized void c(mln mlnVar, fqn fqnVar) {
        this.y = fqnVar;
        this.g.b(mlnVar, this.o, new frq(this, fqnVar), this.e);
        this.c.b(true);
    }

    @Override // defpackage.frn, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.h) {
            ((oug) ((oug) u.c()).G((char) 1926)).o("Trying to close after handler shutdown");
            return;
        }
        Iterator it = this.a.f(this.K).iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (this.f.g()) {
                ((fqi) this.f.c()).b(jLongValue);
            }
            d();
        }
        this.d.post(new frp(this, 1));
    }

    @Override // defpackage.frn
    public final void d() {
        if (this.h) {
            return;
        }
        this.d.post(new frp(this, 4));
    }

    @Override // defpackage.frn
    public final void e() {
        if (this.h) {
            ((oug) ((oug) u.c()).G((char) 1935)).o("Trying to start after handler shutdown");
        } else {
            this.d.post(new frp(this, 3));
        }
    }

    public final void f() {
        if (this.v.getAndSet(true)) {
            ((oug) ((oug) u.c()).G((char) 1934)).o("Shutdown already called. Skipping additional requests.");
            return;
        }
        h();
        fqx fqxVar = this.g;
        pht phtVarA = fqxVar != null ? fqxVar.a() : plk.V(null);
        fvq.a("VideoTrackSampler", phtVarA);
        phtVarA.d(new frp(this, 2), pgr.INSTANCE);
    }

    public final void g() {
        if (Thread.currentThread().getId() != this.d.getLooper().getThread().getId()) {
            ((oug) ((oug) u.c()).G((char) 1936)).o("Sampling video on a non-video-encoder thread");
        }
        long jA = this.a.a();
        if (jA != -1) {
            this.G.set(jA);
        }
        fqn fqnVar = this.y;
        if (this.g.c() && fqnVar != null && this.t) {
            mad madVarB = this.a.b(this.K);
            if (madVarB != null) {
                try {
                    this.H.set(madVarB.d());
                } catch (Throwable th) {
                    if (madVarB != null) {
                        try {
                            madVarB.close();
                        } catch (Throwable th2) {
                        }
                    }
                    throw th;
                }
            }
            if (madVarB == null) {
                if (this.s) {
                    j();
                    f();
                    return;
                }
                return;
            }
            long jD = madVarB.d();
            long jConvert = TimeUnit.MICROSECONDS.convert(jD, TimeUnit.NANOSECONDS);
            if (this.C.get() <= 0 || jD - this.C.get() > 5000000000L || jD < this.C.get()) {
                this.C.set(jD);
                h();
            }
            nle nleVarG = fqnVar.g(jConvert);
            if (nleVarG.l()) {
                this.K = jD;
                this.d.post(new frp(this, 4));
            }
            fqm fqmVarI = i(jD);
            fqmVarI.c.o(nleVarG);
            boolean zN = nleVarG.n();
            boolean z = true;
            boolean z2 = zN && !fqmVarI.b.isDone();
            if (fqmVarI.c.isDone() && !z2 && !fqmVarI.c.isCancelled()) {
                boolean z3 = zN && !fqmVarI.b.isCancelled();
                long jD2 = madVarB.d();
                try {
                    nle nleVar = (nle) plk.ad(fqmVarI.c);
                    TimeUnit.MICROSECONDS.convert(fqmVarI.a, TimeUnit.NANOSECONDS);
                    if ((nleVar.a & 1) != 0) {
                        fvq.b();
                        if (!z3 && !this.w.g()) {
                            z = false;
                        }
                        if (z) {
                            List listM = z3 ? (List) plk.ad(fqmVarI.b) : oom.m(this.x);
                            this.L = listM;
                            if (this.w.g()) {
                                ArrayList arrayList = new ArrayList(listM.size());
                                mou mouVar = (mou) this.w.c();
                                Iterator it = listM.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((mou) it.next()).c(mouVar));
                                }
                                listM = arrayList;
                            }
                            int size = listM.size();
                            dxz dxzVar = this.I;
                            if (dxzVar == null || dxzVar.b != size) {
                                this.I = new dxz(this.o, size);
                                this.q.close();
                                this.q = this.I.a();
                            }
                            this.r.close();
                            this.r = this.I.b(listM);
                        }
                        this.J.incrementAndGet();
                        long jD3 = madVarB.d();
                        frm frmVar = this.b;
                        if (frmVar != null) {
                            if (zN) {
                                frmVar.d(jD3, this.L);
                                this.E.incrementAndGet();
                            } else {
                                frmVar.c(jD3);
                                this.F.incrementAndGet();
                            }
                        }
                        this.K = fqmVarI.a;
                        if (z) {
                            this.g.f(madVarB, new fqw() { // from class: fro
                                @Override // defpackage.fqw
                                public final void a(mqg mqgVar, mrd mrdVar) {
                                    frr frrVar = this.a;
                                    frv frvVar = frrVar.p;
                                    mqk mqkVar = frrVar.q;
                                    mri mriVar = frrVar.r;
                                    float[] fArrD = frrVar.g.d();
                                    mqb mqbVarA = mqb.b(mriVar, mqkVar).a(frvVar.a);
                                    mqbVarA.c("aPosition", 0);
                                    mqbVarA.c("aTexCoord", 1);
                                    mqbVarA.i(fArrD);
                                    mqbVarA.d(mqgVar);
                                    mqbVarA.h = true;
                                    mqbVarA.j(mrdVar);
                                }
                            });
                        } else {
                            this.g.e(madVarB);
                        }
                        this.B.incrementAndGet();
                        this.d.post(new frp(this, 4));
                    } else {
                        this.A.incrementAndGet();
                        this.D.set(jD2);
                    }
                    if (nleVar.m()) {
                        j();
                    }
                } catch (ExecutionException e) {
                    throw new AssertionError("Future expected to be in done state but was not.");
                }
            } else if (this.s) {
                j();
                f();
            }
            madVarB.close();
        }
    }

    public final void h() {
        this.A.get();
        this.B.get();
        this.i.get();
        this.j.get();
        this.k.get();
        this.E.get();
        this.F.get();
        this.G.get();
        this.H.get();
        this.D.get();
        this.m.get();
    }
}
