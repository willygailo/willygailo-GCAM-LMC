package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class qva {
    public static final qvr a = new qvr("UNDEFINED");
    public static final qvr b = new qvr("REUSABLE_CLAIMED");

    public static final void a(qlh qlhVar, Object obj) {
        if (!(qlhVar instanceof quz)) {
            qlhVar.resumeWith(obj);
            return;
        }
        quz quzVar = (quz) qlhVar;
        Object objI = qmd.i(obj);
        if (quzVar.a.e(quzVar.getContext())) {
            quzVar.c = objI;
            quzVar.e = 1;
            quzVar.a.d(quzVar.getContext(), quzVar);
            return;
        }
        boolean z = qql.a;
        ThreadLocal threadLocal = qrz.a;
        qqu qquVarA = qrz.a();
        if (qquVarA.k()) {
            quzVar.c = objI;
            quzVar.e = 1;
            qquVarA.h(quzVar);
            return;
        }
        qquVarA.i(true);
        try {
            qrg qrgVar = (qrg) quzVar.getContext().get(qrg.c);
            if (qrgVar == null || qrgVar.hl()) {
                qlh qlhVar2 = quzVar.b;
                Object obj2 = quzVar.d;
                qln context = qlhVar2.getContext();
                Object objB = qvt.b(context, obj2);
                qsc qscVarC = objB != qvt.a ? qqd.c(qlhVar2, context, objB) : null;
                try {
                    quzVar.b.resumeWith(obj);
                    if (qscVarC == null || qscVarC.L()) {
                        qvt.c(context, objB);
                    }
                } catch (Throwable th) {
                    if (qscVarC == null || qscVarC.L()) {
                        qvt.c(context, objB);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionM = qrgVar.m();
                quzVar.o(objI, cancellationExceptionM);
                quzVar.resumeWith(qmd.L(cancellationExceptionM));
            }
            while (qquVarA.l()) {
            }
        } catch (Throwable th2) {
            try {
                quzVar.u(th2, null);
            } finally {
                qquVarA.g(true);
            }
        }
    }
}
