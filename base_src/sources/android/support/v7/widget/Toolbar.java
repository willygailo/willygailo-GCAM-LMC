package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.gl;
import defpackage.hs;
import defpackage.jd;
import defpackage.jq;
import defpackage.kc;
import defpackage.ku;
import defpackage.kw;
import defpackage.kz;
import defpackage.lj;
import defpackage.mh;
import defpackage.mw;
import defpackage.nu;
import defpackage.oa;
import defpackage.qy;
import defpackage.rn;
import defpackage.ro;
import defpackage.rp;
import defpackage.rr;
import defpackage.rs;
import defpackage.ru;
import defpackage.rx;
import defpackage.sd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private ImageView A;
    private int B;
    private int C;
    private int D;
    private int E;
    private ColorStateList F;
    private ColorStateList G;
    private boolean H;
    private boolean I;
    private final ArrayList J;
    private final int[] K;
    private rx L;
    private final Runnable M;
    private final ro N;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageButton d;
    public Drawable e;
    public CharSequence f;
    public ImageButton g;
    public View h;
    public Context i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public qy r;
    public CharSequence s;
    public CharSequence t;
    public final ArrayList u;
    public mh v;
    public rr w;
    public lj x;
    public ku y;
    public jd z;

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.E = 8388627;
        this.J = new ArrayList();
        this.u = new ArrayList();
        this.K = new int[2];
        this.N = new ro(this);
        this.M = new rp(this);
        rn rnVarQ = rn.q(getContext(), attributeSet, jq.w, i);
        gl.E(this, context, jq.w, attributeSet, rnVarQ.b, i, 0);
        this.k = rnVarQ.f(28, 0);
        this.l = rnVarQ.f(19, 0);
        this.E = rnVarQ.d(0, this.E);
        this.m = rnVarQ.d(2, 48);
        int iA = rnVarQ.a(22, 0);
        iA = rnVarQ.p(27) ? rnVarQ.a(27, iA) : iA;
        this.q = iA;
        this.p = iA;
        this.o = iA;
        this.n = iA;
        int iA2 = rnVarQ.a(25, -1);
        if (iA2 >= 0) {
            this.n = iA2;
        }
        int iA3 = rnVarQ.a(24, -1);
        if (iA3 >= 0) {
            this.o = iA3;
        }
        int iA4 = rnVarQ.a(26, -1);
        if (iA4 >= 0) {
            this.p = iA4;
        }
        int iA5 = rnVarQ.a(23, -1);
        if (iA5 >= 0) {
            this.q = iA5;
        }
        this.B = rnVarQ.b(13, -1);
        int iA6 = rnVarQ.a(9, Integer.MIN_VALUE);
        int iA7 = rnVarQ.a(5, Integer.MIN_VALUE);
        int iB = rnVarQ.b(7, 0);
        int iB2 = rnVarQ.b(8, 0);
        j();
        qy qyVar = this.r;
        qyVar.h = false;
        if (iB != Integer.MIN_VALUE) {
            qyVar.e = iB;
            qyVar.a = iB;
        }
        if (iB2 != Integer.MIN_VALUE) {
            qyVar.f = iB2;
            qyVar.b = iB2;
        }
        if (iA6 != Integer.MIN_VALUE || iA7 != Integer.MIN_VALUE) {
            qyVar.a(iA6, iA7);
        }
        this.C = rnVarQ.a(10, Integer.MIN_VALUE);
        this.D = rnVarQ.a(6, Integer.MIN_VALUE);
        this.e = rnVarQ.h(4);
        this.f = rnVarQ.l(3);
        CharSequence charSequenceL = rnVarQ.l(21);
        if (!TextUtils.isEmpty(charSequenceL)) {
            r(charSequenceL);
        }
        CharSequence charSequenceL2 = rnVarQ.l(18);
        if (!TextUtils.isEmpty(charSequenceL2)) {
            q(charSequenceL2);
        }
        this.i = getContext();
        p(rnVarQ.f(17, 0));
        Drawable drawableH = rnVarQ.h(16);
        if (drawableH != null) {
            o(drawableH);
        }
        CharSequence charSequenceL3 = rnVarQ.l(15);
        if (!TextUtils.isEmpty(charSequenceL3)) {
            n(charSequenceL3);
        }
        Drawable drawableH2 = rnVarQ.h(11);
        if (drawableH2 != null) {
            m(drawableH2);
        }
        CharSequence charSequenceL4 = rnVarQ.l(12);
        if (!TextUtils.isEmpty(charSequenceL4)) {
            if (!TextUtils.isEmpty(charSequenceL4)) {
                D();
            }
            ImageView imageView = this.A;
            if (imageView != null) {
                imageView.setContentDescription(charSequenceL4);
            }
        }
        if (rnVarQ.p(29)) {
            ColorStateList colorStateListG = rnVarQ.g(29);
            this.F = colorStateListG;
            TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(colorStateListG);
            }
        }
        if (rnVarQ.p(20)) {
            ColorStateList colorStateListG2 = rnVarQ.g(20);
            this.G = colorStateListG2;
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setTextColor(colorStateListG2);
            }
        }
        if (rnVarQ.p(14)) {
            new kc(getContext()).inflate(rnVarQ.f(14, 0), g());
        }
        rnVarQ.n();
    }

    private final int A(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private final void B(List list, int i) {
        int iF = gl.f(this);
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, gl.f(this));
        list.clear();
        if (iF == 1) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                rs rsVar = (rs) childAt.getLayoutParams();
                if (rsVar.b == 0 && F(childAt) && w(rsVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            rs rsVar2 = (rs) childAt2.getLayoutParams();
            if (rsVar2.b == 0 && F(childAt2) && w(rsVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void C(View view, boolean z) {
        rs rsVarV;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            rsVarV = u();
        } else {
            rsVarV = !checkLayoutParams(layoutParams) ? v(layoutParams) : (rs) layoutParams;
        }
        rsVarV.b = 1;
        if (!z || this.h == null) {
            addView(view, rsVarV);
        } else {
            view.setLayoutParams(rsVarV);
            this.u.add(view);
        }
    }

    private final void D() {
        if (this.A == null) {
            this.A = new AppCompatImageView(getContext());
        }
    }

    private final boolean E(View view) {
        return view.getParent() == this || this.u.contains(view);
    }

    private final boolean F(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static final int G(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private static final int H(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void I(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public static final rs u() {
        return new rs();
    }

    protected static final rs v(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof rs) {
            return new rs((rs) layoutParams);
        }
        if (layoutParams instanceof hs) {
            return new rs((hs) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new rs((ViewGroup.MarginLayoutParams) layoutParams) : new rs(layoutParams);
    }

    private final int w(int i) {
        int iF = gl.f(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, iF) & 7;
        switch (absoluteGravity) {
            case 1:
            case 3:
            case 5:
                return absoluteGravity;
            case 2:
            case 4:
            default:
                return iF == 1 ? 5 : 3;
        }
    }

    private final int x(View view, int i) {
        rs rsVar = (rs) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = rsVar.a & 112;
        switch (i3) {
            case 16:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                break;
            default:
                i3 = this.E & 112;
                break;
        }
        switch (i3) {
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return getPaddingTop() - i2;
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - rsVar.bottomMargin) - i2;
            default:
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (iMax < rsVar.topMargin) {
                    iMax = rsVar.topMargin;
                } else {
                    int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
                    if (i4 < rsVar.bottomMargin) {
                        iMax = Math.max(0, iMax - (rsVar.bottomMargin - i4));
                    }
                }
                return paddingTop + iMax;
        }
    }

    private final int y(View view, int i, int[] iArr, int i2) {
        rs rsVar = (rs) view.getLayoutParams();
        int i3 = rsVar.leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iX = x(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iX, iMax + measuredWidth, view.getMeasuredHeight() + iX);
        return iMax + measuredWidth + rsVar.rightMargin;
    }

    private final int z(View view, int i, int[] iArr, int i2) {
        rs rsVar = (rs) view.getLayoutParams();
        int i3 = rsVar.rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iX = x(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iX, iMax, view.getMeasuredHeight() + iX);
        return iMax - (measuredWidth + rsVar.leftMargin);
    }

    public final int a() {
        qy qyVar = this.r;
        if (qyVar != null) {
            return qyVar.g ? qyVar.a : qyVar.b;
        }
        return 0;
    }

    public final int b() {
        qy qyVar = this.r;
        if (qyVar != null) {
            return qyVar.g ? qyVar.b : qyVar.a;
        }
        return 0;
    }

    public final int c() {
        kw kwVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (kwVar = actionMenuView.a) == null || !kwVar.hasVisibleItems()) ? a() : Math.max(a(), Math.max(this.D, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof rs);
    }

    public final int d() {
        return e() != null ? Math.max(b(), Math.max(this.C, 0)) : b();
    }

    public final Drawable e() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final oa f() {
        if (this.L == null) {
            this.L = new rx(this, true);
        }
        return this.L;
    }

    public final Menu g() {
        k();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu menuG = actionMenuView.g();
            if (this.w == null) {
                this.w = new rr(this);
            }
            this.a.c.o();
            ((kw) menuG).h(this.w, this.i);
        }
        return this.a.g();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return u();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new rs(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return v(layoutParams);
    }

    public final CharSequence h() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final void i() {
        rr rrVar = this.w;
        kz kzVar = rrVar == null ? null : rrVar.b;
        if (kzVar != null) {
            kzVar.collapseActionView();
        }
    }

    public final void j() {
        if (this.r == null) {
            this.r = new qy();
        }
    }

    public final void k() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.j(this.j);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.N;
            actionMenuView2.i(this.x, this.y);
            rs rsVarU = u();
            rsVarU.a = (this.m & 112) | 8388613;
            this.a.setLayoutParams(rsVarU);
            C(this.a, false);
        }
    }

    public final void l() {
        if (this.d == null) {
            this.d = new mw(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            rs rsVarU = u();
            rsVarU.a = (this.m & 112) | 8388611;
            this.d.setLayoutParams(rsVarU);
        }
    }

    public final void m(Drawable drawable) {
        if (drawable != null) {
            D();
            if (!E(this.A)) {
                C(this.A, true);
            }
        } else {
            ImageView imageView = this.A;
            if (imageView != null && E(imageView)) {
                removeView(this.A);
                this.u.remove(this.A);
            }
        }
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void n(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public final void o(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!E(this.d)) {
                C(this.d, true);
            }
        } else {
            ImageButton imageButton = this.d;
            if (imageButton != null && E(imageButton)) {
                removeView(this.d);
                this.u.remove(this.d);
            }
        }
        ImageButton imageButton2 = this.d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.M);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.I = false;
            actionMasked = 9;
        }
        if (this.I) {
            i = actionMasked;
        } else {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked != 9) {
                i = actionMasked;
            } else if (!zOnHoverEvent) {
                this.I = true;
            }
        }
        if (i == 10 || i == 3) {
            this.I = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0253  */
    /* JADX WARN: Code duplicated, block: B:102:0x0276  */
    /* JADX WARN: Code duplicated, block: B:104:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x029d  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b4 A[LOOP:0: B:109:0x02b2->B:110:0x02b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02d6 A[LOOP:1: B:112:0x02d4->B:113:0x02d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02fa A[LOOP:2: B:115:0x02f8->B:116:0x02fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x033b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x033d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0341  */
    /* JADX WARN: Code duplicated, block: B:125:0x034a A[LOOP:3: B:124:0x0348->B:125:0x034a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:15:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:20:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0074  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:45:0x0112  */
    /* JADX WARN: Code duplicated, block: B:47:0x0115  */
    /* JADX WARN: Code duplicated, block: B:48:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    /* JADX WARN: Code duplicated, block: B:55:0x013f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0143  */
    /* JADX WARN: Code duplicated, block: B:58:0x0146  */
    /* JADX WARN: Code duplicated, block: B:61:0x0156  */
    /* JADX WARN: Code duplicated, block: B:65:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:69:0x016d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x0188  */
    /* JADX WARN: Code duplicated, block: B:75:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x019c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:89:0x0204  */
    /* JADX WARN: Code duplicated, block: B:91:0x0207  */
    /* JADX WARN: Code duplicated, block: B:92:0x022d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0230  */
    /* JADX WARN: Code duplicated, block: B:96:0x023a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x023c  */
    /* JADX WARN: Code duplicated, block: B:98:0x023f  */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iY;
        int iZ;
        int iD;
        int iC;
        int iMax;
        int iMin;
        boolean zF;
        boolean zF2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        rs rsVar;
        rs rsVar2;
        boolean z2;
        int i5;
        int paddingTop;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iMax2;
        int i12;
        int size;
        int i13;
        int i14;
        int size2;
        int i15;
        ArrayList arrayList;
        int i16;
        int i17;
        int size3;
        int i18;
        int measuredWidth;
        int i19;
        int i20;
        int i21;
        int size4;
        int iF = gl.f(this);
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i22 = width - paddingRight;
        int[] iArr = this.K;
        iArr[1] = 0;
        iArr[0] = 0;
        int iG = gl.g(this);
        int iMin2 = iG >= 0 ? Math.min(iG, i4 - i2) : 0;
        if (F(this.d)) {
            if (iF == 1) {
                iZ = z(this.d, i22, iArr, iMin2);
                iY = paddingLeft;
            } else {
                iY = y(this.d, paddingLeft, iArr, iMin2);
            }
            if (F(this.g)) {
                if (iF == 1) {
                    iZ = z(this.g, iZ, iArr, iMin2);
                } else {
                    iY = y(this.g, iY, iArr, iMin2);
                }
            }
            if (F(this.a)) {
                if (iF == 1) {
                    iY = y(this.a, iY, iArr, iMin2);
                } else {
                    iZ = z(this.a, iZ, iArr, iMin2);
                }
            }
            if (gl.f(this) == 1) {
                iD = c();
            } else {
                iD = d();
            }
            if (gl.f(this) == 1) {
                iC = d();
            } else {
                iC = c();
            }
            iArr[0] = Math.max(0, iD - iY);
            iArr[1] = Math.max(0, iC - (i22 - iZ));
            iMax = Math.max(iY, iD);
            iMin = Math.min(iZ, i22 - iC);
            if (F(this.h)) {
                if (iF == 1) {
                    iMin = z(this.h, iMin, iArr, iMin2);
                } else {
                    iMax = y(this.h, iMax, iArr, iMin2);
                }
            }
            if (F(this.A)) {
                if (iF == 1) {
                    iMin = z(this.A, iMin, iArr, iMin2);
                } else {
                    iMax = y(this.A, iMax, iArr, iMin2);
                }
            }
            zF = F(this.b);
            zF2 = F(this.c);
            if (zF) {
                rs rsVar3 = (rs) this.b.getLayoutParams();
                measuredHeight = rsVar3.bottomMargin + rsVar3.topMargin + this.b.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zF2) {
                rs rsVar4 = (rs) this.c.getLayoutParams();
                measuredHeight += rsVar4.topMargin + this.c.getMeasuredHeight() + rsVar4.bottomMargin;
            }
            if (!zF || zF2) {
                if (zF) {
                    textView = this.b;
                } else {
                    textView = this.c;
                }
                if (zF2) {
                    textView2 = this.c;
                } else {
                    textView2 = this.b;
                }
                rsVar = (rs) textView.getLayoutParams();
                rsVar2 = (rs) textView2.getLayoutParams();
                if (!zF && this.b.getMeasuredWidth() > 0) {
                    z2 = true;
                } else if (zF2 || this.c.getMeasuredWidth() <= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                i5 = paddingLeft;
                switch (this.E & 112) {
                    case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        paddingTop = getPaddingTop() + rsVar.topMargin + this.p;
                        break;
                    case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                        paddingTop = (((height - paddingBottom) - rsVar2.bottomMargin) - this.q) - measuredHeight;
                        break;
                    default:
                        iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                        if (iMax2 < rsVar.topMargin + this.p) {
                            iMax2 = rsVar.topMargin + this.p;
                        } else {
                            i12 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                            if (i12 < rsVar.bottomMargin + this.q) {
                                iMax2 = Math.max(0, iMax2 - ((rsVar2.bottomMargin + this.q) - i12));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                        break;
                }
                if (iF == 1) {
                    if (z2) {
                        i9 = this.n;
                    } else {
                        i9 = 0;
                    }
                    int i23 = i9 - iArr[1];
                    iMin -= Math.max(0, i23);
                    iArr[1] = Math.max(0, -i23);
                    if (zF) {
                        rs rsVar5 = (rs) this.b.getLayoutParams();
                        int measuredWidth2 = iMin - this.b.getMeasuredWidth();
                        int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i10 = measuredWidth2 - this.o;
                        paddingTop = measuredHeight2 + rsVar5.bottomMargin;
                    } else {
                        i10 = iMin;
                    }
                    if (zF2) {
                        rs rsVar6 = (rs) this.c.getLayoutParams();
                        int i24 = paddingTop + rsVar6.topMargin;
                        this.c.layout(iMin - this.c.getMeasuredWidth(), i24, iMin, this.c.getMeasuredHeight() + i24);
                        i11 = iMin - this.o;
                        int i25 = rsVar6.bottomMargin;
                    } else {
                        i11 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i10, i11);
                    }
                    iMax = iMax;
                } else {
                    if (z2) {
                        i6 = this.n;
                    } else {
                        i6 = 0;
                    }
                    int i26 = i6 - iArr[0];
                    iMax += Math.max(0, i26);
                    iArr[0] = Math.max(0, -i26);
                    if (zF) {
                        rs rsVar7 = (rs) this.b.getLayoutParams();
                        int measuredWidth3 = this.b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i7 = measuredWidth3 + this.o;
                        paddingTop = measuredHeight3 + rsVar7.bottomMargin;
                    } else {
                        i7 = iMax;
                    }
                    if (zF2) {
                        rs rsVar8 = (rs) this.c.getLayoutParams();
                        int i27 = paddingTop + rsVar8.topMargin;
                        int measuredWidth4 = this.c.getMeasuredWidth() + iMax;
                        this.c.layout(iMax, i27, measuredWidth4, this.c.getMeasuredHeight() + i27);
                        i8 = measuredWidth4 + this.o;
                        int i28 = rsVar8.bottomMargin;
                    } else {
                        i8 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i7, i8);
                    }
                }
            } else {
                i5 = paddingLeft;
                iMin2 = iMin2;
            }
            B(this.J, 3);
            size = this.J.size();
            for (i13 = 0; i13 < size; i13++) {
                iMax = y((View) this.J.get(i13), iMax, iArr, iMin2);
            }
            i14 = iMin2;
            B(this.J, 5);
            size2 = this.J.size();
            for (i15 = 0; i15 < size2; i15++) {
                iMin = z((View) this.J.get(i15), iMin, iArr, i14);
            }
            B(this.J, 1);
            arrayList = this.J;
            i16 = iArr[0];
            i17 = iArr[1];
            size3 = arrayList.size();
            i18 = 0;
            measuredWidth = 0;
            while (i18 < size3) {
                View view = (View) arrayList.get(i18);
                rs rsVar9 = (rs) view.getLayoutParams();
                int i29 = rsVar9.leftMargin - i16;
                int i30 = rsVar9.rightMargin - i17;
                int iMax3 = Math.max(0, i29);
                int iMax4 = Math.max(0, i30);
                int iMax5 = Math.max(0, -i29);
                int iMax6 = Math.max(0, -i30);
                measuredWidth += iMax3 + view.getMeasuredWidth() + iMax4;
                i18++;
                i17 = iMax6;
                i16 = iMax5;
            }
            i20 = (i5 + (((width - i5) - paddingRight) / 2)) - (measuredWidth / 2);
            i21 = measuredWidth + i20;
            if (i20 >= iMax) {
                if (i21 > iMin) {
                    iMax = i20 - (i21 - iMin);
                } else {
                    iMax = i20;
                }
            }
            size4 = this.J.size();
            for (i19 = 0; i19 < size4; i19++) {
                iMax = y((View) this.J.get(i19), iMax, iArr, i14);
            }
            this.J.clear();
        }
        iY = paddingLeft;
        iZ = i22;
        if (F(this.g)) {
            if (iF == 1) {
                iZ = z(this.g, iZ, iArr, iMin2);
            } else {
                iY = y(this.g, iY, iArr, iMin2);
            }
        }
        if (F(this.a)) {
            if (iF == 1) {
                iY = y(this.a, iY, iArr, iMin2);
            } else {
                iZ = z(this.a, iZ, iArr, iMin2);
            }
        }
        if (gl.f(this) == 1) {
            iD = c();
        } else {
            iD = d();
        }
        if (gl.f(this) == 1) {
            iC = d();
        } else {
            iC = c();
        }
        iArr[0] = Math.max(0, iD - iY);
        iArr[1] = Math.max(0, iC - (i22 - iZ));
        iMax = Math.max(iY, iD);
        iMin = Math.min(iZ, i22 - iC);
        if (F(this.h)) {
            if (iF == 1) {
                iMin = z(this.h, iMin, iArr, iMin2);
            } else {
                iMax = y(this.h, iMax, iArr, iMin2);
            }
        }
        if (F(this.A)) {
            if (iF == 1) {
                iMin = z(this.A, iMin, iArr, iMin2);
            } else {
                iMax = y(this.A, iMax, iArr, iMin2);
            }
        }
        zF = F(this.b);
        zF2 = F(this.c);
        if (zF) {
            rs rsVar10 = (rs) this.b.getLayoutParams();
            measuredHeight = rsVar10.bottomMargin + rsVar10.topMargin + this.b.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zF2) {
            rs rsVar11 = (rs) this.c.getLayoutParams();
            measuredHeight += rsVar11.topMargin + this.c.getMeasuredHeight() + rsVar11.bottomMargin;
        }
        if (zF) {
            if (zF) {
                textView = this.b;
            } else {
                textView = this.c;
            }
            if (zF2) {
                textView2 = this.c;
            } else {
                textView2 = this.b;
            }
            rsVar = (rs) textView.getLayoutParams();
            rsVar2 = (rs) textView2.getLayoutParams();
            if (!zF) {
                if (zF2) {
                    z2 = false;
                } else {
                    z2 = false;
                }
            } else if (zF2) {
                z2 = false;
            } else {
                z2 = false;
            }
            i5 = paddingLeft;
            switch (this.E & 112) {
                case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    paddingTop = getPaddingTop() + rsVar.topMargin + this.p;
                    break;
                case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                    paddingTop = (((height - paddingBottom) - rsVar2.bottomMargin) - this.q) - measuredHeight;
                    break;
                default:
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    if (iMax2 < rsVar.topMargin + this.p) {
                        iMax2 = rsVar.topMargin + this.p;
                    } else {
                        i12 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        if (i12 < rsVar.bottomMargin + this.q) {
                            iMax2 = Math.max(0, iMax2 - ((rsVar2.bottomMargin + this.q) - i12));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                    break;
            }
            if (iF == 1) {
                if (z2) {
                    i9 = this.n;
                } else {
                    i9 = 0;
                }
                int i210 = i9 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zF) {
                    rs rsVar12 = (rs) this.b.getLayoutParams();
                    int measuredWidth5 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight4 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i10 = measuredWidth5 - this.o;
                    paddingTop = measuredHeight4 + rsVar12.bottomMargin;
                } else {
                    i10 = iMin;
                }
                if (zF2) {
                    rs rsVar13 = (rs) this.c.getLayoutParams();
                    int i211 = paddingTop + rsVar13.topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i211, iMin, this.c.getMeasuredHeight() + i211);
                    i11 = iMin - this.o;
                    int i212 = rsVar13.bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i10, i11);
                }
                iMax = iMax;
            } else {
                if (z2) {
                    i6 = this.n;
                } else {
                    i6 = 0;
                }
                int i213 = i6 - iArr[0];
                iMax += Math.max(0, i213);
                iArr[0] = Math.max(0, -i213);
                if (zF) {
                    rs rsVar14 = (rs) this.b.getLayoutParams();
                    int measuredWidth6 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i7 = measuredWidth6 + this.o;
                    paddingTop = measuredHeight5 + rsVar14.bottomMargin;
                } else {
                    i7 = iMax;
                }
                if (zF2) {
                    rs rsVar15 = (rs) this.c.getLayoutParams();
                    int i214 = paddingTop + rsVar15.topMargin;
                    int measuredWidth7 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i214, measuredWidth7, this.c.getMeasuredHeight() + i214);
                    i8 = measuredWidth7 + this.o;
                    int i215 = rsVar15.bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i7, i8);
                }
            }
        } else {
            if (zF) {
                textView = this.b;
            } else {
                textView = this.c;
            }
            if (zF2) {
                textView2 = this.c;
            } else {
                textView2 = this.b;
            }
            rsVar = (rs) textView.getLayoutParams();
            rsVar2 = (rs) textView2.getLayoutParams();
            if (!zF) {
                if (zF2) {
                    z2 = false;
                } else {
                    z2 = false;
                }
            } else if (zF2) {
                z2 = false;
            } else {
                z2 = false;
            }
            i5 = paddingLeft;
            switch (this.E & 112) {
                case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    paddingTop = getPaddingTop() + rsVar.topMargin + this.p;
                    break;
                case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                    paddingTop = (((height - paddingBottom) - rsVar2.bottomMargin) - this.q) - measuredHeight;
                    break;
                default:
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    if (iMax2 < rsVar.topMargin + this.p) {
                        iMax2 = rsVar.topMargin + this.p;
                    } else {
                        i12 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        if (i12 < rsVar.bottomMargin + this.q) {
                            iMax2 = Math.max(0, iMax2 - ((rsVar2.bottomMargin + this.q) - i12));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                    break;
            }
            if (iF == 1) {
                if (z2) {
                    i9 = this.n;
                } else {
                    i9 = 0;
                }
                int i216 = i9 - iArr[1];
                iMin -= Math.max(0, i216);
                iArr[1] = Math.max(0, -i216);
                if (zF) {
                    rs rsVar16 = (rs) this.b.getLayoutParams();
                    int measuredWidth8 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight6 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i10 = measuredWidth8 - this.o;
                    paddingTop = measuredHeight6 + rsVar16.bottomMargin;
                } else {
                    i10 = iMin;
                }
                if (zF2) {
                    rs rsVar17 = (rs) this.c.getLayoutParams();
                    int i217 = paddingTop + rsVar17.topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i217, iMin, this.c.getMeasuredHeight() + i217);
                    i11 = iMin - this.o;
                    int i218 = rsVar17.bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i10, i11);
                }
                iMax = iMax;
            } else {
                if (z2) {
                    i6 = this.n;
                } else {
                    i6 = 0;
                }
                int i219 = i6 - iArr[0];
                iMax += Math.max(0, i219);
                iArr[0] = Math.max(0, -i219);
                if (zF) {
                    rs rsVar18 = (rs) this.b.getLayoutParams();
                    int measuredWidth9 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i7 = measuredWidth9 + this.o;
                    paddingTop = measuredHeight7 + rsVar18.bottomMargin;
                } else {
                    i7 = iMax;
                }
                if (zF2) {
                    rs rsVar19 = (rs) this.c.getLayoutParams();
                    int i2110 = paddingTop + rsVar19.topMargin;
                    int measuredWidth10 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i2110, measuredWidth10, this.c.getMeasuredHeight() + i2110);
                    i8 = measuredWidth10 + this.o;
                    int i2111 = rsVar19.bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i7, i8);
                }
            }
        }
        B(this.J, 3);
        size = this.J.size();
        while (i13 < size) {
            iMax = y((View) this.J.get(i13), iMax, iArr, iMin2);
        }
        i14 = iMin2;
        B(this.J, 5);
        size2 = this.J.size();
        while (i15 < size2) {
            iMin = z((View) this.J.get(i15), iMin, iArr, i14);
        }
        B(this.J, 1);
        arrayList = this.J;
        i16 = iArr[0];
        i17 = iArr[1];
        size3 = arrayList.size();
        i18 = 0;
        measuredWidth = 0;
        while (i18 < size3) {
            View view2 = (View) arrayList.get(i18);
            rs rsVar20 = (rs) view2.getLayoutParams();
            int i220 = rsVar20.leftMargin - i16;
            int i31 = rsVar20.rightMargin - i17;
            int iMax7 = Math.max(0, i220);
            int iMax8 = Math.max(0, i31);
            int iMax9 = Math.max(0, -i220);
            int iMax10 = Math.max(0, -i31);
            measuredWidth += iMax7 + view2.getMeasuredWidth() + iMax8;
            i18++;
            i17 = iMax10;
            i16 = iMax9;
        }
        i20 = (i5 + (((width - i5) - paddingRight) / 2)) - (measuredWidth / 2);
        i21 = measuredWidth + i20;
        if (i20 >= iMax) {
            if (i21 > iMin) {
                iMax = i20 - (i21 - iMin);
            } else {
                iMax = i20;
            }
        }
        size4 = this.J.size();
        while (i19 < size4) {
            iMax = y((View) this.J.get(i19), iMax, iArr, i14);
        }
        this.J.clear();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr = this.K;
        boolean zB = sd.b(this);
        int i3 = !zB ? 1 : 0;
        int iMax2 = 0;
        if (F(this.d)) {
            I(this.d, i, 0, i2, this.B);
            measuredWidth = this.d.getMeasuredWidth() + G(this.d);
            iMax = Math.max(0, this.d.getMeasuredHeight() + H(this.d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (F(this.g)) {
            I(this.g, i, 0, i2, this.B);
            measuredWidth = this.g.getMeasuredWidth() + G(this.g);
            iMax = Math.max(iMax, this.g.getMeasuredHeight() + H(this.g));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.g.getMeasuredState());
        }
        int iD = d();
        int iMax3 = Math.max(iD, measuredWidth);
        iArr[zB ? 1 : 0] = Math.max(0, iD - measuredWidth);
        if (F(this.a)) {
            I(this.a, i, iMax3, i2, this.B);
            measuredWidth2 = this.a.getMeasuredWidth() + G(this.a);
            iMax = Math.max(iMax, this.a.getMeasuredHeight() + H(this.a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int iC = c();
        int iMax4 = iMax3 + Math.max(iC, measuredWidth2);
        iArr[i3] = Math.max(0, iC - measuredWidth2);
        if (F(this.h)) {
            iMax4 += A(this.h, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.h.getMeasuredHeight() + H(this.h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        if (F(this.A)) {
            iMax4 += A(this.A, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.A.getMeasuredHeight() + H(this.A));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.A.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((rs) childAt.getLayoutParams()).b == 0 && F(childAt)) {
                iMax4 += A(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + H(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.p + this.q;
        int i6 = this.n + this.o;
        if (F(this.b)) {
            A(this.b, i, iMax4 + i6, i2, i5, iArr);
            iMax2 = this.b.getMeasuredWidth() + G(this.b);
            int measuredHeight2 = this.b.getMeasuredHeight() + H(this.b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (F(this.c)) {
            iMax2 = Math.max(iMax2, A(this.c, i, iMax4 + i6, i2, measuredHeight + i5, iArr));
            measuredHeight += this.c.getMeasuredHeight() + H(this.c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax5 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof ru)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ru ruVar = (ru) parcelable;
        super.onRestoreInstanceState(ruVar.d);
        ActionMenuView actionMenuView = this.a;
        kw kwVar = actionMenuView != null ? actionMenuView.a : null;
        int i = ruVar.a;
        if (i != 0 && this.w != null && kwVar != null && (menuItemFindItem = kwVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (ruVar.b) {
            removeCallbacks(this.M);
            post(this.M);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        j();
        qy qyVar = this.r;
        boolean z = i == 1;
        if (z == qyVar.g) {
            return;
        }
        qyVar.g = z;
        if (!qyVar.h) {
            qyVar.a = qyVar.e;
            qyVar.b = qyVar.f;
            return;
        }
        if (z) {
            int i2 = qyVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = qyVar.e;
            }
            qyVar.a = i2;
            int i3 = qyVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = qyVar.f;
            }
            qyVar.b = i3;
            return;
        }
        int i4 = qyVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = qyVar.e;
        }
        qyVar.a = i4;
        int i5 = qyVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = qyVar.f;
        }
        qyVar.b = i5;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        kz kzVar;
        ru ruVar = new ru(super.onSaveInstanceState());
        rr rrVar = this.w;
        if (rrVar != null && (kzVar = rrVar.b) != null) {
            ruVar.a = kzVar.a;
        }
        ruVar.b = s();
        return ruVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.H = false;
            actionMasked = 0;
        }
        if (!this.H) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!zOnTouchEvent) {
                    this.H = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }

    public final void p(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void q(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.c;
            if (textView != null && E(textView)) {
                removeView(this.c);
                this.u.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                nu nuVar = new nu(context);
                this.c = nuVar;
                nuVar.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!E(this.c)) {
                C(this.c, true);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.t = charSequence;
    }

    public final void r(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.b;
            if (textView != null && E(textView)) {
                removeView(this.b);
                this.u.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                nu nuVar = new nu(context);
                this.b = nuVar;
                nuVar.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.k;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!E(this.b)) {
                C(this.b, true);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.s = charSequence;
    }

    public final boolean s() {
        mh mhVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (mhVar = actionMenuView.c) == null || !mhVar.l()) ? false : true;
    }

    public final boolean t() {
        mh mhVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (mhVar = actionMenuView.c) == null || !mhVar.m()) ? false : true;
    }
}
