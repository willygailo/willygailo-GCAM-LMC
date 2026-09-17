package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class oez implements ofg {
    public final Object a = new Object();
    public final oep b;
    private final Executor c;

    public oez(Executor executor, oep oepVar) {
        this.c = executor;
        this.b = oepVar;
    }

    @Override // defpackage.ofg
    public final void a(off offVar) {
        synchronized (this.a) {
        }
        this.c.execute(new oey(this));
    }
}
