package androidx.wear.widget;

import android.R;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.alx;
import defpackage.alz;
import defpackage.ama;
import defpackage.amb;
import defpackage.amd;
import defpackage.gl;

/* JADX INFO: loaded from: classes.dex */
public class CircledImageView extends View {
    int a;
    private final RectF b;
    private final Paint c;
    private final amb d;
    private final amd e;
    private final Drawable.Callback f;
    private ColorStateList g;
    private Drawable h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private int n;
    private Paint.Cap o;
    private float p;
    private float q;
    private boolean r;
    private float s;
    private float t;
    private Integer u;
    private Integer v;

    static {
        new ArgbEvaluator();
    }

    public CircledImageView(Context context) {
        this(context, null);
    }

    public CircledImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircledImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Rect();
        alz alzVar = new alz(this);
        this.f = alzVar;
        this.q = 1.0f;
        this.r = false;
        this.s = 1.0f;
        this.t = 0.0f;
        int i2 = ama.a;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, alx.a);
        gl.E(this, context, alx.a, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.h = drawable;
        if (drawable != null && drawable.getConstantState() != null) {
            Drawable drawableNewDrawable = this.h.getConstantState().newDrawable(context.getResources(), context.getTheme());
            this.h = drawableNewDrawable;
            this.h = drawableNewDrawable.mutate();
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(4);
        this.g = colorStateList;
        if (colorStateList == null) {
            this.g = ColorStateList.valueOf(context.getColor(R.color.darker_gray));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.i = dimension;
        this.k = typedArrayObtainStyledAttributes.getDimension(7, dimension);
        this.n = typedArrayObtainStyledAttributes.getColor(2, -16777216);
        this.o = Paint.Cap.values()[typedArrayObtainStyledAttributes.getInt(1, 0)];
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        this.p = dimension2;
        if (dimension2 > 0.0f) {
            this.m += dimension2 / 2.0f;
        }
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(25, 0.0f);
        if (dimension3 > 0.0f) {
            this.m += dimension3;
        }
        this.s = typedArrayObtainStyledAttributes.getFloat(23, 0.0f);
        this.t = typedArrayObtainStyledAttributes.getFloat(24, 0.0f);
        if (typedArrayObtainStyledAttributes.hasValue(26)) {
            this.u = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(26, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            this.v = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(19, 0));
        }
        float fraction = typedArrayObtainStyledAttributes.getFraction(6, 1, 1, 0.0f);
        this.j = fraction;
        this.l = typedArrayObtainStyledAttributes.getFraction(8, 1, 1, fraction);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.b = new RectF();
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        this.d = new amb(dimension4, a(), this.p);
        amd amdVar = new amd();
        this.e = amdVar;
        amdVar.setCallback(alzVar);
        setWillNotDraw(false);
        d();
    }

    private final void d() {
        int colorForState = this.g.getColorForState(getDrawableState(), this.g.getDefaultColor());
        if (colorForState != this.a) {
            this.a = colorForState;
            invalidate();
        }
    }

    public final float a() {
        float fMax = this.i;
        if (fMax <= 0.0f && this.j > 0.0f) {
            fMax = Math.max(getMeasuredHeight(), getMeasuredWidth()) * this.j;
        }
        return fMax - this.m;
    }

    public final float b() {
        float fMax = this.k;
        if (fMax <= 0.0f && this.l > 0.0f) {
            fMax = Math.max(getMeasuredHeight(), getMeasuredWidth()) * this.l;
        }
        return fMax - this.m;
    }

    public final void c() {
        amd amdVar = this.e;
        if (amdVar != null) {
            amdVar.a.cancel();
        }
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        d();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        float fB = this.r ? b() : a();
        getAlpha();
        if (this.p > 0.0f) {
            this.b.set(paddingLeft, paddingTop, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            RectF rectF = this.b;
            rectF.set(rectF.centerX() - fB, this.b.centerY() - fB, this.b.centerX() + fB, this.b.centerY() + fB);
            this.c.setColor(this.n);
            Paint paint = this.c;
            paint.setAlpha(Math.round(paint.getAlpha() * getAlpha()));
            this.c.setStyle(Paint.Style.STROKE);
            this.c.setStrokeWidth(this.p);
            this.c.setStrokeCap(this.o);
            canvas.drawArc(this.b, -90.0f, this.q * 360.0f, false, this.c);
        }
        this.b.set(paddingLeft, paddingTop, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.c.setColor(this.a);
        Paint paint2 = this.c;
        paint2.setAlpha(Math.round(paint2.getAlpha() * getAlpha()));
        this.c.setStyle(Paint.Style.FILL);
        canvas.drawCircle(this.b.centerX(), this.b.centerY(), fB, this.c);
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setAlpha(Math.round(getAlpha() * 255.0f));
            Integer num = this.u;
            if (num != null) {
                this.h.setTint(num.intValue());
            }
            this.h.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable = this.h;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.h.getIntrinsicHeight();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f = this.s;
            if (f <= 0.0f) {
                f = 1.0f;
            }
            float f2 = intrinsicWidth;
            float f3 = intrinsicHeight;
            float fMin = Math.min(1.0f, Math.min(f2 != 0.0f ? (measuredWidth * f) / f2 : 1.0f, f3 != 0.0f ? (f * measuredHeight) / f3 : 1.0f));
            int iRound = Math.round(f2 * fMin);
            int iRound2 = Math.round(fMin * f3);
            int iRound3 = ((measuredWidth - iRound) / 2) + Math.round(this.t * iRound);
            int i5 = (measuredHeight - iRound2) / 2;
            this.h.setBounds(iRound3, i5, iRound + iRound3, iRound2 + i5);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        float fA = a();
        float f = this.p;
        amb ambVar = this.d;
        float f2 = ambVar.a;
        float f3 = ambVar.b;
        float f4 = fA + f + (f2 * 0.0f);
        float f5 = f4 + f4;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? (int) Math.min(f5, size) : (int) f5;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? (int) Math.min(f5, size2) : (int) f5;
        }
        Integer num = this.v;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    size = size2;
                    break;
                case 2:
                    size2 = size;
                    break;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected final boolean onSetAlpha(int i) {
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        this.d.a(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        c();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        c();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (i != getPaddingLeft() || i2 != getPaddingTop() || i3 != getPaddingRight() || i4 != getPaddingBottom()) {
            this.d.a(i, i2, getWidth() - i3, getHeight() - i4);
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        super.setPressed(z);
        if (z != this.r) {
            this.r = z;
            amb ambVar = this.d;
            ambVar.c = z ? b() : a();
            ambVar.b();
            invalidate();
        }
    }
}
