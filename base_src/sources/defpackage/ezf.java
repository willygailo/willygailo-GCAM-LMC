package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ezf implements phh {
    final /* synthetic */ ezg a;

    public ezf(ezg ezgVar) {
        this.a = ezgVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        fwc fwcVar = (fwc) obj;
        fwcVar.getClass();
        ezg ezgVar = this.a;
        ezgVar.E = fwcVar;
        ezgVar.d.g().g();
        mip.ca(fwcVar.h().g, new lht() { // from class: ezd
            @Override // defpackage.lht
            public final void a(Object obj2) {
                this.a.a.d.g().h(false);
            }
        }, this.a.e);
        this.a.B.c(fwcVar.b().a(new lij() { // from class: eze
            @Override // defpackage.lij
            public final void fB(Object obj2) {
                this.a.a.v(((Boolean) obj2).booleanValue());
            }
        }, this.a.e));
        fwcVar.a.c(this.a.p.a(fwcVar, fwcVar.c, fwcVar.h().b, fwcVar.h().f, true));
        ezg ezgVar2 = this.a;
        ezgVar2.e.execute(new eyu(ezgVar2, 1));
    }
}
