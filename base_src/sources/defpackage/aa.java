package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class aa implements Cloneable {
    public static final int[] e;
    private static final int h;
    public String a;
    public ArrayList b;
    public ArrayList c;
    public boolean d;
    public final int f;
    private boolean g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    static {
        int i = 1;
        switch (b.a()) {
            case "DOUBLE_OPTIONAL":
                break;
            case "DOUBLE_REQUIRED":
                i = 2;
                break;
            default:
                throw new IllegalArgumentException();
        }
        h = i;
        e = new int[]{1, 2, 3, 4, 5, 6};
    }

    public aa() {
        this.b = new ArrayList();
        throw null;
    }

    public aa(String str) {
        this.b = new ArrayList();
        this.f = h;
        i(str);
    }

    private final int j(int i) {
        char cCharAt;
        while (i < this.a.length() && (((cCharAt = this.a.charAt(i)) >= '0' || "+-.".indexOf(cCharAt) >= 0) && (cCharAt <= '9' || cCharAt == 'e' || cCharAt == 'E' || cCharAt == 8734))) {
            i++;
        }
        return i;
    }

    private final int k(int i) {
        String str = this.a;
        byte[] bArr = e.a;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 255) {
                if (cCharAt >= 8206) {
                    if (cCharAt > 12336) {
                        if (cCharAt >= 64830 && cCharAt <= 65094 && (cCharAt <= 64831 || cCharAt >= 65093)) {
                            break;
                        }
                    } else if (((e.c[e.b[(cCharAt - 8192) >> 5]] >> (cCharAt & 31)) & 1) != 0) {
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                if (e.a[cCharAt] != 0) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    private final int l(int i) {
        String str = this.a;
        byte[] bArr = e.a;
        while (i < str.length() && e.a(str.charAt(i))) {
            i++;
        }
        return i;
    }

    private final String m() {
        return o(this.a, 0);
    }

    private final String n(int i) {
        return o(this.a, i);
    }

    private static String o(String str, int i) {
        StringBuilder sb = new StringBuilder(44);
        if (i == 0) {
            sb.append("\"");
        } else {
            sb.append("[at pattern index ");
            sb.append(i);
            sb.append("] \"");
        }
        if (str.length() - i <= 24) {
            if (i != 0) {
                str = str.substring(i);
            }
            sb.append(str);
        } else {
            int i2 = i + 20;
            int i3 = i2 - 1;
            if (true == Character.isHighSurrogate(str.charAt(i3))) {
                i2 = i3;
            }
            sb.append((CharSequence) str, i, i2);
            sb.append(" ...");
        }
        sb.append("\"");
        return sb.toString();
    }

    private final void p(double d, int i, int i2) {
        int size;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            this.c = new ArrayList();
            size = 0;
        } else {
            size = arrayList.size();
            if (size > 32767) {
                throw new IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.c.add(Double.valueOf(d));
        v(14, i, i2, size);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[LOOP:0: B:27:0x0068->B:40:0x0087, LOOP_START, PHI: r0 r1 r2
      0x0068: PHI (r0v6 int) = (r0v5 int), (r0v8 int) binds: [B:13:0x0034, B:40:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r1v5 char) = (r1v4 char), (r1v8 char) binds: [B:13:0x0034, B:40:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r2v1 int) = (r2v0 int), (r2v3 int) binds: [B:13:0x0034, B:40:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:28:0x006a
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private final void q(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            int r0 = r8 + 1
            java.lang.String r1 = r7.a
            char r1 = r1.charAt(r8)
            r2 = 0
            r3 = 1
            r4 = 45
            if (r1 != r4) goto L1e
            if (r0 != r9) goto L11
            goto L46
        L11:
            int r1 = r0 + 1
            java.lang.String r4 = r7.a
            char r0 = r4.charAt(r0)
            r4 = 1
            r6 = r1
            r1 = r0
            r0 = r6
            goto L32
        L1e:
            r4 = 43
            if (r1 != r4) goto L31
            if (r0 == r9) goto L46
            int r1 = r0 + 1
            java.lang.String r4 = r7.a
            char r0 = r4.charAt(r0)
            r4 = 0
            r6 = r1
            r1 = r0
            r0 = r6
            goto L32
        L31:
            r4 = 0
        L32:
            r5 = 8734(0x221e, float:1.2239E-41)
            if (r1 != r5) goto L68
            if (r10 == 0) goto L46
            if (r0 != r9) goto L46
            if (r3 == r4) goto L3f
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L41
        L3f:
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
        L41:
            int r9 = r9 - r8
            r7.p(r0, r8, r9)
            return
        L46:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.String r0 = r7.a
            java.lang.String r8 = r0.substring(r8, r9)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "Bad syntax for numeric value: "
            int r0 = r8.length()
            if (r0 == 0) goto L5f
            java.lang.String r8 = r9.concat(r8)
            goto L64
        L5f:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r9)
        L64:
            r10.<init>(r8)
            throw r10
        L68:
            r10 = 48
            if (r1 < r10) goto L91
            r10 = 57
            if (r1 > r10) goto L91
            int r2 = r2 * 10
            int r1 = r1 + (-48)
            int r2 = r2 + r1
            int r10 = r4 + 32767
            if (r2 <= r10) goto L7a
            goto L91
        L7a:
            if (r0 != r9) goto L87
            int r9 = r9 - r8
            if (r4 == 0) goto L81
            int r2 = -r2
            goto L81
        L81:
            r10 = 13
            r7.v(r10, r8, r9, r2)
            return
        L87:
            int r10 = r0 + 1
            java.lang.String r1 = r7.a
            char r1 = r1.charAt(r0)
            r0 = r10
            goto L68
        L91:
            java.lang.String r10 = r7.a
            java.lang.String r10 = r10.substring(r8, r9)
            double r0 = java.lang.Double.parseDouble(r10)
            int r9 = r9 - r8
            r7.p(r0, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa.q(int, int, boolean):void");
    }

    private final boolean r(int i) {
        return i > 0 || ((z) this.b.get(0)).e == 1;
    }

    private final boolean s(int i) {
        int i2 = i + 1;
        char cCharAt = this.a.charAt(i);
        if (cCharAt != 's' && cCharAt != 'S') {
            return false;
        }
        int i3 = i2 + 1;
        char cCharAt2 = this.a.charAt(i2);
        if (cCharAt2 != 'e' && cCharAt2 != 'E') {
            return false;
        }
        int i4 = i3 + 1;
        char cCharAt3 = this.a.charAt(i3);
        if (cCharAt3 != 'l' && cCharAt3 != 'L') {
            return false;
        }
        int i5 = i4 + 1;
        char cCharAt4 = this.a.charAt(i4);
        if (cCharAt4 != 'e' && cCharAt4 != 'E') {
            return false;
        }
        int i6 = i5 + 1;
        char cCharAt5 = this.a.charAt(i5);
        if (cCharAt5 != 'c' && cCharAt5 != 'C') {
            return false;
        }
        char cCharAt6 = this.a.charAt(i6);
        return cCharAt6 == 't' || cCharAt6 == 'T';
    }

    /* JADX WARN: Code duplicated, block: B:182:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:184:0x0301  */
    /* JADX WARN: Code duplicated, block: B:186:0x0305  */
    /* JADX WARN: Code duplicated, block: B:188:0x030f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0313  */
    /* JADX WARN: Code duplicated, block: B:192:0x031f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0323  */
    /* JADX WARN: Code duplicated, block: B:196:0x032f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0333  */
    /* JADX WARN: Code duplicated, block: B:200:0x033f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0343  */
    /* JADX WARN: Code duplicated, block: B:207:0x0350  */
    /* JADX WARN: Code duplicated, block: B:209:0x0356  */
    /* JADX WARN: Code duplicated, block: B:210:0x0359  */
    /* JADX WARN: Code duplicated, block: B:246:0x03dc  */
    private final int t(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iL;
        int i10;
        char cCharAt;
        int iL2;
        boolean z;
        int iK;
        int iT;
        char cCharAt2;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        char cCharAt7;
        char cCharAt8;
        char cCharAt9;
        int i14 = i4;
        if (i3 > 32767) {
            throw new IndexOutOfBoundsException();
        }
        int size = this.b.size();
        boolean z2 = true;
        v(1, i, i2, i3);
        int i15 = i + i2;
        while (true) {
            if (i15 >= this.a.length()) {
                if (i3 <= 0 || (i3 == 1 && i14 == 3 && ((z) this.b.get(0)).e != 1)) {
                    u(size, 2, i15, 0, i3);
                    return i15;
                }
                String strValueOf = String.valueOf(m());
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unmatched '{' braces in message ".concat(strValueOf) : new String("Unmatched '{' braces in message "));
            }
            int i16 = i15 + 1;
            char cCharAt10 = this.a.charAt(i15);
            if (cCharAt10 == '\'') {
                if (i16 != this.a.length()) {
                    char cCharAt11 = this.a.charAt(i16);
                    if (cCharAt11 != '\'') {
                        if (this.f != 2 && cCharAt11 != '{' && cCharAt11 != '}') {
                            if (i14 != 3) {
                                i5 = i14;
                            } else if (cCharAt11 != '|') {
                                i5 = 3;
                            }
                            if (!d.b(i5) || cCharAt11 != '#') {
                                v(4, i16, 0, 39);
                            }
                        }
                        v(3, i16 - 1, z2 ? 1 : 0, 0);
                        while (true) {
                            int iIndexOf = this.a.indexOf(39, i16 + (z2 ? 1 : 0));
                            if (iIndexOf < 0) {
                                int length = this.a.length();
                                v(4, length, 0, 39);
                                i15 = length;
                                break;
                            }
                            i16 = iIndexOf + 1;
                            if (i16 >= this.a.length() || this.a.charAt(i16) != '\'') {
                                v(3, iIndexOf, z2 ? 1 : 0, 0);
                                i15 = i16;
                                break;
                            }
                            v(3, i16, z2 ? 1 : 0, 0);
                        }
                    } else {
                        i15 = i16 + 1;
                        v(3, i16, z2 ? 1 : 0, 0);
                    }
                } else {
                    v(4, i16, 0, 39);
                }
                i15 = i16;
                z2 = true;
            } else {
                if (d.b(i4) && cCharAt10 == '#') {
                    v(5, i16 - 1, z2 ? 1 : 0, 0);
                } else {
                    if (cCharAt10 != '{') {
                        if (i3 <= 0 || cCharAt10 != '}') {
                            i6 = 3;
                            if (i14 == 3 && cCharAt10 == '|') {
                                i14 = 3;
                            }
                        } else {
                            cCharAt10 = '}';
                            i6 = 3;
                        }
                        int i17 = i16 - 1;
                        u(size, 2, i17, (i14 == i6 && cCharAt10 == '}') ? 0 : 1, i3);
                        return i14 == 3 ? i17 : i16;
                    }
                    int i18 = i16 - 1;
                    int size2 = this.b.size();
                    v(6, i18, z2 ? 1 : 0, 0);
                    int iL3 = l(i18 + (z2 ? 1 : 0));
                    if (iL3 == this.a.length()) {
                        String strValueOf2 = String.valueOf(m());
                        throw new IllegalArgumentException(strValueOf2.length() != 0 ? "Unmatched '{' braces in message ".concat(strValueOf2) : new String("Unmatched '{' braces in message "));
                    }
                    int iK2 = k(iL3);
                    String str = this.a;
                    if (iL3 < iK2) {
                        int i19 = iL3 + 1;
                        char cCharAt12 = str.charAt(iL3);
                        if (cCharAt12 == '0') {
                            if (i19 == iK2) {
                                i9 = 0;
                            } else {
                                i8 = 1;
                                i7 = 0;
                            }
                        } else {
                            if (cCharAt12 < '1' || cCharAt12 > '9') {
                                i9 = -1;
                                break;
                            }
                            i7 = cCharAt12 - '0';
                            i8 = 0;
                        }
                        while (true) {
                            if (i19 >= iK2) {
                                if (i8 == 0) {
                                    i9 = i7;
                                    break;
                                }
                                i9 = -2;
                                break;
                            }
                            int i20 = i19 + 1;
                            char cCharAt13 = str.charAt(i19);
                            if (cCharAt13 < '0' || cCharAt13 > '9') {
                                i9 = -1;
                                break;
                            }
                            i8 |= (i7 >= 214748364 ? 0 : 1) ^ (z2 ? 1 : 0);
                            i7 = (i7 * 10) + (cCharAt13 - '0');
                            i19 = i20;
                        }
                    } else {
                        i9 = -2;
                    }
                    if (i9 >= 0) {
                        int i21 = iK2 - iL3;
                        if (i21 > 65535 || i9 > 32767) {
                            String strValueOf3 = String.valueOf(n(iL3));
                            throw new IndexOutOfBoundsException(strValueOf3.length() != 0 ? "Argument number too large: ".concat(strValueOf3) : new String("Argument number too large: "));
                        }
                        v(8, iL3, i21, i9);
                    } else {
                        if (i9 != -1) {
                            String strValueOf4 = String.valueOf(n(iL3));
                            throw new IllegalArgumentException(strValueOf4.length() != 0 ? "Bad argument syntax: ".concat(strValueOf4) : new String("Bad argument syntax: "));
                        }
                        int i22 = iK2 - iL3;
                        if (i22 > 65535) {
                            String strValueOf5 = String.valueOf(n(iL3));
                            throw new IndexOutOfBoundsException(strValueOf5.length() != 0 ? "Argument name too long: ".concat(strValueOf5) : new String("Argument name too long: "));
                        }
                        this.d = z2;
                        v(9, iL3, i22, 0);
                    }
                    int iL4 = l(iK2);
                    if (iL4 == this.a.length()) {
                        String strValueOf6 = String.valueOf(m());
                        throw new IllegalArgumentException(strValueOf6.length() != 0 ? "Unmatched '{' braces in message ".concat(strValueOf6) : new String("Unmatched '{' braces in message "));
                    }
                    char cCharAt14 = this.a.charAt(iL4);
                    if (cCharAt14 != '}') {
                        if (cCharAt14 != ',') {
                            String strValueOf7 = String.valueOf(n(iL3));
                            throw new IllegalArgumentException(strValueOf7.length() != 0 ? "Bad argument syntax: ".concat(strValueOf7) : new String("Bad argument syntax: "));
                        }
                        int iL5 = l(iL4 + 1);
                        int i23 = iL5;
                        while (i23 < this.a.length() && (((cCharAt9 = this.a.charAt(i23)) >= 'a' && cCharAt9 <= 'z') || (cCharAt9 >= 'A' && cCharAt9 <= 'Z'))) {
                            i23++;
                        }
                        int i24 = i23 - iL5;
                        iL = l(i23);
                        if (iL == this.a.length()) {
                            String strValueOf8 = String.valueOf(m());
                            throw new IllegalArgumentException(strValueOf8.length() != 0 ? "Unmatched '{' braces in message ".concat(strValueOf8) : new String("Unmatched '{' braces in message "));
                        }
                        if (i24 != 0) {
                            char cCharAt15 = this.a.charAt(iL);
                            if (cCharAt15 != ',') {
                                if (cCharAt15 == '}') {
                                    cCharAt15 = '}';
                                }
                            }
                            if (i24 > 65535) {
                                String strValueOf9 = String.valueOf(n(iL3));
                                throw new IndexOutOfBoundsException(strValueOf9.length() != 0 ? "Argument type name too long: ".concat(strValueOf9) : new String("Argument type name too long: "));
                            }
                            if (i24 == 6) {
                                int i25 = iL5 + 1;
                                char cCharAt16 = this.a.charAt(iL5);
                                if (cCharAt16 == 'c' || cCharAt16 == 'C') {
                                    int i26 = i25 + 1;
                                    char cCharAt17 = this.a.charAt(i25);
                                    if (cCharAt17 == 'h' || cCharAt17 == 'H') {
                                        int i27 = i26 + 1;
                                        char cCharAt18 = this.a.charAt(i26);
                                        if (cCharAt18 == 'o' || cCharAt18 == 'O') {
                                            int i28 = i27 + 1;
                                            char cCharAt19 = this.a.charAt(i27);
                                            if (cCharAt19 == 'i' || cCharAt19 == 'I') {
                                                int i29 = i28 + 1;
                                                char cCharAt20 = this.a.charAt(i28);
                                                if ((cCharAt20 == 'c' || cCharAt20 == 'C') && ((cCharAt2 = this.a.charAt(i29)) == 'e' || cCharAt2 == 'E')) {
                                                    i10 = 3;
                                                } else {
                                                    cCharAt3 = this.a.charAt(iL5);
                                                    if (cCharAt3 != 'p' || cCharAt3 == 'P') {
                                                        i11 = i25 + 1;
                                                        cCharAt4 = this.a.charAt(i25);
                                                        if (cCharAt4 != 'l' || cCharAt4 == 'L') {
                                                            i12 = i11 + 1;
                                                            cCharAt5 = this.a.charAt(i11);
                                                            if (cCharAt5 != 'u' || cCharAt5 == 'U') {
                                                                i13 = i12 + 1;
                                                                cCharAt6 = this.a.charAt(i12);
                                                                if (cCharAt6 != 'r' || cCharAt6 == 'R') {
                                                                    int i30 = i13 + 1;
                                                                    cCharAt7 = this.a.charAt(i13);
                                                                    if ((cCharAt7 == 'a' && cCharAt7 != 'A') || ((cCharAt8 = this.a.charAt(i30)) != 'l' && cCharAt8 != 'L')) {
                                                                        if (s(iL5)) {
                                                                            i10 = 5;
                                                                        } else {
                                                                            i10 = 2;
                                                                        }
                                                                    }
                                                                } else if (s(iL5)) {
                                                                    i10 = 5;
                                                                } else {
                                                                    i10 = 2;
                                                                }
                                                            } else if (s(iL5)) {
                                                                i10 = 5;
                                                            } else {
                                                                i10 = 2;
                                                            }
                                                        } else if (s(iL5)) {
                                                            i10 = 5;
                                                        } else {
                                                            i10 = 2;
                                                        }
                                                    } else if (s(iL5)) {
                                                        i10 = 5;
                                                    } else {
                                                        i10 = 2;
                                                    }
                                                }
                                            } else {
                                                cCharAt3 = this.a.charAt(iL5);
                                                if (cCharAt3 != 'p') {
                                                    i11 = i25 + 1;
                                                    cCharAt4 = this.a.charAt(i25);
                                                    if (cCharAt4 != 'l') {
                                                        i12 = i11 + 1;
                                                        cCharAt5 = this.a.charAt(i11);
                                                        if (cCharAt5 != 'u') {
                                                            i13 = i12 + 1;
                                                            cCharAt6 = this.a.charAt(i12);
                                                            if (cCharAt6 != 'r') {
                                                                int i31 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                i10 = cCharAt7 == 'a' ? 4 : 4;
                                                            } else {
                                                                int i32 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                if (cCharAt7 == 'a') {
                                                                }
                                                            }
                                                        } else {
                                                            i13 = i12 + 1;
                                                            cCharAt6 = this.a.charAt(i12);
                                                            if (cCharAt6 != 'r') {
                                                                int i33 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                if (cCharAt7 == 'a') {
                                                                }
                                                            } else {
                                                                int i34 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                if (cCharAt7 == 'a') {
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i12 = i11 + 1;
                                                        cCharAt5 = this.a.charAt(i11);
                                                        if (cCharAt5 != 'u') {
                                                            i13 = i12 + 1;
                                                            cCharAt6 = this.a.charAt(i12);
                                                            if (cCharAt6 != 'r') {
                                                                int i35 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                if (cCharAt7 == 'a') {
                                                                }
                                                            } else {
                                                                int i36 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                if (cCharAt7 == 'a') {
                                                                }
                                                            }
                                                        } else {
                                                            i13 = i12 + 1;
                                                            cCharAt6 = this.a.charAt(i12);
                                                            if (cCharAt6 != 'r') {
                                                                int i37 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                if (cCharAt7 == 'a') {
                                                                }
                                                            } else {
                                                                int i38 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                if (cCharAt7 == 'a') {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i11 = i25 + 1;
                                                    cCharAt4 = this.a.charAt(i25);
                                                    if (cCharAt4 != 'l') {
                                                        i12 = i11 + 1;
                                                        cCharAt5 = this.a.charAt(i11);
                                                        if (cCharAt5 != 'u') {
                                                            i13 = i12 + 1;
                                                            cCharAt6 = this.a.charAt(i12);
                                                            if (cCharAt6 != 'r') {
                                                                int i39 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                if (cCharAt7 == 'a') {
                                                                }
                                                            } else {
                                                                int i310 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                if (cCharAt7 == 'a') {
                                                                }
                                                            }
                                                        } else {
                                                            i13 = i12 + 1;
                                                            cCharAt6 = this.a.charAt(i12);
                                                            if (cCharAt6 != 'r') {
                                                                int i311 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                if (cCharAt7 == 'a') {
                                                                }
                                                            } else {
                                                                int i312 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                if (cCharAt7 == 'a') {
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i12 = i11 + 1;
                                                        cCharAt5 = this.a.charAt(i11);
                                                        if (cCharAt5 != 'u') {
                                                            i13 = i12 + 1;
                                                            cCharAt6 = this.a.charAt(i12);
                                                            if (cCharAt6 != 'r') {
                                                                int i313 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                if (cCharAt7 == 'a') {
                                                                }
                                                            } else {
                                                                int i314 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                if (cCharAt7 == 'a') {
                                                                }
                                                            }
                                                        } else {
                                                            i13 = i12 + 1;
                                                            cCharAt6 = this.a.charAt(i12);
                                                            if (cCharAt6 != 'r') {
                                                                int i315 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                if (cCharAt7 == 'a') {
                                                                }
                                                            } else {
                                                                int i316 = i13 + 1;
                                                                cCharAt7 = this.a.charAt(i13);
                                                                if (cCharAt7 == 'a') {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            cCharAt3 = this.a.charAt(iL5);
                                            if (cCharAt3 != 'p') {
                                                i11 = i25 + 1;
                                                cCharAt4 = this.a.charAt(i25);
                                                if (cCharAt4 != 'l') {
                                                    i12 = i11 + 1;
                                                    cCharAt5 = this.a.charAt(i11);
                                                    if (cCharAt5 != 'u') {
                                                        i13 = i12 + 1;
                                                        cCharAt6 = this.a.charAt(i12);
                                                        if (cCharAt6 != 'r') {
                                                            int i317 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        } else {
                                                            int i318 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        }
                                                    } else {
                                                        i13 = i12 + 1;
                                                        cCharAt6 = this.a.charAt(i12);
                                                        if (cCharAt6 != 'r') {
                                                            int i319 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        } else {
                                                            int i3110 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i12 = i11 + 1;
                                                    cCharAt5 = this.a.charAt(i11);
                                                    if (cCharAt5 != 'u') {
                                                        i13 = i12 + 1;
                                                        cCharAt6 = this.a.charAt(i12);
                                                        if (cCharAt6 != 'r') {
                                                            int i3111 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        } else {
                                                            int i3112 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        }
                                                    } else {
                                                        i13 = i12 + 1;
                                                        cCharAt6 = this.a.charAt(i12);
                                                        if (cCharAt6 != 'r') {
                                                            int i3113 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        } else {
                                                            int i3114 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                i11 = i25 + 1;
                                                cCharAt4 = this.a.charAt(i25);
                                                if (cCharAt4 != 'l') {
                                                    i12 = i11 + 1;
                                                    cCharAt5 = this.a.charAt(i11);
                                                    if (cCharAt5 != 'u') {
                                                        i13 = i12 + 1;
                                                        cCharAt6 = this.a.charAt(i12);
                                                        if (cCharAt6 != 'r') {
                                                            int i3115 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        } else {
                                                            int i3116 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        }
                                                    } else {
                                                        i13 = i12 + 1;
                                                        cCharAt6 = this.a.charAt(i12);
                                                        if (cCharAt6 != 'r') {
                                                            int i3117 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        } else {
                                                            int i3118 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i12 = i11 + 1;
                                                    cCharAt5 = this.a.charAt(i11);
                                                    if (cCharAt5 != 'u') {
                                                        i13 = i12 + 1;
                                                        cCharAt6 = this.a.charAt(i12);
                                                        if (cCharAt6 != 'r') {
                                                            int i3119 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        } else {
                                                            int i31110 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        }
                                                    } else {
                                                        i13 = i12 + 1;
                                                        cCharAt6 = this.a.charAt(i12);
                                                        if (cCharAt6 != 'r') {
                                                            int i31111 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        } else {
                                                            int i31112 = i13 + 1;
                                                            cCharAt7 = this.a.charAt(i13);
                                                            if (cCharAt7 == 'a') {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        cCharAt3 = this.a.charAt(iL5);
                                        if (cCharAt3 != 'p') {
                                            i11 = i25 + 1;
                                            cCharAt4 = this.a.charAt(i25);
                                            if (cCharAt4 != 'l') {
                                                i12 = i11 + 1;
                                                cCharAt5 = this.a.charAt(i11);
                                                if (cCharAt5 != 'u') {
                                                    i13 = i12 + 1;
                                                    cCharAt6 = this.a.charAt(i12);
                                                    if (cCharAt6 != 'r') {
                                                        int i31113 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    } else {
                                                        int i31114 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    }
                                                } else {
                                                    i13 = i12 + 1;
                                                    cCharAt6 = this.a.charAt(i12);
                                                    if (cCharAt6 != 'r') {
                                                        int i31115 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    } else {
                                                        int i31116 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    }
                                                }
                                            } else {
                                                i12 = i11 + 1;
                                                cCharAt5 = this.a.charAt(i11);
                                                if (cCharAt5 != 'u') {
                                                    i13 = i12 + 1;
                                                    cCharAt6 = this.a.charAt(i12);
                                                    if (cCharAt6 != 'r') {
                                                        int i31117 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    } else {
                                                        int i31118 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    }
                                                } else {
                                                    i13 = i12 + 1;
                                                    cCharAt6 = this.a.charAt(i12);
                                                    if (cCharAt6 != 'r') {
                                                        int i31119 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    } else {
                                                        int i311110 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            i11 = i25 + 1;
                                            cCharAt4 = this.a.charAt(i25);
                                            if (cCharAt4 != 'l') {
                                                i12 = i11 + 1;
                                                cCharAt5 = this.a.charAt(i11);
                                                if (cCharAt5 != 'u') {
                                                    i13 = i12 + 1;
                                                    cCharAt6 = this.a.charAt(i12);
                                                    if (cCharAt6 != 'r') {
                                                        int i311111 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    } else {
                                                        int i311112 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    }
                                                } else {
                                                    i13 = i12 + 1;
                                                    cCharAt6 = this.a.charAt(i12);
                                                    if (cCharAt6 != 'r') {
                                                        int i311113 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    } else {
                                                        int i311114 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    }
                                                }
                                            } else {
                                                i12 = i11 + 1;
                                                cCharAt5 = this.a.charAt(i11);
                                                if (cCharAt5 != 'u') {
                                                    i13 = i12 + 1;
                                                    cCharAt6 = this.a.charAt(i12);
                                                    if (cCharAt6 != 'r') {
                                                        int i311115 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    } else {
                                                        int i311116 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    }
                                                } else {
                                                    i13 = i12 + 1;
                                                    cCharAt6 = this.a.charAt(i12);
                                                    if (cCharAt6 != 'r') {
                                                        int i311117 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    } else {
                                                        int i311118 = i13 + 1;
                                                        cCharAt7 = this.a.charAt(i13);
                                                        if (cCharAt7 == 'a') {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    cCharAt3 = this.a.charAt(iL5);
                                    if (cCharAt3 != 'p') {
                                        i11 = i25 + 1;
                                        cCharAt4 = this.a.charAt(i25);
                                        if (cCharAt4 != 'l') {
                                            i12 = i11 + 1;
                                            cCharAt5 = this.a.charAt(i11);
                                            if (cCharAt5 != 'u') {
                                                i13 = i12 + 1;
                                                cCharAt6 = this.a.charAt(i12);
                                                if (cCharAt6 != 'r') {
                                                    int i311119 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                } else {
                                                    int i3111110 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                }
                                            } else {
                                                i13 = i12 + 1;
                                                cCharAt6 = this.a.charAt(i12);
                                                if (cCharAt6 != 'r') {
                                                    int i3111111 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                } else {
                                                    int i3111112 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                }
                                            }
                                        } else {
                                            i12 = i11 + 1;
                                            cCharAt5 = this.a.charAt(i11);
                                            if (cCharAt5 != 'u') {
                                                i13 = i12 + 1;
                                                cCharAt6 = this.a.charAt(i12);
                                                if (cCharAt6 != 'r') {
                                                    int i3111113 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                } else {
                                                    int i3111114 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                }
                                            } else {
                                                i13 = i12 + 1;
                                                cCharAt6 = this.a.charAt(i12);
                                                if (cCharAt6 != 'r') {
                                                    int i3111115 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                } else {
                                                    int i3111116 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i11 = i25 + 1;
                                        cCharAt4 = this.a.charAt(i25);
                                        if (cCharAt4 != 'l') {
                                            i12 = i11 + 1;
                                            cCharAt5 = this.a.charAt(i11);
                                            if (cCharAt5 != 'u') {
                                                i13 = i12 + 1;
                                                cCharAt6 = this.a.charAt(i12);
                                                if (cCharAt6 != 'r') {
                                                    int i3111117 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                } else {
                                                    int i3111118 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                }
                                            } else {
                                                i13 = i12 + 1;
                                                cCharAt6 = this.a.charAt(i12);
                                                if (cCharAt6 != 'r') {
                                                    int i3111119 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                } else {
                                                    int i31111110 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                }
                                            }
                                        } else {
                                            i12 = i11 + 1;
                                            cCharAt5 = this.a.charAt(i11);
                                            if (cCharAt5 != 'u') {
                                                i13 = i12 + 1;
                                                cCharAt6 = this.a.charAt(i12);
                                                if (cCharAt6 != 'r') {
                                                    int i31111111 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                } else {
                                                    int i31111112 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                }
                                            } else {
                                                i13 = i12 + 1;
                                                cCharAt6 = this.a.charAt(i12);
                                                if (cCharAt6 != 'r') {
                                                    int i31111113 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                } else {
                                                    int i31111114 = i13 + 1;
                                                    cCharAt7 = this.a.charAt(i13);
                                                    if (cCharAt7 == 'a') {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (i24 == 13) {
                                if (s(iL5)) {
                                    int i40 = iL5 + 6;
                                    int i41 = i40 + 1;
                                    char cCharAt21 = this.a.charAt(i40);
                                    if (cCharAt21 == 'o' || cCharAt21 == 'O') {
                                        int i42 = i41 + 1;
                                        char cCharAt22 = this.a.charAt(i41);
                                        if (cCharAt22 == 'r' || cCharAt22 == 'R') {
                                            int i43 = i42 + 1;
                                            char cCharAt23 = this.a.charAt(i42);
                                            if (cCharAt23 == 'd' || cCharAt23 == 'D') {
                                                int i44 = i43 + 1;
                                                char cCharAt24 = this.a.charAt(i43);
                                                if (cCharAt24 == 'i' || cCharAt24 == 'I') {
                                                    int i45 = i44 + 1;
                                                    char cCharAt25 = this.a.charAt(i44);
                                                    if (cCharAt25 == 'n' || cCharAt25 == 'N') {
                                                        int i46 = i45 + 1;
                                                        char cCharAt26 = this.a.charAt(i45);
                                                        if ((cCharAt26 == 'a' || cCharAt26 == 'A') && ((cCharAt = this.a.charAt(i46)) == 'l' || cCharAt == 'L')) {
                                                            i10 = 6;
                                                        } else {
                                                            i10 = 2;
                                                        }
                                                    } else {
                                                        i10 = 2;
                                                    }
                                                } else {
                                                    i10 = 2;
                                                }
                                            } else {
                                                i10 = 2;
                                            }
                                        } else {
                                            i10 = 2;
                                        }
                                    } else {
                                        i10 = 2;
                                    }
                                } else {
                                    i10 = 2;
                                }
                                i24 = 13;
                            } else {
                                i10 = 2;
                            }
                            ((z) this.b.get(size2)).c = (short) (i10 - 1);
                            if (i10 == 2) {
                                v(10, iL5, i24, 0);
                            }
                            if (cCharAt15 != '}') {
                                int i47 = iL + 1;
                                if (i10 == 2) {
                                    int i48 = i47;
                                    int i49 = 0;
                                    while (true) {
                                        if (i48 >= this.a.length()) {
                                            String strValueOf10 = String.valueOf(m());
                                            throw new IllegalArgumentException(strValueOf10.length() != 0 ? "Unmatched '{' braces in message ".concat(strValueOf10) : new String("Unmatched '{' braces in message "));
                                        }
                                        int i50 = i48 + 1;
                                        char cCharAt27 = this.a.charAt(i48);
                                        if (cCharAt27 == '\'') {
                                            int iIndexOf2 = this.a.indexOf(39, i50);
                                            if (iIndexOf2 < 0) {
                                                String strValueOf11 = String.valueOf(n(i47));
                                                throw new IllegalArgumentException(strValueOf11.length() != 0 ? "Quoted literal argument style text reaches to the end of the message: ".concat(strValueOf11) : new String("Quoted literal argument style text reaches to the end of the message: "));
                                            }
                                            i48 = iIndexOf2 + 1;
                                        } else {
                                            if (cCharAt27 == '{') {
                                                i49++;
                                            } else if (cCharAt27 != '}') {
                                                i48 = i50;
                                            } else {
                                                if (i49 <= 0) {
                                                    int i51 = i50 - 1;
                                                    int i52 = i51 - i47;
                                                    if (i52 <= 65535) {
                                                        v(11, i47, i52, 0);
                                                        iL = i51;
                                                        break;
                                                    }
                                                    String strValueOf12 = String.valueOf(n(i47));
                                                    throw new IndexOutOfBoundsException(strValueOf12.length() != 0 ? "Argument style text too long: ".concat(strValueOf12) : new String("Argument style text too long: "));
                                                }
                                                i49--;
                                            }
                                            i48 = i50;
                                        }
                                    }
                                } else if (i10 == 3) {
                                    int iL6 = l(i47);
                                    if (iL6 == this.a.length() || this.a.charAt(iL6) == '}') {
                                        String strValueOf13 = String.valueOf(m());
                                        throw new IllegalArgumentException(strValueOf13.length() != 0 ? "Missing choice argument pattern in ".concat(strValueOf13) : new String("Missing choice argument pattern in "));
                                    }
                                    while (true) {
                                        int iJ = j(iL6);
                                        int i53 = iJ - iL6;
                                        if (i53 == 0) {
                                            String strValueOf14 = String.valueOf(n(i47));
                                            throw new IllegalArgumentException(strValueOf14.length() != 0 ? "Bad choice pattern syntax: ".concat(strValueOf14) : new String("Bad choice pattern syntax: "));
                                        }
                                        if (i53 > 65535) {
                                            String strValueOf15 = String.valueOf(n(iL6));
                                            throw new IndexOutOfBoundsException(strValueOf15.length() != 0 ? "Choice number too long: ".concat(strValueOf15) : new String("Choice number too long: "));
                                        }
                                        q(iL6, iJ, true);
                                        int iL7 = l(iJ);
                                        if (iL7 == this.a.length()) {
                                            String strValueOf16 = String.valueOf(n(i47));
                                            throw new IllegalArgumentException(strValueOf16.length() != 0 ? "Bad choice pattern syntax: ".concat(strValueOf16) : new String("Bad choice pattern syntax: "));
                                        }
                                        char cCharAt28 = this.a.charAt(iL7);
                                        if (cCharAt28 != '#' && cCharAt28 != '<' && cCharAt28 != 8804) {
                                            String strN = n(i47);
                                            StringBuilder sb = new StringBuilder(String.valueOf(strN).length() + 65);
                                            sb.append("Expected choice separator (#<≤) instead of '");
                                            sb.append(cCharAt28);
                                            sb.append("' in choice pattern ");
                                            sb.append(strN);
                                            throw new IllegalArgumentException(sb.toString());
                                        }
                                        v(12, iL7, 1, 0);
                                        iT = t(iL7 + 1, 0, i3 + 1, 3);
                                        if (iT == this.a.length()) {
                                            break;
                                        }
                                        if (this.a.charAt(iT) == '}') {
                                            if (r(i3)) {
                                                break;
                                            }
                                            String strValueOf17 = String.valueOf(n(i47));
                                            throw new IllegalArgumentException(strValueOf17.length() != 0 ? "Bad choice pattern syntax: ".concat(strValueOf17) : new String("Bad choice pattern syntax: "));
                                        }
                                        iL6 = l(iT + 1);
                                    }
                                    iL = iT;
                                } else {
                                    int iJ2 = i47;
                                    boolean z3 = false;
                                    boolean z4 = true;
                                    while (true) {
                                        iL2 = l(iJ2);
                                        int length2 = this.a.length();
                                        z = iL2 == length2;
                                        if (iL2 == length2 || this.a.charAt(iL2) == '}') {
                                            break;
                                        }
                                        if (d.b(i10) && this.a.charAt(iL2) == '=') {
                                            int i54 = iL2 + 1;
                                            iK = j(i54);
                                            int i55 = iK - iL2;
                                            if (i55 == 1) {
                                                String lowerCase = d.a(i10).toLowerCase(Locale.ENGLISH);
                                                String strN2 = n(i47);
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 21 + String.valueOf(strN2).length());
                                                sb2.append("Bad ");
                                                sb2.append(lowerCase);
                                                sb2.append(" pattern syntax: ");
                                                sb2.append(strN2);
                                                throw new IllegalArgumentException(sb2.toString());
                                            }
                                            if (i55 > 65535) {
                                                String strValueOf18 = String.valueOf(n(iL2));
                                                throw new IndexOutOfBoundsException(strValueOf18.length() != 0 ? "Argument selector too long: ".concat(strValueOf18) : new String("Argument selector too long: "));
                                            }
                                            v(12, iL2, i55, 0);
                                            q(i54, iK, false);
                                        } else {
                                            iK = k(iL2);
                                            int i56 = iK - iL2;
                                            if (i56 == 0) {
                                                String lowerCase2 = d.a(i10).toLowerCase(Locale.ENGLISH);
                                                String strN3 = n(i47);
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase2).length() + 21 + String.valueOf(strN3).length());
                                                sb3.append("Bad ");
                                                sb3.append(lowerCase2);
                                                sb3.append(" pattern syntax: ");
                                                sb3.append(strN3);
                                                throw new IllegalArgumentException(sb3.toString());
                                            }
                                            if (d.b(i10) && i56 == 6) {
                                                if (iK >= this.a.length()) {
                                                    i56 = 6;
                                                } else if (!this.a.regionMatches(iL2, "offset:", 0, 7)) {
                                                    i56 = 6;
                                                } else {
                                                    if (!z4) {
                                                        String strValueOf19 = String.valueOf(n(i47));
                                                        throw new IllegalArgumentException(strValueOf19.length() != 0 ? "Plural argument 'offset:' (if present) must precede key-message pairs: ".concat(strValueOf19) : new String("Plural argument 'offset:' (if present) must precede key-message pairs: "));
                                                    }
                                                    int iL8 = l(iK + 1);
                                                    iJ2 = j(iL8);
                                                    if (iJ2 == iL8) {
                                                        String strValueOf20 = String.valueOf(n(i47));
                                                        throw new IllegalArgumentException(strValueOf20.length() != 0 ? "Missing value for plural 'offset:' ".concat(strValueOf20) : new String("Missing value for plural 'offset:' "));
                                                    }
                                                    if (iJ2 - iL8 > 65535) {
                                                        String strValueOf21 = String.valueOf(n(iL8));
                                                        throw new IndexOutOfBoundsException(strValueOf21.length() != 0 ? "Plural offset value too long: ".concat(strValueOf21) : new String("Plural offset value too long: "));
                                                    }
                                                    q(iL8, iJ2, false);
                                                    z4 = false;
                                                }
                                            }
                                            if (i56 > 65535) {
                                                String strValueOf22 = String.valueOf(n(iL2));
                                                throw new IndexOutOfBoundsException(strValueOf22.length() != 0 ? "Argument selector too long: ".concat(strValueOf22) : new String("Argument selector too long: "));
                                            }
                                            v(12, iL2, i56, 0);
                                            if (this.a.regionMatches(iL2, "other", 0, i56)) {
                                                z3 = true;
                                            }
                                        }
                                        int iL9 = l(iK);
                                        if (iL9 == this.a.length() || this.a.charAt(iL9) != '{') {
                                            String lowerCase3 = d.a(i10).toLowerCase(Locale.ENGLISH);
                                            String strN4 = n(iL2);
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(lowerCase3).length() + 37 + String.valueOf(strN4).length());
                                            sb4.append("No message fragment after ");
                                            sb4.append(lowerCase3);
                                            sb4.append(" selector: ");
                                            sb4.append(strN4);
                                            throw new IllegalArgumentException(sb4.toString());
                                        }
                                        iJ2 = t(iL9, 1, i3 + 1, i10);
                                        z4 = false;
                                    }
                                    if (z == r(i3)) {
                                        String lowerCase4 = d.a(i10).toLowerCase(Locale.ENGLISH);
                                        String strN5 = n(i47);
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(lowerCase4).length() + 21 + String.valueOf(strN5).length());
                                        sb5.append("Bad ");
                                        sb5.append(lowerCase4);
                                        sb5.append(" pattern syntax: ");
                                        sb5.append(strN5);
                                        throw new IllegalArgumentException(sb5.toString());
                                    }
                                    if (!z3) {
                                        String lowerCase5 = d.a(i10).toLowerCase(Locale.ENGLISH);
                                        String strM = m();
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(lowerCase5).length() + 39 + String.valueOf(strM).length());
                                        sb6.append("Missing 'other' keyword in ");
                                        sb6.append(lowerCase5);
                                        sb6.append(" pattern in ");
                                        sb6.append(strM);
                                        throw new IllegalArgumentException(sb6.toString());
                                    }
                                    iL = iL2;
                                }
                            } else if (i10 != 2) {
                                String strValueOf23 = String.valueOf(n(iL3));
                                throw new IllegalArgumentException(strValueOf23.length() != 0 ? "No style field for complex argument: ".concat(strValueOf23) : new String("No style field for complex argument: "));
                            }
                        }
                        String strValueOf24 = String.valueOf(n(iL3));
                        throw new IllegalArgumentException(strValueOf24.length() != 0 ? "Bad argument syntax: ".concat(strValueOf24) : new String("Bad argument syntax: "));
                    }
                    iL = iL4;
                    i10 = 1;
                    u(size2, 7, iL, 1, i10 - 1);
                    i15 = iL + 1;
                    z2 = true;
                }
                i15 = i16;
                z2 = true;
            }
        }
    }

    private final void u(int i, int i2, int i3, int i4, int i5) {
        ((z) this.b.get(i)).d = this.b.size();
        v(i2, i3, i4, i5);
    }

    private final void v(int i, int i2, int i3, int i4) {
        this.b.add(new z(i, i2, i3, i4));
    }

    public final double a(z zVar) {
        int i = zVar.e;
        if (i == 13) {
            return zVar.c;
        }
        if (i == 14) {
            return ((Double) this.c.get(zVar.c)).doubleValue();
        }
        return -1.23456789E8d;
    }

    public final int b() {
        return this.b.size();
    }

    public final int c(int i) {
        int i2 = ((z) this.b.get(i)).d;
        return i2 < i ? i : i2;
    }

    public final Object clone() {
        return e();
    }

    public final z d(int i) {
        return (z) this.b.get(i);
    }

    public final aa e() {
        try {
            aa aaVar = (aa) super.clone();
            aaVar.b = (ArrayList) this.b.clone();
            ArrayList arrayList = this.c;
            if (arrayList != null) {
                aaVar.c = (ArrayList) arrayList.clone();
            }
            aaVar.g = false;
            return aaVar;
        } catch (CloneNotSupportedException e2) {
            throw new ab(e2);
        }
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aa aaVar = (aa) obj;
        int i = this.f;
        int i2 = aaVar.f;
        if (i != 0) {
            return i == i2 && ((str = this.a) != null ? str.equals(aaVar.a) : aaVar.a == null) && this.b.equals(aaVar.b);
        }
        throw null;
    }

    public final String f(z zVar) {
        int i = zVar.a;
        return this.a.substring(i, zVar.b + i);
    }

    public final boolean g(z zVar, String str) {
        return this.a.regionMatches(zVar.a, str, 0, zVar.b);
    }

    public final int h(int i) {
        return ((z) this.b.get(i)).e;
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            throw null;
        }
        int i2 = i * 37;
        String str = this.a;
        return ((i2 + (str != null ? str.hashCode() : 0)) * 37) + this.b.hashCode();
    }

    public final void i(String str) {
        this.a = str;
        this.d = false;
        this.b.clear();
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.clear();
        }
        t(0, 0, 0, 1);
    }

    public final String toString() {
        return this.a;
    }
}
