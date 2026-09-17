package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface oqw extends Collection {
    @Override // java.util.Collection, defpackage.oqw
    boolean add(Object obj);

    int c(Object obj, int i);

    @Override // java.util.Collection, defpackage.oqw
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection collection);

    @Override // defpackage.oqw
    boolean equals(Object obj);

    void f(Object obj, int i);

    int gD(Object obj);

    boolean h(Object obj, int i);

    @Override // defpackage.oqw
    int hashCode();

    @Override // java.util.Collection, java.lang.Iterable, defpackage.oqw
    Iterator iterator();

    Set j();

    Set k();

    @Override // java.util.Collection, defpackage.oqw
    boolean remove(Object obj);

    @Override // java.util.Collection, defpackage.oqw
    int size();
}
