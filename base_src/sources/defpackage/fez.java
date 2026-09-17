package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fez implements imr {
    private final imr a;

    public fez(Executor executor, lda ldaVar, ims imsVar, boolean z) {
        if (!z) {
            this.a = iml.a;
            return;
        }
        imv imvVarA = imw.a();
        imvVarA.c(executor);
        imvVarA.a = "LensLite";
        imvVarA.d(new eft(ldaVar, 2));
        imvVarA.e(new eft(ldaVar, 3));
        imvVarA.f(imsVar);
        this.a = imvVarA.a();
    }

    @Override // defpackage.imr
    public final synchronized void c(ims imsVar) {
        this.a.c(imsVar);
    }
}
