package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class mns implements Runnable {
    final /* synthetic */ mnf a;
    final /* synthetic */ Executor b;
    final /* synthetic */ moa c;
    final /* synthetic */ moa d;
    final /* synthetic */ mwp e;

    public mns(moa moaVar, mnf mnfVar, Executor executor, moa moaVar2, mwp mwpVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = moaVar;
        this.a = mnfVar;
        this.b = executor;
        this.c = moaVar2;
        this.e = mwpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.d.a;
        if (obj != null) {
            moa.n(obj, this.a, this.b, this.c);
        } else {
            this.c.l(this.d.b);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 6 + String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append("then[");
        sb.append(strValueOf2);
        sb.append("]");
        return sb.toString();
    }
}
