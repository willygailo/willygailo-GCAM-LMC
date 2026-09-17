package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pfr extends pfk {
    @Override // defpackage.pfk
    public final void a(pfw pfwVar, pfw pfwVar2) {
        pfwVar.next = pfwVar2;
    }

    @Override // defpackage.pfk
    public final void b(pfw pfwVar, Thread thread) {
        pfwVar.thread = thread;
    }

    @Override // defpackage.pfk
    public final boolean c(pfx pfxVar, pfo pfoVar, pfo pfoVar2) {
        synchronized (pfxVar) {
            if (pfxVar.listeners != pfoVar) {
                return false;
            }
            pfxVar.listeners = pfoVar2;
            return true;
        }
    }

    @Override // defpackage.pfk
    public final boolean d(pfx pfxVar, Object obj, Object obj2) {
        synchronized (pfxVar) {
            if (pfxVar.value != obj) {
                return false;
            }
            pfxVar.value = obj2;
            return true;
        }
    }

    @Override // defpackage.pfk
    public final boolean e(pfx pfxVar, pfw pfwVar, pfw pfwVar2) {
        synchronized (pfxVar) {
            if (pfxVar.waiters != pfwVar) {
                return false;
            }
            pfxVar.waiters = pfwVar2;
            return true;
        }
    }
}
