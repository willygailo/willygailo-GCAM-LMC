package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class dll implements dlt {
    public final List a = new CopyOnWriteArrayList();

    @Override // defpackage.dlx
    public final void d() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dlt) it.next()).d();
        }
    }

    @Override // defpackage.llt
    public final void e(Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dlt) it.next()).e(th);
        }
    }

    @Override // defpackage.llt
    public final void f(Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dlt) it.next()).f(th);
        }
    }

    @Override // defpackage.dlx
    public final void g() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dlt) it.next()).g();
        }
    }

    @Override // defpackage.dlx
    public final void h() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dlt) it.next()).h();
        }
    }

    @Override // defpackage.dly
    public final void i() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dlt) it.next()).i();
        }
    }
}
