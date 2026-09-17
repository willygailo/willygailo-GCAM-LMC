package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rw extends gq {
    final /* synthetic */ int a;
    final /* synthetic */ rx b;
    private boolean c = false;

    public rw(rx rxVar, int i) {
        this.b = rxVar;
        this.a = i;
    }

    @Override // defpackage.gq, defpackage.gp
    public final void a() {
        this.c = true;
    }

    @Override // defpackage.gq, defpackage.gp
    public final void b() {
        if (this.c) {
            return;
        }
        this.b.a.setVisibility(this.a);
    }

    @Override // defpackage.gq, defpackage.gp
    public final void c() {
        this.b.a.setVisibility(0);
    }
}
