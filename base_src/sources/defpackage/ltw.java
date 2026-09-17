package defpackage;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class ltw extends lui {
    public final lug a;
    public final ltx b;
    public final lig c;
    public final long d;
    public final int e;

    public ltw(lnz lnzVar, lvs lvsVar, lug lugVar, int i, boolean z) {
        super(lnzVar, lvsVar, z);
        this.a = lugVar;
        this.e = i;
        lig ligVar = lugVar.c;
        this.c = ligVar;
        this.d = mip.S(lugVar.b, ligVar);
        this.b = new ltx(i);
    }

    @Override // defpackage.lnx
    public final int a() {
        return this.a.b;
    }

    @Override // defpackage.lnx
    public final lig b() {
        return this.c;
    }

    @Override // defpackage.lnx
    public final void d(Surface surface) {
        throw new UnsupportedOperationException("setSurface should never be called on buffered streams.");
    }

    @Override // defpackage.lui
    public final long f() {
        return this.d;
    }

    @Override // defpackage.lui
    public final Surface g() {
        return this.a.a.e();
    }

    @Override // defpackage.lui
    public final loa h() {
        return loa.IMAGE_READER;
    }

    @Override // defpackage.lui
    public final boolean i() {
        return this.h.i;
    }
}
