package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fhq implements pys {
    private final fhp a;

    public fhq(fhp fhpVar) {
        this.a = fhpVar;
    }

    public static fhi b(fhp fhpVar) {
        fhi fhiVar = fhpVar.a;
        qmd.ae(fhiVar);
        return fhiVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fhi get() {
        return b(this.a);
    }
}
