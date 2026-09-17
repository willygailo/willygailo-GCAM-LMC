package defpackage;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes2.dex */
final class opf extends oom {
    final /* synthetic */ opg a;

    public opf(opg opgVar) {
        this.a = opgVar;
    }

    @Override // defpackage.ood
    public final boolean gI() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return new AbstractMap.SimpleImmutableEntry(this.a.a.a.d.get(i), this.a.a.b.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.a.size();
    }
}
