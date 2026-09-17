package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class eep implements phh {
    final /* synthetic */ long a;
    final /* synthetic */ eer b;

    public eep(eer eerVar, long j) {
        this.b = eerVar;
        this.a = j;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) ((oug) ees.a.c().g(ovl.a, "FalconPostProcImgSaver")).h(th)).G(1106)).q("FD effect failed for shot %d", this.a);
        poy poyVar = this.b.i;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pbj pbjVar = (pbj) poyVar.b;
        pbj pbjVar2 = pbj.d;
        pbjVar.c = 3;
        pbjVar.a |= 2;
        this.b.r = true;
        this.b.e(this.a);
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            ouj oujVar = ees.a;
            ovd ovdVar = ovl.a;
        } else {
            ouj oujVar2 = ees.a;
            ovd ovdVar2 = ovl.a;
        }
    }
}
