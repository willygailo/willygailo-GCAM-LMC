package defpackage;

import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class cko implements pys {
    private final qkg a;

    public cko(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List get() {
        List list = (List) Collection.EL.stream((Set) ((pyt) this.a).a).sorted(Comparator$CC.comparing(cgw.d)).collect(Collectors.toList());
        qmd.ae(list);
        return list;
    }
}
