package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qsb extends qqf {
    public static final /* synthetic */ int b = 0;

    static {
        new qsb();
    }

    private qsb() {
    }

    @Override // defpackage.qqf
    public final void d(qln qlnVar, Runnable runnable) {
        qlnVar.getClass();
        if (((qse) qlnVar.get(qse.a)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.qqf
    public final boolean e(qln qlnVar) {
        qlnVar.getClass();
        return false;
    }

    @Override // defpackage.qqf
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
