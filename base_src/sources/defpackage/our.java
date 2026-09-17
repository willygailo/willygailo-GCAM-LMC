package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class our extends ous {
    private final int d;
    private int f = 0;
    private final String b = "A";
    private final String c = "a";
    private final String e = "PG";

    public our(int i) {
        this.d = i;
    }

    @Override // defpackage.ous
    public final int a() {
        return (char) this.d;
    }

    @Override // defpackage.ous
    public final String b() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.ous
    public final String c() {
        return this.e;
    }

    @Override // defpackage.ous
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof our) {
            our ourVar = (our) obj;
            if (this.b.equals(ourVar.b) && this.c.equals(ourVar.c) && this.d == ourVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((this.b.hashCode() + 4867) * 31) + this.c.hashCode()) * 31) + this.d;
        this.f = iHashCode;
        return iHashCode;
    }
}
