package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class btj extends cal {
    private final qkg a;
    private final ljf b;
    private final fhv c;
    private boolean d;

    public btj(qkg qkgVar, lar larVar, fhv fhvVar, ljf ljfVar) {
        super(larVar);
        this.a = qkgVar;
        this.b = ljfVar;
        this.c = fhvVar;
        this.d = false;
    }

    @Override // defpackage.cal
    protected final void a() {
        if (d()) {
            return;
        }
        this.c.e(new bti(this));
    }

    public final boolean d() {
        if (this.d) {
            return true;
        }
        this.b.e("CameraActivityControllerInitializer#initialize");
        btt bttVar = (btt) this.a.get();
        this.b.h();
        this.d = bttVar.v();
        this.b.h();
        this.b.f();
        return this.d;
    }
}
