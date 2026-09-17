package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class qey extends qji {
    private static final long serialVersionUID = -2252972430506210021L;
    final int a;
    int b = 0;
    volatile boolean c;

    public qey(int i) {
        this.a = i;
    }

    public abstract void a();

    @Override // defpackage.qdl
    public final void c() {
        this.b = this.a;
    }

    public abstract void d(long j);

    @Override // defpackage.qyn
    public final void g() {
        this.c = true;
    }

    @Override // defpackage.qyn
    public final void gP(long j) {
        if (qjn.d(j) && qmd.U(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                a();
            } else {
                d(j);
            }
        }
    }

    @Override // defpackage.qdl
    public final /* bridge */ /* synthetic */ Object gS() {
        int i = this.b;
        if (i == this.a) {
            return null;
        }
        this.b = i + 1;
        return Integer.valueOf(i);
    }

    @Override // defpackage.qdl
    public final boolean i() {
        return this.b == this.a;
    }

    @Override // defpackage.qdh
    public final int k() {
        return 1;
    }
}
