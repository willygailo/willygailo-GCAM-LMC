package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ooj extends oom {
    private final transient oom a;

    public ooj(oom oomVar) {
        this.a = oomVar;
    }

    private final int B(int i) {
        return size() - i;
    }

    private final int w(int i) {
        return (size() - 1) - i;
    }

    @Override // defpackage.oom
    public final oom a() {
        return this.a;
    }

    @Override // defpackage.oom
    /* JADX INFO: renamed from: b */
    public final oom subList(int i, int i2) {
        obr.aP(i, i2, size());
        return this.a.subList(B(i2), B(i)).a();
    }

    @Override // defpackage.oom, defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.ood
    public final boolean gI() {
        return this.a.gI();
    }

    @Override // java.util.List
    public final Object get(int i) {
        obr.aX(i, size());
        return this.a.get(w(i));
    }

    @Override // defpackage.oom, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.a.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return w(iLastIndexOf);
        }
        return -1;
    }

    @Override // defpackage.oom, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.a.indexOf(obj);
        if (iIndexOf >= 0) {
            return w(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.oom, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
