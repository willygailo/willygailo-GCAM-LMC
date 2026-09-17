package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class kuz implements kvl {
    public final Object a = new Object();
    public final kvq b;
    private final Executor c;

    public kuz(Executor executor, kvq kvqVar) {
        this.c = executor;
        this.b = kvqVar;
    }

    @Override // defpackage.kvl
    public final void a(kvk kvkVar) {
        if (((kvp) kvkVar).c) {
            synchronized (this.a) {
            }
            this.c.execute(new kuy(this));
        }
    }
}
