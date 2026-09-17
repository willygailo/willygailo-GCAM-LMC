package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qcb extends qca {
    private static final long serialVersionUID = -8219729196779211169L;

    public qcb(Runnable runnable) {
        super(runnable);
    }

    @Override // defpackage.qca
    protected final /* bridge */ /* synthetic */ void b(Object obj) {
        ((Runnable) obj).run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        boolean zGV = gV();
        String strValueOf = String.valueOf(get());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36);
        sb.append("RunnableDisposable(disposed=");
        sb.append(zGV);
        sb.append(", ");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
