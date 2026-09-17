package defpackage;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class fq {
    public boolean a;
    private ViewParent b;
    private ViewParent c;
    private final View d;
    private int[] e;

    public fq(View view) {
        this.d = view;
    }

    private final ViewParent j(int i) {
        switch (i) {
            case 0:
                return this.b;
            default:
                return this.c;
        }
    }

    private final void k(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.b = viewParent;
                break;
            default:
                this.c = viewParent;
                break;
        }
    }

    private final int[] l() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    public final void a(boolean z) {
        if (this.a) {
            gl.Q(this.d);
        }
        this.a = z;
    }

    public final void b(int i) {
        ViewParent viewParentJ = j(i);
        if (viewParentJ != null) {
            fw.e(viewParentJ, this.d, i);
            k(i, null);
        }
    }

    public final boolean c(float f, float f2, boolean z) {
        ViewParent viewParent;
        if (!this.a || (viewParent = this.b) == null) {
            return false;
        }
        return fw.f(viewParent, this.d, f, f2, z);
    }

    public final boolean d(float f, float f2) {
        ViewParent viewParent;
        if (!this.a || (viewParent = this.b) == null) {
            return false;
        }
        return fw.g(viewParent, this.d, f, f2);
    }

    public final boolean e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentJ;
        int i4;
        int i5;
        int i6;
        if (!this.a || (viewParentJ = j(i3)) == null) {
            return false;
        }
        if (i != 0) {
            i4 = i;
        } else {
            if (i2 == 0) {
                if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
                return false;
            }
            i4 = 0;
        }
        if (iArr2 != null) {
            this.d.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            iArr = l();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        fw.b(viewParentJ, this.d, i4, i2, iArr, i3);
        if (iArr2 != null) {
            this.d.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public final boolean f(int i, int i2, int i3, int i4, int[] iArr) {
        return g(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentJ;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr3;
        if (!this.a || (viewParentJ = j(i5)) == null) {
            return false;
        }
        if (i != 0) {
            i6 = i;
            i7 = i2;
            i8 = i3;
        } else if (i2 != 0) {
            i7 = i2;
            i8 = i3;
            i6 = 0;
        } else if (i3 != 0) {
            i8 = i3;
            i6 = 0;
            i7 = 0;
        } else {
            if (i4 == 0) {
                if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                }
                return false;
            }
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (iArr != null) {
            this.d.getLocationInWindow(iArr);
            i9 = iArr[0];
            i10 = iArr[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            int[] iArrL = l();
            iArrL[0] = 0;
            iArrL[1] = 0;
            iArr3 = iArrL;
        } else {
            iArr3 = iArr2;
        }
        fw.c(viewParentJ, this.d, i6, i7, i8, i4, i5, iArr3);
        if (iArr != null) {
            this.d.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i9;
            iArr[1] = iArr[1] - i10;
        }
        return true;
    }

    public final boolean h(int i) {
        return j(i) != null;
    }

    public final boolean i(int i, int i2) {
        if (h(i2)) {
            return true;
        }
        if (!this.a) {
            return false;
        }
        View view = this.d;
        for (ViewParent parent = this.d.getParent(); parent != null; parent = parent.getParent()) {
            if (fw.h(parent, view, this.d, i, i2)) {
                k(i2, parent);
                fw.d(parent, view, this.d, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }
}
