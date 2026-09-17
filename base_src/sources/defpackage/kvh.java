package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class kvh implements kvl {
    public final Object a = new Object();
    public final kvi b;
    private final Executor c;

    public kvh(Executor executor, kvi kviVar) {
        this.c = executor;
        this.b = kviVar;
    }

    @Override // defpackage.kvl
    public final void a(kvk kvkVar) {
        if (kvkVar.e()) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new kvg(this, kvkVar));
            }
        }
    }
}
