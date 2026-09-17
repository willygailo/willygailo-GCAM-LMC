package defpackage;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class myl extends mvd {
    public myl(pyn pynVar, Context context) {
        super("CrashMetric", pynVar, context);
    }

    @Override // defpackage.mvd
    public final ope a(qyk qykVar) {
        if ((qykVar.a & 64) == 0) {
            return orx.a;
        }
        qxy qxyVar = qykVar.g;
        if (qxyVar == null) {
            qxyVar = qxy.j;
        }
        pey peyVar = qxyVar.h;
        if (peyVar == null) {
            peyVar = pey.d;
        }
        opc opcVarD = ope.D();
        pex pexVar = peyVar.b;
        if (pexVar == null) {
            pexVar = pex.f;
        }
        opcVarD.d(pexVar.c);
        Iterator it = peyVar.c.iterator();
        while (it.hasNext()) {
            opcVarD.d(((pex) it.next()).c);
        }
        return opcVarD.f();
    }
}
