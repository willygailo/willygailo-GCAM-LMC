package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
final class bjj implements bjp {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    @Override // defpackage.bjp
    public final void a(bjq bjqVar) {
        this.a.add(bjqVar);
        if (this.c) {
            bjqVar.g();
        } else if (this.b) {
            bjqVar.h();
        } else {
            bjqVar.i();
        }
    }

    final void b() {
        this.c = true;
        Iterator it = bmf.g(this.a).iterator();
        while (it.hasNext()) {
            ((bjq) it.next()).g();
        }
    }

    final void c() {
        this.b = true;
        Iterator it = bmf.g(this.a).iterator();
        while (it.hasNext()) {
            ((bjq) it.next()).h();
        }
    }

    final void d() {
        this.b = false;
        Iterator it = bmf.g(this.a).iterator();
        while (it.hasNext()) {
            ((bjq) it.next()).i();
        }
    }

    @Override // defpackage.bjp
    public final void e(bjq bjqVar) {
        this.a.remove(bjqVar);
    }
}
