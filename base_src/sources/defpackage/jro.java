package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class jro {
    public int a;
    private final Interpolator b;
    private final AnimatorSet c = new AnimatorSet();
    private AnimatorSet.Builder d;

    private jro(int i, Interpolator interpolator) {
        this.a = i;
        this.b = interpolator;
    }

    public static jro b(int i, Interpolator interpolator) {
        return new jro(i, interpolator);
    }

    public final AnimatorSet a() {
        return this.c.clone();
    }

    public final void c(Object obj, String str, float f, float f2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, str, f, f2);
        objectAnimatorOfFloat.setDuration(this.a);
        objectAnimatorOfFloat.setInterpolator(this.b);
        AnimatorSet.Builder builder = this.d;
        if (builder == null) {
            this.d = this.c.play(objectAnimatorOfFloat);
        } else {
            builder.with(objectAnimatorOfFloat);
        }
    }

    public final void d(Object obj, String str, int i, int i2) {
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(obj, str, i, i2);
        objectAnimatorOfArgb.setDuration(this.a);
        objectAnimatorOfArgb.setInterpolator(this.b);
        AnimatorSet.Builder builder = this.d;
        if (builder == null) {
            this.d = this.c.play(objectAnimatorOfArgb);
        } else {
            builder.with(objectAnimatorOfArgb);
        }
    }
}
