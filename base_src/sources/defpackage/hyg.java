package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hyg implements lij {
    public final /* synthetic */ hza a;
    private final /* synthetic */ int b;

    public /* synthetic */ hyg(hza hzaVar, int i) {
        this.b = i;
        this.a = hzaVar;
    }

    @Override // defpackage.lij
    public final void fB(Object obj) {
        switch (this.b) {
            case 0:
                hza hzaVar = this.a;
                jrl jrlVar = (jrl) obj;
                lar.a();
                if (!hzaVar.p.equals(jrlVar)) {
                    hzaVar.p = jrlVar;
                    hzaVar.h(new hyh(hzaVar, 0));
                }
                break;
            case 1:
                final hti htiVar = (hti) obj;
                this.a.h(new hyx() { // from class: hyo
                    @Override // defpackage.hyx
                    public final void a(Object obj2) {
                        ((hzu) obj2).g(hza.k(htiVar));
                    }
                });
                break;
            default:
                final Boolean bool = (Boolean) obj;
                this.a.h(new hyx() { // from class: hys
                    @Override // defpackage.hyx
                    public final void a(Object obj2) {
                        ((hzu) obj2).h(bool.booleanValue());
                    }
                });
                break;
        }
    }
}
