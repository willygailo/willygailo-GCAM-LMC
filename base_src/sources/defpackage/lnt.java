package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lnt {
    public final int a;
    public final oom b;
    public final oom c;

    public lnt(int i) {
        this(i, oom.l(), oom.l());
    }

    public lnt(int i, List list) {
        this(i, oom.j(list), oom.l());
    }

    public lnt(int i, oom oomVar, oom oomVar2) {
        this.a = i;
        this.b = oomVar;
        this.c = oomVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lnt)) {
            return false;
        }
        lnt lntVar = (lnt) obj;
        return this.a == lntVar.a && Objects.equals(this.c, lntVar.c) && Objects.equals(this.b, lntVar.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.c, this.b);
    }
}
