package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class phj implements Runnable {
    final Future a;
    final phh b;

    public phj(Future future, phh phhVar) {
        this.a = future;
        this.b = phhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thK;
        Object obj = this.a;
        if ((obj instanceof pir) && (thK = ((pir) obj).k()) != null) {
            this.b.a(thK);
            return;
        }
        try {
            this.b.b(plk.ad(this.a));
        } catch (Error e) {
            e = e;
            this.b.a(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.b.a(e);
        } catch (ExecutionException e3) {
            this.b.a(e3.getCause());
        }
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.a(this.b);
        return ojbVarAZ.toString();
    }
}
