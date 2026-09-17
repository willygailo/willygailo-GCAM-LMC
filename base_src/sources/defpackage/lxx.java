package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lxx extends lxq {
    public final ldi f;
    public final ldb g;
    private lco h;

    public lxx(long j) {
        super(j);
        ldb ldbVar = new ldb();
        this.g = ldbVar;
        this.f = new ldi(0L, ldbVar);
    }

    @Override // defpackage.lxq
    protected final void d() {
        long j;
        ldi ldiVar = this.f;
        synchronized (this.a) {
            if (this.e) {
                j = this.b;
            } else if (this.c.isEmpty()) {
                j = this.d;
            } else {
                Iterator it = this.c.iterator();
                long j2 = 0;
                while (it.hasNext()) {
                    j2 += ((lxp) it.next()).b;
                }
                j = j2 + this.d;
            }
        }
        ldiVar.fB(Long.valueOf(j));
    }

    public final synchronized lco f() {
        if (this.h == null) {
            this.h = lcv.j(this.f, new oiu() { // from class: lxw
                @Override // defpackage.oiu
                public final Object a(Object obj) {
                    return Long.valueOf(Math.min(((Long) obj).longValue(), this.a.b));
                }
            });
        }
        return this.h;
    }
}
