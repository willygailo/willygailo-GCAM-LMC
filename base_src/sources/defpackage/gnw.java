package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class gnw implements goe {
    final /* synthetic */ gob a;
    private boolean b = false;
    private int c = 1;
    private int d = 0;
    private long e = -1;

    public gnw(gob gobVar) {
        this.a = gobVar;
    }

    @Override // defpackage.goe
    public final synchronized void b() {
        this.a.b.execute(new gnv(this, 0));
    }

    public final synchronized void c() {
        if (this.a.c.get()) {
            synchronized (this) {
                while (this.d < this.c) {
                    h();
                }
            }
        }
    }

    public final void d() {
        if (this.b || !this.a.c.get()) {
            return;
        }
        this.b = true;
        this.a.d.y();
        synchronized (this) {
            long j = this.e;
            if (j > 0) {
                this.a.a.b.F(0.0f, j);
            } else {
                this.a.a.b.D(0.0f);
            }
        }
    }

    @Override // defpackage.goe
    public final synchronized void e(int i) {
        obr.aF(i > 0);
        this.c = i;
    }

    @Override // defpackage.goe
    public final synchronized void f(long j) {
        this.e = j;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        this.a.b.execute(new gnv(this, 2));
    }

    @Override // defpackage.goe
    public final void g() {
        this.a.b.execute(new gnv(this, 1));
    }

    public final void h() {
        d();
        if (this.a.c.get()) {
            synchronized (this) {
                boolean z = true;
                int i = this.d + 1;
                this.d = i;
                if (i > this.c) {
                    z = false;
                }
                obr.aQ(z);
                float f = this.d / this.c;
                long j = this.e;
                if (j > 0) {
                    this.a.a.b.F(f, j);
                } else {
                    this.a.a.b.D(f);
                }
            }
        }
    }
}
