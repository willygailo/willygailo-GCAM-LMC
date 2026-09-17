package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class kuw implements kvl {
    public final kuu a;
    public final kvp b;
    private final Executor c;

    public kuw(Executor executor, kuu kuuVar, kvp kvpVar) {
        this.c = executor;
        this.a = kuuVar;
        this.b = kvpVar;
    }

    @Override // defpackage.kvl
    public final void a(kvk kvkVar) {
        this.c.execute(new kuv(this, kvkVar));
    }
}
