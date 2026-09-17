package defpackage;

import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fhi implements fik, fie, fig, fii, fij {
    public fhu d;
    private fhu f;
    private fhu g;
    final List a = new ArrayList();
    final List b = new ArrayList();
    private int e = 0;
    public int c = 0;

    public final void a(fhu fhuVar) {
        this.b.remove(fhuVar);
    }

    @Override // defpackage.fij
    public final void e() {
        int i = this.e - 1;
        this.e = i;
        obr.aF(i >= 0);
        if (this.e == 0) {
            a(this.f);
            for (fik fikVar : this.a) {
                if (fikVar instanceof fhn) {
                    ((fhn) fikVar).b();
                }
            }
        }
    }

    public final void f(fhu fhuVar) {
        Collection.EL.forEach(this.a, new fhr(fhuVar, 1));
        this.b.add(fhuVar);
    }

    @Override // defpackage.fie
    public final void fU() {
        int i = this.c - 1;
        this.c = i;
        obr.aF(i >= 0);
        if (this.c == 0) {
            a(this.g);
            for (fik fikVar : this.a) {
                if (fikVar instanceof fhk) {
                    ((fhk) fikVar).b();
                }
            }
        }
    }

    @Override // defpackage.fig
    public final void fV() {
        int i = this.c + 1;
        this.c = i;
        obr.aF(i > 0);
        if (this.c == 1) {
            fhc fhcVar = fhc.d;
            f(fhcVar);
            this.g = fhcVar;
        }
    }

    @Override // defpackage.fii
    public final void fW() {
        int i = this.e + 1;
        this.e = i;
        obr.aF(i > 0);
        if (this.e == 1) {
            fhc fhcVar = fhc.e;
            f(fhcVar);
            this.f = fhcVar;
        }
    }

    public final void g(fik fikVar) {
        lar.a();
        this.a.add(fikVar);
        Collection.EL.forEach(this.b, new fhs(fikVar, 1));
    }
}
