package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bfj implements bac, bab {
    private final List a;
    private final fc b;
    private int c;
    private ayc d;
    private bab e;
    private List f;
    private boolean g;

    public bfj(List list, fc fcVar) {
        this.b = fcVar;
        aae.v(list);
        this.a = list;
        this.c = 0;
    }

    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            f(this.d, this.e);
        } else {
            aae.s(this.f);
            this.e.e(new bcg("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.bac
    public final Class a() {
        return ((bac) this.a.get(0)).a();
    }

    @Override // defpackage.bab
    public final void b(Object obj) {
        if (obj != null) {
            this.e.b(obj);
        } else {
            h();
        }
    }

    @Override // defpackage.bac
    public final void d() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bac) it.next()).d();
        }
    }

    @Override // defpackage.bab
    public final void e(Exception exc) {
        List list = this.f;
        aae.s(list);
        list.add(exc);
        h();
    }

    @Override // defpackage.bac
    public final void f(ayc aycVar, bab babVar) {
        this.d = aycVar;
        this.e = babVar;
        this.f = (List) this.b.a();
        ((bac) this.a.get(this.c)).f(aycVar, this);
        if (this.g) {
            fu();
        }
    }

    @Override // defpackage.bac
    public final void fu() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bac) it.next()).fu();
        }
    }

    @Override // defpackage.bac
    public final int g() {
        return ((bac) this.a.get(0)).g();
    }
}
