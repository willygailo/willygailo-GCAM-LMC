package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class osv extends oqy {
    final /* synthetic */ osx a;
    final /* synthetic */ osz b;

    public osv(osz oszVar, osx osxVar) {
        this.b = oszVar;
        this.a = osxVar;
    }

    @Override // defpackage.oqv
    public final int a() {
        int i = this.a.b;
        return i == 0 ? this.b.gD(b()) : i;
    }

    @Override // defpackage.oqv
    public final Object b() {
        return this.a.a;
    }
}
