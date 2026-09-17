package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hcw implements oiu {
    public final /* synthetic */ lnc a;
    private final /* synthetic */ int b;

    public /* synthetic */ hcw(lnc lncVar, int i) {
        this.b = i;
        this.a = lncVar;
    }

    @Override // defpackage.oiu
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                return this.a.t(ope.H((lnx) obj));
            default:
                return this.a.s((lnx) obj);
        }
    }
}
