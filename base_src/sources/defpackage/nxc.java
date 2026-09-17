package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public class nxc extends nxf {
    private Runnable a;
    private boolean b;
    OverScroller c;
    private int d;
    private int e;
    private int f;
    private VelocityTracker g;

    public nxc() {
        this.d = -1;
        this.f = -1;
    }

    public nxc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.f = -1;
    }

    public int A(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw null;
    }

    public void B(CoordinatorLayout coordinatorLayout, View view) {
        throw null;
    }

    public boolean C(View view) {
        throw null;
    }

    public final int E(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return A(coordinatorLayout, view, z() - i, i2, i3);
    }

    public final void F(CoordinatorLayout coordinatorLayout, View view, int i) {
        A(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // defpackage.aae
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.b) {
            int i = this.d;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.e) > this.f) {
                this.e = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.d = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = C(view) && coordinatorLayout.m(view, x, y2);
            this.b = z;
            if (z) {
                this.e = y2;
                this.d = motionEvent.getPointerId(0);
                if (this.g == null) {
                    this.g = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.c;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.c.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7 A[ADDED_TO_REGION] */
    @Override // defpackage.aae
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        switch (motionEvent.getActionMasked()) {
            case 1:
                VelocityTracker velocityTracker3 = this.g;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                    this.g.computeCurrentVelocity(1000);
                    float yVelocity = this.g.getYVelocity(this.d);
                    int i = -y(view);
                    Runnable runnable = this.a;
                    if (runnable != null) {
                        view.removeCallbacks(runnable);
                        this.a = null;
                    }
                    if (this.c == null) {
                        this.c = new OverScroller(view.getContext());
                    }
                    this.c.fling(0, G(), 0, Math.round(yVelocity), 0, 0, i, 0);
                    if (this.c.computeScrollOffset()) {
                        nxb nxbVar = new nxb(this, coordinatorLayout, view);
                        this.a = nxbVar;
                        gl.A(view, nxbVar);
                        z = true;
                    } else {
                        B(coordinatorLayout, view);
                        z = true;
                    }
                } else {
                    z = false;
                }
                this.b = false;
                this.d = -1;
                velocityTracker = this.g;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.g = null;
                }
                velocityTracker2 = this.g;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                return !this.b || z;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.d);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i2 = this.e;
                this.e = y;
                E(coordinatorLayout, view, i2 - y, x(view), 0);
                z = false;
                velocityTracker2 = this.g;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (this.b) {
                }
            case 3:
                z = false;
                this.b = false;
                this.d = -1;
                velocityTracker = this.g;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.g = null;
                }
                velocityTracker2 = this.g;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (this.b) {
                }
            case 4:
            case 5:
            default:
                z = false;
                velocityTracker2 = this.g;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (this.b) {
                }
            case 6:
                int i3 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.d = motionEvent.getPointerId(i3);
                this.e = (int) (motionEvent.getY(i3) + 0.5f);
                z = false;
                velocityTracker2 = this.g;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (this.b) {
                }
        }
    }

    public int x(View view) {
        throw null;
    }

    public int y(View view) {
        throw null;
    }

    public int z() {
        throw null;
    }
}
