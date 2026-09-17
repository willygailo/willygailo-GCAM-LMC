package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class phn extends pft implements Runnable {
    private pht a;

    public phn(pht phtVar) {
        this.a = phtVar;
    }

    @Override // defpackage.pfx
    protected final void c() {
        this.a = null;
    }

    @Override // defpackage.pfx
    protected final String ga() {
        pht phtVar = this.a;
        if (phtVar == null) {
            return null;
        }
        String strValueOf = String.valueOf(phtVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 11);
        sb.append("delegate=[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        pht phtVar = this.a;
        if (phtVar != null) {
            e(phtVar);
        }
    }
}
