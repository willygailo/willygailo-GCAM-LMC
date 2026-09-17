package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class efu implements imr, fik, fie, fii {
    private final ddf a;
    private final hug b;
    private final List c;
    private final imt d;
    private final ims e;
    private final jhh f;

    public efu(Executor executor, ddf ddfVar, lda ldaVar, ims imsVar, ims imsVar2, final hug hugVar, final jhh jhhVar, final cvo cvoVar, bqg bqgVar, final lda ldaVar2, lar larVar, final fhv fhvVar, imt imtVar) {
        Object objA;
        Object objA2;
        this.a = ddfVar;
        this.b = hugVar;
        this.d = imtVar;
        this.e = imsVar2;
        this.f = jhhVar;
        if (ddfVar.k(ddm.X)) {
            imv imvVarA = imw.a();
            imvVarA.c(executor);
            imvVarA.a = "HdrNet";
            imvVarA.d(new eft(ldaVar, 1));
            imvVarA.e(new eft(ldaVar, 0));
            imvVarA.f(imsVar);
            objA = imvVarA.a();
        } else {
            objA = iml.a;
        }
        if (gxm.b() && ddfVar.k(ddm.ao)) {
            bqgVar.i().c(ldaVar2.a(new lij() { // from class: efp
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    lda ldaVar3 = ldaVar2;
                    jhh jhhVar2 = jhhVar;
                    if (efu.e((jrl) ldaVar3.fA())) {
                        return;
                    }
                    jhhVar2.b();
                }
            }, larVar));
            bqgVar.i().c(cvoVar.a(new lij() { // from class: efo
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    jhh jhhVar2 = jhhVar;
                    hug hugVar2 = hugVar;
                    lda ldaVar3 = ldaVar2;
                    if (((cwi) obj).b()) {
                        jhhVar2.b();
                    } else if (!((String) ((lce) hugVar2.b(htu.i)).d).equals("off") && ((Boolean) ((lce) hugVar2.b(htu.p)).d).booleanValue() && efu.e((jrl) ldaVar3.fA())) {
                        jhhVar2.d();
                    }
                }
            }, executor));
            imv imvVarA2 = imw.a();
            imvVarA2.c(executor);
            imvVarA2.a = "HdrPlusTorch";
            imvVarA2.d(new Runnable() { // from class: efq
                @Override // java.lang.Runnable
                public final void run() {
                    efu efuVar = this.a;
                    cvo cvoVar2 = cvoVar;
                    hug hugVar2 = hugVar;
                    lda ldaVar3 = ldaVar2;
                    jhh jhhVar2 = jhhVar;
                    if (cvoVar2.i() && !((String) ((lce) hugVar2.b(htu.i)).d).equals("off") && efu.e((jrl) ldaVar3.fA())) {
                        jhhVar2.d();
                    }
                    efuVar.a(false);
                }
            });
            imvVarA2.e(new Runnable() { // from class: efs
                @Override // java.lang.Runnable
                public final void run() {
                    efu efuVar = this.a;
                    jhhVar.b();
                    efuVar.a(true);
                }
            });
            imvVarA2.f(imsVar2);
            objA2 = imvVarA2.a();
        } else {
            objA2 = iml.a;
        }
        this.c = oom.n(objA, objA2);
        larVar.c(new Runnable() { // from class: efr
            @Override // java.lang.Runnable
            public final void run() {
                fhvVar.e(this.a);
            }
        });
    }

    public static final boolean e(jrl jrlVar) {
        return jrlVar.equals(jrl.PHOTO) || jrlVar.equals(jrl.PORTRAIT);
    }

    public final void a(boolean z) {
        if (this.a.k(ddm.ao)) {
            this.b.e(htu.p, Boolean.valueOf(!z));
        }
    }

    @Override // defpackage.imr
    public final synchronized void c(ims imsVar) {
        otj it = ((oom) this.c).iterator();
        while (it.hasNext()) {
            ((imr) it.next()).c(imsVar);
        }
    }

    @Override // defpackage.fie
    public final void fU() {
        a(true);
        this.f.b();
    }

    @Override // defpackage.fii
    public final void fW() {
        if (this.d.c().a(this.e)) {
            a(false);
        }
    }
}
