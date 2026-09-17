package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gce implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public gce(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public static gce a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new gce(qkgVar, qkgVar2, qkgVar3);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final gcn get() {
        ddf ddfVar = (ddf) this.a.get();
        gcn gcnVar = (gco) this.b.get();
        gee geeVar = (gee) this.c.get();
        if (true != ddfVar.k(dds.x)) {
            gcnVar = geeVar;
        }
        qmd.ae(gcnVar);
        return gcnVar;
    }
}
