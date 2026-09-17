package defpackage;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class naj extends mvd {
    final /* synthetic */ ojq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naj(pyn pynVar, Context context, ojq ojqVar) {
        super("NetworkMetric", pynVar, context);
        this.d = ojqVar;
    }

    @Override // defpackage.mvd
    public final ope a(qyk qykVar) {
        if ((qykVar.a & 32) == 0) {
            return orx.a;
        }
        opc opcVarD = ope.D();
        qxk qxkVar = qykVar.f;
        if (qxkVar == null) {
            qxkVar = qxk.b;
        }
        Iterator it = qxkVar.a.iterator();
        while (it.hasNext()) {
            opcVarD.i(this.d.e(((qxj) it.next()).d));
        }
        return opcVarD.f();
    }
}
