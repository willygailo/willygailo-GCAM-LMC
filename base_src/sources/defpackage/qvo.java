package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class qvo extends qpg implements qlv {
    public final qlh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvo(qln qlnVar, qlh qlhVar) {
        super(qlnVar);
        qlnVar.getClass();
        qlhVar.getClass();
        this.f = qlhVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [qlh, qlv] */
    @Override // defpackage.qlv
    public final qlv getCallerFrame() {
        ?? r0 = this.f;
        if (r0 instanceof qlv) {
            return r0;
        }
        return null;
    }

    @Override // defpackage.qlv
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.qpg
    protected void hi(Object obj) {
        qlh qlhVar = this.f;
        qlhVar.resumeWith(qmd.h(obj, qlhVar));
    }

    @Override // defpackage.qro
    protected void j(Object obj) {
        qva.a(qmd.c(this.f), qmd.h(obj, this.f));
    }

    @Override // defpackage.qro
    protected final boolean k() {
        return true;
    }
}
