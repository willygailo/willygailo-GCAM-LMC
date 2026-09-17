package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ilf {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public ilf(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public ilf(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4) {
        if (!z && !z2) {
            z3 = false;
        }
        this.c = z || z2;
        this.f = z2;
        this.a = i;
        this.b = i2;
        this.d = z3;
        this.e = z4;
    }
}
