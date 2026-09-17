package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class aph implements apa {
    public final List a = new ArrayList();
    public Object b;
    public final aps c;
    public apg d;

    public aph(aps apsVar) {
        this.c = apsVar;
    }

    @Override // defpackage.apa
    public final void a(Object obj) {
        this.b = obj;
        e(this.d, obj);
    }

    public abstract boolean b(aqt aqtVar);

    public abstract boolean c(Object obj);

    public final void d(apg apgVar) {
        if (this.d != apgVar) {
            this.d = apgVar;
            e(apgVar, this.b);
        }
    }

    public final void e(apg apgVar, Object obj) {
        if (this.a.isEmpty() || apgVar == null) {
            return;
        }
        if (obj == null || c(obj)) {
            List list = this.a;
            synchronized (((apd) apgVar).b) {
                apc apcVar = ((apd) apgVar).a;
                if (apcVar != null) {
                    apcVar.f(list);
                }
            }
            return;
        }
        List<String> list2 = this.a;
        synchronized (((apd) apgVar).b) {
            ArrayList arrayList = new ArrayList();
            for (String str : list2) {
                if (((apd) apgVar).c(str)) {
                    kus kusVarL = kus.l();
                    String.format("Constraints met for %s", str);
                    kusVarL.h(new Throwable[0]);
                    arrayList.add(str);
                }
            }
            apc apcVar2 = ((apd) apgVar).a;
            if (apcVar2 != null) {
                apcVar2.e(arrayList);
            }
        }
    }
}
