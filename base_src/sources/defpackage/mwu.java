package defpackage;

import android.os.health.HealthStats;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class mwu extends mww {
    public static final mwu a = new mwu();

    private mwu() {
    }

    @Override // defpackage.mww
    public final /* synthetic */ pqm a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        poy poyVarM = qwy.e.m();
        poyVarM.I(mwx.a.d(myq.d(healthStats, 40001)));
        poyVarM.J(mwt.a.d((healthStats == null || !healthStats.hasMeasurements(40002)) ? Collections.emptyMap() : healthStats.getMeasurements(40002)));
        if (str != null) {
            qwx qwxVarE = myq.e(str);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qwy qwyVar = (qwy) poyVarM.b;
            qwxVarE.getClass();
            qwyVar.d = qwxVarE;
            qwyVar.a |= 1;
        }
        qwy qwyVar2 = (qwy) poyVarM.j();
        if (myq.j(qwyVar2)) {
            return null;
        }
        return qwyVar2;
    }

    @Override // defpackage.mww
    public final /* synthetic */ pqm b(pqm pqmVar, pqm pqmVar2) {
        qwy qwyVar = (qwy) pqmVar;
        qwy qwyVar2 = (qwy) pqmVar2;
        if (qwyVar == null || qwyVar2 == null) {
            return qwyVar;
        }
        poy poyVarM = qwy.e.m();
        poyVarM.I(mwx.a.e(qwyVar.b, qwyVar2.b));
        poyVarM.J(mwt.a.e(qwyVar.c, qwyVar2.c));
        qwx qwxVar = qwyVar.d;
        if (qwxVar == null) {
            qwxVar = qwx.d;
        }
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qwy qwyVar3 = (qwy) poyVarM.b;
        qwxVar.getClass();
        qwyVar3.d = qwxVar;
        qwyVar3.a |= 1;
        qwy qwyVar4 = (qwy) poyVarM.j();
        if (myq.j(qwyVar4)) {
            return null;
        }
        return qwyVar4;
    }

    @Override // defpackage.mww
    public final /* bridge */ /* synthetic */ String c(pqm pqmVar) {
        qwx qwxVar = ((qwy) pqmVar).d;
        if (qwxVar == null) {
            qwxVar = qwx.d;
        }
        return qwxVar.c;
    }
}
