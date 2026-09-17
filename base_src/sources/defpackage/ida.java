package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ida {
    public final ih a;
    public final iet c;
    public final ibm d;
    public boolean e;
    public View f;
    public View g;
    public iby i;
    private final int j;
    private AnimatorSet k;
    public final pih b = pih.f();
    public jrz h = jrz.PORTRAIT;

    public ida(ih ihVar, iet ietVar, ibm ibmVar) {
        this.a = ihVar;
        this.c = ietVar;
        this.d = ibmVar;
        this.j = ihVar.getResources().getInteger(R.integer.social_anim_duration_default);
    }

    public final Animator a() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.g, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(this.j);
        objectAnimatorOfFloat.addListener(mip.ew(new icy(this, 1)));
        return objectAnimatorOfFloat;
    }

    public final Animator b() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.g, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(this.j);
        objectAnimatorOfFloat.addListener(mip.ev(new icy(this, 0)));
        return objectAnimatorOfFloat;
    }

    final void c() {
        if (this.f.getWidth() == 0 || this.f.getHeight() == 0) {
            return;
        }
        d(oom.n(b(), a()));
        View view = this.f;
        jrz jrzVar = this.h;
        int iMin = Math.min(view.getWidth(), view.getHeight());
        int iMax = Math.max(view.getWidth(), view.getHeight());
        jrz.b(jrzVar);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (jrz.b(jrzVar)) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            layoutParams.height = iMax;
            layoutParams.width = iMin;
        }
        view.setLayoutParams(layoutParams);
        View view2 = this.f;
        jrz jrzVar2 = this.h;
        int iMax2 = Math.max(view2.getWidth(), view2.getHeight());
        int iMin2 = Math.min(view2.getWidth(), view2.getHeight());
        switch (jrzVar2.ordinal()) {
            case 1:
                iMax2 = 0;
                break;
            case 2:
                iMin2 = 0;
                break;
            default:
                iMax2 = 0;
                iMin2 = 0;
                break;
        }
        int i = jrzVar2.e;
        view2.setTranslationX(iMax2);
        view2.setTranslationY(iMin2);
        view2.setPivotX(0.0f);
        view2.setPivotY(0.0f);
        view2.setRotation(jrzVar2.e);
        this.d.e(this.h);
    }

    public final void d(List list) {
        if (this.e) {
            AnimatorSet animatorSet = this.k;
            if (animatorSet != null && animatorSet.isStarted()) {
                this.k.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.k = animatorSet2;
            animatorSet2.playSequentially((List<Animator>) list);
            this.k.start();
        }
    }
}
