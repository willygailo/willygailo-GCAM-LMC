package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mnp implements Runnable {
    final /* synthetic */ moa a;
    final /* synthetic */ mmg b;

    public mnp(moa moaVar, mmg mmgVar) {
        this.a = moaVar;
        this.b = mmgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a == null) {
            throw okd.a(this.a.b);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 24 + String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append("finallyHandleException[");
        sb.append(strValueOf2);
        sb.append("]");
        return sb.toString();
    }
}
