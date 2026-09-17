package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.el;
import defpackage.fr;
import defpackage.fs;
import defpackage.fx;
import defpackage.gl;
import defpackage.gr;
import defpackage.gy;
import defpackage.jp;
import defpackage.ke;
import defpackage.lj;
import defpackage.lx;
import defpackage.ly;
import defpackage.lz;
import defpackage.ma;
import defpackage.nz;
import defpackage.oa;
import defpackage.px;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements nz, fr, fs {
    static final int[] a = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    private final Runnable A;
    private final px B;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public lz h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int k;
    private ContentFrameLayout l;
    private oa m;
    private Drawable n;
    private boolean o;
    private boolean p;
    private int q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private gy u;
    private gy v;
    private gy w;
    private gy x;
    private OverScroller y;
    private final Runnable z;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.u = gy.a;
        this.v = gy.a;
        this.w = gy.a;
        this.x = gy.a;
        this.j = new lx(this);
        this.z = new ly(this, 1);
        this.A = new ly(this, 0);
        v(context);
        this.B = new px();
    }

    private final void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.n = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.o = context.getApplicationInfo().targetSdkVersion < 19;
        this.y = new OverScroller(context);
    }

    private static final boolean w(View view, Rect rect, boolean z) {
        boolean z2;
        ma maVar = (ma) view.getLayoutParams();
        if (maVar.leftMargin != rect.left) {
            maVar.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (maVar.topMargin != rect.top) {
            maVar.topMargin = rect.top;
            z2 = true;
        }
        if (maVar.rightMargin != rect.right) {
            maVar.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || maVar.bottomMargin == rect.bottom) {
            return z2;
        }
        maVar.bottomMargin = rect.bottom;
        return true;
    }

    @Override // defpackage.fr
    public final void a(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // defpackage.fr
    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.fr
    public final void c(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ma;
    }

    @Override // defpackage.fr
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.n == null || this.o) {
            return;
        }
        int bottom = this.c.getVisibility() == 0 ? (int) (this.c.getBottom() + this.c.getTranslationY() + 0.5f) : 0;
        this.n.setBounds(0, bottom, getWidth(), this.n.getIntrinsicHeight() + bottom);
        this.n.draw(canvas);
    }

    @Override // defpackage.fr
    public final boolean e(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.fs
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        b(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.nz
    public final void g() {
        j();
        this.m.f();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ma();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ma(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ma(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.B.b();
    }

    public final void h() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.nz
    public final void i(int i) {
        j();
        switch (i) {
            case 2:
                this.m.h();
                break;
            case 5:
                this.m.g();
                break;
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                this.d = true;
                this.o = getContext().getApplicationInfo().targetSdkVersion < 19;
                break;
        }
    }

    final void j() {
        oa oaVarF;
        if (this.l == null) {
            this.l = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof oa) {
                oaVarF = (oa) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of " + callbackFindViewById.getClass().getSimpleName());
                }
                oaVarF = ((Toolbar) callbackFindViewById).f();
            }
            this.m = oaVarF;
        }
    }

    public final void k(int i) {
        h();
        this.c.setTranslationY(-Math.max(0, Math.min(i, this.c.getHeight())));
    }

    public final void l(boolean z) {
        if (z != this.p) {
            this.p = z;
            if (z) {
                return;
            }
            h();
            k(0);
        }
    }

    @Override // defpackage.nz
    public final void m(Menu menu, lj ljVar) {
        j();
        this.m.k(menu, ljVar);
    }

    @Override // defpackage.nz
    public final void n() {
        j();
        this.m.l();
    }

    @Override // defpackage.nz
    public final void o(Window.Callback callback) {
        j();
        this.m.o(callback);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        gy gyVarM = gy.m(windowInsets, this);
        boolean zW = w(this.c, new Rect(gyVarM.b(), gyVarM.d(), gyVarM.c(), gyVarM.a()), false);
        gl.aa(this, gyVarM, this.r);
        gy gyVarJ = gyVarM.j(this.r.left, this.r.top, this.r.right, this.r.bottom);
        this.u = gyVarJ;
        if (!this.v.equals(gyVarJ)) {
            this.v = this.u;
            zW = true;
        }
        if (this.s.equals(this.r)) {
            if (zW) {
            }
            return gyVarM.g().i().h().n();
        }
        this.s.set(this.r);
        requestLayout();
        return gyVarM.g().i().h().n();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        gl.D(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ma maVar = (ma) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = maVar.leftMargin + paddingLeft;
                int i7 = maVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.c, i, 0, i2, 0);
        ma maVar = (ma) this.c.getLayoutParams();
        int iMax = Math.max(0, this.c.getMeasuredWidth() + maVar.leftMargin + maVar.rightMargin);
        int iMax2 = Math.max(0, this.c.getMeasuredHeight() + maVar.topMargin + maVar.bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        int iK = gl.k(this) & 256;
        if (iK != 0) {
            measuredHeight = this.k;
        } else {
            measuredHeight = this.c.getVisibility() != 8 ? this.c.getMeasuredHeight() : 0;
        }
        this.t.set(this.r);
        gy gyVar = this.u;
        this.w = gyVar;
        if (this.d || iK != 0) {
            el elVarB = el.b(gyVar.b(), this.w.d() + measuredHeight, this.w.c(), this.w.a());
            gr grVar = new gr(this.w);
            fx.m(elVarB, grVar);
            this.w = fx.l(grVar);
        } else {
            this.t.top += measuredHeight;
            Rect rect = this.t;
            rect.bottom = rect.bottom;
            this.w = this.w.j(0, measuredHeight, 0, 0);
        }
        w(this.l, this.t, true);
        if (!this.x.equals(this.w)) {
            gy gyVar2 = this.w;
            this.x = gyVar2;
            gl.q(this.l, gyVar2);
        }
        measureChildWithMargins(this.l, i, 0, i2, 0);
        ma maVar2 = (ma) this.l.getLayoutParams();
        int iMax3 = Math.max(iMax, this.l.getMeasuredWidth() + maVar2.leftMargin + maVar2.rightMargin);
        int iMax4 = Math.max(iMax2, this.l.getMeasuredHeight() + maVar2.topMargin + maVar2.bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.l.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.p || !z) {
            return false;
        }
        this.y.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.y.getFinalY() > this.c.getHeight()) {
            h();
            this.A.run();
        } else {
            h();
            this.z.run();
        }
        this.f = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.q + i2;
        this.q = i5;
        k(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        jp jpVar;
        ke keVar;
        this.B.c(i, 0);
        ActionBarContainer actionBarContainer = this.c;
        this.q = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        h();
        lz lzVar = this.h;
        if (lzVar == null || (keVar = (jpVar = (jp) lzVar).m) == null) {
            return;
        }
        keVar.a();
        jpVar.m = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.c.getVisibility() != 0) {
            return false;
        }
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.p || this.f) {
            return;
        }
        if (this.q <= this.c.getHeight()) {
            h();
            postDelayed(this.z, 600L);
        } else {
            h();
            postDelayed(this.A, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        j();
        int i2 = this.g ^ i;
        this.g = i;
        int i3 = i & 4;
        int i4 = i & 256;
        lz lzVar = this.h;
        if (lzVar != null) {
            jp jpVar = (jp) lzVar;
            jpVar.k = i4 == 0;
            if (i3 == 0 || i4 == 0) {
                if (jpVar.l) {
                    jpVar.l = false;
                    jpVar.x(true);
                }
            } else if (!jpVar.l) {
                jpVar.l = true;
                jpVar.x(true);
            }
        }
        if ((i2 & 256) == 0 || this.h == null) {
            return;
        }
        gl.D(this);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        lz lzVar = this.h;
        if (lzVar != null) {
            ((jp) lzVar).j = i;
        }
    }

    @Override // defpackage.nz
    public final void p(CharSequence charSequence) {
        j();
        this.m.p(charSequence);
    }

    @Override // defpackage.nz
    public final boolean q() {
        j();
        return this.m.q();
    }

    @Override // defpackage.nz
    public final boolean r() {
        j();
        return this.m.s();
    }

    @Override // defpackage.nz
    public final boolean s() {
        j();
        return this.m.t();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.nz
    public final boolean t() {
        j();
        return this.m.u();
    }

    @Override // defpackage.nz
    public final boolean u() {
        j();
        return this.m.v();
    }
}
