package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lwm implements maf {
    final /* synthetic */ lwo a;
    private final maf b;

    public lwm(lwo lwoVar, maf mafVar) {
        this.a = lwoVar;
        this.b = mafVar;
    }

    @Override // defpackage.maf
    public final void a() {
        synchronized (this.a.a) {
            lwo lwoVar = this.a;
            if (lwoVar.b) {
                lwoVar.j();
            } else {
                this.b.a();
            }
        }
    }
}
