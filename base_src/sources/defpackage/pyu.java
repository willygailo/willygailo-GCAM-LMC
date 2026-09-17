package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class pyu extends pyp {
    public static final /* synthetic */ int b = 0;

    static {
        pyt.a(Collections.emptyMap());
    }

    public pyu(Map map) {
        super(map);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map get() {
        LinkedHashMap linkedHashMapAg = qmd.ag(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            linkedHashMapAg.put(entry.getKey(), ((qkg) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(linkedHashMapAg);
    }
}
