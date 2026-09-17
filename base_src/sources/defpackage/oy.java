package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes2.dex */
public final class oy {
    final SparseIntArray a = new SparseIntArray();
    final SparseIntArray b = new SparseIntArray();

    public static final int c(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public final void a() {
        this.b.clear();
    }

    public final void b() {
        this.a.clear();
    }
}
