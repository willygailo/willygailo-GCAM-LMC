package defpackage;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements Serializable {
    public static final x a;
    static final Pattern b;
    static final Pattern c;
    static final Pattern d;
    static final Pattern e;
    static final Pattern f;
    static final Pattern g;
    private static final p i;
    private static final v j;
    private static final long serialVersionUID = 1;
    public final w h;

    static {
        m mVar = new m();
        i = mVar;
        v vVar = new v("other", mVar, null, null);
        j = vVar;
        w wVar = new w();
        wVar.a(vVar);
        a = new x(wVar);
        b = Pattern.compile("\\s*\\Q\\E@\\s*");
        c = Pattern.compile("\\s*or\\s*");
        d = Pattern.compile("\\s*and\\s*");
        e = Pattern.compile("\\s*,\\s*");
        Pattern.compile("\\s*\\Q..\\E\\s*");
        f = Pattern.compile("\\s*~\\s*");
        g = Pattern.compile("\\s*;\\s*");
    }

    private x(w wVar) {
        this.h = wVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = wVar.b.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((v) it.next()).a);
        }
        Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:116:0x01de  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:131:0x0209  */
    /* JADX WARN: Code duplicated, block: B:135:0x0215  */
    /* JADX WARN: Code duplicated, block: B:138:0x022d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0239  */
    /* JADX WARN: Code duplicated, block: B:143:0x0247  */
    /* JADX WARN: Code duplicated, block: B:145:0x0251  */
    /* JADX WARN: Code duplicated, block: B:147:0x025d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0265  */
    /* JADX WARN: Code duplicated, block: B:153:0x0270  */
    /* JADX WARN: Code duplicated, block: B:155:0x027a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0299  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:185:0x0305  */
    /* JADX WARN: Code duplicated, block: B:187:0x0311  */
    /* JADX WARN: Code duplicated, block: B:189:0x031d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0329  */
    /* JADX WARN: Code duplicated, block: B:194:0x0336  */
    /* JADX WARN: Code duplicated, block: B:197:0x0344  */
    /* JADX WARN: Code duplicated, block: B:199:0x034a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0353  */
    /* JADX WARN: Code duplicated, block: B:206:0x035d  */
    /* JADX WARN: Code duplicated, block: B:207:0x035f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0384 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:219:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:220:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:222:0x03bf A[LOOP:5: B:221:0x03bd->B:222:0x03bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:226:0x03d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:234:0x03f3 A[LOOP:4: B:181:0x02e4->B:234:0x03f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:237:0x0423  */
    /* JADX WARN: Code duplicated, block: B:239:0x0438  */
    /* JADX WARN: Code duplicated, block: B:240:0x043a  */
    /* JADX WARN: Code duplicated, block: B:270:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x033f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x034e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0408 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x03a2 A[SYNTHETIC] */
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public static v a(String str) {
        s sVarA;
        s sVarA2;
        String str2;
        s sVar;
        s sVar2;
        p pVar;
        int i2;
        String[] strArr;
        p pVar2;
        String str3;
        s sVar3;
        int i3;
        p pVar3;
        String strF;
        int i4;
        int i5;
        boolean z;
        int i6;
        boolean zEquals;
        int i7;
        String strF2;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        double dMin;
        double dMax;
        long j2;
        int length;
        String str4;
        long j3;
        String str5;
        int size;
        long[] jArr;
        int i8;
        long[] jArr2;
        int i9;
        String strF3;
        int i10;
        String strF4;
        int i11;
        String strF5;
        long j4;
        String strF6;
        int i12;
        String strF7;
        if (str.length() == 0) {
            return j;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int iIndexOf = lowerCase.indexOf(58);
        if (iIndexOf == -1) {
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 34);
            sb.append("missing ':' in rule description '");
            sb.append(lowerCase);
            sb.append("'");
            throw new ParseException(sb.toString(), 0);
        }
        String strTrim = lowerCase.substring(0, iIndexOf).trim();
        for (int i13 = 0; i13 < strTrim.length(); i13++) {
            char cCharAt = strTrim.charAt(i13);
            if (cCharAt < 'a' || cCharAt > 'z') {
                StringBuilder sb2 = new StringBuilder(String.valueOf(strTrim).length() + 22);
                sb2.append("keyword '");
                sb2.append(strTrim);
                sb2.append(" is not valid");
                throw new ParseException(sb2.toString(), 0);
            }
        }
        String strTrim2 = lowerCase.substring(iIndexOf + 1).trim();
        String[] strArrSplit = b.split(strTrim2);
        switch (strArrSplit.length) {
            case 1:
                sVarA = null;
                sVarA2 = null;
                break;
            case 2:
                sVarA = s.a(strArrSplit[1]);
                if (sVarA.c == 2) {
                    sVarA2 = sVarA;
                    sVarA = null;
                } else {
                    sVarA2 = null;
                }
                break;
            case 3:
                sVarA = s.a(strArrSplit[1]);
                sVarA2 = s.a(strArrSplit[2]);
                if (sVarA.c != 1 || sVarA2.c != 2) {
                    String strValueOf = String.valueOf(strTrim2);
                    throw new IllegalArgumentException(strValueOf.length() != 0 ? "Must have @integer then @decimal in ".concat(strValueOf) : new String("Must have @integer then @decimal in "));
                }
                break;
            default:
                String strValueOf2 = String.valueOf(strTrim2);
                throw new IllegalArgumentException(strValueOf2.length() != 0 ? "Too many samples in ".concat(strValueOf2) : new String("Too many samples in "));
        }
        boolean zEquals2 = strTrim.equals("other");
        if (zEquals2 != (strArrSplit[0].length() == 0)) {
            throw new IllegalArgumentException("The keyword 'other' must have no constraints, just samples.");
        }
        if (zEquals2) {
            pVar = i;
            str2 = strTrim;
            sVar = sVarA;
            sVar2 = sVarA2;
        } else {
            String[] strArrSplit2 = c.split(strArrSplit[0]);
            p tVar = null;
            int i14 = 0;
            while (i14 < strArrSplit2.length) {
                String[] strArrSplit3 = d.split(strArrSplit2[i14]);
                int i15 = 0;
                p nVar = null;
                while (i15 < strArrSplit3.length) {
                    p uVar = i;
                    String strTrim3 = strArrSplit3[i15].trim();
                    ArrayList arrayList2 = new ArrayList();
                    int i16 = -1;
                    for (int i17 = 0; i17 < strTrim3.length(); i17++) {
                        char cCharAt2 = strTrim3.charAt(i17);
                        if (cCharAt2 > ' ' || !(cCharAt2 == ' ' || cCharAt2 == '\t' || cCharAt2 == '\n' || cCharAt2 == '\f' || cCharAt2 == '\r')) {
                            if (cCharAt2 <= '=' && cCharAt2 >= '!' && (cCharAt2 == '!' || cCharAt2 == '%' || cCharAt2 == ',' || cCharAt2 == '.' || cCharAt2 == '=')) {
                                if (i16 >= 0) {
                                    arrayList2.add(strTrim3.substring(i16, i17));
                                }
                                arrayList2.add(strTrim3.substring(i17, i17 + 1));
                                i16 = -1;
                            } else if (i16 < 0) {
                                i16 = i17;
                            }
                        } else if (i16 >= 0) {
                            arrayList2.add(strTrim3.substring(i16, i17));
                            i16 = -1;
                        }
                    }
                    if (i16 >= 0) {
                        arrayList2.add(strTrim3.substring(i16));
                    }
                    String[] strArr2 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    String str6 = strArr2[0];
                    try {
                        switch (str6) {
                            case "n":
                                i2 = 1;
                                if (strArr2.length > 1) {
                                    strF = strArr2[1];
                                    if (!"mod".equals(strF) || "%".equals(strF)) {
                                        i4 = Integer.parseInt(strArr2[2]);
                                        strF = f(strArr2, 3, strTrim3);
                                        i5 = 4;
                                    } else {
                                        i5 = 2;
                                        i4 = 0;
                                    }
                                    if ("not".equals(strF)) {
                                        i12 = i5 + 1;
                                        strF7 = f(strArr2, i5, strTrim3);
                                        if ("=".equals(strF7)) {
                                            throw g(strF7, strTrim3);
                                        }
                                        strArr = strArrSplit2;
                                        z = false;
                                        i5 = i12;
                                        strF = strF7;
                                    } else {
                                        strArr = strArrSplit2;
                                        if ("!".equals(strF)) {
                                            i6 = i5 + 1;
                                            strF = f(strArr2, i5, strTrim3);
                                            if (!"=".equals(strF)) {
                                                throw g(strF, strTrim3);
                                            }
                                            i5 = i6;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if ("is".equals(strF)) {
                                        str3 = strTrim;
                                    } else {
                                        str3 = strTrim;
                                        if ("in".equals(strF) && !"=".equals(strF)) {
                                            if (!"within".equals(strF)) {
                                                throw g(strF, strTrim3);
                                            }
                                            i7 = i5 + 1;
                                            strF2 = f(strArr2, i5, strTrim3);
                                            zEquals = false;
                                            z2 = false;
                                        }
                                        if (!"not".equals(strF2)) {
                                            z3 = z;
                                        } else {
                                            if (zEquals && !z) {
                                                throw g(strF2, strTrim3);
                                            }
                                            z3 = !z;
                                            strF2 = f(strArr2, i7, strTrim3);
                                            i7++;
                                        }
                                        arrayList = new ArrayList();
                                        dMin = 9.223372036854776E18d;
                                        dMax = -9.223372036854776E18d;
                                        while (true) {
                                            i3 = i15;
                                            pVar3 = nVar;
                                            j2 = Long.parseLong(strF2);
                                            length = strArr2.length;
                                            str4 = strF2;
                                            if (i7 < length) {
                                                sVar3 = sVarA;
                                                i9 = i7 + 1;
                                                strF3 = f(strArr2, i7, strTrim3);
                                                pVar2 = tVar;
                                                if (strF3.equals(".")) {
                                                    i10 = i9 + 1;
                                                    strF4 = f(strArr2, i9, strTrim3);
                                                    if (strF4.equals(".")) {
                                                        throw g(strF4, strTrim3);
                                                    }
                                                    i11 = i10 + 1;
                                                    strF5 = f(strArr2, i10, strTrim3);
                                                    j4 = Long.parseLong(strF5);
                                                    if (i11 < length) {
                                                        i7 = i11 + 1;
                                                        strF6 = f(strArr2, i11, strTrim3);
                                                        if (strF6.equals(",")) {
                                                            throw g(strF6, strTrim3);
                                                        }
                                                        str4 = strF6;
                                                        j3 = j4;
                                                    } else {
                                                        i7 = i11;
                                                        j3 = j4;
                                                        str4 = strF5;
                                                    }
                                                } else {
                                                    if (strF3.equals(",")) {
                                                        throw g(strF3, strTrim3);
                                                    }
                                                    str4 = strF3;
                                                    i7 = i9;
                                                }
                                                if (j2 <= j3) {
                                                    StringBuilder sb3 = new StringBuilder(41);
                                                    sb3.append(j2);
                                                    sb3.append("~");
                                                    sb3.append(j3);
                                                    throw g(sb3.toString(), strTrim3);
                                                }
                                                if (i4 != 0 && j3 >= i4) {
                                                    StringBuilder sb4 = new StringBuilder(36);
                                                    sb4.append(j3);
                                                    sb4.append(">mod=");
                                                    sb4.append(i4);
                                                    throw g(sb4.toString(), strTrim3);
                                                }
                                                arrayList.add(Long.valueOf(j2));
                                                arrayList.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(dMax, j3);
                                                if (i7 >= length) {
                                                    str5 = str4;
                                                    if (!str5.equals(",")) {
                                                        throw g(str5, strTrim3);
                                                    }
                                                    if (arrayList.size() == 2) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList.size();
                                                        jArr = new long[size];
                                                        for (i8 = 0; i8 < size; i8++) {
                                                            jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin == dMax && zEquals != 0 && !z3) {
                                                        throw g("is not <range>", strTrim3);
                                                    }
                                                    uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                                } else {
                                                    strF2 = f(strArr2, i7, strTrim3);
                                                    i7++;
                                                    strArr2 = strArr2;
                                                    zEquals = zEquals;
                                                    i15 = i3;
                                                    nVar = pVar3;
                                                    sVarA = sVar3;
                                                    tVar = pVar2;
                                                }
                                            } else {
                                                pVar2 = tVar;
                                                sVar3 = sVarA;
                                            }
                                            j3 = j2;
                                            if (j2 <= j3) {
                                                StringBuilder sb5 = new StringBuilder(41);
                                                sb5.append(j2);
                                                sb5.append("~");
                                                sb5.append(j3);
                                                throw g(sb5.toString(), strTrim3);
                                            }
                                            if (i4 != 0) {
                                                StringBuilder sb6 = new StringBuilder(36);
                                                sb6.append(j3);
                                                sb6.append(">mod=");
                                                sb6.append(i4);
                                                throw g(sb6.toString(), strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j2));
                                            arrayList.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(dMax, j3);
                                            if (i7 >= length) {
                                                str5 = str4;
                                                if (!str5.equals(",")) {
                                                    throw g(str5, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i8 < size) {
                                                        jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                            } else {
                                                strF2 = f(strArr2, i7, strTrim3);
                                                i7++;
                                                strArr2 = strArr2;
                                                zEquals = zEquals;
                                                i15 = i3;
                                                nVar = pVar3;
                                                sVarA = sVar3;
                                                tVar = pVar2;
                                            }
                                        }
                                    }
                                    zEquals = "is".equals(strF);
                                    if (!zEquals && !z) {
                                        throw g(strF, strTrim3);
                                    }
                                    i7 = i5 + 1;
                                    strF2 = f(strArr2, i5, strTrim3);
                                    z2 = true;
                                    if (!"not".equals(strF2)) {
                                        if (zEquals) {
                                        }
                                        z3 = !z;
                                        strF2 = f(strArr2, i7, strTrim3);
                                        i7++;
                                    } else {
                                        z3 = z;
                                    }
                                    arrayList = new ArrayList();
                                    dMin = 9.223372036854776E18d;
                                    dMax = -9.223372036854776E18d;
                                    while (true) {
                                        i3 = i15;
                                        pVar3 = nVar;
                                        j2 = Long.parseLong(strF2);
                                        length = strArr2.length;
                                        str4 = strF2;
                                        if (i7 < length) {
                                            sVar3 = sVarA;
                                            i9 = i7 + 1;
                                            strF3 = f(strArr2, i7, strTrim3);
                                            pVar2 = tVar;
                                            if (strF3.equals(".")) {
                                                i10 = i9 + 1;
                                                strF4 = f(strArr2, i9, strTrim3);
                                                if (strF4.equals(".")) {
                                                    throw g(strF4, strTrim3);
                                                }
                                                i11 = i10 + 1;
                                                strF5 = f(strArr2, i10, strTrim3);
                                                j4 = Long.parseLong(strF5);
                                                if (i11 < length) {
                                                    i7 = i11 + 1;
                                                    strF6 = f(strArr2, i11, strTrim3);
                                                    if (strF6.equals(",")) {
                                                        throw g(strF6, strTrim3);
                                                    }
                                                    str4 = strF6;
                                                    j3 = j4;
                                                } else {
                                                    i7 = i11;
                                                    j3 = j4;
                                                    str4 = strF5;
                                                }
                                            } else {
                                                if (strF3.equals(",")) {
                                                    throw g(strF3, strTrim3);
                                                }
                                                str4 = strF3;
                                                i7 = i9;
                                            }
                                            if (j2 <= j3) {
                                                StringBuilder sb7 = new StringBuilder(41);
                                                sb7.append(j2);
                                                sb7.append("~");
                                                sb7.append(j3);
                                                throw g(sb7.toString(), strTrim3);
                                            }
                                            if (i4 != 0) {
                                                StringBuilder sb8 = new StringBuilder(36);
                                                sb8.append(j3);
                                                sb8.append(">mod=");
                                                sb8.append(i4);
                                                throw g(sb8.toString(), strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j2));
                                            arrayList.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(dMax, j3);
                                            if (i7 >= length) {
                                                str5 = str4;
                                                if (!str5.equals(",")) {
                                                    throw g(str5, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i8 < size) {
                                                        jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                            } else {
                                                strF2 = f(strArr2, i7, strTrim3);
                                                i7++;
                                                strArr2 = strArr2;
                                                zEquals = zEquals;
                                                i15 = i3;
                                                nVar = pVar3;
                                                sVarA = sVar3;
                                                tVar = pVar2;
                                            }
                                        } else {
                                            pVar2 = tVar;
                                            sVar3 = sVarA;
                                        }
                                        j3 = j2;
                                        if (j2 <= j3) {
                                            StringBuilder sb9 = new StringBuilder(41);
                                            sb9.append(j2);
                                            sb9.append("~");
                                            sb9.append(j3);
                                            throw g(sb9.toString(), strTrim3);
                                        }
                                        if (i4 != 0) {
                                            StringBuilder sb10 = new StringBuilder(36);
                                            sb10.append(j3);
                                            sb10.append(">mod=");
                                            sb10.append(i4);
                                            throw g(sb10.toString(), strTrim3);
                                        }
                                        arrayList.add(Long.valueOf(j2));
                                        arrayList.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(dMax, j3);
                                        if (i7 >= length) {
                                            str5 = str4;
                                            if (!str5.equals(",")) {
                                                throw g(str5, strTrim3);
                                            }
                                            if (arrayList.size() == 2) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList.size();
                                                jArr = new long[size];
                                                while (i8 < size) {
                                                    jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin == dMax) {
                                            }
                                            uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                        } else {
                                            strF2 = f(strArr2, i7, strTrim3);
                                            i7++;
                                            strArr2 = strArr2;
                                            zEquals = zEquals;
                                            i15 = i3;
                                            nVar = pVar3;
                                            sVarA = sVar3;
                                            tVar = pVar2;
                                        }
                                    }
                                } else {
                                    strArr = strArrSplit2;
                                    pVar2 = tVar;
                                    str3 = strTrim;
                                    sVar3 = sVarA;
                                    i3 = i15;
                                    pVar3 = nVar;
                                }
                                if (pVar3 == null) {
                                    nVar = uVar;
                                } else {
                                    nVar = new n(pVar3, uVar);
                                }
                                i15 = i3 + 1;
                                strArrSplit2 = strArr;
                                strArrSplit3 = strArrSplit3;
                                strTrim = str3;
                                i14 = i14;
                                sVarA2 = sVarA2;
                                sVarA = sVar3;
                                tVar = pVar2;
                                break;
                            case "i":
                                i2 = 2;
                                if (strArr2.length > 1) {
                                    strF = strArr2[1];
                                    if ("mod".equals(strF)) {
                                        i4 = Integer.parseInt(strArr2[2]);
                                        strF = f(strArr2, 3, strTrim3);
                                        i5 = 4;
                                    } else {
                                        i4 = Integer.parseInt(strArr2[2]);
                                        strF = f(strArr2, 3, strTrim3);
                                        i5 = 4;
                                    }
                                    if ("not".equals(strF)) {
                                        i12 = i5 + 1;
                                        strF7 = f(strArr2, i5, strTrim3);
                                        if ("=".equals(strF7)) {
                                            throw g(strF7, strTrim3);
                                        }
                                        strArr = strArrSplit2;
                                        z = false;
                                        i5 = i12;
                                        strF = strF7;
                                    } else {
                                        strArr = strArrSplit2;
                                        if ("!".equals(strF)) {
                                            i6 = i5 + 1;
                                            strF = f(strArr2, i5, strTrim3);
                                            if (!"=".equals(strF)) {
                                                throw g(strF, strTrim3);
                                            }
                                            i5 = i6;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if ("is".equals(strF)) {
                                        str3 = strTrim;
                                        if ("in".equals(strF)) {
                                        }
                                        if (!"not".equals(strF2)) {
                                            if (zEquals) {
                                            }
                                            z3 = !z;
                                            strF2 = f(strArr2, i7, strTrim3);
                                            i7++;
                                        } else {
                                            z3 = z;
                                        }
                                        arrayList = new ArrayList();
                                        dMin = 9.223372036854776E18d;
                                        dMax = -9.223372036854776E18d;
                                        while (true) {
                                            i3 = i15;
                                            pVar3 = nVar;
                                            j2 = Long.parseLong(strF2);
                                            length = strArr2.length;
                                            str4 = strF2;
                                            if (i7 < length) {
                                                sVar3 = sVarA;
                                                i9 = i7 + 1;
                                                strF3 = f(strArr2, i7, strTrim3);
                                                pVar2 = tVar;
                                                if (strF3.equals(".")) {
                                                    i10 = i9 + 1;
                                                    strF4 = f(strArr2, i9, strTrim3);
                                                    if (strF4.equals(".")) {
                                                        throw g(strF4, strTrim3);
                                                    }
                                                    i11 = i10 + 1;
                                                    strF5 = f(strArr2, i10, strTrim3);
                                                    j4 = Long.parseLong(strF5);
                                                    if (i11 < length) {
                                                        i7 = i11 + 1;
                                                        strF6 = f(strArr2, i11, strTrim3);
                                                        if (strF6.equals(",")) {
                                                            throw g(strF6, strTrim3);
                                                        }
                                                        str4 = strF6;
                                                        j3 = j4;
                                                    } else {
                                                        i7 = i11;
                                                        j3 = j4;
                                                        str4 = strF5;
                                                    }
                                                } else {
                                                    if (strF3.equals(",")) {
                                                        throw g(strF3, strTrim3);
                                                    }
                                                    str4 = strF3;
                                                    i7 = i9;
                                                }
                                                if (j2 <= j3) {
                                                    StringBuilder sb11 = new StringBuilder(41);
                                                    sb11.append(j2);
                                                    sb11.append("~");
                                                    sb11.append(j3);
                                                    throw g(sb11.toString(), strTrim3);
                                                }
                                                if (i4 != 0) {
                                                    StringBuilder sb12 = new StringBuilder(36);
                                                    sb12.append(j3);
                                                    sb12.append(">mod=");
                                                    sb12.append(i4);
                                                    throw g(sb12.toString(), strTrim3);
                                                }
                                                arrayList.add(Long.valueOf(j2));
                                                arrayList.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(dMax, j3);
                                                if (i7 >= length) {
                                                    str5 = str4;
                                                    if (!str5.equals(",")) {
                                                        throw g(str5, strTrim3);
                                                    }
                                                    if (arrayList.size() == 2) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList.size();
                                                        jArr = new long[size];
                                                        while (i8 < size) {
                                                            jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin == dMax) {
                                                    }
                                                    uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                                } else {
                                                    strF2 = f(strArr2, i7, strTrim3);
                                                    i7++;
                                                    strArr2 = strArr2;
                                                    zEquals = zEquals;
                                                    i15 = i3;
                                                    nVar = pVar3;
                                                    sVarA = sVar3;
                                                    tVar = pVar2;
                                                }
                                            } else {
                                                pVar2 = tVar;
                                                sVar3 = sVarA;
                                            }
                                            j3 = j2;
                                            if (j2 <= j3) {
                                                StringBuilder sb13 = new StringBuilder(41);
                                                sb13.append(j2);
                                                sb13.append("~");
                                                sb13.append(j3);
                                                throw g(sb13.toString(), strTrim3);
                                            }
                                            if (i4 != 0) {
                                                StringBuilder sb14 = new StringBuilder(36);
                                                sb14.append(j3);
                                                sb14.append(">mod=");
                                                sb14.append(i4);
                                                throw g(sb14.toString(), strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j2));
                                            arrayList.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(dMax, j3);
                                            if (i7 >= length) {
                                                str5 = str4;
                                                if (!str5.equals(",")) {
                                                    throw g(str5, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i8 < size) {
                                                        jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                            } else {
                                                strF2 = f(strArr2, i7, strTrim3);
                                                i7++;
                                                strArr2 = strArr2;
                                                zEquals = zEquals;
                                                i15 = i3;
                                                nVar = pVar3;
                                                sVarA = sVar3;
                                                tVar = pVar2;
                                            }
                                        }
                                    } else {
                                        str3 = strTrim;
                                    }
                                    zEquals = "is".equals(strF);
                                    if (!zEquals) {
                                    }
                                    i7 = i5 + 1;
                                    strF2 = f(strArr2, i5, strTrim3);
                                    z2 = true;
                                    if (!"not".equals(strF2)) {
                                        if (zEquals) {
                                        }
                                        z3 = !z;
                                        strF2 = f(strArr2, i7, strTrim3);
                                        i7++;
                                    } else {
                                        z3 = z;
                                    }
                                    arrayList = new ArrayList();
                                    dMin = 9.223372036854776E18d;
                                    dMax = -9.223372036854776E18d;
                                    while (true) {
                                        i3 = i15;
                                        pVar3 = nVar;
                                        j2 = Long.parseLong(strF2);
                                        length = strArr2.length;
                                        str4 = strF2;
                                        if (i7 < length) {
                                            sVar3 = sVarA;
                                            i9 = i7 + 1;
                                            strF3 = f(strArr2, i7, strTrim3);
                                            pVar2 = tVar;
                                            if (strF3.equals(".")) {
                                                i10 = i9 + 1;
                                                strF4 = f(strArr2, i9, strTrim3);
                                                if (strF4.equals(".")) {
                                                    throw g(strF4, strTrim3);
                                                }
                                                i11 = i10 + 1;
                                                strF5 = f(strArr2, i10, strTrim3);
                                                j4 = Long.parseLong(strF5);
                                                if (i11 < length) {
                                                    i7 = i11 + 1;
                                                    strF6 = f(strArr2, i11, strTrim3);
                                                    if (strF6.equals(",")) {
                                                        throw g(strF6, strTrim3);
                                                    }
                                                    str4 = strF6;
                                                    j3 = j4;
                                                } else {
                                                    i7 = i11;
                                                    j3 = j4;
                                                    str4 = strF5;
                                                }
                                            } else {
                                                if (strF3.equals(",")) {
                                                    throw g(strF3, strTrim3);
                                                }
                                                str4 = strF3;
                                                i7 = i9;
                                            }
                                            if (j2 <= j3) {
                                                StringBuilder sb15 = new StringBuilder(41);
                                                sb15.append(j2);
                                                sb15.append("~");
                                                sb15.append(j3);
                                                throw g(sb15.toString(), strTrim3);
                                            }
                                            if (i4 != 0) {
                                                StringBuilder sb16 = new StringBuilder(36);
                                                sb16.append(j3);
                                                sb16.append(">mod=");
                                                sb16.append(i4);
                                                throw g(sb16.toString(), strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j2));
                                            arrayList.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(dMax, j3);
                                            if (i7 >= length) {
                                                str5 = str4;
                                                if (!str5.equals(",")) {
                                                    throw g(str5, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i8 < size) {
                                                        jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                            } else {
                                                strF2 = f(strArr2, i7, strTrim3);
                                                i7++;
                                                strArr2 = strArr2;
                                                zEquals = zEquals;
                                                i15 = i3;
                                                nVar = pVar3;
                                                sVarA = sVar3;
                                                tVar = pVar2;
                                            }
                                        } else {
                                            pVar2 = tVar;
                                            sVar3 = sVarA;
                                        }
                                        j3 = j2;
                                        if (j2 <= j3) {
                                            StringBuilder sb17 = new StringBuilder(41);
                                            sb17.append(j2);
                                            sb17.append("~");
                                            sb17.append(j3);
                                            throw g(sb17.toString(), strTrim3);
                                        }
                                        if (i4 != 0) {
                                            StringBuilder sb18 = new StringBuilder(36);
                                            sb18.append(j3);
                                            sb18.append(">mod=");
                                            sb18.append(i4);
                                            throw g(sb18.toString(), strTrim3);
                                        }
                                        arrayList.add(Long.valueOf(j2));
                                        arrayList.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(dMax, j3);
                                        if (i7 >= length) {
                                            str5 = str4;
                                            if (!str5.equals(",")) {
                                                throw g(str5, strTrim3);
                                            }
                                            if (arrayList.size() == 2) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList.size();
                                                jArr = new long[size];
                                                while (i8 < size) {
                                                    jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin == dMax) {
                                            }
                                            uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                        } else {
                                            strF2 = f(strArr2, i7, strTrim3);
                                            i7++;
                                            strArr2 = strArr2;
                                            zEquals = zEquals;
                                            i15 = i3;
                                            nVar = pVar3;
                                            sVarA = sVar3;
                                            tVar = pVar2;
                                        }
                                    }
                                    break;
                                } else {
                                    strArr = strArrSplit2;
                                    pVar2 = tVar;
                                    str3 = strTrim;
                                    sVar3 = sVarA;
                                    i3 = i15;
                                    pVar3 = nVar;
                                }
                                if (pVar3 == null) {
                                    nVar = uVar;
                                } else {
                                    nVar = new n(pVar3, uVar);
                                }
                                i15 = i3 + 1;
                                strArrSplit2 = strArr;
                                strArrSplit3 = strArrSplit3;
                                strTrim = str3;
                                i14 = i14;
                                sVarA2 = sVarA2;
                                sVarA = sVar3;
                                tVar = pVar2;
                                break;
                            case "f":
                                i2 = 3;
                                if (strArr2.length > 1) {
                                    strF = strArr2[1];
                                    if ("mod".equals(strF)) {
                                        i4 = Integer.parseInt(strArr2[2]);
                                        strF = f(strArr2, 3, strTrim3);
                                        i5 = 4;
                                    } else {
                                        i4 = Integer.parseInt(strArr2[2]);
                                        strF = f(strArr2, 3, strTrim3);
                                        i5 = 4;
                                    }
                                    if ("not".equals(strF)) {
                                        i12 = i5 + 1;
                                        strF7 = f(strArr2, i5, strTrim3);
                                        if ("=".equals(strF7)) {
                                            throw g(strF7, strTrim3);
                                        }
                                        strArr = strArrSplit2;
                                        z = false;
                                        i5 = i12;
                                        strF = strF7;
                                    } else {
                                        strArr = strArrSplit2;
                                        if ("!".equals(strF)) {
                                            i6 = i5 + 1;
                                            strF = f(strArr2, i5, strTrim3);
                                            if (!"=".equals(strF)) {
                                                throw g(strF, strTrim3);
                                            }
                                            i5 = i6;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if ("is".equals(strF)) {
                                        str3 = strTrim;
                                        if ("in".equals(strF)) {
                                        }
                                        if (!"not".equals(strF2)) {
                                            if (zEquals) {
                                            }
                                            z3 = !z;
                                            strF2 = f(strArr2, i7, strTrim3);
                                            i7++;
                                        } else {
                                            z3 = z;
                                        }
                                        arrayList = new ArrayList();
                                        dMin = 9.223372036854776E18d;
                                        dMax = -9.223372036854776E18d;
                                        while (true) {
                                            i3 = i15;
                                            pVar3 = nVar;
                                            j2 = Long.parseLong(strF2);
                                            length = strArr2.length;
                                            str4 = strF2;
                                            if (i7 < length) {
                                                sVar3 = sVarA;
                                                i9 = i7 + 1;
                                                strF3 = f(strArr2, i7, strTrim3);
                                                pVar2 = tVar;
                                                if (strF3.equals(".")) {
                                                    i10 = i9 + 1;
                                                    strF4 = f(strArr2, i9, strTrim3);
                                                    if (strF4.equals(".")) {
                                                        throw g(strF4, strTrim3);
                                                    }
                                                    i11 = i10 + 1;
                                                    strF5 = f(strArr2, i10, strTrim3);
                                                    j4 = Long.parseLong(strF5);
                                                    if (i11 < length) {
                                                        i7 = i11 + 1;
                                                        strF6 = f(strArr2, i11, strTrim3);
                                                        if (strF6.equals(",")) {
                                                            throw g(strF6, strTrim3);
                                                        }
                                                        str4 = strF6;
                                                        j3 = j4;
                                                    } else {
                                                        i7 = i11;
                                                        j3 = j4;
                                                        str4 = strF5;
                                                    }
                                                } else {
                                                    if (strF3.equals(",")) {
                                                        throw g(strF3, strTrim3);
                                                    }
                                                    str4 = strF3;
                                                    i7 = i9;
                                                }
                                                if (j2 <= j3) {
                                                    StringBuilder sb19 = new StringBuilder(41);
                                                    sb19.append(j2);
                                                    sb19.append("~");
                                                    sb19.append(j3);
                                                    throw g(sb19.toString(), strTrim3);
                                                }
                                                if (i4 != 0) {
                                                    StringBuilder sb110 = new StringBuilder(36);
                                                    sb110.append(j3);
                                                    sb110.append(">mod=");
                                                    sb110.append(i4);
                                                    throw g(sb110.toString(), strTrim3);
                                                }
                                                arrayList.add(Long.valueOf(j2));
                                                arrayList.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(dMax, j3);
                                                if (i7 >= length) {
                                                    str5 = str4;
                                                    if (!str5.equals(",")) {
                                                        throw g(str5, strTrim3);
                                                    }
                                                    if (arrayList.size() == 2) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList.size();
                                                        jArr = new long[size];
                                                        while (i8 < size) {
                                                            jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin == dMax) {
                                                    }
                                                    uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                                } else {
                                                    strF2 = f(strArr2, i7, strTrim3);
                                                    i7++;
                                                    strArr2 = strArr2;
                                                    zEquals = zEquals;
                                                    i15 = i3;
                                                    nVar = pVar3;
                                                    sVarA = sVar3;
                                                    tVar = pVar2;
                                                }
                                            } else {
                                                pVar2 = tVar;
                                                sVar3 = sVarA;
                                            }
                                            j3 = j2;
                                            if (j2 <= j3) {
                                                StringBuilder sb111 = new StringBuilder(41);
                                                sb111.append(j2);
                                                sb111.append("~");
                                                sb111.append(j3);
                                                throw g(sb111.toString(), strTrim3);
                                            }
                                            if (i4 != 0) {
                                                StringBuilder sb112 = new StringBuilder(36);
                                                sb112.append(j3);
                                                sb112.append(">mod=");
                                                sb112.append(i4);
                                                throw g(sb112.toString(), strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j2));
                                            arrayList.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(dMax, j3);
                                            if (i7 >= length) {
                                                str5 = str4;
                                                if (!str5.equals(",")) {
                                                    throw g(str5, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i8 < size) {
                                                        jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                            } else {
                                                strF2 = f(strArr2, i7, strTrim3);
                                                i7++;
                                                strArr2 = strArr2;
                                                zEquals = zEquals;
                                                i15 = i3;
                                                nVar = pVar3;
                                                sVarA = sVar3;
                                                tVar = pVar2;
                                            }
                                        }
                                    } else {
                                        str3 = strTrim;
                                    }
                                    zEquals = "is".equals(strF);
                                    if (!zEquals) {
                                    }
                                    i7 = i5 + 1;
                                    strF2 = f(strArr2, i5, strTrim3);
                                    z2 = true;
                                    if (!"not".equals(strF2)) {
                                        if (zEquals) {
                                        }
                                        z3 = !z;
                                        strF2 = f(strArr2, i7, strTrim3);
                                        i7++;
                                    } else {
                                        z3 = z;
                                    }
                                    arrayList = new ArrayList();
                                    dMin = 9.223372036854776E18d;
                                    dMax = -9.223372036854776E18d;
                                    while (true) {
                                        i3 = i15;
                                        pVar3 = nVar;
                                        j2 = Long.parseLong(strF2);
                                        length = strArr2.length;
                                        str4 = strF2;
                                        if (i7 < length) {
                                            sVar3 = sVarA;
                                            i9 = i7 + 1;
                                            strF3 = f(strArr2, i7, strTrim3);
                                            pVar2 = tVar;
                                            if (strF3.equals(".")) {
                                                i10 = i9 + 1;
                                                strF4 = f(strArr2, i9, strTrim3);
                                                if (strF4.equals(".")) {
                                                    throw g(strF4, strTrim3);
                                                }
                                                i11 = i10 + 1;
                                                strF5 = f(strArr2, i10, strTrim3);
                                                j4 = Long.parseLong(strF5);
                                                if (i11 < length) {
                                                    i7 = i11 + 1;
                                                    strF6 = f(strArr2, i11, strTrim3);
                                                    if (strF6.equals(",")) {
                                                        throw g(strF6, strTrim3);
                                                    }
                                                    str4 = strF6;
                                                    j3 = j4;
                                                } else {
                                                    i7 = i11;
                                                    j3 = j4;
                                                    str4 = strF5;
                                                }
                                            } else {
                                                if (strF3.equals(",")) {
                                                    throw g(strF3, strTrim3);
                                                }
                                                str4 = strF3;
                                                i7 = i9;
                                            }
                                            if (j2 <= j3) {
                                                StringBuilder sb113 = new StringBuilder(41);
                                                sb113.append(j2);
                                                sb113.append("~");
                                                sb113.append(j3);
                                                throw g(sb113.toString(), strTrim3);
                                            }
                                            if (i4 != 0) {
                                                StringBuilder sb114 = new StringBuilder(36);
                                                sb114.append(j3);
                                                sb114.append(">mod=");
                                                sb114.append(i4);
                                                throw g(sb114.toString(), strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j2));
                                            arrayList.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(dMax, j3);
                                            if (i7 >= length) {
                                                str5 = str4;
                                                if (!str5.equals(",")) {
                                                    throw g(str5, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i8 < size) {
                                                        jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                            } else {
                                                strF2 = f(strArr2, i7, strTrim3);
                                                i7++;
                                                strArr2 = strArr2;
                                                zEquals = zEquals;
                                                i15 = i3;
                                                nVar = pVar3;
                                                sVarA = sVar3;
                                                tVar = pVar2;
                                            }
                                        } else {
                                            pVar2 = tVar;
                                            sVar3 = sVarA;
                                        }
                                        j3 = j2;
                                        if (j2 <= j3) {
                                            StringBuilder sb115 = new StringBuilder(41);
                                            sb115.append(j2);
                                            sb115.append("~");
                                            sb115.append(j3);
                                            throw g(sb115.toString(), strTrim3);
                                        }
                                        if (i4 != 0) {
                                            StringBuilder sb116 = new StringBuilder(36);
                                            sb116.append(j3);
                                            sb116.append(">mod=");
                                            sb116.append(i4);
                                            throw g(sb116.toString(), strTrim3);
                                        }
                                        arrayList.add(Long.valueOf(j2));
                                        arrayList.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(dMax, j3);
                                        if (i7 >= length) {
                                            str5 = str4;
                                            if (!str5.equals(",")) {
                                                throw g(str5, strTrim3);
                                            }
                                            if (arrayList.size() == 2) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList.size();
                                                jArr = new long[size];
                                                while (i8 < size) {
                                                    jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin == dMax) {
                                            }
                                            uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                        } else {
                                            strF2 = f(strArr2, i7, strTrim3);
                                            i7++;
                                            strArr2 = strArr2;
                                            zEquals = zEquals;
                                            i15 = i3;
                                            nVar = pVar3;
                                            sVarA = sVar3;
                                            tVar = pVar2;
                                        }
                                    }
                                    break;
                                } else {
                                    strArr = strArrSplit2;
                                    pVar2 = tVar;
                                    str3 = strTrim;
                                    sVar3 = sVarA;
                                    i3 = i15;
                                    pVar3 = nVar;
                                }
                                if (pVar3 == null) {
                                    nVar = uVar;
                                } else {
                                    nVar = new n(pVar3, uVar);
                                }
                                i15 = i3 + 1;
                                strArrSplit2 = strArr;
                                strArrSplit3 = strArrSplit3;
                                strTrim = str3;
                                i14 = i14;
                                sVarA2 = sVarA2;
                                sVarA = sVar3;
                                tVar = pVar2;
                                break;
                            case "t":
                                i2 = 4;
                                if (strArr2.length > 1) {
                                    strF = strArr2[1];
                                    if ("mod".equals(strF)) {
                                        i4 = Integer.parseInt(strArr2[2]);
                                        strF = f(strArr2, 3, strTrim3);
                                        i5 = 4;
                                    } else {
                                        i4 = Integer.parseInt(strArr2[2]);
                                        strF = f(strArr2, 3, strTrim3);
                                        i5 = 4;
                                    }
                                    if ("not".equals(strF)) {
                                        i12 = i5 + 1;
                                        strF7 = f(strArr2, i5, strTrim3);
                                        if ("=".equals(strF7)) {
                                            throw g(strF7, strTrim3);
                                        }
                                        strArr = strArrSplit2;
                                        z = false;
                                        i5 = i12;
                                        strF = strF7;
                                    } else {
                                        strArr = strArrSplit2;
                                        if ("!".equals(strF)) {
                                            i6 = i5 + 1;
                                            strF = f(strArr2, i5, strTrim3);
                                            if (!"=".equals(strF)) {
                                                throw g(strF, strTrim3);
                                            }
                                            i5 = i6;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if ("is".equals(strF)) {
                                        str3 = strTrim;
                                        if ("in".equals(strF)) {
                                        }
                                        if (!"not".equals(strF2)) {
                                            if (zEquals) {
                                            }
                                            z3 = !z;
                                            strF2 = f(strArr2, i7, strTrim3);
                                            i7++;
                                        } else {
                                            z3 = z;
                                        }
                                        arrayList = new ArrayList();
                                        dMin = 9.223372036854776E18d;
                                        dMax = -9.223372036854776E18d;
                                        while (true) {
                                            i3 = i15;
                                            pVar3 = nVar;
                                            j2 = Long.parseLong(strF2);
                                            length = strArr2.length;
                                            str4 = strF2;
                                            if (i7 < length) {
                                                sVar3 = sVarA;
                                                i9 = i7 + 1;
                                                strF3 = f(strArr2, i7, strTrim3);
                                                pVar2 = tVar;
                                                if (strF3.equals(".")) {
                                                    i10 = i9 + 1;
                                                    strF4 = f(strArr2, i9, strTrim3);
                                                    if (strF4.equals(".")) {
                                                        throw g(strF4, strTrim3);
                                                    }
                                                    i11 = i10 + 1;
                                                    strF5 = f(strArr2, i10, strTrim3);
                                                    j4 = Long.parseLong(strF5);
                                                    if (i11 < length) {
                                                        i7 = i11 + 1;
                                                        strF6 = f(strArr2, i11, strTrim3);
                                                        if (strF6.equals(",")) {
                                                            throw g(strF6, strTrim3);
                                                        }
                                                        str4 = strF6;
                                                        j3 = j4;
                                                    } else {
                                                        i7 = i11;
                                                        j3 = j4;
                                                        str4 = strF5;
                                                    }
                                                } else {
                                                    if (strF3.equals(",")) {
                                                        throw g(strF3, strTrim3);
                                                    }
                                                    str4 = strF3;
                                                    i7 = i9;
                                                }
                                                if (j2 <= j3) {
                                                    StringBuilder sb117 = new StringBuilder(41);
                                                    sb117.append(j2);
                                                    sb117.append("~");
                                                    sb117.append(j3);
                                                    throw g(sb117.toString(), strTrim3);
                                                }
                                                if (i4 != 0) {
                                                    StringBuilder sb118 = new StringBuilder(36);
                                                    sb118.append(j3);
                                                    sb118.append(">mod=");
                                                    sb118.append(i4);
                                                    throw g(sb118.toString(), strTrim3);
                                                }
                                                arrayList.add(Long.valueOf(j2));
                                                arrayList.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(dMax, j3);
                                                if (i7 >= length) {
                                                    str5 = str4;
                                                    if (!str5.equals(",")) {
                                                        throw g(str5, strTrim3);
                                                    }
                                                    if (arrayList.size() == 2) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList.size();
                                                        jArr = new long[size];
                                                        while (i8 < size) {
                                                            jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin == dMax) {
                                                    }
                                                    uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                                } else {
                                                    strF2 = f(strArr2, i7, strTrim3);
                                                    i7++;
                                                    strArr2 = strArr2;
                                                    zEquals = zEquals;
                                                    i15 = i3;
                                                    nVar = pVar3;
                                                    sVarA = sVar3;
                                                    tVar = pVar2;
                                                }
                                            } else {
                                                pVar2 = tVar;
                                                sVar3 = sVarA;
                                            }
                                            j3 = j2;
                                            if (j2 <= j3) {
                                                StringBuilder sb119 = new StringBuilder(41);
                                                sb119.append(j2);
                                                sb119.append("~");
                                                sb119.append(j3);
                                                throw g(sb119.toString(), strTrim3);
                                            }
                                            if (i4 != 0) {
                                                StringBuilder sb1110 = new StringBuilder(36);
                                                sb1110.append(j3);
                                                sb1110.append(">mod=");
                                                sb1110.append(i4);
                                                throw g(sb1110.toString(), strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j2));
                                            arrayList.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(dMax, j3);
                                            if (i7 >= length) {
                                                str5 = str4;
                                                if (!str5.equals(",")) {
                                                    throw g(str5, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i8 < size) {
                                                        jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                            } else {
                                                strF2 = f(strArr2, i7, strTrim3);
                                                i7++;
                                                strArr2 = strArr2;
                                                zEquals = zEquals;
                                                i15 = i3;
                                                nVar = pVar3;
                                                sVarA = sVar3;
                                                tVar = pVar2;
                                            }
                                        }
                                    } else {
                                        str3 = strTrim;
                                    }
                                    zEquals = "is".equals(strF);
                                    if (!zEquals) {
                                    }
                                    i7 = i5 + 1;
                                    strF2 = f(strArr2, i5, strTrim3);
                                    z2 = true;
                                    if (!"not".equals(strF2)) {
                                        if (zEquals) {
                                        }
                                        z3 = !z;
                                        strF2 = f(strArr2, i7, strTrim3);
                                        i7++;
                                    } else {
                                        z3 = z;
                                    }
                                    arrayList = new ArrayList();
                                    dMin = 9.223372036854776E18d;
                                    dMax = -9.223372036854776E18d;
                                    while (true) {
                                        i3 = i15;
                                        pVar3 = nVar;
                                        j2 = Long.parseLong(strF2);
                                        length = strArr2.length;
                                        str4 = strF2;
                                        if (i7 < length) {
                                            sVar3 = sVarA;
                                            i9 = i7 + 1;
                                            strF3 = f(strArr2, i7, strTrim3);
                                            pVar2 = tVar;
                                            if (strF3.equals(".")) {
                                                i10 = i9 + 1;
                                                strF4 = f(strArr2, i9, strTrim3);
                                                if (strF4.equals(".")) {
                                                    throw g(strF4, strTrim3);
                                                }
                                                i11 = i10 + 1;
                                                strF5 = f(strArr2, i10, strTrim3);
                                                j4 = Long.parseLong(strF5);
                                                if (i11 < length) {
                                                    i7 = i11 + 1;
                                                    strF6 = f(strArr2, i11, strTrim3);
                                                    if (strF6.equals(",")) {
                                                        throw g(strF6, strTrim3);
                                                    }
                                                    str4 = strF6;
                                                    j3 = j4;
                                                } else {
                                                    i7 = i11;
                                                    j3 = j4;
                                                    str4 = strF5;
                                                }
                                            } else {
                                                if (strF3.equals(",")) {
                                                    throw g(strF3, strTrim3);
                                                }
                                                str4 = strF3;
                                                i7 = i9;
                                            }
                                            if (j2 <= j3) {
                                                StringBuilder sb1111 = new StringBuilder(41);
                                                sb1111.append(j2);
                                                sb1111.append("~");
                                                sb1111.append(j3);
                                                throw g(sb1111.toString(), strTrim3);
                                            }
                                            if (i4 != 0) {
                                                StringBuilder sb1112 = new StringBuilder(36);
                                                sb1112.append(j3);
                                                sb1112.append(">mod=");
                                                sb1112.append(i4);
                                                throw g(sb1112.toString(), strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j2));
                                            arrayList.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(dMax, j3);
                                            if (i7 >= length) {
                                                str5 = str4;
                                                if (!str5.equals(",")) {
                                                    throw g(str5, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i8 < size) {
                                                        jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                            } else {
                                                strF2 = f(strArr2, i7, strTrim3);
                                                i7++;
                                                strArr2 = strArr2;
                                                zEquals = zEquals;
                                                i15 = i3;
                                                nVar = pVar3;
                                                sVarA = sVar3;
                                                tVar = pVar2;
                                            }
                                        } else {
                                            pVar2 = tVar;
                                            sVar3 = sVarA;
                                        }
                                        j3 = j2;
                                        if (j2 <= j3) {
                                            StringBuilder sb1113 = new StringBuilder(41);
                                            sb1113.append(j2);
                                            sb1113.append("~");
                                            sb1113.append(j3);
                                            throw g(sb1113.toString(), strTrim3);
                                        }
                                        if (i4 != 0) {
                                            StringBuilder sb1114 = new StringBuilder(36);
                                            sb1114.append(j3);
                                            sb1114.append(">mod=");
                                            sb1114.append(i4);
                                            throw g(sb1114.toString(), strTrim3);
                                        }
                                        arrayList.add(Long.valueOf(j2));
                                        arrayList.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(dMax, j3);
                                        if (i7 >= length) {
                                            str5 = str4;
                                            if (!str5.equals(",")) {
                                                throw g(str5, strTrim3);
                                            }
                                            if (arrayList.size() == 2) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList.size();
                                                jArr = new long[size];
                                                while (i8 < size) {
                                                    jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin == dMax) {
                                            }
                                            uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                        } else {
                                            strF2 = f(strArr2, i7, strTrim3);
                                            i7++;
                                            strArr2 = strArr2;
                                            zEquals = zEquals;
                                            i15 = i3;
                                            nVar = pVar3;
                                            sVarA = sVar3;
                                            tVar = pVar2;
                                        }
                                    }
                                    break;
                                } else {
                                    strArr = strArrSplit2;
                                    pVar2 = tVar;
                                    str3 = strTrim;
                                    sVar3 = sVarA;
                                    i3 = i15;
                                    pVar3 = nVar;
                                }
                                if (pVar3 == null) {
                                    nVar = uVar;
                                } else {
                                    nVar = new n(pVar3, uVar);
                                }
                                i15 = i3 + 1;
                                strArrSplit2 = strArr;
                                strArrSplit3 = strArrSplit3;
                                strTrim = str3;
                                i14 = i14;
                                sVarA2 = sVarA2;
                                sVarA = sVar3;
                                tVar = pVar2;
                                break;
                            case "v":
                                i2 = 5;
                                if (strArr2.length > 1) {
                                    strF = strArr2[1];
                                    if ("mod".equals(strF)) {
                                        i4 = Integer.parseInt(strArr2[2]);
                                        strF = f(strArr2, 3, strTrim3);
                                        i5 = 4;
                                    } else {
                                        i4 = Integer.parseInt(strArr2[2]);
                                        strF = f(strArr2, 3, strTrim3);
                                        i5 = 4;
                                    }
                                    if ("not".equals(strF)) {
                                        i12 = i5 + 1;
                                        strF7 = f(strArr2, i5, strTrim3);
                                        if ("=".equals(strF7)) {
                                            throw g(strF7, strTrim3);
                                        }
                                        strArr = strArrSplit2;
                                        z = false;
                                        i5 = i12;
                                        strF = strF7;
                                    } else {
                                        strArr = strArrSplit2;
                                        if ("!".equals(strF)) {
                                            i6 = i5 + 1;
                                            strF = f(strArr2, i5, strTrim3);
                                            if (!"=".equals(strF)) {
                                                throw g(strF, strTrim3);
                                            }
                                            i5 = i6;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if ("is".equals(strF)) {
                                        str3 = strTrim;
                                        if ("in".equals(strF)) {
                                        }
                                        if (!"not".equals(strF2)) {
                                            if (zEquals) {
                                            }
                                            z3 = !z;
                                            strF2 = f(strArr2, i7, strTrim3);
                                            i7++;
                                        } else {
                                            z3 = z;
                                        }
                                        arrayList = new ArrayList();
                                        dMin = 9.223372036854776E18d;
                                        dMax = -9.223372036854776E18d;
                                        while (true) {
                                            i3 = i15;
                                            pVar3 = nVar;
                                            j2 = Long.parseLong(strF2);
                                            length = strArr2.length;
                                            str4 = strF2;
                                            if (i7 < length) {
                                                sVar3 = sVarA;
                                                i9 = i7 + 1;
                                                strF3 = f(strArr2, i7, strTrim3);
                                                pVar2 = tVar;
                                                if (strF3.equals(".")) {
                                                    i10 = i9 + 1;
                                                    strF4 = f(strArr2, i9, strTrim3);
                                                    if (strF4.equals(".")) {
                                                        throw g(strF4, strTrim3);
                                                    }
                                                    i11 = i10 + 1;
                                                    strF5 = f(strArr2, i10, strTrim3);
                                                    j4 = Long.parseLong(strF5);
                                                    if (i11 < length) {
                                                        i7 = i11 + 1;
                                                        strF6 = f(strArr2, i11, strTrim3);
                                                        if (strF6.equals(",")) {
                                                            throw g(strF6, strTrim3);
                                                        }
                                                        str4 = strF6;
                                                        j3 = j4;
                                                    } else {
                                                        i7 = i11;
                                                        j3 = j4;
                                                        str4 = strF5;
                                                    }
                                                } else {
                                                    if (strF3.equals(",")) {
                                                        throw g(strF3, strTrim3);
                                                    }
                                                    str4 = strF3;
                                                    i7 = i9;
                                                }
                                                if (j2 <= j3) {
                                                    StringBuilder sb1115 = new StringBuilder(41);
                                                    sb1115.append(j2);
                                                    sb1115.append("~");
                                                    sb1115.append(j3);
                                                    throw g(sb1115.toString(), strTrim3);
                                                }
                                                if (i4 != 0) {
                                                    StringBuilder sb1116 = new StringBuilder(36);
                                                    sb1116.append(j3);
                                                    sb1116.append(">mod=");
                                                    sb1116.append(i4);
                                                    throw g(sb1116.toString(), strTrim3);
                                                }
                                                arrayList.add(Long.valueOf(j2));
                                                arrayList.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(dMax, j3);
                                                if (i7 >= length) {
                                                    str5 = str4;
                                                    if (!str5.equals(",")) {
                                                        throw g(str5, strTrim3);
                                                    }
                                                    if (arrayList.size() == 2) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList.size();
                                                        jArr = new long[size];
                                                        while (i8 < size) {
                                                            jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin == dMax) {
                                                    }
                                                    uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                                } else {
                                                    strF2 = f(strArr2, i7, strTrim3);
                                                    i7++;
                                                    strArr2 = strArr2;
                                                    zEquals = zEquals;
                                                    i15 = i3;
                                                    nVar = pVar3;
                                                    sVarA = sVar3;
                                                    tVar = pVar2;
                                                }
                                            } else {
                                                pVar2 = tVar;
                                                sVar3 = sVarA;
                                            }
                                            j3 = j2;
                                            if (j2 <= j3) {
                                                StringBuilder sb1117 = new StringBuilder(41);
                                                sb1117.append(j2);
                                                sb1117.append("~");
                                                sb1117.append(j3);
                                                throw g(sb1117.toString(), strTrim3);
                                            }
                                            if (i4 != 0) {
                                                StringBuilder sb1118 = new StringBuilder(36);
                                                sb1118.append(j3);
                                                sb1118.append(">mod=");
                                                sb1118.append(i4);
                                                throw g(sb1118.toString(), strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j2));
                                            arrayList.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(dMax, j3);
                                            if (i7 >= length) {
                                                str5 = str4;
                                                if (!str5.equals(",")) {
                                                    throw g(str5, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i8 < size) {
                                                        jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                            } else {
                                                strF2 = f(strArr2, i7, strTrim3);
                                                i7++;
                                                strArr2 = strArr2;
                                                zEquals = zEquals;
                                                i15 = i3;
                                                nVar = pVar3;
                                                sVarA = sVar3;
                                                tVar = pVar2;
                                            }
                                        }
                                    } else {
                                        str3 = strTrim;
                                    }
                                    zEquals = "is".equals(strF);
                                    if (!zEquals) {
                                    }
                                    i7 = i5 + 1;
                                    strF2 = f(strArr2, i5, strTrim3);
                                    z2 = true;
                                    if (!"not".equals(strF2)) {
                                        if (zEquals) {
                                        }
                                        z3 = !z;
                                        strF2 = f(strArr2, i7, strTrim3);
                                        i7++;
                                    } else {
                                        z3 = z;
                                    }
                                    arrayList = new ArrayList();
                                    dMin = 9.223372036854776E18d;
                                    dMax = -9.223372036854776E18d;
                                    while (true) {
                                        i3 = i15;
                                        pVar3 = nVar;
                                        j2 = Long.parseLong(strF2);
                                        length = strArr2.length;
                                        str4 = strF2;
                                        if (i7 < length) {
                                            sVar3 = sVarA;
                                            i9 = i7 + 1;
                                            strF3 = f(strArr2, i7, strTrim3);
                                            pVar2 = tVar;
                                            if (strF3.equals(".")) {
                                                i10 = i9 + 1;
                                                strF4 = f(strArr2, i9, strTrim3);
                                                if (strF4.equals(".")) {
                                                    throw g(strF4, strTrim3);
                                                }
                                                i11 = i10 + 1;
                                                strF5 = f(strArr2, i10, strTrim3);
                                                j4 = Long.parseLong(strF5);
                                                if (i11 < length) {
                                                    i7 = i11 + 1;
                                                    strF6 = f(strArr2, i11, strTrim3);
                                                    if (strF6.equals(",")) {
                                                        throw g(strF6, strTrim3);
                                                    }
                                                    str4 = strF6;
                                                    j3 = j4;
                                                } else {
                                                    i7 = i11;
                                                    j3 = j4;
                                                    str4 = strF5;
                                                }
                                            } else {
                                                if (strF3.equals(",")) {
                                                    throw g(strF3, strTrim3);
                                                }
                                                str4 = strF3;
                                                i7 = i9;
                                            }
                                            if (j2 <= j3) {
                                                StringBuilder sb1119 = new StringBuilder(41);
                                                sb1119.append(j2);
                                                sb1119.append("~");
                                                sb1119.append(j3);
                                                throw g(sb1119.toString(), strTrim3);
                                            }
                                            if (i4 != 0) {
                                                StringBuilder sb11110 = new StringBuilder(36);
                                                sb11110.append(j3);
                                                sb11110.append(">mod=");
                                                sb11110.append(i4);
                                                throw g(sb11110.toString(), strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j2));
                                            arrayList.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(dMax, j3);
                                            if (i7 >= length) {
                                                str5 = str4;
                                                if (!str5.equals(",")) {
                                                    throw g(str5, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i8 < size) {
                                                        jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                            } else {
                                                strF2 = f(strArr2, i7, strTrim3);
                                                i7++;
                                                strArr2 = strArr2;
                                                zEquals = zEquals;
                                                i15 = i3;
                                                nVar = pVar3;
                                                sVarA = sVar3;
                                                tVar = pVar2;
                                            }
                                        } else {
                                            pVar2 = tVar;
                                            sVar3 = sVarA;
                                        }
                                        j3 = j2;
                                        if (j2 <= j3) {
                                            StringBuilder sb11111 = new StringBuilder(41);
                                            sb11111.append(j2);
                                            sb11111.append("~");
                                            sb11111.append(j3);
                                            throw g(sb11111.toString(), strTrim3);
                                        }
                                        if (i4 != 0) {
                                            StringBuilder sb11112 = new StringBuilder(36);
                                            sb11112.append(j3);
                                            sb11112.append(">mod=");
                                            sb11112.append(i4);
                                            throw g(sb11112.toString(), strTrim3);
                                        }
                                        arrayList.add(Long.valueOf(j2));
                                        arrayList.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(dMax, j3);
                                        if (i7 >= length) {
                                            str5 = str4;
                                            if (!str5.equals(",")) {
                                                throw g(str5, strTrim3);
                                            }
                                            if (arrayList.size() == 2) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList.size();
                                                jArr = new long[size];
                                                while (i8 < size) {
                                                    jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin == dMax) {
                                            }
                                            uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                        } else {
                                            strF2 = f(strArr2, i7, strTrim3);
                                            i7++;
                                            strArr2 = strArr2;
                                            zEquals = zEquals;
                                            i15 = i3;
                                            nVar = pVar3;
                                            sVarA = sVar3;
                                            tVar = pVar2;
                                        }
                                    }
                                    break;
                                } else {
                                    strArr = strArrSplit2;
                                    pVar2 = tVar;
                                    str3 = strTrim;
                                    sVar3 = sVarA;
                                    i3 = i15;
                                    pVar3 = nVar;
                                }
                                if (pVar3 == null) {
                                    nVar = uVar;
                                } else {
                                    nVar = new n(pVar3, uVar);
                                }
                                i15 = i3 + 1;
                                strArrSplit2 = strArr;
                                strArrSplit3 = strArrSplit3;
                                strTrim = str3;
                                i14 = i14;
                                sVarA2 = sVarA2;
                                sVarA = sVar3;
                                tVar = pVar2;
                                break;
                            case "w":
                                i2 = 6;
                                if (strArr2.length > 1) {
                                    strF = strArr2[1];
                                    if ("mod".equals(strF)) {
                                        i4 = Integer.parseInt(strArr2[2]);
                                        strF = f(strArr2, 3, strTrim3);
                                        i5 = 4;
                                    } else {
                                        i4 = Integer.parseInt(strArr2[2]);
                                        strF = f(strArr2, 3, strTrim3);
                                        i5 = 4;
                                    }
                                    if ("not".equals(strF)) {
                                        i12 = i5 + 1;
                                        strF7 = f(strArr2, i5, strTrim3);
                                        if ("=".equals(strF7)) {
                                            throw g(strF7, strTrim3);
                                        }
                                        strArr = strArrSplit2;
                                        z = false;
                                        i5 = i12;
                                        strF = strF7;
                                    } else {
                                        strArr = strArrSplit2;
                                        if ("!".equals(strF)) {
                                            i6 = i5 + 1;
                                            strF = f(strArr2, i5, strTrim3);
                                            if (!"=".equals(strF)) {
                                                throw g(strF, strTrim3);
                                            }
                                            i5 = i6;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if ("is".equals(strF)) {
                                        str3 = strTrim;
                                        if ("in".equals(strF)) {
                                        }
                                        if (!"not".equals(strF2)) {
                                            if (zEquals) {
                                            }
                                            z3 = !z;
                                            strF2 = f(strArr2, i7, strTrim3);
                                            i7++;
                                        } else {
                                            z3 = z;
                                        }
                                        arrayList = new ArrayList();
                                        dMin = 9.223372036854776E18d;
                                        dMax = -9.223372036854776E18d;
                                        while (true) {
                                            i3 = i15;
                                            pVar3 = nVar;
                                            j2 = Long.parseLong(strF2);
                                            length = strArr2.length;
                                            str4 = strF2;
                                            if (i7 < length) {
                                                sVar3 = sVarA;
                                                i9 = i7 + 1;
                                                strF3 = f(strArr2, i7, strTrim3);
                                                pVar2 = tVar;
                                                if (strF3.equals(".")) {
                                                    i10 = i9 + 1;
                                                    strF4 = f(strArr2, i9, strTrim3);
                                                    if (strF4.equals(".")) {
                                                        throw g(strF4, strTrim3);
                                                    }
                                                    i11 = i10 + 1;
                                                    strF5 = f(strArr2, i10, strTrim3);
                                                    j4 = Long.parseLong(strF5);
                                                    if (i11 < length) {
                                                        i7 = i11 + 1;
                                                        strF6 = f(strArr2, i11, strTrim3);
                                                        if (strF6.equals(",")) {
                                                            throw g(strF6, strTrim3);
                                                        }
                                                        str4 = strF6;
                                                        j3 = j4;
                                                    } else {
                                                        i7 = i11;
                                                        j3 = j4;
                                                        str4 = strF5;
                                                    }
                                                } else {
                                                    if (strF3.equals(",")) {
                                                        throw g(strF3, strTrim3);
                                                    }
                                                    str4 = strF3;
                                                    i7 = i9;
                                                }
                                                if (j2 <= j3) {
                                                    StringBuilder sb11113 = new StringBuilder(41);
                                                    sb11113.append(j2);
                                                    sb11113.append("~");
                                                    sb11113.append(j3);
                                                    throw g(sb11113.toString(), strTrim3);
                                                }
                                                if (i4 != 0) {
                                                    StringBuilder sb11114 = new StringBuilder(36);
                                                    sb11114.append(j3);
                                                    sb11114.append(">mod=");
                                                    sb11114.append(i4);
                                                    throw g(sb11114.toString(), strTrim3);
                                                }
                                                arrayList.add(Long.valueOf(j2));
                                                arrayList.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(dMax, j3);
                                                if (i7 >= length) {
                                                    str5 = str4;
                                                    if (!str5.equals(",")) {
                                                        throw g(str5, strTrim3);
                                                    }
                                                    if (arrayList.size() == 2) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList.size();
                                                        jArr = new long[size];
                                                        while (i8 < size) {
                                                            jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin == dMax) {
                                                    }
                                                    uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                                } else {
                                                    strF2 = f(strArr2, i7, strTrim3);
                                                    i7++;
                                                    strArr2 = strArr2;
                                                    zEquals = zEquals;
                                                    i15 = i3;
                                                    nVar = pVar3;
                                                    sVarA = sVar3;
                                                    tVar = pVar2;
                                                }
                                            } else {
                                                pVar2 = tVar;
                                                sVar3 = sVarA;
                                            }
                                            j3 = j2;
                                            if (j2 <= j3) {
                                                StringBuilder sb11115 = new StringBuilder(41);
                                                sb11115.append(j2);
                                                sb11115.append("~");
                                                sb11115.append(j3);
                                                throw g(sb11115.toString(), strTrim3);
                                            }
                                            if (i4 != 0) {
                                                StringBuilder sb11116 = new StringBuilder(36);
                                                sb11116.append(j3);
                                                sb11116.append(">mod=");
                                                sb11116.append(i4);
                                                throw g(sb11116.toString(), strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j2));
                                            arrayList.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(dMax, j3);
                                            if (i7 >= length) {
                                                str5 = str4;
                                                if (!str5.equals(",")) {
                                                    throw g(str5, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i8 < size) {
                                                        jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                            } else {
                                                strF2 = f(strArr2, i7, strTrim3);
                                                i7++;
                                                strArr2 = strArr2;
                                                zEquals = zEquals;
                                                i15 = i3;
                                                nVar = pVar3;
                                                sVarA = sVar3;
                                                tVar = pVar2;
                                            }
                                        }
                                    } else {
                                        str3 = strTrim;
                                    }
                                    zEquals = "is".equals(strF);
                                    if (!zEquals) {
                                    }
                                    i7 = i5 + 1;
                                    strF2 = f(strArr2, i5, strTrim3);
                                    z2 = true;
                                    if (!"not".equals(strF2)) {
                                        if (zEquals) {
                                        }
                                        z3 = !z;
                                        strF2 = f(strArr2, i7, strTrim3);
                                        i7++;
                                    } else {
                                        z3 = z;
                                    }
                                    arrayList = new ArrayList();
                                    dMin = 9.223372036854776E18d;
                                    dMax = -9.223372036854776E18d;
                                    while (true) {
                                        i3 = i15;
                                        pVar3 = nVar;
                                        j2 = Long.parseLong(strF2);
                                        length = strArr2.length;
                                        str4 = strF2;
                                        if (i7 < length) {
                                            sVar3 = sVarA;
                                            i9 = i7 + 1;
                                            strF3 = f(strArr2, i7, strTrim3);
                                            pVar2 = tVar;
                                            if (strF3.equals(".")) {
                                                i10 = i9 + 1;
                                                strF4 = f(strArr2, i9, strTrim3);
                                                if (strF4.equals(".")) {
                                                    throw g(strF4, strTrim3);
                                                }
                                                i11 = i10 + 1;
                                                strF5 = f(strArr2, i10, strTrim3);
                                                j4 = Long.parseLong(strF5);
                                                if (i11 < length) {
                                                    i7 = i11 + 1;
                                                    strF6 = f(strArr2, i11, strTrim3);
                                                    if (strF6.equals(",")) {
                                                        throw g(strF6, strTrim3);
                                                    }
                                                    str4 = strF6;
                                                    j3 = j4;
                                                } else {
                                                    i7 = i11;
                                                    j3 = j4;
                                                    str4 = strF5;
                                                }
                                            } else {
                                                if (strF3.equals(",")) {
                                                    throw g(strF3, strTrim3);
                                                }
                                                str4 = strF3;
                                                i7 = i9;
                                            }
                                            if (j2 <= j3) {
                                                StringBuilder sb11117 = new StringBuilder(41);
                                                sb11117.append(j2);
                                                sb11117.append("~");
                                                sb11117.append(j3);
                                                throw g(sb11117.toString(), strTrim3);
                                            }
                                            if (i4 != 0) {
                                                StringBuilder sb11118 = new StringBuilder(36);
                                                sb11118.append(j3);
                                                sb11118.append(">mod=");
                                                sb11118.append(i4);
                                                throw g(sb11118.toString(), strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j2));
                                            arrayList.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(dMax, j3);
                                            if (i7 >= length) {
                                                str5 = str4;
                                                if (!str5.equals(",")) {
                                                    throw g(str5, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i8 < size) {
                                                        jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                            } else {
                                                strF2 = f(strArr2, i7, strTrim3);
                                                i7++;
                                                strArr2 = strArr2;
                                                zEquals = zEquals;
                                                i15 = i3;
                                                nVar = pVar3;
                                                sVarA = sVar3;
                                                tVar = pVar2;
                                            }
                                        } else {
                                            pVar2 = tVar;
                                            sVar3 = sVarA;
                                        }
                                        j3 = j2;
                                        if (j2 <= j3) {
                                            StringBuilder sb11119 = new StringBuilder(41);
                                            sb11119.append(j2);
                                            sb11119.append("~");
                                            sb11119.append(j3);
                                            throw g(sb11119.toString(), strTrim3);
                                        }
                                        if (i4 != 0) {
                                            StringBuilder sb111110 = new StringBuilder(36);
                                            sb111110.append(j3);
                                            sb111110.append(">mod=");
                                            sb111110.append(i4);
                                            throw g(sb111110.toString(), strTrim3);
                                        }
                                        arrayList.add(Long.valueOf(j2));
                                        arrayList.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(dMax, j3);
                                        if (i7 >= length) {
                                            str5 = str4;
                                            if (!str5.equals(",")) {
                                                throw g(str5, strTrim3);
                                            }
                                            if (arrayList.size() == 2) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList.size();
                                                jArr = new long[size];
                                                while (i8 < size) {
                                                    jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin == dMax) {
                                            }
                                            uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                        } else {
                                            strF2 = f(strArr2, i7, strTrim3);
                                            i7++;
                                            strArr2 = strArr2;
                                            zEquals = zEquals;
                                            i15 = i3;
                                            nVar = pVar3;
                                            sVarA = sVar3;
                                            tVar = pVar2;
                                        }
                                    }
                                    break;
                                } else {
                                    strArr = strArrSplit2;
                                    pVar2 = tVar;
                                    str3 = strTrim;
                                    sVar3 = sVarA;
                                    i3 = i15;
                                    pVar3 = nVar;
                                }
                                if (pVar3 == null) {
                                    nVar = uVar;
                                } else {
                                    nVar = new n(pVar3, uVar);
                                }
                                i15 = i3 + 1;
                                strArrSplit2 = strArr;
                                strArrSplit3 = strArrSplit3;
                                strTrim = str3;
                                i14 = i14;
                                sVarA2 = sVarA2;
                                sVarA = sVar3;
                                tVar = pVar2;
                                break;
                            case "j":
                                i2 = 7;
                                if (strArr2.length > 1) {
                                    strF = strArr2[1];
                                    if ("mod".equals(strF)) {
                                        i4 = Integer.parseInt(strArr2[2]);
                                        strF = f(strArr2, 3, strTrim3);
                                        i5 = 4;
                                    } else {
                                        i4 = Integer.parseInt(strArr2[2]);
                                        strF = f(strArr2, 3, strTrim3);
                                        i5 = 4;
                                    }
                                    if ("not".equals(strF)) {
                                        i12 = i5 + 1;
                                        strF7 = f(strArr2, i5, strTrim3);
                                        if ("=".equals(strF7)) {
                                            throw g(strF7, strTrim3);
                                        }
                                        strArr = strArrSplit2;
                                        z = false;
                                        i5 = i12;
                                        strF = strF7;
                                    } else {
                                        strArr = strArrSplit2;
                                        if ("!".equals(strF)) {
                                            i6 = i5 + 1;
                                            strF = f(strArr2, i5, strTrim3);
                                            if (!"=".equals(strF)) {
                                                throw g(strF, strTrim3);
                                            }
                                            i5 = i6;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if ("is".equals(strF)) {
                                        str3 = strTrim;
                                        if ("in".equals(strF)) {
                                        }
                                        if (!"not".equals(strF2)) {
                                            if (zEquals) {
                                            }
                                            z3 = !z;
                                            strF2 = f(strArr2, i7, strTrim3);
                                            i7++;
                                        } else {
                                            z3 = z;
                                        }
                                        arrayList = new ArrayList();
                                        dMin = 9.223372036854776E18d;
                                        dMax = -9.223372036854776E18d;
                                        while (true) {
                                            i3 = i15;
                                            pVar3 = nVar;
                                            j2 = Long.parseLong(strF2);
                                            length = strArr2.length;
                                            str4 = strF2;
                                            if (i7 < length) {
                                                sVar3 = sVarA;
                                                i9 = i7 + 1;
                                                strF3 = f(strArr2, i7, strTrim3);
                                                pVar2 = tVar;
                                                if (strF3.equals(".")) {
                                                    i10 = i9 + 1;
                                                    strF4 = f(strArr2, i9, strTrim3);
                                                    if (strF4.equals(".")) {
                                                        throw g(strF4, strTrim3);
                                                    }
                                                    i11 = i10 + 1;
                                                    strF5 = f(strArr2, i10, strTrim3);
                                                    j4 = Long.parseLong(strF5);
                                                    if (i11 < length) {
                                                        i7 = i11 + 1;
                                                        strF6 = f(strArr2, i11, strTrim3);
                                                        if (strF6.equals(",")) {
                                                            throw g(strF6, strTrim3);
                                                        }
                                                        str4 = strF6;
                                                        j3 = j4;
                                                    } else {
                                                        i7 = i11;
                                                        j3 = j4;
                                                        str4 = strF5;
                                                    }
                                                } else {
                                                    if (strF3.equals(",")) {
                                                        throw g(strF3, strTrim3);
                                                    }
                                                    str4 = strF3;
                                                    i7 = i9;
                                                }
                                                if (j2 <= j3) {
                                                    StringBuilder sb111111 = new StringBuilder(41);
                                                    sb111111.append(j2);
                                                    sb111111.append("~");
                                                    sb111111.append(j3);
                                                    throw g(sb111111.toString(), strTrim3);
                                                }
                                                if (i4 != 0) {
                                                    StringBuilder sb111112 = new StringBuilder(36);
                                                    sb111112.append(j3);
                                                    sb111112.append(">mod=");
                                                    sb111112.append(i4);
                                                    throw g(sb111112.toString(), strTrim3);
                                                }
                                                arrayList.add(Long.valueOf(j2));
                                                arrayList.add(Long.valueOf(j3));
                                                dMin = Math.min(dMin, j2);
                                                dMax = Math.max(dMax, j3);
                                                if (i7 >= length) {
                                                    str5 = str4;
                                                    if (!str5.equals(",")) {
                                                        throw g(str5, strTrim3);
                                                    }
                                                    if (arrayList.size() == 2) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList.size();
                                                        jArr = new long[size];
                                                        while (i8 < size) {
                                                            jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin == dMax) {
                                                    }
                                                    uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                                } else {
                                                    strF2 = f(strArr2, i7, strTrim3);
                                                    i7++;
                                                    strArr2 = strArr2;
                                                    zEquals = zEquals;
                                                    i15 = i3;
                                                    nVar = pVar3;
                                                    sVarA = sVar3;
                                                    tVar = pVar2;
                                                }
                                            } else {
                                                pVar2 = tVar;
                                                sVar3 = sVarA;
                                            }
                                            j3 = j2;
                                            if (j2 <= j3) {
                                                StringBuilder sb111113 = new StringBuilder(41);
                                                sb111113.append(j2);
                                                sb111113.append("~");
                                                sb111113.append(j3);
                                                throw g(sb111113.toString(), strTrim3);
                                            }
                                            if (i4 != 0) {
                                                StringBuilder sb111114 = new StringBuilder(36);
                                                sb111114.append(j3);
                                                sb111114.append(">mod=");
                                                sb111114.append(i4);
                                                throw g(sb111114.toString(), strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j2));
                                            arrayList.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(dMax, j3);
                                            if (i7 >= length) {
                                                str5 = str4;
                                                if (!str5.equals(",")) {
                                                    throw g(str5, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i8 < size) {
                                                        jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                            } else {
                                                strF2 = f(strArr2, i7, strTrim3);
                                                i7++;
                                                strArr2 = strArr2;
                                                zEquals = zEquals;
                                                i15 = i3;
                                                nVar = pVar3;
                                                sVarA = sVar3;
                                                tVar = pVar2;
                                            }
                                        }
                                    } else {
                                        str3 = strTrim;
                                    }
                                    zEquals = "is".equals(strF);
                                    if (!zEquals) {
                                    }
                                    i7 = i5 + 1;
                                    strF2 = f(strArr2, i5, strTrim3);
                                    z2 = true;
                                    if (!"not".equals(strF2)) {
                                        if (zEquals) {
                                        }
                                        z3 = !z;
                                        strF2 = f(strArr2, i7, strTrim3);
                                        i7++;
                                    } else {
                                        z3 = z;
                                    }
                                    arrayList = new ArrayList();
                                    dMin = 9.223372036854776E18d;
                                    dMax = -9.223372036854776E18d;
                                    while (true) {
                                        i3 = i15;
                                        pVar3 = nVar;
                                        j2 = Long.parseLong(strF2);
                                        length = strArr2.length;
                                        str4 = strF2;
                                        if (i7 < length) {
                                            sVar3 = sVarA;
                                            i9 = i7 + 1;
                                            strF3 = f(strArr2, i7, strTrim3);
                                            pVar2 = tVar;
                                            if (strF3.equals(".")) {
                                                i10 = i9 + 1;
                                                strF4 = f(strArr2, i9, strTrim3);
                                                if (strF4.equals(".")) {
                                                    throw g(strF4, strTrim3);
                                                }
                                                i11 = i10 + 1;
                                                strF5 = f(strArr2, i10, strTrim3);
                                                j4 = Long.parseLong(strF5);
                                                if (i11 < length) {
                                                    i7 = i11 + 1;
                                                    strF6 = f(strArr2, i11, strTrim3);
                                                    if (strF6.equals(",")) {
                                                        throw g(strF6, strTrim3);
                                                    }
                                                    str4 = strF6;
                                                    j3 = j4;
                                                } else {
                                                    i7 = i11;
                                                    j3 = j4;
                                                    str4 = strF5;
                                                }
                                            } else {
                                                if (strF3.equals(",")) {
                                                    throw g(strF3, strTrim3);
                                                }
                                                str4 = strF3;
                                                i7 = i9;
                                            }
                                            if (j2 <= j3) {
                                                StringBuilder sb111115 = new StringBuilder(41);
                                                sb111115.append(j2);
                                                sb111115.append("~");
                                                sb111115.append(j3);
                                                throw g(sb111115.toString(), strTrim3);
                                            }
                                            if (i4 != 0) {
                                                StringBuilder sb111116 = new StringBuilder(36);
                                                sb111116.append(j3);
                                                sb111116.append(">mod=");
                                                sb111116.append(i4);
                                                throw g(sb111116.toString(), strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j2));
                                            arrayList.add(Long.valueOf(j3));
                                            dMin = Math.min(dMin, j2);
                                            dMax = Math.max(dMax, j3);
                                            if (i7 >= length) {
                                                str5 = str4;
                                                if (!str5.equals(",")) {
                                                    throw g(str5, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i8 < size) {
                                                        jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                            } else {
                                                strF2 = f(strArr2, i7, strTrim3);
                                                i7++;
                                                strArr2 = strArr2;
                                                zEquals = zEquals;
                                                i15 = i3;
                                                nVar = pVar3;
                                                sVarA = sVar3;
                                                tVar = pVar2;
                                            }
                                        } else {
                                            pVar2 = tVar;
                                            sVar3 = sVarA;
                                        }
                                        j3 = j2;
                                        if (j2 <= j3) {
                                            StringBuilder sb111117 = new StringBuilder(41);
                                            sb111117.append(j2);
                                            sb111117.append("~");
                                            sb111117.append(j3);
                                            throw g(sb111117.toString(), strTrim3);
                                        }
                                        if (i4 != 0) {
                                            StringBuilder sb111118 = new StringBuilder(36);
                                            sb111118.append(j3);
                                            sb111118.append(">mod=");
                                            sb111118.append(i4);
                                            throw g(sb111118.toString(), strTrim3);
                                        }
                                        arrayList.add(Long.valueOf(j2));
                                        arrayList.add(Long.valueOf(j3));
                                        dMin = Math.min(dMin, j2);
                                        dMax = Math.max(dMax, j3);
                                        if (i7 >= length) {
                                            str5 = str4;
                                            if (!str5.equals(",")) {
                                                throw g(str5, strTrim3);
                                            }
                                            if (arrayList.size() == 2) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList.size();
                                                jArr = new long[size];
                                                while (i8 < size) {
                                                    jArr[i8] = ((Long) arrayList.get(i8)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin == dMax) {
                                            }
                                            uVar = new u(i4, z3, i2, z2, dMin, dMax, jArr2);
                                        } else {
                                            strF2 = f(strArr2, i7, strTrim3);
                                            i7++;
                                            strArr2 = strArr2;
                                            zEquals = zEquals;
                                            i15 = i3;
                                            nVar = pVar3;
                                            sVarA = sVar3;
                                            tVar = pVar2;
                                        }
                                    }
                                    break;
                                } else {
                                    strArr = strArrSplit2;
                                    pVar2 = tVar;
                                    str3 = strTrim;
                                    sVar3 = sVarA;
                                    i3 = i15;
                                    pVar3 = nVar;
                                }
                                if (pVar3 == null) {
                                    nVar = uVar;
                                } else {
                                    nVar = new n(pVar3, uVar);
                                }
                                i15 = i3 + 1;
                                strArrSplit2 = strArr;
                                strArrSplit3 = strArrSplit3;
                                strTrim = str3;
                                i14 = i14;
                                sVarA2 = sVarA2;
                                sVarA = sVar3;
                                tVar = pVar2;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } catch (Exception e2) {
                        throw g(str6, strTrim3);
                    }
                }
                String[] strArr3 = strArrSplit2;
                p pVar4 = tVar;
                String str7 = strTrim;
                s sVar4 = sVarA;
                s sVar5 = sVarA2;
                int i18 = i14;
                p pVar5 = nVar;
                tVar = pVar4 == null ? pVar5 : new t(pVar4, pVar5);
                i14 = i18 + 1;
                strArrSplit2 = strArr3;
                strTrim = str7;
                sVarA2 = sVar5;
                sVarA = sVar4;
            }
            str2 = strTrim;
            sVar = sVarA;
            sVar2 = sVarA2;
            pVar = tVar;
        }
        return new v(str2, pVar, sVar, sVar2);
    }

    public static x b(String str) {
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return a;
        }
        w wVar = new w();
        if (strTrim.endsWith(";")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        for (String str2 : g.split(strTrim)) {
            v vVarA = a(str2.trim());
            boolean z = wVar.a;
            boolean z2 = true;
            if (vVarA.c == null && vVarA.d == null) {
                z2 = false;
            }
            wVar.a = z | z2;
            wVar.a(vVarA);
        }
        Iterator it = wVar.b.iterator();
        v vVarA2 = null;
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if ("other".equals(vVar.a)) {
                it.remove();
                vVarA2 = vVar;
            }
        }
        if (vVarA2 == null) {
            vVarA2 = a("other:");
        }
        wVar.b.add(vVarA2);
        return new x(wVar);
    }

    public static void c(StringBuilder sb, double d2, double d3, boolean z) {
        if (z) {
            sb.append(",");
        }
        if (d2 == d3) {
            sb.append(e(d2));
            return;
        }
        String strE = e(d2);
        String strE2 = e(d3);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strE).length() + 2 + String.valueOf(strE2).length());
        sb2.append(strE);
        sb2.append("..");
        sb2.append(strE2);
        sb.append(sb2.toString());
    }

    public static x d(Locale locale, int i2) {
        y yVar = y.a;
        yVar.b();
        String str = (String) (i2 == 1 ? yVar.b : yVar.c).get(locale.getLanguage());
        if (str == null || str.trim().length() == 0) {
            return a;
        }
        x xVarA = yVar.a(str);
        return xVarA == null ? a : xVarA;
    }

    private static String e(double d2) {
        long j2 = (long) d2;
        return d2 == ((double) j2) ? String.valueOf(j2) : String.valueOf(d2);
    }

    private static String f(String[] strArr, int i2, String str) throws ParseException {
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("missing token at end of '");
        sb.append(str);
        sb.append("'");
        throw new ParseException(sb.toString(), -1);
    }

    private static ParseException g(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length());
        sb.append("unexpected token '");
        sb.append(str);
        sb.append("' in '");
        sb.append(str2);
        sb.append("'");
        return new ParseException(sb.toString(), -1);
    }

    public final boolean equals(Object obj) {
        x xVar;
        return (obj instanceof x) && (xVar = (x) obj) != null && toString().equals(xVar.toString());
    }

    @Deprecated
    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h.toString();
    }
}
