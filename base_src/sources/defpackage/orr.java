package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class orr extends oom {
    static final oom a = new orr(new Object[0], 0);
    final transient Object[] b;
    public final transient int c;

    public orr(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.ood
    public final Object[] A() {
        return this.b;
    }

    @Override // defpackage.ood
    public final boolean gI() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        obr.aX(i, this.c);
        Object obj = this.b[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.oom, defpackage.ood
    public final int x(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return i + this.c;
    }

    @Override // defpackage.ood
    public final int y() {
        return this.c;
    }

    @Override // defpackage.ood
    public final int z() {
        return 0;
    }
}
