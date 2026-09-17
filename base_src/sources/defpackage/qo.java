package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.lens.sdk.LensApi;

/* JADX INFO: loaded from: classes2.dex */
public class qo {
    private final qm a;
    public int b;
    public RecyclerView c;
    public qc d;
    public boolean e;
    public boolean f;
    public View g;
    public boolean h;
    protected final LinearInterpolator i;
    protected final DecelerateInterpolator j;
    protected PointF k;
    protected int l;
    protected int m;
    private final DisplayMetrics n;
    private boolean o;
    private float p;

    public qo() {
        this.b = -1;
        this.a = new qm();
    }

    public qo(Context context) {
        this.b = -1;
        this.a = new qm();
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.o = false;
        this.l = 0;
        this.m = 0;
        this.n = context.getResources().getDisplayMetrics();
    }

    public static int h(int i, int i2, int i3, int i4, int i5) {
        switch (i5) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                return i3 - i;
            case 0:
                int i6 = i3 - i;
                if (i6 > 0) {
                    return i6;
                }
                int i7 = i4 - i2;
                if (i7 < 0) {
                    return i7;
                }
                return 0;
            default:
                return i4 - i2;
        }
    }

    public static final int i(View view) {
        qs qsVarH = RecyclerView.h(view);
        if (qsVarH != null) {
            return qsVarH.b();
        }
        return -1;
    }

    private static int j(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int b(int i) {
        float fAbs = Math.abs(i);
        if (!this.o) {
            this.p = a(this.n);
            this.o = true;
        }
        return (int) Math.ceil(fAbs * this.p);
    }

    protected void c(View view, qm qmVar) {
        int i;
        int iH;
        PointF pointF = this.k;
        int i2 = 1;
        int iH2 = 0;
        if (pointF == null || pointF.x == 0.0f) {
            i = 0;
        } else {
            i = this.k.x > 0.0f ? 1 : -1;
        }
        qc qcVar = this.d;
        if (qcVar == null || !qcVar.U()) {
            iH = 0;
        } else {
            qd qdVar = (qd) view.getLayoutParams();
            iH = h(qc.bo(view) - qdVar.leftMargin, qc.bp(view) + qdVar.rightMargin, qcVar.ap(), qcVar.C - qcVar.aq(), i);
        }
        PointF pointF2 = this.k;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i2 = 0;
        } else if (this.k.y <= 0.0f) {
            i2 = -1;
        }
        qc qcVar2 = this.d;
        if (qcVar2 != null && qcVar2.V()) {
            qd qdVar2 = (qd) view.getLayoutParams();
            iH2 = h(qc.bq(view) - qdVar2.topMargin, qc.bn(view) + qdVar2.bottomMargin, qcVar2.ar(), qcVar2.D - qcVar2.ao(), i2);
        }
        int iG = g((int) Math.sqrt((iH * iH) + (iH2 * iH2)));
        if (iG > 0) {
            qmVar.b(-iH, -iH2, iG, this.j);
        }
    }

    public final PointF d(int i) {
        Object obj = this.d;
        if (obj instanceof qn) {
            return ((qn) obj).I(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + qn.class.getCanonicalName());
        return null;
    }

    final void e(int i, int i2) {
        PointF pointFD;
        RecyclerView recyclerView = this.c;
        if (this.b == -1 || recyclerView == null) {
            f();
        }
        if (this.e && this.g == null && this.d != null && (pointFD = d(this.b)) != null && (pointFD.x != 0.0f || pointFD.y != 0.0f)) {
            recyclerView.R((int) Math.signum(pointFD.x), (int) Math.signum(pointFD.y), null);
        }
        this.e = false;
        View view = this.g;
        if (view != null) {
            if (i(view) == this.b) {
                View view2 = this.g;
                qp qpVar = recyclerView.L;
                c(view2, this.a);
                this.a.a(recyclerView);
                f();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.g = null;
            }
        }
        if (this.f) {
            qp qpVar2 = recyclerView.L;
            qm qmVar = this.a;
            if (this.c.m.ai() == 0) {
                f();
            } else {
                this.l = j(this.l, i);
                int iJ = j(this.m, i2);
                this.m = iJ;
                if (this.l == 0 && iJ == 0) {
                    PointF pointFD2 = d(this.b);
                    if (pointFD2 == null || (pointFD2.x == 0.0f && pointFD2.y == 0.0f)) {
                        qmVar.a = this.b;
                        f();
                    } else {
                        float fSqrt = (float) Math.sqrt((pointFD2.x * pointFD2.x) + (pointFD2.y * pointFD2.y));
                        pointFD2.x /= fSqrt;
                        pointFD2.y /= fSqrt;
                        this.k = pointFD2;
                        this.l = (int) (pointFD2.x * 10000.0f);
                        this.m = (int) (pointFD2.y * 10000.0f);
                        qmVar.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (b(10000) * 1.2f), this.i);
                    }
                }
            }
            qm qmVar2 = this.a;
            int i3 = qmVar2.a;
            qmVar2.a(recyclerView);
            if (i3 < 0 || !this.f) {
                return;
            }
            this.e = true;
            recyclerView.I.a();
        }
    }

    public final void f() {
        if (this.f) {
            this.f = false;
            this.m = 0;
            this.l = 0;
            this.k = null;
            this.c.L.a = -1;
            this.g = null;
            this.b = -1;
            this.e = false;
            qc qcVar = this.d;
            if (qcVar.t == this) {
                qcVar.t = null;
            }
            this.d = null;
            this.c = null;
        }
    }

    protected final int g(int i) {
        double dB = b(i);
        Double.isNaN(dB);
        return (int) Math.ceil(dB / 0.3356d);
    }
}
