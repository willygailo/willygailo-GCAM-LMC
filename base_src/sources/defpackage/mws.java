package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class mws {
    private static final ojq b = ojq.b('/');
    private static final Pattern c = Pattern.compile("^(\\*[a-z]+\\*).*");
    final ConcurrentHashMap a = new ConcurrentHashMap();

    static String a(String str) {
        List listG = b.g(str);
        return listG.size() != 3 ? "MALFORMED" : (String) listG.get(0);
    }

    final qxc b(qxc qxcVar) {
        qwx qwxVar = qxcVar.d;
        if (qwxVar == null) {
            qwxVar = qwx.d;
        }
        if ((qwxVar.a & 1) == 0) {
            return qxcVar;
        }
        qwx qwxVar2 = qxcVar.d;
        if (qwxVar2 == null) {
            qwxVar2 = qwx.d;
        }
        poy poyVar = (poy) qwxVar2.G(5);
        poyVar.o(qwxVar2);
        Long l = (Long) this.a.get(Long.valueOf(((qwx) poyVar.b).b));
        l.getClass();
        poy poyVar2 = (poy) qxcVar.G(5);
        poyVar2.o(qxcVar);
        long jLongValue = l.longValue();
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        qwx qwxVar3 = (qwx) poyVar.b;
        qwxVar3.a |= 1;
        qwxVar3.b = jLongValue;
        if (poyVar2.c) {
            poyVar2.m();
            poyVar2.c = false;
        }
        qxc qxcVar2 = (qxc) poyVar2.b;
        qwx qwxVar4 = (qwx) poyVar.j();
        qwxVar4.getClass();
        qxcVar2.d = qwxVar4;
        qxcVar2.a |= 4;
        return (qxc) poyVar2.j();
    }

    final qxc c(int i, qxc qxcVar) {
        qwx qwxVar = qxcVar.d;
        if (qwxVar == null) {
            qwxVar = qwx.d;
        }
        if ((qwxVar.a & 2) == 0) {
            return qxcVar;
        }
        qwx qwxVar2 = qxcVar.d;
        if (qwxVar2 == null) {
            qwxVar2 = qwx.d;
        }
        poy poyVar = (poy) qwxVar2.G(5);
        poyVar.o(qwxVar2);
        poy poyVar2 = (poy) qxcVar.G(5);
        poyVar2.o(qxcVar);
        String strGroup = ((qwx) poyVar.b).c;
        Long lA = piv.a(strGroup);
        lA.getClass();
        long jLongValue = lA.longValue();
        ConcurrentHashMap concurrentHashMap = this.a;
        Long lValueOf = Long.valueOf(jLongValue);
        if (!concurrentHashMap.containsKey(lValueOf)) {
            switch (i - 1) {
                case 0:
                    Matcher matcher = c.matcher(strGroup);
                    if (matcher.matches()) {
                        if (!strGroup.startsWith("*sync*/")) {
                            strGroup = matcher.group(1);
                        } else {
                            String strValueOf = String.valueOf(a(strGroup.substring(7)));
                            strGroup = strValueOf.length() == 0 ? new String("*sync*/") : "*sync*/".concat(strValueOf);
                        }
                    }
                    break;
                case 1:
                    strGroup = a(strGroup);
                    break;
                case 2:
                    strGroup = "--";
                    break;
            }
            Long lA2 = piv.a(strGroup);
            if (lA2 != null) {
                this.a.putIfAbsent(lValueOf, lA2);
            }
        }
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        qwx qwxVar3 = (qwx) poyVar.b;
        int i2 = qwxVar3.a | 1;
        qwxVar3.a = i2;
        qwxVar3.b = jLongValue;
        qwxVar3.a = i2 & (-3);
        qwxVar3.c = qwx.d.c;
        if (poyVar2.c) {
            poyVar2.m();
            poyVar2.c = false;
        }
        qxc qxcVar2 = (qxc) poyVar2.b;
        qwx qwxVar4 = (qwx) poyVar.j();
        qwxVar4.getClass();
        qxcVar2.d = qwxVar4;
        qxcVar2.a |= 4;
        return (qxc) poyVar2.j();
    }
}
