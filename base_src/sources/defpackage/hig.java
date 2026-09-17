package defpackage;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class hig implements pys {
    private final /* synthetic */ int a;

    public hig(int i) {
        this.a = i;
    }

    public static hig a() {
        return new hig(0);
    }

    public static hit b() {
        return new hit();
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                return b();
            case 1:
                nbn nbnVarC = nbo.c();
                nbnVarC.b(pzf.a.a().e());
                return nbnVarC.a();
            case 2:
                return b();
            case 3:
                return new fcy();
            case 4:
                return new fcy();
            case 5:
                return new fcy();
            case 6:
                return new hkk();
            case 7:
                return new fcy();
            case 8:
                return new fcy();
            case 9:
                return new hkr();
            case 10:
                return new hls();
            case 11:
                return new hle();
            case 12:
                lda ldaVar = hln.a;
                qmd.ae(ldaVar);
                return ldaVar;
            case 13:
                lda ldaVar2 = hln.a;
                qmd.ae(ldaVar2);
                return ldaVar2;
            case 14:
                lda ldaVar3 = hln.b;
                qmd.ae(ldaVar3);
                return ldaVar3;
            case 15:
                return new hlv();
            case 16:
                ExecutorService executorServiceBJ = mip.bJ("mcfly-buffer");
                qmd.ae(executorServiceBJ);
                return executorServiceBJ;
            case 17:
                return new hmh();
            case 18:
                return new hmj();
            case 19:
                return new lax(mip.bM("med-res-save"));
            default:
                return new hnr();
        }
    }
}
