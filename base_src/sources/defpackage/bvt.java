package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bvt implements phh {
    final /* synthetic */ bvu a;

    public bvt(bvu bvuVar) {
        this.a = bvuVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        lbl lblVar = this.a.d;
        if (lblVar != null) {
            lblVar.b(th);
        }
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.a.c != null && bool != null && bool.booleanValue()) {
            this.a.c.f("Initialization completed.");
        }
        if (this.a.c == null || bool == null || bool.booleanValue()) {
            return;
        }
        this.a.c.h("Initialization failed! One of the tasks did not succeed.");
    }
}
