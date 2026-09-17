package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class myt extends myq implements mxo, mwa {
    private static final ouj a = ouj.h("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl");
    private final mxl b;
    private final Context c;
    private final mwe d;
    private final Executor e;
    private final myn f;
    private final qkg g;
    private final pyn h;
    private final qkg i;
    private final qkg j;

    public myt(mxm mxmVar, Context context, mwe mweVar, Executor executor, myn mynVar, qkg qkgVar, pyn pynVar, qkg qkgVar2, qkg qkgVar3) {
        this.b = mxmVar.a(executor, pynVar, null);
        this.c = context;
        this.d = mweVar;
        this.e = executor;
        this.f = mynVar;
        this.g = qkgVar;
        this.h = pynVar;
        this.i = qkgVar2;
        this.j = qkgVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ pht s(final myt mytVar) {
        if (!((mym) mytVar.h.get()).b()) {
            return phq.a;
        }
        if (Application.getProcessName().equals(mytVar.c.getPackageName()) && ((Boolean) mytVar.i.get()).booleanValue()) {
            final List listA = mytVar.f.a(0, 0, ((SharedPreferences) mytVar.g.get()).getString("lastExitProcessName", null), ((SharedPreferences) mytVar.g.get()).getLong("lastExitTimestamp", -1L));
            if (listA.isEmpty()) {
                return phq.a;
            }
            qws qwsVar = (qws) mytVar.j.get();
            poy poyVarM = qwr.e.m();
            int i = ((orr) listA).c;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qwr qwrVar = (qwr) poyVarM.b;
            int i2 = qwrVar.a | 2;
            qwrVar.a = i2;
            qwrVar.d = i;
            qwsVar.getClass();
            qwrVar.c = qwsVar;
            qwrVar.a = i2 | 1;
            HashSet hashSetB = obr.B();
            for (int i3 = 0; i3 < qwsVar.a.size(); i3++) {
                int iG = qno.G(qwsVar.a.d(i3));
                if (iG == 0) {
                    iG = 1;
                }
                hashSetB.add(Integer.valueOf(iG - 1));
            }
            otj it = ((oom) listA).iterator();
            while (it.hasNext()) {
                qwq qwqVar = (qwq) it.next();
                int iG2 = qno.G(qwqVar.c);
                if (iG2 == 0) {
                    iG2 = 1;
                }
                if (hashSetB.contains(Integer.valueOf(iG2 - 1))) {
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    qwr qwrVar2 = (qwr) poyVarM.b;
                    qwqVar.getClass();
                    ppm ppmVar = qwrVar2.b;
                    if (!ppmVar.c()) {
                        qwrVar2.b = ppd.B(ppmVar);
                    }
                    qwrVar2.b.add(qwqVar);
                }
            }
            qwr qwrVar3 = (qwr) poyVarM.j();
            mxl mxlVar = mytVar.b;
            mxf mxfVarA = mxg.a();
            poy poyVarM2 = qyk.t.m();
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qyk qykVar = (qyk) poyVarM2.b;
            qwrVar3.getClass();
            qykVar.s = qwrVar3;
            qykVar.a |= 134217728;
            mxfVarA.d((qyk) poyVarM2.j());
            return pgb.h(mxlVar.b(mxfVarA.a()), new oiu() { // from class: myr
                @Override // defpackage.oiu
                public final Object a(Object obj) {
                    this.a.u(listA, (Void) obj);
                    return null;
                }
            }, mytVar.e);
        }
        return phq.a;
    }

    @Override // defpackage.mwa
    public void c(Activity activity) {
        this.d.b(this);
        v();
    }

    @Override // defpackage.mxo
    public void t() {
        this.d.a(this);
    }

    public /* synthetic */ Void u(List list, Void r7) {
        int i = 0;
        qwq qwqVar = (qwq) list.get(0);
        do {
            String str = qwqVar.b;
            i++;
            if (((SharedPreferences) this.g.get()).edit().putString("lastExitProcessName", str).putLong("lastExitTimestamp", qwqVar.f).commit()) {
                return null;
            }
        } while (i < 3);
        ((oug) ((oug) a.c()).G((char) 3627)).o("Failed to persist most recent App Exit");
        return null;
    }

    public void v() {
        plk.aa(new pgj() { // from class: mys
            @Override // defpackage.pgj
            public final pht a() {
                return myt.s(this.a);
            }
        }, this.e);
    }
}
