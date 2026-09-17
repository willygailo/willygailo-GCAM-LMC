package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class nkn implements pgj {
    public List a;
    final /* synthetic */ nkq b;

    public nkn(nkq nkqVar) {
        this.b = nkqVar;
    }

    @Override // defpackage.pgj
    public final pht a() {
        nkq nkqVar = this.b;
        ogb ogbVar = nkqVar.e;
        String strValueOf = String.valueOf(nkqVar.a);
        ogf ogfVarB = ogbVar.b(strValueOf.length() != 0 ? "Initialize ".concat(strValueOf) : new String("Initialize "));
        try {
            synchronized (this.b.d) {
                if (this.a == null) {
                    nkq nkqVar2 = this.b;
                    this.a = nkqVar2.f;
                    nkqVar2.f = Collections.emptyList();
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            nkp nkpVar = new nkp(this.b);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((pgk) it.next()).a(nkpVar));
                } catch (Exception e) {
                    arrayList.add(plk.U(e));
                }
            }
            pht phtVarA = plk.Q(arrayList).a(new Callable() { // from class: nkm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    nkn nknVar = this.a;
                    synchronized (nknVar.b.d) {
                        nknVar.a = null;
                    }
                    return null;
                }
            }, pgr.INSTANCE);
            ogfVarB.a(phtVarA);
            ogfVarB.close();
            return phtVarA;
        } catch (Throwable th) {
            try {
                ogfVarB.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }
}
