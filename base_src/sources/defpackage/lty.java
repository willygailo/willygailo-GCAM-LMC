package defpackage;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class lty extends lui {
    public final lce a;
    public final long b;

    public lty(lnz lnzVar, lvs lvsVar, lig ligVar, int i, boolean z) {
        super(lnzVar, lvsVar, z);
        this.a = new lce(oih.a);
        this.b = mip.S(i, ligVar);
        ojc ojcVar = lnzVar.c;
    }

    @Override // defpackage.lnx
    public final int a() {
        return this.h.e;
    }

    @Override // defpackage.lnx
    public final lig b() {
        return this.h.d;
    }

    @Override // defpackage.lnx
    public final void d(Surface surface) {
        if (surface == null) {
            this.a.fB(oih.a);
            return;
        }
        ojc ojcVar = (ojc) this.a.d;
        if (ojcVar.g() && surface == ojcVar.c()) {
            return;
        }
        this.a.fB(ojc.i(surface));
    }

    @Override // defpackage.lui
    public final long f() {
        return this.b;
    }

    @Override // defpackage.lui
    public final Surface g() {
        return (Surface) ((ojc) this.a.d).f();
    }

    @Override // defpackage.lui
    public final loa h() {
        return this.h.a;
    }

    @Override // defpackage.lui
    public final boolean i() {
        return true;
    }
}
