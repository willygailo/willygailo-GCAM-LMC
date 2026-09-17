package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class ppw extends pnp implements RandomAccess, ppx {
    private static final ppw b;
    private final List c;

    static {
        ppw ppwVar = new ppw(10);
        b = ppwVar;
        ppwVar.b();
    }

    public ppw() {
        this(10);
    }

    public ppw(int i) {
        this(new ArrayList(i));
    }

    private ppw(ArrayList arrayList) {
        this.c = arrayList;
    }

    private static String j(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof poc ? ((poc) obj).z() : ppn.f((byte[]) obj);
    }

    @Override // defpackage.pnp, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        gN();
        this.c.add(i, (String) obj);
        this.modCount++;
    }

    @Override // defpackage.pnp, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        gN();
        if (collection instanceof ppx) {
            collection = ((ppx) collection).h();
        }
        boolean zAddAll = this.c.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // defpackage.pnp, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // defpackage.pnp, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        gN();
        this.c.clear();
        this.modCount++;
    }

    @Override // defpackage.ppx
    public final ppx d() {
        return this.a ? new prq(this) : this;
    }

    @Override // defpackage.ppm
    public final /* bridge */ /* synthetic */ ppm e(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.c);
        return new ppw(arrayList);
    }

    @Override // defpackage.ppx
    public final Object f(int i) {
        return this.c.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof poc) {
            poc pocVar = (poc) obj;
            String strZ = pocVar.z();
            if (pocVar.p()) {
                this.c.set(i, strZ);
            }
            return strZ;
        }
        byte[] bArr = (byte[]) obj;
        String strF = ppn.f(bArr);
        if (ppn.g(bArr)) {
            this.c.set(i, strF);
        }
        return strF;
    }

    @Override // defpackage.ppx
    public final List h() {
        return Collections.unmodifiableList(this.c);
    }

    @Override // defpackage.ppx
    public final void i(poc pocVar) {
        gN();
        this.c.add(pocVar);
        this.modCount++;
    }

    @Override // defpackage.pnp, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        gN();
        Object objRemove = this.c.remove(i);
        this.modCount++;
        return j(objRemove);
    }

    @Override // defpackage.pnp, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        gN();
        return j(this.c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
