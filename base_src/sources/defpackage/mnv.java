package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class mnv implements Runnable {
    private final Object a;
    private final Executor b;
    private final moa c;
    private final mnf d;
    private final mwp e;

    public mnv(Object obj, mnf mnfVar, Executor executor, moa moaVar, mwp mwpVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = obj;
        this.b = executor;
        this.c = moaVar;
        this.d = mnfVar;
        this.e = mwpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        moa.n(this.a, this.d, this.b, this.c);
    }

    public final String toString() {
        return this.d.toString();
    }
}
