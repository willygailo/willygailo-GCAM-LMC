package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes.dex */
public class ep extends Drawable {
    final Bitmap a;
    public final BitmapShader c;
    public float d;
    private int f;
    private final int k;
    private final int l;
    private final int g = R.styleable.AppCompatTheme_windowActionModeOverlay;
    public final Paint b = new Paint(3);
    private final Matrix h = new Matrix();
    final Rect e = new Rect();
    private final RectF i = new RectF();
    private boolean j = true;

    public ep(Resources resources, Bitmap bitmap) {
        BitmapShader bitmapShader;
        this.f = 160;
        if (resources != null) {
            this.f = resources.getDisplayMetrics().densityDpi;
        }
        this.a = bitmap;
        if (bitmap != null) {
            this.k = bitmap.getScaledWidth(this.f);
            this.l = bitmap.getScaledHeight(this.f);
            bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        } else {
            this.l = -1;
            this.k = -1;
            bitmapShader = null;
        }
        this.c = bitmapShader;
    }

    public static boolean c(float f) {
        return f > 0.05f;
    }

    public void a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw null;
    }

    final void b() {
        if (this.j) {
            a(this.g, this.k, this.l, getBounds(), this.e);
            this.i.set(this.e);
            if (this.c != null) {
                this.h.setTranslate(this.i.left, this.i.top);
                this.h.preScale(this.i.width() / this.a.getWidth(), this.i.height() / this.a.getHeight());
                this.c.setLocalMatrix(this.h);
                this.b.setShader(this.c);
            }
            this.j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return;
        }
        b();
        if (this.b.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.e, this.b);
            return;
        }
        RectF rectF = this.i;
        float f = this.d;
        canvas.drawRoundRect(rectF, f, f, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        return (this.g != 119 || (bitmap = this.a) == null || bitmap.hasAlpha() || this.b.getAlpha() < 255 || c(this.d)) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.b.getAlpha()) {
            this.b.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.b.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.b.setFilterBitmap(z);
        invalidateSelf();
    }
}
