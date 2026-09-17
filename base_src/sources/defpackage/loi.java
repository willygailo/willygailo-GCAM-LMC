package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class loi extends mip {
    public final mip a;
    private final Executor b;

    public loi(mip mipVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = executor;
        this.a = mipVar;
    }

    @Override // defpackage.mip
    public final void b(final lzv lzvVar) {
        this.b.execute(new Runnable() { // from class: loh
            @Override // java.lang.Runnable
            public final void run() {
                loi loiVar = this.a;
                loiVar.a.b(lzvVar);
            }
        });
    }

    @Override // defpackage.mip
    public final void fH(final lzr lzrVar) {
        this.b.execute(new Runnable() { // from class: log
            @Override // java.lang.Runnable
            public final void run() {
                loi loiVar = this.a;
                loiVar.a.fH(lzrVar);
            }
        });
    }

    @Override // defpackage.mip
    public final void fI(long j, int i) {
        this.b.execute(new lob(this, j, i, 1));
    }

    @Override // defpackage.mip
    public final void fJ(final lmw lmwVar) {
        this.b.execute(new Runnable() { // from class: loe
            @Override // java.lang.Runnable
            public final void run() {
                loi loiVar = this.a;
                loiVar.a.fJ(lmwVar);
            }
        });
    }

    @Override // defpackage.mip
    public final void fw(final lux luxVar) {
        this.b.execute(new Runnable() { // from class: lof
            @Override // java.lang.Runnable
            public final void run() {
                loi loiVar = this.a;
                loiVar.a.fw(luxVar);
            }
        });
    }

    @Override // defpackage.mip
    public final void k(final long j, final int i, final long j2) {
        this.b.execute(new Runnable() { // from class: loc
            @Override // java.lang.Runnable
            public final void run() {
                loi loiVar = this.a;
                loiVar.a.k(j, i, j2);
            }
        });
    }

    @Override // defpackage.mip
    public final void l(final long j, final Set set) {
        this.b.execute(new Runnable() { // from class: lod
            @Override // java.lang.Runnable
            public final void run() {
                loi loiVar = this.a;
                loiVar.a.l(j, set);
            }
        });
    }

    @Override // defpackage.mip
    public final void m(long j, int i) {
        this.b.execute(new lob(this, j, i, 0));
    }
}
