package android.support.wearable.view.drawer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.ala;
import defpackage.sf;
import defpackage.tp;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class PageIndicatorView extends View implements ala {
    public int a;
    public int b;
    public boolean c;
    private int d;
    private float e;
    private float f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    private float k;
    private float l;
    private float m;
    private int n;
    private int o;
    private int p;
    private int q;
    private final Paint r;
    private final Paint s;
    private final Paint t;
    private final Paint u;

    public PageIndicatorView(Context context) {
        this(context, null);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, sf.f, i, R.style.PageIndicatorViewStyle);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(12, 0);
        this.e = typedArrayObtainStyledAttributes.getDimension(6, 0.0f);
        this.f = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getColor(0, 0);
        this.h = typedArrayObtainStyledAttributes.getColor(1, 0);
        this.a = typedArrayObtainStyledAttributes.getInt(3, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.j = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.i = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.k = typedArrayObtainStyledAttributes.getDimension(9, 0.0f);
        this.l = typedArrayObtainStyledAttributes.getDimension(10, 0.0f);
        this.m = typedArrayObtainStyledAttributes.getDimension(11, 0.0f);
        this.n = typedArrayObtainStyledAttributes.getColor(8, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.r = paint;
        paint.setColor(this.g);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.t = paint2;
        paint2.setColor(this.h);
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.s = paint3;
        Paint paint4 = new Paint(1);
        this.u = paint4;
        this.q = 0;
        if (isInEditMode()) {
            this.o = 5;
            this.p = 2;
            this.i = false;
        }
        if (this.i) {
            this.c = false;
            animate().alpha(0.0f).setStartDelay(0L).setDuration(this.b).start();
        } else {
            animate().cancel();
            setAlpha(1.0f);
        }
        d(paint, paint3, this.e, this.m, this.g, this.n);
        d(paint2, paint4, this.f, this.m, this.h, this.n);
    }

    private final void c(long j) {
        this.c = false;
        animate().cancel();
        animate().alpha(0.0f).setStartDelay(j).setDuration(this.b).start();
    }

    private static final void d(Paint paint, Paint paint2, float f, float f2, int i, int i2) {
        float f3 = f + f2;
        paint2.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{i2, i2, 0}, new float[]{0.0f, f / f3, 1.0f}, Shader.TileMode.CLAMP));
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // defpackage.ala
    public final void a(int i) {
        if (this.q != i) {
            this.q = i;
            if (this.i && i == 0) {
                if (this.c) {
                    c(this.a);
                    return;
                }
                this.c = true;
                animate().cancel();
                animate().alpha(1.0f).setStartDelay(0L).setDuration(this.j).setListener(new tp(this)).start();
            }
        }
    }

    @Override // defpackage.ala
    public final void b(int i, float f) {
        if (this.i && this.q == 1) {
            if (f == 0.0f) {
                if (this.c) {
                    c(0L);
                }
            } else {
                if (this.c) {
                    return;
                }
                this.c = true;
                animate().cancel();
                animate().alpha(1.0f).setStartDelay(0L).setDuration(this.j).start();
            }
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.o > 1) {
            int paddingLeft = getPaddingLeft();
            int i = this.d;
            int height = getHeight();
            canvas.save();
            canvas.translate(paddingLeft + (i / 2.0f), height / 2.0f);
            for (int i2 = 0; i2 < this.o; i2++) {
                if (i2 == this.p) {
                    canvas.drawCircle(this.k, this.l, this.f + this.m, this.u);
                    canvas.drawCircle(0.0f, 0.0f, this.f, this.t);
                } else {
                    canvas.drawCircle(this.k, this.l, this.e + this.m, this.s);
                    canvas.drawCircle(0.0f, 0.0f, this.e, this.r);
                }
                canvas.translate(this.d, 0.0f);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iCeil;
        int size = View.MeasureSpec.getMode(i) == 1073741824 ? View.MeasureSpec.getSize(i) : (this.o * this.d) + getPaddingLeft() + getPaddingRight();
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iCeil = View.MeasureSpec.getSize(i2);
        } else {
            float f = this.e;
            float f2 = this.m;
            float fMax = Math.max(f + f2, this.f + f2);
            iCeil = ((int) (((int) Math.ceil(fMax + fMax)) + this.l)) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(resolveSizeAndState(size, i, 0), resolveSizeAndState(iCeil, i2, 0));
    }
}
