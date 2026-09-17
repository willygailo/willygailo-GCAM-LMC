package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes2.dex */
public final class kmx {
    public final SparseIntArray a;
    public khn b;

    public kmx() {
        khm khmVar = khm.a;
        throw null;
    }

    public kmx(khn khnVar) {
        this.a = new SparseIntArray();
        mip.dk(khnVar);
        this.b = khnVar;
    }

    public final void a() {
        this.a.clear();
    }

    public final int b(int i) {
        return this.a.get(i, -1);
    }
}
