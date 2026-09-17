package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dwu {
    private static final ouj a = ouj.h("com/google/android/apps/camera/gallery/processing/ProcessingMediaManagerImpl");
    private final Map b = new HashMap();

    private final synchronized dws f(long j) {
        for (dws dwsVar : this.b.values()) {
            if (dwsVar.a.a == j) {
                return dwsVar;
            }
        }
        ((oug) ((oug) a.b()).G(954)).q("Mediastore record not found for %s", j);
        return null;
    }

    public final ojc a(long j) {
        return ojc.h(f(j));
    }

    public final synchronized ojc b(hsp hspVar) {
        return ojc.h((dws) this.b.get(hspVar));
    }

    public final synchronized List c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (dws dwsVar : this.b.values()) {
            if (dwsVar.e()) {
                arrayList.add(dwsVar);
            }
        }
        arrayList.size();
        return arrayList;
    }

    public final synchronized dws d(hsp hspVar) {
        dws dwsVar;
        obr.aK(this.b.containsKey(hspVar), "No session associated with session: %s", hspVar);
        dwsVar = (dws) this.b.remove(hspVar);
        dwsVar.getClass();
        return dwsVar;
    }

    public final synchronized void e(hsp hspVar, dws dwsVar) {
        obr.aO(!this.b.containsKey(hspVar), "Already contain pending ProcessingMedia <%s> for session <%s>. Now attempting to associate ProcessingMedia <%s> with same session.", this.b.get(hspVar), hspVar, dwsVar);
        this.b.put(hspVar, dwsVar);
    }
}
