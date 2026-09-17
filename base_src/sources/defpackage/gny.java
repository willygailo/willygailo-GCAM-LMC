package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class gny implements goe {
    final /* synthetic */ gob d;
    private boolean e = false;
    public int a = 1;
    public int b = 0;
    public long c = -1;

    public gny(gob gobVar) {
        this.d = gobVar;
    }

    @Override // defpackage.goe
    public final /* synthetic */ void b() {
    }

    public final void c() {
        if (this.e || !this.d.c.get()) {
            return;
        }
        this.e = true;
        this.d.d.y();
        synchronized (this) {
            long j = this.c;
            if (j > 0) {
                this.d.a.b.F(0.0f, j);
            } else {
                this.d.a.b.E(0.0f, this.a);
            }
        }
    }

    @Override // defpackage.goe
    public final synchronized void e(int i) {
        obr.aF(i > 0);
        this.a = i;
    }

    @Override // defpackage.goe
    public final synchronized void f(long j) {
        this.c = j;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        this.d.b.execute(new gnx(this, 0));
    }

    @Override // defpackage.goe
    public final void g() {
        this.d.b.execute(new gnx(this, 1));
    }
}
