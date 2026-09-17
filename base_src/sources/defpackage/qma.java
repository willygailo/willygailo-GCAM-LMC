package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qma extends qlz implements qnn {
    public qma(qlh qlhVar) {
        super(qlhVar);
    }

    @Override // defpackage.qnn
    public final int getArity() {
        return 2;
    }

    @Override // defpackage.qls
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strA = qns.a(this);
        strA.getClass();
        return strA;
    }
}
