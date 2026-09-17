package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.camera.bottombar.R;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class td extends View {
    public Layout a;
    public ColorStateList b;
    public CharSequence c;
    public float d;
    public float e;
    public float f;
    public float g;
    private final TextPaint h;
    private final float i;
    private final float j;
    private int k;
    private int l;
    private float m;
    private int n;
    private int o;

    public td(Context context) {
        super(context, null, 0, 0);
        this.k = 8388659;
        this.d = 1.0f;
        this.e = 0.0f;
        this.n = Integer.MAX_VALUE;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        float f2 = displayMetrics.scaledDensity;
        this.f = 10.0f * f2;
        this.g = f2 * 60.0f;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, sf.a, 0, 0);
        this.c = typedArrayObtainStyledAttributes.getText(4);
        this.f = typedArrayObtainStyledAttributes.getDimension(10, this.f);
        this.g = typedArrayObtainStyledAttributes.getDimension(9, this.g);
        this.b = typedArrayObtainStyledAttributes.getColorStateList(2);
        this.n = typedArrayObtainStyledAttributes.getInt(5, 2);
        if (this.b != null) {
            e();
        }
        textPaint.setTextSize(this.g);
        d(typedArrayObtainStyledAttributes.getString(8), typedArrayObtainStyledAttributes.getInt(0, -1), typedArrayObtainStyledAttributes.getInt(1, -1));
        this.k = typedArrayObtainStyledAttributes.getInt(3, this.k);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, (int) this.j);
        this.i = typedArrayObtainStyledAttributes.getFloat(7, this.i);
        typedArrayObtainStyledAttributes.recycle();
        if (this.c == null) {
            this.c = "";
        }
    }

    private final Layout f(int i, int i2, Layout.Alignment alignment) {
        if (i2 <= 0 || i <= 0) {
            return null;
        }
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        float f = this.g;
        this.m = f;
        this.h.setTextSize(f);
        StaticLayout staticLayout = new StaticLayout(this.c, this.h, paddingLeft, alignment, this.d, this.e, true);
        boolean z = staticLayout.getLineCount() > this.n;
        boolean z2 = staticLayout.getLineTop(staticLayout.getLineCount()) > paddingTop;
        boolean z3 = this.h.getTextSize() > this.f;
        if (z || z2) {
            while (true) {
                if ((!z && !z2) || !z3) {
                    break;
                }
                float f2 = this.m - 1.0f;
                this.m = f2;
                this.h.setTextSize(f2);
                staticLayout = new StaticLayout(this.c, this.h, paddingLeft, alignment, this.d, this.e, true);
                z2 = staticLayout.getLineTop(staticLayout.getLineCount()) > paddingTop;
                z = staticLayout.getLineCount() > this.n;
                z3 = this.h.getTextSize() > this.f;
            }
        }
        this.o = Math.min(this.n, staticLayout.getLineCount());
        return staticLayout;
    }

    public final void a(int i) {
        if (this.k != i) {
            this.k = i;
            invalidate();
        }
    }

    public final void b(int i) {
        if (this.n != i) {
            this.n = i;
            this.a = null;
            requestLayout();
            invalidate();
        }
    }

    public final void c(Typeface typeface) {
        if (Objects.equals(this.h.getTypeface(), typeface)) {
            return;
        }
        this.h.setTypeface(typeface);
        if (this.a != null) {
            requestLayout();
            invalidate();
        }
    }

    public final void d(String str, int i, int i2) {
        Typeface typefaceCreate;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i2);
            if (typefaceCreate != null) {
                c(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        switch (i) {
            case 1:
                typefaceCreate = Typeface.SANS_SERIF;
                break;
            case 2:
                typefaceCreate = Typeface.SERIF;
                break;
            case 3:
                typefaceCreate = Typeface.MONOSPACE;
                break;
        }
        if (i2 <= 0) {
            this.h.setFakeBoldText(false);
            this.h.setTextSkewX(0.0f);
            c(typefaceCreate);
        } else {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typefaceCreate, i2);
            c(typefaceDefaultFromStyle);
            int style = ((typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0) ^ (-1)) & i2;
            this.h.setFakeBoldText(1 == (style & 1));
            this.h.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.b;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        e();
    }

    public final void e() {
        int colorForState = this.b.getColorForState(getDrawableState(), 0);
        if (colorForState != this.l) {
            this.l = colorForState;
            invalidate();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.a != null) {
            canvas.save();
            this.h.setColor(this.l);
            this.h.drawableState = getDrawableState();
            float paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int height = getHeight() - (getPaddingTop() + getPaddingBottom());
            int lineTop = this.a.getLineTop(this.o);
            switch (this.k & 112) {
                case 16:
                    i = (height - lineTop) / 2;
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    i = 0;
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                    i = height - lineTop;
                    break;
                default:
                    i = 0;
                    break;
            }
            canvas.translate(paddingLeft, paddingTop + i);
            canvas.clipRect(0, 0, getWidth() - getPaddingRight(), this.a.getLineTop(this.o));
            this.a.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        Layout.Alignment alignment;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iMin = mode == 1073741824 ? size : -1;
        int iMin2 = mode2 == 1073741824 ? size2 : -1;
        if (iMin == -1) {
            this.h.setTextSize(this.g);
            iMin = (int) Math.ceil(Layout.getDesiredWidth(this.c, this.h));
            this.h.setTextSize(this.m);
        }
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, size);
        }
        switch (getTextAlignment()) {
            case 1:
                switch (this.k & 8388615) {
                    case 1:
                        alignment = Layout.Alignment.ALIGN_CENTER;
                        break;
                    case 3:
                    case 8388611:
                    default:
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        break;
                    case 5:
                    case 8388613:
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        break;
                }
                break;
            case 2:
                alignment = Layout.Alignment.ALIGN_NORMAL;
                break;
            case 3:
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                break;
            case 4:
                alignment = Layout.Alignment.ALIGN_CENTER;
                break;
            default:
                alignment = Layout.Alignment.ALIGN_NORMAL;
                break;
        }
        if (iMin2 == -1) {
            iMin2 = mode2 == Integer.MIN_VALUE ? size2 : Integer.MAX_VALUE;
        }
        Layout layout = this.a;
        if (layout == null) {
            this.a = f(iMin, iMin2, alignment);
        } else {
            int width = layout.getWidth();
            int height = this.a.getHeight();
            if (width != iMin || height != iMin2) {
                this.a = f(iMin, iMin2, alignment);
            }
        }
        Layout layout2 = this.a;
        if (layout2 == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (mode2 != 1073741824) {
            iMin2 = layout2.getLineTop(layout2.getLineCount());
        }
        if (mode2 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, size2);
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        this.a = null;
        requestLayout();
        invalidate();
    }
}
