package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aji {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    public aji(String str, List list) {
        this(str, false, list, null);
    }

    public aji(String str, boolean z, List list, List list2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), "ASC") : list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aji)) {
            return false;
        }
        aji ajiVar = (aji) obj;
        if (this.b == ajiVar.b && this.c.equals(ajiVar.c) && this.d.equals(ajiVar.d)) {
            return this.a.startsWith("index_") ? ajiVar.a.startsWith("index_") : this.a.equals(ajiVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.startsWith("index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + ", orders=" + this.d + '}';
    }
}
