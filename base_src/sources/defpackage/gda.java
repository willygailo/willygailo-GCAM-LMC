package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gda implements fpq {
    final /* synthetic */ gdj a;

    public gda(gdj gdjVar) {
        this.a = gdjVar;
    }

    @Override // defpackage.fpq
    public final boolean a(orj orjVar) {
        if (this.a.d.isEmpty()) {
            return orj.d(Long.valueOf(this.a.a.a() - 1500000000)).o(orjVar);
        }
        Iterator it = this.a.d.iterator();
        while (it.hasNext()) {
            if (((gdf) it.next()).d.o(orjVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fpq
    public final boolean b(orj orjVar) {
        Iterator it = this.a.e.iterator();
        while (it.hasNext()) {
            if (((gde) it.next()).c().o(orjVar)) {
                return true;
            }
        }
        return false;
    }
}
