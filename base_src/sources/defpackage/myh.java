package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class myh implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ myi a;
    private final Thread.UncaughtExceptionHandler b;

    public myh(myi myiVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = myiVar;
        this.b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        int i;
        try {
            try {
                myi myiVar = this.a;
                String name = thread.getName();
                String name2 = th.getClass().getName();
                for (Throwable cause = th.getCause(); cause != null && cause != cause.getCause(); cause = cause.getCause()) {
                    name2 = cause.getClass().getName();
                }
                poy poyVarG = myiVar.g();
                if (poyVarG.c) {
                    poyVarG.m();
                    poyVarG.c = false;
                }
                qxy qxyVar = (qxy) poyVarG.b;
                qxy qxyVar2 = qxy.j;
                name.getClass();
                qxyVar.a |= 8;
                qxyVar.e = name;
                Class<?> cls = th.getClass();
                if (cls == OutOfMemoryError.class) {
                    i = 3;
                } else if (NullPointerException.class.isAssignableFrom(cls)) {
                    i = 2;
                } else if (RuntimeException.class.isAssignableFrom(cls)) {
                    i = 4;
                } else {
                    i = Error.class.isAssignableFrom(cls) ? 5 : 1;
                }
                if (poyVarG.c) {
                    poyVarG.m();
                    poyVarG.c = false;
                }
                qxy qxyVar3 = (qxy) poyVarG.b;
                qxyVar3.f = i - 1;
                int i2 = qxyVar3.a | 16;
                qxyVar3.a = i2;
                name2.getClass();
                qxyVar3.a = i2 | 128;
                qxyVar3.g = name2;
                poy poyVarM = pey.d.m();
                poy poyVarT = oxh.T(th);
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pey peyVar = (pey) poyVarM.b;
                pex pexVar = (pex) poyVarT.j();
                pexVar.getClass();
                peyVar.b = pexVar;
                peyVar.a |= 1;
                for (Throwable cause2 = th; cause2.getCause() != null; cause2 = cause2.getCause()) {
                    poy poyVarT2 = oxh.T(cause2.getCause());
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pey peyVar2 = (pey) poyVarM.b;
                    pex pexVar2 = (pex) poyVarT2.j();
                    pexVar2.getClass();
                    peyVar2.b();
                    peyVar2.c.add(pexVar2);
                }
                if (poyVarG.c) {
                    poyVarG.m();
                    poyVarG.c = false;
                }
                qxy qxyVar4 = (qxy) poyVarG.b;
                pey peyVar3 = (pey) poyVarM.j();
                peyVar3.getClass();
                qxyVar4.h = peyVar3;
                qxyVar4.a |= 256;
                myiVar.e((qxy) poyVarG.j());
                uncaughtExceptionHandler = this.b;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
            } catch (Exception e) {
                ((oug) ((oug) ((oug) myi.a.c()).h(e)).G(3621)).o("Failed to record crash.");
                uncaughtExceptionHandler = this.b;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.b;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
