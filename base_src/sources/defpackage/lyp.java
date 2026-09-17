package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class lyp implements lyl {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public volatile lyl b = null;

    private final lyj c(String str, lyd[] lydVarArr, lyk lykVar) {
        lyk lykVar2 = (lyk) this.a.putIfAbsent(str, lykVar);
        if (lykVar2 == null) {
            return lykVar;
        }
        mip.aI(str, lykVar2.b, lydVarArr);
        return lykVar2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [lyb, lyj] */
    public final lyb a(String str, lyd... lydVarArr) {
        lyk lykVar = (lyk) this.a.get(str);
        if (lykVar == null) {
            return c(str, lydVarArr, new lyk(str, lydVarArr, this, lya.c(lydVarArr, lyh.b)));
        }
        mip.aI(str, lykVar.b, lydVarArr);
        return lykVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [lyg, lyj] */
    public final lyg b(String str, lyd... lydVarArr) {
        lyk lykVar = (lyk) this.a.get(str);
        if (lykVar == null) {
            return c(str, lydVarArr, new lyk(str, lydVarArr, this, lya.c(lydVarArr, lyh.a)));
        }
        mip.aI(str, lykVar.b, lydVarArr);
        return lykVar;
    }
}
