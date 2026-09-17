package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ry {
    int a = 0;
    int b;
    int c;
    int d;
    int e;

    static final int e(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 2 : 4;
    }

    final void a(int i) {
        this.a = i | this.a;
    }

    final void b() {
        this.a = 0;
    }

    final void c(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    final boolean d() {
        int i = this.a;
        if ((i & 7) != 0 && (i & e(this.d, this.b)) == 0) {
            return false;
        }
        int i2 = this.a;
        if ((i2 & 112) != 0 && (i2 & (e(this.d, this.c) << 4)) == 0) {
            return false;
        }
        int i3 = this.a;
        if ((i3 & 1792) != 0 && (i3 & (e(this.e, this.b) << 8)) == 0) {
            return false;
        }
        int i4 = this.a;
        return (i4 & 28672) == 0 || (i4 & (e(this.e, this.c) << 12)) != 0;
    }
}
