package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fak implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final /* synthetic */ int e;

    public fak(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i) {
        this.e = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public final ghu a() {
        switch (this.e) {
            case 0:
                ghr ghrVar = (ghr) this.a.get();
                qkg qkgVar = this.b;
                ojc ojcVarB = ((ewk) this.c).b();
                ddf ddfVar = (ddf) this.d.get();
                ddi ddiVar = ddl.a;
                ddfVar.d();
                return ghrVar.a(((fbg) qkgVar).get(), ojcVarB, new nez(false), jrl.PORTRAIT);
            default:
                ghr ghrVar2 = (ghr) this.a.get();
                qkg qkgVar2 = this.b;
                ojc ojcVarB2 = ((ewk) this.c).b();
                ddf ddfVar2 = (ddf) this.d.get();
                ddi ddiVar2 = ddl.a;
                ddfVar2.e();
                return ghrVar2.a(((fbg) qkgVar2).get(), ojcVarB2, new nez(false), jrl.LONG_EXPOSURE);
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.e) {
            case 0:
                break;
        }
        return a();
    }
}
