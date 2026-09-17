package defpackage;

import android.os.health.HealthStats;

/* JADX INFO: loaded from: classes2.dex */
final class mwx extends mww {
    public static final mwx a = new mwx();

    private mwx() {
    }

    @Override // defpackage.mww
    public final /* synthetic */ pqm a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        poy poyVarM = qxb.e.m();
        int iA = (int) myq.a(healthStats, 50001);
        if (iA != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxb qxbVar = (qxb) poyVarM.b;
            qxbVar.a |= 1;
            qxbVar.b = iA;
        }
        int iA2 = (int) myq.a(healthStats, 50002);
        if (iA2 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxb qxbVar2 = (qxb) poyVarM.b;
            qxbVar2.a |= 2;
            qxbVar2.c = iA2;
        }
        if (str != null) {
            qwx qwxVarE = myq.e(str);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxb qxbVar3 = (qxb) poyVarM.b;
            qwxVarE.getClass();
            qxbVar3.d = qwxVarE;
            qxbVar3.a |= 4;
        }
        qxb qxbVar4 = (qxb) poyVarM.j();
        if (myq.l(qxbVar4)) {
            return null;
        }
        return qxbVar4;
    }

    @Override // defpackage.mww
    public final /* synthetic */ pqm b(pqm pqmVar, pqm pqmVar2) {
        int i;
        int i2;
        qxb qxbVar = (qxb) pqmVar;
        qxb qxbVar2 = (qxb) pqmVar2;
        if (qxbVar == null || qxbVar2 == null) {
            return qxbVar;
        }
        poy poyVarM = qxb.e.m();
        if ((qxbVar.a & 1) != 0 && (i2 = qxbVar.b - qxbVar2.b) != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxb qxbVar3 = (qxb) poyVarM.b;
            qxbVar3.a |= 1;
            qxbVar3.b = i2;
        }
        if ((qxbVar.a & 2) != 0 && (i = qxbVar.c - qxbVar2.c) != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxb qxbVar4 = (qxb) poyVarM.b;
            qxbVar4.a |= 2;
            qxbVar4.c = i;
        }
        qwx qwxVar = qxbVar.d;
        if (qwxVar == null) {
            qwxVar = qwx.d;
        }
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qxb qxbVar5 = (qxb) poyVarM.b;
        qwxVar.getClass();
        qxbVar5.d = qwxVar;
        qxbVar5.a |= 4;
        qxb qxbVar6 = (qxb) poyVarM.j();
        if (myq.l(qxbVar6)) {
            return null;
        }
        return qxbVar6;
    }

    @Override // defpackage.mww
    public final /* bridge */ /* synthetic */ String c(pqm pqmVar) {
        qwx qwxVar = ((qxb) pqmVar).d;
        if (qwxVar == null) {
            qwxVar = qwx.d;
        }
        return qwxVar.c;
    }
}
