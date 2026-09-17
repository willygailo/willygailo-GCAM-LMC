package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cds implements phh {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ cdu c;

    public cds(cdu cduVar, String str, String str2) {
        this.c = cduVar;
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) ((oug) cdu.a.c()).h(th)).G((char) 269)).o("Retrieving user opt in failed.");
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.d = ((kiu) obj).a();
        cdu cduVar = this.c;
        if (!cduVar.d) {
            cduVar.c();
            return;
        }
        if (!cby.f(cduVar.f, cduVar.c.getClass())) {
            ((oug) ((oug) cdu.a.b()).G((char) 270)).o("Fails to schedule beholder Ttl Service.");
            buk.a(this.c.f, new cdt());
            return;
        }
        this.c.a(this.a, 351853807);
        int iIntValue = this.c.b.intValue();
        cdu cduVar2 = this.c;
        if (iIntValue < cduVar2.e) {
            cduVar2.a(this.b, 10281993);
        }
    }
}
