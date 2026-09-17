package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class cfb implements epi {
    final /* synthetic */ cfe a;
    private boolean b = false;
    private boolean c = false;

    public cfb(cfe cfeVar) {
        this.a = cfeVar;
    }

    @Override // defpackage.epi
    public final /* synthetic */ void a(boolean z) {
    }

    @Override // defpackage.epi
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.epi
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.epi
    public final void d(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (!z && this.c) {
            this.c = false;
            return;
        }
        synchronized (this.a.w) {
            cjr cjrVar = (cjr) ((lce) this.a.r.f).d;
            if ((!z && cjrVar != cjr.RECORDING_SESSION_ACTIVE) || (z && cjrVar == cjr.RECORDING_SESSION_ACTIVE)) {
                Iterator it = this.a.f.iterator();
                while (it.hasNext()) {
                    ((chy) it.next()).j(true);
                }
                if (z) {
                    this.c = true;
                }
            }
        }
        if (this.a.m.k(ddl.aw)) {
            this.a.h.A(z);
        }
    }

    @Override // defpackage.epi
    public final void e(boolean z) {
        if (z) {
            this.a.g.z();
        }
    }

    @Override // defpackage.epi
    public final void f(boolean z) {
        if (z) {
            this.a.g.A();
        }
    }
}
