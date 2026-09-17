package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cgi implements phh {
    final /* synthetic */ lfj a;
    final /* synthetic */ pih b;
    final /* synthetic */ cgl c;

    public cgi(cgl cglVar, lfj lfjVar, pih pihVar) {
        this.c = cglVar;
        this.a = lfjVar;
        this.b = pihVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        this.c.l(6);
        this.b.a(th);
        this.c.I.a();
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        synchronized (this.c.f) {
            this.c.t.i(ijx.VIDEO_RECORDER_STARTED);
            cgl cglVar = this.c;
            if (cglVar.K == 6) {
                this.a.i();
                return;
            }
            cglVar.m.a(cjr.RECORDING_SESSION_ACTIVE);
            cgl cglVar2 = this.c;
            cglVar2.g.b(cglVar2.b().b);
            cgl cglVar3 = this.c;
            cglVar3.g.f = ojc.i(cglVar3.l.d);
            this.c.g.e();
            cgl cglVar4 = this.c;
            if (cglVar4.h.l()) {
                plk.af(cglVar4.p.b(cglVar4.l.y, cglVar4.k.f()), new cgj(cglVar4, 1), pgr.INSTANCE);
            }
            if (this.c.s.g()) {
                ((byb) this.c.s.c()).b();
            }
            cgl cglVar5 = this.c;
            if (cglVar5.l.C) {
                cglVar5.x.c(true);
                this.c.w.b();
            }
            this.c.l(3);
            this.b.o(null);
        }
    }
}
