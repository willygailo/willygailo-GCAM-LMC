package defpackage;

import android.opengl.Matrix;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;

/* JADX INFO: loaded from: classes.dex */
final class fdl extends Thread {
    final /* synthetic */ fdm a;

    public fdl(fdm fdmVar) {
        this.a = fdmVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (fcz.a) {
            if (!fcz.b.booleanValue()) {
                throw new IllegalStateException("State is not ready.");
            }
            LightCycleNative.UndoAddImage();
        }
        this.a.d.a();
        if (this.a.F.c() == 0) {
            this.a.d.d();
            if (this.a.G == 6) {
                float[] fArr = new float[16];
                Matrix.setIdentityM(fArr, 0);
                this.a.d.b(fArr);
            }
            fdm fdmVar = this.a;
            fdt fdtVar = fdmVar.h;
            fdtVar.g = false;
            fdtVar.h = false;
            fdtVar.f = 0;
            fdmVar.F.F.b = -1.0d;
            fdmVar.n = true;
            if (!fdmVar.w) {
                fdmVar.e.c(fdmVar.x);
            }
        }
        fdm fdmVar2 = this.a;
        if (fdmVar2.w) {
            fdmVar2.e.d(true, fdmVar2.F.n);
        }
    }
}
