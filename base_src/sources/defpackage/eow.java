package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
final class eow implements phh {
    final /* synthetic */ eox a;
    final /* synthetic */ eoy b;

    public eow(eoy eoyVar, eox eoxVar) {
        this.b = eoyVar;
        this.a = eoxVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        this.b.j(this.a.b, th.getMessage());
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            this.b.j(this.a.b, "Kepler Controller processing failed.");
            return;
        }
        epb epbVar = this.a.d;
        ovd ovdVar = ovl.a;
        epbVar.a.c();
        epbVar.b.g();
        ((iik) epbVar.c).u.o(Long.valueOf(SystemClock.elapsedRealtime()));
        this.a.b.a();
        this.b.a.remove(this.a.b);
    }
}
