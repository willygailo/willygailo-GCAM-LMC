package defpackage;

import android.os.health.TimerStat;

/* JADX INFO: loaded from: classes2.dex */
public final class mwy extends mww {
    public static final mwy a = new mwy();

    private mwy() {
    }

    @Override // defpackage.mww
    public final /* synthetic */ pqm a(String str, Object obj) {
        return myq.h(str, (TimerStat) obj);
    }

    @Override // defpackage.mww
    public final /* synthetic */ pqm b(pqm pqmVar, pqm pqmVar2) {
        return myq.g((qxc) pqmVar, (qxc) pqmVar2);
    }

    @Override // defpackage.mww
    public final /* bridge */ /* synthetic */ String c(pqm pqmVar) {
        qxc qxcVar = (qxc) pqmVar;
        qwx qwxVar = qxcVar.d;
        if (qwxVar == null) {
            qwxVar = qwx.d;
        }
        int i = qwxVar.a & 2;
        qwx qwxVar2 = qxcVar.d;
        if (i != 0) {
            if (qwxVar2 == null) {
                qwxVar2 = qwx.d;
            }
            return qwxVar2.c;
        }
        if (qwxVar2 == null) {
            qwxVar2 = qwx.d;
        }
        return Long.toHexString(qwxVar2.b);
    }
}
