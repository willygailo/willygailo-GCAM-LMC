package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qmb extends qlu implements qnn {
    private final int arity;

    public qmb(int i) {
        this(i, null);
    }

    public qmb(int i, qlh qlhVar) {
        super(qlhVar);
        this.arity = i;
    }

    @Override // defpackage.qnn
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.qls
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strA = qns.a(this);
        strA.getClass();
        return strA;
    }
}
