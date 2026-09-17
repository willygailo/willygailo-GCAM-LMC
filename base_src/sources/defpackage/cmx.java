package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cmx implements Runnable {
    public final /* synthetic */ cmy a;
    public final /* synthetic */ jhh b;
    private final /* synthetic */ int c;

    public /* synthetic */ cmx(cmy cmyVar, jhh jhhVar, int i) {
        this.c = i;
        this.a = cmyVar;
        this.b = jhhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                this.b.e(ims.HEAT_CRITICAL, this.a.e());
                break;
            default:
                cmy cmyVar = this.a;
                this.b.e(ims.HEAT_EMERGENCY, cmyVar.e());
                cmu cmuVar = cmyVar.h;
                cmuVar.getClass();
                ((cfy) cmuVar).d();
                break;
        }
    }
}
