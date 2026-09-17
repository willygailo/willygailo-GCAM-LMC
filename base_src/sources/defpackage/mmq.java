package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class mmq implements Runnable {
    protected final moa a = moa.i();
    protected final pht b;
    protected final mmn c;
    protected final mmn d;
    protected final Executor e;
    protected final mwp f;

    public mmq(pht phtVar, mmn mmnVar, mmn mmnVar2, Executor executor, mwp mwpVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = phtVar;
        this.c = mmnVar;
        this.d = mmnVar2;
        this.e = executor;
        this.f = mwpVar;
    }

    private final void b(Throwable th) {
        mnc mncVarA = mnc.a(th);
        if (this.d == null) {
            this.a.l(mncVarA);
            return;
        }
        try {
            this.e.execute(new mmp(this, mncVarA));
        } catch (Throwable th2) {
            a(th2);
        }
    }

    protected final void a(Throwable th) {
        this.a.l(mnc.a(th));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Object objI = plk.I(this.b);
            if (objI == null) {
                a(new IllegalStateException("Result value is null"));
                return;
            }
            try {
                this.e.execute(new mmo(this, objI));
            } catch (Throwable th) {
                a(th);
            }
        } catch (ExecutionException e) {
            b(e.getCause());
        } catch (Throwable th2) {
            b(th2);
        }
    }

    public final String toString() {
        return this.c.toString();
    }
}
