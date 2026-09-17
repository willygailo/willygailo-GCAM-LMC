package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class omi extends orh implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;

    public omi(Comparator comparator) {
        comparator.getClass();
        this.a = comparator;
    }

    @Override // defpackage.orh, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof omi) {
            return this.a.equals(((omi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
