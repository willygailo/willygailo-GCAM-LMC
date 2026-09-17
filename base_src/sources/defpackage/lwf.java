package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lwf implements lvq {
    private final lvq a;

    public lwf(lvq lvqVar) {
        this.a = lvqVar;
    }

    @Override // defpackage.lvq
    public final lvp a(lvs lvsVar) {
        return this.a.a(lvsVar);
    }

    @Override // defpackage.lvq
    public final lvs b() {
        return this.a.b();
    }

    @Override // defpackage.lvq
    public final lvs c(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.lvq
    public final lvs d(String str) {
        return this.a.d(str);
    }

    @Override // defpackage.lvq
    public final lvs e(lwd lwdVar) {
        return this.a.e(lwdVar);
    }

    public final ghx f(lvs lvsVar) {
        return new ghx(a(lvsVar));
    }

    @Override // defpackage.lvq
    public final List g() {
        return this.a.g();
    }

    @Override // defpackage.lvq
    public final List h(lwd lwdVar) {
        return this.a.h(lwdVar);
    }

    @Override // defpackage.lvq
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.lvq
    public final boolean j(lwd lwdVar) {
        return this.a.j(lwdVar);
    }

    @Override // defpackage.lvq
    public final boolean k() {
        return this.a.k();
    }
}
