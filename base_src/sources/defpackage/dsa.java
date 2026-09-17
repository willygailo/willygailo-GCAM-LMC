package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dsa implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public dsa(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public final dqv a() {
        switch (this.b) {
            case 0:
                jtx jtxVar = ((dra) this.a).get();
                ddg ddgVar = ddc.a;
                return jtxVar.j();
            case 1:
                return ((dra) this.a).get().i(ddl.bd);
            case 2:
                jtx jtxVar2 = ((dra) this.a).get();
                ddg ddgVar2 = ddc.a;
                return jtxVar2.j();
            case 3:
                return ((dra) this.a).get().i(ddc.b);
            default:
                jtx jtxVar3 = ((dra) this.a).get();
                ddi ddiVar = ddr.a;
                jtxVar3.a.f();
                return new dqy(0);
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return a();
    }
}
