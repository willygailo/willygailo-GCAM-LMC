package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class aq {
    final ar a;
    aq b;
    public ap f;
    final int g;
    public int c = 0;
    int d = -1;
    public int h = 1;
    public int i = 1;
    public int e = 0;

    public aq(ar arVar, int i) {
        this.a = arVar;
        this.g = i;
    }

    private final String f(HashSet hashSet) {
        String str;
        if (!hashSet.add(this)) {
            return "<-";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("null:");
        sb.append(d.f(this.g));
        if (this.b != null) {
            str = " connected to " + this.b.f(hashSet);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public final int a() {
        aq aqVar;
        if (this.a.K == 8) {
            return 0;
        }
        int i = this.d;
        return (i < 0 || (aqVar = this.b) == null || aqVar.a.K != 8) ? this.c : i;
    }

    public final void b() {
        this.b = null;
        this.c = 0;
        this.d = -1;
        this.h = 2;
        this.e = 0;
        this.i = 1;
    }

    public final boolean c() {
        return this.b != null;
    }

    public final void d(aq aqVar, int i, int i2, int i3, int i4, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (aqVar == null) {
            this.b = null;
            this.c = 0;
            this.d = -1;
            this.h = 1;
            this.e = 2;
            return;
        }
        if (!z) {
            int i5 = aqVar.g;
            int i6 = this.g;
            if (i5 != i6) {
                switch (i6 - 1) {
                    case 1:
                    case 3:
                        if (i5 == 2) {
                            z2 = true;
                        } else if (i5 == 4) {
                            i5 = 4;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!(aqVar.a instanceof at)) {
                            z4 = z2;
                        } else if (!z2 && i5 != 8) {
                            z4 = false;
                        }
                        if (!z4) {
                        }
                        break;
                    case 2:
                    case 4:
                        if (i5 == 3) {
                            z3 = true;
                        } else if (i5 == 5) {
                            i5 = 5;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!(aqVar.a instanceof at)) {
                            z4 = z3;
                        } else if (!z3 && i5 != 9) {
                            z4 = false;
                        }
                        if (!z4) {
                        }
                        break;
                    case 6:
                        if (i5 == 6 || i5 == 8 || i5 == 9) {
                        }
                        break;
                }
                return;
            }
            if (i6 == 7) {
                return;
            }
            if (i6 == 6 && (!aqVar.a.s() || !this.a.s())) {
                return;
            }
        }
        this.b = aqVar;
        if (i > 0) {
            this.c = i;
        } else {
            this.c = 0;
        }
        this.d = i2;
        this.h = i3;
        this.e = i4;
    }

    public final void e() {
        ap apVar = this.f;
        if (apVar == null) {
            this.f = new ap(1);
        } else {
            apVar.b();
        }
    }

    public final String toString() {
        String str;
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        sb.append("null:");
        sb.append(d.f(this.g));
        if (this.b != null) {
            str = " connected to " + this.b.f(hashSet);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
