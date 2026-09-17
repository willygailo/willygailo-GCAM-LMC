package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes2.dex */
public final class qr implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public final /* synthetic */ RecyclerView e;
    public Interpolator d = RecyclerView.a;
    private boolean f = false;
    private boolean g = false;

    public qr(RecyclerView recyclerView) {
        this.e = recyclerView;
        this.c = new OverScroller(recyclerView.getContext(), RecyclerView.a);
    }

    private final void d() {
        this.e.removeCallbacks(this);
        gl.A(this.e, this);
    }

    public final void a() {
        if (this.f) {
            this.g = true;
        } else {
            d();
        }
    }

    public final void b(int i, int i2, int i3, Interpolator interpolator) {
        int iMin;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            int width = iAbs > iAbs2 ? this.e.getWidth() : this.e.getHeight();
            if (iAbs <= iAbs2) {
                iAbs = iAbs2;
            }
            iMin = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        } else {
            iMin = i3;
        }
        if (interpolator == null) {
            interpolator = RecyclerView.a;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(this.e.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        this.e.W(2);
        this.c.startScroll(0, 0, i, i2, iMin);
        a();
    }

    public final void c() {
        this.e.removeCallbacks(this);
        this.c.abortAnimation();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        boolean z;
        int i3;
        RecyclerView recyclerView = this.e;
        if (recyclerView.m == null) {
            c();
            return;
        }
        this.g = false;
        this.f = true;
        recyclerView.t();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i4 = currX - this.a;
            int i5 = currY - this.b;
            this.a = currX;
            this.b = currY;
            RecyclerView recyclerView2 = this.e;
            int[] iArr = recyclerView2.Q;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView2.ae(i4, i5, iArr, null, 1)) {
                int[] iArr2 = this.e.Q;
                i4 -= iArr2[0];
                i5 -= iArr2[1];
            }
            if (this.e.getOverScrollMode() != 2) {
                this.e.s(i4, i5);
            }
            RecyclerView recyclerView3 = this.e;
            if (recyclerView3.l != null) {
                int[] iArr3 = recyclerView3.Q;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView3.R(i4, i5, iArr3);
                RecyclerView recyclerView4 = this.e;
                int[] iArr4 = recyclerView4.Q;
                i2 = iArr4[0];
                i = iArr4[1];
                i4 -= i2;
                i5 -= i;
                qo qoVar = recyclerView4.m.t;
                if (qoVar != null && !qoVar.e && qoVar.f) {
                    int iA = recyclerView4.L.a();
                    if (iA == 0) {
                        qoVar.f();
                    } else if (qoVar.b >= iA) {
                        qoVar.b = iA - 1;
                        qoVar.e(i2, i);
                    } else {
                        qoVar.e(i2, i);
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (!this.e.o.isEmpty()) {
                this.e.invalidate();
            }
            RecyclerView recyclerView5 = this.e;
            int[] iArr5 = recyclerView5.Q;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView5.x(i2, i, i4, i5, null, 1, iArr5);
            RecyclerView recyclerView6 = this.e;
            int[] iArr6 = recyclerView6.Q;
            int i6 = i4 - iArr6[0];
            int i7 = i5 - iArr6[1];
            if (i2 != 0) {
                recyclerView6.y(i2, i);
            } else if (i != 0) {
                i2 = 0;
                recyclerView6.y(i2, i);
            } else {
                i = 0;
                i2 = 0;
            }
            if (!this.e.awakenScrollBars()) {
                this.e.invalidate();
            }
            int currX2 = overScroller.getCurrX();
            int finalX = overScroller.getFinalX();
            int currY2 = overScroller.getCurrY();
            int finalY = overScroller.getFinalY();
            if (overScroller.isFinished()) {
                z = true;
            } else if (currX2 != finalX && i6 == 0) {
                z = false;
                i6 = 0;
            } else if (currY2 == finalY || i7 != 0) {
                z = true;
            } else {
                z = false;
                i7 = 0;
            }
            RecyclerView recyclerView7 = this.e;
            qo qoVar2 = recyclerView7.m.t;
            if ((qoVar2 == null || !qoVar2.e) && z) {
                if (recyclerView7.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i6 < 0) {
                        i3 = -currVelocity;
                    } else {
                        i3 = i6 > 0 ? currVelocity : 0;
                    }
                    if (i7 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i7 <= 0) {
                        currVelocity = 0;
                    }
                    RecyclerView recyclerView8 = this.e;
                    if (i3 < 0) {
                        recyclerView8.A();
                        if (recyclerView8.A.isFinished()) {
                            recyclerView8.A.onAbsorb(-i3);
                        }
                    } else if (i3 > 0) {
                        recyclerView8.B();
                        if (recyclerView8.C.isFinished()) {
                            recyclerView8.C.onAbsorb(i3);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView8.C();
                        if (recyclerView8.B.isFinished()) {
                            recyclerView8.B.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView8.z();
                        if (recyclerView8.D.isFinished()) {
                            recyclerView8.D.onAbsorb(currVelocity);
                        }
                    }
                    if (i3 != 0 || currVelocity != 0) {
                        gl.z(recyclerView8);
                    }
                }
                this.e.K.b();
            } else {
                a();
                RecyclerView recyclerView9 = this.e;
                ow owVar = recyclerView9.J;
                if (owVar != null) {
                    owVar.a(recyclerView9, i2, i);
                }
            }
        }
        qo qoVar3 = this.e.m.t;
        if (qoVar3 != null && qoVar3.e) {
            qoVar3.e(0, 0);
        }
        this.f = false;
        if (this.g) {
            d();
        } else {
            this.e.W(0);
            this.e.ab(1);
        }
    }
}
