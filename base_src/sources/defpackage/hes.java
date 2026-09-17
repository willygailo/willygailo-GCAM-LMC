package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hes {
    private static final ouj d = ouj.h("com/google/android/apps/camera/pixelcamerakit/temporalbinning/TemporalBinningUtils");
    public final ddf a;
    public final lap b;
    public final meh c;
    private final ebe e;

    public hes(meh mehVar, ebe ebeVar, ddf ddfVar, lap lapVar, byte[] bArr, byte[] bArr2) {
        this.c = mehVar;
        this.e = ebeVar;
        this.a = ddfVar;
        this.b = lapVar;
    }

    private final Set c(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lmr lmrVar = (lmr) it.next();
            lmw lmwVarB = lmrVar.b();
            if (lmwVarB != null && !b(lmrVar)) {
                hashSet.add(lmwVarB);
            }
        }
        return hashSet;
    }

    public final Set a(List list) {
        if (!this.a.k(ddm.W)) {
            return orx.a;
        }
        Set setC = c(list);
        if (!list.isEmpty() && setC.size() == list.size()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lzv lzvVarC = ((lmr) it.next()).c();
                if (lzvVarC != null) {
                    hashSet.add(Integer.valueOf(this.e.a(lzvVarC)));
                }
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                this.e.v(((Integer) it2.next()).intValue());
            }
            setC = c(list);
            if (setC.size() == list.size()) {
                ((oug) ((oug) d.b()).G((char) 2414)).o("[zsl-ns] Binning has claimed all frames. Giving up and sending all frames to Gcam.");
                setC.clear();
                return setC;
            }
        }
        return setC;
    }

    public final boolean b(lmr lmrVar) {
        lzv lzvVarC = lmrVar.c();
        return lzvVarC != null && this.e.A(lzvVarC);
    }
}
