package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cvs implements phh {
    final /* synthetic */ cvt a;
    private final /* synthetic */ int b;

    public cvs(cvt cvtVar, int i) {
        this.b = i;
        this.a = cvtVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                throw new lvz();
            default:
                throw new dlr("Failed to open any of the available camera", lju.CAMERA_ERROR_CODE_UNKNOWN, lwd.BACK, lwd.FRONT);
        }
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        switch (this.b) {
            case 0:
                cvt cvtVar = this.a;
                cvtVar.d((cxs) obj, cvtVar.a.m(), this.a.a.l(), 2);
                break;
            default:
                cvt cvtVar2 = this.a;
                cvtVar2.d((cxs) obj, cvtVar2.a.o(), this.a.a.n(), 3);
                break;
        }
    }
}
