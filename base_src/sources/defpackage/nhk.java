package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class nhk extends LinkedHashMap {
    final /* synthetic */ nhl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhk(nhl nhlVar, int i) {
        super(i, 0.75f, true);
        this.a = nhlVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.a.a;
    }
}
