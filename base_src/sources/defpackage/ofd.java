package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ofd implements ofg {
    public final Object a = new Object();
    public final jta b;
    private final Executor c;

    public ofd(Executor executor, jta jtaVar, byte[] bArr) {
        this.c = executor;
        this.b = jtaVar;
    }

    @Override // defpackage.ofg
    public final void a(off offVar) {
        if (offVar.b()) {
            synchronized (this.a) {
            }
            this.c.execute(new ofc(this, offVar));
        }
    }
}
