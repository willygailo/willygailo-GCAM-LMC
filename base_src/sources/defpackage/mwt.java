package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mwt extends mww {
    public static final mwt a = new mwt();

    private mwt() {
    }

    @Override // defpackage.mww
    public final /* bridge */ /* synthetic */ pqm a(String str, Object obj) {
        int iIntValue = ((Long) obj).intValue();
        if (iIntValue == 0) {
            return null;
        }
        poy poyVarM = qww.d.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qww qwwVar = (qww) poyVarM.b;
        qwwVar.a |= 1;
        qwwVar.b = iIntValue;
        if (str != null) {
            qwx qwxVarE = myq.e(str);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qww qwwVar2 = (qww) poyVarM.b;
            qwxVarE.getClass();
            qwwVar2.c = qwxVarE;
            qwwVar2.a |= 2;
        }
        return (qww) poyVarM.j();
    }

    @Override // defpackage.mww
    public final /* synthetic */ pqm b(pqm pqmVar, pqm pqmVar2) {
        qww qwwVar = (qww) pqmVar;
        qww qwwVar2 = (qww) pqmVar2;
        if (qwwVar == null || qwwVar2 == null) {
            return qwwVar;
        }
        if ((qwwVar.a & 1) == 0) {
            return null;
        }
        poy poyVarM = qww.d.m();
        qwx qwxVar = qwwVar.c;
        if (qwxVar == null) {
            qwxVar = qwx.d;
        }
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qww qwwVar3 = (qww) poyVarM.b;
        qwxVar.getClass();
        qwwVar3.c = qwxVar;
        int i = qwwVar3.a | 2;
        qwwVar3.a = i;
        int i2 = qwwVar.b - qwwVar2.b;
        if (i2 == 0) {
            return null;
        }
        qwwVar3.a = i | 1;
        qwwVar3.b = i2;
        return (qww) poyVarM.j();
    }

    @Override // defpackage.mww
    public final /* bridge */ /* synthetic */ String c(pqm pqmVar) {
        qwx qwxVar = ((qww) pqmVar).c;
        if (qwxVar == null) {
            qwxVar = qwx.d;
        }
        return qwxVar.c;
    }
}
