package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qlr extends qlu {
    final /* synthetic */ qmy a;
    final /* synthetic */ Object b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlr(qlh qlhVar, qln qlnVar, qmy qmyVar, Object obj) {
        super(qlhVar, qlnVar);
        this.a = qmyVar;
        this.b = obj;
    }

    @Override // defpackage.qls
    protected final Object invokeSuspend(Object obj) {
        switch (this.c) {
            case 0:
                this.c = 1;
                qmd.M(obj);
                qmy qmyVar = this.a;
                qnt.a(qmyVar, 2);
                return qmyVar.invoke(this.b, this);
            case 1:
                this.c = 2;
                qmd.M(obj);
                return obj;
            default:
                throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
