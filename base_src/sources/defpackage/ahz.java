package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ahz extends aiy {
    public ahz(aii aiiVar) {
        super(aiiVar);
    }

    public final int a(Object obj) {
        ake akeVarE = e();
        try {
            c(akeVarE, obj);
            return akeVarE.a();
        } finally {
            f(akeVarE);
        }
    }

    public final int b(Iterable iterable) {
        ake akeVarE = e();
        try {
            Iterator it = iterable.iterator();
            int iA = 0;
            while (it.hasNext()) {
                c(akeVarE, it.next());
                iA += akeVarE.a();
            }
            f(akeVarE);
            return iA;
        } catch (Throwable th) {
            f(akeVarE);
            throw th;
        }
    }

    protected abstract void c(ake akeVar, Object obj);
}
