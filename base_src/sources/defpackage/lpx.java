package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class lpx implements lnc {
    public final lpf a;
    public final lis b;
    public final lpq c;
    private final lqg d;
    private final loy e;
    private final lom f;
    private final lrc g;
    private final lqt h;
    private final lap i;
    private final long j;
    private final lrx k;
    private final lqz l;
    private final lpz m;
    private final lpr n;
    private final lqk o;
    private final loo p;
    private final phv q;
    private Future r;
    private final mhm s;

    public lpx(lpr lprVar, lpz lpzVar, lpf lpfVar, lqg lqgVar, loy loyVar, lom lomVar, lqt lqtVar, lrc lrcVar, lap lapVar, lld lldVar, lqz lqzVar, mhm mhmVar, lrx lrxVar, lqk lqkVar, lis lisVar, lpq lpqVar, byte[] bArr, byte[] bArr2) {
        phv phvVarJ = plk.J(mip.bM("FSEx"));
        this.q = phvVarJ;
        this.n = lprVar;
        this.a = lpfVar;
        this.d = lqgVar;
        this.e = loyVar;
        this.f = lomVar;
        this.h = lqtVar;
        this.g = lrcVar;
        this.i = lapVar;
        this.l = lqzVar;
        this.s = mhmVar;
        this.m = lpzVar;
        this.c = lpqVar;
        this.o = lqkVar;
        this.k = lrxVar;
        this.p = new loo(lpqVar, phvVarJ, lisVar);
        this.b = lisVar.a("FrameServer");
        this.j = System.nanoTime();
        lpzVar.b(lprVar);
        lapVar.c(lldVar.b(lprVar.toString()));
        lapVar.c(lpqVar);
        lrxVar.a.a.a(lpfVar.d().a);
    }

    private final boolean w(String str) {
        if (!this.i.a()) {
            return false;
        }
        lis lisVar = this.b;
        String strValueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(str.length() + 38 + String.valueOf(strValueOf).length());
        sb.append("Attempted to invoke ");
        sb.append(str);
        sb.append(" on ");
        sb.append(strValueOf);
        sb.append(" after close()");
        lisVar.h(sb.toString());
        return true;
    }

    @Override // defpackage.lnc
    public final lmp a() {
        return lok.b();
    }

    @Override // defpackage.lnc
    public final lnd b() {
        return this.a;
    }

    @Override // defpackage.lnc
    public final lng c() throws InterruptedException, llv {
        if (w("acquireExclusiveSession")) {
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 37);
            sb.append("Unable to acquire session. ");
            sb.append(strValueOf);
            sb.append(" is closed");
            throw new llv(sb.toString());
        }
        lqx lqxVarA = this.l.a();
        mhm mhmVar = this.s;
        lot lotVar = (lot) mhmVar.a.get();
        lotVar.getClass();
        ljf ljfVar = (ljf) mhmVar.b.get();
        ljfVar.getClass();
        return new lqb(lotVar, ljfVar, lqxVarA);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        lis lisVar = this.b;
        String strValueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
        sb.append("Closing ");
        sb.append(strValueOf);
        lisVar.f(sb.toString());
        this.q.shutdownNow();
        this.m.c(this.n);
        this.i.close();
        this.k.a.b.b(System.nanoTime() - this.j, this.a.d().a);
        lis lisVar2 = this.b;
        String strValueOf2 = String.valueOf(this);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 7);
        sb2.append("Closed ");
        sb2.append(strValueOf2);
        lisVar2.b(sb2.toString());
    }

    @Override // defpackage.lnc
    public final void d(lnx lnxVar) {
        e(lnxVar, true);
    }

    @Override // defpackage.lnc
    public final void e(lnx lnxVar, boolean z) {
        if (z) {
            this.o.e(lnxVar);
        }
        if (lnxVar instanceof ltw) {
            lis lisVar = this.b;
            String strValueOf = String.valueOf(lnxVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 9);
            sb.append("Draining ");
            sb.append(strValueOf);
            lisVar.f(sb.toString());
            lug lugVar = ((ltw) lnxVar).a;
            synchronized (lugVar) {
                if (!lugVar.k) {
                    lis lisVar2 = lugVar.f;
                    String strValueOf2 = String.valueOf(lugVar.a);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 26);
                    sb2.append("Draining free buffers for ");
                    sb2.append(strValueOf2);
                    lisVar2.f(sb2.toString());
                    lugVar.a.h();
                }
            }
        }
    }

    @Override // defpackage.lnc
    public final void f() {
        if (w("resume")) {
            return;
        }
        lis lisVar = this.b;
        String strValueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 9);
        sb.append("Resuming ");
        sb.append(strValueOf);
        lisVar.b(sb.toString());
        this.m.a(this.n);
        this.g.a();
    }

    @Override // defpackage.lnc
    public final void g(lnq lnqVar) {
        this.f.c(lnqVar);
    }

    @Override // defpackage.lnc
    public final void h(CaptureRequest.Key key, Object obj) {
        lom lomVar = this.f;
        if (lomVar.a.a(key)) {
            return;
        }
        lomVar.c(mip.be(key, obj));
    }

    @Override // defpackage.lnc
    public final void i(Set set) {
        this.f.d(set);
    }

    @Override // defpackage.lnc
    public final void j(final lnv lnvVar) {
        Future future = this.r;
        if (future != null) {
            future.cancel(true);
        }
        if (w("trigger3A")) {
            return;
        }
        try {
            this.r = this.q.submit(new Runnable() { // from class: lpu
                @Override // java.lang.Runnable
                public final void run() {
                    lpx lpxVar = this.a;
                    try {
                        lpxVar.c.b(lnvVar);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        lpxVar.b.c("Interrupted when calling trigger3A.", e);
                    } catch (llv e2) {
                        lpxVar.b.c("FrameServer was closed when calling trigger3A.", e2);
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            lis lisVar = this.b;
            String strValueOf = String.valueOf(e.getMessage());
            lisVar.h(strValueOf.length() != 0 ? "Failed to submit trigger3A task. ".concat(strValueOf) : new String("Failed to submit trigger3A task. "));
        }
    }

    @Override // defpackage.lnc
    public final void k(final lmq lmqVar, final lnv lnvVar) {
        Future future = this.r;
        if (future != null) {
            future.cancel(true);
        }
        if (w("trigger3A")) {
            return;
        }
        try {
            this.r = this.q.submit(new Runnable() { // from class: lpt
                /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
                
                    throw r1;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instruction units count: 258
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lpt.run():void");
                }
            });
        } catch (RejectedExecutionException e) {
            lis lisVar = this.b;
            String strValueOf = String.valueOf(e.getMessage());
            lisVar.h(strValueOf.length() != 0 ? "Failed to submit trigger3A task. ".concat(strValueOf) : new String("Failed to submit trigger3A task. "));
        }
    }

    @Override // defpackage.lnc
    public final void l(final boolean z, final boolean z2, final boolean z3) {
        Future future = this.r;
        if (future != null) {
            future.cancel(true);
        }
        if (w("unlock3A")) {
            return;
        }
        try {
            this.q.execute(new Runnable() { // from class: lpw
                /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
                
                    throw r1;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r10 = this;
                        lpx r0 = r10.a
                        boolean r1 = r2
                        boolean r2 = r3
                        boolean r3 = r4
                        lpq r4 = r0.c     // Catch: java.lang.InterruptedException -> L92 defpackage.llv -> La2
                        r5 = 0
                        lqz r6 = r4.b     // Catch: java.lang.Throwable -> L58
                        lqx r6 = r6.a()     // Catch: java.lang.Throwable -> L58
                        r7 = 1
                        r6.d(r1, r2, r3, r7)     // Catch: java.lang.Throwable -> L51
                        r6.close()     // Catch: java.lang.Throwable -> L58
                        monitor-enter(r4)     // Catch: java.lang.InterruptedException -> L92 defpackage.llv -> La2
                        lrt r6 = r4.a     // Catch: java.lang.Throwable -> L4e
                        lrs r6 = defpackage.lrs.c(r6)     // Catch: java.lang.Throwable -> L4e
                        lrt r7 = r4.a     // Catch: java.lang.Throwable -> L4e
                        java.lang.Boolean r8 = r7.a     // Catch: java.lang.Throwable -> L4e
                        r6.f = r8     // Catch: java.lang.Throwable -> L4e
                        java.lang.Boolean r8 = r7.b     // Catch: java.lang.Throwable -> L4e
                        r6.g = r8     // Catch: java.lang.Throwable -> L4e
                        java.lang.Boolean r7 = r7.c     // Catch: java.lang.Throwable -> L4e
                        r6.h = r7     // Catch: java.lang.Throwable -> L4e
                        if (r1 == 0) goto L35
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L4e
                        r6.f = r1     // Catch: java.lang.Throwable -> L4e
                    L35:
                        if (r2 == 0) goto L3d
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L4e
                        r6.g = r1     // Catch: java.lang.Throwable -> L4e
                    L3d:
                        if (r3 == 0) goto L45
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L4e
                        r6.h = r1     // Catch: java.lang.Throwable -> L4e
                    L45:
                        lrt r1 = r6.d()     // Catch: java.lang.Throwable -> L4e
                        r4.c(r1)     // Catch: java.lang.Throwable -> L4e
                        monitor-exit(r4)     // Catch: java.lang.Throwable -> L4e
                        return
                    L4e:
                        r1 = move-exception
                        monitor-exit(r4)     // Catch: java.lang.Throwable -> L4e
                    L50:
                        throw r1     // Catch: java.lang.InterruptedException -> L92 defpackage.llv -> La2
                    L51:
                        r7 = move-exception
                        r6.close()     // Catch: java.lang.Throwable -> L56
                        goto L57
                    L56:
                        r6 = move-exception
                    L57:
                        throw r7     // Catch: java.lang.Throwable -> L58
                    L58:
                        r6 = move-exception
                        monitor-enter(r4)     // Catch: java.lang.InterruptedException -> L92 defpackage.llv -> La2
                        lrt r7 = r4.a     // Catch: java.lang.Throwable -> L8f
                        lrs r7 = defpackage.lrs.c(r7)     // Catch: java.lang.Throwable -> L8f
                        lrt r8 = r4.a     // Catch: java.lang.Throwable -> L8f
                        java.lang.Boolean r9 = r8.a     // Catch: java.lang.Throwable -> L8f
                        r7.f = r9     // Catch: java.lang.Throwable -> L8f
                        java.lang.Boolean r9 = r8.b     // Catch: java.lang.Throwable -> L8f
                        r7.g = r9     // Catch: java.lang.Throwable -> L8f
                        java.lang.Boolean r8 = r8.c     // Catch: java.lang.Throwable -> L8f
                        r7.h = r8     // Catch: java.lang.Throwable -> L8f
                        if (r1 == 0) goto L76
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L8f
                        r7.f = r1     // Catch: java.lang.Throwable -> L8f
                    L76:
                        if (r2 == 0) goto L7e
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L8f
                        r7.g = r1     // Catch: java.lang.Throwable -> L8f
                    L7e:
                        if (r3 == 0) goto L86
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L8f
                        r7.h = r1     // Catch: java.lang.Throwable -> L8f
                    L86:
                        lrt r1 = r7.d()     // Catch: java.lang.Throwable -> L8f
                        r4.c(r1)     // Catch: java.lang.Throwable -> L8f
                        monitor-exit(r4)     // Catch: java.lang.Throwable -> L8f
                        throw r6     // Catch: java.lang.InterruptedException -> L92 defpackage.llv -> La2
                    L8f:
                        r1 = move-exception
                        monitor-exit(r4)     // Catch: java.lang.Throwable -> L8f
                        goto L50
                    L92:
                        r1 = move-exception
                        java.lang.Thread r2 = java.lang.Thread.currentThread()
                        r2.interrupt()
                        lis r0 = r0.b
                        java.lang.String r2 = "Interrupted when calling unlock3A."
                        r0.c(r2, r1)
                        return
                    La2:
                        r1 = move-exception
                        lis r0 = r0.b
                        java.lang.String r2 = "FrameServer was closed when calling unlock3A."
                        r0.c(r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lpw.run():void");
                }
            });
        } catch (RejectedExecutionException e) {
            lis lisVar = this.b;
            String strValueOf = String.valueOf(e.getMessage());
            lisVar.h(strValueOf.length() != 0 ? "Failed to submit unlock3A task. ".concat(strValueOf) : new String("Failed to submit unlock3A task. "));
        }
    }

    @Override // defpackage.lnc
    public final void m(lmq lmqVar) {
        if (w("update3A")) {
            return;
        }
        this.p.a(lmqVar, false);
    }

    @Override // defpackage.lnc
    public final void n(lmq lmqVar) {
        if (w("update3A")) {
            return;
        }
        this.p.a(lmqVar, true);
    }

    @Override // defpackage.lnc
    public final void o(final boolean z) {
        Future future = this.r;
        if (future != null) {
            future.cancel(true);
        }
        if (w("trigger3A")) {
            return;
        }
        try {
            this.r = this.q.submit(new Runnable() { // from class: lpv
                @Override // java.lang.Runnable
                public final void run() {
                    lpx lpxVar = this.a;
                    boolean z2 = z;
                    try {
                        lpq lpqVar = lpxVar.c;
                        lnu lnuVarA = lnv.a();
                        lnuVarA.c(true != z2 ? 1 : 4);
                        lnuVarA.b(1);
                        lnuVarA.e(4);
                        lpqVar.b(lnuVarA.a());
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        lpxVar.b.c("Interrupted when calling trigger3A.", e);
                    } catch (llv e2) {
                        lpxVar.b.c("FrameServer was closed when calling trigger3A.", e2);
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            lis lisVar = this.b;
            String strValueOf = String.valueOf(e.getMessage());
            lisVar.h(strValueOf.length() != 0 ? "Failed to submit trigger3A task. ".concat(strValueOf) : new String("Failed to submit trigger3A task. "));
        }
    }

    @Override // defpackage.lnc
    public final lie p(lqd lqdVar) {
        w("attach(frameStream)");
        return this.e.c(lqdVar, 0);
    }

    @Override // defpackage.lnc
    public final lmr q(lqd lqdVar) {
        w("submit(frameStream)");
        return this.h.g(lqdVar);
    }

    @Override // defpackage.lnc
    public final lmv r(lqd lqdVar, int i) {
        w("attach(frameStream, capacity)");
        return this.e.c(lqdVar, i);
    }

    @Override // defpackage.lnc
    public final lqd s(lnx lnxVar) {
        this.k.a(this.a.d().a, 1, 0);
        w("create(stream)");
        return this.d.a(lnxVar, orx.a);
    }

    @Override // defpackage.lnc
    public final lqd t(Set set) {
        this.k.a(this.a.d().a, 1, 0);
        w("create(streams)");
        return this.d.b(set, orx.a);
    }

    public final String toString() {
        return this.n.toString();
    }

    @Override // defpackage.lnc
    public final lqd u(lnx lnxVar, Set set) {
        this.k.a(this.a.d().a, 1, set.size());
        w("create(stream, parameters)");
        return this.d.a(lnxVar, ope.F(set));
    }

    @Override // defpackage.lnc
    public final lqd v(Set set, Set set2) {
        this.k.a(this.a.d().a, set.size(), set2.size());
        w("create(streams, parameters)");
        return this.d.b(set, ope.F(set2));
    }
}
