package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class osq extends osj implements Set {
    private static final long serialVersionUID = 0;

    public osq(Set set, Object obj) {
        super(set, obj);
    }

    @Override // defpackage.osj
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set a() {
        return (Set) super.a();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.h) {
            zEquals = a().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode;
        synchronized (this.h) {
            iHashCode = a().hashCode();
        }
        return iHashCode;
    }
}
