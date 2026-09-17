package defpackage;

import com.google.lens.sdk.LensApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class qnt {
    public static void a(Object obj, int i) {
        int arity;
        if (obj instanceof qkh) {
            if (obj instanceof qnn) {
                arity = ((qnn) obj).getArity();
            } else if (obj instanceof qmj) {
                arity = 0;
            } else if (obj instanceof qmu) {
                arity = 1;
            } else if (obj instanceof qmy) {
                arity = 2;
            } else if (obj instanceof qmz) {
                arity = 3;
            } else if (obj instanceof qna) {
                arity = 4;
            } else if (obj instanceof qnb) {
                arity = 5;
            } else if (obj instanceof qnc) {
                arity = 6;
            } else if (obj instanceof qnd) {
                arity = 7;
            } else if (obj instanceof qne) {
                arity = 8;
            } else if (obj instanceof qnf) {
                arity = 9;
            } else if (obj instanceof qmk) {
                arity = 10;
            } else if (obj instanceof qml) {
                arity = 11;
            } else if (obj instanceof qmm) {
                arity = 12;
            } else if (obj instanceof qmn) {
                arity = 13;
            } else if (obj instanceof qmo) {
                arity = 14;
            } else if (obj instanceof qmp) {
                arity = 15;
            } else if (obj instanceof qmq) {
                arity = 16;
            } else if (obj instanceof qmr) {
                arity = 17;
            } else if (obj instanceof qms) {
                arity = 18;
            } else if (obj instanceof qmt) {
                arity = 19;
            } else if (obj instanceof qmv) {
                arity = 20;
            } else if (obj instanceof qmw) {
                arity = 21;
            } else {
                arity = obj instanceof qmx ? 22 : -1;
            }
            if (arity == i) {
                return;
            }
        }
        String name = obj.getClass().getName();
        ClassCastException classCastException = new ClassCastException(name + " cannot be cast to " + ("kotlin.jvm.functions.Function" + i));
        qno.e(classCastException, qnt.class.getName());
        throw classCastException;
    }

    public static qoj b(qoj qojVar) {
        return new qog(qojVar, qoo.a, noj.t);
    }

    public static List c(qoj qojVar) {
        ArrayList arrayList = new ArrayList();
        Iterator itA = qojVar.a();
        while (itA.hasNext()) {
            arrayList.add(itA.next());
        }
        switch (arrayList.size()) {
            case 0:
                return qkx.a;
            case 1:
                return qmd.q(arrayList.get(0));
            default:
                return arrayList;
        }
    }

    public static qoj d(qoj qojVar, qmu qmuVar) {
        return new qot(qojVar, qmuVar, 0);
    }

    public static final qpa e(int i) {
        return new qpa(i);
    }

    public static final qpb f(boolean z) {
        return new qpb(z);
    }

    public static final qpc g(int i) {
        return new qpc(i);
    }

    public static final qpd h(long j) {
        return new qpd(j);
    }

    public static final qpe i(Object obj) {
        return new qpe(obj);
    }

    public static final void j(qtg qtgVar, Throwable th) {
        qtgVar.getClass();
        CancellationException cancellationExceptionD = null;
        if (th != null) {
            cancellationExceptionD = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionD == null) {
                cancellationExceptionD = qno.D("Channel was consumed, consumer had failed", th);
            }
        }
        qtgVar.q(cancellationExceptionD);
    }

    public static final Object k(Throwable th) {
        return new qsx(th);
    }

    public static /* synthetic */ qsu l(int i, int i2, int i3) {
        int i4 = 1;
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i2 == 0) {
            throw null;
        }
        switch (i) {
            case -2:
                return new qss(i2 == 1 ? qst.a : 1, i2);
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                if (i2 == 1) {
                    return new qtd();
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            case 0:
                return i2 == 1 ? new qti() : new qss(1, 2);
            default:
                if (i != 1) {
                    i4 = i;
                } else if (i2 == 2) {
                    return new qtd();
                }
                return new qss(i4, i2);
        }
    }

    public static final void m(qln qlnVar, CancellationException cancellationException) {
        qrg qrgVar = (qrg) qlnVar.get(qrg.c);
        if (qrgVar == null) {
            return;
        }
        qrgVar.q(cancellationException);
    }

    public static final void n(qln qlnVar) {
        qlnVar.getClass();
        qrg qrgVar = (qrg) qlnVar.get(qrg.c);
        if (qrgVar == null) {
            return;
        }
        o(qrgVar);
    }

    public static final void o(qrg qrgVar) {
        if (!qrgVar.hl()) {
            throw qrgVar.m();
        }
    }
}
