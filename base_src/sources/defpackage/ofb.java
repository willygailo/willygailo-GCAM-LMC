package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ofb implements ofg {
    public final Object a = new Object();
    private final Executor b;

    public ofb(Executor executor) {
        this.b = executor;
    }

    @Override // defpackage.ofg
    public final void a(off offVar) {
        if (offVar.b()) {
            return;
        }
        synchronized (this.a) {
        }
        this.b.execute(new ofa(this, offVar));
    }
}
