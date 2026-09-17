package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class gx {
    static final gy d = fx.l(new gr((byte[]) null)).g().h().i();
    final gy e;

    public gx(gy gyVar) {
        this.e = gyVar;
    }

    public el a() {
        return el.a;
    }

    public gy b(int i, int i2, int i3, int i4) {
        return d;
    }

    public boolean c() {
        return false;
    }

    public void d() {
    }

    public void e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx)) {
            return false;
        }
        gx gxVar = (gx) obj;
        return c() == gxVar.c() && j() == gxVar.j() && Objects.equals(a(), gxVar.a()) && Objects.equals(g(), gxVar.g()) && Objects.equals(k(), gxVar.k());
    }

    public void f() {
    }

    public el g() {
        return el.a;
    }

    public gy h() {
        return this.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(c()), Boolean.valueOf(j()), a(), g(), k());
    }

    public gy i() {
        return this.e;
    }

    public boolean j() {
        return false;
    }

    public fl k() {
        return null;
    }

    public gy l() {
        return this.e;
    }

    public el m() {
        return a();
    }
}
