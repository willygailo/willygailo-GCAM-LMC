package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class oda extends LinearLayout {
    public TextView a;
    public ImageView b;
    public View c;
    public final Drawable d;
    final /* synthetic */ TabLayout e;
    private ocx f;
    private TextView g;
    private ImageView h;
    private int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oda(TabLayout tabLayout, Context context) {
        GradientDrawable gradientDrawable;
        super(context);
        this.e = tabLayout;
        this.i = 2;
        int i = tabLayout.m;
        if (i != 0) {
            Drawable drawableB = jr.b(context, i);
            this.d = drawableB;
            if (drawableB != null && drawableB.isStateful()) {
                drawableB.setState(getDrawableState());
            }
        } else {
            this.d = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Drawable rippleDrawable = gradientDrawable2;
        if (tabLayout.h != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateListA = obm.a(tabLayout.h);
            boolean z = tabLayout.v;
            if (true == z) {
                gradientDrawable = gradientDrawable2;
                gradientDrawable = null;
            }
            rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable, true != z ? gradientDrawable3 : null);
        }
        gl.G(this, rippleDrawable);
        tabLayout.invalidate();
        gl.O(this, tabLayout.b, tabLayout.c, tabLayout.d, tabLayout.e);
        setGravity(17);
        setOrientation(!tabLayout.s ? 1 : 0);
        setClickable(true);
        gl.ag(this, new kkm(PointerIcon.getSystemIcon(getContext(), 1002)));
    }

    private final void c(TextView textView, ImageView imageView) {
        ocx ocxVar = this.f;
        CharSequence charSequence = ocxVar != null ? ocxVar.b : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        boolean z = !zIsEmpty;
        if (textView != null) {
            if (z) {
                textView.setText(charSequence);
                int i = this.f.f;
                textView.setVisibility(0);
                setVisibility(0);
            } else {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iV = (z && imageView.getVisibility() == 0) ? (int) obr.v(getContext(), 8) : 0;
            if (this.e.s) {
                if (iV != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iV);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iV != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iV;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        ocx ocxVar2 = this.f;
        CharSequence charSequence2 = ocxVar2 != null ? ocxVar2.c : null;
        if (true == zIsEmpty) {
            charSequence = charSequence2;
        }
        setTooltipText(charSequence);
    }

    private static final void d(View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new ocz(view));
    }

    public final void a(ocx ocxVar) {
        if (ocxVar != this.f) {
            this.f = ocxVar;
            b();
        }
    }

    final void b() {
        ocx ocxVar = this.f;
        View view = ocxVar != null ? ocxVar.e : null;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            this.c = view;
            TextView textView = this.a;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.b;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.b.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.g = textView2;
            if (textView2 != null) {
                this.i = textView2.getMaxLines();
            }
            this.h = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view2 = this.c;
            if (view2 != null) {
                removeView(view2);
                this.c = null;
            }
            this.g = null;
            this.h = null;
        }
        boolean z = false;
        if (this.c == null) {
            if (this.b == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.google.android.GoogleCameraEngR18F1.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.b = imageView2;
                addView(imageView2, 0);
            }
            if (this.a == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.google.android.GoogleCameraEngR18F1.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.a = textView3;
                addView(textView3);
                this.i = this.a.getMaxLines();
            }
            this.a.setTextAppearance(this.e.f);
            ColorStateList colorStateList = this.e.g;
            if (colorStateList != null) {
                this.a.setTextColor(colorStateList);
            }
            c(this.a, this.b);
            d(this.b);
            d(this.a);
        } else {
            TextView textView4 = this.g;
            if (textView4 != null || this.h != null) {
                c(textView4, this.h);
            }
        }
        if (ocxVar != null && !TextUtils.isEmpty(ocxVar.c)) {
            setContentDescription(ocxVar.c);
        }
        if (ocxVar != null) {
            TabLayout tabLayout = ocxVar.g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int iA = tabLayout.a();
            if (iA != -1 && iA == ocxVar.d) {
                z = true;
            }
        }
        setSelected(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.d;
        if (drawable != null && drawable.isStateful() && this.d.setState(drawableState)) {
            invalidate();
            this.e.invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        hb hbVarA = hb.a(accessibilityNodeInfo);
        hbVarA.g(kkm.c(0, 1, this.f.d, 1, isSelected()));
        if (isSelected()) {
            hbVarA.a.setClickable(false);
            hbVarA.j(ha.a);
        }
        hbVarA.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.google.android.GoogleCameraEngR18F1.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.e.n;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f = this.e.k;
            int i4 = this.i;
            ImageView imageView = this.b;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.e.l;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.a.getTextSize();
            int lineCount = this.a.getLineCount();
            int maxLines = this.a.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i4 != maxLines)) {
                if (this.e.r != 1 || f <= textSize || lineCount != 1 || ((layout = this.a.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    this.a.setTextSize(0, f);
                    this.a.setMaxLines(i4);
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        this.f.a();
        return true;
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.c;
        if (view != null) {
            view.setSelected(z);
        }
    }
}
