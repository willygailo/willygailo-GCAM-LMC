package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.Guideline;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.rewind.ui.RewindControllerView;
import com.google.android.apps.camera.rewind.ui.RewindPreview;
import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public final class hmy extends hnj {
    public static final ouj b = ouj.h("com/google/android/apps/camera/rewind/RewindControllerImpl");
    private static final Duration p = Duration.ofMillis(250);
    public final Context c;
    public final ojz d;
    public final WindowManager e;
    public final ifn f;
    public final jty g;
    public RewindPreview h;
    public RewindControllerView i;
    public final hme j;
    public final hmz k;
    public final jns l;
    public final Handler m = mip.bV(Looper.getMainLooper());
    public hni n;
    public mip o;
    private final BottomBarController q;
    private final BottomBarListener r;

    public hmy(Context context, ojz ojzVar, hme hmeVar, BottomBarController bottomBarController, jfn jfnVar, hmz hmzVar, jns jnsVar, WindowManager windowManager, ifn ifnVar, jty jtyVar) {
        this.c = context;
        this.d = ojzVar;
        this.j = hmeVar;
        this.q = bottomBarController;
        this.k = hmzVar;
        this.l = jnsVar;
        this.e = windowManager;
        this.f = ifnVar;
        this.g = jtyVar;
        this.r = new hmt(jfnVar);
    }

    public static void w(Guideline guideline, int i) {
        af afVar = (af) guideline.getLayoutParams();
        afVar.a = i;
        guideline.setLayoutParams(afVar);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.buf
    public final void ge() {
    }

    @Override // defpackage.buf
    public final void gf() {
        this.q.removeListener(this.r);
        this.n.b();
    }

    @Override // defpackage.buf
    public final void k() {
        this.q.addListener(this.r);
        this.n.a();
    }

    @Override // defpackage.buf
    public final void m() {
    }

    @Override // defpackage.buf
    public final void o() {
    }

    @Override // defpackage.buf
    public final boolean q() {
        return false;
    }

    public final AnimatorSet u(Animator.AnimatorListener... animatorListenerArr) {
        jbw jbwVar = (jbw) this.d.a();
        int width = jbwVar.b.b.getWidth();
        float height = jbwVar.b.b.getHeight();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(p.toMillis());
        animatorSet.setInterpolator(new DecelerateInterpolator());
        oom oomVarP = oom.p(ObjectAnimator.ofFloat(this.h, "translationX", -width, 0.0f), ObjectAnimator.ofFloat(this.i.findViewById(R.id.mcfly_export_hdr_shot), "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(this.i.findViewById(R.id.mcfly_thumbnail_scroller), "translationY", height, 0.0f), ObjectAnimator.ofFloat(this.i.findViewById(R.id.mcfly_selection_bar), "translationY", height, 0.0f));
        for (int i = 0; i <= 0; i++) {
            animatorSet.addListener(animatorListenerArr[i]);
        }
        animatorSet.playTogether(oomVarP);
        return animatorSet;
    }

    public final ep v(hnk hnkVar) {
        eo eoVar = new eo(this.c.getResources(), hnkVar.d());
        float dimension = this.c.getResources().getDimension(R.dimen.mcfly_current_image_corner_radius);
        if (eoVar.d != dimension) {
            if (ep.c(dimension)) {
                eoVar.b.setShader(eoVar.c);
            } else {
                eoVar.b.setShader(null);
            }
            eoVar.d = dimension;
            eoVar.invalidateSelf();
        }
        return eoVar;
    }

    @Override // defpackage.hnj
    public final void x(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.h = (RewindPreview) viewGroup;
        this.i = (RewindControllerView) viewGroup2;
        hmd hmdVar = new hmd(this, this.l.e, this.h, this.i);
        this.n = hmdVar;
        hmdVar.f();
    }

    @Override // defpackage.hnj
    public final void y(jrz jrzVar) {
        RewindPreview rewindPreview = this.h;
        if (rewindPreview != null) {
            rewindPreview.a = jrzVar;
            rewindPreview.a();
        }
        RewindControllerView rewindControllerView = this.i;
        if (rewindControllerView != null) {
            rewindControllerView.a = jrzVar;
            rewindControllerView.a();
        }
    }
}
