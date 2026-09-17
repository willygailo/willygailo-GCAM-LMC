package androidx.wear.widget.drawer;

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
import defpackage.alx;
import defpackage.amf;

/* JADX INFO: loaded from: classes.dex */
public class PageIndicatorView extends View implements ala {
    public int a;
    public int b;
    public boolean c;
    private final Paint d;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private int h;
    private float i;
    private float j;
    private int k;
    private int l;
    private boolean m;
    private int n;
    private float o;
    private float p;
    private float q;
    private int r;
    private int s;
    private int t;
    private int u;

    public PageIndicatorView(Context context) {
        this(context, null);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, alx.b, i, R.style.WsPageIndicatorViewStyle);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(25, 0);
        this.i = typedArrayObtainStyledAttributes.getDimension(19, 0.0f);
        this.j = typedArrayObtainStyledAttributes.getDimension(20, 0.0f);
        this.k = typedArrayObtainStyledAttributes.getColor(13, 0);
        this.l = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.a = typedArrayObtainStyledAttributes.getInt(16, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(17, 0);
        this.n = typedArrayObtainStyledAttributes.getInt(15, 0);
        this.m = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.o = typedArrayObtainStyledAttributes.getDimension(22, 0.0f);
        this.p = typedArrayObtainStyledAttributes.getDimension(23, 0.0f);
        this.q = typedArrayObtainStyledAttributes.getDimension(24, 0.0f);
        this.r = typedArrayObtainStyledAttributes.getColor(21, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(this.k);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setColor(this.l);
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.e = paint3;
        Paint paint4 = new Paint(1);
        this.g = paint4;
        this.u = 0;
        if (isInEditMode()) {
            this.s = 5;
            this.t = 2;
            this.m = false;
        }
        if (this.m) {
            this.c = false;
            animate().alpha(0.0f).setStartDelay(0L).setDuration(this.b).start();
        } else {
            animate().cancel();
            setAlpha(1.0f);
        }
        d(paint, paint3, this.i, this.q, this.k, this.r);
        d(paint2, paint4, this.j, this.q, this.l, this.r);
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
        if (this.u != i) {
            this.u = i;
            if (this.m && i == 0) {
                if (this.c) {
                    c(this.a);
                    return;
                }
                this.c = true;
                animate().cancel();
                animate().alpha(1.0f).setStartDelay(0L).setDuration(this.n).setListener(new amf(this)).start();
            }
        }
    }

    @Override // defpackage.ala
    public final void b(int i, float f) {
        if (this.m && this.u == 1) {
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
                animate().alpha(1.0f).setStartDelay(0L).setDuration(this.n).start();
            }
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.s > 1) {
            int paddingLeft = getPaddingLeft();
            int i = this.h;
            int height = getHeight();
            canvas.save();
            canvas.translate(paddingLeft + (i / 2.0f), height / 2.0f);
            for (int i2 = 0; i2 < this.s; i2++) {
                if (i2 == this.t) {
                    canvas.drawCircle(this.o, this.p, this.j + this.q, this.g);
                    canvas.drawCircle(0.0f, 0.0f, this.j, this.f);
                } else {
                    canvas.drawCircle(this.o, this.p, this.i + this.q, this.e);
                    canvas.drawCircle(0.0f, 0.0f, this.i, this.d);
                }
                canvas.translate(this.h, 0.0f);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iCeil;
        int size = View.MeasureSpec.getMode(i) == 1073741824 ? View.MeasureSpec.getSize(i) : (this.s * this.h) + getPaddingLeft() + getPaddingRight();
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iCeil = View.MeasureSpec.getSize(i2);
        } else {
            float f = this.i;
            float f2 = this.q;
            float fMax = Math.max(f + f2, this.j + f2);
            iCeil = ((int) (((int) Math.ceil(fMax + fMax)) + this.p)) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(resolveSizeAndState(size, i, 0), resolveSizeAndState(iCeil, i2, 0));
    }
}
