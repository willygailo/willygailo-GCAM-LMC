package android.support.v7.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.gl;
import defpackage.jq;
import defpackage.ju;
import defpackage.nt;
import defpackage.oj;
import defpackage.rh;
import defpackage.ri;
import defpackage.rn;
import defpackage.sd;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private static final Property e = new rh(Float.class);
    private static final int[] f = {R.attr.state_checked};
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private final TextPaint I;
    private ColorStateList J;
    private Layout K;
    private Layout L;
    private TransformationMethod M;
    private final nt N;
    private final Rect O;
    public CharSequence a;
    public CharSequence b;
    public float c;
    ObjectAnimator d;
    private Drawable g;
    private ColorStateList h;
    private PorterDuff.Mode i;
    private boolean j;
    private boolean k;
    private Drawable l;
    private ColorStateList m;
    private PorterDuff.Mode n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private float x;
    private float y;
    private VelocityTracker z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.GoogleCameraEngR18F1.R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        Typeface typeface;
        super(context, attributeSet, i);
        this.h = null;
        this.i = null;
        this.j = false;
        this.k = false;
        this.m = null;
        this.n = null;
        this.o = false;
        this.p = false;
        this.z = VelocityTracker.obtain();
        this.O = new Rect();
        ri.d(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        rn rnVarQ = rn.q(context, attributeSet, jq.u, i);
        gl.E(this, context, jq.u, attributeSet, rnVarQ.b, i, 0);
        Drawable drawableH = rnVarQ.h(2);
        this.g = drawableH;
        if (drawableH != null) {
            drawableH.setCallback(this);
        }
        Drawable drawableH2 = rnVarQ.h(11);
        this.l = drawableH2;
        if (drawableH2 != null) {
            drawableH2.setCallback(this);
        }
        this.a = rnVarQ.l(0);
        this.b = rnVarQ.l(1);
        this.u = rnVarQ.o(3, true);
        this.q = rnVarQ.b(8, 0);
        this.r = rnVarQ.b(5, 0);
        this.s = rnVarQ.b(6, 0);
        this.t = rnVarQ.o(4, false);
        ColorStateList colorStateListG = rnVarQ.g(9);
        if (colorStateListG != null) {
            this.h = colorStateListG;
            this.j = true;
        }
        PorterDuff.Mode modeA = oj.a(rnVarQ.c(10, -1), null);
        if (this.i != modeA) {
            this.i = modeA;
            this.k = true;
        }
        boolean z = this.j;
        if ((z || this.k) && (drawable = this.g) != null && (z || this.k)) {
            Drawable drawableMutate = drawable.mutate();
            this.g = drawableMutate;
            if (this.j) {
                drawableMutate.setTintList(this.h);
            }
            if (this.k) {
                this.g.setTintMode(this.i);
            }
            if (this.g.isStateful()) {
                this.g.setState(getDrawableState());
            }
        }
        ColorStateList colorStateListG2 = rnVarQ.g(12);
        if (colorStateListG2 != null) {
            this.m = colorStateListG2;
            this.o = true;
        }
        PorterDuff.Mode modeA2 = oj.a(rnVarQ.c(13, -1), null);
        if (this.n != modeA2) {
            this.n = modeA2;
            this.p = true;
        }
        boolean z2 = this.o;
        if ((z2 || this.p) && (drawable2 = this.l) != null && (z2 || this.p)) {
            Drawable drawableMutate2 = drawable2.mutate();
            this.l = drawableMutate2;
            if (this.o) {
                drawableMutate2.setTintList(this.m);
            }
            if (this.p) {
                this.l.setTintMode(this.n);
            }
            if (this.l.isStateful()) {
                this.l.setState(getDrawableState());
            }
        }
        int iF = rnVarQ.f(7, 0);
        if (iF != 0) {
            rn rnVarJ = rn.j(context, iF, jq.v);
            ColorStateList colorStateListG3 = rnVarJ.g(3);
            if (colorStateListG3 != null) {
                this.J = colorStateListG3;
            } else {
                this.J = getTextColors();
            }
            int iB = rnVarJ.b(0, 0);
            if (iB != 0) {
                float f2 = iB;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int iC = rnVarJ.c(1, -1);
            int iC2 = rnVarJ.c(2, -1);
            switch (iC) {
                case 1:
                    typeface = Typeface.SANS_SERIF;
                    break;
                case 2:
                    typeface = Typeface.SERIF;
                    break;
                case 3:
                    typeface = Typeface.MONOSPACE;
                    break;
                default:
                    typeface = null;
                    break;
            }
            if (iC2 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(iC2) : Typeface.create(typeface, iC2);
                c(typefaceDefaultFromStyle);
                int style = ((typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0) ^ (-1)) & iC2;
                textPaint.setFakeBoldText(1 == (style & 1));
                textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                c(typeface);
            }
            if (rnVarJ.o(17, false)) {
                this.M = new ju(getContext());
            } else {
                this.M = null;
            }
            rnVarJ.n();
        }
        nt ntVar = new nt(this);
        this.N = ntVar;
        ntVar.b(attributeSet, i);
        rnVarQ.n();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.w = viewConfiguration.getScaledTouchSlop();
        this.A = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private final int e() {
        return (int) (((sd.b(this) ? 1.0f - this.c : this.c) * f()) + 0.5f);
    }

    private final int f() {
        Drawable drawable = this.l;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.O;
        drawable.getPadding(rect);
        Drawable drawable2 = this.g;
        Rect rectB = drawable2 != null ? oj.b(drawable2) : oj.a;
        return ((((this.B - this.D) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private final Layout g(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.M;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.I;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private final boolean h() {
        return this.c > 0.5f;
    }

    public final void a() {
        CharSequence string = this.b;
        if (string == null) {
            string = getResources().getString(com.google.android.GoogleCameraEngR18F1.R.string.abc_capital_off);
        }
        gl.P(this, string);
    }

    public final void b() {
        CharSequence string = this.a;
        if (string == null) {
            string = getResources().getString(com.google.android.GoogleCameraEngR18F1.R.string.abc_capital_on);
        }
        gl.P(this, string);
    }

    public final void c(Typeface typeface) {
        if ((this.I.getTypeface() == null || this.I.getTypeface().equals(typeface)) && (this.I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void d(float f2) {
        this.c = f2;
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.O;
        int i3 = this.E;
        int i4 = this.F;
        int i5 = this.G;
        int i6 = this.H;
        int iE = e() + i3;
        Drawable drawable = this.g;
        Rect rectB = drawable != null ? oj.b(drawable) : oj.a;
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            iE += rect.left;
            if (rectB != null) {
                if (rectB.left > rect.left) {
                    i3 += rectB.left - rect.left;
                }
                i = rectB.top > rect.top ? (rectB.top - rect.top) + i4 : i4;
                if (rectB.right > rect.right) {
                    i5 -= rectB.right - rect.right;
                }
                if (rectB.bottom > rect.bottom) {
                    i2 = i6 - (rectB.bottom - rect.bottom);
                }
                this.l.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.l.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.g;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i7 = iE - rect.left;
            int i8 = iE + this.D + rect.right;
            this.g.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            drawable2.setHotspot(f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.g;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.l;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!sd.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.s : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (sd.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.s : compoundPaddingRight;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.d.end();
        this.d = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, f);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.O;
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.F;
        int i2 = this.H;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.g;
        if (drawable != null) {
            if (!this.t || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = oj.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = h() ? this.K : this.L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.J;
            if (colorStateList != null) {
                this.I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int paddingTop;
        int height;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.g != null) {
            Rect rect = this.O;
            Drawable drawable = this.l;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = oj.b(this.g);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (sd.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.B + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.B) + iMax + iMax2;
        }
        switch (getGravity() & 112) {
            case 16:
                int paddingTop2 = getPaddingTop();
                int height2 = getHeight();
                int paddingBottom = getPaddingBottom();
                int i5 = this.C;
                paddingTop = (((paddingTop2 + height2) - paddingBottom) / 2) - (i5 / 2);
                height = paddingTop + i5;
                break;
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.C;
                break;
            default:
                paddingTop = getPaddingTop();
                height = this.C + paddingTop;
                break;
        }
        this.E = paddingLeft;
        this.F = paddingTop;
        this.H = height;
        this.G = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int i3;
        if (this.u) {
            if (this.K == null) {
                this.K = g(this.a);
            }
            if (this.L == null) {
                this.L = g(this.b);
            }
        }
        Rect rect = this.O;
        Drawable drawable = this.g;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.g.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.g.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.u) {
            int iMax = Math.max(this.K.getWidth(), this.L.getWidth());
            int i4 = this.q;
            i3 = iMax + i4 + i4;
        } else {
            i3 = 0;
        }
        this.D = Math.max(i3, intrinsicWidth);
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.l.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.g;
        if (drawable3 != null) {
            Rect rectB = oj.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        int i5 = this.r;
        int i6 = this.D;
        int iMax4 = Math.max(i5, i6 + i6 + iMax2 + iMax3);
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.B = iMax4;
        this.C = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.a : this.b;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zH;
        this.z.addMovement(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (isEnabled() && this.g != null) {
                    int iE = e();
                    this.g.getPadding(this.O);
                    int i = this.F;
                    int i2 = this.w;
                    int i3 = i - i2;
                    int i4 = (this.E + iE) - i2;
                    int i5 = this.D;
                    int i6 = this.O.left;
                    int i7 = this.O.right;
                    int i8 = this.w;
                    int i9 = i5 + i4 + i6 + i7 + i8;
                    int i10 = this.H + i8;
                    if (x > i4 && x < i9 && y > i3 && y < i10) {
                        this.v = 1;
                        this.x = x;
                        this.y = y;
                    }
                }
                break;
            case 1:
            case 3:
                if (this.v == 2) {
                    this.v = 0;
                    boolean z = motionEvent.getAction() == 1 && isEnabled();
                    boolean zIsChecked = isChecked();
                    if (z) {
                        this.z.computeCurrentVelocity(1000);
                        float xVelocity = this.z.getXVelocity();
                        if (Math.abs(xVelocity) <= this.A) {
                            zH = h();
                        } else if (sd.b(this)) {
                            if (xVelocity < 0.0f) {
                                zH = true;
                            } else {
                                zH = false;
                            }
                        } else if (xVelocity > 0.0f) {
                            zH = true;
                        } else {
                            zH = false;
                        }
                    } else {
                        zH = zIsChecked;
                    }
                    if (zH != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(zH);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.v = 0;
                this.z.clear();
                break;
            case 2:
                switch (this.v) {
                    case 1:
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x2 - this.x) > this.w || Math.abs(y2 - this.y) > this.w) {
                            this.v = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.x = x2;
                            this.y = y2;
                            return true;
                        }
                        break;
                    case 2:
                        float x3 = motionEvent.getX();
                        int iF = f();
                        float f2 = x3 - this.x;
                        float f3 = iF != 0 ? f2 / iF : f2 > 0.0f ? 1.0f : -1.0f;
                        if (sd.b(this)) {
                            f3 = -f3;
                        }
                        float f4 = this.c;
                        float f5 = f3 + f4;
                        float f6 = f5 >= 0.0f ? f5 > 1.0f ? 1.0f : f5 : 0.0f;
                        if (f6 != f4) {
                            this.x = x3;
                            d(f6);
                        }
                        return true;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            b();
        } else {
            a();
        }
        if (getWindowToken() == null || !gl.V(this)) {
            ObjectAnimator objectAnimator = this.d;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            d(true == zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) e, true == zIsChecked ? 1.0f : 0.0f);
        this.d = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(90L);
        this.d.setAutoCancel(true);
        this.d.start();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.g || drawable == this.l;
    }
}
