package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hhc implements lht {
    final /* synthetic */ hhe a;

    public hhc(hhe hheVar) {
        this.a = hheVar;
    }

    @Override // defpackage.lht
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        hhn hhnVar = (hhn) obj;
        hhe hheVar = this.a;
        synchronized (hheVar.d) {
            hheVar.e = false;
            lce lceVar = hheVar.a;
            lceVar.fB(Long.valueOf(((Long) lceVar.d).longValue() - hheVar.b));
            hheVar.c();
        }
        hhnVar.e(this);
    }
}
