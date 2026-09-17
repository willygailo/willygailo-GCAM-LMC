package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qcv implements qco {
    final qcm a;

    public qcv(qcm qcmVar) {
        this.a = qcmVar;
    }

    @Override // defpackage.qco
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length == 2) {
            return this.a.a(objArr[0], objArr[1]);
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Array of size 2 expected but got ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }
}
