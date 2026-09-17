package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class nhi implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean c;
    public boolean g;
    public boolean i;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    public int a = 0;
    public long b = 0;
    public String d = "";
    public boolean e = false;
    public int f = 1;
    public String h = "";
    public String j = "";
    public int k = 5;

    public final boolean a(nhi nhiVar) {
        if (nhiVar == null) {
            return false;
        }
        if (this == nhiVar) {
            return true;
        }
        return this.a == nhiVar.a && this.b == nhiVar.b && this.d.equals(nhiVar.d) && this.e == nhiVar.e && this.f == nhiVar.f && this.h.equals(nhiVar.h) && this.k == nhiVar.k && this.j.equals(nhiVar.j) && this.i == nhiVar.i;
    }

    public final void b() {
        this.p = false;
        this.k = 5;
    }

    public final void c() {
        this.c = false;
        this.d = "";
    }

    public final void d(nhi nhiVar) {
        if (nhiVar.l) {
            e(nhiVar.a);
        }
        if (nhiVar.m) {
            i(nhiVar.b);
        }
        if (nhiVar.c) {
            g(nhiVar.d);
        }
        if (nhiVar.n) {
            h(nhiVar.e);
        }
        if (nhiVar.o) {
            j(nhiVar.f);
        }
        if (nhiVar.g) {
            l(nhiVar.h);
        }
        if (nhiVar.p) {
            f(nhiVar.k);
        }
        if (nhiVar.i) {
            k(nhiVar.j);
        }
    }

    public final void e(int i) {
        this.l = true;
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nhi) && a((nhi) obj);
    }

    public final void f(int i) {
        if (i == 0) {
            throw null;
        }
        this.p = true;
        this.k = i;
    }

    public final void g(String str) {
        if (str == null) {
            throw null;
        }
        this.c = true;
        this.d = str;
    }

    public final void h(boolean z) {
        this.n = true;
        this.e = z;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.a + 2173) * 53) + Long.valueOf(this.b).hashCode()) * 53) + this.d.hashCode()) * 53) + (true != this.e ? 1237 : 1231)) * 53) + this.f) * 53) + this.h.hashCode()) * 53;
        int i = this.k;
        if (i != 0) {
            return ((((iHashCode + i) * 53) + this.j.hashCode()) * 53) + (true == this.i ? 1231 : 1237);
        }
        throw null;
    }

    public final void i(long j) {
        this.m = true;
        this.b = j;
    }

    public final void j(int i) {
        this.o = true;
        this.f = i;
    }

    public final void k(String str) {
        if (str == null) {
            throw null;
        }
        this.i = true;
        this.j = str;
    }

    public final void l(String str) {
        if (str == null) {
            throw null;
        }
        this.g = true;
        this.h = str;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Country Code: ");
        sb.append(this.a);
        sb.append(" National Number: ");
        sb.append(this.b);
        if (this.n && this.e) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.o) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.f);
        }
        if (this.c) {
            sb.append(" Extension: ");
            sb.append(this.d);
        }
        if (this.p) {
            sb.append(" Country Code Source: ");
            switch (this.k) {
                case 1:
                    str = "FROM_NUMBER_WITH_PLUS_SIGN";
                    break;
                case 2:
                    str = "FROM_NUMBER_WITH_IDD";
                    break;
                case 3:
                    str = "FROM_NUMBER_WITHOUT_PLUS_SIGN";
                    break;
                case 4:
                    str = "FROM_DEFAULT_COUNTRY";
                    break;
                case 5:
                    str = "UNSPECIFIED";
                    break;
                default:
                    str = "null";
                    break;
            }
            sb.append((Object) str);
        }
        if (this.i) {
            sb.append(" Preferred Domestic Carrier Code: ");
            sb.append(this.j);
        }
        return sb.toString();
    }
}
