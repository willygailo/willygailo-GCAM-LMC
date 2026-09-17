package defpackage;

import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iuc implements lij {
    public final /* synthetic */ iud a;
    private final /* synthetic */ int b;

    public /* synthetic */ iuc(iud iudVar, int i) {
        this.b = i;
        this.a = iudVar;
    }

    @Override // defpackage.lij
    public final void fB(Object obj) {
        int i = 0;
        switch (this.b) {
            case 0:
                iud iudVar = this.a;
                List list = (List) obj;
                boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
                boolean zBooleanValue2 = ((Boolean) list.get(1)).booleanValue();
                if (iudVar.a.get() != zBooleanValue2) {
                    iudVar.a.set(zBooleanValue2);
                }
                iudVar.b.set(zBooleanValue);
                if (list.size() > 2) {
                    boolean zBooleanValue3 = ((Boolean) list.get(2)).booleanValue();
                    boolean zBooleanValue4 = ((Boolean) list.get(3)).booleanValue();
                    if (iudVar.c.get() != zBooleanValue4) {
                        iudVar.c.set(zBooleanValue4);
                    }
                    iudVar.d.set(zBooleanValue3);
                }
                iudVar.e();
                if (iudVar.f.k(ddl.br)) {
                    iudVar.e.p(iudVar.h);
                    if (iudVar.g.g()) {
                        ((jzr) iudVar.g.c()).j(iudVar.h);
                    }
                }
                break;
            default:
                iud iudVar2 = this.a;
                if (Collection.EL.stream((List) obj).allMatch(bql.q)) {
                    ArrayList arrayListAj = obr.aj(iudVar2.e.a(), iudVar2.e.c());
                    if (iudVar2.g.g()) {
                        arrayListAj.add(((jzr) iudVar2.g.c()).b());
                        arrayListAj.add(((jzr) iudVar2.g.c()).c());
                    }
                    iudVar2.i.i().c(lcv.a(arrayListAj).a(new iuc(iudVar2, i), pgr.INSTANCE));
                }
                break;
        }
    }
}
