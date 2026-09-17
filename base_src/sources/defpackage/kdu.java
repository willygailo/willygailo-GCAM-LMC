package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kdu extends kdt {
    private boolean a;

    protected kdu(kdx kdxVar) {
        super(kdxVar);
    }

    public final void A() {
        a();
        this.a = true;
    }

    public final boolean B() {
        return this.a;
    }

    protected abstract void a();

    public final void z() {
        if (!B()) {
            throw new IllegalStateException("Not initialized");
        }
    }
}
