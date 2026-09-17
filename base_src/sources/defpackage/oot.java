package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
abstract class oot extends ope {
    public abstract oor a();

    @Override // defpackage.ood, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = a().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ood
    public final boolean gI() {
        return a().gM();
    }

    @Override // defpackage.ope, java.util.Collection, java.util.Set
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a().size();
    }

    @Override // defpackage.ope
    public final boolean w() {
        return false;
    }

    @Override // defpackage.ope, defpackage.ood
    Object writeReplace() {
        return new oos(a());
    }
}
