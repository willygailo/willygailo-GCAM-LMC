package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class auu extends axg {
    public auu() {
        super(null);
    }

    @Override // defpackage.axg
    public final void a(int i) {
        axp.c(avo.a, "onCameraError called with no handler set: " + i);
    }

    @Override // defpackage.axg
    public final void b(RuntimeException runtimeException, String str, int i, int i2) {
        axp.d(avo.a, "onCameraException called with no handler set", runtimeException);
    }

    @Override // defpackage.axg
    public final void c(RuntimeException runtimeException) {
        axp.d(avo.a, "onDispatchThreadException called with no handler set", runtimeException);
    }
}
