package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mn {
    final pz d;
    private final fc e = new fd(30);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int c = 0;

    public mn(pz pzVar, byte[] bArr) {
        this.d = pzVar;
    }

    private final int m(int i, int i2) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            mm mmVar = (mm) this.b.get(size);
            int i3 = mmVar.a;
            int i4 = mmVar.b;
            if (i4 <= i) {
                if (i3 == 1) {
                    i -= mmVar.d;
                } else if (i3 == 2) {
                    i += mmVar.d;
                }
            } else if (i2 == 1) {
                mmVar.b = i4 + 1;
            } else if (i2 == 2) {
                mmVar.b = i4 - 1;
            }
        }
        for (int size2 = this.b.size() - 1; size2 >= 0; size2--) {
            mm mmVar2 = (mm) this.b.get(size2);
            int i5 = mmVar2.a;
            if (mmVar2.d <= 0) {
                this.b.remove(size2);
                h(mmVar2);
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    private final void n(mm mmVar) {
        int i;
        boolean z;
        int i2 = mmVar.a;
        if (i2 == 1) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM = m(mmVar.b, i2);
        int i3 = mmVar.b;
        switch (mmVar.a) {
            case 2:
                i = 0;
                break;
            case 3:
            default:
                throw new IllegalArgumentException("op should be remove or update." + mmVar);
            case 4:
                i = 1;
                break;
        }
        int i4 = 1;
        for (int i5 = 1; i5 < mmVar.d; i5++) {
            int iM2 = m(mmVar.b + (i * i5), mmVar.a);
            int i6 = mmVar.a;
            switch (i6) {
                case 2:
                    if (iM2 == iM) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i4++;
                    } else {
                        mm mmVarC = c(i6, iM, i4, mmVar.c);
                        f(mmVarC, i3);
                        h(mmVarC);
                        if (mmVar.a == 4) {
                            i3 += i4;
                        }
                        iM = iM2;
                        i4 = 1;
                    }
                    break;
                case 3:
                default:
                    mm mmVarC2 = c(i6, iM, i4, mmVar.c);
                    f(mmVarC2, i3);
                    h(mmVarC2);
                    if (mmVar.a == 4) {
                        i3 += i4;
                    }
                    iM = iM2;
                    i4 = 1;
                    break;
                case 4:
                    if (iM2 == iM + 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i4++;
                    } else {
                        mm mmVarC3 = c(i6, iM, i4, mmVar.c);
                        f(mmVarC3, i3);
                        h(mmVarC3);
                        if (mmVar.a == 4) {
                            i3 += i4;
                        }
                        iM = iM2;
                        i4 = 1;
                    }
                    break;
            }
        }
        Object obj = mmVar.c;
        h(mmVar);
        if (i4 > 0) {
            mm mmVarC4 = c(mmVar.a, iM, i4, obj);
            f(mmVarC4, i3);
            h(mmVarC4);
        }
    }

    private final void o(mm mmVar) {
        this.b.add(mmVar);
        switch (mmVar.a) {
            case 1:
                this.d.d(mmVar.b, mmVar.d);
                return;
            case 2:
                pz pzVar = this.d;
                pzVar.a.J(mmVar.b, mmVar.d, false);
                pzVar.a.M = true;
                return;
            case 3:
            default:
                throw new IllegalArgumentException("Unknown update op type for " + mmVar);
            case 4:
                this.d.c(mmVar.b, mmVar.d, mmVar.c);
                return;
        }
    }

    private final boolean p(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            mm mmVar = (mm) this.b.get(i2);
            if (mmVar.a == 1) {
                int i3 = mmVar.b;
                int i4 = mmVar.d + i3;
                while (i3 < i4) {
                    if (b(i3, i2 + 1) == i) {
                        return true;
                    }
                    i3++;
                }
            }
        }
        return false;
    }

    final int a(int i) {
        return b(i, 0);
    }

    final int b(int i, int i2) {
        int size = this.b.size();
        while (i2 < size) {
            mm mmVar = (mm) this.b.get(i2);
            int i3 = mmVar.a;
            int i4 = mmVar.b;
            if (i4 <= i) {
                if (i3 == 2) {
                    int i5 = mmVar.d;
                    if (i < i4 + i5) {
                        return -1;
                    }
                    i -= i5;
                } else if (i3 == 1) {
                    i += mmVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final mm c(int i, int i2, int i3, Object obj) {
        mm mmVar = (mm) this.e.a();
        if (mmVar == null) {
            return new mm(i, i2, i3, obj);
        }
        mmVar.a = i;
        mmVar.b = i2;
        mmVar.d = i3;
        mmVar.c = obj;
        return mmVar;
    }

    public final void d() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.d.b((mm) this.b.get(i));
        }
        i(this.b);
        this.c = 0;
    }

    public final void e() {
        d();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            mm mmVar = (mm) this.a.get(i);
            switch (mmVar.a) {
                case 1:
                    this.d.b(mmVar);
                    this.d.d(mmVar.b, mmVar.d);
                    break;
                case 2:
                    this.d.b(mmVar);
                    this.d.e(mmVar.b, mmVar.d);
                    break;
                case 4:
                    this.d.b(mmVar);
                    this.d.c(mmVar.b, mmVar.d, mmVar.c);
                    break;
            }
        }
        i(this.a);
        this.c = 0;
    }

    final void f(mm mmVar, int i) {
        this.d.b(mmVar);
        switch (mmVar.a) {
            case 2:
                this.d.e(i, mmVar.d);
                return;
            case 3:
            default:
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            case 4:
                this.d.c(i, mmVar.d, mmVar.c);
                return;
        }
    }

    public final void g() {
        boolean z;
        byte b;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            int i = ((mm) arrayList.get(size)).a;
        }
        int size2 = this.a.size();
        for (int i2 = 0; i2 < size2; i2++) {
            mm mmVarC = (mm) this.a.get(i2);
            switch (mmVarC.a) {
                case 1:
                    o(mmVarC);
                    break;
                case 2:
                    int i3 = mmVarC.b;
                    int i4 = mmVarC.d + i3;
                    int i5 = i3;
                    int i6 = 0;
                    byte b2 = -1;
                    while (i5 < i4) {
                        if (this.d.a(i5) != null || p(i5)) {
                            if (b2 == 0) {
                                n(c(2, i3, i6, null));
                                z = true;
                            } else {
                                z = false;
                            }
                            b = 1;
                        } else {
                            if (b2 == 1) {
                                o(c(2, i3, i6, null));
                                z = true;
                            } else {
                                z = false;
                            }
                            b = 0;
                        }
                        if (z) {
                            i5 -= i6;
                            i4 -= i6;
                            i6 = 1;
                        } else {
                            i6++;
                        }
                        i5++;
                        b2 = b;
                    }
                    if (i6 != mmVarC.d) {
                        h(mmVarC);
                        mmVarC = c(2, i3, i6, null);
                    }
                    if (b2 == 0) {
                        n(mmVarC);
                    } else {
                        o(mmVarC);
                    }
                    break;
                case 4:
                    int i7 = mmVarC.b;
                    int i8 = mmVarC.d + i7;
                    int i9 = i7;
                    int i10 = 0;
                    byte b3 = -1;
                    while (i7 < i8) {
                        if (this.d.a(i7) != null || p(i7)) {
                            if (b3 == 0) {
                                n(c(4, i9, i10, mmVarC.c));
                                i9 = i7;
                                i10 = 0;
                            }
                            b3 = 1;
                        } else {
                            if (b3 == 1) {
                                o(c(4, i9, i10, mmVarC.c));
                                i9 = i7;
                                i10 = 0;
                            }
                            b3 = 0;
                        }
                        i10++;
                        i7++;
                    }
                    if (i10 != mmVarC.d) {
                        Object obj = mmVarC.c;
                        h(mmVarC);
                        mmVarC = c(4, i9, i10, obj);
                    }
                    if (b3 == 0) {
                        n(mmVarC);
                    } else {
                        o(mmVarC);
                    }
                    break;
            }
        }
        this.a.clear();
    }

    public final void h(mm mmVar) {
        mmVar.c = null;
        this.e.b(mmVar);
    }

    final void i(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            h((mm) list.get(i));
        }
        list.clear();
    }

    public final void j() {
        i(this.a);
        i(this.b);
        this.c = 0;
    }

    public final boolean k(int i) {
        return (i & this.c) != 0;
    }

    public final boolean l() {
        return this.a.size() > 0;
    }
}
