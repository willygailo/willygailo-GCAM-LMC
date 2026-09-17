package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gbx implements gnl {
    public final /* synthetic */ qkg a;
    private final /* synthetic */ int b;

    public /* synthetic */ gbx(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    @Override // defpackage.gnl, java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((fuo) this.a.get()).b();
                break;
            case 1:
                ((dsv) this.a.get()).b();
                break;
            default:
                ((gdj) this.a.get()).h();
                break;
        }
    }
}
