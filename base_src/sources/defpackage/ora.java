package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class ora extends osc {
    public abstract oqw a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof oqv) {
            oqv oqvVar = (oqv) obj;
            if (oqvVar.a() > 0 && a().gD(oqvVar.b()) == oqvVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof oqv)) {
            return false;
        }
        oqv oqvVar = (oqv) obj;
        Object objB = oqvVar.b();
        int iA = oqvVar.a();
        if (iA != 0) {
            return a().h(objB, iA);
        }
        return false;
    }
}
