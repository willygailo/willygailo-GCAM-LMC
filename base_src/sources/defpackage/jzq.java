package defpackage;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import com.google.android.apps.camera.whitebalance.ManualWhiteBalanceUi;

/* JADX INFO: loaded from: classes2.dex */
public class jzq extends jzi {
    public static final ouj f = ouj.h("com/google/android/apps/camera/whitebalance/ManualWhiteBalanceStatechart");
    private final lar a;
    public final ManualWhiteBalanceUi g;
    public final ObjectAnimator h;
    public final lda i = new lce(true);
    public final Runnable j = new Runnable() { // from class: jzj
        @Override // java.lang.Runnable
        public final void run() {
            this.a.gt(true);
        }
    };

    public jzq(ManualWhiteBalanceUi manualWhiteBalanceUi, lar larVar) {
        this.g = manualWhiteBalanceUi;
        this.a = larVar;
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(manualWhiteBalanceUi.getContext(), R.animator.fade_in);
        objectAnimator.setTarget(manualWhiteBalanceUi);
        objectAnimator.addListener(new jzl(this, manualWhiteBalanceUi));
        this.h = objectAnimator;
    }

    final void k() {
        this.g.removeCallbacks(this.j);
    }

    public final void l(boolean z, boolean z2) {
        this.a.c(new jzk(this, z2, z, 1));
    }

    public final void m() {
        this.i.fB(true);
    }

    public final void n(boolean z, boolean z2) {
        this.a.c(new jzk(this, z2, z, 0));
    }
}
