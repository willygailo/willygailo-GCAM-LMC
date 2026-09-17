package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class okh extends onh {
    final /* synthetic */ okm a;
    private final Map.Entry b;

    public okh(okm okmVar, Map.Entry entry) {
        this.a = okmVar;
        this.b = entry;
    }

    @Override // defpackage.onh, defpackage.onj
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.b;
    }

    @Override // defpackage.onh
    protected final Map.Entry b() {
        return this.b;
    }

    @Override // defpackage.onh, java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.a.d(obj);
        obr.aR(this.a.entrySet().contains(this), "entry no longer in map");
        if (obr.bc(obj, getValue())) {
            return obj;
        }
        obr.aK(!this.a.containsValue(obj), "value already present: %s", obj);
        Object value = this.b.setValue(obj);
        obr.aR(obr.bc(obj, this.a.get(getKey())), "entry no longer in map");
        this.a.j(getKey(), true, value, obj);
        return value;
    }
}
