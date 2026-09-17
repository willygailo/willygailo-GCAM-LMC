package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
final class evj implements fcg {
    private final ewb a;
    private final qkg b;
    private final qkg c;
    private final khx d;

    public evj(ewb ewbVar, khx khxVar, byte[] bArr, byte[] bArr2) {
        this.a = ewbVar;
        this.d = khxVar;
        fcf fcfVar = new fcf(khxVar, null, null);
        this.b = fcfVar;
        this.c = new elc(fcfVar, ewbVar.az, ewbVar.i, 11, (boolean[]) null);
    }

    @Override // defpackage.fcg
    public final fce a() {
        lwf lwfVar = (lwf) this.a.ac.get();
        ddf ddfVar = (ddf) this.a.i.get();
        djh djhVar = new djh(fcf.b(this.d), (ddf) this.a.i.get());
        ids idsVar = new ids(fcf.b(this.d), (hub) this.a.v.get(), (huf) this.a.az.get(), (hug) this.a.az.get(), (idt) this.a.fd.get(), (fjs) this.a.t.get(), (ddf) this.a.i.get());
        lar larVar = (lar) this.a.o.get();
        gqy gqyVar = (gqy) this.a.bL.get();
        orx orxVar = orx.a;
        orx orxVar2 = orx.a;
        orx orxVar3 = orx.a;
        lda ldaVar = (lda) this.a.dy.get();
        fjs fjsVar = (fjs) this.a.t.get();
        lda ldaVar2 = (lda) this.a.dA.get();
        lda ldaVar3 = (lda) this.a.fr.get();
        ewb ewbVar = this.a;
        return new fce(lwfVar, ddfVar, djhVar, idsVar, larVar, gqyVar, orxVar, orxVar2, orxVar3, ldaVar, fjsVar, ldaVar2, ldaVar3, new dwd(ewbVar.c.b, (lda) ewbVar.bt.get(), (fjs) this.a.t.get(), (ddf) this.a.i.get()), new ilk(hcv.b((lda) this.a.dA.get(), (lda) this.a.dQ.get(), (lda) this.a.dK.get(), (lda) this.a.Y.get(), (hur) this.a.dI.get(), (huq) this.a.dH.get(), (huf) this.a.az.get(), (hug) this.a.az.get()), (ilx) this.a.eq.get(), new ilg((lda) this.a.dA.get(), (lda) this.a.dQ.get(), (lda) this.a.dK.get(), (hur) this.a.dI.get(), (huq) this.a.dH.get(), (huf) this.a.az.get()), (ScheduledExecutorService) this.a.j.get(), (lar) this.a.o.get(), (fjs) this.a.t.get(), (ddf) this.a.i.get()), pyr.a(this.c), (nvb) this.a.cZ.get(), (hub) this.a.v.get(), (hug) this.a.az.get(), this.a.A(), this.a.m(), this.a.n(), null, null);
    }
}
