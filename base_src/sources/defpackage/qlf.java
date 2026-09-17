package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qlf extends qnp implements qmy {
    final /* synthetic */ qln[] a;
    final /* synthetic */ qnq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlf(qln[] qlnVarArr, qnq qnqVar) {
        super(2);
        this.a = qlnVarArr;
        this.b = qnqVar;
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((qks) obj).getClass();
        qln[] qlnVarArr = this.a;
        qnq qnqVar = this.b;
        int i = qnqVar.a;
        qnqVar.a = i + 1;
        qlnVarArr[i] = (qlk) obj2;
        return qks.a;
    }
}
