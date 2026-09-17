package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class oxg extends ows {
    private static final Set a;
    private static final owc b;
    private final String c;
    private final Level d;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(oun.a, ovl.a)));
        a = setUnmodifiableSet;
        b = owf.a(setUnmodifiableSet);
    }

    public oxg(String str, String str2, boolean z, Level level) {
        super(str2);
        this.c = oxh.d(str, str2, z);
        this.d = level;
    }

    public static void e(ovq ovqVar, String str, Level level) {
        owm owkVar;
        int i;
        char cCharAt;
        oxs oxrVar;
        String string;
        ovu ovuVar = ovu.a;
        ovv ovvVarJ = ovqVar.j();
        int iB = ovvVarJ.b();
        if (iB == 0) {
            owkVar = owm.c;
        } else {
            owkVar = iB <= 28 ? new owk(ovuVar, ovvVarJ) : new owl(ovuVar, ovvVarJ);
        }
        int iIntValue = ovqVar.m().intValue();
        int iIntValue2 = level.intValue();
        if (iIntValue < iIntValue2 || owq.b(ovqVar, owkVar, a)) {
            StringBuilder sb = new StringBuilder();
            if (iIntValue >= iIntValue2 || ovqVar.k() == null) {
                if (ovqVar.k() != null) {
                    oxx oxxVar = new oxx(ovqVar.k(), ovqVar.E(), sb);
                    String strC = oxxVar.c();
                    int iB2 = oya.b(strC, 0);
                    int i2 = 0;
                    int i3 = -1;
                    while (iB2 >= 0) {
                        int i4 = iB2 + 1;
                        int i5 = i4;
                        int i6 = 0;
                        while (true) {
                            if (i5 >= strC.length()) {
                                throw oxz.c("unterminated parameter", strC, iB2);
                            }
                            i = i5 + 1;
                            cCharAt = strC.charAt(i5);
                            char c = (char) (cCharAt - '0');
                            if (c < '\n') {
                                i6 = (i6 * 10) + c;
                                if (i6 >= 1000000) {
                                    throw oxz.b("index too large", strC, iB2, i);
                                }
                                i5 = i;
                            }
                        }
                        if (cCharAt == '$') {
                            if ((i - 1) - i4 == 0) {
                                throw oxz.b("missing index", strC, iB2, i);
                            }
                            if (strC.charAt(i4) == '0') {
                                throw oxz.b("index has leading zero", strC, iB2, i);
                            }
                            int i7 = i6 - 1;
                            if (i == strC.length()) {
                                throw oxz.c("unterminated parameter", strC, iB2);
                            }
                            strC.charAt(i);
                            i3 = i7;
                            i4 = i;
                            i++;
                        } else if (cCharAt != '<') {
                            i3 = i2;
                            i2++;
                        } else {
                            if (i3 == -1) {
                                throw oxz.b("invalid relative parameter", strC, iB2, i);
                            }
                            if (i == strC.length()) {
                                throw oxz.c("unterminated parameter", strC, iB2);
                            }
                            strC.charAt(i);
                            i4 = i;
                            i++;
                        }
                        int i8 = i - 1;
                        while (true) {
                            if (i8 >= strC.length()) {
                                throw oxz.c("unterminated parameter", strC, iB2);
                            }
                            if (((char) ((strC.charAt(i8) & (-33)) - 65)) < 26) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                        int i9 = i8 + 1;
                        char cCharAt2 = strC.charAt(i8);
                        int i10 = cCharAt2 & ' ';
                        ovn ovnVarB = ovn.b(strC, i4, i8, i10 == 0);
                        ovm ovmVar = ovm.k[ovm.a(cCharAt2)];
                        if (i10 == 0 && (ovmVar == null || (ovmVar.n & 128) == 0)) {
                            ovmVar = null;
                        }
                        if (ovmVar != null) {
                            if (!ovnVarB.e(ovmVar.n, ovmVar.m.f)) {
                                throw oxz.b("invalid format specifier", strC, iB2, i9);
                            }
                            oxrVar = oxu.b(i3, ovmVar, ovnVarB);
                        } else if (cCharAt2 == 't' || cCharAt2 == 'T') {
                            if (!ovnVarB.e(160, false)) {
                                throw oxz.b("invalid format specification", strC, iB2, i9);
                            }
                            int i11 = i9 + 1;
                            if (i11 > strC.length()) {
                                throw oxz.a("truncated format specifier", strC, iB2);
                            }
                            oxq oxqVar = (oxq) oxq.F.get(Character.valueOf(strC.charAt(i9)));
                            if (oxqVar == null) {
                                throw oxz.a("illegal date/time conversion", strC, i9);
                            }
                            oxrVar = new oxr(ovnVarB, i3, oxqVar);
                            i9 = i11;
                        } else {
                            if (cCharAt2 != 'h' && cCharAt2 != 'H') {
                                throw oxz.b("invalid format specification", strC, iB2, i9);
                            }
                            if (!ovnVarB.e(160, false)) {
                                throw oxz.b("invalid format specification", strC, iB2, i9);
                            }
                            oxrVar = new oxv(ovnVarB, i3);
                        }
                        int i12 = oxrVar.a;
                        if (i12 < 32) {
                            oxxVar.a |= 1 << i12;
                        }
                        oxxVar.b = Math.max(oxxVar.b, i12);
                        oxxVar.b().a(oxxVar.d, oxxVar.c(), oxxVar.e, iB2);
                        Object[] objArr = oxxVar.c;
                        int i13 = oxrVar.a;
                        if (i13 < objArr.length) {
                            Object obj = objArr[i13];
                            if (obj != null) {
                                oxrVar.a(oxxVar, obj);
                            } else {
                                oxxVar.d.append("null");
                            }
                        } else {
                            oxxVar.d.append("[ERROR: MISSING LOG ARGUMENT]");
                        }
                        oxxVar.e = i9;
                        iB2 = oya.b(strC, i9);
                    }
                    int i14 = oxxVar.a;
                    if (((i14 + 1) & i14) != 0 || (oxxVar.b > 31 && i14 != -1)) {
                        throw new oxz(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros((-1) ^ i14))));
                    }
                    oxxVar.b().a(oxxVar.d, oxxVar.c(), oxxVar.e, oxxVar.c().length());
                    StringBuilder sb2 = oxxVar.d;
                    if (ovqVar.E().length > oxxVar.b + 1) {
                        sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                    }
                } else {
                    sb.append(ovt.b(ovqVar.l()));
                }
                owq.c(owkVar, b, sb);
            } else {
                sb.append("(REDACTED) ");
                sb.append(ovqVar.k().b);
            }
            string = sb.toString();
        } else {
            string = owq.a(ovqVar);
        }
        Throwable th = (Throwable) ovqVar.j().d(oun.a);
        switch (oxh.e(ovqVar.m())) {
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                Log.w(str, string, th);
                return;
            default:
                Log.e(str, string, th);
                return;
        }
    }

    @Override // defpackage.ovr
    public final void c(ovq ovqVar) {
        e(ovqVar, this.c, this.d);
    }

    @Override // defpackage.ovr
    public final boolean d(Level level) {
        int iE = oxh.e(level);
        return Log.isLoggable(this.c, iE) || Log.isLoggable("all", iE);
    }
}
