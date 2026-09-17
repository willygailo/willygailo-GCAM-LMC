package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class htn implements htd, lie {
    public final lij a;
    final /* synthetic */ hto b;
    private final Executor c;

    public htn(hto htoVar, lij lijVar, Executor executor) {
        this.b = htoVar;
        this.a = lijVar;
        this.c = executor;
    }

    @Override // defpackage.htd
    public final void a(String str) {
        Object objC;
        if (!this.b.b.equals(str) || (objC = this.b.c()) == null) {
            return;
        }
        this.c.execute(new htm(this, objC));
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.b.a.h(this);
    }
}
