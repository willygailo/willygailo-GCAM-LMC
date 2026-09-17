package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class nha implements Iterator, j$.util.Iterator {
    private static final Pattern a;
    private static final Pattern h;
    private final nhd i;
    private final CharSequence j;
    private final String k;
    private final nhc l;
    private long m;
    private static final Pattern b = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    private static final Pattern c = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    private static final Pattern d = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
    private static final Pattern e = Pattern.compile(":[0-5]\\d");
    private static final Pattern[] g = {Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[‒-―－]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")};
    private static final Pattern f = Pattern.compile("(?:[(\\[（［])?(?:[^(\\[（［)\\]）］]+[)\\]）］])?[^(\\[（［)\\]）］]+(?:[(\\[（［][^(\\[（［)\\]）］]+[)\\]）］])" + d(0, 3) + "[^(\\[（［)\\]）］]*");
    private int p = 1;
    private ngz n = null;
    private int o = 0;

    static {
        String strD = d(0, 2);
        String strD2 = d(0, 4);
        String strD3 = d(0, 20);
        String str = "[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]" + strD2;
        String str2 = "\\p{Nd}" + d(1, 20);
        h = Pattern.compile("[(\\[（［+＋]");
        a = Pattern.compile("(?:[(\\[（［+＋]" + str + ")" + strD + str2 + "(?:" + str + str2 + ")" + strD3 + "(?:" + nhd.e + ")?", 66);
    }

    public nha(nhd nhdVar, String str, String str2, nhc nhcVar) {
        new nhm(32);
        if (nhcVar == null) {
            throw null;
        }
        this.i = nhdVar;
        this.j = str == null ? "" : str;
        this.k = str2;
        this.l = nhcVar;
        this.m = Long.MAX_VALUE;
    }

    static boolean a(char c2) {
        if (!Character.isLetter(c2) && Character.getType(c2) != 6) {
            return false;
        }
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(c2);
        return unicodeBlockOf.equals(Character.UnicodeBlock.BASIC_LATIN) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || unicodeBlockOf.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ngz b(CharSequence charSequence, int i) {
        nhf nhfVarE;
        int i2;
        int i3;
        int iE;
        ngz ngzVar = null;
        try {
            if (f.matcher(charSequence).matches() && !b.matcher(charSequence).find()) {
                if (this.l.compareTo(nhc.VALID) >= 0) {
                    if (i > 0 && !h.matcher(charSequence).lookingAt()) {
                        char cCharAt = this.j.charAt(i - 1);
                        if (e(cCharAt) || a(cCharAt)) {
                            return null;
                        }
                    }
                    int length = charSequence.length() + i;
                    if (length < this.j.length()) {
                        char cCharAt2 = this.j.charAt(length);
                        if (e(cCharAt2) || a(cCharAt2)) {
                            return null;
                        }
                    }
                }
                nhi nhiVarH = this.i.h(charSequence, this.k);
                nhc nhcVar = this.l;
                nhd nhdVar = this.i;
                try {
                    switch (nhcVar) {
                        case POSSIBLE:
                            throw null;
                        case VALID:
                            if (!nhdVar.u(nhiVarH)) {
                                return null;
                            }
                            String string = charSequence.toString();
                            int i4 = 0;
                            while (i4 < string.length() - 1) {
                                char cCharAt3 = string.charAt(i4);
                                if (cCharAt3 == 'x' || cCharAt3 == 'X') {
                                    int i5 = i4 + 1;
                                    char cCharAt4 = string.charAt(i5);
                                    if (cCharAt4 == 'x' || cCharAt4 == 'X') {
                                        String strSubstring = string.substring(i5);
                                        try {
                                            iE = nhd.E(nhiVarH, nhdVar.g(strSubstring, "ZZ"));
                                            i2 = i5;
                                            i3 = 4;
                                        } catch (ngy e2) {
                                            if (e2.a != 1) {
                                                return null;
                                            }
                                            String strL = nhdVar.l(nhiVarH.a);
                                            try {
                                                if (strL.equals("ZZ")) {
                                                    nhi nhiVar = new nhi();
                                                    i2 = i5;
                                                    i3 = 4;
                                                    nhdVar.o(strSubstring, null, false, false, nhiVar);
                                                    iE = nhd.E(nhiVarH, nhiVar);
                                                } else {
                                                    iE = nhd.E(nhiVarH, nhdVar.g(strSubstring, strL));
                                                    i2 = i5;
                                                    if (iE != 5) {
                                                        i3 = 4;
                                                    }
                                                    i4 = i2;
                                                    i4++;
                                                    ngzVar = null;
                                                }
                                            } catch (ngy e3) {
                                                return null;
                                            }
                                        }
                                        if (iE != i3) {
                                            return null;
                                        }
                                        i4 = i2;
                                    } else if (!nhd.n(string.substring(i4)).equals(nhiVarH.d)) {
                                        return ngzVar;
                                    }
                                }
                                i4++;
                                ngzVar = null;
                            }
                            try {
                                if (nhiVarH.k == 4 && (nhfVarE = nhdVar.e(nhdVar.l(nhiVarH.a))) != null) {
                                    nhe nheVarD = nhdVar.d(nhfVarE.t, nhdVar.k(nhiVarH));
                                    if (nheVarD != null && nheVarD.d.length() > 0 && !nheVarD.e && !nhd.r(nheVarD.d)) {
                                        try {
                                            if (!nhdVar.x(new StringBuilder(nhd.n(nhiVarH.h)), nhfVarE, null)) {
                                                return null;
                                            }
                                        } catch (ngy e4) {
                                            return null;
                                        }
                                    }
                                }
                                nhiVarH.b();
                                nhiVarH.g = false;
                                nhiVarH.h = "";
                                nhiVarH.i = false;
                                nhiVarH.j = "";
                                return new ngz(i, charSequence.toString(), nhiVarH);
                            } catch (ngy e5) {
                                return null;
                            }
                        case STRICT_GROUPING:
                            throw null;
                        case EXACT_GROUPING:
                            throw null;
                        default:
                            throw null;
                    }
                } catch (ngy e6) {
                    return charSequence;
                }
                return ngzVar;
            }
            return null;
        } catch (ngy e7) {
            return ngzVar;
        }
    }

    private static CharSequence c(Pattern pattern, CharSequence charSequence) {
        Matcher matcher = pattern.matcher(charSequence);
        return matcher.find() ? charSequence.subSequence(0, matcher.start()) : charSequence;
    }

    private static String d(int i, int i2) {
        return "{" + i + "," + i2 + "}";
    }

    private static boolean e(char c2) {
        return c2 == '%' || Character.getType(c2) == 26;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0073  */
    /* JADX WARN: Code duplicated, block: B:19:0x0079  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca A[LOOP:2: B:23:0x0087->B:35:0x00ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00df  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6 A[EDGE_INSN: B:57:0x00d6->B:37:0x00d6 BREAK  A[LOOP:2: B:23:0x0087->B:35:0x00ca], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d4 A[SYNTHETIC] */
    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        ngz ngzVar;
        ngz ngzVarB;
        Matcher matcher;
        Pattern[] patternArr;
        int i;
        Matcher matcher2;
        boolean z;
        ngz ngzVarB2;
        ngz ngzVarB3;
        int i2 = this.p;
        if (i2 == 1) {
            int length = this.o;
            Matcher matcher3 = a.matcher(this.j);
            while (true) {
                ngzVar = null;
                if (this.m > 0 && matcher3.find(length)) {
                    int iStart = matcher3.start();
                    CharSequence charSequenceC = c(nhd.c, this.j.subSequence(iStart, matcher3.end()));
                    if (c.matcher(charSequenceC).find()) {
                        matcher = matcher3;
                    } else if (d.matcher(charSequenceC).find()) {
                        if (e.matcher(this.j.toString().substring(charSequenceC.length() + iStart)).lookingAt()) {
                            matcher = matcher3;
                        } else {
                            ngzVarB = b(charSequenceC, iStart);
                            if (ngzVarB == null) {
                                patternArr = g;
                                int length2 = patternArr.length;
                                i = 0;
                                while (true) {
                                    if (i < 6) {
                                        matcher = matcher3;
                                        break;
                                    }
                                    matcher2 = patternArr[i].matcher(charSequenceC);
                                    z = true;
                                    while (true) {
                                        if (matcher2.find()) {
                                            matcher = matcher3;
                                            break;
                                        }
                                        matcher = matcher3;
                                        if (this.m > 0) {
                                            break;
                                        }
                                        if (z) {
                                            ngzVarB3 = b(c(nhd.d, charSequenceC.subSequence(0, matcher2.start())), iStart);
                                            if (ngzVarB3 != null) {
                                                ngzVar = ngzVarB3;
                                                break;
                                            }
                                            this.m--;
                                            ngzVarB2 = b(c(nhd.d, matcher2.group(1)), matcher2.start(1) + iStart);
                                            if (ngzVarB2 != null) {
                                                ngzVar = ngzVarB2;
                                                break;
                                            }
                                            this.m--;
                                            matcher3 = matcher;
                                            z = false;
                                        } else {
                                            ngzVarB2 = b(c(nhd.d, matcher2.group(1)), matcher2.start(1) + iStart);
                                            if (ngzVarB2 != null) {
                                                ngzVar = ngzVarB2;
                                                break;
                                            }
                                            this.m--;
                                            matcher3 = matcher;
                                            z = false;
                                        }
                                    }
                                    i++;
                                    matcher3 = matcher;
                                }
                            } else {
                                matcher = matcher3;
                                ngzVar = ngzVarB;
                            }
                        }
                    } else {
                        ngzVarB = b(charSequenceC, iStart);
                        if (ngzVarB == null) {
                            patternArr = g;
                            int length3 = patternArr.length;
                            i = 0;
                            while (true) {
                                if (i < 6) {
                                    matcher = matcher3;
                                    break;
                                }
                                matcher2 = patternArr[i].matcher(charSequenceC);
                                z = true;
                                while (true) {
                                    if (matcher2.find()) {
                                        matcher = matcher3;
                                        break;
                                        break;
                                    }
                                    matcher = matcher3;
                                    if (this.m > 0) {
                                        break;
                                        break;
                                    }
                                    if (z) {
                                        ngzVarB2 = b(c(nhd.d, matcher2.group(1)), matcher2.start(1) + iStart);
                                        if (ngzVarB2 != null) {
                                            ngzVar = ngzVarB2;
                                            break;
                                        }
                                        this.m--;
                                        matcher3 = matcher;
                                        z = false;
                                    } else {
                                        ngzVarB3 = b(c(nhd.d, charSequenceC.subSequence(0, matcher2.start())), iStart);
                                        if (ngzVarB3 != null) {
                                            ngzVar = ngzVarB3;
                                            break;
                                        }
                                        this.m--;
                                        ngzVarB2 = b(c(nhd.d, matcher2.group(1)), matcher2.start(1) + iStart);
                                        if (ngzVarB2 != null) {
                                            ngzVar = ngzVarB2;
                                            break;
                                        }
                                        this.m--;
                                        matcher3 = matcher;
                                        z = false;
                                    }
                                }
                                i++;
                                matcher3 = matcher;
                            }
                        } else {
                            matcher = matcher3;
                            ngzVar = ngzVarB;
                        }
                    }
                    if (ngzVar != null) {
                        break;
                    }
                    length = iStart + charSequenceC.length();
                    this.m--;
                    matcher3 = matcher;
                } else {
                    break;
                }
            }
            this.n = ngzVar;
            if (ngzVar != null) {
                this.o = ngzVar.a();
                this.p = 2;
                return true;
            }
            this.p = 3;
        } else if (i2 == 2) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ngz ngzVar = this.n;
        this.n = null;
        this.p = 1;
        return ngzVar;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
