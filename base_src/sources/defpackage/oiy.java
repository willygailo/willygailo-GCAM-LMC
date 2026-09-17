package defpackage;

import java.util.AbstractList;

/* JADX INFO: loaded from: classes2.dex */
public final class oiy extends AbstractList {
    final /* synthetic */ Object[] a;
    final /* synthetic */ Object b = "#version 300 es";
    final /* synthetic */ Object c;

    public oiy(Object[] objArr, Object obj) {
        this.a = objArr;
        this.c = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        switch (i) {
            case 0:
                return this.b;
            case 1:
                return this.c;
            default:
                return this.a[i - 2];
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.length + 2;
    }
}
