package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class jbs {
    private Size a;
    private Rect b;
    private Rect c;
    private Rect d;
    private Rect e;
    private Rect f;
    private Rect g;
    private Rect h;
    private Rect i;
    private Rect j;
    private Rect k;
    private Rect l;
    private Rect m;
    private Boolean n;
    private Boolean o;

    public final jbt a() {
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        Rect rect5;
        Rect rect6;
        Rect rect7;
        Rect rect8;
        Rect rect9;
        Rect rect10;
        Rect rect11;
        Rect rect12;
        Boolean bool;
        Size size = this.a;
        if (size != null && (rect = this.b) != null && (rect2 = this.c) != null && (rect3 = this.d) != null && (rect4 = this.e) != null && (rect5 = this.f) != null && (rect6 = this.g) != null && (rect7 = this.h) != null && (rect8 = this.i) != null && (rect9 = this.j) != null && (rect10 = this.k) != null && (rect11 = this.l) != null && (rect12 = this.m) != null && (bool = this.n) != null && this.o != null) {
            return new jbt(size, rect, rect2, rect3, rect4, rect5, rect6, rect7, rect8, rect9, rect10, rect11, rect12, bool.booleanValue(), this.o.booleanValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" window");
        }
        if (this.b == null) {
            sb.append(" previewOverlay");
        }
        if (this.c == null) {
            sb.append(" optionsMenuContainer");
        }
        if (this.d == null) {
            sb.append(" preview");
        }
        if (this.e == null) {
            sb.append(" uncoveredPreview");
        }
        if (this.f == null) {
            sb.append(" viewfinderCoverIconArea");
        }
        if (this.g == null) {
            sb.append(" zoomUi");
        }
        if (this.h == null) {
            sb.append(" bottomBar");
        }
        if (this.i == null) {
            sb.append(" gradientBar");
        }
        if (this.j == null) {
            sb.append(" fullScreen");
        }
        if (this.k == null) {
            sb.append(" modeSwitchUi");
        }
        if (this.l == null) {
            sb.append(" cutoutArea");
        }
        if (this.m == null) {
            sb.append(" modeSlider");
        }
        if (this.n == null) {
            sb.append(" needsRetry");
        }
        if (this.o == null) {
            sb.append(" zoomInViewfinder");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null bottomBar");
        }
        this.h = rect;
    }

    public final void c(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null cutoutArea");
        }
        this.l = rect;
    }

    public final void d(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null fullScreen");
        }
        this.j = rect;
    }

    public final void e(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null gradientBar");
        }
        this.i = rect;
    }

    public final void f(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null modeSlider");
        }
        this.m = rect;
    }

    public final void g(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null modeSwitchUi");
        }
        this.k = rect;
    }

    public final void h(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    public final void i(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null optionsMenuContainer");
        }
        this.c = rect;
    }

    public final void j(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null preview");
        }
        this.d = rect;
    }

    public final void k(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null previewOverlay");
        }
        this.b = rect;
    }

    public final void l(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null uncoveredPreview");
        }
        this.e = rect;
    }

    public final void m(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null viewfinderCoverIconArea");
        }
        this.f = rect;
    }

    public final void n(Size size) {
        if (size == null) {
            throw new NullPointerException("Null window");
        }
        this.a = size;
    }

    public final void o(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    public final void p(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null zoomUi");
        }
        this.g = rect;
    }
}
