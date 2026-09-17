package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class onp extends ont {
    final /* synthetic */ onu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onp(onu onuVar) {
        super(onuVar);
        this.a = onuVar;
    }

    @Override // defpackage.ont
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new ono(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iB = this.a.b(key);
            if (iB != -1 && obr.bc(value, this.a.b[iB])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int iD = ohh.D(key);
        int iC = this.a.c(key, iD);
        if (iC == -1 || !obr.bc(value, this.a.b[iC])) {
            return false;
        }
        this.a.h(iC, iD);
        return true;
    }
}
