package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qvt {
    public static final qvr a = new qvr("NO_THREAD_ELEMENTS");
    private static final qmy b = qlm.e;
    private static final qmy c = qlm.f;
    private static final qmy d = qlm.g;

    public static final Object a(qln qlnVar) {
        qlnVar.getClass();
        Object objFold = qlnVar.fold(0, b);
        objFold.getClass();
        return objFold;
    }

    public static final Object b(qln qlnVar, Object obj) {
        qlnVar.getClass();
        if (obj == null) {
            obj = a(qlnVar);
        }
        if (obj == 0) {
            return a;
        }
        return obj instanceof Integer ? qlnVar.fold(new qvw(qlnVar, ((Number) obj).intValue()), d) : ((qry) obj).a(qlnVar);
    }

    public static final void c(qln qlnVar, Object obj) {
        qlnVar.getClass();
        if (obj == a) {
            return;
        }
        if (!(obj instanceof qvw)) {
            Object objFold = qlnVar.fold(null, c);
            if (objFold == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            ((qry) objFold).b(obj);
            return;
        }
        qvw qvwVar = (qvw) obj;
        int length = qvwVar.c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            qry qryVar = qvwVar.c[length];
            qryVar.getClass();
            qryVar.b(qvwVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
