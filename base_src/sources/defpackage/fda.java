package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class fda implements fet {
    final /* synthetic */ fdj a;

    public fda(fdj fdjVar) {
        this.a = fdjVar;
    }

    @Override // defpackage.fet
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        fdo fdoVar = this.a.F;
        fdoVar.a = ((Float) obj).floatValue();
        fdoVar.a();
        dyi dyiVar = this.a.t;
        if (dyiVar != null) {
            synchronized (dyiVar.k) {
                if (!dyiVar.h) {
                    dyiVar.i.post(dyiVar.l);
                    dyiVar.h = true;
                }
            }
        }
    }
}
