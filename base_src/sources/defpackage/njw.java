package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class njw {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Executor c;
    private final nio d;
    private final pgk e;
    private final Map f;
    private final nkw g;

    public njw(Executor executor, nio nioVar, nkw nkwVar, Map map) {
        executor.getClass();
        this.c = executor;
        nioVar.getClass();
        this.d = nioVar;
        this.g = nkwVar;
        this.f = map;
        obr.aF(!map.isEmpty());
        this.e = ewp.h;
    }

    public final synchronized nkq a(njv njvVar) {
        nkq nkqVar;
        Uri uri = njvVar.a;
        nkqVar = (nkq) this.a.get(uri);
        if (nkqVar == null) {
            Uri uri2 = njvVar.a;
            obr.aK(uri2.isHierarchical(), "Uri must be hierarchical: %s", uri2);
            String strC = oje.c(uri2.getLastPathSegment());
            int iLastIndexOf = strC.lastIndexOf(46);
            boolean z = true;
            obr.aK((iLastIndexOf == -1 ? "" : strC.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri2);
            obr.aG(njvVar.b != null, "Proto schema cannot be null");
            obr.aG(njvVar.c != null, "Handler cannot be null");
            nks nksVar = (nks) this.f.get("singleproc");
            if (nksVar == null) {
                z = false;
            }
            obr.aK(z, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
            String strC2 = oje.c(njvVar.a.getLastPathSegment());
            int iLastIndexOf2 = strC2.lastIndexOf(46);
            if (iLastIndexOf2 != -1) {
                strC2 = strC2.substring(0, iLastIndexOf2);
            }
            nkq nkqVar2 = new nkq(nksVar.a(njvVar, strC2, this.c, this.d), pgb.i(plk.V(njvVar.a), this.e, pgr.INSTANCE), njvVar.f);
            oom oomVar = njvVar.d;
            if (!oomVar.isEmpty()) {
                nkqVar2.c(new njt(oomVar, this.c));
            }
            this.a.put(uri, nkqVar2);
            this.b.put(uri, njvVar);
            nkqVar = nkqVar2;
        } else {
            obr.aK(njvVar.equals((njv) this.b.get(uri)), "Arguments must match previous call for Uri: %s", uri);
        }
        return nkqVar;
    }
}
