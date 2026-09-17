package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class yy extends yx {
    public int m;

    public yy(zg zgVar) {
        super(zgVar);
        this.l = zgVar instanceof zc ? 2 : 3;
    }

    @Override // defpackage.yx
    public final void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((yv) it.next()).f();
        }
    }
}
