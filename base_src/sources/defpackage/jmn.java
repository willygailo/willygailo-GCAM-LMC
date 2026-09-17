package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class jmn extends ViewGroup implements AutoCloseable {
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private boolean G;
    private int H;
    private int I;
    private final boolean J;
    public final int[] a;
    public final Paint b;
    public final Paint c;
    public final List d;
    public final AtomicInteger e;
    public PopupWindow f;
    public boolean g;
    public Runnable h;
    public View i;
    public int j;
    public View k;
    public Rect l;
    public int m;
    public int n;
    public int o;
    public final Object p;
    public long q;
    public long r;
    public long s;
    public List t;
    public final List u;
    public final DisplayManager.DisplayListener v;
    private final Path w;
    private final RectF x;
    private final int y;
    private final int z;

    public jmn(Context context, boolean z) {
        super(context);
        this.d = Collections.synchronizedList(new ArrayList());
        this.e = new AtomicInteger(Integer.MIN_VALUE);
        this.p = new Object();
        this.u = new ArrayList();
        this.v = new jmm(this);
        this.J = z;
        this.a = new int[2];
        this.w = new Path();
        this.x = new RectF();
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        this.z = context.getResources().getDimensionPixelSize(z ? R.dimen.ui_tooltip_horizontal_container_padding : R.dimen.ui_tooltip_horizontal_container_padding_legacy);
        this.y = context.getResources().getDimensionPixelSize(true != z ? R.dimen.ui_tooltip_vertical_container_padding_legacy : R.dimen.ui_tooltip_vertical_container_padding);
        context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_vertical_animation_movement);
        this.A = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_vertical_animation_padding);
        this.B = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_margin);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_shadow_offset);
        this.C = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_shadow_radius);
        this.D = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_arrow_length);
        this.E = context.getResources().getDimensionPixelSize(true != z ? R.dimen.ui_tooltip_arrow_base_width_legacy : R.dimen.ui_tooltip_arrow_base_width);
        this.F = context.getResources().getDimensionPixelSize(true != z ? R.dimen.ui_tooltip_container_corner_radius_legacy : R.dimen.ui_tooltip_container_corner_radius);
        int iE = z ? obr.e(this, R.attr.colorTertiaryContainer) : aas.a(context, R.color.tooltip_background_color);
        int iA = aas.a(context, R.color.tooltip_container_shadow);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iE);
        paint.setAntiAlias(true);
        float f = dimensionPixelSize;
        paint.setShadowLayer(dimensionPixelSize2, f, f, iA);
        paint2.set(paint);
        if (z) {
            paint2.setPathEffect(new CornerPathEffect(getResources().getDimensionPixelSize(R.dimen.ui_tooltip_arrow_radius)));
        }
        this.g = true;
        this.q = 0L;
    }

    private static int c(int i, int i2, int i3) {
        return Math.min(i3, Math.max(i2, i));
    }

    private final Point d() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    private final void e(Canvas canvas) {
        getLocationOnScreen(this.a);
        canvas.save();
        if (jlu.s(this.j)) {
            canvas.translate(this.B - this.a[0], 0.0f);
        } else {
            int i = this.j;
            if (i == 5 || i == 6) {
                canvas.translate(0.0f, this.B - this.a[1]);
            }
        }
        canvas.drawPath(this.w, this.c);
        canvas.restore();
    }

    public final int a() {
        View view = this.k;
        if (view == null || view.getDisplay() == null) {
            return this.e.get();
        }
        return this.e.getAndSet(jrz.a(this.k.getDisplay(), this.k.getContext()).e);
    }

    public final void b(boolean z) {
        if (!z) {
            setVisibility(4);
        }
        clearAnimation();
        PopupWindow popupWindow = this.f;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else {
            setVisibility(4);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b(false);
        setOnClickListener(null);
        removeAllViews();
        this.d.clear();
        PopupWindow popupWindow = this.f;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f = null;
        this.i = null;
        this.k = null;
        setVisibility(8);
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.u.clear();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        canvas.save();
        int i = this.j;
        if (i == 2 || i == 6) {
            e(canvas);
        }
        RectF rectF = this.x;
        float f = this.F;
        canvas.drawRoundRect(rectF, f, f, this.b);
        int i2 = this.j;
        if (i2 == 1 || i2 == 5) {
            e(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int iHeight;
        int iWidth;
        int iHeight2;
        int i6;
        int iC;
        int iC2;
        int iWidth2;
        int iHeight3;
        View view = this.i;
        if (view != null) {
            int i7 = this.z;
            int i8 = this.j;
            int i9 = (i8 == 6 ? this.D : 0) + i7;
            int i10 = this.y;
            view.layout(i9, (i8 == 2 ? this.D : 0) + i10, ((i3 - i) - i7) - (i8 == 5 ? this.D : 0), ((i4 - i2) - i10) - (i8 == 1 ? this.D : 0));
        }
        Point pointD = d();
        int i11 = pointD.x;
        int i12 = pointD.y;
        switch (this.j) {
            case 1:
                int i13 = this.B;
                i5 = i11 - (i13 + i13);
                iHeight = this.l.top - this.B;
                break;
            case 2:
                int i14 = this.B;
                i5 = i11 - (i14 + i14);
                iHeight = ((i12 - this.l.top) - this.l.height()) - this.B;
                break;
            case 3:
            case 4:
            default:
                throw new IllegalStateException();
            case 5:
                int i15 = this.l.left;
                int i16 = this.B;
                i5 = i15 - i16;
                iHeight = i12 - (i16 + i16);
                break;
            case 6:
                int i17 = this.l.left;
                int iWidth3 = this.l.width();
                int i18 = this.B;
                i5 = ((i11 - i17) - iWidth3) - i18;
                iHeight = i12 - (i18 + i18);
                break;
        }
        measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iHeight, Integer.MIN_VALUE));
        int iWidth4 = this.l.left;
        int i19 = this.l.top;
        PopupWindow popupWindow = this.f;
        if (popupWindow == null) {
            iC2 = 0;
            iC = 0;
        } else {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int i20 = this.j;
            if (i20 == 1) {
                iHeight2 = ((-measuredHeight) - this.o) - this.A;
                iWidth = 0;
            } else if (i20 == 2) {
                iHeight2 = this.l.height() + this.o + this.A;
                iWidth = 0;
            } else if (i20 == 5) {
                iWidth = (-measuredWidth) - this.n;
                iHeight2 = (this.l.height() - measuredHeight) / 2;
            } else if (i20 == 6) {
                iWidth = this.l.width() + this.n;
                iHeight2 = (this.l.height() - measuredHeight) / 2;
            } else {
                iWidth = 0;
                iHeight2 = 0;
            }
            int iF = gl.f(this);
            if (jlu.s(this.j)) {
                i6 = i19 + iHeight2;
                switch (this.m) {
                    case 1:
                        if (iF == 1) {
                            iWidth4 = (iWidth4 + this.l.width()) - measuredWidth;
                        }
                        break;
                    case 2:
                        iWidth4 += (this.l.width() - measuredWidth) / 2;
                        break;
                    case 3:
                        if (iF != 1) {
                            iWidth4 = (iWidth4 + this.l.width()) - measuredWidth;
                        }
                        break;
                    default:
                        throw new IllegalStateException();
                }
            } else {
                iWidth4 += iWidth;
                i6 = i19 + iHeight2;
            }
            int i21 = this.B;
            iC = c(iWidth4, i21, (i11 - i21) - measuredWidth);
            int i22 = this.B;
            iC2 = c(i6, i22, (i12 - i22) - measuredHeight);
            popupWindow.update(iC, iC2, measuredWidth, measuredHeight, true);
        }
        switch (this.m) {
            case 1:
                int i23 = this.E;
                int i24 = this.B;
                iWidth2 = (i23 / 2) + i24 + i24;
                iHeight3 = 0;
                break;
            case 2:
                iWidth2 = this.l.width() / 2;
                iHeight3 = this.l.height() / 2;
                break;
            case 3:
                int iWidth5 = this.l.width();
                int i25 = this.E;
                int i26 = this.B;
                iWidth2 = (iWidth5 - (i25 / 2)) - (i26 + i26);
                iHeight3 = 0;
                break;
            default:
                iWidth2 = 0;
                iHeight3 = 0;
                break;
        }
        if (gl.f(this) == 1) {
            iWidth2 = this.l.width() - iWidth2;
        }
        int i27 = iWidth2 + this.l.left;
        int i28 = iHeight3 + this.l.top;
        if (jsa.d(this)) {
            int[] iArrE = jsa.e(getRootView());
            int i29 = this.H;
            int i30 = iArrE[0];
            if (i29 + iC != i30) {
                int i31 = this.I;
                int i32 = iArrE[1];
                if (i31 + iC2 != i32) {
                    this.H = i30;
                    this.I = i32;
                }
            }
        }
        int i33 = i27 + this.H;
        int i34 = i28 + this.I;
        int dimensionPixelSize = this.J ? getResources().getDimensionPixelSize(R.dimen.ui_tooltip_left_right_shift) : 0;
        this.w.reset();
        int i35 = this.j;
        if (i35 == 1) {
            this.w.moveTo((i33 - this.B) - (this.E / 2), this.x.bottom);
            this.w.rLineTo(this.E, 0.0f);
            this.w.rLineTo((-this.E) / 2, this.D);
            this.w.rLineTo((-this.E) / 2, -this.D);
            this.w.close();
            return;
        }
        if (i35 == 2) {
            this.w.moveTo((i33 - this.B) + (this.E / 2), this.x.top);
            this.w.rLineTo(-this.E, 0.0f);
            this.w.rLineTo(this.E / 2, -this.D);
            this.w.rLineTo(this.E / 2, this.D);
            this.w.close();
            return;
        }
        if (i35 == 5) {
            this.w.moveTo(this.x.right - dimensionPixelSize, (i34 - this.B) - (this.E / 2));
            this.w.rLineTo(0.0f, this.E);
            this.w.rLineTo(this.D, (-this.E) / 2);
            this.w.rLineTo(-this.D, (-this.E) / 2);
            this.w.close();
            return;
        }
        if (i35 == 6) {
            this.w.moveTo(this.x.left + dimensionPixelSize, (i34 - this.B) + (this.E / 2));
            this.w.rLineTo(0.0f, -this.E);
            this.w.rLineTo(-this.D, this.E / 2);
            this.w.rLineTo(this.D, this.E / 2);
            this.w.close();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        if (!this.G && (i3 = this.j) != 0) {
            this.j = jlu.r(i3, this);
            this.G = true;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.z;
        int i5 = this.C;
        int i6 = (size - (i4 + i4)) - i5;
        int i7 = this.y;
        int i8 = (size2 - (i7 + i7)) - i5;
        if (jlu.s(this.j)) {
            i8 -= this.D;
        } else {
            int i9 = this.j;
            if (i9 == 5 || i9 == 6) {
                i6 -= this.D;
            }
        }
        int iMin = Math.min(d().x, i6);
        View view = this.i;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i8, 0));
            if (this.i.getMeasuredHeight() > i8) {
                this.i.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE));
            }
        }
        View view2 = this.i;
        if (view2 != null) {
            int measuredWidth = view2.getMeasuredWidth();
            int i10 = this.z;
            int i11 = measuredWidth + i10 + i10;
            int measuredHeight = this.i.getMeasuredHeight();
            int i12 = this.y;
            int i13 = measuredHeight + i12 + i12;
            RectF rectF = this.x;
            int i14 = this.j;
            rectF.set(i14 == 6 ? this.D : 0.0f, i14 == 2 ? this.D : 0.0f, i11 + (i14 == 6 ? this.D : 0), i13 + (i14 == 2 ? this.D : 0));
        }
        int iWidth = ((int) this.x.width()) + this.C;
        int iHeight = ((int) this.x.height()) + this.C;
        if (jlu.s(this.j)) {
            iHeight += this.D;
        } else {
            int i15 = this.j;
            if (i15 == 5 || i15 == 6) {
                iWidth += this.D;
            }
        }
        setMeasuredDimension(iWidth, iHeight);
    }
}
