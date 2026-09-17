package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

/* JADX INFO: loaded from: classes2.dex */
public final class hm implements View.OnTouchListener {
    private static final int g = ViewConfiguration.getTapTimeout();
    final hk a;
    final View b;
    boolean c;
    boolean d;
    boolean e;
    public final ListView f;
    private final Interpolator h;
    private Runnable i;
    private final float[] j;
    private final float[] k;
    private final int l;
    private final float[] m;
    private final float[] n;
    private final float[] o;
    private boolean p;
    private boolean q;

    public hm(ListView listView) {
        hk hkVar = new hk();
        this.a = hkVar;
        this.h = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.j = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.m = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.n = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.o = fArr5;
        this.b = listView;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f = displayMetrics.density;
        float f2 = displayMetrics.density;
        float f3 = ((int) ((f * 1575.0f) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.l = g;
        hkVar.a = 500;
        hkVar.b = 500;
        this.f = listView;
    }

    static float a(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    private final float d(int i, float f, float f2, float f3) {
        float fA;
        float interpolation;
        float fA2 = a(this.j[i] * f2, 0.0f, this.k[i]);
        float fE = e(f2 - f, fA2) - e(f, fA2);
        if (fE >= 0.0f) {
            if (fE > 0.0f) {
                interpolation = this.h.getInterpolation(fE);
            } else {
                fA = 0.0f;
            }
            if (fA == 0.0f) {
                return 0.0f;
            }
            float f4 = this.m[i];
            float f5 = this.n[i];
            float f6 = this.o[i];
            float f7 = f4 * f3;
            return fA > 0.0f ? a(fA * f7, f5, f6) : -a((-fA) * f7, f5, f6);
        }
        interpolation = -this.h.getInterpolation(-fE);
        fA = a(interpolation, -1.0f, 1.0f);
        if (fA == 0.0f) {
            return 0.0f;
        }
        float f8 = this.m[i];
        float f9 = this.n[i];
        float f10 = this.o[i];
        float f11 = f8 * f3;
        if (fA > 0.0f) {
        }
    }

    private final float e(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.e) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    private final void f() {
        int i = 0;
        if (this.c) {
            this.e = false;
            return;
        }
        hk hkVar = this.a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - hkVar.e);
        int i3 = hkVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        hkVar.i = i;
        hkVar.h = hkVar.a(jCurrentAnimationTimeMillis);
        hkVar.g = jCurrentAnimationTimeMillis;
    }

    final boolean b() {
        ListView listView;
        int count;
        hk hkVar = this.a;
        float f = hkVar.d;
        int iAbs = (int) (f / Math.abs(f));
        float f2 = hkVar.c;
        int iAbs2 = (int) (f2 / Math.abs(f2));
        if (iAbs != 0 && (count = (listView = this.f).getCount()) != 0) {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs > 0) {
                if (i < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight()) {
                    return true;
                }
            } else if (iAbs < 0 && (firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0)) {
                return true;
            }
        }
        if (iAbs2 == 0) {
        }
        return false;
    }

    public final void c(boolean z) {
        if (this.q && !z) {
            f();
        }
        this.q = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (!this.q) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.d = true;
                this.p = false;
                float fD = d(0, motionEvent.getX(), view.getWidth(), this.b.getWidth());
                float fD2 = d(1, motionEvent.getY(), view.getHeight(), this.b.getHeight());
                hk hkVar = this.a;
                hkVar.c = fD;
                hkVar.d = fD2;
                if (!this.e && b()) {
                    if (this.i == null) {
                        this.i = new hl(this);
                    }
                    this.e = true;
                    this.c = true;
                    if (!this.p || (i = this.l) <= 0) {
                        this.i.run();
                    } else {
                        gl.B(this.b, this.i, i);
                    }
                    this.p = true;
                }
                return false;
            case 1:
            case 3:
                f();
                return false;
            case 2:
                float fD3 = d(0, motionEvent.getX(), view.getWidth(), this.b.getWidth());
                float fD4 = d(1, motionEvent.getY(), view.getHeight(), this.b.getHeight());
                hk hkVar2 = this.a;
                hkVar2.c = fD3;
                hkVar2.d = fD4;
                if (!this.e) {
                    if (this.i == null) {
                        this.i = new hl(this);
                    }
                    this.e = true;
                    this.c = true;
                    if (this.p) {
                        this.i.run();
                    } else {
                        this.i.run();
                    }
                    this.p = true;
                }
                return false;
            default:
                return false;
        }
    }
}
