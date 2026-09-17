package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class lmx extends mip {
    private final oom a;

    public lmx(oom oomVar) {
        this.a = oomVar;
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        oom oomVar = this.a;
        int size = oomVar.size();
        for (int i = 0; i < size; i++) {
            ((mip) oomVar.get(i)).b(lzvVar);
        }
    }

    @Override // defpackage.mip
    public final void fH(lzr lzrVar) {
        oom oomVar = this.a;
        int size = oomVar.size();
        for (int i = 0; i < size; i++) {
            ((mip) oomVar.get(i)).fH(lzrVar);
        }
    }

    @Override // defpackage.mip
    public final void fI(long j, int i) {
        oom oomVar = this.a;
        int size = oomVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((mip) oomVar.get(i2)).fI(j, i);
        }
    }

    @Override // defpackage.mip
    public final void fJ(lmw lmwVar) {
        oom oomVar = this.a;
        int size = oomVar.size();
        for (int i = 0; i < size; i++) {
            ((mip) oomVar.get(i)).fJ(lmwVar);
        }
    }

    @Override // defpackage.mip
    public final void fv(lnx lnxVar, long j) {
        oom oomVar = this.a;
        int size = oomVar.size();
        for (int i = 0; i < size; i++) {
            ((mip) oomVar.get(i)).fv(lnxVar, j);
        }
    }

    @Override // defpackage.mip
    public final void fw(lux luxVar) {
        oom oomVar = this.a;
        int size = oomVar.size();
        for (int i = 0; i < size; i++) {
            ((mip) oomVar.get(i)).fw(luxVar);
        }
    }

    @Override // defpackage.mip
    public final void k(long j, int i, long j2) {
        oom oomVar = this.a;
        int size = oomVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((mip) oomVar.get(i2)).k(j, i, j2);
        }
    }

    @Override // defpackage.mip
    public final void l(long j, Set set) {
        oom oomVar = this.a;
        int size = oomVar.size();
        for (int i = 0; i < size; i++) {
            ((mip) oomVar.get(i)).l(j, set);
        }
    }

    @Override // defpackage.mip
    public final void m(long j, int i) {
        oom oomVar = this.a;
        int size = oomVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((mip) oomVar.get(i2)).m(j, i);
        }
    }
}
