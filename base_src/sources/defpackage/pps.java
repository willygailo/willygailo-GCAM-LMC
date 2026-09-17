package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class pps implements Map.Entry {
    public final Map.Entry a;

    public pps(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((ppu) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof pqm)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        ppu ppuVar = (ppu) this.a.getValue();
        pqm pqmVar = ppuVar.a;
        ppuVar.b = null;
        ppuVar.a = (pqm) obj;
        return pqmVar;
    }
}
