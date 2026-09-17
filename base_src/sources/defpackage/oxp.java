package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class oxp {
    public static final Comparator a = new mvm(3);
    public static final oxp b = new oxp(new oxn(Collections.emptyList()));
    public final oxn c;

    public oxp(oxn oxnVar) {
        this.c = oxnVar;
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oxp) && ((oxp) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ (-1);
    }

    public final String toString() {
        return this.c.toString();
    }
}
