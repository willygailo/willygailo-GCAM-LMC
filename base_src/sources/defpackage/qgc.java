package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qgc extends qbm {
    final Object[] a;

    public qgc(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.qbm
    public final void g(qbq qbqVar) {
        qdo qdoVar = new qdo(qbqVar, this.a);
        qbqVar.gR(qdoVar);
        if (qdoVar.d) {
            return;
        }
        Object[] objArr = qdoVar.b;
        for (int i = 0; i < 2 && !qdoVar.e; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                qbq qbqVar2 = qdoVar.a;
                StringBuilder sb = new StringBuilder(40);
                sb.append("The element at index ");
                sb.append(i);
                sb.append(" is null");
                qbqVar2.b(new NullPointerException(sb.toString()));
                return;
            }
            qdoVar.a.e(obj);
        }
        if (qdoVar.e) {
            return;
        }
        qdoVar.a.gQ();
    }
}
