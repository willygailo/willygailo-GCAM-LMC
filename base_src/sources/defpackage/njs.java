package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class njs implements pgk {
    public final /* synthetic */ njt a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ njs(njt njtVar, int i, List list, int i2) {
        this.d = i2;
        this.a = njtVar;
        this.c = i;
        this.b = list;
    }

    public /* synthetic */ njs(njt njtVar, List list, int i, int i2) {
        this.d = i2;
        this.a = njtVar;
        this.b = list;
        this.c = i;
    }

    @Override // defpackage.pgk
    public final pht a(Object obj) {
        switch (this.d) {
            case 0:
                final njt njtVar = this.a;
                final List list = this.b;
                final int i = this.c;
                final pqm pqmVar = (pqm) obj;
                return plk.O(list).b(ogl.a(new pgj() { // from class: njq
                    @Override // defpackage.pgj
                    public final pht a() {
                        njt njtVar2 = njtVar;
                        pqm pqmVar2 = pqmVar;
                        int i2 = i;
                        List list2 = list;
                        pht phtVarV = plk.V(pqmVar2);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if (((Boolean) plk.ad((Future) list2.get(i3))).booleanValue()) {
                                final njp njpVar = (njp) njtVar2.a.get(i3);
                                phtVarV = pgb.i(phtVarV, ogl.b(new pgk() { // from class: njr
                                    @Override // defpackage.pgk
                                    public final pht a(Object obj2) {
                                        return njpVar.c();
                                    }
                                }), pgr.INSTANCE);
                            }
                        }
                        return phtVarV;
                    }
                }), njtVar.b);
            default:
                njt njtVar2 = this.a;
                int i2 = this.c;
                List list2 = this.b;
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    if (((Boolean) plk.ad((Future) list2.get(i3))).booleanValue()) {
                        arrayList.add(((njp) njtVar2.a.get(i3)).a());
                    }
                }
                return plk.Q(arrayList).a(plk.ah(), pgr.INSTANCE);
        }
    }
}
