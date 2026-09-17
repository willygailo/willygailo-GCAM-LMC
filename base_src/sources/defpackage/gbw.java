package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gbw implements fpn {
    public final /* synthetic */ qkg a;
    private final /* synthetic */ int b;

    public /* synthetic */ gbw(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    @Override // defpackage.fpn
    public final void a(long j) {
        switch (this.b) {
            case 0:
                ((hkq) this.a.get()).b(j);
                break;
            case 1:
                ((fpg) this.a).get().a();
                break;
            default:
                ((itw) ((hlj) this.a).a().c()).a();
                break;
        }
    }
}
