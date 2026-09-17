package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dg implements ajo, aey {
    private final aih c;
    public aeb b = null;
    public ajn a = null;

    public dg(aih aihVar, byte[] bArr) {
        this.c = aihVar;
    }

    @Override // defpackage.aee
    public final aeb C() {
        b();
        return this.b;
    }

    @Override // defpackage.ajo
    public final ajm D() {
        b();
        return this.a.a;
    }

    final void a(adz adzVar) {
        this.b.c(adzVar);
    }

    @Override // defpackage.aey
    public final aih ag() {
        b();
        return this.c;
    }

    final void b() {
        if (this.b == null) {
            this.b = new aeb(this);
            this.a = ajn.a(this);
        }
    }
}
