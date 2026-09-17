package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class olf extends olg {
    final /* synthetic */ olh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olf(olh olhVar) {
        super(olhVar);
        this.a = olhVar;
    }

    @Override // defpackage.olg
    public final /* bridge */ /* synthetic */ Object a(int i) {
        org orgVar = this.a.a;
        obr.aX(i, orgVar.c);
        return new orf(orgVar, i);
    }
}
