package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eyu implements Runnable {
    public final /* synthetic */ ezg a;
    private final /* synthetic */ int b;

    public /* synthetic */ eyu(ezg ezgVar, int i) {
        this.b = i;
        this.a = ezgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ezg ezgVar = this.a;
                ezgVar.g.c();
                fwc fwcVar = ezgVar.E;
                if (fwcVar != null) {
                    ezgVar.v(((Boolean) fwcVar.b().fA()).booleanValue());
                    ovd ovdVar = ovl.a;
                    fwc fwcVar2 = ezgVar.E;
                    fwcVar2.getClass();
                    fwcVar2.b().fA();
                }
                ezgVar.t.a();
                ezgVar.w.c();
                ezgVar.k.a();
                break;
            default:
                ezg ezgVar2 = this.a;
                fwc fwcVar3 = ezgVar2.E;
                if (fwcVar3 != null) {
                    ezgVar2.f.b(fwcVar3.c, fwcVar3.a);
                }
                break;
        }
    }
}
