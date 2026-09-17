package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class imx implements imr {
    public final lco a;
    private final imr b;

    public imx(Executor executor, lda ldaVar, ims imsVar) {
        this.a = lci.c(ldaVar);
        imv imvVarA = imw.a();
        imvVarA.c(executor);
        imvVarA.a = "PortraitTeleStream";
        imvVarA.d(new eft(ldaVar, 4));
        imvVarA.e(new eft(ldaVar, 5));
        imvVarA.f(imsVar);
        this.b = imvVarA.a();
    }

    @Override // defpackage.imr
    public final synchronized void c(ims imsVar) {
        this.b.c(imsVar);
    }
}
