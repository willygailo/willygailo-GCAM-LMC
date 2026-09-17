package defpackage;

import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class gy {
    public static final gy a = gw.c;
    private final gx b;

    private gy(WindowInsets windowInsets) {
        this.b = new gw(this, windowInsets);
    }

    public gy(gy gyVar) {
        this.b = new gx(this);
    }

    static el f(el elVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, elVar.b - i);
        int iMax2 = Math.max(0, elVar.c - i2);
        int iMax3 = Math.max(0, elVar.d - i3);
        int iMax4 = Math.max(0, elVar.e - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? elVar : el.b(iMax, iMax2, iMax3, iMax4);
    }

    public static gy l(WindowInsets windowInsets) {
        return m(windowInsets, null);
    }

    public static gy m(WindowInsets windowInsets, View view) {
        ew.c(windowInsets);
        gy gyVar = new gy(windowInsets);
        if (view != null && gl.U(view)) {
            gyVar.q(gl.r(view));
            gyVar.o(view.getRootView());
        }
        return gyVar;
    }

    @Deprecated
    public int a() {
        return this.b.a().e;
    }

    @Deprecated
    public int b() {
        return this.b.a().b;
    }

    @Deprecated
    public int c() {
        return this.b.a().d;
    }

    @Deprecated
    public int d() {
        return this.b.a().c;
    }

    @Deprecated
    public el e() {
        return this.b.m();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gy) {
            return Objects.equals(this.b, ((gy) obj).b);
        }
        return false;
    }

    @Deprecated
    public gy g() {
        return this.b.l();
    }

    @Deprecated
    public gy h() {
        return this.b.h();
    }

    public int hashCode() {
        gx gxVar = this.b;
        if (gxVar == null) {
            return 0;
        }
        return gxVar.hashCode();
    }

    @Deprecated
    public gy i() {
        return this.b.i();
    }

    public gy j(int i, int i2, int i3, int i4) {
        return this.b.b(i, i2, i3, i4);
    }

    @Deprecated
    public gy k(int i, int i2, int i3, int i4) {
        gr grVar = new gr(this);
        fx.m(el.b(i, i2, i3, i4), grVar);
        return fx.l(grVar);
    }

    public WindowInsets n() {
        gx gxVar = this.b;
        if (gxVar instanceof gs) {
            return ((gs) gxVar).a;
        }
        return null;
    }

    public void o(View view) {
        this.b.d();
    }

    public void p(el[] elVarArr) {
        this.b.e();
    }

    public void q(gy gyVar) {
        this.b.f();
    }

    public boolean r() {
        return this.b.j();
    }
}
