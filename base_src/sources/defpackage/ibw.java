package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class ibw implements idd {
    final /* synthetic */ ibz a;

    public ibw(ibz ibzVar) {
        this.a = ibzVar;
    }

    @Override // defpackage.idd
    public final void a() {
        synchronized (this.a.o) {
            Iterator it = this.a.o.iterator();
            while (it.hasNext()) {
                ((idd) it.next()).a();
            }
        }
    }

    @Override // defpackage.idd
    public final void b() {
        synchronized (this.a.o) {
            Iterator it = this.a.o.iterator();
            while (it.hasNext()) {
                ((idd) it.next()).b();
            }
        }
    }

    @Override // defpackage.idd
    public final void c() {
        synchronized (this.a.o) {
            Iterator it = this.a.o.iterator();
            while (it.hasNext()) {
                ((idd) it.next()).c();
            }
        }
    }

    @Override // defpackage.idd
    public final void d() {
        synchronized (this.a.o) {
            Iterator it = this.a.o.iterator();
            while (it.hasNext()) {
                ((idd) it.next()).d();
            }
        }
    }
}
