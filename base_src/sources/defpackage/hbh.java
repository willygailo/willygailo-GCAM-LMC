package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class hbh implements lmu {
    final /* synthetic */ hbi c;
    private final long f;
    public final List a = new ArrayList();
    private final AtomicInteger d = new AtomicInteger(0);
    private final AtomicInteger e = new AtomicInteger(0);
    public boolean b = true;

    public hbh(hbi hbiVar, long j) {
        this.c = hbiVar;
        this.f = j;
    }

    @Override // defpackage.lmu
    public final void a(lrr lrrVar) {
        synchronized (this) {
            if (this.b) {
                lmw lmwVarB = lrrVar.b();
                if (lmwVarB == null || lmwVarB.c <= this.f) {
                    return;
                }
                int i = this.d.get();
                hbi hbiVar = this.c;
                if (i >= hbiVar.b) {
                    synchronized (hbiVar.c) {
                        hbi hbiVar2 = this.c;
                        hbiVar2.e.l(hbiVar2.d);
                    }
                    synchronized (this) {
                        this.b = false;
                        notifyAll();
                    }
                    return;
                }
                lmr lmrVarA = lrrVar.a();
                this.d.incrementAndGet();
                if (lmrVarA == null) {
                    ((oug) ((oug) hbi.a.c()).G(2324)).B("Image not available %d (done: %s, metadata done: %s, images done: %s", Integer.valueOf(this.d.get()), Boolean.valueOf(lrrVar.e()), Boolean.valueOf(lrrVar.a.m()), Boolean.valueOf(lrrVar.a.l()));
                    this.c.f.fB(null);
                } else {
                    this.a.add(lmrVarA);
                    this.c.f.fB(null);
                    this.e.incrementAndGet();
                    this.e.get();
                }
            }
        }
    }
}
