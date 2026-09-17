package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cwz implements Runnable {
    public final /* synthetic */ cxc a;
    public final /* synthetic */ lvs b;
    private final /* synthetic */ int c;

    public /* synthetic */ cwz(cxc cxcVar, lvs lvsVar, int i) {
        this.c = i;
        this.a = cxcVar;
        this.b = lvsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                this.a.b.s().a(new cxl(this.b.a));
                return;
            default:
                cxc cxcVar = this.a;
                lvs lvsVar = this.b;
                cxm cxmVarS = cxcVar.b.s();
                String str = lvsVar.a;
                cxr cxrVar = (cxr) cxmVarS;
                cxrVar.a.g();
                ake akeVarE = cxrVar.c.e();
                if (str == null) {
                    akeVarE.f(1);
                } else {
                    akeVarE.g(1, str);
                }
                cxrVar.a.h();
                try {
                    akeVarE.a();
                    ((cxr) cxmVarS).a.j();
                    return;
                } finally {
                    cxrVar.a.i();
                    cxrVar.c.f(akeVarE);
                }
        }
    }
}
