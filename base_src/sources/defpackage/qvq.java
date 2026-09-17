package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qvq {
    private static final String a;
    private static final String b;

    static {
        Object objL;
        Object objL2;
        try {
            objL = Class.forName("qls").getCanonicalName();
        } catch (Throwable th) {
            objL = qmd.L(th);
        }
        if (qkn.a(objL) != null) {
            objL = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        a = (String) objL;
        try {
            objL2 = Class.forName("qvq").getCanonicalName();
        } catch (Throwable th2) {
            objL2 = qmd.L(th2);
        }
        if (qkn.a(objL2) != null) {
            objL2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        b = (String) objL2;
    }

    public static final Throwable a(Throwable th, qlv qlvVar) {
        qkl qklVarK;
        Throwable cause = th.getCause();
        int i = 0;
        if (cause != null && qno.c(cause.getClass(), th.getClass())) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    qklVarK = qmd.K(th, new StackTraceElement[0]);
                    break;
                }
                if (d(stackTrace[i2])) {
                    qklVarK = qmd.K(cause, stackTrace);
                    break;
                }
                i2++;
            }
        } else {
            qklVarK = qmd.K(th, new StackTraceElement[0]);
        }
        Throwable th2 = (Throwable) qklVarK.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) qklVarK.b;
        Throwable thG = g(th2);
        if (thG == null) {
            return th;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        StackTraceElement stackTraceElement = qlvVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (true != (qlvVar instanceof qlv)) {
                qlvVar = null;
            }
            qlvVar = qlvVar == null ? null : qlvVar.getCallerFrame();
            if (qlvVar == null) {
                break;
            }
            StackTraceElement stackTraceElement2 = qlvVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        if (arrayDeque.isEmpty()) {
            return th;
        }
        if (th2 != th) {
            int length2 = stackTraceElementArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    i3 = -1;
                    break;
                }
                if (d(stackTraceElementArr[i3])) {
                    break;
                }
                i3++;
            }
            int i4 = i3 + 1;
            int length3 = stackTraceElementArr.length - 1;
            if (i4 <= length3) {
                while (true) {
                    int i5 = length3 - 1;
                    StackTraceElement stackTraceElement3 = stackTraceElementArr[length3];
                    StackTraceElement stackTraceElement4 = (StackTraceElement) arrayDeque.getLast();
                    if (stackTraceElement3.getLineNumber() == stackTraceElement4.getLineNumber() && qno.c(stackTraceElement3.getMethodName(), stackTraceElement4.getMethodName()) && qno.c(stackTraceElement3.getFileName(), stackTraceElement4.getFileName()) && qno.c(stackTraceElement3.getClassName(), stackTraceElement4.getClassName())) {
                        arrayDeque.removeLast();
                    }
                    arrayDeque.addFirst(stackTraceElementArr[length3]);
                    if (length3 == i4) {
                        break;
                    }
                    length3 = i5;
                }
            }
        }
        arrayDeque.addFirst(e());
        StackTraceElement[] stackTrace2 = th2.getStackTrace();
        int iF = f(stackTrace2, a);
        if (iF == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            thG.setStackTrace((StackTraceElement[]) array);
        } else {
            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[arrayDeque.size() + iF];
            if (iF > 0) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    stackTraceElementArr2[i6] = stackTrace2[i6];
                    if (i7 >= iF) {
                        break;
                    }
                    i6 = i7;
                }
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                stackTraceElementArr2[i + iF] = (StackTraceElement) it.next();
                i++;
            }
            thG.setStackTrace(stackTraceElementArr2);
        }
        return thG;
    }

    public static final Throwable b(Throwable th) {
        Throwable thG;
        if (!qql.b || (thG = g(th)) == null) {
            return th;
        }
        StackTraceElement[] stackTrace = thG.getStackTrace();
        int length = stackTrace.length;
        int iF = f(stackTrace, b);
        int i = iF + 1;
        int iF2 = f(stackTrace, a);
        int i2 = 0;
        int i3 = (length - iF) - (iF2 == -1 ? 0 : length - iF2);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i3];
        while (i2 < i3) {
            stackTraceElementArr[i2] = i2 == 0 ? e() : stackTrace[(i + i2) - 1];
            i2++;
        }
        thG.setStackTrace(stackTraceElementArr);
        return thG;
    }

    public static final Throwable c(Throwable th) {
        th.getClass();
        Throwable cause = th.getCause();
        if (cause == null || !qno.c(cause.getClass(), th.getClass())) {
            return th;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (d(stackTraceElement)) {
                return cause;
            }
        }
        return th;
    }

    public static final boolean d(StackTraceElement stackTraceElement) {
        stackTraceElement.getClass();
        return qno.u(stackTraceElement.getClassName(), "\b\b\b");
    }

    public static final StackTraceElement e() {
        return new StackTraceElement(qno.a("\b\b\b(", "Coroutine boundary"), "\b", "\b", -1);
    }

    private static final int f(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (qno.c(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    private static final Throwable g(Throwable th) {
        Throwable thA = qvc.a(th);
        if (thA == null) {
            return null;
        }
        if ((th instanceof qqc) || qno.c(thA.getMessage(), th.getMessage())) {
            return thA;
        }
        return null;
    }
}
