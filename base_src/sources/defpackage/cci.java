package defpackage;

import j$.util.StringJoiner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class cci {
    private static final String c;
    private static final char[] d;
    public final String b;
    public final Map a = new HashMap();
    private final ArrayList e = new ArrayList();

    static {
        String strA = a("a", "media_id");
        String strA2 = a("a", "selection_key");
        String strA3 = a("a", "time");
        int length = String.valueOf(strA).length();
        StringBuilder sb = new StringBuilder(length + 12 + String.valueOf(strA2).length() + String.valueOf(strA3).length());
        sb.append("SELECT ");
        sb.append(strA);
        sb.append(",");
        sb.append(strA2);
        sb.append(",");
        sb.append(strA3);
        sb.append(",%s");
        c = sb.toString();
        d = "bcdefghijklmnopqrstuvwxyz".toCharArray();
    }

    public cci(ccu ccuVar, ccs ccsVar, int i, Random random) {
        String str;
        StringBuilder sb;
        long millis;
        long millis2;
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        StringJoiner stringJoiner = new StringJoiner(",");
        String str4 = " ";
        StringJoiner stringJoiner2 = new StringJoiner(" ");
        String str5 = " AND ";
        StringJoiner stringJoiner3 = new StringJoiner(" AND ");
        String str6 = "media_id";
        String strA = a("a", "media_id");
        Iterator it = ccuVar.h.iterator();
        int i2 = 0;
        while (true) {
            str = str4;
            if (!it.hasNext()) {
                break;
            }
            ccw ccwVar = (ccw) it.next();
            int i3 = i2 + 1;
            char c2 = d[i2];
            Iterator it2 = it;
            String str7 = str5;
            StringBuilder sb3 = new StringBuilder(1);
            sb3.append(c2);
            String string = sb3.toString();
            String str8 = ccwVar.a;
            this.a.put(str8, string);
            StringBuilder sb4 = sb2;
            stringJoiner.add(String.format("%s as %s_%s", a(string, "value"), string, "value"));
            stringJoiner2.add(String.format("INNER JOIN %s %s ON %s=%s", str8, string, strA, a(string, str6)));
            strA = a(string, str6);
            Iterator it3 = Collections.unmodifiableMap(ccwVar.b).keySet().iterator();
            while (it3.hasNext()) {
                String str9 = (String) it3.next();
                String strA2 = a(string, str9);
                Iterator it4 = it3;
                ccp ccpVar = (ccp) Collections.unmodifiableMap(ccwVar.b).get(str9);
                ccpVar.getClass();
                ArrayList arrayList = this.e;
                ccw ccwVar2 = ccwVar;
                String str10 = string;
                ppm ppmVar = (ccpVar.a == 1 ? (ccr) ccpVar.b : ccr.b).a;
                StringBuilder sb5 = new StringBuilder();
                String str11 = " ( ";
                sb5.append(" ( ");
                Iterator it5 = ppmVar.iterator();
                boolean z = false;
                while (it5.hasNext()) {
                    it5 = it5;
                    ccq ccqVar = (ccq) it5.next();
                    if (z) {
                        sb5.append(" OR ");
                    }
                    if ((ccqVar.a & 1) != 0) {
                        str2 = strA;
                        if (ccqVar.c < 100) {
                            sb5.append(str11);
                            sb5.append(strA2);
                            sb5.append(" = ? AND ((");
                            sb5.append(a("a", "selection_key"));
                            sb5.append(" % 100) IN ( ");
                            ArrayList arrayList2 = arrayList;
                            arrayList2.add(Long.toString(ccqVar.b));
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            int i4 = 0;
                            while (true) {
                                str3 = str11;
                                if (i4 >= ccqVar.c) {
                                    break;
                                }
                                if (i4 > 0) {
                                    sb5.append(" , ");
                                }
                                sb5.append("CAST(? as INTEGER)");
                                Integer numValueOf = Integer.valueOf(random.nextInt(100) + 1);
                                while (linkedHashSet.contains(numValueOf)) {
                                    numValueOf = Integer.valueOf(random.nextInt(100) + 1);
                                }
                                linkedHashSet.add(numValueOf);
                                arrayList2.add(String.valueOf(numValueOf));
                                i4++;
                                str11 = str3;
                            }
                            sb5.append(" ))) ");
                            arrayList = arrayList2;
                            strA = str2;
                            str11 = str3;
                            z = true;
                        }
                    } else {
                        str2 = strA;
                    }
                    ArrayList arrayList3 = arrayList;
                    sb5.append(strA2);
                    sb5.append(" = ? ");
                    arrayList3.add(Long.toString(ccqVar.b));
                    arrayList = arrayList3;
                    strA = str2;
                    str11 = str11;
                    z = true;
                }
                sb5.append(" ) ");
                stringJoiner3.add(sb5.toString());
                it3 = it4;
                ccwVar = ccwVar2;
                string = str10;
            }
            i2 = i3;
            str4 = str;
            it = it2;
            str5 = str7;
            sb2 = sb4;
        }
        StringBuilder sb6 = sb2;
        String str12 = str5;
        String str13 = str6;
        int iD = aau.d(ccuVar.d);
        String str14 = (iD == 0 ? 1 : iD) != 2 ? str13 : "selection_key";
        int iD2 = aau.d(ccuVar.d);
        long jLongValue = (iD2 != 0 && iD2 == 2) ? ccsVar.a == 2 ? ((Long) ccsVar.b).longValue() : 0L : ccsVar.a == 1 ? ((Long) ccsVar.b).longValue() : 0L;
        if (stringJoiner3.length() > 0) {
            sb = sb6;
            sb.append(stringJoiner3);
            sb.append(str12);
        } else {
            sb = sb6;
        }
        sb.append(a("a", str14));
        int iD3 = aau.d(ccuVar.d);
        if (iD3 != 0 && iD3 == 4 && jLongValue > 0) {
            sb.append(" < ?");
        } else {
            sb.append(" > ?");
        }
        this.e.add(Long.toString(jLongValue));
        if (ccuVar.a > 0) {
            sb.append(" AND ((");
            sb.append(a("a", "selection_key"));
            sb.append(" % ?) BETWEEN CAST(? as INTEGER) AND CAST(? as INTEGER))");
            this.e.add(String.valueOf(ccuVar.a));
            this.e.add(String.valueOf(ccuVar.b));
            this.e.add(String.valueOf(ccuVar.c));
        }
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
            millis2 = millis4 + timeUnit2.toMillis((prlVar4 == null ? prl.c : prlVar4).b);
        }
        sb.append(" AND (");
        sb.append(a("a", "time"));
        sb.append(" BETWEEN CAST(? as INTEGER) AND CAST(? as INTEGER))");
        this.e.add(String.valueOf(millis));
        this.e.add(String.valueOf(millis2));
        sb.append(" ORDER BY ");
        sb.append(a("a", str14));
        sb.append(str);
        int iD4 = aau.d(ccuVar.d);
        sb.append((iD4 == 0 ? 1 : iD4) != 4 ? "ASC" : "DESC");
        sb.append(" LIMIT ?");
        this.e.add(String.valueOf(i));
        this.b = String.format("%s %s %s WHERE %s", String.format(c, stringJoiner), "FROM media_record a", stringJoiner2, sb);
    }

    static String a(String str, String str2) {
        return String.format("%s.%s", str, str2);
    }

    final String[] b() {
        return (String[]) this.e.toArray(new String[0]);
    }
}
