package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lnw extends mip {
    private boolean a = false;
    private final mip b;

    public lnw(mip mipVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = mipVar;
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b.b(lzvVar);
        }
    }

    @Override // defpackage.mip
    public final void fH(lzr lzrVar) {
        this.b.fH(lzrVar);
    }

    @Override // defpackage.mip
    public final void fI(long j, int i) {
        this.b.fI(j, i);
    }

    @Override // defpackage.mip
    public final void fJ(lmw lmwVar) {
        this.b.fJ(lmwVar);
    }

    @Override // defpackage.mip
    public final void fv(lnx lnxVar, long j) {
        this.b.fv(lnxVar, j);
    }

    @Override // defpackage.mip
    public final void fw(lux luxVar) {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b.fw(luxVar);
        }
    }

    @Override // defpackage.mip
    public final void k(long j, int i, long j2) {
        this.b.k(j, i, j2);
    }

    @Override // defpackage.mip
    public final void l(long j, Set set) {
        this.b.l(j, set);
    }

    @Override // defpackage.mip
    public final void m(long j, int i) {
        this.b.m(j, i);
    }
}
