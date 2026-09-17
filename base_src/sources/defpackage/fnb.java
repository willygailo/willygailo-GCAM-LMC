package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class fnb implements idd {
    final /* synthetic */ fnc a;

    public fnb(fnc fncVar) {
        this.a = fncVar;
    }

    @Override // defpackage.idd
    public final void a() {
        if (this.a.b.compareAndSet(true, false)) {
            this.a.b();
        }
    }

    @Override // defpackage.idd
    public final void b() {
        this.a.b.set(true);
    }

    @Override // defpackage.idd
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.idd
    public final /* synthetic */ void d() {
    }
}
