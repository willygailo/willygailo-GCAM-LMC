package defpackage;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.SurfaceView;

/* JADX INFO: loaded from: classes.dex */
final class fab implements phh {
    final /* synthetic */ fah a;

    public fab(fah fahVar) {
        this.a = fahVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) ((oug) fah.b.b()).h(th)).G((char) 1601)).o("Error capturing image");
        synchronized (this.a) {
            this.a.q.a(th);
        }
    }

    @Override // defpackage.phh
    public final void b(Object obj) {
        this.a.i.a();
        fah fahVar = this.a;
        final ezn eznVar = fahVar.r;
        final int iA = fahVar.h.c().a();
        final boolean zJ = this.a.l.j();
        plk.af(plk.aa(new pgj() { // from class: ezl
            @Override // defpackage.pgj
            public final pht a() {
                Bitmap bitmapA;
                ezn eznVar2 = eznVar;
                int i = iA;
                boolean z = zJ;
                bvk bvkVar = (bvk) eznVar2.b;
                jng jngVar = bvkVar.r;
                int iD = fcy.d(bvkVar.w);
                jng jngVar2 = bvkVar.r;
                synchronized (jngVar2.b) {
                    jngVar2.c.e("getScreenshot");
                    jna jnaVar = jngVar2.d;
                    jnaVar.getClass();
                    SurfaceView surfaceView = jnaVar.b;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((iD == 0 || i % 180 == 0) ? surfaceView.getWidth() : surfaceView.getHeight()) / 4, ((iD == 0 || i % 180 == 0) ? surfaceView.getHeight() : surfaceView.getWidth()) / 4, Bitmap.Config.ARGB_8888);
                    PixelCopy.request(surfaceView, bitmapCreateBitmap, jnd.b, mip.bV(Looper.getMainLooper()));
                    jngVar2.c.g("getScreenshot#flipAndRotate");
                    bitmapA = jng.a(bitmapCreateBitmap, i, z);
                    jngVar2.c.f();
                }
                bitmapA.getClass();
                return plk.V(bitmapA);
            }
        }, eznVar.d), new ezm(eznVar), mip.bS());
        this.a.t.a();
    }
}
