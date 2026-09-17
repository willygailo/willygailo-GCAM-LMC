package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ico implements lht {
    public final /* synthetic */ icp a;
    private final /* synthetic */ int b;

    public /* synthetic */ ico(icp icpVar, int i) {
        this.b = i;
        this.a = icpVar;
    }

    @Override // defpackage.lht
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                icp icpVar = this.a;
                Boolean bool = (Boolean) obj;
                if (!icpVar.b.v) {
                    bool.getClass();
                    if (bool.booleanValue()) {
                        mip.ca(icpVar.b.s.b(), new ico(icpVar, 1), mip.bS());
                    }
                    break;
                }
                break;
            default:
                this.a.r();
                break;
        }
    }
}
