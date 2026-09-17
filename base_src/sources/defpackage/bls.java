package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bls extends wy {
    private int k;

    @Override // defpackage.xf, java.util.Map, j$.util.Map
    public final void clear() {
        this.k = 0;
        super.clear();
    }

    @Override // defpackage.xf
    public final Object g(int i) {
        this.k = 0;
        return super.g(i);
    }

    @Override // defpackage.xf
    public final Object h(int i, Object obj) {
        this.k = 0;
        return super.h(i, obj);
    }

    @Override // defpackage.xf, java.util.Map, j$.util.Map
    public final int hashCode() {
        int i = this.k;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode();
        this.k = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.xf
    public final void k(xf xfVar) {
        this.k = 0;
        int i = xfVar.j;
        j(this.j + i);
        if (this.j != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(xfVar.f(i2), xfVar.i(i2));
            }
        } else if (i > 0) {
            System.arraycopy(xfVar.h, 0, this.h, 0, i);
            System.arraycopy(xfVar.i, 0, this.i, 0, i + i);
            this.j = i;
        }
    }

    @Override // defpackage.xf, java.util.Map, j$.util.Map
    public final Object put(Object obj, Object obj2) {
        this.k = 0;
        return super.put(obj, obj2);
    }
}
