package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aml {
    public static final aml a = new amk().a();
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public amn h;
    public int i;

    public aml() {
        this.i = 1;
        this.f = -1L;
        this.g = -1L;
        this.h = new amn();
    }

    public aml(amk amkVar) {
        this.i = 1;
        this.f = -1L;
        this.g = -1L;
        this.h = new amn();
        this.b = false;
        this.c = false;
        this.i = amkVar.b;
        this.d = false;
        this.e = false;
        this.h = amkVar.a;
        this.f = -1L;
        this.g = -1L;
    }

    public aml(aml amlVar) {
        this.i = 1;
        this.f = -1L;
        this.g = -1L;
        this.h = new amn();
        this.b = amlVar.b;
        this.c = amlVar.c;
        this.i = amlVar.i;
        this.d = amlVar.d;
        this.e = amlVar.e;
        this.h = amlVar.h;
    }

    public final boolean a() {
        return this.h.a() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aml amlVar = (aml) obj;
        if (this.b == amlVar.b && this.c == amlVar.c && this.d == amlVar.d && this.e == amlVar.e && this.f == amlVar.f && this.g == amlVar.g && this.i == amlVar.i) {
            return this.h.equals(amlVar.h);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.i;
        if (i == 0) {
            throw null;
        }
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        long j = this.f;
        long j2 = this.g;
        return (((((((((((((i * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.h.hashCode();
    }
}
