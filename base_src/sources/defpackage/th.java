package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class th extends View {
    private static final double f = Math.sqrt(2.0d);
    public final ShapeDrawable a;
    public ColorStateList b;
    public Drawable c;
    public int d;
    public int e;
    private RippleDrawable g;
    private final Interpolator h;

    public th(Context context) {
        super(context, null, 0, 0);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.a = shapeDrawable;
        shapeDrawable.getPaint().setColor(-3355444);
        super.setBackgroundDrawable(shapeDrawable);
        setOutlineProvider(new tg(this));
        this.h = new AccelerateInterpolator(2.0f);
        this.e = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, sf.d, 0, 0);
        boolean z = true;
        for (int i = 0; i < typedArrayObtainStyledAttributes.getIndexCount(); i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 2) {
                this.b = typedArrayObtainStyledAttributes.getColorStateList(2);
                this.a.getPaint().setColor(this.b.getDefaultColor());
            } else if (index == 1) {
                this.c = typedArrayObtainStyledAttributes.getDrawable(1);
            } else if (index == 5) {
                b(typedArrayObtainStyledAttributes.getColor(5, -1));
            } else if (index == 7) {
                a(typedArrayObtainStyledAttributes.getDimension(7, 0.0f));
            } else if (index == 6) {
                this.e = typedArrayObtainStyledAttributes.getInt(6, this.e);
            } else if (index == 0) {
                z = typedArrayObtainStyledAttributes.getBoolean(0, z);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        setClickable(z);
    }

    private static boolean c(Drawable drawable) {
        return drawable != null && drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0;
    }

    private final void d(Animator animator) {
        animator.setInterpolator(this.h);
    }

    public final void a(float f2) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        int[] iArr = PRESSED_ENABLED_STATE_SET;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationZ", f2);
        d(objectAnimatorOfFloat);
        stateListAnimator.addState(iArr, objectAnimatorOfFloat);
        int[] iArr2 = ENABLED_FOCUSED_STATE_SET;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "translationZ", f2);
        d(objectAnimatorOfFloat2);
        stateListAnimator.addState(iArr2, objectAnimatorOfFloat2);
        int[] iArr3 = EMPTY_STATE_SET;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "translationZ", getElevation());
        d(objectAnimatorOfFloat3);
        stateListAnimator.addState(iArr3, objectAnimatorOfFloat3);
        setStateListAnimator(stateListAnimator);
    }

    public final void b(int i) {
        RippleDrawable rippleDrawable = this.g;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(ColorStateList.valueOf(i));
            return;
        }
        if (i == -1 || isInEditMode()) {
            this.g = null;
            super.setBackgroundDrawable(this.a);
            return;
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        ShapeDrawable shapeDrawable = this.a;
        RippleDrawable rippleDrawable2 = new RippleDrawable(colorStateListValueOf, shapeDrawable, shapeDrawable);
        this.g = rippleDrawable2;
        super.setBackgroundDrawable(rippleDrawable2);
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.b;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        this.a.getPaint().setColor(this.b.getColorForState(getDrawableState(), this.b.getDefaultColor()));
        this.a.invalidateSelf();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        int i7 = i3 - i;
        int i8 = i4 - i2;
        Drawable drawable = this.c;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.c.getIntrinsicHeight();
            if (this.e != 0 && c(this.c)) {
                int i9 = (int) ((i7 - intrinsicWidth) / 2.0f);
                int i10 = (int) ((i8 - intrinsicHeight) / 2.0f);
                this.c.setBounds(i9, i10, intrinsicWidth + i9, intrinsicHeight + i10);
                return;
            }
            double d = this.d / 2;
            double d2 = f;
            Double.isNaN(d);
            int iFloor = (int) Math.floor(d * d2);
            int i11 = (this.d - iFloor) / 2;
            if (!c(this.c)) {
                int i12 = iFloor + i11;
                this.c.setBounds(i11, i11, i12, i12);
                return;
            }
            if (intrinsicWidth == intrinsicHeight) {
                i5 = iFloor;
                i6 = i11;
            } else {
                float f2 = intrinsicWidth / intrinsicHeight;
                if (intrinsicWidth > intrinsicHeight) {
                    i5 = (int) (iFloor / f2);
                    i6 = (int) ((iFloor - i5) / 2.0f);
                } else {
                    int i13 = (int) (iFloor * f2);
                    int i14 = (int) ((iFloor - i13) / 2.0f);
                    iFloor = i13;
                    i5 = iFloor;
                    i11 = i14;
                    i6 = i11;
                }
            }
            this.c.setBounds(i11, i6, iFloor + i11, i5 + i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[DONT_INVERT] */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iCeil;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (mode == 1073741824) {
                this.d = size;
            } else if (mode2 == 1073741824) {
                this.d = size2;
                size = size2;
            } else {
                if (c(this.c)) {
                    iCeil = Math.max(this.c.getIntrinsicHeight(), this.c.getIntrinsicWidth());
                } else {
                    iCeil = (int) Math.ceil(TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
                }
                if (mode != Integer.MIN_VALUE || mode2 == Integer.MIN_VALUE) {
                    if (mode != Integer.MIN_VALUE) {
                        size = size2;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        size = Math.min(size, size2);
                    }
                    double d = iCeil;
                    double d2 = f;
                    Double.isNaN(d);
                    int iFloor = (int) Math.floor(d / d2);
                    size = Math.min(size, iFloor + iFloor);
                    this.d = size;
                } else {
                    this.d = iCeil;
                    size = iCeil;
                }
            }
        } else if (mode2 == 1073741824) {
            size = Math.min(size, size2);
            this.d = size;
        } else {
            mode = 1073741824;
            if (mode == 1073741824) {
                this.d = size;
            } else if (mode2 == 1073741824) {
                this.d = size2;
                size = size2;
            } else {
                if (c(this.c)) {
                    iCeil = Math.max(this.c.getIntrinsicHeight(), this.c.getIntrinsicWidth());
                } else {
                    iCeil = (int) Math.ceil(TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
                }
                if (mode != Integer.MIN_VALUE) {
                    if (mode != Integer.MIN_VALUE) {
                        size = size2;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        size = Math.min(size, size2);
                    }
                    double d3 = iCeil;
                    double d4 = f;
                    Double.isNaN(d3);
                    int iFloor2 = (int) Math.floor(d3 / d4);
                    size = Math.min(size, iFloor2 + iFloor2);
                    this.d = size;
                } else {
                    if (mode != Integer.MIN_VALUE) {
                        size = size2;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        size = Math.min(size, size2);
                    }
                    double d5 = iCeil;
                    double d6 = f;
                    Double.isNaN(d5);
                    int iFloor3 = (int) Math.floor(d5 / d6);
                    size = Math.min(size, iFloor3 + iFloor3);
                    this.d = size;
                }
            }
        }
        setMeasuredDimension(size, size);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            switch (motionEvent.getAction() & 255) {
                case 0:
                    getBackground().setHotspot(motionEvent.getX(), motionEvent.getY());
                    return true;
            }
        }
        return zOnTouchEvent;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
