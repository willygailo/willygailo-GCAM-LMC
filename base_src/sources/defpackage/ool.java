package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ool extends oom {
    final transient int a;
    final transient int b;
    final /* synthetic */ oom c;

    public ool(oom oomVar, int i, int i2) {
        this.c = oomVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ood
    public final Object[] A() {
        return this.c.A();
    }

    @Override // defpackage.oom
    /* JADX INFO: renamed from: b */
    public final oom subList(int i, int i2) {
        obr.aP(i, i2, this.b);
        oom oomVar = this.c;
        int i3 = this.a;
        return oomVar.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.ood
    public final boolean gI() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        obr.aX(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.oom, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.ood
    public final int y() {
        return this.c.z() + this.a + this.b;
    }

    @Override // defpackage.ood
    public final int z() {
        return this.c.z() + this.a;
    }
}
