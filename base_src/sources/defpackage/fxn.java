package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fxn implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public fxn(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public final bne a() {
        switch (this.c) {
            case 0:
                ddf ddfVar = (ddf) this.a.get();
                qkg qkgVar = this.b;
                ddg ddgVar = dde.a;
                ddfVar.b();
                return ((bpj) qkgVar).get();
            default:
                ddf ddfVar2 = (ddf) this.a.get();
                qkg qkgVar2 = this.b;
                ddg ddgVar2 = dde.a;
                ddfVar2.b();
                return ((boo) qkgVar2).get();
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                break;
        }
        return a();
    }
}
