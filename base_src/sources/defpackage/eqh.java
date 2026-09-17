package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class eqh implements goy {
    private final hen a;
    private final goy b;
    private final lco c;
    private final esm d;
    private final lap e;

    public eqh(hen henVar, lco lcoVar, lap lapVar, ojc ojcVar, final eqa eqaVar, lco lcoVar2, lda ldaVar, qkg qkgVar, goy goyVar) {
        obr.aF(true);
        this.a = henVar;
        this.b = goyVar;
        this.d = (esm) ((ojj) ojcVar).a;
        this.e = lapVar;
        final lmv lmvVarF = henVar.f();
        lco lcoVarB = ((hcs) qkgVar.get()).b();
        final lce lceVar = new lce(0);
        lmvVarF.k(new lmu() { // from class: eqe
            @Override // defpackage.lmu
            public final void a(lrr lrrVar) {
                lceVar.fB(Integer.valueOf(lmvVarF.b()));
            }
        });
        lapVar.c(lcoVar.a(new eqd(lceVar, 0), pgr.INSTANCE));
        this.c = lcv.d(lcv.d(new eqg(lcoVarB, lcv.j(ldaVar, eto.b)), new eqf(lceVar)), lcoVar2);
        lmvVarF.k(eqaVar);
        lapVar.c(new lie() { // from class: eqb
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                lmvVarF.l(eqaVar);
            }
        });
        lapVar.c(eqaVar);
    }

    @Override // defpackage.goy
    public final lco a() {
        return this.c;
    }

    @Override // defpackage.goy
    public final lco b() {
        return this.b.b();
    }

    @Override // defpackage.goy
    public final void c(gox goxVar, gog gogVar) {
        ovd ovdVar = ovl.a;
        gogVar.c.b().e(2);
        hem hemVarA = this.a.a();
        try {
            try {
                Future futureK = this.d.k(gogVar);
                this.b.c(hao.b, gogVar);
                this.e.c(new eqc(futureK, 0));
                futureK.get();
                hemVarA.a();
                goxVar.close();
            } catch (CancellationException e) {
                this.d.d(gogVar.b.h());
                throw new InterruptedException("Error executing capture command.");
            } catch (ExecutionException e2) {
                this.d.d(gogVar.b.h());
                throw new InterruptedException("Error executing capture command.");
            } catch (Exception e3) {
                this.d.d(gogVar.b.h());
                throw e3;
            }
        } catch (Throwable th) {
            hemVarA.a();
            goxVar.close();
            throw th;
        }
    }
}
