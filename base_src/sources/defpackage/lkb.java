package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lkb implements lkc {
    final List a;

    public lkb(List list) {
        this.a = list;
    }

    @Override // defpackage.lkc
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lkc) it.next()).a();
        }
    }

    @Override // defpackage.lkc
    public final void b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lkc) it.next()).b();
        }
    }

    @Override // defpackage.lkc
    public final void c(lju ljuVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lkc) it.next()).c(ljuVar);
        }
    }

    @Override // defpackage.lkc
    public final void d(lzp lzpVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lkc) it.next()).d(lzpVar);
        }
    }
}
