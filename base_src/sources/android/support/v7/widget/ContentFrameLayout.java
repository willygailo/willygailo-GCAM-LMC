package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.ik;
import defpackage.iy;
import defpackage.kw;
import defpackage.nz;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public TypedValue g;
    public final Rect h;
    public ik i;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ik ikVar = this.i;
        if (ikVar != null) {
            iy iyVar = ikVar.a;
            nz nzVar = iyVar.k;
            if (nzVar != null) {
                nzVar.g();
            }
            if (iyVar.n != null) {
                iyVar.g.getDecorView().removeCallbacks(iyVar.o);
                if (iyVar.n.isShowing()) {
                    try {
                        iyVar.n.dismiss();
                    } catch (IllegalArgumentException e) {
                    }
                }
                iyVar.n = null;
            }
            iyVar.z();
            kw kwVar = iyVar.J(0).h;
            if (kwVar != null) {
                kwVar.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe  */
    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int iMakeMeasureSpec2;
        int fraction;
        int fraction2;
        int fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z2 = true;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            TypedValue typedValue = i3 < i4 ? this.e : this.d;
            if (typedValue == null || typedValue.type == 0) {
                iMakeMeasureSpec = i;
                z = false;
            } else {
                if (typedValue.type == 5) {
                    fraction3 = (int) typedValue.getDimension(displayMetrics);
                } else {
                    fraction3 = typedValue.type == 6 ? (int) typedValue.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels) : 0;
                }
                if (fraction3 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(fraction3 - (this.h.left + this.h.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    iMakeMeasureSpec = i;
                    z = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i2;
        } else {
            TypedValue typedValue2 = i3 < i4 ? this.f : this.g;
            if (typedValue2 == null || typedValue2.type == 0) {
                iMakeMeasureSpec2 = i2;
            } else {
                if (typedValue2.type == 5) {
                    fraction2 = (int) typedValue2.getDimension(displayMetrics);
                } else {
                    fraction2 = typedValue2.type == 6 ? (int) typedValue2.getFraction(displayMetrics.heightPixels, displayMetrics.heightPixels) : 0;
                }
                if (fraction2 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(fraction2 - (this.h.top + this.h.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i2;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = i3 < i4 ? this.c : this.b;
            if (typedValue3 == null || typedValue3.type == 0) {
                z2 = false;
            } else {
                if (typedValue3.type == 5) {
                    fraction = (int) typedValue3.getDimension(displayMetrics);
                } else {
                    fraction = typedValue3.type == 6 ? (int) typedValue3.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels) : 0;
                }
                if (fraction > 0) {
                    fraction -= this.h.left + this.h.right;
                }
                if (measuredWidth < fraction) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(fraction, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }
}
