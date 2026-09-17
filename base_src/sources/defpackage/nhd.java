package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class nhd {
    public static final Logger a = Logger.getLogger(nhd.class.getName());
    static final Pattern b;
    static final Pattern c;
    static final Pattern d;
    static final String e;
    private static final Map f;
    private static final Map g;
    private static final String h;
    private static final Pattern i;
    private static final Pattern j;
    private static final Pattern k;
    private static final String l;
    private static final String m;
    private static final Pattern n;
    private static final Pattern o;
    private static final Pattern p;
    private static final Pattern q;
    private static nhd r;
    private final Map s;
    private final ngx x;
    private final nhj y = new nhj();
    private final Set t = new HashSet(35);
    private final nhm u = new nhm(100);
    private final Set v = new HashSet(320);
    private final Set w = new HashSet();

    static {
        HashMap map = new HashMap();
        map.put(54, "9");
        Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        Collections.unmodifiableSet(hashSet2);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put('L', '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put('R', '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put('U', '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put('Z', '9');
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        f = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        g = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        while (it.hasNext()) {
            char cCharValue = ((Character) it.next()).charValue();
            Character chValueOf = Character.valueOf(Character.toLowerCase(cCharValue));
            Character chValueOf2 = Character.valueOf(cCharValue);
            map6.put(chValueOf, chValueOf2);
            map6.put(chValueOf2, chValueOf2);
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put((char) 8211, '-');
        map6.put((char) 8212, '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        Collections.unmodifiableMap(map6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map map7 = f;
        sb.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb.toString();
        h = string;
        b = Pattern.compile("[+＋]+");
        Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        i = Pattern.compile("(\\p{Nd})");
        j = Pattern.compile("[+＋\\p{Nd}]");
        c = Pattern.compile("[\\\\/] *x");
        d = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        k = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + string + "\\p{Nd}]*";
        l = str;
        String strG = G(true);
        m = strG;
        e = G(false);
        n = Pattern.compile("(?:" + strG + ")$", 66);
        o = Pattern.compile(str + "(?:" + strG + ")?", 66);
        Pattern.compile("(\\D+)");
        p = Pattern.compile("(\\$\\d)");
        q = Pattern.compile("\\(?\\$1\\)?");
        r = null;
    }

    public nhd(ngx ngxVar, Map map) {
        this.x = ngxVar;
        this.s = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.w.add(entry.getKey());
            } else {
                this.v.addAll(list);
            }
        }
        if (this.v.remove("001")) {
            a.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.t.addAll((Collection) map.get(1));
    }

    static final nhh C(nhf nhfVar, int i2) {
        switch (i2 - 1) {
            case 0:
            case 2:
                return nhfVar.b;
            case 1:
                return nhfVar.c;
            case 3:
                return nhfVar.d;
            case 4:
                return nhfVar.e;
            case 5:
                return nhfVar.f;
            case 6:
                return nhfVar.h;
            case 7:
                return nhfVar.g;
            case 8:
                return nhfVar.i;
            case 9:
                return nhfVar.j;
            case 10:
                return nhfVar.k;
            default:
                return nhfVar.a;
        }
    }

    static void D(StringBuilder sb) {
        if (!k.matcher(sb).matches()) {
            sb.replace(0, sb.length(), n(sb));
            return;
        }
        int length = sb.length();
        Map map = g;
        StringBuilder sb2 = new StringBuilder(sb.length());
        for (int i2 = 0; i2 < sb.length(); i2++) {
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(sb.charAt(i2))));
            if (ch != null) {
                sb2.append(ch);
            }
        }
        sb.replace(0, length, sb2.toString());
    }

    public static final int E(nhi nhiVar, nhi nhiVar2) {
        nhi nhiVarF = F(nhiVar);
        nhi nhiVarF2 = F(nhiVar2);
        if (nhiVarF.c && nhiVarF2.c && !nhiVarF.d.equals(nhiVarF2.d)) {
            return 2;
        }
        int i2 = nhiVarF.a;
        int i3 = nhiVarF2.a;
        if (i2 != 0 && i3 != 0) {
            if (nhiVarF.a(nhiVarF2)) {
                return 5;
            }
            return (i2 == i3 && K(nhiVarF, nhiVarF2)) ? 3 : 2;
        }
        nhiVarF.e(i3);
        if (nhiVarF.a(nhiVarF2)) {
            return 4;
        }
        return K(nhiVarF, nhiVarF2) ? 3 : 2;
    }

    private static nhi F(nhi nhiVar) {
        nhi nhiVar2 = new nhi();
        nhiVar2.e(nhiVar.a);
        nhiVar2.i(nhiVar.b);
        if (nhiVar.d.length() > 0) {
            nhiVar2.g(nhiVar.d);
        }
        if (nhiVar.e) {
            nhiVar2.h(true);
            nhiVar2.j(nhiVar.f);
        }
        return nhiVar2;
    }

    private static String G(boolean z) {
        String str = (";ext=" + H(20)) + "|" + ("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + H(20) + "#?") + "|" + ("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + H(9) + "#?") + "|" + ("[- ]+" + H(6) + "#");
        if (!z) {
            return str;
        }
        return str + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + H(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + H(9) + "#?");
    }

    private static String H(int i2) {
        return "(\\p{Nd}{1," + i2 + "})";
    }

    private static boolean I(nhh nhhVar) {
        return (nhhVar.a() == 1 && ((Integer) nhhVar.b.get(0)).intValue() == -1) ? false : true;
    }

    private final String J(String str, nhf nhfVar, int i2, CharSequence charSequence) {
        nhe nheVarD = d((nhfVar.u.size() == 0 || i2 == 3) ? nhfVar.t : nhfVar.u, str);
        if (nheVarD == null) {
            return str;
        }
        String str2 = nheVarD.b;
        Matcher matcher = this.u.a(nheVarD.a).matcher(str);
        if (i2 == 3 && charSequence != null && charSequence.length() > 0 && nheVarD.f.length() > 0) {
            return matcher.replaceAll(p.matcher(str2).replaceFirst(nheVarD.f.replace("$CC", charSequence)));
        }
        String str3 = nheVarD.d;
        return (i2 != 3 || str3 == null || str3.length() <= 0) ? matcher.replaceAll(str2) : matcher.replaceAll(p.matcher(str2).replaceFirst(str3));
    }

    private static final boolean K(nhi nhiVar, nhi nhiVar2) {
        String strValueOf = String.valueOf(nhiVar.b);
        String strValueOf2 = String.valueOf(nhiVar2.b);
        return strValueOf.endsWith(strValueOf2) || strValueOf2.endsWith(strValueOf);
    }

    private static final void L(int i2, int i3, StringBuilder sb) {
        switch (i3 - 1) {
            case 0:
                sb.insert(0, i2).insert(0, '+');
                break;
            case 1:
                sb.insert(0, " ").insert(0, i2).insert(0, '+');
                break;
        }
    }

    private static final void M(nhi nhiVar, nhf nhfVar, StringBuilder sb) {
        if (!nhiVar.c || nhiVar.d.length() <= 0) {
            return;
        }
        if (nhfVar.o) {
            sb.append(nhfVar.p);
            sb.append(nhiVar.d);
        } else {
            sb.append(" ext. ");
            sb.append(nhiVar.d);
        }
    }

    public static synchronized nhd c() {
        if (r == null) {
            int i2 = ngw.a;
            p(new nhd(new ngx(), naq.b()));
        }
        return r;
    }

    public static String n(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int iDigit = Character.digit(charSequence.charAt(i2), 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            }
        }
        return sb.toString();
    }

    static synchronized void p(nhd nhdVar) {
        r = nhdVar;
    }

    static boolean r(String str) {
        return str.length() == 0 || q.matcher(str).matches();
    }

    static boolean w(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return o.matcher(charSequence).matches();
    }

    public final int A(CharSequence charSequence, nhf nhfVar, int i2) {
        nhh nhhVarC = C(nhfVar, i2);
        List list = nhhVarC.b.isEmpty() ? nhfVar.a.b : nhhVarC.b;
        List list2 = nhhVarC.c;
        if (i2 == 3) {
            if (!I(C(nhfVar, 1))) {
                return A(charSequence, nhfVar, 2);
            }
            nhh nhhVarC2 = C(nhfVar, 2);
            if (I(nhhVarC2)) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(nhhVarC2.a() == 0 ? nhfVar.a.b : nhhVarC2.b);
                Collections.sort(arrayList);
                if (list2.isEmpty()) {
                    list2 = nhhVarC2.c;
                    list = arrayList;
                } else {
                    ArrayList arrayList2 = new ArrayList(list2);
                    arrayList2.addAll(nhhVarC2.c);
                    Collections.sort(arrayList2);
                    list2 = arrayList2;
                    list = arrayList;
                }
            }
        }
        if (((Integer) list.get(0)).intValue() == -1) {
            return 5;
        }
        int length = charSequence.length();
        Integer numValueOf = Integer.valueOf(length);
        if (list2.contains(numValueOf)) {
            return 2;
        }
        int iIntValue = ((Integer) list.get(0)).intValue();
        if (iIntValue == length) {
            return 1;
        }
        if (iIntValue > length) {
            return 4;
        }
        if (((Integer) list.get(list.size() - 1)).intValue() < length) {
            return 6;
        }
        return list.subList(1, list.size()).contains(numValueOf) ? 1 : 5;
    }

    public final String B(nhi nhiVar, int i2) {
        if (nhiVar.b == 0 && nhiVar.g) {
            String str = nhiVar.h;
            if (str.length() > 0) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i3 = nhiVar.a;
        String strK = k(nhiVar);
        if (i2 == 1) {
            sb.append(strK);
            L(i3, 1, sb);
        } else if (s(i3)) {
            nhf nhfVarF = f(i3, l(i3));
            sb.append(J(strK, nhfVarF, i2, null));
            M(nhiVar, nhfVarF, sb);
            L(i3, i2, sb);
        } else {
            sb.append(strK);
        }
        return sb.toString();
    }

    public final int a(String str) {
        nhf nhfVarE = e(str);
        if (nhfVarE != null) {
            return nhfVarE.m;
        }
        throw new IllegalArgumentException("Invalid region code: " + str);
    }

    final int b(CharSequence charSequence, nhf nhfVar, StringBuilder sb, boolean z, nhi nhiVar) throws ngy {
        int i2;
        int i3 = 0;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        String str = nhfVar != null ? nhfVar.n : "NonMatch";
        if (sb2.length() == 0) {
            i2 = 4;
        } else {
            Matcher matcher = b.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                D(sb2);
                i2 = 1;
            } else {
                Pattern patternA = this.u.a(str);
                D(sb2);
                Matcher matcher2 = patternA.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int iEnd = matcher2.end();
                    Matcher matcher3 = i.matcher(sb2.substring(iEnd));
                    if (matcher3.find() && n(matcher3.group(1)).equals("0")) {
                        i2 = 4;
                    } else {
                        sb2.delete(0, iEnd);
                        i2 = 2;
                    }
                } else {
                    i2 = 4;
                }
            }
        }
        if (z) {
            nhiVar.f(i2);
        }
        if (i2 != 4) {
            if (sb2.length() <= 2) {
                throw new ngy(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            if (sb2.length() != 0 && sb2.charAt(0) != '0') {
                int length = sb2.length();
                for (int i4 = 1; i4 <= 3 && i4 <= length; i4++) {
                    int i5 = Integer.parseInt(sb2.substring(0, i4));
                    if (this.s.containsKey(Integer.valueOf(i5))) {
                        sb.append(sb2.substring(i4));
                        i3 = i5;
                        break;
                    }
                }
            }
            if (i3 == 0) {
                throw new ngy(1, "Country calling code supplied was not recognised.");
            }
            nhiVar.e(i3);
            return i3;
        }
        if (nhfVar != null) {
            int i6 = nhfVar.m;
            String strValueOf = String.valueOf(i6);
            String string = sb2.toString();
            if (string.startsWith(strValueOf)) {
                StringBuilder sb3 = new StringBuilder(string.substring(strValueOf.length()));
                nhh nhhVar = nhfVar.a;
                x(sb3, nhfVar, null);
                if ((!this.y.a(sb2, nhhVar) && this.y.a(sb3, nhhVar)) || z(sb2, nhfVar) == 6) {
                    sb.append((CharSequence) sb3);
                    if (z) {
                        nhiVar.f(3);
                    }
                    nhiVar.e(i6);
                    return i6;
                }
            }
        }
        nhiVar.e(0);
        return 0;
    }

    final nhe d(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nhe nheVar = (nhe) it.next();
            int iA = nheVar.a();
            if (iA == 0 || this.u.a((String) nheVar.c.get(iA - 1)).matcher(str).lookingAt()) {
                if (this.u.a(nheVar.a).matcher(str).matches()) {
                    return nheVar;
                }
            }
        }
        return null;
    }

    public final nhf e(String str) {
        if (v(str)) {
            return ngw.a(str, this.x.a);
        }
        return null;
    }

    public final nhf f(int i2, String str) {
        if (!"001".equals(str)) {
            return e(str);
        }
        Map map = this.s;
        Integer numValueOf = Integer.valueOf(i2);
        if (!map.containsKey(numValueOf)) {
            return null;
        }
        ngx ngxVar = this.x;
        List list = (List) naq.b().get(numValueOf);
        if (list.size() == 1 && "001".equals(list.get(0))) {
            return ngw.a(numValueOf, ngxVar.b);
        }
        return null;
    }

    public final nhi g(CharSequence charSequence, String str) throws ngy {
        nhi nhiVar = new nhi();
        o(charSequence, str, false, true, nhiVar);
        return nhiVar;
    }

    public final nhi h(CharSequence charSequence, String str) throws ngy {
        nhi nhiVar = new nhi();
        o(charSequence, str, true, true, nhiVar);
        return nhiVar;
    }

    public final Iterable i(CharSequence charSequence, String str) {
        return new nhb(this, charSequence, str, nhc.VALID);
    }

    public final String j(nhi nhiVar, CharSequence charSequence) {
        int i2 = nhiVar.a;
        String strK = k(nhiVar);
        if (!s(i2)) {
            return strK;
        }
        nhf nhfVarF = f(i2, l(i2));
        StringBuilder sb = new StringBuilder(20);
        sb.append(J(strK, nhfVarF, 3, charSequence));
        M(nhiVar, nhfVarF, sb);
        L(i2, 3, sb);
        return sb.toString();
    }

    public final String k(nhi nhiVar) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (nhiVar.e && (i2 = nhiVar.f) > 0) {
            char[] cArr = new char[i2];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(nhiVar.b);
        return sb.toString();
    }

    public final String l(int i2) {
        List list = (List) this.s.get(Integer.valueOf(i2));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public final String m(nhi nhiVar) {
        int i2 = nhiVar.a;
        List<String> list = (List) this.s.get(Integer.valueOf(i2));
        if (list == null) {
            a.log(Level.INFO, "Missing/invalid country_code (" + i2 + ")");
            return null;
        }
        if (list.size() == 1) {
            return (String) list.get(0);
        }
        String strK = k(nhiVar);
        for (String str : list) {
            nhf nhfVarE = e(str);
            if (nhfVarE.v) {
                if (this.u.a(nhfVarE.w).matcher(strK).lookingAt()) {
                    return str;
                }
            } else if (y(strK, nhfVarE) != 12) {
                return str;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01de  */
    /* JADX WARN: Code duplicated, block: B:112:0x0203  */
    /* JADX WARN: Code duplicated, block: B:115:0x0212  */
    /* JADX WARN: Code duplicated, block: B:117:0x021a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0220  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01da  */
    public final void o(CharSequence charSequence, String str, boolean z, boolean z2, nhi nhiVar) throws ngy {
        CharSequence charSequenceSubSequence;
        int iB;
        StringBuilder sb;
        nhf nhfVar;
        nhf nhfVarF;
        StringBuilder sb2;
        int length;
        int i2;
        int iZ;
        if (charSequence == null) {
            throw new ngy(2, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new ngy(5, "The string supplied was too long to parse.");
        }
        StringBuilder sb3 = new StringBuilder();
        String string = charSequence.toString();
        int iIndexOf = string.indexOf(";phone-context=");
        String strGroup = "";
        if (iIndexOf >= 0) {
            int i3 = iIndexOf + 15;
            if (i3 < string.length() - 1 && string.charAt(i3) == '+') {
                int iIndexOf2 = string.indexOf(59, i3);
                if (iIndexOf2 > 0) {
                    sb3.append(string.substring(i3, iIndexOf2));
                } else {
                    sb3.append(string.substring(i3));
                }
            }
            int iIndexOf3 = string.indexOf("tel:");
            sb3.append(string.substring(iIndexOf3 >= 0 ? iIndexOf3 + 4 : 0, iIndexOf));
        } else {
            Matcher matcher = j.matcher(string);
            if (matcher.find()) {
                charSequenceSubSequence = string.subSequence(matcher.start(), string.length());
                Matcher matcher2 = d.matcher(charSequenceSubSequence);
                if (matcher2.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = c.matcher(charSequenceSubSequence);
                if (matcher3.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequenceSubSequence = "";
            }
            sb3.append(charSequenceSubSequence);
        }
        int iIndexOf4 = sb3.indexOf(";isub=");
        if (iIndexOf4 > 0) {
            sb3.delete(iIndexOf4, sb3.length());
        }
        if (!w(sb3)) {
            throw new ngy(2, "The string supplied did not seem to be a phone number.");
        }
        if (z2 && !v(str) && (sb3.length() == 0 || !b.matcher(sb3).lookingAt())) {
            throw new ngy(1, "Missing or invalid default region.");
        }
        if (z) {
            nhiVar.l(string);
        }
        Matcher matcher4 = n.matcher(sb3);
        if (matcher4.find() && w(sb3.substring(0, matcher4.start()))) {
            int iGroupCount = matcher4.groupCount();
            for (int i4 = 1; i4 <= iGroupCount; i4++) {
                if (matcher4.group(i4) != null) {
                    strGroup = matcher4.group(i4);
                    sb3.delete(matcher4.start(), sb3.length());
                    break;
                }
            }
        }
        if (strGroup.length() > 0) {
            nhiVar.g(strGroup);
        }
        nhf nhfVarE = e(str);
        StringBuilder sb4 = new StringBuilder();
        try {
            iB = b(sb3, nhfVarE, sb4, z, nhiVar);
        } catch (ngy e2) {
            Matcher matcher5 = b.matcher(sb3);
            if (e2.a != 1 || !matcher5.lookingAt()) {
                throw new ngy(e2.a, e2.getMessage());
            }
            iB = b(sb3.substring(matcher5.end()), nhfVarE, sb4, z, nhiVar);
            if (iB == 0) {
                throw new ngy(1, "Could not interpret numbers after plus-sign.");
            }
        }
        if (iB != 0) {
            String strL = l(iB);
            if (strL.equals(str)) {
                sb = sb4;
                nhfVar = nhfVarE;
            } else {
                nhfVarF = f(iB, strL);
                sb = sb4;
            }
            if (sb.length() >= 2) {
                throw new ngy(4, "The string supplied is too short to be a phone number.");
            }
            if (nhfVarF != null) {
                StringBuilder sb5 = new StringBuilder();
                sb2 = new StringBuilder(sb);
                x(sb2, nhfVarF, sb5);
                iZ = z(sb2, nhfVarF);
                if (iZ != 4 || iZ == 2 || iZ == 5) {
                    sb2 = sb;
                } else if (z && sb5.length() > 0) {
                    nhiVar.k(sb5.toString());
                }
            } else {
                sb2 = sb;
            }
            length = sb2.length();
            if (length >= 2) {
                throw new ngy(4, "The string supplied is too short to be a phone number.");
            }
            if (length <= 17) {
                throw new ngy(5, "The string supplied is too long to be a phone number.");
            }
            if (sb2.length() > 1 && sb2.charAt(0) == '0') {
                nhiVar.h(true);
                i2 = 1;
                while (i2 < sb2.length() - 1 && sb2.charAt(i2) == '0') {
                    i2++;
                }
                if (i2 != 1) {
                    nhiVar.j(i2);
                }
            }
            nhiVar.i(Long.parseLong(sb2.toString()));
        }
        D(sb3);
        sb = sb4;
        sb.append((CharSequence) sb3);
        if (str != null) {
            nhfVar = nhfVarE;
            nhiVar.e(nhfVar.m);
        } else {
            nhfVar = nhfVarE;
            if (z) {
                nhiVar.b();
            }
        }
        nhfVarF = nhfVar;
        if (sb.length() >= 2) {
            throw new ngy(4, "The string supplied is too short to be a phone number.");
        }
        if (nhfVarF != null) {
            StringBuilder sb6 = new StringBuilder();
            sb2 = new StringBuilder(sb);
            x(sb2, nhfVarF, sb6);
            iZ = z(sb2, nhfVarF);
            if (iZ != 4) {
                sb2 = sb;
            } else {
                sb2 = sb;
            }
        } else {
            sb2 = sb;
        }
        length = sb2.length();
        if (length >= 2) {
            throw new ngy(4, "The string supplied is too short to be a phone number.");
        }
        if (length <= 17) {
            throw new ngy(5, "The string supplied is too long to be a phone number.");
        }
        if (sb2.length() > 1) {
            nhiVar.h(true);
            i2 = 1;
            while (i2 < sb2.length() - 1) {
                i2++;
            }
            if (i2 != 1) {
                nhiVar.j(i2);
            }
        }
        nhiVar.i(Long.parseLong(sb2.toString()));
    }

    public final boolean q(nhi nhiVar) {
        nhf nhfVarE = e(m(nhiVar));
        return nhfVarE == null || !t(k(nhiVar), nhfVarE.l);
    }

    public final boolean s(int i2) {
        return this.s.containsKey(Integer.valueOf(i2));
    }

    final boolean t(String str, nhh nhhVar) {
        int length = str.length();
        List list = nhhVar.b;
        if (list.size() <= 0 || list.contains(Integer.valueOf(length))) {
            return this.y.a(str, nhhVar);
        }
        return false;
    }

    public final boolean u(nhi nhiVar) {
        String strM = m(nhiVar);
        int i2 = nhiVar.a;
        nhf nhfVarF = f(i2, strM);
        if (nhfVarF != null) {
            return ("001".equals(strM) || i2 == a(strM)) && y(k(nhiVar), nhfVarF) != 12;
        }
        return false;
    }

    public final boolean v(String str) {
        return str != null && this.v.contains(str);
    }

    final boolean x(StringBuilder sb, nhf nhfVar, StringBuilder sb2) {
        int length = sb.length();
        String str = nhfVar.q;
        if (length == 0 || str.length() == 0) {
            return false;
        }
        Matcher matcher = this.u.a(str).matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        nhh nhhVar = nhfVar.a;
        boolean zA = this.y.a(sb, nhhVar);
        int iGroupCount = matcher.groupCount();
        String str2 = nhfVar.r;
        if (str2 == null || str2.length() == 0 || matcher.group(iGroupCount) == null) {
            if (zA && !this.y.a(sb.substring(matcher.end()), nhhVar)) {
                return false;
            }
            if (sb2 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                sb2.append(matcher.group(1));
            }
            sb.delete(0, matcher.end());
            return true;
        }
        StringBuilder sb3 = new StringBuilder(sb);
        sb3.replace(0, length, matcher.replaceFirst(str2));
        if (zA && !this.y.a(sb3.toString(), nhhVar)) {
            return false;
        }
        if (sb2 != null && iGroupCount > 1) {
            sb2.append(matcher.group(1));
        }
        sb.replace(0, sb.length(), sb3.toString());
        return true;
    }

    public final int y(String str, nhf nhfVar) {
        if (!t(str, nhfVar.a)) {
            return 12;
        }
        if (t(str, nhfVar.e)) {
            return 5;
        }
        if (t(str, nhfVar.d)) {
            return 4;
        }
        if (t(str, nhfVar.f)) {
            return 6;
        }
        if (t(str, nhfVar.h)) {
            return 7;
        }
        if (t(str, nhfVar.g)) {
            return 8;
        }
        if (t(str, nhfVar.i)) {
            return 9;
        }
        if (t(str, nhfVar.j)) {
            return 10;
        }
        if (t(str, nhfVar.k)) {
            return 11;
        }
        if (t(str, nhfVar.b)) {
            return (nhfVar.s || t(str, nhfVar.c)) ? 3 : 1;
        }
        return (nhfVar.s || !t(str, nhfVar.c)) ? 12 : 2;
    }

    public final int z(CharSequence charSequence, nhf nhfVar) {
        return A(charSequence, nhfVar, 12);
    }
}
