package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class euq implements axf {
    final /* synthetic */ eur a;

    public euq(eur eurVar) {
        this.a = eurVar;
    }

    private final void d() {
        eur eurVar = this.a;
        if (eurVar.w) {
            return;
        }
        eurVar.w = true;
        if (eurVar.z) {
            eurVar.u("CameraActivityController: Fatal error during onPause!");
        } else {
            eurVar.d.h();
        }
    }

    @Override // defpackage.axf
    public final void a(int i) {
        ((oug) ((oug) eur.a.b()).G(1510)).p("Camera error callback. error=%d", i);
    }

    @Override // defpackage.axf
    public final void b(RuntimeException runtimeException, String str, int i, int i2) {
        ((oug) ((oug) ((oug) eur.a.b()).h(runtimeException)).G((char) 1511)).o("Camera Exception");
        this.a.s.S(5, str, runtimeException, i, i2, 0, oom.l(), oom.l(), lju.CAMERA_ERROR_CODE_UNKNOWN, false);
        d();
    }

    @Override // defpackage.axf
    public final void c(RuntimeException runtimeException) {
        ((oug) ((oug) ((oug) eur.a.b()).h(runtimeException)).G((char) 1512)).o("DispatchThread Exception");
        this.a.s.S(6, null, runtimeException, -1, -1, 0, oom.l(), oom.l(), lju.CAMERA_ERROR_CODE_UNKNOWN, false);
        d();
    }
}
