package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class nxp extends aca {
    final /* synthetic */ BottomSheetBehavior a;

    public nxp(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // defpackage.aca
    public final void c(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.r) {
                bottomSheetBehavior.G(1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    @Override // defpackage.aca
    public final void d(View view, float f, float f2) {
        BottomSheetBehavior bottomSheetBehavior;
        int iX;
        int i = 4;
        if (f2 < 0.0f) {
            BottomSheetBehavior bottomSheetBehavior2 = this.a;
            if (bottomSheetBehavior2.a) {
                iX = bottomSheetBehavior2.k;
                i = 3;
            } else {
                int top = view.getTop();
                System.currentTimeMillis();
                BottomSheetBehavior bottomSheetBehavior3 = this.a;
                int i2 = bottomSheetBehavior3.l;
                if (top > i2) {
                    iX = i2;
                    i = 6;
                } else {
                    iX = bottomSheetBehavior3.x();
                    i = 3;
                }
            }
        } else {
            BottomSheetBehavior bottomSheetBehavior4 = this.a;
            if (bottomSheetBehavior4.p && bottomSheetBehavior4.J(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                    int top2 = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior5 = this.a;
                    if (top2 > (bottomSheetBehavior5.v + bottomSheetBehavior5.x()) / 2) {
                        iX = this.a.v;
                        i = 5;
                    } else {
                        BottomSheetBehavior bottomSheetBehavior6 = this.a;
                        if (bottomSheetBehavior6.a) {
                            iX = bottomSheetBehavior6.k;
                            i = 3;
                        } else if (Math.abs(view.getTop() - this.a.x()) < Math.abs(view.getTop() - this.a.l)) {
                            iX = this.a.x();
                            i = 3;
                        } else {
                            iX = this.a.l;
                            i = 6;
                        }
                    }
                } else {
                    iX = this.a.v;
                    i = 5;
                }
            } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                int top3 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior7 = this.a;
                if (!bottomSheetBehavior7.a) {
                    int i3 = bottomSheetBehavior7.l;
                    if (top3 < i3) {
                        if (top3 < Math.abs(top3 - bottomSheetBehavior7.n)) {
                            iX = this.a.x();
                            i = 3;
                        } else {
                            iX = this.a.l;
                            i = 6;
                        }
                    } else if (Math.abs(top3 - i3) < Math.abs(top3 - this.a.n)) {
                        iX = this.a.l;
                        i = 6;
                    } else {
                        bottomSheetBehavior = this.a;
                        iX = bottomSheetBehavior.n;
                    }
                } else if (Math.abs(top3 - bottomSheetBehavior7.k) < Math.abs(top3 - this.a.n)) {
                    iX = this.a.k;
                    i = 3;
                } else {
                    iX = this.a.n;
                }
            } else {
                bottomSheetBehavior = this.a;
                if (bottomSheetBehavior.a) {
                    iX = bottomSheetBehavior.n;
                } else {
                    int top4 = view.getTop();
                    if (Math.abs(top4 - this.a.l) < Math.abs(top4 - this.a.n)) {
                        iX = this.a.l;
                        i = 6;
                    } else {
                        iX = this.a.n;
                    }
                }
            }
        }
        this.a.I(view, i, iX, true);
    }

    @Override // defpackage.aca
    public final boolean e(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.s;
        if (i2 == 1 || bottomSheetBehavior.A) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.z == i) {
            WeakReference weakReference = bottomSheetBehavior.x;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = this.a.w;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // defpackage.aca
    public final int f(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.aca
    public final int g(View view, int i) {
        int iX = this.a.x();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return aao.d(i, iX, bottomSheetBehavior.p ? bottomSheetBehavior.v : bottomSheetBehavior.n);
    }

    @Override // defpackage.aca
    public final int h() {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return bottomSheetBehavior.p ? bottomSheetBehavior.v : bottomSheetBehavior.n;
    }

    @Override // defpackage.aca
    public final void i(View view, int i, int i2) {
        this.a.B(i2);
    }
}
