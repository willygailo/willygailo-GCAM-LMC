package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class osx {
    public final Object a;
    public int b;
    public int c;
    public long d;
    public osx e;
    public osx f;
    public osx g;
    public osx h;
    private int i;

    public osx() {
        this.a = null;
        this.b = 1;
    }

    public osx(Object obj, int i) {
        obr.aF(i > 0);
        this.a = obj;
        this.b = i;
        this.d = i;
        this.c = 1;
        this.i = 1;
        this.e = null;
        this.f = null;
    }

    private final int j() {
        return k(this.e) - k(this.f);
    }

    private static int k(osx osxVar) {
        if (osxVar == null) {
            return 0;
        }
        return osxVar.i;
    }

    private static long l(osx osxVar) {
        if (osxVar == null) {
            return 0L;
        }
        return osxVar.d;
    }

    private final osx m() {
        int i = this.b;
        this.b = 0;
        osz.v(e(), g());
        osx osxVar = this.e;
        if (osxVar == null) {
            return this.f;
        }
        osx osxVar2 = this.f;
        if (osxVar2 == null) {
            return osxVar;
        }
        if (osxVar.i >= osxVar2.i) {
            osx osxVarE = e();
            osxVarE.e = this.e.o(osxVarE);
            osxVarE.f = this.f;
            osxVarE.c = this.c - 1;
            osxVarE.d = this.d - ((long) i);
            return osxVarE.n();
        }
        osx osxVarG = g();
        osxVarG.f = this.f.p(osxVarG);
        osxVarG.e = this.e;
        osxVarG.c = this.c - 1;
        osxVarG.d = this.d - ((long) i);
        return osxVarG.n();
    }

    private final osx n() {
        switch (j()) {
            case -2:
                osx osxVar = this.f;
                osxVar.getClass();
                if (osxVar.j() > 0) {
                    this.f = this.f.r();
                }
                return q();
            case 2:
                osx osxVar2 = this.e;
                osxVar2.getClass();
                if (osxVar2.j() < 0) {
                    this.e = this.e.q();
                }
                return r();
            default:
                t();
                return this;
        }
    }

    private final osx o(osx osxVar) {
        osx osxVar2 = this.f;
        if (osxVar2 == null) {
            return this.e;
        }
        this.f = osxVar2.o(osxVar);
        this.c--;
        this.d -= (long) osxVar.b;
        return n();
    }

    private final osx p(osx osxVar) {
        osx osxVar2 = this.e;
        if (osxVar2 == null) {
            return this.f;
        }
        this.e = osxVar2.p(osxVar);
        this.c--;
        this.d -= (long) osxVar.b;
        return n();
    }

    private final osx q() {
        obr.aQ(this.f != null);
        osx osxVar = this.f;
        this.f = osxVar.e;
        osxVar.e = this;
        osxVar.d = this.d;
        osxVar.c = this.c;
        s();
        osxVar.t();
        return osxVar;
    }

    private final osx r() {
        obr.aQ(this.e != null);
        osx osxVar = this.e;
        this.e = osxVar.f;
        osxVar.f = this;
        osxVar.d = this.d;
        osxVar.c = this.c;
        s();
        osxVar.t();
        return osxVar;
    }

    private final void s() {
        this.c = osz.t(this.e) + 1 + osz.t(this.f);
        this.d = ((long) this.b) + l(this.e) + l(this.f);
        t();
    }

    private final void t() {
        this.i = Math.max(k(this.e), k(this.f)) + 1;
    }

    final int a(Comparator comparator, Object obj) {
        int iCompare = comparator.compare(obj, this.a);
        if (iCompare < 0) {
            osx osxVar = this.e;
            if (osxVar == null) {
                return 0;
            }
            return osxVar.a(comparator, obj);
        }
        if (iCompare <= 0) {
            return this.b;
        }
        osx osxVar2 = this.f;
        if (osxVar2 == null) {
            return 0;
        }
        return osxVar2.a(comparator, obj);
    }

    final osx b(Comparator comparator, Object obj, int i, int[] iArr) {
        int iCompare = comparator.compare(obj, this.a);
        if (iCompare < 0) {
            osx osxVar = this.e;
            if (osxVar == null) {
                iArr[0] = 0;
                this.e = new osx(obj, i);
                osz.w(e(), this.e, this);
                this.i = Math.max(2, this.i);
                this.c++;
                this.d += (long) i;
                return this;
            }
            int i2 = osxVar.i;
            osx osxVarB = osxVar.b(comparator, obj, i, iArr);
            this.e = osxVarB;
            if (iArr[0] == 0) {
                this.c++;
            }
            this.d += (long) i;
            return osxVarB.i == i2 ? this : n();
        }
        if (iCompare <= 0) {
            int i3 = this.b;
            iArr[0] = i3;
            long j = i;
            obr.aF(((long) i3) + j <= 2147483647L);
            this.b += i;
            this.d += j;
            return this;
        }
        osx osxVar2 = this.f;
        if (osxVar2 != null) {
            int i4 = osxVar2.i;
            osx osxVarB2 = osxVar2.b(comparator, obj, i, iArr);
            this.f = osxVarB2;
            if (iArr[0] == 0) {
                this.c++;
            }
            this.d += (long) i;
            return osxVarB2.i == i4 ? this : n();
        }
        iArr[0] = 0;
        osx osxVar3 = new osx(obj, i);
        this.f = osxVar3;
        osz.w(this, osxVar3, g());
        this.i = Math.max(2, this.i);
        this.c++;
        this.d += (long) i;
        return this;
    }

    public final osx c(Comparator comparator, Object obj) {
        int iCompare = comparator.compare(obj, this.a);
        if (iCompare < 0) {
            osx osxVar = this.e;
            return osxVar == null ? this : (osx) obr.bb(osxVar.c(comparator, obj), this);
        }
        if (iCompare == 0) {
            return this;
        }
        osx osxVar2 = this.f;
        if (osxVar2 == null) {
            return null;
        }
        return osxVar2.c(comparator, obj);
    }

    public final osx d(Comparator comparator, Object obj) {
        int iCompare = comparator.compare(obj, this.a);
        if (iCompare > 0) {
            osx osxVar = this.f;
            return osxVar == null ? this : (osx) obr.bb(osxVar.d(comparator, obj), this);
        }
        if (iCompare == 0) {
            return this;
        }
        osx osxVar2 = this.e;
        if (osxVar2 == null) {
            return null;
        }
        return osxVar2.d(comparator, obj);
    }

    public final osx e() {
        osx osxVar = this.g;
        osxVar.getClass();
        return osxVar;
    }

    final osx f(Comparator comparator, Object obj, int i, int[] iArr) {
        int iCompare = comparator.compare(obj, this.a);
        if (iCompare < 0) {
            osx osxVar = this.e;
            if (osxVar == null) {
                iArr[0] = 0;
                return this;
            }
            this.e = osxVar.f(comparator, obj, i, iArr);
            int i2 = iArr[0];
            if (i2 > 0) {
                if (i >= i2) {
                    this.c--;
                    this.d -= (long) i2;
                } else {
                    this.d -= (long) i;
                }
            }
            return i2 == 0 ? this : n();
        }
        if (iCompare <= 0) {
            int i3 = this.b;
            iArr[0] = i3;
            if (i >= i3) {
                return m();
            }
            this.b = i3 - i;
            this.d -= (long) i;
            return this;
        }
        osx osxVar2 = this.f;
        if (osxVar2 == null) {
            iArr[0] = 0;
            return this;
        }
        this.f = osxVar2.f(comparator, obj, i, iArr);
        int i4 = iArr[0];
        if (i4 > 0) {
            if (i >= i4) {
                this.c--;
                this.d -= (long) i4;
            } else {
                this.d -= (long) i;
            }
        }
        return n();
    }

    public final osx g() {
        osx osxVar = this.h;
        osxVar.getClass();
        return osxVar;
    }

    final osx h(Comparator comparator, Object obj, int i, int[] iArr) {
        int iCompare = comparator.compare(obj, this.a);
        if (iCompare < 0) {
            osx osxVar = this.e;
            if (osxVar == null) {
                iArr[0] = 0;
                return this;
            }
            this.e = osxVar.h(comparator, obj, i, iArr);
            int i2 = iArr[0];
            if (i2 == i) {
                if (i2 != 0) {
                    this.c--;
                }
                this.d += (long) (-i2);
            }
            return n();
        }
        if (iCompare <= 0) {
            int i3 = this.b;
            iArr[0] = i3;
            return i == i3 ? m() : this;
        }
        osx osxVar2 = this.f;
        if (osxVar2 == null) {
            iArr[0] = 0;
            return this;
        }
        this.f = osxVar2.h(comparator, obj, i, iArr);
        int i4 = iArr[0];
        if (i4 == i) {
            if (i4 != 0) {
                this.c--;
            }
            this.d += (long) (-i4);
        }
        return n();
    }

    final osx i(Comparator comparator, Object obj, int[] iArr) {
        int iCompare = comparator.compare(obj, this.a);
        if (iCompare < 0) {
            osx osxVar = this.e;
            if (osxVar == null) {
                iArr[0] = 0;
                return this;
            }
            this.e = osxVar.i(comparator, obj, iArr);
            int i = iArr[0];
            if (i != 0) {
                this.c--;
            }
            this.d += (long) (-i);
            return n();
        }
        if (iCompare <= 0) {
            iArr[0] = this.b;
            return m();
        }
        osx osxVar2 = this.f;
        if (osxVar2 == null) {
            iArr[0] = 0;
            return this;
        }
        this.f = osxVar2.i(comparator, obj, iArr);
        int i2 = iArr[0];
        if (i2 != 0) {
            this.c--;
        }
        this.d += (long) (-i2);
        return n();
    }

    public final String toString() {
        return obr.S(this.a, this.b).toString();
    }
}
