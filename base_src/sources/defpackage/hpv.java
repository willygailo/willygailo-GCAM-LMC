package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hpv implements phh {
    final /* synthetic */ hsa a;
    final /* synthetic */ hsb b;
    final /* synthetic */ bwf c;

    public hpv(hsa hsaVar, hsb hsbVar, bwf bwfVar) {
        this.a = hsaVar;
        this.b = hsbVar;
        this.c = bwfVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) ((oug) hpw.a.b()).h(th)).G(2589)).r("Failed to get MediaStoreRecord for %s, skipping.", this.a);
        bwf bwfVar = this.c;
        bwfVar.getClass();
        bwfVar.a();
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        hsj hsjVar = (hsj) obj;
        if (hsjVar == null) {
            ((oug) ((oug) hpw.a.b()).G(2590)).r("Failed to get MediaStoreRecord for %s, skipping.", this.a);
            return;
        }
        hsb hsbVar = this.b;
        hsp hspVarH = this.a.h();
        hspVarH.getClass();
        hsbVar.p(hspVarH, hsjVar, this.a.j());
        this.a.h().getClass();
        this.a.a();
        bwf bwfVar = this.c;
        bwfVar.getClass();
        bwfVar.a();
    }
}
