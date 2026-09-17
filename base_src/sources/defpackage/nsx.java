package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class nsx extends qnp implements qmy {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsx(int i) {
        super(2);
        this.a = i;
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        ((npe) obj2).getClass();
        return Boolean.valueOf(iIntValue != this.a);
    }
}
