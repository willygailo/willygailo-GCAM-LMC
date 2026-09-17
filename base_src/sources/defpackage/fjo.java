package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fjo implements emr {
    final /* synthetic */ emr a;
    final /* synthetic */ fjs b;

    public fjo(emr emrVar, fjs fjsVar) {
        this.a = emrVar;
        this.b = fjsVar;
    }

    @Override // defpackage.emr
    public final Object a(emq emqVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objA = this.a.a(emqVar);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        int i = emqVar.c;
        this.b.al(i < 15 ? new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}[i] : 1, objA != null, (int) jCurrentTimeMillis2);
        return objA;
    }
}
