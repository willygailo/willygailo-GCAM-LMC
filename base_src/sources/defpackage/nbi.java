package defpackage;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class nbi extends mvd {
    final /* synthetic */ ojq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbi(pyn pynVar, Context context, ojq ojqVar) {
        super("StorageMetric", pynVar, context);
        this.d = ojqVar;
    }

    @Override // defpackage.mvd
    public final ope a(qyk qykVar) {
        if ((qykVar.a & 256) == 0) {
            return orx.a;
        }
        opc opcVarD = ope.D();
        qyf qyfVar = qykVar.i;
        if (qyfVar == null) {
            qyfVar = qyf.k;
        }
        Iterator it = qyfVar.j.iterator();
        while (it.hasNext()) {
            opcVarD.i(this.d.g(((qye) it.next()).b));
        }
        return opcVarD.f();
    }
}
