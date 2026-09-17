package android.support.wearable.view;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.sf;
import defpackage.td;
import defpackage.th;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ActionPage extends ViewGroup {
    private final td a;
    private th b;
    private int c;
    private float d;
    private final Point e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private boolean j;

    public ActionPage(Context context) {
        this(context, null);
    }

    public ActionPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionPage(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.Widget_ActionPage);
    }

    public ActionPage(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = new Point();
        this.b = new th(context);
        td tdVar = new td(context);
        this.a = tdVar;
        tdVar.a(17);
        tdVar.b(2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sf.b, i, i2);
        float dimension = 1.0f;
        String string = null;
        float dimension2 = 0.0f;
        int i3 = 1;
        int i4 = 0;
        for (int i5 = 0; i5 < typedArrayObtainStyledAttributes.getIndexCount(); i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            if (index == 7) {
                th thVar = this.b;
                thVar.b = typedArrayObtainStyledAttributes.getColorStateList(7);
                thVar.a.getPaint().setColor(thVar.b.getDefaultColor());
            } else if (index == 4) {
                th thVar2 = this.b;
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(4);
                Drawable drawable2 = thVar2.c;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                if (thVar2.c != drawable) {
                    thVar2.c = drawable;
                    thVar2.requestLayout();
                    thVar2.invalidate();
                }
                Drawable drawable3 = thVar2.c;
                if (drawable3 != null) {
                    drawable3.setCallback(thVar2);
                }
            } else if (index == 14) {
                th thVar3 = this.b;
                thVar3.e = typedArrayObtainStyledAttributes.getInt(14, 0);
                if (thVar3.c != null) {
                    thVar3.invalidate();
                    thVar3.requestLayout();
                }
            } else if (index == 13) {
                this.b.b(typedArrayObtainStyledAttributes.getColor(13, -1));
            } else if (index == 17) {
                this.b.a(typedArrayObtainStyledAttributes.getDimension(17, 0.0f));
            } else if (index == 5) {
                td tdVar2 = this.a;
                CharSequence text = typedArrayObtainStyledAttributes.getText(5);
                if (text == null) {
                    throw new RuntimeException("Can not set ActionLabel text to null");
                }
                if (!Objects.equals(tdVar2.c, text)) {
                    tdVar2.a = null;
                    tdVar2.c = text;
                    tdVar2.requestLayout();
                    tdVar2.invalidate();
                }
            } else if (index == 16) {
                td tdVar3 = this.a;
                float fApplyDimension = TypedValue.applyDimension(0, typedArrayObtainStyledAttributes.getDimension(16, 10.0f), tdVar3.getContext().getResources().getDisplayMetrics());
                if (fApplyDimension != tdVar3.f) {
                    tdVar3.a = null;
                    tdVar3.f = fApplyDimension;
                    tdVar3.requestLayout();
                    tdVar3.invalidate();
                }
            } else if (index == 15) {
                td tdVar4 = this.a;
                float fApplyDimension2 = TypedValue.applyDimension(0, typedArrayObtainStyledAttributes.getDimension(15, 60.0f), tdVar4.getContext().getResources().getDisplayMetrics());
                if (fApplyDimension2 != tdVar4.g) {
                    tdVar4.a = null;
                    tdVar4.g = fApplyDimension2;
                    tdVar4.requestLayout();
                    tdVar4.invalidate();
                }
            } else if (index == 2) {
                td tdVar5 = this.a;
                ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(2);
                if (colorStateList == null) {
                    throw null;
                }
                tdVar5.b = colorStateList;
                tdVar5.e();
            } else if (index == 6) {
                this.a.b(typedArrayObtainStyledAttributes.getInt(6, 2));
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(10);
            } else if (index == 0) {
                i3 = typedArrayObtainStyledAttributes.getInt(0, i3);
            } else if (index == 1) {
                i4 = typedArrayObtainStyledAttributes.getInt(1, i4);
            } else if (index == 3) {
                this.a.a(typedArrayObtainStyledAttributes.getInt(3, 17));
            } else if (index == 8) {
                dimension2 = typedArrayObtainStyledAttributes.getDimension(8, dimension2);
            } else if (index == 9) {
                dimension = typedArrayObtainStyledAttributes.getDimension(9, dimension);
            } else if (index == 12) {
                this.b.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayObtainStyledAttributes.getResourceId(12, 0)));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        td tdVar6 = this.a;
        if (tdVar6.e != dimension2 || tdVar6.d != dimension) {
            tdVar6.e = dimension2;
            tdVar6.d = dimension;
            if (tdVar6.a != null) {
                tdVar6.a = null;
                tdVar6.requestLayout();
                tdVar6.invalidate();
            }
        }
        this.a.d(string, i3, i4);
        addView(this.a);
        addView(this.b);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.j = true;
        if (this.h != windowInsets.isRound()) {
            this.h = windowInsets.isRound();
            requestLayout();
        }
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        if (this.i != systemWindowInsetBottom) {
            this.i = systemWindowInsetBottom;
            requestLayout();
        }
        if (this.h) {
            this.i = (int) Math.max(this.i, getMeasuredHeight() * 0.09375f);
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j) {
            return;
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout((int) (this.e.x - this.d), (int) (this.e.y - this.d), (int) (this.e.x + this.d), (int) (this.e.y + this.d));
        int i5 = (int) (((i3 - i) - this.f) / 2.0f);
        this.a.layout(i5, this.b.getBottom(), this.f + i5, this.b.getBottom() + this.g);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        th thVar = this.b;
        if (thVar.e != 1 || thVar.c == null) {
            int iMin = (int) (Math.min(measuredWidth, measuredHeight) * 0.45f);
            this.c = iMin;
            this.d = iMin / 2.0f;
            this.b.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c, 1073741824));
        } else {
            thVar.measure(0, 0);
            int iMin2 = Math.min(this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
            this.c = iMin2;
            this.d = iMin2 / 2.0f;
        }
        if (this.h) {
            this.e.set(measuredWidth / 2, measuredHeight / 2);
            this.f = (int) (measuredWidth * 0.625f);
            this.i = (int) (measuredHeight * 0.09375f);
        } else {
            this.e.set(measuredWidth / 2, (int) (measuredHeight * 0.43f));
            this.f = (int) (measuredWidth * 0.892f);
        }
        this.g = (int) ((measuredHeight - (this.e.y + this.d)) - this.i);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.g, 1073741824));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        th thVar = this.b;
        if (thVar != null) {
            thVar.setEnabled(z);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        th thVar = this.b;
        if (thVar != null) {
            thVar.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public final void setStateListAnimator(StateListAnimator stateListAnimator) {
        th thVar = this.b;
        if (thVar != null) {
            thVar.setStateListAnimator(stateListAnimator);
        }
    }
}
