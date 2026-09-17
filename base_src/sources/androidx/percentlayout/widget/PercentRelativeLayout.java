package androidx.percentlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import defpackage.afr;
import defpackage.aft;
import defpackage.afu;
import defpackage.gl;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class PercentRelativeLayout extends RelativeLayout {
    private final aft a;

    public PercentRelativeLayout(Context context) {
        super(context);
        this.a = new aft(this);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new aft(this);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new aft(this);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final afu generateLayoutParams(AttributeSet attributeSet) {
        return new afu(getContext(), attributeSet);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new afu();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        afr afrVarA;
        super.onLayout(z, i, i2, i3, i4);
        aft aftVar = this.a;
        int childCount = aftVar.a.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ViewGroup.LayoutParams layoutParams = aftVar.a.getChildAt(i5).getLayoutParams();
            if ((layoutParams instanceof afu) && (afrVarA = ((afu) layoutParams).a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    afrVarA.b(marginLayoutParams);
                    marginLayoutParams.leftMargin = afrVarA.j.leftMargin;
                    marginLayoutParams.topMargin = afrVarA.j.topMargin;
                    marginLayoutParams.rightMargin = afrVarA.j.rightMargin;
                    marginLayoutParams.bottomMargin = afrVarA.j.bottomMargin;
                    marginLayoutParams.setMarginStart(afrVarA.j.getMarginStart());
                    marginLayoutParams.setMarginEnd(afrVarA.j.getMarginEnd());
                } else {
                    afrVarA.b(layoutParams);
                }
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        afr afrVarA;
        afr afrVarA2;
        aft aftVar = this.a;
        int size = (View.MeasureSpec.getSize(i) - aftVar.a.getPaddingLeft()) - aftVar.a.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - aftVar.a.getPaddingTop()) - aftVar.a.getPaddingBottom();
        int childCount = aftVar.a.getChildCount();
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= childCount) {
                break;
            }
            View childAt = aftVar.a.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof afu) && (afrVarA2 = ((afu) layoutParams).a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    afrVarA2.a(marginLayoutParams, size, size2);
                    afrVarA2.j.leftMargin = marginLayoutParams.leftMargin;
                    afrVarA2.j.topMargin = marginLayoutParams.topMargin;
                    afrVarA2.j.rightMargin = marginLayoutParams.rightMargin;
                    afrVarA2.j.bottomMargin = marginLayoutParams.bottomMargin;
                    afrVarA2.j.setMarginStart(marginLayoutParams.getMarginStart());
                    afrVarA2.j.setMarginEnd(marginLayoutParams.getMarginEnd());
                    float f = afrVarA2.c;
                    if (f >= 0.0f) {
                        marginLayoutParams.leftMargin = Math.round(size * f);
                    }
                    float f2 = afrVarA2.d;
                    if (f2 >= 0.0f) {
                        marginLayoutParams.topMargin = Math.round(size2 * f2);
                    }
                    float f3 = afrVarA2.e;
                    if (f3 >= 0.0f) {
                        marginLayoutParams.rightMargin = Math.round(size * f3);
                    }
                    float f4 = afrVarA2.f;
                    if (f4 >= 0.0f) {
                        marginLayoutParams.bottomMargin = Math.round(size2 * f4);
                    }
                    float f5 = afrVarA2.g;
                    if (f5 >= 0.0f) {
                        marginLayoutParams.setMarginStart(Math.round(size * f5));
                    } else {
                        z = false;
                    }
                    float f6 = afrVarA2.h;
                    if (f6 >= 0.0f) {
                        marginLayoutParams.setMarginEnd(Math.round(size * f6));
                    } else if (z) {
                    }
                    if (childAt != null) {
                        marginLayoutParams.resolveLayoutDirection(gl.f(childAt));
                    }
                } else {
                    afrVarA2.a(layoutParams, size, size2);
                }
            }
            i3++;
        }
        super.onMeasure(i, i2);
        aft aftVar2 = this.a;
        int childCount2 = aftVar2.a.getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount2; i4++) {
            View childAt2 = aftVar2.a.getChildAt(i4);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            if ((layoutParams2 instanceof afu) && (afrVarA = ((afu) layoutParams2).a()) != null) {
                if ((childAt2.getMeasuredWidthAndState() & (-16777216)) == 16777216 && afrVarA.a >= 0.0f && afrVarA.j.width == -2) {
                    layoutParams2.width = -2;
                    z2 = true;
                }
                if ((childAt2.getMeasuredHeightAndState() & (-16777216)) == 16777216 && afrVarA.b >= 0.0f && afrVarA.j.height == -2) {
                    layoutParams2.height = -2;
                    z2 = true;
                }
            }
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
    }
}
