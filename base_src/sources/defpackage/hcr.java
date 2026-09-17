package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hcr implements hcs {
    public final lie a;
    public lqd b;
    private final Set c;

    public hcr(Map map, lco lcoVar) {
        HashSet hashSet = new HashSet();
        this.c = hashSet;
        HashMap map2 = new HashMap();
        for (lqd lqdVar : map.values()) {
            lvs lvsVarC = fvq.C(lqdVar);
            lvsVarC.getClass();
            map2.put(lvsVarC.a, lqdVar);
            hashSet.add(lqdVar.a());
        }
        this.a = lcoVar.a(new hcq(this, map2), pgr.INSTANCE);
        lqd lqdVar2 = (lqd) map.get(hdr.RAW_WIDE);
        lqdVar2.getClass();
        this.b = lqdVar2;
    }

    @Override // defpackage.hcs
    public final lco b() {
        return lcv.f(this.c);
    }

    @Override // defpackage.ojz
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized lqd a() {
        return this.b;
    }
}
