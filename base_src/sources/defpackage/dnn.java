package defpackage;

import com.google.android.apps.camera.jni.facebeautification.FaceBeautificationNative;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class dnn implements dot {
    public static final ouj a = ouj.h("com/google/android/apps/camera/facebeautification/CpuFaceBeautificationController");
    public final int b;
    public final Executor c;
    public final long d;
    private final gjw e;

    public dnn(lzi lziVar, gjw gjwVar, Executor executor, int i, ddf ddfVar) {
        this.e = gjwVar;
        this.c = executor;
        this.b = i;
        ddi ddiVar = dda.a;
        ddfVar.f();
        int i2 = (lziVar.b() || lziVar.c() || lziVar.d() || lziVar.e() || lziVar.f()) ? 0 : 1;
        this.d = FaceBeautificationNative.createHandle(i2, i, false);
    }

    @Override // defpackage.dot
    public final pht a(dos dosVar) {
        return !dosVar.b.b() ? plk.V(new dod(dosVar.a)) : this.e.a(new dnl(this, dosVar));
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.c.execute(new Runnable() { // from class: dnk
            @Override // java.lang.Runnable
            public final void run() {
                FaceBeautificationNative.releaseHandle(this.a.d);
            }
        });
    }
}
