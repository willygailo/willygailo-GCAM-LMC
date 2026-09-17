package defpackage;

import com.google.common.flogger.backend.google.GooglePlatform;
import com.google.common.flogger.backend.system.DefaultPlatform;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public class oxh {
    public static int A(long j) {
        int i = (int) j;
        obr.aJ(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int B(int i, int i2, int i3) {
        obr.aL(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    public static int C(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int D(int... iArr) {
        obr.aF(true);
        int i = iArr[0];
        for (int i2 = 1; i2 < 4; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public static int E(int... iArr) {
        obr.aF(true);
        int i = iArr[0];
        for (int i2 = 1; i2 < 4; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public static int F(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static List G(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.emptyList() : new pfd(iArr, 0, length);
    }

    public static float H(float f, float f2, float f3) {
        if (f2 <= f3) {
            return Math.min(Math.max(f, f2), f3);
        }
        throw new IllegalArgumentException(obr.aw("min (%s) must be less than or equal to max (%s)", Float.valueOf(f2), Float.valueOf(f3)));
    }

    public static float I(float... fArr) {
        obr.aF(fArr.length > 0);
        float fMin = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            fMin = Math.min(fMin, fArr[i]);
        }
        return fMin;
    }

    public static int J(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static List K(float... fArr) {
        int length = fArr.length;
        return length == 0 ? Collections.emptyList() : new pfa(fArr, 0, length);
    }

    public static float[] L(Collection collection) {
        if (collection instanceof pfa) {
            pfa pfaVar = (pfa) collection;
            return Arrays.copyOfRange(pfaVar.a, pfaVar.b, pfaVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            fArr[i] = ((Number) obj).floatValue();
        }
        return fArr;
    }

    static void M(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 54);
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }

    public static void N(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static long O(long j, long j2) {
        long j3 = j + j2;
        M(((j ^ j2) < 0) | ((j ^ j3) >= 0), "checkedAdd", j, j2);
        return j3;
    }

    public static long P(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(j ^ (-1)) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros((-1) ^ j2);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        M(iNumberOfLeadingZeros >= 64, "checkedMultiply", j, j2);
        M(true, "checkedMultiply", j, j2);
        long j3 = j * j2;
        M(j == 0 || j3 / j == j2, "checkedMultiply", j, j2);
        return j3;
    }

    public static long Q(long j, long j2) {
        long j3 = j - j2;
        M(((j ^ j2) >= 0) | ((j ^ j3) >= 0), "checkedSubtract", j, j2);
        return j3;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r2 != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int R(int r5, int r6, java.math.RoundingMode r7) {
        /*
            r7.getClass()
            if (r6 == 0) goto L56
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            return r0
        Le:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = defpackage.pez.a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L52;
                case 2: goto L55;
                case 3: goto L4a;
                case 4: goto L50;
                case 5: goto L45;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L42
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L4c
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3b
            r6 = 1
            goto L3c
        L3b:
            r6 = 0
        L3c:
            r7 = r0 & 1
            r6 = r6 & r7
            if (r6 == 0) goto L4d
            goto L4c
        L42:
            if (r1 <= 0) goto L4d
            goto L4c
        L45:
            if (r5 <= 0) goto L48
            goto L4c
        L48:
            r2 = 0
            goto L4e
        L4a:
            if (r5 >= 0) goto L4d
        L4c:
            goto L4e
        L4d:
            r2 = 0
        L4e:
            if (r2 == 0) goto L55
        L50:
            int r0 = r0 + r5
            return r0
        L52:
            N(r4)
        L55:
            return r0
        L56:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxh.R(int, int, java.math.RoundingMode):int");
    }

    public static int S(int i, RoundingMode roundingMode) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("x (");
            sb.append(i);
            sb.append(") must be > 0");
            throw new IllegalArgumentException(sb.toString());
        }
        switch (pez.a[roundingMode.ordinal()]) {
            case 1:
                N(((i + (-1)) & i) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static poy T(Throwable th) {
        StackTraceElement[] stackTrace;
        poy poyVarM = pex.f.m();
        String name = th.getClass().getName();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pex pexVar = (pex) poyVarM.b;
        name.getClass();
        pexVar.a |= 1;
        pexVar.b = name;
        if (th.getMessage() != null) {
            String message = th.getMessage();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pex pexVar2 = (pex) poyVarM.b;
            message.getClass();
            pexVar2.a |= 2;
            pexVar2.c = message;
        }
        try {
            stackTrace = th.getStackTrace();
        } catch (NullPointerException e) {
            stackTrace = null;
        }
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                poy poyVarM2 = pew.f.m();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    pew pewVar = (pew) poyVarM2.b;
                    className.getClass();
                    pewVar.a |= 1;
                    pewVar.b = className;
                    String methodName = stackTraceElement.getMethodName();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    pew pewVar2 = (pew) poyVarM2.b;
                    methodName.getClass();
                    pewVar2.a |= 2;
                    pewVar2.c = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    pew pewVar3 = (pew) poyVarM2.b;
                    pewVar3.a |= 8;
                    pewVar3.e = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (poyVarM2.c) {
                            poyVarM2.m();
                            poyVarM2.c = false;
                        }
                        pew pewVar4 = (pew) poyVarM2.b;
                        fileName.getClass();
                        pewVar4.a |= 4;
                        pewVar4.d = fileName;
                    }
                }
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pex pexVar3 = (pex) poyVarM.b;
                pew pewVar5 = (pew) poyVarM2.j();
                pewVar5.getClass();
                ppm ppmVar = pexVar3.e;
                if (!ppmVar.c()) {
                    pexVar3.e = ppd.B(ppmVar);
                }
                pexVar3.e.add(pewVar5);
            }
        }
        return poyVarM;
    }

    public static int U(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 0;
        }
    }

    public static int V(int i) {
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

    public static int W(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            default:
                return 0;
        }
    }

    public static int X(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 0;
        }
    }

    public static int Y(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 0;
        }
    }

    public static int Z(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            default:
                return 0;
        }
    }

    public static int aa(int i) {
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

    public static int[] ab() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public static /* synthetic */ String ac(int i) {
        switch (i) {
            case 2:
                return "START_FLOW";
            case 3:
                return "CONFIRMATION";
            default:
                return "INSTALL";
        }
    }

    public static int ad(int i) {
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

    public static String d(String str, String str2, boolean z) {
        if (str.length() + str2.length() > 23) {
            int i = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char cCharAt = str2.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str2 = str2.substring(i + 1);
        }
        String strValueOf = String.valueOf(str2);
        String strConcat = strValueOf.length() != 0 ? str.concat(strValueOf) : new String(str);
        return !z ? strConcat : strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    public static int e(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static owp f() {
        try {
            return (owp) owz.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException e) {
            try {
                return (owp) GooglePlatform.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException e2) {
                try {
                    return (owp) DefaultPlatform.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException e3) {
                    return null;
                }
            }
        }
    }

    public static void g(ouk oukVar) {
        x(oukVar, "lazy arg");
    }

    public static int h(int i, osx osxVar) {
        switch (i - 1) {
            case 0:
                return osxVar.b;
            default:
                return 1;
        }
    }

    public static long i(int i, osx osxVar) {
        switch (i - 1) {
            case 0:
                if (osxVar == null) {
                    return 0L;
                }
                return osxVar.d;
            default:
                if (osxVar == null) {
                    return 0L;
                }
                return osxVar.c;
        }
    }

    public static Map.Entry j(Map.Entry entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new osk(entry, obj);
    }

    public static NavigableMap k(NavigableMap navigableMap, Object obj) {
        return new osm(navigableMap, obj);
    }

    public static NavigableSet l(NavigableSet navigableSet, Object obj) {
        return new osn(navigableSet, obj);
    }

    public static Set m(Set set, Object obj) {
        return new osq(set, obj);
    }

    public static SortedMap n(SortedMap sortedMap, Object obj) {
        return new osr(sortedMap, obj);
    }

    public static SortedSet o(SortedSet sortedSet, Object obj) {
        return new oss(sortedSet, obj);
    }

    public static Object p(oqv oqvVar) {
        if (oqvVar == null) {
            return null;
        }
        return oqvVar.b();
    }

    public static Object q(oqv oqvVar) {
        if (oqvVar != null) {
            return oqvVar.b();
        }
        throw new NoSuchElementException();
    }

    public static int[] r() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public static String s(int i) {
        return Integer.toString(i - 1);
    }

    public static int t(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return 0;
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
        }
    }

    public static int u(int i) {
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
            default:
                return 0;
        }
    }

    public static void v(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        String strValueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 39);
        sb.append("Unable to create parent directories of ");
        sb.append(strValueOf);
        throw new IOException(sb.toString());
    }

    public static byte[] w(File file) {
        file.getClass();
        return ozk.a(file);
    }

    public static Object x(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    public static void y(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean z(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public ovv a() {
        return ovu.a;
    }

    public oxp b() {
        return oxp.b;
    }

    public void c(String str, Level level, boolean z) {
    }
}
