package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onf extends one implements List {
    protected onf() {
    }

    public void add(int i, Object obj) {
        c().add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        return c().addAll(i, collection);
    }

    @Override // defpackage.one
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    protected abstract List c();

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    public Object get(int i) {
        return c().get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return c().hashCode();
    }

    public int indexOf(Object obj) {
        return c().indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return c().lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return c().listIterator();
    }

    public ListIterator listIterator(int i) {
        return c().listIterator(i);
    }

    public Object remove(int i) {
        return c().remove(i);
    }

    public Object set(int i, Object obj) {
        return c().set(i, obj);
    }

    public List subList(int i, int i2) {
        return c().subList(i, i2);
    }
}
