package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class owk extends owm {
    public final int[] a;
    public final int b;
    private final ovv d;
    private final ovv e;

    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    public owk(ovv ovvVar, ovv ovvVar2) {
        this.d = ovvVar;
        this.e = ovvVar2;
        int iB = ovvVar2.b();
        oxh.y(iB <= 28, "metadata size too large");
        int[] iArr = new int[iB];
        this.a = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            ovd ovdVarD = d(i);
            long j2 = ovdVarD.c | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (ovdVarD.equals(d(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = ovdVarD.b ? iArr[i3] | (1 << (i + 4)) : i;
                } else {
                    iArr[i2] = i;
                    i2++;
                }
            } else {
                iArr[i2] = i;
                i2++;
            }
            i++;
            j = j2;
        }
        this.b = i2;
    }

    @Override // defpackage.owm
    public final int a() {
        return this.b;
    }

    @Override // defpackage.owm
    public final Set b() {
        return new owi(this);
    }

    @Override // defpackage.owm
    public final void c(owc owcVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            ovd ovdVarD = d(i2 & 31);
            if (ovdVarD.b) {
                owcVar.b(ovdVarD, new owj(this, ovdVarD, i2), obj);
            } else {
                owcVar.a(ovdVarD, ovdVarD.d(e(i2)), obj);
            }
        }
    }

    public final ovd d(int i) {
        return (i >= 0 ? this.e : this.d).c(i);
    }

    public final Object e(int i) {
        return (i >= 0 ? this.e : this.d).e(i);
    }
}
