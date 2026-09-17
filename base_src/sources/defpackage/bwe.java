package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class bwe extends onf implements List, lie {
    private final ArrayList a = new ArrayList();
    private boolean b;

    @Override // defpackage.one, defpackage.onj
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.onf, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        obr.aQ(!this.b);
        this.a.add(i, (lie) obj);
    }

    @Override // defpackage.onf, java.util.List
    public final boolean addAll(int i, Collection collection) {
        obr.aQ(!this.b);
        return this.a.addAll(i, collection);
    }

    @Override // defpackage.onf, defpackage.one
    protected final /* synthetic */ Collection b() {
        return this.a;
    }

    @Override // defpackage.onf
    protected final List c() {
        return this.a;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((lie) arrayList.get(i)).close();
        }
        this.a.clear();
    }

    @Override // defpackage.onf, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        obr.aQ(!this.b);
        return (lie) this.a.get(i);
    }

    @Override // defpackage.onf, java.util.List
    public final int indexOf(Object obj) {
        obr.aQ(!this.b);
        return this.a.indexOf(obj);
    }

    @Override // defpackage.onf, java.util.List
    public final int lastIndexOf(Object obj) {
        obr.aQ(!this.b);
        return this.a.lastIndexOf(obj);
    }

    @Override // defpackage.onf, java.util.List
    public final ListIterator listIterator() {
        obr.aQ(!this.b);
        return this.a.listIterator();
    }

    @Override // defpackage.onf, java.util.List
    public final ListIterator listIterator(int i) {
        obr.aQ(!this.b);
        return this.a.listIterator(i);
    }

    @Override // defpackage.onf, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        obr.aQ(!this.b);
        return (lie) this.a.remove(i);
    }

    @Override // defpackage.onf, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        obr.aQ(!this.b);
        return (lie) this.a.set(i, (lie) obj);
    }

    @Override // defpackage.onf, java.util.List
    public final List subList(int i, int i2) {
        obr.aQ(!this.b);
        return this.a.subList(i, i2);
    }
}
