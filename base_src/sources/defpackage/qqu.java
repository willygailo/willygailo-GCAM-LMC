package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qqu extends qqf {
    private long b;
    public qut d;
    private boolean e;

    private static final long o(boolean z) {
        return z ? 4294967296L : 1L;
    }

    protected abstract Thread c();

    public long f() {
        throw null;
    }

    public final void g(boolean z) {
        long jO = this.b - o(z);
        this.b = jO;
        if (jO > 0) {
            return;
        }
        boolean z2 = qql.a;
        if (this.e) {
            j();
        }
    }

    public final void h(qqo qqoVar) {
        qut qutVar = this.d;
        if (qutVar == null) {
            qutVar = new qut();
            this.d = qutVar;
        }
        Object[] objArr = qutVar.a;
        int i = qutVar.c;
        objArr[i] = qqoVar;
        int length = objArr.length;
        int i2 = (i + 1) & (length - 1);
        qutVar.c = i2;
        int i3 = qutVar.b;
        if (i2 == i3) {
            Object[] objArr2 = new Object[length + length];
            qmd.J(objArr, objArr2, 0, i3, 0, 10);
            Object[] objArr3 = qutVar.a;
            int length2 = objArr3.length;
            int i4 = qutVar.b;
            qmd.J(objArr3, objArr2, length2 - i4, 0, i4, 4);
            qutVar.a = objArr2;
            qutVar.b = 0;
            qutVar.c = length;
        }
    }

    public final void i(boolean z) {
        this.b += o(z);
        if (z) {
            return;
        }
        this.e = true;
    }

    protected void j() {
        throw null;
    }

    public final boolean k() {
        return this.b >= o(true);
    }

    public final boolean l() {
        qut qutVar = this.d;
        if (qutVar == null) {
            return false;
        }
        int i = qutVar.b;
        Object obj = null;
        if (i != qutVar.c) {
            Object[] objArr = qutVar.a;
            Object obj2 = objArr[i];
            objArr[i] = null;
            qutVar.b = (i + 1) & (objArr.length - 1);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
            obj = obj2;
        }
        qqo qqoVar = (qqo) obj;
        if (qqoVar == null) {
            return false;
        }
        qqoVar.run();
        return true;
    }
}
