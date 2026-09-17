package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class acb {
    private static final Interpolator e = new aby(0);
    public int a;
    public int b;
    public View d;
    private float[] f;
    private float[] g;
    private float[] h;
    private float[] i;
    private int[] j;
    private int[] k;
    private int[] l;
    private int m;
    private VelocityTracker n;
    private final float o;
    private float p;
    private int q;
    private final OverScroller r;
    private final aca s;
    private boolean t;
    private final ViewGroup u;
    public int c = -1;
    private final Runnable v = new abz(this);

    private acb(Context context, ViewGroup viewGroup, aca acaVar) {
        if (acaVar == null) {
            throw new NullPointerException("Callback may not be null");
        }
        this.u = viewGroup;
        this.s = acaVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.q = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.b = viewConfiguration.getScaledTouchSlop();
        this.o = viewConfiguration.getScaledMaximumFlingVelocity();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.r = new OverScroller(context, e);
    }

    public static acb b(ViewGroup viewGroup, aca acaVar) {
        return new acb(viewGroup.getContext(), viewGroup, acaVar);
    }

    private final int m(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.u.getWidth();
        float f = width / 2;
        float fSin = f + (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f);
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    private final void n(int i) {
        if (this.f == null || !h(i)) {
            return;
        }
        this.f[i] = 0.0f;
        this.g[i] = 0.0f;
        this.h[i] = 0.0f;
        this.i[i] = 0.0f;
        this.j[i] = 0;
        this.k[i] = 0;
        this.l[i] = 0;
        this.m = ((1 << i) ^ (-1)) & this.m;
    }

    private final void o(float f, float f2) {
        this.t = true;
        this.s.d(this.d, f, f2);
        this.t = false;
        if (this.a == 1) {
            f(0);
        }
    }

    private final void p() {
        this.n.computeCurrentVelocity(1000, this.o);
        o(v(this.n.getXVelocity(this.c), this.p, this.o), v(this.n.getYVelocity(this.c), this.p, this.o));
    }

    private final void q(float f, float f2, int i) {
        x(f, f2, i);
        x(f2, f, i);
        x(f, f2, i);
        x(f2, f, i);
    }

    private final void r(float f, float f2, int i) {
        float[] fArr = this.f;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.g;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.h;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.i;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.j;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.k;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.l;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f = fArr2;
            this.g = fArr3;
            this.h = fArr4;
            this.i = fArr5;
            this.j = iArr;
            this.k = iArr2;
            this.l = iArr3;
        }
        float[] fArr9 = this.f;
        this.h[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.g;
        this.i[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.j;
        int i3 = (int) f;
        int i4 = (int) f2;
        int i5 = i3 < this.u.getLeft() + this.q ? 1 : 0;
        if (i4 < this.u.getTop() + this.q) {
            i5 |= 4;
        }
        if (i3 > this.u.getRight() - this.q) {
            i5 |= 2;
        }
        if (i4 > this.u.getBottom() - this.q) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.m |= 1 << i;
    }

    private final void s(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (u(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.h[pointerId] = x;
                this.i[pointerId] = y;
            }
        }
    }

    private final boolean t(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        int iA = this.s.a(view);
        int iH = this.s.h();
        if (iA > 0 && iH > 0) {
            int i = this.b;
            return (f * f) + (f2 * f2) > ((float) (i * i));
        }
        if (iA > 0) {
            return Math.abs(f) > ((float) this.b);
        }
        return iH > 0 && Math.abs(f2) > ((float) this.b);
    }

    private final boolean u(int i) {
        return h(i);
    }

    private static final float v(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        if (fAbs > f3) {
            return f > 0.0f ? f3 : -f3;
        }
        return f;
    }

    private static final int w(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        if (iAbs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    private final void x(float f, float f2, int i) {
        Math.abs(f);
        Math.abs(f2);
        int i2 = this.j[i];
    }

    public final View a(int i, int i2) {
        for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.u.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void c() {
        this.c = -1;
        float[] fArr = this.f;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0.0f);
            Arrays.fill(this.i, 0.0f);
            Arrays.fill(this.j, 0);
            Arrays.fill(this.k, 0);
            Arrays.fill(this.l, 0);
            this.m = 0;
        }
        VelocityTracker velocityTracker = this.n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.n = null;
        }
    }

    public final void d(View view, int i) {
        if (view.getParent() == this.u) {
            this.d = view;
            this.c = i;
            this.s.b(view, i);
            f(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + ")");
    }

    public final void e(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int i = 0;
        if (actionMasked == 0) {
            c();
            actionMasked = 0;
        }
        if (this.n == null) {
            this.n = VelocityTracker.obtain();
        }
        this.n.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View viewA = a((int) x, (int) y);
                r(x, y, pointerId);
                k(viewA, pointerId);
                int i2 = this.j[pointerId];
                break;
            case 1:
                if (this.a == 1) {
                    p();
                }
                c();
                break;
            case 2:
                if (this.a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i);
                        if (u(pointerId2)) {
                            float x2 = motionEvent.getX(i);
                            float y2 = motionEvent.getY(i);
                            float f = x2 - this.f[pointerId2];
                            float f2 = y2 - this.g[pointerId2];
                            q(f, f2, pointerId2);
                            if (this.a != 1) {
                                View viewA2 = a((int) x2, (int) y2);
                                if (!t(viewA2, f, f2) || !k(viewA2, pointerId2)) {
                                }
                            }
                        }
                        i++;
                    }
                } else if (u(this.c) && (iFindPointerIndex = motionEvent.findPointerIndex(this.c)) != -1) {
                    float x3 = motionEvent.getX(iFindPointerIndex);
                    float y3 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.h;
                    int i3 = this.c;
                    int i4 = (int) (x3 - fArr[i3]);
                    int i5 = (int) (y3 - this.i[i3]);
                    int left = this.d.getLeft() + i4;
                    int top = this.d.getTop() + i5;
                    int left2 = this.d.getLeft();
                    int top2 = this.d.getTop();
                    if (i4 != 0) {
                        left = this.s.f(this.d, left);
                        gl.x(this.d, left - left2);
                    }
                    if (i5 != 0) {
                        top = this.s.g(this.d, top);
                        gl.y(this.d, top - top2);
                    }
                    if (i4 != 0 || i5 != 0) {
                        this.s.i(this.d, left, top);
                    }
                }
                s(motionEvent);
                break;
            case 3:
                if (this.a == 1) {
                    o(0.0f, 0.0f);
                }
                c();
                break;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                r(x4, y4, pointerId3);
                if (this.a != 0) {
                    int i6 = (int) x4;
                    int i7 = (int) y4;
                    View view = this.d;
                    if (view != null && i6 >= view.getLeft() && i6 < view.getRight() && i7 >= view.getTop() && i7 < view.getBottom()) {
                        k(this.d, pointerId3);
                    }
                } else {
                    k(a((int) x4, (int) y4), pointerId3);
                    int i8 = this.j[pointerId3];
                }
                break;
            case 6:
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.a == 1 && pointerId4 == this.c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (i < pointerCount2) {
                        int pointerId5 = motionEvent.getPointerId(i);
                        if (pointerId5 != this.c) {
                            View viewA3 = a((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                            View view2 = this.d;
                            if (viewA3 == view2 && k(view2, pointerId5)) {
                                if (this.c == -1) {
                                    p();
                                }
                            }
                        }
                        i++;
                    }
                    p();
                }
                n(pointerId4);
                break;
        }
    }

    final void f(int i) {
        this.u.removeCallbacks(this.v);
        if (this.a != i) {
            this.a = i;
            this.s.c(i);
            if (this.a == 0) {
                this.d = null;
            }
        }
    }

    public final boolean g(int i, int i2, int i3, int i4) {
        int i5;
        int left = this.d.getLeft();
        int top = this.d.getTop();
        int i6 = i - left;
        int i7 = i2 - top;
        if (i6 != 0) {
            i5 = i6;
        } else {
            if (i7 == 0) {
                this.r.abortAnimation();
                f(0);
                return false;
            }
            i5 = 0;
        }
        View view = this.d;
        int iW = w(i3, (int) this.p, (int) this.o);
        int iW2 = w(i4, (int) this.p, (int) this.o);
        int iAbs = Math.abs(i5);
        int iAbs2 = Math.abs(i7);
        int iAbs3 = Math.abs(iW);
        int iAbs4 = Math.abs(iW2);
        int i8 = iAbs3 + iAbs4;
        int i9 = iAbs + iAbs2;
        this.r.startScroll(left, top, i5, i7, (int) ((m(i5, iW, this.s.a(view)) * (iW != 0 ? iAbs3 / i8 : iAbs / i9)) + (m(i7, iW2, this.s.h()) * (iW2 != 0 ? iAbs4 / i8 : iAbs2 / i9))));
        f(2);
        return true;
    }

    public final boolean h(int i) {
        return ((1 << i) & this.m) != 0;
    }

    public final boolean i(int i, int i2) {
        if (this.t) {
            return g(i, i2, (int) this.n.getXVelocity(this.c), (int) this.n.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    public final boolean j(MotionEvent motionEvent) {
        View viewA;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
            actionMasked = 0;
        }
        if (this.n == null) {
            this.n = VelocityTracker.obtain();
        }
        this.n.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                r(x, y, pointerId);
                View viewA2 = a((int) x, (int) y);
                if (viewA2 == this.d && this.a == 2) {
                    k(viewA2, pointerId);
                }
                int i = this.j[pointerId];
                break;
            case 1:
            case 3:
                c();
                break;
            case 2:
                if (this.f != null && this.g != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (u(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f[pointerId2];
                            float f2 = y2 - this.g[pointerId2];
                            View viewA3 = a((int) x2, (int) y2);
                            boolean zT = t(viewA3, f, f2);
                            if (zT) {
                                int left = viewA3.getLeft();
                                int iF = this.s.f(viewA3, ((int) f) + left);
                                int top = viewA3.getTop();
                                int iG = this.s.g(viewA3, ((int) f2) + top);
                                int iA = this.s.a(viewA3);
                                int iH = this.s.h();
                                if ((iA != 0 && (iA <= 0 || iF != left)) || (iH != 0 && (iH <= 0 || iG != top))) {
                                    q(f, f2, pointerId2);
                                    if (this.a != 1 || (zT && k(viewA3, pointerId2))) {
                                    }
                                }
                                s(motionEvent);
                            } else {
                                q(f, f2, pointerId2);
                                if (this.a != 1) {
                                }
                                s(motionEvent);
                            }
                            break;
                        }
                    }
                    s(motionEvent);
                }
                break;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                r(x3, y3, pointerId3);
                int i3 = this.a;
                if (i3 == 0) {
                    int i4 = this.j[pointerId3];
                } else if (i3 == 2 && (viewA = a((int) x3, (int) y3)) == this.d) {
                    k(viewA, pointerId3);
                }
                break;
            case 6:
                n(motionEvent.getPointerId(actionIndex));
                break;
        }
        return this.a == 1;
    }

    final boolean k(View view, int i) {
        if (view == this.d && this.c == i) {
            return true;
        }
        if (view == null || !this.s.e(view, i)) {
            return false;
        }
        this.c = i;
        d(view, i);
        return true;
    }

    public final boolean l() {
        if (this.a == 2) {
            boolean zComputeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.d.getLeft();
            int top = currY - this.d.getTop();
            if (left != 0) {
                gl.x(this.d, left);
            }
            if (top != 0) {
                gl.y(this.d, top);
            }
            if (left != 0 || top != 0) {
                this.s.i(this.d, currX, currY);
            }
            if (!zComputeScrollOffset) {
                this.u.post(this.v);
            } else if (currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                this.u.post(this.v);
            }
        }
        return this.a == 2;
    }
}
