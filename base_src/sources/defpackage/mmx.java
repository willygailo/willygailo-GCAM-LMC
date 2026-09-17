package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class mmx implements Runnable {
    private final Object a;
    private final Executor b;
    private final moa c;
    private final mnf d;

    public mmx(Object obj, mnf mnfVar, Executor executor, moa moaVar) {
        this.a = obj;
        this.b = executor;
        this.c = moaVar;
        this.d = mnfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.a;
        mnf mnfVar = this.d;
        Executor executor = this.b;
        moa moaVar = this.c;
        try {
            mnfVar.a(obj, executor).c(pgr.INSTANCE, new mmz(moaVar), new mmy(moaVar)).h(mmg.a);
        } catch (mnc e) {
            moaVar.l(e);
        } catch (Throwable th) {
            moaVar.l(mnc.a(th));
        }
    }

    public final String toString() {
        return this.d.toString();
    }
}
