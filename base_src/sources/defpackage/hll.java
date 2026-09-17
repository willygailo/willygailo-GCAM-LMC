package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hll implements imr {
    private final imr a;

    public hll(Executor executor, final lda ldaVar, final lda ldaVar2, ims imsVar) {
        imv imvVarA = imw.a();
        imvVarA.f(imsVar);
        imvVarA.a = "liveRectiface";
        final int i = 1;
        imvVarA.e(new Runnable() { // from class: hlk
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        lda ldaVar3 = ldaVar;
                        lda ldaVar4 = ldaVar2;
                        if (kdb.h != null) {
                            ldaVar3.fB(2);
                        }
                        ldaVar4.fB(false);
                        break;
                    default:
                        lda ldaVar5 = ldaVar;
                        lda ldaVar6 = ldaVar2;
                        if (kdb.h != null) {
                            ldaVar5.fB(1);
                        }
                        ldaVar6.fB(true);
                        break;
                }
            }
        });
        final int i2 = 0;
        imvVarA.d(new Runnable() { // from class: hlk
            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        lda ldaVar3 = ldaVar;
                        lda ldaVar4 = ldaVar2;
                        if (kdb.h != null) {
                            ldaVar3.fB(2);
                        }
                        ldaVar4.fB(false);
                        break;
                    default:
                        lda ldaVar5 = ldaVar;
                        lda ldaVar6 = ldaVar2;
                        if (kdb.h != null) {
                            ldaVar5.fB(1);
                        }
                        ldaVar6.fB(true);
                        break;
                }
            }
        });
        imvVarA.c(executor);
        this.a = imvVarA.a();
    }

    @Override // defpackage.imr
    public final void c(ims imsVar) {
        this.a.c(imsVar);
    }
}
