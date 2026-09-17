package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pgm extends pge {
    private List c;

    public pgm(ood oodVar, boolean z) {
        super(oodVar, z, true);
        List listEmptyList = oodVar.isEmpty() ? Collections.emptyList() : obr.ak(oodVar.size());
        for (int i = 0; i < oodVar.size(); i++) {
            listEmptyList.add(null);
        }
        this.c = listEmptyList;
        r();
    }

    @Override // defpackage.pge
    public final void g(int i, Object obj) {
        List list = this.c;
        if (list != null) {
            list.set(i, new kkm(obj));
        }
    }

    @Override // defpackage.pge
    public final void q() {
        List<kkm> list = this.c;
        if (list != null) {
            ArrayList arrayListAk = obr.ak(list.size());
            for (kkm kkmVar : list) {
                arrayListAk.add(kkmVar != null ? kkmVar.a : null);
            }
            o(Collections.unmodifiableList(arrayListAk));
        }
    }

    @Override // defpackage.pge
    public final void s(int i) {
        super.s(i);
        this.c = null;
    }
}
