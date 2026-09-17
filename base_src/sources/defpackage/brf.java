package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class brf implements oiu {
    final /* synthetic */ brg a;

    public brf(brg brgVar) {
        this.a = brgVar;
    }

    @Override // defpackage.oiu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        lic licVar = (lic) obj;
        brg brgVar = this.a;
        if (licVar == null) {
            licVar = lic.CLOCKWISE_0;
        }
        return Integer.valueOf(lic.b(brg.c(brgVar.a, licVar.e, brgVar.b, brgVar.c)).e);
    }
}
