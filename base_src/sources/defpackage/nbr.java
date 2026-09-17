package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class nbr extends nbp implements mxo {
    public static final /* synthetic */ int a = 0;

    static {
        ope.M("Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart", "Cold startup class loading", "Cold startup from process creation", "Cold startup interactive before onDraw from process creation", "Cold startup interactive from process creation");
    }

    public nbr(mxm mxmVar, final pyn pynVar, qkg qkgVar, final nox noxVar, byte[] bArr) {
        new ConcurrentHashMap();
        mxmVar.a(pgr.INSTANCE, pynVar, qkgVar);
        final byte[] bArr2 = null;
        obr.au(new ojz(pynVar, bArr2) { // from class: nbq
            public final /* synthetic */ pyn a;

            @Override // defpackage.ojz
            public final Object a() {
                nox noxVar2 = this.b;
                pyn pynVar2 = this.a;
                int i = nbr.a;
                return noxVar2.a(((nbo) pynVar2.get()).b);
            }
        });
    }

    @Override // defpackage.nbp, defpackage.mxo
    public final /* synthetic */ void t() {
    }
}
