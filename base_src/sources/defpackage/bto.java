package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class bto implements axf {
    final /* synthetic */ btp a;

    public bto(btp btpVar) {
        this.a = btpVar;
    }

    @Override // defpackage.axf
    public final void a(int i) {
        ((oug) ((oug) btp.a.c()).G('Q')).o("cameraExceptionCallback.onCameraError");
        Iterator it = this.a.f.iterator();
        while (it.hasNext()) {
            ((axg) it.next()).a(i);
        }
    }

    @Override // defpackage.axf
    public final void b(RuntimeException runtimeException, String str, int i, int i2) {
        ((oug) ((oug) btp.a.c()).G('R')).o("cameraExceptionCallback.onCameraException");
        Iterator it = this.a.f.iterator();
        while (it.hasNext()) {
            ((axg) it.next()).b(runtimeException, str, i, i2);
        }
    }

    @Override // defpackage.axf
    public final void c(RuntimeException runtimeException) {
        ((oug) ((oug) btp.a.c()).G('S')).o("cameraExceptionCallback.onDispatchThreadException");
        Iterator it = this.a.f.iterator();
        while (it.hasNext()) {
            ((axg) it.next()).c(runtimeException);
        }
    }
}
