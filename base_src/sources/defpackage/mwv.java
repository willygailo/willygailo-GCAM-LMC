package defpackage;

import android.os.health.HealthStats;

/* JADX INFO: loaded from: classes2.dex */
public final class mwv extends mww {
    public static final mwv a = new mwv();

    private mwv() {
    }

    @Override // defpackage.mww
    public final /* synthetic */ pqm a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        poy poyVarM = qxa.i.m();
        long jA = myq.a(healthStats, 30001);
        if (jA != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxa qxaVar = (qxa) poyVarM.b;
            qxaVar.a |= 1;
            qxaVar.b = jA;
        }
        long jA2 = myq.a(healthStats, 30002);
        if (jA2 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxa qxaVar2 = (qxa) poyVarM.b;
            qxaVar2.a |= 2;
            qxaVar2.c = jA2;
        }
        long jA3 = myq.a(healthStats, 30003);
        if (jA3 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxa qxaVar3 = (qxa) poyVarM.b;
            qxaVar3.a |= 4;
            qxaVar3.d = jA3;
        }
        long jA4 = myq.a(healthStats, 30004);
        if (jA4 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxa qxaVar4 = (qxa) poyVarM.b;
            qxaVar4.a |= 8;
            qxaVar4.e = jA4;
        }
        long jA5 = myq.a(healthStats, 30005);
        if (jA5 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxa qxaVar5 = (qxa) poyVarM.b;
            qxaVar5.a |= 16;
            qxaVar5.f = jA5;
        }
        long jA6 = myq.a(healthStats, 30006);
        if (jA6 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxa qxaVar6 = (qxa) poyVarM.b;
            qxaVar6.a |= 32;
            qxaVar6.g = jA6;
        }
        if (str != null) {
            qwx qwxVarE = myq.e(str);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxa qxaVar7 = (qxa) poyVarM.b;
            qwxVarE.getClass();
            qxaVar7.h = qwxVarE;
            qxaVar7.a |= 64;
        }
        qxa qxaVar8 = (qxa) poyVarM.j();
        if (myq.k(qxaVar8)) {
            return null;
        }
        return qxaVar8;
    }

    @Override // defpackage.mww
    public final /* synthetic */ pqm b(pqm pqmVar, pqm pqmVar2) {
        qxa qxaVar = (qxa) pqmVar;
        qxa qxaVar2 = (qxa) pqmVar2;
        if (qxaVar == null || qxaVar2 == null) {
            return qxaVar;
        }
        poy poyVarM = qxa.i.m();
        if ((qxaVar.a & 1) != 0) {
            long j = qxaVar.b - qxaVar2.b;
            if (j != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxa qxaVar3 = (qxa) poyVarM.b;
                qxaVar3.a |= 1;
                qxaVar3.b = j;
            }
        }
        if ((qxaVar.a & 2) != 0) {
            long j2 = qxaVar.c - qxaVar2.c;
            if (j2 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxa qxaVar4 = (qxa) poyVarM.b;
                qxaVar4.a |= 2;
                qxaVar4.c = j2;
            }
        }
        if ((qxaVar.a & 4) != 0) {
            long j3 = qxaVar.d - qxaVar2.d;
            if (j3 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxa qxaVar5 = (qxa) poyVarM.b;
                qxaVar5.a |= 4;
                qxaVar5.d = j3;
            }
        }
        if ((qxaVar.a & 8) != 0) {
            long j4 = qxaVar.e - qxaVar2.e;
            if (j4 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxa qxaVar6 = (qxa) poyVarM.b;
                qxaVar6.a |= 8;
                qxaVar6.e = j4;
            }
        }
        if ((qxaVar.a & 16) != 0) {
            long j5 = qxaVar.f - qxaVar2.f;
            if (j5 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxa qxaVar7 = (qxa) poyVarM.b;
                qxaVar7.a |= 16;
                qxaVar7.f = j5;
            }
        }
        if ((qxaVar.a & 32) != 0) {
            long j6 = qxaVar.g - qxaVar2.g;
            if (j6 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxa qxaVar8 = (qxa) poyVarM.b;
                qxaVar8.a |= 32;
                qxaVar8.g = j6;
            }
        }
        qwx qwxVar = qxaVar.h;
        if (qwxVar == null) {
            qwxVar = qwx.d;
        }
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qxa qxaVar9 = (qxa) poyVarM.b;
        qwxVar.getClass();
        qxaVar9.h = qwxVar;
        qxaVar9.a |= 64;
        qxa qxaVar10 = (qxa) poyVarM.j();
        if (myq.k(qxaVar10)) {
            return null;
        }
        return qxaVar10;
    }

    @Override // defpackage.mww
    public final /* bridge */ /* synthetic */ String c(pqm pqmVar) {
        qwx qwxVar = ((qxa) pqmVar).h;
        if (qwxVar == null) {
            qwxVar = qwx.d;
        }
        return qwxVar.c;
    }
}
