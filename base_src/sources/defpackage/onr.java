package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class onr extends ont {
    final /* synthetic */ onu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onr(onu onuVar) {
        super(onuVar);
        this.a = onuVar;
    }

    @Override // defpackage.ont
    public final Object a(int i) {
        return this.a.b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iD = ohh.D(obj);
        int iD2 = this.a.d(obj, iD);
        if (iD2 == -1) {
            return false;
        }
        this.a.i(iD2, iD);
        return true;
    }
}
