package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import com.google.android.apps.camera.ui.views.CutoutBar;
import com.google.android.apps.camera.ui.views.FrontLensIndicatorOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final class hof implements hoj {
    public CutoutBar b;
    public boolean c;
    public boolean d;
    public final lar f;
    public final lco h;
    public final lco i;
    public FrontLensIndicatorOverlay j;
    public Runnable k;
    public final bqg l;
    private final hpb m;
    public jrl a = jrl.UNINITIALIZED;
    public final Object g = new Object();
    public final Handler e = mip.bU();

    public hof(bqg bqgVar, lda ldaVar, lco lcoVar, lar larVar, hpb hpbVar) {
        this.h = ldaVar;
        this.i = lcoVar;
        this.l = bqgVar;
        this.f = larVar;
        this.m = hpbVar;
    }

    @Override // defpackage.hoj
    public final void a(final jrl jrlVar) {
        synchronized (this.g) {
            if (this.j == null) {
                return;
            }
            if (this.c && this.d && !this.m.d()) {
                this.e.removeCallbacks(this.k);
                Runnable runnable = new Runnable() { // from class: hoe
                    @Override // java.lang.Runnable
                    public final void run() {
                        hof hofVar = this.a;
                        jrl jrlVar2 = jrlVar;
                        FrontLensIndicatorOverlay frontLensIndicatorOverlay = hofVar.j;
                        boolean zEquals = jrlVar2.equals(jrl.LONG_EXPOSURE);
                        dcw dcwVar = frontLensIndicatorOverlay.c;
                        if (dcwVar == null) {
                            ((oug) ((oug) FrontLensIndicatorOverlay.a.b()).G((char) 3458)).o("Not showing due to cutout info is null.");
                            return;
                        }
                        frontLensIndicatorOverlay.l = zEquals ? dcwVar.d : dcwVar.c;
                        frontLensIndicatorOverlay.j = dcwVar.a;
                        frontLensIndicatorOverlay.k = dcwVar.b;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, frontLensIndicatorOverlay.i);
                        valueAnimatorOfFloat.setDuration(60L);
                        valueAnimatorOfFloat.setInterpolator(frontLensIndicatorOverlay.g);
                        valueAnimatorOfFloat.addListener(new jon(frontLensIndicatorOverlay));
                        valueAnimatorOfFloat.addUpdateListener(new joo(frontLensIndicatorOverlay, 0));
                        valueAnimatorOfFloat.start();
                        frontLensIndicatorOverlay.invalidate();
                    }
                };
                this.k = runnable;
                this.e.postDelayed(runnable, 500L);
            } else {
                this.j.setVisibility(4);
            }
            this.c = false;
        }
    }

    public final void b(jrl jrlVar) {
        if (this.b == null) {
            return;
        }
        if (!this.d || !jrlVar.equals(jrl.LONG_EXPOSURE)) {
            this.b.setVisibility(4);
            return;
        }
        CutoutBar cutoutBar = this.b;
        dcw dcwVar = cutoutBar.b;
        if (dcwVar == null) {
            ((oug) ((oug) CutoutBar.a.b()).G((char) 3457)).o("Not showing due to cutout info is null.");
            return;
        }
        cutoutBar.e = dcwVar.d;
        cutoutBar.c = dcwVar.a;
        cutoutBar.d = dcwVar.b;
        cutoutBar.setVisibility(0);
        cutoutBar.invalidate();
    }
}
