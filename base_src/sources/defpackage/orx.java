package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class orx extends ope {
    public static final orx a;
    private static final Object[] e;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    private final transient int f;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        e = objArr;
        a = new orx(objArr, 0, objArr, 0, 0);
    }

    public orx(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = i;
        this.d = objArr2;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.ood
    public final Object[] A() {
        return this.b;
    }

    @Override // defpackage.ope
    public final oom C() {
        return oom.h(this.b, this.g);
    }

    @Override // defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.d;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iD = ohh.D(obj);
        while (true) {
            int i = iD & this.f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iD = i + 1;
        }
    }

    @Override // defpackage.ope, defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: gH */
    public final oti listIterator() {
        return v().iterator();
    }

    @Override // defpackage.ood
    public final boolean gI() {
        return false;
    }

    @Override // defpackage.ope, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // defpackage.ope
    public final boolean w() {
        return true;
    }

    @Override // defpackage.ood
    public final int x(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.g);
        return i + this.g;
    }

    @Override // defpackage.ood
    public final int y() {
        return this.g;
    }

    @Override // defpackage.ood
    public final int z() {
        return 0;
    }
}
