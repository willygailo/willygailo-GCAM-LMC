package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class amd extends Drawable {
    private static final Property b = new amc(Integer.class);
    private static final TimeInterpolator c = aly.a;
    public final ObjectAnimator a;
    private final RectF d = new RectF();
    private final Paint e;

    public amd() {
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, (Property<amd, Integer>) b, 0, 10000);
        this.a = objectAnimatorOfInt;
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.setRepeatMode(1);
        objectAnimatorOfInt.setDuration(3000L);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
    }

    private static float a(float f, float f2, float f3) {
        if (f != f2) {
            return (f3 - f) / (f2 - f);
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        this.d.set(getBounds());
        this.d.inset(0.0f, 0.0f);
        this.e.setStrokeWidth(0.0f);
        this.e.setColor(0);
        int level = getLevel();
        float f = (level - ((level / 2000) * 2000)) / 2000.0f;
        float f2 = 54.0f * f;
        float fMax = Math.max(1.0f, f < 0.5f ? c.getInterpolation(a(0.0f, 0.5f, f)) * 306.0f : (1.0f - c.getInterpolation(a(0.5f, 1.0f, f))) * 306.0f);
        float f3 = level * 1.0E-4f;
        canvas.rotate((((f3 + f3) * 360.0f) - 90.0f) + f2, this.d.centerX(), this.d.centerY());
        canvas.drawArc(this.d, f < 0.5f ? 0.0f : 306.0f - fMax, fMax, false, this.e);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
