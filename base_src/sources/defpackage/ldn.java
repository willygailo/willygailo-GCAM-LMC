package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ldn implements lda {
    private final lda a;
    private final lco b;

    protected ldn(lda ldaVar) {
        this.a = ldaVar;
        this.b = lcv.j(ldaVar, new oiu() { // from class: ldm
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                ldn ldnVar = this.a;
                obj.getClass();
                Object objB = ldnVar.b(obj);
                if (objB != null) {
                    return objB;
                }
                String strValueOf = String.valueOf(obj);
                String name = ldnVar.getClass().getName();
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 64 + String.valueOf(name).length());
                sb.append("Transforming input value: ");
                sb.append(strValueOf);
                sb.append(" resulted in a null output value for: ");
                sb.append(name);
                throw new NullPointerException(sb.toString());
            }
        });
    }

    @Override // defpackage.lco
    public final lie a(lij lijVar, Executor executor) {
        return this.b.a(lijVar, executor);
    }

    protected abstract Object b(Object obj);

    protected abstract Object c(Object obj);

    public Object fA() {
        return this.b.fA();
    }

    @Override // defpackage.lij
    public final void fB(Object obj) {
        lda ldaVar = this.a;
        obj.getClass();
        Object objC = c(obj);
        if (objC != null) {
            ldaVar.fB(objC);
            return;
        }
        String strValueOf = String.valueOf(obj);
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 64 + String.valueOf(name).length());
        sb.append("Transforming output value: ");
        sb.append(strValueOf);
        sb.append(" resulted in a null input value for: ");
        sb.append(name);
        throw new NullPointerException(sb.toString());
    }
}
