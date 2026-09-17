package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ojx {
    final boolean[] a = new boolean[256];
    public final Set b;

    public ojx(Set set) {
        this.b = set;
        for (int i = 0; i < 256; i++) {
            this.a[i] = this.b.contains(Integer.valueOf(i));
        }
    }
}
