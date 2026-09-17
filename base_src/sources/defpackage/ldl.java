package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ldl implements lco {
    private final lco a;
    private final lco b;

    protected ldl(lco lcoVar) {
        this.a = lcoVar;
        this.b = lci.c(new ldk(this, lcoVar));
    }

    @Override // defpackage.lco
    public final lie a(lij lijVar, Executor executor) {
        return this.b.a(lijVar, executor);
    }

    protected abstract Object c(Object obj);

    @Override // defpackage.lco
    public final Object fA() {
        return this.b.fA();
    }

    public final Object h(Object obj) {
        if (obj == null) {
            String strValueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 29);
            sb.append("Input: ");
            sb.append(strValueOf);
            sb.append(" returned a null value");
            throw new NullPointerException(sb.toString());
        }
        Object objC = c(obj);
        if (objC != null) {
            return objC;
        }
        String strValueOf2 = String.valueOf(obj);
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 58 + String.valueOf(name).length());
        sb2.append("Transforming input value: ");
        sb2.append(strValueOf2);
        sb2.append(" resulted in a null output for: ");
        sb2.append(name);
        throw new NullPointerException(sb2.toString());
    }
}
