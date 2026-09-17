package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class kve implements kvl {
    public final Object a = new Object();
    public final kvf b;
    private final Executor c;

    public kve(Executor executor, kvf kvfVar) {
        this.c = executor;
        this.b = kvfVar;
    }

    @Override // defpackage.kvl
    public final void a(kvk kvkVar) {
        if (kvkVar.e() || ((kvp) kvkVar).c) {
            return;
        }
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            this.c.execute(new kvd(this, kvkVar));
        }
    }
}
