package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class pgq extends pge {
    private pgp c;

    public pgq(ood oodVar, boolean z, Executor executor, Callable callable) {
        super(oodVar, z, false);
        this.c = new pgo(this, callable, executor);
        r();
    }

    public pgq(ood oodVar, boolean z, Executor executor, pgj pgjVar) {
        super(oodVar, z, false);
        this.c = new pgn(this, pgjVar, executor);
        r();
    }

    @Override // defpackage.pge
    public final void g(int i, Object obj) {
    }

    @Override // defpackage.pfx
    protected final void m() {
        pgp pgpVar = this.c;
        if (pgpVar != null) {
            pgpVar.h();
        }
    }

    @Override // defpackage.pge
    public final void q() {
        pgp pgpVar = this.c;
        if (pgpVar != null) {
            pgpVar.f();
        }
    }

    @Override // defpackage.pge
    public final void s(int i) {
        super.s(i);
        if (i == 1) {
            this.c = null;
        }
    }
}
