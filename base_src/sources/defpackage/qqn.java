package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qqn extends qvo {
    public final qpc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqn(qln qlnVar, qlh qlhVar) {
        super(qlnVar, qlhVar);
        qlnVar.getClass();
        qlhVar.getClass();
        this.b = qnt.g(0);
    }

    /* JADX WARN: Switch 'out' block B:3:0x0002 for B:4:0x0004 already processed. Defaulting to fallback option. */
    @Override // defpackage.qvo, defpackage.qpg
    protected final void hi(Object obj) {
        qpc qpcVar = this.b;
        do {
            switch (qpcVar.b) {
                case 0:
                    break;
                case 1:
                    qva.a(qmd.c(this.f), qmd.h(obj, this.f));
                    return;
                default:
                    throw new IllegalStateException("Already resumed".toString());
            }
        } while (!this.b.d(0, 2));
    }

    @Override // defpackage.qvo, defpackage.qro
    protected final void j(Object obj) {
        hi(obj);
    }
}
