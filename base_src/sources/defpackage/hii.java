package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hii implements hih {
    public final List a = new ArrayList();
    public final HashMap b = new HashMap();

    private final List e(long j) {
        ArrayList arrayList = new ArrayList();
        for (hih hihVar : this.a) {
            if (this.b.get(hihVar) == null || ((Long) this.b.get(hihVar)).longValue() == j) {
                arrayList.add(hihVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.hih
    public final void a(hiy hiyVar, hiz hizVar) {
        List listE;
        synchronized (this.a) {
            listE = e(hiyVar.a);
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            ((hih) it.next()).a(hiyVar, hizVar);
        }
    }

    @Override // defpackage.hih
    public final void b(hiy hiyVar, hsp hspVar) {
        List listE;
        synchronized (this.a) {
            listE = e(hiyVar.a);
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            ((hih) it.next()).b(hiyVar, hspVar);
        }
    }

    @Override // defpackage.hih
    public final void c(hiy hiyVar) {
        List listE;
        synchronized (this.a) {
            listE = e(hiyVar.a);
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            ((hih) it.next()).c(hiyVar);
        }
    }

    @Override // defpackage.hih
    public final void d(hiy hiyVar, fcy fcyVar) {
        List listE;
        synchronized (this.a) {
            listE = e(hiyVar.a);
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            ((hih) it.next()).d(hiyVar, fcyVar);
        }
    }
}
