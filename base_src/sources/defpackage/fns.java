package defpackage;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class fns {
    public final ojc a;
    private final lie b;
    private final lnc c;
    private final gxm d;
    private final lvp e;
    private final AtomicBoolean f;
    private final ddf g;

    public fns(ojc ojcVar, lie lieVar, lnc lncVar, gxm gxmVar, lvp lvpVar, AtomicBoolean atomicBoolean, ddf ddfVar) {
        this.b = lieVar;
        this.a = ojcVar;
        this.c = lncVar;
        this.d = gxmVar;
        this.e = lvpVar;
        this.f = atomicBoolean;
        this.g = ddfVar;
    }

    final void a() {
        this.b.close();
        this.f.set(false);
        if (gxm.b() && this.g.k(ddu.j) && this.e.k().equals(lwd.BACK)) {
            HashSet hashSet = new HashSet();
            hashSet.add(mip.be(kdc.c, true));
            hashSet.add(mip.be(kdc.b, Integer.valueOf(this.d.a(this.e))));
            this.c.i(hashSet);
        }
    }
}
