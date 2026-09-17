package defpackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class ccl {
    public final String a;
    private final ArrayList b;

    public ccl(ccu ccuVar, ccs ccsVar, int i) {
        long millis;
        long millis2;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        StringBuilder sb = new StringBuilder();
        long jLongValue = ccsVar.a == 1 ? ((Long) ccsVar.b).longValue() : 0L;
        sb.append("session_id");
        if (jLongValue > 0) {
            sb.append(" < ?");
        } else {
            sb.append(" > ?");
        }
        arrayList.add(Long.toString(jLongValue));
        prl prlVar = ccuVar.e;
        long j = (prlVar == null ? prl.c : prlVar).a;
        prl prlVar2 = ccuVar.f;
        long j2 = (prlVar2 == null ? prl.c : prlVar2).a;
        if (j == 0) {
            millis = 0;
        } else {
            long millis3 = TimeUnit.SECONDS.toMillis(j);
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            prl prlVar3 = ccuVar.e;
            millis = millis3 + timeUnit.toMillis((prlVar3 == null ? prl.c : prlVar3).b);
        }
        if (j2 == 0) {
            millis2 = Long.MAX_VALUE;
        } else {
            long millis4 = TimeUnit.SECONDS.toMillis(j2);
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            prl prlVar4 = ccuVar.f;
            millis2 = timeUnit2.toMillis((prlVar4 == null ? prl.c : prlVar4).b) + millis4;
        }
        sb.append(" AND (time BETWEEN CAST(? as INTEGER) AND CAST(? as INTEGER))");
        arrayList.add(String.valueOf(millis));
        arrayList.add(String.valueOf(millis2));
        sb.append(" ORDER BY session_id LIMIT ?");
        arrayList.add(String.valueOf(i));
        this.a = String.format("%s WHERE %s", "SELECT session_id,value FROM session", sb);
    }

    final String[] a() {
        return (String[]) this.b.toArray(new String[0]);
    }
}
