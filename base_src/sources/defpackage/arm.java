package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class arm {
    public final WorkDatabase a;

    public arm(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public final int a(String str) {
        this.a.h();
        try {
            Long lB = this.a.y().b(str);
            int i = 0;
            int iIntValue = lB != null ? lB.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i = iIntValue + 1;
            }
            b(str, i);
            this.a.j();
            return iIntValue;
        } finally {
            this.a.i();
        }
    }

    public final void b(String str, int i) {
        this.a.y().c(new aqf(str, i));
    }
}
