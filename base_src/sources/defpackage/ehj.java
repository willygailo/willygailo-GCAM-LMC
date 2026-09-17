package defpackage;

import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ehj {
    private static final ouj p = ouj.h("com/google/android/apps/camera/imax/ImaxFrameServer");
    public final ljf a;
    public final lis b;
    public final ejj c;
    public final ejm d;
    public final lar e;
    public final bta g;
    public lnc h;
    public Surface i;
    public lnx j;
    public lmv k;
    public ehi l;
    public lmu m;
    public final lqv o;
    public final AtomicBoolean n = new AtomicBoolean(false);
    public final lce f = new lce(false);

    public ehj(lqv lqvVar, lis lisVar, ljf ljfVar, ejj ejjVar, ejm ejmVar, lar larVar, bta btaVar) {
        this.o = lqvVar;
        this.a = ljfVar;
        this.c = ejjVar;
        this.d = ejmVar;
        this.e = larVar;
        this.b = lisVar.a("ImaxFrameServer");
        this.g = btaVar;
    }

    public final void a(boolean z) {
        if (z) {
            try {
                lnc lncVar = this.h;
                lncVar.getClass();
                lncVar.o(true);
                return;
            } catch (Exception e) {
                ((oug) ((oug) ((oug) p.b()).h(e)).G((char) 1163)).o("Panorama failed to lock 3A.");
                return;
            }
        }
        try {
            lnc lncVar2 = this.h;
            lncVar2.getClass();
            lncVar2.l(true, true, true);
        } catch (Exception e2) {
            ((oug) ((oug) ((oug) p.b()).h(e2)).G((char) 1161)).o("Panorama failed to unlock 3A.");
        }
    }

    public final boolean b() {
        return ((Boolean) this.f.d).booleanValue();
    }
}
