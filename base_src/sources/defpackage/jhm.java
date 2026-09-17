package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jhm {
    public final View a;
    private final Context b;
    private final int c;
    private final int d;
    private final Rect e = new Rect();
    private final boolean f;

    public jhm(Context context, View view, boolean z) {
        this.b = context;
        this.a = view;
        this.c = context.getResources().getInteger(R.integer.hide_notification_dot_animation_delay);
        this.d = context.getResources().getInteger(R.integer.hide_notification_dot_animation_duration);
        this.f = z;
    }

    public final void a(boolean z) {
        Drawable foreground = this.a.getForeground();
        if (!z || foreground == null) {
            this.a.setForeground(null);
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(foreground, "alpha", 255, 0);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jhk
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.a.invalidate();
            }
        });
        objectAnimatorOfInt.setDuration(this.d);
        objectAnimatorOfInt.setStartDelay(this.c);
        objectAnimatorOfInt.addListener(new jhl(this));
        objectAnimatorOfInt.start();
    }

    public final void b() {
        Drawable drawable;
        Rect rect = new Rect(this.a.getLeft(), this.a.getTop(), this.a.getRight(), this.a.getBottom());
        Drawable drawable2 = this.b.getDrawable(R.drawable.notification_dot);
        if (this.f) {
            drawable = drawable2;
        } else {
            LayerDrawable layerDrawable = (LayerDrawable) this.b.getDrawable(R.drawable.notification_dot);
            layerDrawable.setDrawableByLayerId(R.id.notification_dot_foreground, this.b.getDrawable(R.drawable.notification_dot_foreground_legacy));
            drawable = layerDrawable;
        }
        int intrinsicWidth = this.a.getResources().getConfiguration().getLayoutDirection() == 1 ? 0 : drawable.getIntrinsicWidth() / 2;
        this.a.setForeground(new InsetDrawable(drawable, ((rect.width() - drawable.getIntrinsicWidth()) - this.e.right) + intrinsicWidth, this.e.top, this.e.right - intrinsicWidth, (rect.height() - drawable.getIntrinsicHeight()) - this.e.top));
    }

    public final void c(int i, int i2, int i3) {
        this.e.set(i, i2, i3, 0);
    }
}
