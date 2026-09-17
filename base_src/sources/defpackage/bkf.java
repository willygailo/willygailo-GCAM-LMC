package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bkf implements bjq {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.bjq
    public final void g() {
        Iterator it = bmf.g(this.a).iterator();
        while (it.hasNext()) {
            ((blh) it.next()).g();
        }
    }

    @Override // defpackage.bjq
    public final void h() {
        Iterator it = bmf.g(this.a).iterator();
        while (it.hasNext()) {
            ((blh) it.next()).h();
        }
    }

    @Override // defpackage.bjq
    public final void i() {
        Iterator it = bmf.g(this.a).iterator();
        while (it.hasNext()) {
            ((blh) it.next()).i();
        }
    }
}
