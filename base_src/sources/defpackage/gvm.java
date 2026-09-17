package defpackage;

import android.util.ArraySet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gvm extends mip {
    private final Set a = new ArraySet();

    @Override // defpackage.mip
    public final synchronized void b(lzv lzvVar) {
        oti it = ope.F(this.a).iterator();
        while (it.hasNext()) {
            ((mip) it.next()).b(lzvVar);
        }
    }

    @Override // defpackage.mip
    public final synchronized void fH(lzr lzrVar) {
        oti it = ope.F(this.a).iterator();
        while (it.hasNext()) {
            ((mip) it.next()).fH(lzrVar);
        }
    }

    @Override // defpackage.mip
    public final synchronized void fI(long j, int i) {
        oti it = ope.F(this.a).iterator();
        while (it.hasNext()) {
            ((mip) it.next()).fI(j, i);
        }
    }

    @Override // defpackage.mip
    public final synchronized void fJ(lmw lmwVar) {
        oti it = ope.F(this.a).iterator();
        while (it.hasNext()) {
            ((mip) it.next()).fJ(lmwVar);
        }
    }

    @Override // defpackage.mip
    public final synchronized void fv(lnx lnxVar, long j) {
        oti it = ope.F(this.a).iterator();
        while (it.hasNext()) {
            ((mip) it.next()).fv(lnxVar, j);
        }
    }

    @Override // defpackage.mip
    public final synchronized void fw(lux luxVar) {
        oti it = ope.F(this.a).iterator();
        while (it.hasNext()) {
            ((mip) it.next()).fw(luxVar);
        }
    }

    @Override // defpackage.mip
    public final synchronized void k(long j, int i, long j2) {
        oti it = ope.F(this.a).iterator();
        while (it.hasNext()) {
            ((mip) it.next()).k(j, i, j2);
        }
    }

    @Override // defpackage.mip
    public final synchronized void l(long j, Set set) {
        oti it = ope.F(this.a).iterator();
        while (it.hasNext()) {
            ((mip) it.next()).l(j, set);
        }
    }

    @Override // defpackage.mip
    public final synchronized void m(long j, int i) {
        oti it = ope.F(this.a).iterator();
        while (it.hasNext()) {
            ((mip) it.next()).m(j, i);
        }
    }

    public final synchronized void n(mip mipVar) {
        this.a.add(mipVar);
    }

    public final synchronized void o(mip mipVar) {
        this.a.remove(mipVar);
    }
}
