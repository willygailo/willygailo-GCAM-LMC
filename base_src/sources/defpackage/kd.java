package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kd extends gq {
    final /* synthetic */ ke a;
    private boolean b = false;
    private int c = 0;

    public kd(ke keVar) {
        this.a = keVar;
    }

    @Override // defpackage.gq, defpackage.gp
    public final void b() {
        int i = this.c + 1;
        this.c = i;
        if (i == this.a.a.size()) {
            gp gpVar = this.a.b;
            if (gpVar != null) {
                gpVar.b();
            }
            this.c = 0;
            this.b = false;
            this.a.c = false;
        }
    }

    @Override // defpackage.gq, defpackage.gp
    public final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        gp gpVar = this.a.b;
        if (gpVar != null) {
            gpVar.c();
        }
    }
}
