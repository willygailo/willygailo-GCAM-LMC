package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ffg implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final /* synthetic */ int d;

    public ffg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i) {
        this.d = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public ffg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public static ffg b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new ffg(qkgVar, qkgVar2, qkgVar3, 1, null);
    }

    public final Boolean a() {
        switch (this.d) {
            case 0:
                return fff.a((ddf) this.a.get(), ((bpk) this.b).a().booleanValue(), ((bpk) this.c).a().booleanValue());
            default:
                ddf ddfVar = (ddf) this.c.get();
                ghx ghxVar = ((gjo) this.b).get();
                boolean z = false;
                if (((giv) this.a).get() == jrl.PHOTO && ghxVar.k() == lwd.BACK && ddfVar.k(ddm.ap) && ddfVar.k(ddl.aR)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.d) {
            case 0:
                break;
        }
        return a();
    }
}
