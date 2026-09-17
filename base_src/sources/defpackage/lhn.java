package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class lhn extends qnp implements qmj {
    final /* synthetic */ lho a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhn(lho lhoVar) {
        super(0);
        this.a = lhoVar;
    }

    @Override // defpackage.qmj
    public final /* bridge */ /* synthetic */ Object invoke() {
        Set setB = this.a.a.b();
        HashSet hashSet = new HashSet();
        Iterator it = setB.iterator();
        while (it.hasNext()) {
            hashSet.add(((ve) it.next()).a);
        }
        return hashSet;
    }
}
