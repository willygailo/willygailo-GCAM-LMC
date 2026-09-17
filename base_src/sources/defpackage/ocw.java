package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class ocw extends LinearLayout {
    public ValueAnimator a;
    public int b;
    public float c;
    final /* synthetic */ TabLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocw(TabLayout tabLayout, Context context) {
        super(context);
        this.d = tabLayout;
        this.b = -1;
        setWillNotDraw(false);
    }

    public final void a() {
        View childAt = getChildAt(this.b);
        TabLayout tabLayout = this.d;
        Drawable drawable = tabLayout.i;
        RectF rectFI = obr.i(tabLayout, childAt);
        drawable.setBounds((int) rectFI.left, drawable.getBounds().top, (int) rectFI.right, drawable.getBounds().bottom);
    }

    public final void b(int i) {
        Rect bounds = this.d.i.getBounds();
        this.d.i.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = this.d.i;
            drawable.setBounds(-1, drawable.getBounds().top, -1, this.d.i.getBounds().bottom);
        } else {
            TabLayout tabLayout = this.d;
            tabLayout.x.j(tabLayout, view, view2, f, tabLayout.i);
        }
        gl.z(this);
    }

    public final void d(boolean z, int i, int i2) {
        View childAt = getChildAt(this.b);
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a();
            return;
        }
        ocu ocuVar = new ocu(this, childAt, childAt2);
        if (!z) {
            this.a.removeAllUpdateListeners();
            this.a.addUpdateListener(ocuVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.a = valueAnimator;
        valueAnimator.setInterpolator(nwj.b);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(ocuVar);
        valueAnimator.addListener(new ocv(this, i));
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int iHeight = this.d.i.getBounds().height();
        if (iHeight < 0) {
            iHeight = this.d.i.getIntrinsicHeight();
        }
        int height = 0;
        switch (this.d.q) {
            case 0:
                height = getHeight() - iHeight;
                iHeight = getHeight();
                break;
            case 1:
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
                break;
            case 2:
                break;
            case 3:
                iHeight = getHeight();
                break;
            default:
                iHeight = 0;
                break;
        }
        if (this.d.i.getBounds().width() > 0) {
            Rect bounds = this.d.i.getBounds();
            this.d.i.setBounds(bounds.left, height, bounds.right, iHeight);
            TabLayout tabLayout = this.d;
            Drawable drawable = tabLayout.i;
            int i = tabLayout.j;
            if (i != 0) {
                drawable.setTint(i);
            } else {
                drawable.setTintList(null);
            }
            drawable.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            a();
        } else {
            d(false, this.b, -1);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.d;
        if (tabLayout.o == 1 || tabLayout.r == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            int iV = (int) obr.v(getContext(), 16);
            if (iMax * childCount <= getMeasuredWidth() - (iV + iV)) {
                boolean z = false;
                for (int i4 = 0; i4 < childCount; i4++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            } else {
                TabLayout tabLayout2 = this.d;
                tabLayout2.o = 0;
                tabLayout2.k(false);
            }
            super.onMeasure(i, i2);
        }
    }
}
