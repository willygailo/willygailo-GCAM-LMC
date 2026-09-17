package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ofi {
    public final off a = new off(null);

    public final void a(Exception exc) {
        off offVar = this.a;
        synchronized (offVar.a) {
            if (offVar.c) {
                return;
            }
            offVar.c = true;
            offVar.e = exc;
            offVar.b.b(offVar);
        }
    }

    public final void b(Object obj) {
        off offVar = this.a;
        synchronized (offVar.a) {
            if (offVar.c) {
                return;
            }
            offVar.c = true;
            offVar.d = obj;
            offVar.b.b(offVar);
        }
    }
}
