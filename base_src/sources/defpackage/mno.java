package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class mno implements mnf {
    final /* synthetic */ moa a;
    final /* synthetic */ mtw b;

    public mno(moa moaVar, mtw mtwVar) {
        this.a = moaVar;
        this.b = mtwVar;
    }

    @Override // defpackage.mnf
    public final /* bridge */ /* synthetic */ mnb a(Object obj, Executor executor) {
        return this.b.a().c(executor, mip.ah((mnc) obj), mip.aj());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 12 + String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append("thenAlways[");
        sb.append(strValueOf2);
        sb.append("]");
        return sb.toString();
    }
}
