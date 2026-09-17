package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class gil extends ldl {
    public gil(lco lcoVar, lce lceVar) {
        super(lcv.b(lcoVar, lceVar));
    }

    @Override // defpackage.ldl
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        List list = (List) obj;
        lwc lwcVar = (lwc) list.get(0);
        if (((hkc) list.get(1)) == hkc.AUTO) {
            return 1;
        }
        return (lwcVar == lwc.FULL || lwcVar == lwc.SIMPLE || lwcVar == lwc.EXTENDED) ? 2 : 1;
    }
}
