package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kau implements Runnable {
    public final /* synthetic */ kbi a;
    private final /* synthetic */ int b;

    public /* synthetic */ kau(kbi kbiVar, int i) {
        this.b = i;
        this.a = kbiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                kbi kbiVar = this.a;
                kbiVar.M = false;
                kbiVar.z.n();
                kbiVar.a.set(0);
                if (!kbiVar.H.s()) {
                    kbiVar.P();
                }
                break;
            case 1:
                this.a.j.b("wide_selfie_tooltip_display_count");
                break;
            default:
                this.a.M();
                break;
        }
    }
}
