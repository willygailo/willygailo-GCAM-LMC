package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qrq extends qqf {
    protected final String c() {
        qrq qrqVarF;
        qrq qrqVarA = qqq.a();
        if (this == qrqVarA) {
            return "Dispatchers.Main";
        }
        try {
            qrqVarF = qrqVarA.f();
        } catch (UnsupportedOperationException e) {
            qrqVarF = null;
        }
        if (this == qrqVarF) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract qrq f();

    @Override // defpackage.qqf
    public String toString() {
        String strC = c();
        if (strC != null) {
            return strC;
        }
        return qnm.f(this) + '@' + qnm.g(this);
    }
}
