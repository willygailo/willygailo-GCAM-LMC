package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class njt implements pgk {
    public final List a;
    public final Executor b;

    public njt(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    @Override // defpackage.pgk
    public final /* bridge */ /* synthetic */ pht a(Object obj) {
        final nkp nkpVar = (nkp) obj;
        int i = ((orr) this.a).c;
        ArrayList arrayList = new ArrayList(i);
        otj it = ((oom) this.a).iterator();
        while (it.hasNext()) {
            arrayList.add(((njp) it.next()).b());
        }
        final pgk pgkVarB = ogl.b(new njs(this, arrayList, i, 0));
        final pgr pgrVar = pgr.INSTANCE;
        nkpVar.a.e.a();
        return pgb.i(pgb.i(plk.W(nkpVar.a.c.c()), ogl.b(new pgk() { // from class: nko
            @Override // defpackage.pgk
            public final pht a(Object obj2) {
                nkp nkpVar2 = nkpVar;
                return nkpVar2.a.b.d(pgkVarB, pgrVar);
            }
        }), pgr.INSTANCE), ogl.b(new njs(this, i, arrayList, 1)), pgr.INSTANCE);
    }
}
