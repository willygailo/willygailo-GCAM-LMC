package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class fnt implements imr {
    private static final ouj c = ouj.h("com/google/android/apps/camera/microvideo/LongShotTorchController");
    public final imt a;
    public final lap b = new lap();
    private final lnc d;
    private final ljf e;
    private final imw f;
    private final AtomicBoolean g;
    private final lvp h;
    private final lzi i;
    private final gxm j;
    private final AtomicBoolean k;
    private final ddf l;
    private final ghx m;

    public fnt(Executor executor, lnc lncVar, ghx ghxVar, imt imtVar, ims imsVar, final AtomicBoolean atomicBoolean, lvp lvpVar, lzi lziVar, gxm gxmVar, AtomicBoolean atomicBoolean2, ljf ljfVar, ddf ddfVar) {
        this.d = lncVar;
        this.m = ghxVar;
        this.e = ljfVar;
        this.a = imtVar;
        this.g = atomicBoolean;
        this.h = lvpVar;
        this.i = lziVar;
        this.j = gxmVar;
        this.k = atomicBoolean2;
        this.l = ddfVar;
        imv imvVarA = imw.a();
        imvVarA.c(executor);
        imvVarA.a = "LongShotTorch";
        imvVarA.f(imsVar);
        final int i = 1;
        imvVarA.d(new Runnable() { // from class: fnr
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        atomicBoolean.set(false);
                        break;
                    default:
                        atomicBoolean.set(true);
                        break;
                }
            }
        });
        final int i2 = 0;
        imvVarA.e(new Runnable() { // from class: fnr
            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        atomicBoolean.set(false);
                        break;
                    default:
                        atomicBoolean.set(true);
                        break;
                }
            }
        });
        this.f = imvVarA.a();
    }

    final fns a(hsa hsaVar, boolean z) {
        ojc ojcVarI;
        if (hsaVar.i() != hsr.LONG_SHOT || !z || this.g.get() || this.m.k() != lwd.BACK) {
            return new fns(oih.a, bug.m, this.d, this.j, this.h, this.k, this.l);
        }
        this.e.e("LongShotTorchController#turnOnTorch");
        try {
            if (gxm.b() && this.l.k(ddu.j) && this.m.k().equals(lwd.BACK)) {
                if (this.i.g()) {
                    this.d.g(mip.be(kdc.b, Integer.valueOf(R.styleable.AppCompatTheme_windowMinWidthMinor)));
                } else {
                    this.d.g(mip.be(kdc.c, false));
                }
            }
            lng lngVarC = this.d.c();
            oih oihVar = oih.a;
            try {
                lmp lmpVarA = lngVarC.a();
                ((lrs) lmpVarA).c = 1;
                ((lrs) lmpVarA).e = 2;
                long j = ((lmw) lngVarC.b(((lrs) lmpVarA).d()).get()).b;
                this.k.set(true);
                if (j != -1) {
                    ojcVarI = ojc.i(Long.valueOf(j + TimeUnit.MILLISECONDS.toNanos(250L)));
                } else {
                    ((oug) ((oug) c.c()).G(1779)).o("Invalid converged 3A timestamp for Long Shot.");
                    ojcVarI = oihVar;
                }
            } catch (InterruptedException | CancellationException | ExecutionException | llv e) {
                ((oug) ((oug) ((oug) c.b()).h(e)).G((char) 1780)).o("Couldn't set the torch state for Long Shot");
            }
            this.e.f();
            return new fns(ojcVarI, lngVarC, this.d, this.j, this.h, this.k, this.l);
        } catch (InterruptedException | llv e2) {
            return new fns(oih.a, bug.n, this.d, this.j, this.h, this.k, this.l);
        }
    }

    @Override // defpackage.imr
    public final void c(ims imsVar) {
        this.f.c(imsVar);
    }
}
