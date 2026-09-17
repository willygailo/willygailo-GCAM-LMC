package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pib extends pft implements Runnable {
    private final Runnable a;

    public pib(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    @Override // defpackage.pfx
    protected final String ga() {
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 7);
        sb.append("task=[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            a(th);
            throw okd.a(th);
        }
    }
}
