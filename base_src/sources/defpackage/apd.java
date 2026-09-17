package defpackage;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class apd implements apg {
    public final apc a;
    public final Object b;
    private final aph[] c;

    static {
        kus.g("WorkConstraintsTracker");
    }

    public apd(Context context, aso asoVar, apc apcVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = apcVar;
        this.c = new aph[]{new ape(applicationContext, asoVar), new apf(applicationContext, asoVar), new apm(applicationContext, asoVar), new api(applicationContext, asoVar), new apl(applicationContext, asoVar), new apk(applicationContext, asoVar), new apj(applicationContext, asoVar)};
        this.b = new Object();
    }

    public final void a(Iterable iterable) {
        synchronized (this.b) {
            aph[] aphVarArr = this.c;
            for (int i = 0; i < 7; i++) {
                aphVarArr[i].d(null);
            }
            aph[] aphVarArr2 = this.c;
            for (int i2 = 0; i2 < 7; i2++) {
                aph aphVar = aphVarArr2[i2];
                aphVar.a.clear();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    aqt aqtVar = (aqt) it.next();
                    if (aphVar.b(aqtVar)) {
                        aphVar.a.add(aqtVar.a);
                    }
                }
                if (aphVar.a.isEmpty()) {
                    aphVar.c.f(aphVar);
                } else {
                    aps apsVar = aphVar.c;
                    synchronized (apsVar.b) {
                        if (apsVar.c.add(aphVar)) {
                            if (apsVar.c.size() == 1) {
                                apsVar.d = apsVar.b();
                                kus kusVarL = kus.l();
                                String.format("%s: initial state = %s", apsVar.getClass().getSimpleName(), apsVar.d);
                                kusVarL.h(new Throwable[0]);
                                apsVar.d();
                            }
                            aphVar.a(apsVar.d);
                        }
                    }
                }
                aphVar.e(aphVar.d, aphVar.b);
            }
            aph[] aphVarArr3 = this.c;
            for (int i3 = 0; i3 < 7; i3++) {
                aphVarArr3[i3].d(this);
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            aph[] aphVarArr = this.c;
            for (int i = 0; i < 7; i++) {
                aph aphVar = aphVarArr[i];
                if (!aphVar.a.isEmpty()) {
                    aphVar.a.clear();
                    aphVar.c.f(aphVar);
                }
            }
        }
    }

    public final boolean c(String str) {
        synchronized (this.b) {
            aph[] aphVarArr = this.c;
            for (int i = 0; i < 7; i++) {
                aph aphVar = aphVarArr[i];
                Object obj = aphVar.b;
                if (obj != null && aphVar.c(obj) && aphVar.a.contains(str)) {
                    kus kusVarL = kus.l();
                    String.format("Work %s constrained by %s", str, aphVar.getClass().getSimpleName());
                    kusVarL.h(new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }
}
