package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ntd implements qco {
    final /* synthetic */ Object a;
    final /* synthetic */ ntg b;

    public ntd(Object obj, ntg ntgVar) {
        this.a = obj;
        this.b = ntgVar;
    }

    @Override // defpackage.qco
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        qbd qbdVarE;
        qbu qbuVarG;
        obr obrVar = (obr) this.a;
        nsy nsyVar = (nsy) obj;
        ntg ntgVar = this.b;
        if (obrVar instanceof nup) {
            String str = ((nup) obrVar).a;
            if (qno.c(str, nsyVar.c.e)) {
                qbuVarG = qbu.k(nsyVar);
            } else {
                npe npeVarA = npe.a(nsyVar.c, str, null, null, 991);
                qbuVarG = ntgVar.a.b(nsyVar.a, nsyVar.b, npeVarA).d(nsy.a(nsyVar, null, npeVarA, 27));
            }
        } else if (obrVar instanceof nuk) {
            long j = ((nuk) obrVar).a;
            nrl nrlVar = nsyVar.a;
            nqh nqhVar = nsyVar.b;
            npe npeVar = nsyVar.c;
            double dC = nun.c(nqhVar, npeVar, j);
            long j2 = npeVar.d;
            noq noqVar = ntgVar.b;
            ntb ntbVar = new ntb(dC, 2);
            double d = j;
            double dB = nun.b(j2);
            Double.isNaN(d);
            qbuVarG = qbu.m(noqVar.c(nrlVar, nqhVar, ntbVar), noqVar.a(nrlVar, nqhVar, npeVar, new ntb(nun.a(d / dB), 3)), non.b).l(new ntc(nsyVar));
        } else if (obrVar instanceof nuh) {
            String str2 = ((nuh) obrVar).a;
            nrl nrlVar2 = nsyVar.a;
            nqh nqhVar2 = nsyVar.b;
            npe npeVar2 = nsyVar.c;
            npe npeVarA2 = npe.a(npeVar2, null, str2, npk.a(npeVar2.h, null, psf.b(ntgVar.c.a()), null, nnr.UPLOADED_TO_F250, 1.0d, 11), 703);
            qbuVarG = naq.f(ntgVar.a.b(nrlVar2, nqhVar2, npeVarA2), new nsz(ntgVar, nrlVar2, nqhVar2, nun.c(nqhVar2, npeVar2, npeVar2.d))).l(new nta(nsyVar, npeVarA2));
        } else if (obrVar instanceof nuo) {
            IllegalStateException illegalStateException = new IllegalStateException("UploadResourceComplete for attachment");
            nsyVar.b(29, illegalStateException);
            qbuVarG = naq.g(ntgVar.a(nsyVar), illegalStateException);
        } else {
            if (!(obrVar instanceof nui)) {
                throw new qkk();
            }
            nui nuiVar = (nui) obrVar;
            int i = nuiVar.b;
            Throwable th = nuiVar.a;
            nsyVar.b(i, th);
            switch (i - 2) {
                case 24:
                case 26:
                    qbdVarE = ntgVar.b.d(nsyVar.a, new nqi(nsyVar.b, qmd.q(nsyVar.c)), noj.l).e();
                    break;
                case 25:
                    nrl nrlVar3 = nsyVar.a;
                    nqh nqhVar3 = nsyVar.b;
                    npe npeVar3 = nsyVar.c;
                    qbdVarE = qbd.b(ntgVar.a.b(nrlVar3, nqhVar3, npe.a(npeVar3, null, null, npk.a(npeVar3.h, null, null, null, nnr.UPLOAD_PENDING, 0.0d, 15), 735)), ntgVar.b.c(nrlVar3, nqhVar3, new ntb(nun.c(nqhVar3, npeVar3, 0L), 0)).e());
                    break;
                default:
                    qbdVarE = ntgVar.a(nsyVar);
                    break;
            }
            qbuVarG = naq.g(qbdVarE, th);
        }
        return qbuVarG.f();
    }
}
