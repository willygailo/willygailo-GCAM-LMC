package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bdr extends bmb {
    public bby a;

    public bdr(long j) {
        super(j);
    }

    @Override // defpackage.bmb
    protected final /* bridge */ /* synthetic */ int a(Object obj) {
        bcl bclVar = (bcl) obj;
        if (bclVar == null) {
            return 1;
        }
        return bclVar.a();
    }

    public final /* bridge */ /* synthetic */ bcl b(azp azpVar) {
        return (bcl) super.h(azpVar);
    }

    @Override // defpackage.bmb
    protected final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        bcl bclVar = (bcl) obj2;
        bby bbyVar = this.a;
        if (bbyVar == null || bclVar == null) {
            return;
        }
        bbyVar.c.a(bclVar, true);
    }

    public final /* bridge */ /* synthetic */ void d(azp azpVar, bcl bclVar) {
    }
}
