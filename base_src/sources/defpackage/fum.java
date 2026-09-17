package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class fum implements fuw {
    final /* synthetic */ fun g;
    private final fuw h;
    private fuv n;
    public final fuk a = new fuk(this);
    private boolean i = false;
    public boolean b = false;
    public ojc c = oih.a;
    public boolean d = false;
    public ojc e = oih.a;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private long m = 0;
    public long f = 0;

    public fum(fun funVar, fuw fuwVar) {
        this.g = funVar;
        this.h = fuwVar;
    }

    @Override // defpackage.fuw
    public final synchronized long a() {
        this.i = true;
        c();
        return this.m;
    }

    public final synchronized void b() {
        this.g.a.b("Ending still pending microvideo sessions");
        this.l = true;
        c();
    }

    public final synchronized void c() {
        fuv fuvVar;
        if (this.i && !this.j && !this.l) {
            long jA = this.h.a();
            this.m = jA;
            lis lisVar = this.g.a;
            StringBuilder sb = new StringBuilder(61);
            sb.append("Start timestamp from underlying trimmer: ");
            sb.append(jA);
            lisVar.b(sb.toString());
            this.j = true;
        }
        if (this.l && (fuvVar = this.n) != null) {
            if (this.j) {
                fuvVar.b(this.m + 3000000, fuz.MAX_LENGTH_AFTER_SHUTDOWN);
                this.g.a.b("... ending max length later");
            } else {
                this.g.a.b("... canceling since no start timestamp was requested");
                fuv fuvVar2 = this.n;
                fuvVar2.getClass();
                fuvVar2.a(fuj.CANCEL_AFTER_SHUTDOWN);
            }
            this.n = null;
            this.a.a();
        }
        if (this.n != null && !this.k && !this.l) {
            this.g.a.b("Asking delegate muxer for trimming decision");
            this.h.d(new ful(this));
            this.k = true;
        }
        if (this.b && this.n != null) {
            obr.aQ(!this.l);
            lis lisVar2 = this.g.a;
            long j = this.f;
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("Ending normally at ");
            sb2.append(j);
            lisVar2.b(sb2.toString());
            fuv fuvVar3 = this.n;
            fuvVar3.getClass();
            fuvVar3.b(this.f, (fuz) this.c.c());
            this.n = null;
            this.a.a();
            this.g.a.b("Ended normally.");
        }
        if (this.d && this.n != null) {
            obr.aQ(!this.l);
            fuv fuvVar4 = this.n;
            fuvVar4.getClass();
            fuvVar4.a((fuj) this.e.c());
            this.n = null;
            this.a.a();
            this.g.a.b("Cancelled normally.");
        }
    }

    @Override // defpackage.fuw
    public final synchronized void d(fuv fuvVar) {
        this.n = fuvVar;
        this.a.a.set(this);
        c();
    }
}
