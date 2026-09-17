package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lwk extends maa {
    private int a;

    public lwk(mad madVar) {
        this(madVar, 1);
    }

    public lwk(mad madVar, int i) {
        super(madVar);
        obr.aG(i > 0, "Initial reference count must be greater than zero!");
        this.a = i;
    }

    @Override // defpackage.maa, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        l();
    }

    public final mad k() {
        synchronized (this) {
            int i = this.a;
            if (i <= 0) {
                return null;
            }
            this.a = i + 1;
            return new lwl(this);
        }
    }

    public final void l() {
        synchronized (this) {
            int i = this.a;
            if (i > 0) {
                int i2 = i - 1;
                this.a = i2;
                if (i2 == 0) {
                    super.close();
                }
            }
        }
    }

    @Override // defpackage.maa
    public final String toString() {
        String string;
        synchronized (this) {
            ojb ojbVarAZ = obr.aZ(this);
            ojbVarAZ.e("refCount", this.a);
            ojbVarAZ.a(super.toString());
            string = ojbVarAZ.toString();
        }
        return string;
    }
}
