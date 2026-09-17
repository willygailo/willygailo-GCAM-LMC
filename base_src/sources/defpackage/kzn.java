package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class kzn extends kzl {
    public kzn(kjj kjjVar) {
        super(kjjVar);
    }

    @Override // defpackage.kyj
    public final void c(kyc kycVar) {
        ArrayList arrayList = new ArrayList();
        List list = kycVar.b;
        if (list != null) {
            arrayList.addAll(list);
        }
        f(new kyy(mip.cc(kycVar.a), arrayList));
    }
}
