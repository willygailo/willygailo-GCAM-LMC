package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ful implements fuv {
    final /* synthetic */ fum a;

    public ful(fum fumVar) {
        this.a = fumVar;
    }

    @Override // defpackage.fuv
    public final void a(fuj fujVar) {
        synchronized (this.a) {
            fum fumVar = this.a;
            fumVar.d = true;
            fumVar.e = ojc.i(fujVar);
            this.a.c();
        }
    }

    @Override // defpackage.fuv
    public final void b(long j, fuz fuzVar) {
        synchronized (this.a) {
            fum fumVar = this.a;
            fumVar.b = true;
            fumVar.c = ojc.i(fuzVar);
            fum fumVar2 = this.a;
            fumVar2.f = j;
            fumVar2.c();
        }
    }
}
