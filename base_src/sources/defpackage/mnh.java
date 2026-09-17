package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class mnh implements Runnable {
    final /* synthetic */ moa a;
    final /* synthetic */ Callable b;

    public mnh(moa moaVar, Callable callable) {
        this.a = moaVar;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            moa moaVar = this.a;
            Object objCall = this.b.call();
            objCall.getClass();
            moaVar.k(objCall);
        } catch (Exception e) {
            this.a.l(mnc.a(e));
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
