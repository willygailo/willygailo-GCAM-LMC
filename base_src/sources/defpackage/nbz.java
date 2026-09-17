package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class nbz extends myw implements mxo, nbu {
    public final pyn b;
    public final AtomicReference c;
    public final nox d;
    private final phw e;

    public nbz(mxm mxmVar, phw phwVar, pyn pynVar, qkg qkgVar, nox noxVar, byte[] bArr) {
        AtomicReference atomicReference = new AtomicReference();
        this.c = atomicReference;
        this.e = phwVar;
        this.b = pynVar;
        this.d = noxVar;
        mxmVar.a(phwVar, new pyn() { // from class: nbx
            @Override // defpackage.pyn
            public final Object get() {
                nbv nbvVarC = nbw.c();
                nbvVarC.b(true);
                return nbvVarC.a();
            }
        }, qkgVar);
        atomicReference.set(noxVar.a(1.0f));
    }

    @Override // defpackage.mxo
    public final void t() {
        plk.Y(new Runnable() { // from class: nby
            @Override // java.lang.Runnable
            public final void run() {
                nbz nbzVar = this.a;
                try {
                    nbzVar.c.set(nbzVar.d.a(((nbw) nbzVar.b.get()).b() ? ((nbw) nbzVar.b.get()).a : 0.0f));
                } catch (Throwable th) {
                    nbzVar.c.set(nbzVar.d.a(0.0f));
                }
            }
        }, this.e);
    }
}
