package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gfc implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public gfc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public static gfc b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gfc(qkgVar, qkgVar2, qkgVar3);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final geu get() {
        ddf ddfVar = (ddf) this.a.get();
        int iIntValue = ((cbe) this.b).a().intValue();
        int iIntValue2 = ((cbe) this.c).a().intValue();
        get getVar = new get();
        getVar.b(15);
        getVar.d();
        getVar.c = 5;
        getVar.c(2);
        getVar.a();
        getVar.f = 1000L;
        getVar.g = 2;
        getVar.b(iIntValue - iIntValue2);
        getVar.d();
        ddg ddgVar = dds.a;
        ddfVar.b();
        getVar.a();
        if (ddfVar.k(dds.u) || ddfVar.k(dds.v)) {
            getVar.c(1);
        }
        Integer num = getVar.a;
        if (num == null || getVar.b == null || getVar.c == null || getVar.d == null || getVar.e == null || getVar.f == null || getVar.g == null) {
            throw new IllegalStateException();
        }
        return new geu(num.intValue(), getVar.b.intValue(), getVar.c.intValue(), getVar.d.intValue(), getVar.e.booleanValue(), getVar.f.longValue(), getVar.g.intValue());
    }
}
