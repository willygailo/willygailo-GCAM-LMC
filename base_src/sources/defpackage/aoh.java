package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
final class aoh implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ aoj b;
    final /* synthetic */ asl c;

    public aoh(aoj aojVar, asl aslVar, String str) {
        this.b = aojVar;
        this.c = aslVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aoj aojVar;
        try {
            try {
                ge geVar = (ge) this.c.get();
                if (geVar == null) {
                    kus.l();
                    kus.i(aoj.a, String.format("%s returned a null result. Treating it as a failure.", this.b.c.b), new Throwable[0]);
                } else {
                    kus kusVarL = kus.l();
                    int i = aoj.j;
                    String.format("%s returned a %s result.", this.b.c.b, geVar);
                    kusVarL.h(new Throwable[0]);
                    this.b.i = geVar;
                }
                aojVar = this.b;
            } catch (InterruptedException e) {
                e = e;
                kus.l();
                kus.i(aoj.a, String.format("%s failed because it threw an exception/error", this.a), e);
                aojVar = this.b;
            } catch (CancellationException e2) {
                kus.l();
                int i2 = aoj.j;
                String.format("%s was cancelled", this.a);
                kus.j(e2);
                aojVar = this.b;
            } catch (ExecutionException e3) {
                e = e3;
                kus.l();
                kus.i(aoj.a, String.format("%s failed because it threw an exception/error", this.a), e);
                aojVar = this.b;
            }
            aojVar.a();
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }
}
