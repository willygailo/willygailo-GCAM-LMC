package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class otf extends AbstractMap {
    final /* synthetic */ otg a;

    public otf(otg otgVar) {
        this.a = otgVar;
    }

    public final boolean a(ojf ojfVar) {
        ArrayList arrayListAg = obr.ag();
        for (Map.Entry entry : entrySet()) {
            if (ojfVar.a(entry)) {
                arrayListAg.add((orj) entry.getKey());
            }
        }
        int size = arrayListAg.size();
        for (int i = 0; i < size; i++) {
            this.a.b.e((orj) arrayListAg.get(i));
        }
        return !arrayListAg.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        otg otgVar = this.a;
        otgVar.b.e(otgVar.a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new otc(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        ota otaVar;
        try {
            if (obj instanceof orj) {
                orj orjVar = (orj) obj;
                orj orjVar2 = this.a.a;
                if (orjVar2.b.compareTo(orjVar.b) <= 0 && orjVar2.c.compareTo(orjVar.c) >= 0 && !orjVar.p()) {
                    if (orjVar.b.compareTo(this.a.a.b) == 0) {
                        Map.Entry entryFloorEntry = this.a.b.a.floorEntry(orjVar.b);
                        otaVar = entryFloorEntry != null ? (ota) entryFloorEntry.getValue() : null;
                    } else {
                        otaVar = (ota) this.a.b.a.get(orjVar.b);
                    }
                    if (otaVar != null && otaVar.a.o(this.a.a) && otaVar.a.i(this.a.a).equals(orjVar)) {
                        return otaVar.b;
                    }
                }
                return null;
            }
            return null;
        } catch (ClassCastException e) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new otb(this, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Object obj2 = get(obj);
        if (obj2 == null) {
            return null;
        }
        obj.getClass();
        this.a.b.e((orj) obj);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new ote(this, this);
    }
}
