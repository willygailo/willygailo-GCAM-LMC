package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lxc {
    public int a;
    public int b;
    public int c;
    public long d;
    public long e;
    public float f;
    public float g;
    public float h;

    public lxc() {
        this(0, 0, 0, 0L, 0L, 0.0f, 0.0f, 0.0f);
    }

    public lxc(int i, int i2, int i3, long j, long j2, float f, float f2, float f3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = f;
        this.g = f2;
        this.h = f3;
    }

    public final void a(lxc lxcVar) {
        this.a = lxcVar.a;
        this.b = lxcVar.b;
        this.c = lxcVar.c;
        this.d = lxcVar.d;
        this.e = lxcVar.e;
        this.f = lxcVar.f;
        this.g = lxcVar.g;
        this.h = lxcVar.h;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new lxc(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lxc)) {
            return false;
        }
        lxc lxcVar = (lxc) obj;
        return this.a == lxcVar.a && this.b == lxcVar.b && this.c == lxcVar.c && this.d == lxcVar.d && this.e == lxcVar.e && this.f == lxcVar.f && this.g == lxcVar.g && this.h == lxcVar.h;
    }
}
