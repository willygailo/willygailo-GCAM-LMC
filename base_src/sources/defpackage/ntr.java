package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ntr implements qco {
    final /* synthetic */ nty a;
    final /* synthetic */ Integer b;

    public ntr(nty ntyVar, Integer num) {
        this.a = ntyVar;
        this.b = num;
    }

    @Override // defpackage.qco
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        nuj nujVar = (nuj) obj;
        nujVar.getClass();
        ntg ntgVar = this.a.c;
        int iIntValue = this.b.intValue();
        nsy nsyVar = new nsy(nujVar.a, nujVar.b, (npe) nujVar.d.get(iIntValue), qnt.b(qmd.I(new qoj[]{new qot(new qot(new qoi(qmd.z(nujVar.d)), new qoq(new nsx(iIntValue)), 1), noj.u, 0), qmd.z(nujVar.c)})), nujVar.g);
        npe npeVar = nsyVar.c;
        return ohh.ac(new pve(ntgVar.d.a(npeVar)), npeVar.e, "https://mobile-vision-f250-uploads.googleapis.com/upload/blob").h().d(qbh.c(nsyVar), new nte(ntgVar)).a(noi.d).e(nsyVar).l(new ntf(nujVar, iIntValue));
    }
}
