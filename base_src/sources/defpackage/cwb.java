package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cwb implements phh {
    final /* synthetic */ lwd a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ cwc d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    public cwb(cwc cwcVar, lwd lwdVar, int i, int i2, int i3, int i4) {
        this.d = cwcVar;
        this.a = lwdVar;
        this.e = i;
        this.f = i2;
        this.b = i3;
        this.c = i4;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        throw new dlr("Failed to open any of the available camera", lju.CAMERA_ERROR_CODE_UNKNOWN, this.a);
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final ie ieVarA;
        cxs cxsVar = (cxs) obj;
        final cwc cwcVar = this.d;
        final lwd lwdVar = this.a;
        final int i = this.e;
        final int i2 = this.f;
        final int iF = akf.f(cxsVar, this.b, this.c, cwcVar.e.r());
        cwcVar.c.b(cxsVar.toString());
        if (iF == 4) {
            ieVarA = cwcVar.b.c(i, i2, lwdVar);
        } else {
            ieVarA = iF == 3 ? cwcVar.b.a(i, i2, lwdVar) : cwcVar.b.b(i, i2, lwdVar);
        }
        cwcVar.a.execute(new Runnable() { // from class: cwa
            @Override // java.lang.Runnable
            public final void run() {
                cwc cwcVar2 = cwcVar;
                ie ieVar = ieVarA;
                lwd lwdVar2 = lwdVar;
                int i3 = i;
                int i4 = i2;
                int i5 = iF;
                if (cwcVar2.d.b(ieVar)) {
                    cwcVar2.b.d(lwdVar2, i3, i4, i5, 2);
                }
            }
        });
    }
}
