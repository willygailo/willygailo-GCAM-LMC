package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class lsy extends orh {
    private final oor a;

    public lsy(List list) {
        oon oonVarN = oor.n(((orr) list).c);
        otj it = ((oom) list).iterator();
        int i = 0;
        while (it.hasNext()) {
            oonVarN.e(it.next(), Integer.valueOf(i));
            i++;
        }
        this.a = oonVarN.c();
    }

    private final int i(Object obj) {
        Integer num = (Integer) this.a.get(obj);
        return num == null ? ((orw) this.a).c : num.intValue();
    }

    @Override // defpackage.orh, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return i(obj) - i(obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj instanceof lsy) {
            return this.a.equals(((lsy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
