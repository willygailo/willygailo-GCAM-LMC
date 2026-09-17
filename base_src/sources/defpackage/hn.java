package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.google.android.apps.camera.bottombar.R;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class hn {
    public static float a(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable th) {
            return 0.0f;
        }
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable th) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static EdgeEffect c(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable th) {
            return new EdgeEffect(context);
        }
    }

    public static atr d(String str, String str2) {
        ats atsVar;
        if (str == null || str2 == null) {
            throw new ass("Parameter must not be null", 4);
        }
        atr atrVar = new atr();
        atq atqVar = new atq();
        atqVar.a = str2;
        while (atqVar.e < atqVar.a.length() && "/[*".indexOf(atqVar.a.charAt(atqVar.e)) < 0) {
            atqVar.e++;
        }
        int i = atqVar.e;
        int i2 = atqVar.d;
        if (i == i2) {
            throw new ass("Empty initial XMPPath step", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        }
        String strF = f(str, atqVar.a.substring(i2, i));
        atn atnVarE = asv.a.e(strF);
        if (atnVarE == null) {
            atrVar.c(new ats(str, Integer.MIN_VALUE));
            atrVar.c(new ats(strF, 1));
        } else {
            atrVar.c(new ats(atnVarE.a, Integer.MIN_VALUE));
            ats atsVar2 = new ats(f(atnVarE.a, atnVarE.c), 1);
            atsVar2.a();
            atsVar2.d = atnVarE.d.a;
            atrVar.c(atsVar2);
            if (atnVarE.d.c()) {
                ats atsVar3 = new ats("[?xml:lang='x-default']", 5);
                atsVar3.a();
                atsVar3.d = atnVarE.d.a;
                atrVar.c(atsVar3);
            } else if (atnVarE.d.h(512)) {
                ats atsVar4 = new ats("[1]", 3);
                atsVar4.a();
                atsVar4.d = atnVarE.d.a;
                atrVar.c(atsVar4);
            }
        }
        while (atqVar.e < str2.length()) {
            int i3 = atqVar.e;
            atqVar.d = i3;
            if (str2.charAt(i3) == '/') {
                int i4 = atqVar.d + 1;
                atqVar.d = i4;
                if (i4 >= str2.length()) {
                    throw new ass("Empty XMPPath segment", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                }
            }
            if (str2.charAt(atqVar.d) == '*') {
                int i5 = atqVar.d + 1;
                atqVar.d = i5;
                if (i5 >= str2.length() || str2.charAt(atqVar.d) != '[') {
                    throw new ass("Missing '[' after '*'", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                }
            }
            int i6 = atqVar.d;
            atqVar.e = i6;
            if (str2.charAt(i6) != '[') {
                atqVar.b = atqVar.d;
                while (atqVar.e < atqVar.a.length() && "/[*".indexOf(atqVar.a.charAt(atqVar.e)) < 0) {
                    atqVar.e++;
                }
                int i7 = atqVar.e;
                atqVar.c = i7;
                int i8 = atqVar.d;
                if (i7 == i8) {
                    throw new ass("Empty XMPPath segment", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                }
                atsVar = new ats(atqVar.a.substring(i8, i7), 1);
            } else {
                int i9 = atqVar.e + 1;
                atqVar.e = i9;
                if (atqVar.a.charAt(i9) >= '0' && atqVar.a.charAt(atqVar.e) <= '9') {
                    while (atqVar.e < atqVar.a.length() && atqVar.a.charAt(atqVar.e) >= '0' && atqVar.a.charAt(atqVar.e) <= '9') {
                        atqVar.e++;
                    }
                    atsVar = new ats(null, 3);
                } else {
                    while (atqVar.e < atqVar.a.length() && atqVar.a.charAt(atqVar.e) != ']' && atqVar.a.charAt(atqVar.e) != '=') {
                        atqVar.e++;
                    }
                    if (atqVar.e >= atqVar.a.length()) {
                        throw new ass("Missing ']' or '=' for array index", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                    }
                    if (atqVar.a.charAt(atqVar.e) != ']') {
                        atqVar.b = atqVar.d + 1;
                        int i10 = atqVar.e;
                        atqVar.c = i10;
                        int i11 = i10 + 1;
                        atqVar.e = i11;
                        char cCharAt = atqVar.a.charAt(i11);
                        if (cCharAt != '\'' && cCharAt != '\"') {
                            throw new ass("Invalid quote in array selector", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                        }
                        atqVar.e++;
                        while (atqVar.e < atqVar.a.length()) {
                            if (atqVar.a.charAt(atqVar.e) == cCharAt) {
                                if (atqVar.e + 1 >= atqVar.a.length() || atqVar.a.charAt(atqVar.e + 1) != cCharAt) {
                                    break;
                                }
                                atqVar.e++;
                            }
                            atqVar.e++;
                        }
                        if (atqVar.e >= atqVar.a.length()) {
                            throw new ass("No terminating quote for array selector", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                        }
                        atqVar.e++;
                        atsVar = new ats(null, 6);
                    } else {
                        if (!"[last()".equals(atqVar.a.substring(atqVar.d, atqVar.e))) {
                            throw new ass("Invalid non-numeric array index", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                        }
                        atsVar = new ats(null, 4);
                    }
                }
                if (atqVar.e >= atqVar.a.length() || atqVar.a.charAt(atqVar.e) != ']') {
                    throw new ass("Missing ']' for array index", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                }
                int i12 = atqVar.e + 1;
                atqVar.e = i12;
                atsVar.a = atqVar.a.substring(atqVar.d, i12);
            }
            int i13 = atsVar.b;
            if (i13 == 1) {
                if (atsVar.a.charAt(0) == '@') {
                    String strValueOf = String.valueOf(atsVar.a.substring(1));
                    atsVar.a = strValueOf.length() != 0 ? "?".concat(strValueOf) : new String("?");
                    if (!"?xml:lang".equals(atsVar.a)) {
                        throw new ass("Only xml:lang allowed with '@'", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                    }
                }
                if (atsVar.a.charAt(0) == '?') {
                    atqVar.b++;
                    atsVar.b = 2;
                }
                g(atqVar.a.substring(atqVar.b, atqVar.c));
            } else if (i13 != 6) {
                continue;
            } else {
                if (atsVar.a.charAt(1) == '@') {
                    String strValueOf2 = String.valueOf(atsVar.a.substring(2));
                    atsVar.a = strValueOf2.length() != 0 ? "[?".concat(strValueOf2) : new String("[?");
                    if (!atsVar.a.startsWith("[?xml:lang=")) {
                        throw new ass("Only xml:lang allowed with '@'", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                    }
                }
                if (atsVar.a.charAt(1) == '?') {
                    int i14 = atqVar.b + 1;
                    atqVar.b = i14;
                    atsVar.b = 5;
                    g(atqVar.a.substring(i14, atqVar.c));
                }
            }
            atrVar.c(atsVar);
        }
        return atrVar;
    }

    public static void e(ati atiVar, OutputStream outputStream, aty atyVar) {
        int i;
        if (atyVar.h(4096)) {
            atiVar.a.r();
        }
        atp atpVar = new atp();
        try {
            atpVar.c = new asy(outputStream);
            atpVar.d = new OutputStreamWriter(atpVar.c, atyVar.b());
            atpVar.b = atiVar;
            atpVar.e = atyVar;
            atpVar.g = atyVar.b;
            atpVar.d = new OutputStreamWriter(atpVar.c, atyVar.b());
            if (atpVar.e.c() | atpVar.e.d()) {
                atpVar.f = 2;
            }
            if (atpVar.e.i()) {
                if (atpVar.e.k() || atpVar.e.j()) {
                    throw new ass("Inconsistent options for exact size serialize", R.styleable.AppCompatTheme_textAppearanceListItem);
                }
                if ((atpVar.e.b & (atpVar.f - 1)) != 0) {
                    throw new ass("Exact size must be a multiple of the Unicode element", R.styleable.AppCompatTheme_textAppearanceListItem);
                }
            } else if (atpVar.e.l()) {
                if (atpVar.e.k() || atpVar.e.j()) {
                    throw new ass("Inconsistent options for read-only packet", R.styleable.AppCompatTheme_textAppearanceListItem);
                }
                atpVar.g = 0;
            } else if (!atpVar.e.k()) {
                if (atpVar.g == 0) {
                    atpVar.g = atpVar.f * 2048;
                }
                if (atpVar.e.j() && !atpVar.b.e("http://ns.adobe.com/xap/1.0/", "Thumbnails")) {
                    atpVar.g += atpVar.f * 10000;
                }
            } else {
                if (atpVar.e.j()) {
                    throw new ass("Inconsistent options for non-packet serialize", R.styleable.AppCompatTheme_textAppearanceListItem);
                }
                atpVar.g = 0;
            }
            if (!atpVar.e.k()) {
                atpVar.e(0);
                atpVar.d("<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>");
                atpVar.f();
            }
            atpVar.e(0);
            atpVar.d("<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"");
            asv.e();
            atpVar.d("Adobe XMP Core 5.1.0-jc003");
            atpVar.d("\">");
            atpVar.f();
            atpVar.e(1);
            atpVar.d("<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">");
            atpVar.f();
            if (atpVar.e.h(64)) {
                atpVar.e(2);
                atpVar.d("<rdf:Description rdf:about=");
                atpVar.g();
                HashSet hashSet = new HashSet();
                hashSet.add("xml");
                hashSet.add("rdf");
                Iterator itH = atpVar.b.a.h();
                while (itH.hasNext()) {
                    atpVar.i((atl) itH.next(), hashSet);
                }
                Iterator itH2 = atpVar.b.a.h();
                boolean zH = true;
                while (itH2.hasNext()) {
                    zH &= atpVar.h((atl) itH2.next(), 3);
                }
                if (zH) {
                    atpVar.d("/>");
                    atpVar.f();
                } else {
                    atpVar.c(62);
                    atpVar.f();
                    Iterator itH3 = atpVar.b.a.h();
                    while (itH3.hasNext()) {
                        atpVar.a((atl) itH3.next(), 3);
                    }
                    atpVar.e(2);
                    atpVar.d("</rdf:Description>");
                    atpVar.f();
                }
            } else if (atpVar.b.a.a() > 0) {
                Iterator itH4 = atpVar.b.a.h();
                while (itH4.hasNext()) {
                    atl atlVar = (atl) itH4.next();
                    atpVar.e(2);
                    atpVar.d("<rdf:Description rdf:about=");
                    atpVar.g();
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add("xml");
                    hashSet2.add("rdf");
                    atpVar.i(atlVar, hashSet2);
                    atpVar.c(62);
                    atpVar.f();
                    Iterator itH5 = atlVar.h();
                    while (itH5.hasNext()) {
                        atpVar.b((atl) itH5.next(), false, 3);
                    }
                    atpVar.e(2);
                    atpVar.d("</rdf:Description>");
                    atpVar.f();
                }
            } else {
                atpVar.e(2);
                atpVar.d("<rdf:Description rdf:about=");
                atpVar.g();
                atpVar.d("/>");
                atpVar.f();
            }
            atpVar.e(1);
            atpVar.d("</rdf:RDF>");
            atpVar.f();
            atpVar.e(0);
            atpVar.d("</x:xmpmeta>");
            atpVar.f();
            String strConcat = "";
            if (!atpVar.e.k()) {
                String strValueOf = String.valueOf(String.valueOf("").concat("<?xpacket end=\""));
                char c = true != atpVar.e.l() ? 'w' : 'r';
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1);
                sb.append(strValueOf);
                sb.append(c);
                strConcat = String.valueOf(sb.toString()).concat("\"?>");
            }
            atpVar.d.flush();
            int length = strConcat.length();
            if (atpVar.e.i()) {
                int i2 = atpVar.c.a + (length * atpVar.f);
                int i3 = atpVar.g;
                if (i2 > i3) {
                    throw new ass("Can't fit into specified packet size", R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle);
                }
                atpVar.g = i3 - i2;
            }
            atpVar.g /= atpVar.f;
            int length2 = atpVar.e.c.length();
            int i4 = atpVar.g;
            if (i4 >= length2) {
                atpVar.g = i4 - length2;
                while (true) {
                    i = atpVar.g;
                    int i5 = length2 + 100;
                    if (i < i5) {
                        break;
                    }
                    atpVar.j(100);
                    atpVar.f();
                    atpVar.g -= i5;
                }
                atpVar.j(i);
                atpVar.f();
            } else {
                atpVar.j(i4);
            }
            atpVar.d(strConcat);
            atpVar.d.flush();
            atpVar.c.close();
        } catch (IOException e) {
            throw new ass("Error writing to the OutputStream", 0);
        }
    }

    private static String f(String str, String str2) throws ass {
        if (str.length() == 0) {
            throw new ass("Schema namespace URI is required", R.styleable.AppCompatTheme_switchStyle);
        }
        if (str2.charAt(0) == '?' || str2.charAt(0) == '@') {
            throw new ass("Top level name must not be a qualifier", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        }
        if (str2.indexOf(47) >= 0 || str2.indexOf(91) >= 0) {
            throw new ass("Top level name must be simple", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        }
        String strA = asv.a.a(str);
        if (strA == null) {
            throw new ass("Unregistered schema namespace URI", R.styleable.AppCompatTheme_switchStyle);
        }
        int iIndexOf = str2.indexOf(58);
        if (iIndexOf < 0) {
            h(str2);
            String strValueOf = String.valueOf(str2);
            return strValueOf.length() != 0 ? strA.concat(strValueOf) : new String(strA);
        }
        h(str2.substring(0, iIndexOf));
        h(str2.substring(iIndexOf));
        String strSubstring = str2.substring(0, iIndexOf + 1);
        String strA2 = asv.a.a(str);
        if (strA2 == null) {
            throw new ass("Unknown schema namespace prefix", R.styleable.AppCompatTheme_switchStyle);
        }
        if (strSubstring.equals(strA2)) {
            return str2;
        }
        throw new ass("Schema namespace URI and prefix mismatch", R.styleable.AppCompatTheme_switchStyle);
    }

    private static void g(String str) throws ass {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf > 0) {
            String strSubstring = str.substring(0, iIndexOf);
            if (atb.f(strSubstring)) {
                if (asv.a.b(strSubstring) == null) {
                    throw new ass("Unknown namespace prefix for qualified name", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                }
                return;
            }
        }
        throw new ass("Ill-formed qualified name", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
    }

    private static void h(String str) throws ass {
        if (!atb.e(str)) {
            throw new ass("Bad XML name", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        }
    }
}
