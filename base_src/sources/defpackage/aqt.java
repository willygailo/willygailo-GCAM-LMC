package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aqt {
    public static final /* synthetic */ int s = 0;
    public String a;
    public final String b;
    public String c;
    public amq d;
    public amq e;
    public long f;
    public long g;
    public long h;
    public aml i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public int p;
    public int q;
    public int r;

    static {
        kus.g("WorkSpec");
    }

    public aqt(aqt aqtVar) {
        this.p = 1;
        this.d = amq.a;
        this.e = amq.a;
        this.i = aml.a;
        this.q = 1;
        this.k = 30000L;
        this.n = -1L;
        this.r = 1;
        this.a = aqtVar.a;
        this.b = aqtVar.b;
        this.p = aqtVar.p;
        this.c = aqtVar.c;
        this.d = new amq(aqtVar.d);
        this.e = new amq(aqtVar.e);
        this.f = aqtVar.f;
        this.g = aqtVar.g;
        this.h = aqtVar.h;
        this.i = new aml(aqtVar.i);
        this.j = aqtVar.j;
        this.q = aqtVar.q;
        this.k = aqtVar.k;
        this.l = aqtVar.l;
        this.m = aqtVar.m;
        this.n = aqtVar.n;
        this.o = aqtVar.o;
        this.r = aqtVar.r;
    }

    public aqt(String str, String str2) {
        this.p = 1;
        this.d = amq.a;
        this.e = amq.a;
        this.i = aml.a;
        this.q = 1;
        this.k = 30000L;
        this.n = -1L;
        this.r = 1;
        this.a = str;
        this.b = str2;
    }

    public final long a() {
        if (c()) {
            return this.l + Math.min(18000000L, this.q == 2 ? this.k * ((long) this.j) : (long) Math.scalb(this.k, this.j - 1));
        }
        long j = 0;
        if (!d()) {
            long jCurrentTimeMillis = this.l;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j2 = this.l;
        long j3 = j2 == 0 ? jCurrentTimeMillis2 + this.f : j2;
        long j4 = this.h;
        long j5 = this.g;
        if (j4 != j5) {
            j = j2 == 0 ? -j4 : 0L;
            j3 += j5;
        } else if (j2 != 0) {
            j = j5;
        }
        return j3 + j;
    }

    public final boolean b() {
        return !aml.a.equals(this.i);
    }

    public final boolean c() {
        return this.p == 1 && this.j > 0;
    }

    public final boolean d() {
        return this.g != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aqt aqtVar = (aqt) obj;
        if (this.f != aqtVar.f || this.g != aqtVar.g || this.h != aqtVar.h || this.j != aqtVar.j || this.k != aqtVar.k || this.l != aqtVar.l || this.m != aqtVar.m || this.n != aqtVar.n || this.o != aqtVar.o || !this.a.equals(aqtVar.a) || this.p != aqtVar.p || !this.b.equals(aqtVar.b)) {
            return false;
        }
        String str = this.c;
        if (str == null ? aqtVar.c == null : str.equals(aqtVar.c)) {
            return this.d.equals(aqtVar.d) && this.e.equals(aqtVar.e) && this.i.equals(aqtVar.i) && this.q == aqtVar.q && this.r == aqtVar.r;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        int i = this.p;
        gg.g(i);
        int iHashCode2 = ((((iHashCode * 31) + i) * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        int iHashCode4 = this.d.hashCode();
        int iHashCode5 = this.e.hashCode();
        long j = this.f;
        long j2 = this.g;
        long j3 = this.h;
        int iHashCode6 = (((((((((((((((iHashCode2 + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + this.i.hashCode()) * 31) + this.j) * 31;
        int i2 = this.q;
        if (i2 == 0) {
            throw null;
        }
        long j4 = this.k;
        long j5 = this.l;
        long j6 = this.m;
        long j7 = this.n;
        int i3 = (((((((((((iHashCode6 + i2) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31) + ((int) ((j6 >>> 32) ^ j6))) * 31) + ((int) ((j7 >>> 32) ^ j7))) * 31) + (this.o ? 1 : 0)) * 31;
        int i4 = this.r;
        if (i4 != 0) {
            return i3 + i4;
        }
        throw null;
    }

    public final String toString() {
        return "{WorkSpec: " + this.a + "}";
    }
}
