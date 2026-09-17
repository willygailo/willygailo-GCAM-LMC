package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class aia extends aiy {
    public aia(aii aiiVar) {
        super(aiiVar);
    }

    public final void a(Object obj) {
        ake akeVarE = e();
        try {
            b(akeVarE, obj);
            akeVarE.b();
        } finally {
            f(akeVarE);
        }
    }

    protected abstract void b(ake akeVar, Object obj);

    public final void c(Object obj) {
        ake akeVarE = e();
        try {
            b(akeVarE, obj);
            akeVarE.b();
        } finally {
            f(akeVarE);
        }
    }
}
