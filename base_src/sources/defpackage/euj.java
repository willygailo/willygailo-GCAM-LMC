package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class euj implements idd {
    final /* synthetic */ eur a;

    public euj(eur eurVar) {
        this.a = eurVar;
    }

    @Override // defpackage.idd
    public final void a() {
        final eur eurVar = this.a;
        if (eurVar.C) {
            eurVar.C = false;
            eurVar.e.post(new Runnable() { // from class: etx
                @Override // java.lang.Runnable
                public final void run() {
                    eur eurVar2 = eurVar;
                    if (eurVar2.y || eurVar2.z) {
                        return;
                    }
                    ((idc) eurVar2.p.c()).i(eurVar2.A, eurVar2.B);
                }
            });
        }
        this.a.e.post(new Runnable() { // from class: eui
            @Override // java.lang.Runnable
            public final void run() {
                euj eujVar = this.a;
                ((idc) eujVar.a.p.c()).j(eujVar);
            }
        });
    }

    @Override // defpackage.idd
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.idd
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.idd
    public final /* synthetic */ void d() {
    }
}
