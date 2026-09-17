package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ntv implements qcm {
    final /* synthetic */ nty a;
    private final /* synthetic */ int b;

    public ntv(nty ntyVar, int i) {
        this.b = i;
        this.a = ntyVar;
    }

    @Override // defpackage.qcm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                qbh qbhVar = (qbh) obj;
                qbhVar.getClass();
                return qbhVar.a(new ntu(obj2, this.a, 0));
            default:
                qbh qbhVar2 = (qbh) obj;
                qbhVar2.getClass();
                return qbhVar2.a(new ntu(obj2, this.a, 1));
        }
    }
}
