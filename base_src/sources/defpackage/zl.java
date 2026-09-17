package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class zl {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ ConstraintLayout h;

    public zl(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean b(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void a(yk ykVar, ys ysVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int baseline;
        int iMax;
        int iMax2;
        int i;
        int i2;
        if (ykVar == null) {
            return;
        }
        if (ykVar.ag == 8) {
            ysVar.c = 0;
            ysVar.d = 0;
            ysVar.e = 0;
            return;
        }
        if (ykVar.T == null) {
            return;
        }
        int i3 = ysVar.i;
        int i4 = ysVar.j;
        int i5 = ysVar.a;
        int i6 = ysVar.b;
        int i7 = this.b + this.c;
        int i8 = this.d;
        Object obj = ykVar.af;
        int i9 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        switch (i9) {
            case 0:
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                break;
            case 1:
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
                break;
            case 2:
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
                int i10 = ykVar.s;
                int i11 = ysVar.h;
                if (i11 == 1 || i11 == 2) {
                    int measuredHeight = ((View) obj).getMeasuredHeight();
                    int iH = ykVar.h();
                    if (ysVar.h == 2 || i10 != 1 || measuredHeight == iH || (obj instanceof zx) || ykVar.e()) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(ykVar.j(), 1073741824);
                    }
                }
                break;
            case 3:
                int i12 = this.f;
                yj yjVar = ykVar.J;
                int i13 = yjVar != null ? yjVar.f : 0;
                yj yjVar2 = ykVar.L;
                if (yjVar2 != null) {
                    i13 += yjVar2.f;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i12, i8 + i13, -1);
                break;
            default:
                iMakeMeasureSpec = 0;
                break;
        }
        int i14 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        switch (i14) {
            case 0:
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                break;
            case 1:
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
                break;
            case 2:
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
                int i15 = ykVar.t;
                int i16 = ysVar.h;
                if (i16 == 1 || i16 == 2) {
                    int measuredWidth = ((View) obj).getMeasuredWidth();
                    int iJ = ykVar.j();
                    if (ysVar.h == 2 || i15 != 1 || measuredWidth == iJ || (obj instanceof zx) || ykVar.f()) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(ykVar.h(), 1073741824);
                    }
                }
                break;
            case 3:
                int i17 = this.g;
                int i18 = ykVar.J != null ? ykVar.K.f : 0;
                if (ykVar.L != null) {
                    i18 += ykVar.M.f;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i7 + i18, -1);
                break;
            default:
                iMakeMeasureSpec2 = 0;
                break;
        }
        yk ykVar2 = ykVar.T;
        if (ykVar2 != null && yp.b(this.h.e, 256)) {
            View view = (View) obj;
            if (view.getMeasuredWidth() == ykVar.j() && view.getMeasuredWidth() < ykVar2.j() && view.getMeasuredHeight() == ykVar.h() && view.getMeasuredHeight() < ykVar2.h() && view.getBaseline() == ykVar.aa && !ykVar.K() && b(ykVar.H, iMakeMeasureSpec, ykVar.j()) && b(ykVar.I, iMakeMeasureSpec2, ykVar.h())) {
                ysVar.c = ykVar.j();
                ysVar.d = ykVar.h();
                ysVar.e = ykVar.aa;
                return;
            }
        }
        boolean z = i4 == 4 || i4 == 1;
        boolean z2 = i3 == 4 || i3 == 1;
        boolean z3 = i3 == 3 && ykVar.W > 0.0f;
        boolean z4 = i4 == 3 && ykVar.W > 0.0f;
        if (obj == null) {
            return;
        }
        View view2 = (View) obj;
        zk zkVar = (zk) view2.getLayoutParams();
        int i19 = ysVar.h;
        if (i19 != 1 && i19 != 2 && i3 == 3 && ykVar.s == 0 && i4 == 3 && ykVar.t == 0) {
            baseline = 0;
            iMax = 0;
            iMax2 = 0;
        } else {
            if ((obj instanceof aaa) && (ykVar instanceof yq)) {
                throw null;
            }
            view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            ykVar.A(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth2 = view2.getMeasuredWidth();
            int measuredHeight2 = view2.getMeasuredHeight();
            baseline = view2.getBaseline();
            int i20 = ykVar.v;
            iMax = i20 > 0 ? Math.max(i20, measuredWidth2) : measuredWidth2;
            int i21 = ykVar.w;
            if (i21 > 0) {
                iMax = Math.min(i21, iMax);
            }
            int i22 = ykVar.y;
            iMax2 = i22 > 0 ? Math.max(i22, measuredHeight2) : measuredHeight2;
            int i23 = iMakeMeasureSpec2;
            int i24 = ykVar.z;
            if (i24 > 0) {
                iMax2 = Math.min(i24, iMax2);
            }
            if (!yp.b(this.h.e, 1)) {
                if (z3 && z) {
                    iMax = (int) ((iMax2 * ykVar.W) + 0.5f);
                } else if (z4 && z2) {
                    iMax2 = (int) ((iMax / ykVar.W) + 0.5f);
                }
            }
            if (measuredWidth2 != iMax || measuredHeight2 != iMax2) {
                if (measuredWidth2 != iMax) {
                    i = 1073741824;
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                } else {
                    i = 1073741824;
                }
                int iMakeMeasureSpec3 = measuredHeight2 != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, i) : i23;
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                ykVar.A(iMakeMeasureSpec, iMakeMeasureSpec3);
                iMax = view2.getMeasuredWidth();
                iMax2 = view2.getMeasuredHeight();
                baseline = view2.getBaseline();
            }
        }
        boolean z5 = baseline != -1;
        boolean z6 = (iMax == ysVar.a && iMax2 == ysVar.b) ? false : true;
        ysVar.g = z6;
        boolean z7 = z5 | zkVar.ab;
        if (!z7) {
            i2 = baseline;
        } else if (baseline != -1) {
            if (ykVar.aa != baseline) {
                ysVar.g = true;
            }
            i2 = baseline;
        } else {
            i2 = -1;
        }
        ysVar.c = iMax;
        ysVar.d = iMax2;
        ysVar.f = z7;
        ysVar.e = i2;
    }
}
