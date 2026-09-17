package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
final class nqg extends qnp implements qmj {
    final /* synthetic */ nqh a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqg(nqh nqhVar, int i) {
        super(0);
        this.b = i;
        this.a = nqhVar;
    }

    @Override // defpackage.qmj
    public final /* synthetic */ Object invoke() {
        switch (this.b) {
            case 0:
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                nqh nqhVar = this.a;
                pop popVar = nqhVar.i;
                if (popVar != null) {
                    linkedHashSet.add(new nmw(popVar));
                }
                pop popVar2 = nqhVar.j;
                if (popVar2 != null) {
                    linkedHashSet.add(new nmq(popVar2));
                }
                pop popVar3 = nqhVar.k;
                if (popVar3 != null) {
                    linkedHashSet.add(new nmx(popVar3));
                }
                if (nqhVar.l) {
                    linkedHashSet.add(nmv.a);
                }
                Iterator it = nqhVar.m.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(new nnc((oyj) it.next()));
                }
                String str = nqhVar.n;
                if (str != null) {
                    linkedHashSet.add(new nnf(str));
                }
                return linkedHashSet;
            default:
                nqh nqhVar2 = this.a;
                if (nqhVar2.g == null || nqhVar2.h == null) {
                    return null;
                }
                poy poyVarM = plv.d.m();
                String str2 = nqhVar2.g;
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                plv plvVar = (plv) poyVarM.b;
                str2.getClass();
                int i = plvVar.a | 1;
                plvVar.a = i;
                plvVar.b = str2;
                String str3 = nqhVar2.h;
                str3.getClass();
                plvVar.a = i | 2;
                plvVar.c = str3;
                return (plv) poyVarM.j();
        }
    }
}
