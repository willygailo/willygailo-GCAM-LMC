package defpackage;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class oth implements orl {
    public final NavigableMap a = new TreeMap();

    private oth() {
    }

    public static oth a() {
        return new oth();
    }

    private final void f(omr omrVar, omr omrVar2, Object obj) {
        this.a.put(omrVar, new ota(orj.h(omrVar, omrVar2), obj));
    }

    @Override // defpackage.orl
    public final Map b() {
        return new oqp(this, this.a.values());
    }

    @Override // defpackage.orl
    public final void c(orj orjVar, Object obj) {
        if (orjVar.p()) {
            return;
        }
        obj.getClass();
        e(orjVar);
        this.a.put(orjVar.b, new ota(orjVar, obj));
    }

    @Override // defpackage.orl
    public final void d(orl orlVar) {
        for (Map.Entry entry : ((opb) orlVar).b().entrySet()) {
            c((orj) entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.orl
    public final void e(orj orjVar) {
        if (orjVar.p()) {
            return;
        }
        Map.Entry entryLowerEntry = this.a.lowerEntry(orjVar.b);
        if (entryLowerEntry != null) {
            ota otaVar = (ota) entryLowerEntry.getValue();
            if (otaVar.b().compareTo(orjVar.b) > 0) {
                if (otaVar.b().compareTo(orjVar.c) > 0) {
                    f(orjVar.c, otaVar.b(), ((ota) entryLowerEntry.getValue()).b);
                }
                f(otaVar.a(), orjVar.b, ((ota) entryLowerEntry.getValue()).b);
            }
        }
        Map.Entry entryLowerEntry2 = this.a.lowerEntry(orjVar.c);
        if (entryLowerEntry2 != null) {
            ota otaVar2 = (ota) entryLowerEntry2.getValue();
            if (otaVar2.b().compareTo(orjVar.c) > 0) {
                f(orjVar.c, otaVar2.b(), ((ota) entryLowerEntry2.getValue()).b);
            }
        }
        this.a.subMap(orjVar.b, orjVar.c).clear();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof orl) {
            return b().equals(((orl) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return this.a.values().toString();
    }
}
