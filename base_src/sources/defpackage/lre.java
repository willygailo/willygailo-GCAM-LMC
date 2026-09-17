package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lre implements lij {
    public final pht a;
    private final Set b;

    public lre(ope opeVar) {
        ArrayList arrayList = new ArrayList();
        this.b = opeVar;
        oti otiVarListIterator = opeVar.listIterator();
        while (otiVarListIterator.hasNext()) {
            arrayList.add(((lrd) otiVarListIterator.next()).a);
        }
        this.a = pgb.i(plk.R(arrayList), ewp.e, pgr.INSTANCE);
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        lzr lzrVar = (lzr) obj;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((lrd) it.next()).fB(lzrVar);
        }
    }
}
