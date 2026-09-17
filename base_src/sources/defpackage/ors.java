package defpackage;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes2.dex */
final class ors extends oom {
    final /* synthetic */ ort a;

    public ors(ort ortVar) {
        this.a = ortVar;
    }

    @Override // defpackage.ood
    public final boolean gI() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        obr.aX(i, this.a.c);
        ort ortVar = this.a;
        Object[] objArr = ortVar.a;
        int i2 = i + i;
        int i3 = ortVar.b;
        Object obj = objArr[i2 + i3];
        obj.getClass();
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }
}
