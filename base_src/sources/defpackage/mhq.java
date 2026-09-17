package defpackage;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mhq implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public mhq(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return new mhp((mgr) ((pyt) this.a).a, lzg.d(), null);
            case 1:
                Set set = ((pyw) this.a).get();
                amr amrVar = new amr();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    amrVar.a.add((ani) it.next());
                }
                return amrVar;
            case 2:
                mym mymVar = (mym) ((qkg) ((ojc) ((pyt) this.a).a).e(lyh.e)).get();
                qmd.ae(mymVar);
                return mymVar;
            case 3:
                mxv mxvVar = (mxv) ((qkg) ((ojc) ((pyt) this.a).a).e(lyh.g)).get();
                qmd.ae(mxvVar);
                return mxvVar;
            case 4:
                myd mydVar = (myd) ((qkg) ((evv) this.a).a().e(lyh.h)).get();
                qmd.ae(mydVar);
                return mydVar;
            case 5:
                mzh mzhVar = (mzh) ((qkg) ((ojc) ((pyt) this.a).a).e(lyh.i)).get();
                qmd.ae(mzhVar);
                return mzhVar;
            case 6:
                nbk nbkVar = (nbk) ((qkg) ((evv) this.a).a().e(lyh.k)).get();
                qmd.ae(nbkVar);
                return nbkVar;
            case 7:
                return (mux) ((evv) this.a).a().e(mux.a().a());
            case 8:
                nbt nbtVar = (nbt) ((qkg) ((ojc) ((pyt) this.a).a).e(lyh.l)).get();
                qmd.ae(nbtVar);
                return nbtVar;
            case 9:
                nbo nboVar = (nbo) ((qkg) ((evv) this.a).a().e(lyh.c)).get();
                qmd.ae(nboVar);
                return nboVar;
            case 10:
                nbw nbwVar = (nbw) ((qkg) ((ojc) ((pyt) this.a).a).e(lyh.d)).get();
                qmd.ae(nbwVar);
                return nbwVar;
            case 11:
                return new oxk(((emp) this.a).a());
            case 12:
                return new Random(((mdf) this.a.get()).b());
            case 13:
                mun munVar = ((muk) this.a).get();
                mun.a(new mui(munVar));
                return munVar;
            case 14:
                return (mdf) ((evv) this.a).a().e(new mdi());
            case 15:
                return new mur((mdf) this.a.get());
            case 16:
                return Boolean.valueOf(pzr.a.a().b(((emp) this.a).a()));
            case 17:
                return pzr.a.a().a(((emp) this.a).a());
            case 18:
                return pzu.a.a().a(((emp) this.a).a());
            case 19:
                return pzo.a.a().a(((emp) this.a).a());
            default:
                return pzo.a.a().b(((emp) this.a).a());
        }
    }
}
