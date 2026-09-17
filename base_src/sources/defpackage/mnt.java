package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class mnt implements Runnable {
    final /* synthetic */ mnf a;
    final /* synthetic */ Executor b;
    final /* synthetic */ moa c;
    final /* synthetic */ mnf d;
    final /* synthetic */ moa e;
    final /* synthetic */ mwp f;

    public mnt(moa moaVar, mnf mnfVar, Executor executor, moa moaVar2, mwp mwpVar, mnf mnfVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.e = moaVar;
        this.a = mnfVar;
        this.b = executor;
        this.c = moaVar2;
        this.f = mwpVar;
        this.d = mnfVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.e.a;
        if (obj != null) {
            moa.n(obj, this.a, this.b, this.c);
            return;
        }
        mnc mncVar = this.e.b;
        mnf mnfVar = this.d;
        Executor executor = this.b;
        moa moaVar = this.c;
        try {
            mnfVar.a(mncVar, executor).c(pgr.INSTANCE, new mny(moaVar), new mnx(moaVar)).h(mmg.a);
        } catch (mnc e) {
            moaVar.l(e);
        } catch (Throwable th) {
            moaVar.l(mnc.a(th));
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.e);
        String strValueOf2 = String.valueOf(this.a);
        String strValueOf3 = String.valueOf(this.d);
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 8 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append(strValueOf);
        sb.append("then[");
        sb.append(strValueOf2);
        sb.append(", ");
        sb.append(strValueOf3);
        sb.append("]");
        return sb.toString();
    }
}
