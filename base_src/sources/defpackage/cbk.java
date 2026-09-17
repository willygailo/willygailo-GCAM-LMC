package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class cbk implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public cbk(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ccn get() {
        Context contextA = ((emp) this.a).a();
        oom oomVarB = byr.b();
        mdf mdfVar = (mdf) this.b.get();
        ExecutorService executorServiceA = ((bwn) this.c).a();
        ddf ddfVar = (ddf) this.d.get();
        cch cchVar = new cch(contextA, executorServiceA, mdfVar, oomVarB);
        cchVar.f = 10000;
        if (ddfVar.k(ddl.be)) {
            cchVar.g = true;
        }
        opc opcVarD = ope.D();
        oon oonVarM = oor.m();
        ooh oohVarE = oom.e();
        opcVarD.d("CREATE TABLE media_record(media_id INTEGER PRIMARY KEY, session_id INTEGER,source_id STRING NOT NULL,selection_key INTEGER NOT NULL,time INTEGER NOT NULL)");
        oohVarE.g("media_record");
        otj it = ((oom) cchVar.c).iterator();
        while (it.hasNext()) {
            cck cckVar = (cck) it.next();
            oohVarE.g(cckVar.a);
            oonVarM.e(cckVar.a, cckVar.c);
            char c = 0;
            opcVarD.d(String.format("CREATE TABLE %s(media_id INTEGER PRIMARY KEY, time INTEGER NOT NULL,value BLOB NOT NULL)", cckVar.a));
            oom oomVar = cckVar.b;
            int i = ((orr) oomVar).c;
            int i2 = 0;
            while (i2 < i) {
                ccj ccjVar = (ccj) oomVar.get(i2);
                Object[] objArr = new Object[1];
                objArr[c] = cckVar.a;
                String str = String.format("ALTER TABLE %s ADD ", objArr);
                String str2 = ccjVar.a;
                String str3 = ccjVar.b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length() + str3.length());
                sb.append(str);
                sb.append(str2);
                sb.append(" ");
                sb.append(str3);
                opcVarD.d(sb.toString());
                i2++;
                c = 0;
            }
        }
        if (cchVar.g) {
            oohVarE.g("session");
            opcVarD.d("CREATE TABLE session(session_id INTEGER PRIMARY KEY, time INTEGER NOT NULL,value BLOB)");
        }
        return new ccn(cchVar.a, cchVar.d, cchVar.e, cchVar.b, cchVar.f, oohVarE.f(), opcVarD.f(), oonVarM.c());
    }
}
