package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class qno {
    private qno() {
    }

    public static /* synthetic */ qqr B(qrg qrgVar, boolean z, qmu qmuVar, int i) {
        int i2 = (z ? 1 : 0) & ((i & 1) ^ 1);
        return qrgVar.p(1 == i2, (i & 2) != 0, qmuVar);
    }

    public static final qqf C(Executor executor) {
        executor.getClass();
        qqp qqpVar = executor instanceof qqp ? (qqp) executor : null;
        return qqpVar == null ? new qqy(executor) : qqpVar.a;
    }

    public static final CancellationException D(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static int E(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            default:
                return 0;
        }
    }

    public static int F(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            default:
                return 0;
        }
    }

    public static int G(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            default:
                return 0;
        }
    }

    public static final Object H(qbw qbwVar, qlh qlhVar) {
        qpo qpoVar = new qpo(qmd.c(qlhVar), 1);
        qpoVar.r();
        qbwVar.n(new qvy(qpoVar));
        Object objG = qpoVar.g();
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        return objG;
    }

    public static final void I(qpn qpnVar, qbz qbzVar) {
        qpnVar.a(new qvz(qbzVar));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [qlh, qlv] */
    public static final Object J(qvo qvoVar, Object obj, qmy qmyVar) throws Throwable {
        Object qpyVar;
        Object objHj;
        try {
            qnt.a(qmyVar, 2);
            qpyVar = qmyVar.invoke(obj, qvoVar);
        } catch (Throwable th) {
            qpyVar = new qpy(th);
        }
        if (qpyVar != qlp.COROUTINE_SUSPENDED && (objHj = qvoVar.hj(qpyVar)) != qrp.b) {
            if (!(objHj instanceof qpy)) {
                return qrp.b(objHj);
            }
            Throwable th2 = ((qpy) objHj).b;
            ?? r1 = qvoVar.f;
            if (qql.b && (r1 instanceof qlv)) {
                throw qvq.a(th2, r1);
            }
            throw th2;
        }
        return qlp.COROUTINE_SUSPENDED;
    }

    public static String a(String str, Object obj) {
        return str + obj;
    }

    public static void b() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int d(int i) {
        if (i < 48) {
            return -1;
        }
        return i != 48 ? 1 : 0;
    }

    public static void e(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static int f(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static int g(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static int h(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static Long i(String str) {
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        boolean z = true;
        if (d(cCharAt) >= 0) {
            z = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j = Long.MIN_VALUE;
                i = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                i = 1;
                z = false;
            }
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iX = x(str.charAt(i));
            if (iX < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L || j2 < -922337203685477580L) {
                    return null;
                }
                j3 = -922337203685477580L;
            }
            long j4 = j2 * 10;
            long j5 = iX;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static boolean j(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            qlb it = new qoa(0, charSequence.length() - 1).iterator();
            while (it.a) {
                if (!w(charSequence.charAt(it.a()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int k(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static String l(CharSequence charSequence, qoa qoaVar) {
        qoaVar.getClass();
        return charSequence.subSequence(Integer.valueOf(qoaVar.a).intValue(), Integer.valueOf(qoaVar.b).intValue() + 1).toString();
    }

    public static /* synthetic */ boolean m(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && y(charSequence.charAt(k(charSequence)), c);
    }

    public static int n(CharSequence charSequence, String str, int i) {
        str.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(str, i);
        }
        qoa qoaVar = new qoa(f(i, 0), g(charSequence.length(), charSequence.length()));
        int i2 = qoaVar.a;
        int i3 = qoaVar.b;
        if (i2 > i3) {
            return -1;
        }
        while (!r(str, charSequence, i2, str.length())) {
            if (i2 == i3) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    public static /* synthetic */ int o(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static String p(String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (str.length() >= 2) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(2);
            int length = 2 - str.length();
            if (length > 0) {
                int i = 1;
                while (true) {
                    sb.append('0');
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ qoj q(CharSequence charSequence, String[] strArr, int i) {
        return new qow(charSequence, i, new qoy(qmd.F(strArr)));
    }

    public static boolean r(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        charSequence.getClass();
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!y(charSequence.charAt(i3), charSequence2.charAt(i + i3))) {
                return false;
            }
        }
        return true;
    }

    public static List s(CharSequence charSequence, String[] strArr, int i) {
        charSequence.getClass();
        int length = 0;
        String str = strArr[0];
        if (str.length() == 0) {
            qop qopVar = new qop(q(charSequence, strArr, i));
            ArrayList arrayList = new ArrayList(qmd.B(qopVar));
            Iterator it = qopVar.iterator();
            while (it.hasNext()) {
                arrayList.add(l(charSequence, (qoa) it.next()));
            }
            return arrayList;
        }
        int iN = n(charSequence, str, 0);
        if (iN == -1 || i == 1) {
            return qmd.q(charSequence.toString());
        }
        ArrayList arrayList2 = new ArrayList(i > 0 ? i : 10);
        do {
            arrayList2.add(charSequence.subSequence(length, iN).toString());
            length = str.length() + iN;
            if (i > 0 && arrayList2.size() == i - 1) {
                break;
            }
            iN = n(charSequence, str, length);
        } while (iN != -1);
        arrayList2.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList2;
    }

    public static /* synthetic */ boolean u(String str, String str2) {
        str.getClass();
        return str.startsWith(str2);
    }

    public static /* synthetic */ String v(String str) {
        str.getClass();
        str.getClass();
        int iLastIndexOf = str.lastIndexOf(46, k(str));
        if (iLastIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static final boolean w(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final int x(char c) {
        return Character.digit((int) c, 10);
    }

    public static boolean y(char c, char c2) {
        return c == c2;
    }

    public static /* synthetic */ qrj z() {
        return new qrj();
    }
}
