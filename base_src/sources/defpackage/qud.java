package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class qud implements qtr {
    public final qln a;

    public qud(qln qlnVar) {
        this.a = qlnVar;
        boolean z = qql.a;
    }

    @Override // defpackage.qtr
    public final Object a(qts qtsVar, qlh qlhVar) throws Throwable {
        Object objI = qnm.i(new qub(qtsVar, this, null), qlhVar);
        return objI == qlp.COROUTINE_SUSPENDED ? objI : qks.a;
    }

    protected String b() {
        throw null;
    }

    public qtg c(qqj qqjVar) {
        throw null;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strB = b();
        if (strB != null) {
            arrayList.add(strB);
        }
        if (this.a != qlo.a) {
            arrayList.add(qno.a("context=", this.a));
        }
        arrayList.add(qno.a("capacity=", -2));
        return qnm.f(this) + '[' + qmd.D(arrayList, ", ", null, null, null, 62) + ']';
    }
}
