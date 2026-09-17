package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class xo extends xh {
    @Override // defpackage.xh
    public final void a(xp xpVar, xp xpVar2) {
        xpVar.next = xpVar2;
    }

    @Override // defpackage.xh
    public final void b(xp xpVar, Thread thread) {
        xpVar.thread = thread;
    }

    @Override // defpackage.xh
    public final boolean c(xq xqVar, xl xlVar, xl xlVar2) {
        synchronized (xqVar) {
            if (xqVar.listeners != xlVar) {
                return false;
            }
            xqVar.listeners = xlVar2;
            return true;
        }
    }

    @Override // defpackage.xh
    public final boolean d(xq xqVar, Object obj, Object obj2) {
        synchronized (xqVar) {
            if (xqVar.value != obj) {
                return false;
            }
            xqVar.value = obj2;
            return true;
        }
    }

    @Override // defpackage.xh
    public final boolean e(xq xqVar, xp xpVar, xp xpVar2) {
        synchronized (xqVar) {
            if (xqVar.waiters != xpVar) {
                return false;
            }
            xqVar.waiters = xpVar2;
            return true;
        }
    }
}
