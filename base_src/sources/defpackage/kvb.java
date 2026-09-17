package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class kvb implements kvl {
    public final Object a = new Object();
    public final kvc b;
    private final Executor c;

    public kvb(Executor executor, kvc kvcVar) {
        this.c = executor;
        this.b = kvcVar;
    }

    @Override // defpackage.kvl
    public final void a(kvk kvkVar) {
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            this.c.execute(new kva(this, kvkVar));
        }
    }
}
