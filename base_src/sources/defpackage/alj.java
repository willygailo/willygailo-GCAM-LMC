package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class alj extends gg {
    public int a;
    public int b;
    public final ali c;
    public int d;
    public boolean e;
    public gd f;
    private final ViewPager2 g;
    private final RecyclerView h;
    private final LinearLayoutManager i;
    private int j;
    private boolean k;
    private boolean l;

    public alj(ViewPager2 viewPager2) {
        this.g = viewPager2;
        RecyclerView recyclerView = viewPager2.f;
        this.h = recyclerView;
        this.i = (LinearLayoutManager) recyclerView.m;
        this.c = new ali();
        m();
    }

    private final void l(int i, float f, int i2) {
        gd gdVar = this.f;
        if (gdVar != null) {
            gdVar.q(i, f, i2);
        }
    }

    private final void m() {
        this.a = 0;
        this.b = 0;
        this.c.a();
        this.j = -1;
        this.d = -1;
        this.k = false;
        this.l = false;
        this.e = false;
    }

    private final boolean n() {
        return this.a == 1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // defpackage.gg
    public final void c(RecyclerView recyclerView, int i, int i2) {
        ali aliVar;
        int i3;
        this.l = true;
        j();
        if (this.k) {
            this.k = false;
            if (i2 > 0) {
                aliVar = this.c;
                if (aliVar.c != 0) {
                    i3 = aliVar.a + 1;
                } else {
                    i3 = this.c.a;
                }
            } else {
                if (i2 == 0) {
                    if ((i < 0) == this.g.g()) {
                        aliVar = this.c;
                        if (aliVar.c != 0) {
                            i3 = aliVar.a + 1;
                        }
                    }
                }
                i3 = this.c.a;
            }
            this.d = i3;
            if (this.j != i3) {
                h(i3);
            }
        } else if (this.a == 0) {
            int i4 = this.c.a;
            if (i4 == -1) {
                i4 = 0;
            }
            h(i4);
        }
        ali aliVar2 = this.c;
        int i5 = aliVar2.a;
        if (i5 == -1) {
            i5 = 0;
        }
        l(i5, aliVar2.b, aliVar2.c);
        ali aliVar3 = this.c;
        int i6 = aliVar3.a;
        int i7 = this.d;
        if ((i6 == i7 || i7 == -1) && aliVar3.c == 0 && this.b != 1) {
            i(0);
            m();
        }
    }

    @Override // defpackage.gg
    public final void d(int i) {
        if (!(this.a == 1 && this.b == 1) && i == 1) {
            this.a = 1;
            int i2 = this.d;
            if (i2 != -1) {
                this.j = i2;
                this.d = -1;
            } else if (this.j == -1) {
                this.j = this.i.G();
            }
            i(1);
            return;
        }
        if (n() && i == 2) {
            if (this.l) {
                i(2);
                this.k = true;
                return;
            }
            return;
        }
        if (n() && i == 0) {
            j();
            if (this.l) {
                ali aliVar = this.c;
                if (aliVar.c == 0) {
                    int i3 = this.j;
                    int i4 = aliVar.a;
                    if (i3 != i4) {
                        h(i4);
                    }
                }
            } else {
                int i5 = this.c.a;
                if (i5 != -1) {
                    l(i5, 0.0f, 0);
                }
            }
            i(0);
            m();
        }
        if (this.a == 2 && i == 0 && this.e) {
            j();
            ali aliVar2 = this.c;
            if (aliVar2.c == 0) {
                int i6 = this.d;
                int i7 = aliVar2.a;
                if (i6 != i7) {
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    h(i7);
                }
                i(0);
                m();
            }
        }
    }

    public final void h(int i) {
        gd gdVar = this.f;
        if (gdVar != null) {
            gdVar.r(i);
        }
    }

    public final void i(int i) {
        if ((this.a == 3 && this.b == 0) || this.b == i) {
            return;
        }
        this.b = i;
        gd gdVar = this.f;
        if (gdVar != null) {
            gdVar.p(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:0x0121  */
    /* JADX WARN: Code duplicated, block: B:60:0x012b A[LOOP:2: B:57:0x011f->B:60:0x012b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x012e A[SYNTHETIC] */
    public final void j() {
        int top;
        int iAi;
        int i;
        int bottom;
        int i2;
        ali aliVar = this.c;
        int iG = this.i.G();
        aliVar.a = iG;
        if (iG == -1) {
            aliVar.a();
            return;
        }
        View viewL = this.i.L(iG);
        if (viewL == null) {
            aliVar.a();
            return;
        }
        int iBd = LinearLayoutManager.bd(viewL);
        int iBf = LinearLayoutManager.bf(viewL);
        int iBg = LinearLayoutManager.bg(viewL);
        int iBa = LinearLayoutManager.ba(viewL);
        ViewGroup.LayoutParams layoutParams = viewL.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iBd += marginLayoutParams.leftMargin;
            iBf += marginLayoutParams.rightMargin;
            iBg += marginLayoutParams.topMargin;
            iBa += marginLayoutParams.bottomMargin;
        }
        int height = viewL.getHeight() + iBg + iBa;
        int width = viewL.getWidth() + iBd + iBf;
        if (this.i.i == 0) {
            top = (viewL.getLeft() - iBd) - this.h.getPaddingLeft();
            if (this.g.g()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewL.getTop() - iBg) - this.h.getPaddingTop();
        }
        int i3 = -top;
        aliVar.c = i3;
        if (i3 >= 0) {
            aliVar.b = height == 0 ? 0.0f : i3 / height;
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = ale.a;
        LinearLayoutManager linearLayoutManager = this.i;
        int iAi2 = linearLayoutManager.ai();
        if (iAi2 != 0) {
            int i4 = linearLayoutManager.i ^ 1;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, iAi2, 2);
            for (int i5 = 0; i5 < iAi2; i5++) {
                View viewAu = linearLayoutManager.au(i5);
                if (viewAu == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = viewAu.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : ale.a;
                iArr[i5][0] = i4 != 0 ? viewAu.getLeft() - marginLayoutParams3.leftMargin : viewAu.getTop() - marginLayoutParams3.topMargin;
                int[] iArr2 = iArr[i5];
                if (i4 != 0) {
                    bottom = viewAu.getRight();
                    i2 = marginLayoutParams3.rightMargin;
                } else {
                    bottom = viewAu.getBottom();
                    i2 = marginLayoutParams3.bottomMargin;
                }
                iArr2[1] = bottom + i2;
            }
            Arrays.sort(iArr, new yc(4));
            int i6 = 1;
            while (true) {
                if (i6 >= iAi2) {
                    int[] iArr3 = iArr[0];
                    int i7 = iArr3[1];
                    int i8 = iArr3[0];
                    int i9 = i7 - i8;
                    if (i8 <= 0 && iArr[iAi2 - 1][1] >= i9) {
                        if (linearLayoutManager.ai() <= 1) {
                        }
                    }
                } else if (iArr[i6 - 1][1] == iArr[i6][0]) {
                    i6++;
                }
                iAi = linearLayoutManager.ai();
                for (i = 0; i < iAi; i++) {
                    if (!ale.a(linearLayoutManager.au(i))) {
                        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    }
                }
            }
        } else if (linearLayoutManager.ai() <= 1) {
            iAi = linearLayoutManager.ai();
            while (i < iAi) {
                if (!ale.a(linearLayoutManager.au(i))) {
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
            }
        }
        throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aliVar.c)));
    }

    public final boolean k() {
        return this.b == 0;
    }
}
