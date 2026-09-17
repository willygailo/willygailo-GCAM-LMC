package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class isp implements gtu {
    final /* synthetic */ isq a;

    public isp(isq isqVar) {
        this.a = isqVar;
    }

    @Override // defpackage.gtu
    public final void a() {
        isq isqVar = this.a;
        if (isqVar.i != null) {
            isqVar.c();
        }
    }

    @Override // defpackage.gtu
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.gtu
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.gtu
    public final void d() {
        ie ieVar = this.a.i;
        if (ieVar != null) {
            ieVar.hide();
        }
    }
}
