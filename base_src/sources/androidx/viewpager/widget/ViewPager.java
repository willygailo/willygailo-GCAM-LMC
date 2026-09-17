package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import defpackage.aby;
import defpackage.aku;
import defpackage.akv;
import defpackage.akw;
import defpackage.akx;
import defpackage.aky;
import defpackage.akz;
import defpackage.ala;
import defpackage.alb;
import defpackage.gl;
import defpackage.hn;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] a = {R.attr.layout_gravity};
    private static final Interpolator f = new aby(2);
    private boolean A;
    private int B;
    private final Runnable C;
    private int D;
    public EdgeEffect b;
    public EdgeEffect c;
    public List d;
    public List e;
    private final ArrayList g;
    private final akx h;
    private final Rect i;
    private Scroller j;
    private float k;
    private float l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private float t;
    private float u;
    private float v;
    private float w;
    private int x;
    private VelocityTracker y;
    private boolean z;

    public ViewPager(Context context) {
        super(context);
        this.g = new ArrayList();
        this.h = new akx();
        this.i = new Rect();
        this.k = -3.4028235E38f;
        this.l = Float.MAX_VALUE;
        this.s = true;
        this.x = -1;
        this.z = true;
        this.C = new aku(this);
        this.D = 0;
        e(context);
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new ArrayList();
        this.h = new akx();
        this.i = new Rect();
        this.k = -3.4028235E38f;
        this.l = Float.MAX_VALUE;
        this.s = true;
        this.x = -1;
        this.z = true;
        this.C = new aku(this);
        this.D = 0;
        e(context);
    }

    private final int i() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final Rect j(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private final boolean k(int i) {
        int i2;
        if (this.g.size() == 0) {
            if (this.z) {
                return false;
            }
            this.A = false;
            h(0, 0.0f);
            if (this.A) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        int i3 = i();
        float scrollX = i3 > 0 ? getScrollX() / i3 : 0.0f;
        float f2 = i3 > 0 ? 0.0f / i3 : 0.0f;
        akx akxVar = null;
        int i4 = 0;
        boolean z = true;
        int i5 = -1;
        float f3 = 0.0f;
        while (i4 < this.g.size()) {
            akx akxVar2 = (akx) this.g.get(i4);
            if (!z && akxVar2.b != (i2 = i5 + 1)) {
                akx akxVar3 = this.h;
                akxVar3.e = f3 + 0.0f + f2;
                akxVar3.b = i2;
                throw null;
            }
            f3 = akxVar2.e;
            float f4 = akxVar2.d;
            float f5 = f3 + 0.0f + f2;
            if (!z && scrollX < f3) {
                break;
            }
            if (scrollX < f5 || i4 == this.g.size() - 1) {
                akxVar = akxVar2;
                break;
            }
            i5 = akxVar2.b;
            float f6 = akxVar2.d;
            i4++;
            akxVar = akxVar2;
            z = false;
        }
        float fI = i();
        int i6 = akxVar.b;
        float f7 = akxVar.e;
        float f8 = akxVar.d;
        this.A = false;
        h(i6, ((i / fI) - f7) / ((0.0f / fI) + 0.0f));
        if (this.A) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private final void l() {
        for (int i = 0; i < this.g.size(); i++) {
            boolean z = ((akx) this.g.get(i)).c;
        }
    }

    public final void a(int i) {
        if (this.D == i) {
            return;
        }
        this.D = i;
        List list = this.d;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ala alaVar = (ala) this.d.get(i2);
                if (alaVar != null) {
                    alaVar.a(i);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3).getVisibility() == 0) {
                    f();
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i).getVisibility() == 0) {
                f();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        ((aky) layoutParams).a |= view.getClass().getAnnotation(akw.class) != null;
        super.addView(view, i, layoutParams);
    }

    public final void b(boolean z) {
        if (this.m != z) {
            this.m = z;
        }
    }

    public final boolean c(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        boolean zRequestFocus = false;
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i == 17 || i == 1 || i == 66 || i != 2) {
            }
        } else if (i == 17) {
            int i2 = j(this.i, viewFindNextFocus).left;
            int i3 = j(this.i, viewFindFocus).left;
            if (viewFindFocus == null || i2 < i3) {
                zRequestFocus = viewFindNextFocus.requestFocus();
            }
        } else if (i == 66) {
            int i4 = j(this.i, viewFindNextFocus).left;
            int i5 = j(this.i, viewFindFocus).left;
            if (viewFindFocus == null || i4 > i5) {
                zRequestFocus = viewFindNextFocus.requestFocus();
            }
        }
        if (zRequestFocus) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zRequestFocus;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof aky) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.j.isFinished() || !this.j.computeScrollOffset()) {
            l();
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.j.getCurrX();
        int currY = this.j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!k(currX)) {
                this.j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        gl.z(this);
    }

    protected final boolean d(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && d(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zC;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                switch (keyEvent.getKeyCode()) {
                    case 21:
                        zC = !keyEvent.hasModifiers(2) ? c(17) : false;
                        break;
                    case 22:
                        zC = !keyEvent.hasModifiers(2) ? c(66) : false;
                        break;
                    case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        if (!keyEvent.hasNoModifiers()) {
                            zC = !keyEvent.hasModifiers(1) ? false : c(1);
                        } else {
                            zC = c(2);
                        }
                        break;
                    default:
                        zC = false;
                        break;
                }
            } else {
                zC = false;
            }
            if (!zC) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getVisibility() == 0) {
                f();
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean zDraw;
        super.draw(canvas);
        if (getOverScrollMode() != 0) {
            this.b.finish();
            this.c.finish();
            return;
        }
        if (this.b.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.k * width);
            this.b.setSize(height, width);
            zDraw = this.b.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.c.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.l + 1.0f)) * width2);
            this.c.setSize((height2 - paddingTop) - paddingBottom, width2);
            zDraw |= this.c.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            gl.z(this);
        }
    }

    final void e(Context context) {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.j = new Scroller(context, f);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.r = viewConfiguration.getScaledPagingTouchSlop();
        viewConfiguration.getScaledMaximumFlingVelocity();
        this.b = new EdgeEffect(context);
        this.c = new EdgeEffect(context);
        this.p = (int) (f2 * 16.0f);
        gl.F(this, new akz());
        if (gl.d(this) == 0) {
            gl.M(this, 1);
        }
        gl.N(this, new akv(this));
    }

    final void f() {
        if (this.g.size() <= 0) {
            return;
        }
        Object obj = ((akx) this.g.get(0)).a;
        throw null;
    }

    final akx g() {
        for (int i = 0; i < this.g.size(); i++) {
            akx akxVar = (akx) this.g.get(i);
            if (akxVar.b == 0) {
                return akxVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aky();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aky(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    protected final void h(int i, float f2) {
        int width;
        if (this.B > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                aky akyVar = (aky) childAt.getLayoutParams();
                if (akyVar.a) {
                    switch (akyVar.b & 7) {
                        case 1:
                            width = paddingLeft;
                            paddingLeft = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 2:
                        case 4:
                        default:
                            width = paddingLeft;
                            break;
                        case 3:
                            width = childAt.getWidth() + paddingLeft;
                            break;
                        case 5:
                            int measuredWidth = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            width = paddingLeft;
                            paddingLeft = measuredWidth;
                            break;
                    }
                    int left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        List list = this.d;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ala alaVar = (ala) this.d.get(i3);
                if (alaVar != null) {
                    alaVar.b(i, f2);
                }
            }
        }
        this.A = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.C);
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            this.j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.x = -1;
            this.n = false;
            this.o = false;
            VelocityTracker velocityTracker = this.y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.y = null;
            }
            this.b.onRelease();
            this.c.onRelease();
            if (this.b.isFinished()) {
                this.c.isFinished();
            }
            return false;
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.v = x;
            this.t = x;
            float y = motionEvent.getY();
            this.w = y;
            this.u = y;
            this.x = motionEvent.getPointerId(0);
            this.o = false;
            this.j.computeScrollOffset();
            if (hn.a(this.b) == 0.0f && hn.a(this.c) == 0.0f) {
                l();
                this.n = false;
            } else {
                this.n = true;
                a(1);
                if (hn.a(this.b) != 0.0f) {
                    hn.b(this.b, 0.0f, 1.0f - (this.u / getHeight()));
                }
                if (hn.a(this.c) != 0.0f) {
                    hn.b(this.c, 0.0f, this.u / getHeight());
                }
            }
        } else {
            if (this.n) {
                return true;
            }
            if (this.o) {
                return false;
            }
            switch (action) {
                case 2:
                    int i = this.x;
                    if (i != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i);
                        float x2 = motionEvent.getX(iFindPointerIndex);
                        float f3 = x2 - this.t;
                        float fAbs = Math.abs(f3);
                        float y2 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y2 - this.w);
                        if (f3 != 0.0f) {
                            float f4 = this.t;
                            if (this.s) {
                                f2 = y2;
                                if (d(this, false, (int) f3, (int) x2, (int) y2)) {
                                    this.t = x2;
                                    this.u = f2;
                                    this.o = true;
                                    return false;
                                }
                            } else if (f4 < this.q && f3 > 0.0f) {
                                f2 = y2;
                            } else if (f4 <= getWidth() - this.q || f3 >= 0.0f) {
                                f2 = y2;
                                if (d(this, false, (int) f3, (int) x2, (int) y2)) {
                                    this.t = x2;
                                    this.u = f2;
                                    this.o = true;
                                    return false;
                                }
                            } else {
                                f2 = y2;
                            }
                        } else {
                            f2 = y2;
                        }
                        float f5 = this.r;
                        if (fAbs > f5 && fAbs * 0.5f > fAbs2) {
                            this.n = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            a(1);
                            this.t = f3 > 0.0f ? this.v + this.r : this.v - this.r;
                            this.u = f2;
                            b(true);
                        } else if (fAbs2 > f5) {
                            this.o = true;
                        }
                        if (this.n) {
                            float f6 = this.t - x2;
                            this.t = x2;
                            float height = f2 / getHeight();
                            float width = f6 / getWidth();
                            float fB = (hn.a(this.b) != 0.0f ? -hn.b(this.b, -width, 1.0f - height) : hn.a(this.c) != 0.0f ? hn.b(this.c, width, height) : 0.0f) * getWidth();
                            if (Math.abs(f6 - fB) >= 1.0E-4f) {
                                getScrollX();
                                i();
                                akx akxVar = (akx) this.g.get(0);
                                ArrayList arrayList = this.g;
                                akx akxVar2 = (akx) arrayList.get(arrayList.size() - 1);
                                if (akxVar.b != 0) {
                                    float f7 = akxVar.e;
                                }
                                int i2 = akxVar2.b;
                                throw null;
                            }
                            if (fB != 0.0f) {
                                gl.z(this);
                            }
                        }
                    }
                    break;
                case 6:
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.x) {
                        int i3 = actionIndex == 0 ? 1 : 0;
                        this.t = motionEvent.getX(i3);
                        this.x = motionEvent.getPointerId(i3);
                        VelocityTracker velocityTracker2 = this.y;
                        if (velocityTracker2 != null) {
                            velocityTracker2.clear();
                        }
                    }
                    break;
            }
        }
        if (this.y == null) {
            this.y = VelocityTracker.obtain();
        }
        this.y.addMovement(motionEvent);
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int measuredWidth;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                aky akyVar = (aky) childAt.getLayoutParams();
                if (akyVar.a) {
                    int i9 = akyVar.b;
                    int i10 = i9 & 112;
                    switch (i9 & 7) {
                        case 1:
                            measuredWidth = paddingLeft;
                            paddingLeft = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 2:
                        case 4:
                        default:
                            measuredWidth = paddingLeft;
                            break;
                        case 3:
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            int measuredWidth2 = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            measuredWidth = paddingLeft;
                            paddingLeft = measuredWidth2;
                            break;
                    }
                    switch (i10) {
                        case 16:
                            measuredHeight = paddingTop;
                            paddingTop = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            break;
                        case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            break;
                        case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                            int measuredHeight2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                            measuredHeight = paddingTop;
                            paddingTop = measuredHeight2;
                            break;
                        default:
                            measuredHeight = paddingTop;
                            break;
                    }
                    int i11 = paddingLeft + scrollX;
                    childAt.layout(i11, paddingTop, childAt.getMeasuredWidth() + i11, paddingTop + childAt.getMeasuredHeight());
                    i7++;
                    paddingLeft = measuredWidth;
                    paddingTop = measuredHeight;
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && !((aky) childAt2.getLayoutParams()).a) {
                f();
            }
        }
        this.B = i7;
        if (this.z) {
            akx akxVarG = g();
            int i13 = akxVarG != null ? (int) (i() * Math.max(this.k, Math.min(akxVarG.e, this.l))) : 0;
            l();
            z2 = false;
            scrollTo(i13, 0);
            k(i13);
        } else {
            z2 = false;
        }
        this.z = z2;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        aky akyVar;
        aky akyVar2;
        int i3;
        int i4;
        int i5;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.q = Math.min(measuredWidth / 10, this.p);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (akyVar2 = (aky) childAt.getLayoutParams()) != null && akyVar2.a) {
                int i8 = akyVar2.b;
                int i9 = i8 & 7;
                int i10 = i8 & 112;
                boolean z = true;
                boolean z2 = i10 == 48 || i10 == 80;
                if (i9 != 3 && i9 != 5) {
                    z = false;
                }
                int i11 = Integer.MIN_VALUE;
                if (z2) {
                    i11 = 1073741824;
                    i3 = Integer.MIN_VALUE;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                if (akyVar2.width == -2) {
                    i4 = paddingLeft;
                } else if (akyVar2.width != -1) {
                    i4 = akyVar2.width;
                    i11 = 1073741824;
                } else {
                    i4 = paddingLeft;
                    i11 = 1073741824;
                }
                if (akyVar2.height != -2) {
                    i5 = akyVar2.height != -1 ? akyVar2.height : measuredHeight;
                } else {
                    i5 = measuredHeight;
                    i7 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((akyVar = (aky) childAt2.getLayoutParams()) == null || !akyVar.a)) {
                float f2 = akyVar.c;
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * 0.0f), 1073741824), iMakeMeasureSpec);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            if (getChildAt(i2).getVisibility() == 0) {
                f();
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof alb)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        alb albVar = (alb) parcelable;
        super.onRestoreInstanceState(albVar.d);
        int i = albVar.a;
        Parcelable parcelable2 = albVar.b;
        ClassLoader classLoader = albVar.e;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        alb albVar = new alb(super.onSaveInstanceState());
        albVar.a = 0;
        return albVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (i3 <= 0 || this.g.isEmpty()) {
                akx akxVarG = g();
                int iMin = (int) ((akxVarG != null ? Math.min(akxVarG.e, this.l) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
                if (iMin != getScrollX()) {
                    l();
                    scrollTo(iMin, getScrollY());
                    return;
                }
                return;
            }
            if (!this.j.isFinished()) {
                Scroller scroller = this.j;
                i();
                scroller.setFinalX(0);
            } else {
                int paddingLeft = getPaddingLeft();
                scrollTo((int) ((getScrollX() / ((i3 - getPaddingLeft()) - getPaddingRight())) * ((i - paddingLeft) - getPaddingRight())), getScrollY());
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }
}
