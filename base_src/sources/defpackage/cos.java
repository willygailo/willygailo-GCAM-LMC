package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cos {
    public static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/onecamcorder/OneCamcorderCallbacksSetup");
    public final lap b;
    public final lbu c;
    private final pih d;
    private final gmy e;
    private final nvb f;

    public cos(nvb nvbVar, gmy gmyVar, lap lapVar, pih pihVar, lbu lbuVar, byte[] bArr, byte[] bArr2) {
        this.f = nvbVar;
        this.e = gmyVar;
        this.b = lapVar;
        this.d = pihVar;
        this.c = lbuVar;
    }

    public final void a() {
        plk.W(this.e.a());
        this.d.o(bxg.g);
        this.b.c(bug.f);
        this.f.k(cms.CAPTURE_SESSION).c(new lie() { // from class: cor
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                cos cosVar = this.a;
                lbx.a(cosVar.c, cosVar.b);
            }
        });
    }
}
