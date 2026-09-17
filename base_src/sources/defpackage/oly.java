package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oly extends omb {
    final /* synthetic */ omf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oly(omf omfVar) {
        super(omfVar);
        this.a = omfVar;
    }

    @Override // defpackage.omb
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new omd(this.a, i);
    }
}
