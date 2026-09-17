package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kma extends klt {
    final /* synthetic */ kmb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kma(kmb kmbVar, int i) {
        super(kmbVar, i, null);
        this.g = kmbVar;
    }

    @Override // defpackage.klt
    protected final void a(khi khiVar) {
        this.g.g.a(khiVar);
        System.currentTimeMillis();
    }

    @Override // defpackage.klt
    protected final boolean c() {
        this.g.g.a(khi.a);
        return true;
    }
}
