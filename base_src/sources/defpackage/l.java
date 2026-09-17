package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends Format {
    private static final String[] d = {"number", "date", "time", "spellout", "ordinal", "duration"};
    private static final String[] e = {"", "currency", "percent", "integer"};
    private static final String[] f = {"", "short", "medium", "long", "full"};
    private static final Locale g = new Locale("");
    static final long serialVersionUID = 7136212545847378652L;
    public transient Locale a;
    public transient aa b;
    public transient Map c;
    private transient DateFormat h;
    private transient NumberFormat i;
    private transient k j;
    private transient k k;

    /* JADX WARN: Code duplicated, block: B:51:0x0115 A[Catch: RuntimeException -> 0x014f, TryCatch #0 {RuntimeException -> 0x014f, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0015, B:9:0x0019, B:10:0x001c, B:12:0x0028, B:15:0x0035, B:17:0x003c, B:19:0x0058, B:20:0x0061, B:21:0x0068, B:22:0x006b, B:53:0x0127, B:54:0x014a, B:23:0x006f, B:24:0x0075, B:25:0x0078, B:31:0x00a3, B:49:0x0111, B:51:0x0115, B:52:0x011c, B:26:0x007b, B:27:0x0083, B:28:0x008b, B:29:0x0093, B:30:0x009b, B:32:0x00aa, B:33:0x00b0, B:34:0x00b3, B:40:0x00d9, B:35:0x00b6, B:36:0x00bd, B:37:0x00c4, B:38:0x00cb, B:39:0x00d2, B:41:0x00df, B:42:0x00e5, B:43:0x00e8, B:48:0x0107, B:44:0x00eb, B:45:0x00f2, B:46:0x00f9, B:47:0x0100, B:6:0x0012), top: B:70:0x0006 }] */
    public l(String str, Locale locale) {
        Cloneable numberFormat;
        this.a = locale;
        try {
            aa aaVar = this.b;
            if (aaVar == null) {
                this.b = new aa(str);
            } else {
                aaVar.i(str);
            }
            Map map = this.c;
            if (map != null) {
                map.clear();
            }
            int iB = this.b.b() - 2;
            int i = 1;
            while (i < iB) {
                z zVarD = this.b.d(i);
                if (zVarD.e == 6 && zVarD.b() == 2) {
                    int i2 = i + 2;
                    aa aaVar2 = this.b;
                    int i3 = i2 + 1;
                    String strF = aaVar2.f(aaVar2.d(i2));
                    String strF2 = "";
                    z zVarD2 = this.b.d(i3);
                    if (zVarD2.e == 11) {
                        strF2 = this.b.f(zVarD2);
                        i3++;
                    }
                    switch (c(strF, d)) {
                        case 0:
                            switch (c(strF2, e)) {
                                case 0:
                                    numberFormat = NumberFormat.getInstance(this.a);
                                    break;
                                case 1:
                                    numberFormat = NumberFormat.getCurrencyInstance(this.a);
                                    break;
                                case 2:
                                    numberFormat = NumberFormat.getPercentInstance(this.a);
                                    break;
                                case 3:
                                    numberFormat = NumberFormat.getIntegerInstance(this.a);
                                    break;
                                default:
                                    numberFormat = new DecimalFormat(strF2, new DecimalFormatSymbols(this.a));
                                    break;
                            }
                            if (this.c == null) {
                                this.c = new HashMap();
                            }
                            this.c.put(Integer.valueOf(i), numberFormat);
                            i = i3;
                            break;
                        case 1:
                            switch (c(strF2, f)) {
                                case 0:
                                    numberFormat = DateFormat.getDateInstance(2, this.a);
                                    break;
                                case 1:
                                    numberFormat = DateFormat.getDateInstance(3, this.a);
                                    break;
                                case 2:
                                    numberFormat = DateFormat.getDateInstance(2, this.a);
                                    break;
                                case 3:
                                    numberFormat = DateFormat.getDateInstance(1, this.a);
                                    break;
                                case 4:
                                    numberFormat = DateFormat.getDateInstance(0, this.a);
                                    break;
                                default:
                                    numberFormat = new SimpleDateFormat(strF2, this.a);
                                    break;
                            }
                            if (this.c == null) {
                                this.c = new HashMap();
                            }
                            this.c.put(Integer.valueOf(i), numberFormat);
                            i = i3;
                            break;
                        case 2:
                            switch (c(strF2, f)) {
                                case 0:
                                    numberFormat = DateFormat.getTimeInstance(2, this.a);
                                    break;
                                case 1:
                                    numberFormat = DateFormat.getTimeInstance(3, this.a);
                                    break;
                                case 2:
                                    numberFormat = DateFormat.getTimeInstance(2, this.a);
                                    break;
                                case 3:
                                    numberFormat = DateFormat.getTimeInstance(1, this.a);
                                    break;
                                case 4:
                                    numberFormat = DateFormat.getTimeInstance(0, this.a);
                                    break;
                                default:
                                    numberFormat = new SimpleDateFormat(strF2, this.a);
                                    break;
                            }
                            if (this.c == null) {
                                this.c = new HashMap();
                            }
                            this.c.put(Integer.valueOf(i), numberFormat);
                            i = i3;
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(String.valueOf(strF).length() + 22);
                            sb.append("Unknown format type \"");
                            sb.append(strF);
                            sb.append("\"");
                            throw new IllegalArgumentException(sb.toString());
                    }
                }
                i++;
            }
        } catch (RuntimeException e2) {
            aa aaVar3 = this.b;
            if (aaVar3 != null) {
                aaVar3.a = null;
                aaVar3.d = false;
                aaVar3.b.clear();
                ArrayList arrayList = aaVar3.c;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            Map map2 = this.c;
            if (map2 != null) {
                map2.clear();
            }
            throw e2;
        }
    }

    public static final String a(Locale locale, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder(str.length());
        new l(str, locale).f(0, null, null, null, objArr, new g(sb), null);
        return sb.toString();
    }

    private static final int c(String str, String[] strArr) {
        byte[] bArr = e.a;
        if (str.length() != 0 && (e.a(str.charAt(0)) || e.a(str.charAt(str.length() - 1)))) {
            int length = str.length();
            int i = 0;
            while (i < length && e.a(str.charAt(i))) {
                i++;
            }
            if (i < length) {
                while (true) {
                    int i2 = length - 1;
                    if (!e.a(str.charAt(i2))) {
                        break;
                    }
                    length = i2;
                }
            }
            str = str.substring(i, length);
        }
        String lowerCase = str.toLowerCase(g);
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (lowerCase.equals(strArr[i3])) {
                return i3;
            }
        }
        return -1;
    }

    private final void d(Object obj, g gVar, FieldPosition fieldPosition) {
        if (obj == null || (obj instanceof Map)) {
            e(null, (Map) obj, gVar, fieldPosition);
        } else {
            e((Object[]) obj, null, gVar, fieldPosition);
        }
    }

    private final void e(Object[] objArr, Map map, g gVar, FieldPosition fieldPosition) {
        if (objArr != null && this.b.d) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        f(0, null, objArr, map, null, gVar, fieldPosition);
    }

    private final void f(int i, j jVar, Object[] objArr, Map map, Object[] objArr2, g gVar, FieldPosition fieldPosition) {
        Object objValueOf;
        Object obj;
        boolean z;
        g gVar2;
        Map map2;
        int i2;
        k kVar;
        double dA;
        int i3;
        j jVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        String str;
        v vVar;
        Map map3;
        int i8;
        Format format;
        int i9;
        int i10;
        l lVar = this;
        g gVar3 = gVar;
        aa aaVar = lVar.b;
        String str2 = aaVar.a;
        int iA = aaVar.d(i).a();
        int i11 = i + 1;
        FieldPosition fieldPosition2 = fieldPosition;
        while (true) {
            z zVarD = lVar.b.d(i11);
            int i12 = zVarD.e;
            int i13 = zVarD.a;
            try {
                gVar3.a.append(str2, iA, i13);
                gVar3.b += i13 - iA;
                if (i12 == 2) {
                    return;
                }
                int iA2 = zVarD.a();
                if (i12 != 5) {
                    if (i12 == 6) {
                        int iC = lVar.b.c(i11);
                        int iB = zVarD.b();
                        int i14 = i11 + 1;
                        z zVarD2 = lVar.b.d(i14);
                        String strF = lVar.b.f(zVarD2);
                        if (objArr != 0) {
                            short s = zVarD2.c;
                            objValueOf = gVar3.c != null ? Integer.valueOf(s) : null;
                            if (s < 0 || s >= objArr.length) {
                                obj = null;
                                z = true;
                            } else {
                                obj = objArr[s];
                                z = false;
                            }
                        } else if (objArr2 != null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= 2) {
                                    obj = null;
                                    z = true;
                                    break;
                                } else {
                                    if (strF.equals(objArr2[i15].toString())) {
                                        obj = objArr2[i15 + 1];
                                        z = false;
                                        break;
                                    }
                                    i15 += 2;
                                }
                            }
                            objValueOf = strF;
                        } else if (map == 0 || !map.containsKey(strF)) {
                            objValueOf = strF;
                            obj = null;
                            z = true;
                        } else {
                            obj = map.get(strF);
                            objValueOf = strF;
                            z = false;
                        }
                        int iC2 = i14 + 1;
                        int i16 = gVar3.b;
                        if (z) {
                            StringBuilder sb = new StringBuilder(String.valueOf(strF).length() + 2);
                            sb.append("{");
                            sb.append(strF);
                            sb.append("}");
                            gVar3.a(sb.toString());
                            fieldPosition2 = fieldPosition2;
                            objValueOf = objValueOf;
                            gVar2 = gVar3;
                            str2 = str2;
                            i16 = i16;
                            iC = iC;
                        } else if (obj == null) {
                            gVar3.a("null");
                            fieldPosition2 = fieldPosition2;
                            objValueOf = objValueOf;
                            gVar2 = gVar3;
                            str2 = str2;
                            i16 = i16;
                            iC = iC;
                        } else if (jVar == 0 || jVar.e != iC2 - 2) {
                            Map map4 = lVar.c;
                            if (map4 != null && (format = (Format) map4.get(Integer.valueOf(iC2 - 2))) != null) {
                                gVar3.b(format, obj);
                                fieldPosition2 = fieldPosition2;
                                objValueOf = objValueOf;
                                gVar2 = gVar3;
                                str2 = str2;
                                i16 = i16;
                                iC = iC;
                            } else if (iB != 1 && ((map2 = lVar.c) == null || !map2.containsKey(Integer.valueOf(iC2 - 2)))) {
                                Object obj2 = objValueOf;
                                if (iB != 3) {
                                    Object obj3 = obj2;
                                    if (!d.b(iB)) {
                                        fieldPosition2 = fieldPosition2;
                                        objValueOf = obj3;
                                        str2 = str2;
                                        i16 = i16;
                                        iC = iC;
                                        if (iB != 5) {
                                            String strA = d.a(iB);
                                            StringBuilder sb2 = new StringBuilder(strA.length() + 19);
                                            sb2.append("unexpected argType ");
                                            sb2.append(strA);
                                            throw new IllegalStateException(sb2.toString());
                                        }
                                        lVar = this;
                                        aa aaVar2 = lVar.b;
                                        String string = obj.toString();
                                        int iB2 = aaVar2.b();
                                        int i17 = 0;
                                        while (true) {
                                            int i18 = iC2 + 1;
                                            z zVarD3 = aaVar2.d(iC2);
                                            if (zVarD3.e == 7) {
                                                i2 = i17;
                                                break;
                                            }
                                            if (aaVar2.g(zVarD3, string)) {
                                                i2 = i18;
                                                break;
                                            }
                                            if (i17 == 0) {
                                                i17 = aaVar2.g(zVarD3, "other") ? i18 : 0;
                                            }
                                            iC2 = aaVar2.c(i18) + 1;
                                            if (iC2 >= iB2) {
                                                i2 = i17;
                                                break;
                                            }
                                        }
                                        g(i2, null, objArr, map, objArr2, gVar);
                                        gVar2 = gVar;
                                    } else {
                                        if (!(obj instanceof Number)) {
                                            String strValueOf = String.valueOf(obj);
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf).length() + 18);
                                            sb3.append("'");
                                            sb3.append(strValueOf);
                                            sb3.append("' is not a Number");
                                            throw new IllegalArgumentException(sb3.toString());
                                        }
                                        if (iB == 4) {
                                            if (lVar.j == null) {
                                                lVar.j = new k(lVar, 1);
                                            }
                                            kVar = lVar.j;
                                        } else {
                                            if (lVar.k == null) {
                                                lVar.k = new k(lVar, 2);
                                            }
                                            kVar = lVar.k;
                                        }
                                        Number number = (Number) obj;
                                        aa aaVar3 = lVar.b;
                                        z zVar = (z) aaVar3.b.get(iC2);
                                        j jVar3 = new j(iC2, strF, number, d.d(zVar.e) ? aaVar3.a(zVar) : 0.0d);
                                        aa aaVar4 = lVar.b;
                                        double dDoubleValue = number.doubleValue();
                                        int iB3 = aaVar4.b();
                                        z zVarD4 = aaVar4.d(iC2);
                                        if (d.d(zVarD4.e)) {
                                            dA = aaVar4.a(zVarD4);
                                            iC2++;
                                        } else {
                                            dA = 0.0d;
                                        }
                                        String str3 = null;
                                        boolean z2 = false;
                                        int i19 = 0;
                                        while (true) {
                                            str2 = str2;
                                            int i20 = iC2 + 1;
                                            z zVarD5 = aaVar4.d(iC2);
                                            iC = iC;
                                            fieldPosition2 = fieldPosition2;
                                            if (zVarD5.e == 7) {
                                                i3 = i19;
                                                jVar2 = jVar3;
                                                objValueOf = obj3;
                                                i16 = i16;
                                                break;
                                            }
                                            if (d.d(aaVar4.h(i20))) {
                                                int i21 = i20 + 1;
                                                if (dDoubleValue == aaVar4.a(aaVar4.d(i20))) {
                                                    i3 = i21;
                                                    jVar2 = jVar3;
                                                    objValueOf = obj3;
                                                    i16 = i16;
                                                    break;
                                                }
                                                i20 = i21;
                                                jVar2 = jVar3;
                                                objValueOf = obj3;
                                                i16 = i16;
                                            } else {
                                                if (z2) {
                                                    z2 = z2;
                                                    jVar2 = jVar3;
                                                    objValueOf = obj3;
                                                    i4 = i20;
                                                    i16 = i16;
                                                } else if (!aaVar4.g(zVarD5, "other")) {
                                                    if (str3 == null) {
                                                        int i22 = i16;
                                                        double d2 = dDoubleValue - dA;
                                                        if (kVar.b == null) {
                                                            kVar.b = x.d(kVar.a.a, kVar.c);
                                                        }
                                                        l lVar2 = kVar.a;
                                                        int i23 = jVar3.a;
                                                        i4 = i20;
                                                        int iB4 = lVar2.b.b();
                                                        objValueOf = obj3;
                                                        if (d.d(lVar2.b.d(i23).e)) {
                                                            i23++;
                                                        }
                                                        while (true) {
                                                            int i24 = i23 + 1;
                                                            i16 = i22;
                                                            z zVarD6 = lVar2.b.d(i23);
                                                            if (zVarD6.e == 7) {
                                                                i5 = 0;
                                                                i6 = 1;
                                                                break;
                                                            }
                                                            if (lVar2.b.g(zVarD6, "other")) {
                                                                i5 = i24;
                                                                i6 = 1;
                                                                break;
                                                            }
                                                            if (d.d(lVar2.b.h(i24))) {
                                                                i24++;
                                                            }
                                                            int iC3 = lVar2.b.c(i24);
                                                            i6 = 1;
                                                            i23 = iC3 + 1;
                                                            if (i23 >= iB4) {
                                                                i5 = 0;
                                                                break;
                                                            } else {
                                                                jVar3 = jVar3;
                                                                i22 = i16;
                                                            }
                                                        }
                                                        l lVar3 = kVar.a;
                                                        String str4 = jVar3.b;
                                                        int iC4 = i5 + i6;
                                                        while (true) {
                                                            z zVarD7 = lVar3.b.d(iC4);
                                                            int i25 = zVarD7.e;
                                                            if (i25 == 2) {
                                                                iC4 = 0;
                                                                break;
                                                            }
                                                            if (i25 == 5) {
                                                                iC4 = -1;
                                                                break;
                                                            }
                                                            if (i25 == 6) {
                                                                int iB5 = zVarD7.b();
                                                                if (str4.length() != 0 && (iB5 == 1 || iB5 == 2)) {
                                                                    if (lVar3.b.g(lVar3.b.d(iC4 + 1), str4)) {
                                                                        break;
                                                                    }
                                                                }
                                                                iC4 = lVar3.b.c(iC4);
                                                            } else {
                                                                jVar3 = jVar3;
                                                            }
                                                            iC4++;
                                                            jVar3 = jVar3;
                                                        }
                                                        jVar3.e = iC4;
                                                        if (iC4 > 0 && (map3 = kVar.a.c) != null) {
                                                            jVar3.f = (Format) map3.get(Integer.valueOf(iC4));
                                                        }
                                                        if (jVar3.f == null) {
                                                            jVar3.f = kVar.a.b();
                                                            jVar3.h = true;
                                                        }
                                                        jVar3.g = jVar3.f.format(jVar3.c);
                                                        w wVar = kVar.b.h;
                                                        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
                                                            jVar2 = jVar3;
                                                            i7 = 0;
                                                        } else {
                                                            double d3 = d2 < 0.0d ? -d2 : d2;
                                                            if (d3 < 1.0E9d) {
                                                                long j = ((long) (d3 * 1000000.0d)) % 1000000;
                                                                int i26 = 10;
                                                                int i27 = 6;
                                                                while (true) {
                                                                    if (i27 <= 0) {
                                                                        jVar2 = jVar3;
                                                                        i7 = 0;
                                                                        break;
                                                                    }
                                                                    jVar2 = jVar3;
                                                                    if (j % ((long) i26) != 0) {
                                                                        i7 = i27;
                                                                        break;
                                                                    } else {
                                                                        i26 *= 10;
                                                                        i27--;
                                                                        jVar3 = jVar2;
                                                                    }
                                                                }
                                                            } else {
                                                                jVar2 = jVar3;
                                                                String str5 = String.format(Locale.ENGLISH, "%1.15e", Double.valueOf(d3));
                                                                int iLastIndexOf = str5.lastIndexOf(R.styleable.AppCompatTheme_switchStyle);
                                                                int i28 = iLastIndexOf + 1;
                                                                if (str5.charAt(i28) == '+') {
                                                                    i28++;
                                                                }
                                                                int i29 = (iLastIndexOf - 2) - Integer.parseInt(str5.substring(i28));
                                                                if (i29 < 0) {
                                                                    i7 = 0;
                                                                } else {
                                                                    int i30 = i29;
                                                                    for (int i31 = iLastIndexOf - 1; i30 > 0 && str5.charAt(i31) == '0'; i31--) {
                                                                        i30--;
                                                                    }
                                                                    i7 = i30;
                                                                }
                                                            }
                                                        }
                                                        q qVar = new q(d2, i7);
                                                        if (Double.isInfinite(qVar.a) || Double.isNaN(qVar.a)) {
                                                            str = "other";
                                                        } else {
                                                            Iterator it = wVar.b.iterator();
                                                            do {
                                                                if (!it.hasNext()) {
                                                                    vVar = null;
                                                                    break;
                                                                }
                                                                vVar = (v) it.next();
                                                            } while (!vVar.b.a(qVar));
                                                            str = vVar.a;
                                                        }
                                                        if (i19 == 0 || !str.equals("other")) {
                                                            str3 = str;
                                                        } else {
                                                            str3 = str;
                                                            z2 = true;
                                                        }
                                                    } else {
                                                        z2 = z2;
                                                        jVar2 = jVar3;
                                                        objValueOf = obj3;
                                                        i4 = i20;
                                                        i16 = i16;
                                                    }
                                                    if (!z2 && aaVar4.g(zVarD5, str3)) {
                                                        i19 = i4;
                                                        i20 = i19;
                                                        z2 = true;
                                                    }
                                                } else if (i19 != 0) {
                                                    z2 = z2;
                                                    jVar2 = jVar3;
                                                    objValueOf = obj3;
                                                    i4 = i20;
                                                    i16 = i16;
                                                } else if (str3 == null || !str3.equals("other")) {
                                                    jVar2 = jVar3;
                                                    objValueOf = obj3;
                                                    i19 = i20;
                                                    i16 = i16;
                                                } else {
                                                    jVar2 = jVar3;
                                                    objValueOf = obj3;
                                                    i19 = i20;
                                                    i16 = i16;
                                                    z2 = true;
                                                }
                                                z2 = z2;
                                                i20 = i4;
                                            }
                                            int iC5 = aaVar4.c(i20) + 1;
                                            if (iC5 >= iB3) {
                                                i3 = i19;
                                                break;
                                            }
                                            jVar3 = jVar2;
                                            iC2 = iC5;
                                            str2 = str2;
                                            iC = iC;
                                            fieldPosition2 = fieldPosition2;
                                            obj3 = objValueOf;
                                            i16 = i16;
                                        }
                                        g(i3, jVar2, objArr, map, objArr2, gVar);
                                        lVar = this;
                                        gVar2 = gVar;
                                    }
                                } else {
                                    if (!(obj instanceof Number)) {
                                        String strValueOf2 = String.valueOf(obj);
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf2).length() + 18);
                                        sb4.append("'");
                                        sb4.append(strValueOf2);
                                        sb4.append("' is not a Number");
                                        throw new IllegalArgumentException(sb4.toString());
                                    }
                                    double dDoubleValue2 = ((Number) obj).doubleValue();
                                    aa aaVar5 = lVar.b;
                                    int iB6 = aaVar5.b();
                                    int i32 = iC2 + 2;
                                    while (true) {
                                        i8 = i32;
                                        int iC6 = aaVar5.c(i8) + 1;
                                        if (iC6 >= iB6) {
                                            break;
                                        }
                                        int i33 = iC6 + 1;
                                        z zVarD8 = aaVar5.d(iC6);
                                        int i34 = iB6;
                                        if (zVarD8.e == 7) {
                                            break;
                                        }
                                        double dA2 = aaVar5.a(zVarD8);
                                        i32 = i33 + 1;
                                        if (aaVar5.a.charAt(((z) aaVar5.b.get(i33)).a) != '<') {
                                            if (dDoubleValue2 < dA2) {
                                                break;
                                            } else {
                                                iB6 = i34;
                                            }
                                        } else if (dDoubleValue2 <= dA2) {
                                            break;
                                        } else {
                                            iB6 = i34;
                                        }
                                    }
                                    g(i8, null, objArr, map, objArr2, gVar);
                                    fieldPosition2 = fieldPosition2;
                                    objValueOf = obj2;
                                    gVar2 = gVar3;
                                    str2 = str2;
                                    i16 = i16;
                                    iC = iC;
                                }
                            } else if (obj instanceof Number) {
                                gVar2 = gVar;
                                gVar2.b(b(), obj);
                            } else {
                                gVar2 = gVar;
                                if (obj instanceof Date) {
                                    if (lVar.h == null) {
                                        lVar.h = DateFormat.getDateTimeInstance(3, 3, lVar.a);
                                    }
                                    gVar2.b(lVar.h, obj);
                                } else {
                                    gVar2.a(obj.toString());
                                }
                            }
                        } else if (jVar.d == 0.0d) {
                            gVar3.c(jVar.f, jVar.c, jVar.g);
                            fieldPosition2 = fieldPosition2;
                            objValueOf = objValueOf;
                            gVar2 = gVar3;
                            str2 = str2;
                            i16 = i16;
                            iC = iC;
                        } else {
                            gVar3.b(jVar.f, obj);
                            fieldPosition2 = fieldPosition2;
                            objValueOf = objValueOf;
                            gVar2 = gVar3;
                            str2 = str2;
                            i16 = i16;
                            iC = iC;
                        }
                        List list = gVar2.c;
                        if (list != null) {
                            int i35 = gVar2.b;
                            i9 = i16;
                            if (i9 < i35) {
                                list.add(new h(objValueOf, i9, i35));
                            }
                        } else {
                            i9 = i16;
                        }
                        if (fieldPosition2 == null || !i.a.equals(fieldPosition2.getFieldAttribute())) {
                            fieldPosition2 = fieldPosition2;
                        } else {
                            FieldPosition fieldPosition3 = fieldPosition2;
                            fieldPosition3.setBeginIndex(i9);
                            fieldPosition3.setEndIndex(gVar2.b);
                            fieldPosition2 = null;
                        }
                        i10 = iC;
                        iA = lVar.b.d(i10).a();
                    }
                    gVar3 = gVar2;
                    i11 = i10 + 1;
                    str2 = str2;
                } else if (jVar.h) {
                    gVar3.c(jVar.f, jVar.c, jVar.g);
                } else {
                    gVar3.b(b(), jVar.c);
                }
                i10 = i11;
                iA = iA2;
                gVar2 = gVar3;
                str2 = str2;
                gVar3 = gVar2;
                i11 = i10 + 1;
                str2 = str2;
            } catch (IOException e2) {
                throw new ad(e2);
            }
        }
    }

    private final void g(int i, j jVar, Object[] objArr, Map map, Object[] objArr2, g gVar) {
        if (this.b.f == 2) {
            throw new UnsupportedOperationException("JDK apostrophe mode not supported");
        }
        f(i, jVar, objArr, map, objArr2, gVar, null);
    }

    private final void h(String str, ParsePosition parsePosition, Object[] objArr, Map map) {
        String strF;
        Object objValueOf;
        short s;
        Object objValueOf2;
        Map map2;
        aa aaVar;
        int i;
        int i2;
        Format format;
        if (str == null) {
            return;
        }
        aa aaVar2 = this.b;
        String str2 = aaVar2.a;
        int iA = aaVar2.d(0).a();
        int index = parsePosition.getIndex();
        ParsePosition parsePosition2 = new ParsePosition(0);
        boolean z = true;
        int i3 = 1;
        while (true) {
            z zVarD = this.b.d(i3);
            int i4 = zVarD.e;
            int i5 = zVarD.a - iA;
            if (i5 != 0 && !str2.regionMatches(iA, str, index, i5)) {
                parsePosition.setErrorIndex(index);
                return;
            }
            index += i5;
            if (i4 == 2) {
                parsePosition.setIndex(index);
                return;
            }
            if (i4 == 3 || i4 == 4) {
                iA = zVarD.a();
            } else {
                int iC = this.b.c(i3);
                int iB = zVarD.b();
                int i6 = i3 + 1;
                z zVarD2 = this.b.d(i6);
                if (objArr != null) {
                    s = zVarD2.c;
                    objValueOf = Integer.valueOf(s);
                    strF = null;
                } else {
                    strF = zVarD2.e == 9 ? this.b.f(zVarD2) : Integer.toString(zVarD2.c);
                    objValueOf = strF;
                    s = 0;
                }
                int i7 = i6 + 1;
                Map map3 = this.c;
                if (map3 != null && (format = (Format) map3.get(Integer.valueOf(i7 - 2))) != null) {
                    parsePosition2.setIndex(index);
                    objValueOf2 = format.parseObject(str, parsePosition2);
                    if (parsePosition2.getIndex() == index) {
                        parsePosition.setErrorIndex(index);
                        return;
                    } else {
                        index = parsePosition2.getIndex();
                        str2 = str2;
                        strF = strF;
                    }
                } else if (iB == z || ((map2 = this.c) != null && map2.containsKey(Integer.valueOf(i7 - 2)))) {
                    StringBuilder sb = new StringBuilder();
                    aa aaVar3 = this.b;
                    String str3 = aaVar3.a;
                    int iA2 = aaVar3.d(iC).a();
                    int i8 = iC + 1;
                    while (true) {
                        z zVarD3 = this.b.d(i8);
                        int i9 = zVarD3.e;
                        sb.append((CharSequence) str3, iA2, zVarD3.a);
                        if (i9 == 6 || i9 == 2) {
                            break;
                        }
                        iA2 = zVarD3.a();
                        i8++;
                    }
                    String string = sb.toString();
                    int iIndexOf = string.length() != 0 ? str.indexOf(string, index) : str.length();
                    if (iIndexOf < 0) {
                        parsePosition.setErrorIndex(index);
                        return;
                    }
                    String strSubstring = str.substring(index, iIndexOf);
                    String string2 = objValueOf.toString();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(string2).length() + 2);
                    sb2.append("{");
                    sb2.append(string2);
                    sb2.append("}");
                    boolean zEquals = strSubstring.equals(sb2.toString());
                    index = iIndexOf;
                    z = !zEquals;
                    objValueOf2 = true == zEquals ? null : strSubstring;
                } else {
                    if (iB != 3) {
                        if (d.b(iB) || iB == 5) {
                            throw new UnsupportedOperationException("Parsing of plural/select/selectordinal argument is not supported.");
                        }
                        String strA = d.a(iB);
                        StringBuilder sb3 = new StringBuilder(strA.length() + 19);
                        sb3.append("unexpected argType ");
                        sb3.append(strA);
                        throw new IllegalStateException(sb3.toString());
                    }
                    parsePosition2.setIndex(index);
                    aa aaVar4 = this.b;
                    int index2 = parsePosition2.getIndex();
                    double d2 = Double.NaN;
                    int i10 = index2;
                    while (true) {
                        if (aaVar4.h(i7) == 7) {
                            str2 = str2;
                            strF = strF;
                            break;
                        }
                        double dA = aaVar4.a(aaVar4.d(i7));
                        int i11 = i7 + 2;
                        int iC2 = aaVar4.c(i11);
                        String str4 = aaVar4.a;
                        int i12 = 0;
                        str2 = str2;
                        int iA3 = aaVar4.d(i11).a();
                        while (true) {
                            i11++;
                            strF = strF;
                            z zVarD4 = aaVar4.d(i11);
                            if (i11 != iC2) {
                                aaVar = aaVar4;
                                if (zVarD4.e != 3) {
                                    continue;
                                }
                                strF = strF;
                                aaVar4 = aaVar;
                            } else {
                                aaVar = aaVar4;
                            }
                            int i13 = zVarD4.a - iA3;
                            if (i13 != 0 && !str.regionMatches(index2, str4, iA3, i13)) {
                                i = -1;
                                break;
                            }
                            i12 += i13;
                            if (i11 == iC2) {
                                i = i12;
                                break;
                            } else {
                                iA3 = zVarD4.a();
                                strF = strF;
                                aaVar4 = aaVar;
                            }
                        }
                        if (i >= 0 && (i2 = i + index2) > i10) {
                            if (i2 == str.length()) {
                                i10 = i2;
                                d2 = dA;
                                break;
                            } else {
                                i10 = i2;
                                d2 = dA;
                            }
                        }
                        i7 = iC2 + 1;
                        str2 = str2;
                        strF = strF;
                        aaVar4 = aaVar;
                    }
                    if (i10 == index2) {
                        parsePosition2.setErrorIndex(index2);
                    } else {
                        parsePosition2.setIndex(i10);
                    }
                    if (parsePosition2.getIndex() == index) {
                        parsePosition.setErrorIndex(index);
                        return;
                    } else {
                        objValueOf2 = Double.valueOf(d2);
                        index = parsePosition2.getIndex();
                        z = true;
                    }
                }
                if (z) {
                    if (objArr != null) {
                        objArr[s] = objValueOf2;
                    } else if (map != null) {
                        map.put(strF, objValueOf2);
                    }
                }
                iA = this.b.d(iC).a();
                i3 = iC;
            }
            i3++;
            str2 = str2;
            z = true;
        }
    }

    public final NumberFormat b() {
        if (this.i == null) {
            this.i = NumberFormat.getInstance(this.a);
        }
        return this.i;
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        d(obj, new g(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    @Override // java.text.Format
    public final AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        if (obj == null) {
            throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
        }
        StringBuilder sb = new StringBuilder();
        g gVar = new g(sb);
        gVar.c = new ArrayList();
        d(obj, gVar, null);
        AttributedString attributedString = new AttributedString(sb.toString());
        for (h hVar : gVar.c) {
            attributedString.addAttribute(hVar.a, hVar.b, hVar.c, hVar.d);
        }
        return attributedString.getIterator();
    }

    public final int hashCode() {
        return this.b.a.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        if (this.b.d) {
            HashMap map = new HashMap();
            int index = parsePosition.getIndex();
            h(str, parsePosition, null, map);
            if (parsePosition.getIndex() == index) {
                return null;
            }
            return map;
        }
        int iC = 0;
        short s = -1;
        while (true) {
            if (iC != 0) {
                iC = this.b.c(iC);
            }
            while (true) {
                iC++;
                int iH = this.b.h(iC);
                if (iH == 6) {
                    break;
                }
                if (iH == 2) {
                    iC = -1;
                    break;
                }
            }
            if (iC < 0) {
                break;
            }
            short s2 = this.b.d(iC + 1).c;
            if (s2 > s) {
                s = s2;
            }
        }
        Object[] objArr = new Object[s + 1];
        int index2 = parsePosition.getIndex();
        h(str, parsePosition, objArr, null);
        if (parsePosition.getIndex() == index2) {
            return null;
        }
        return objArr;
    }
}
