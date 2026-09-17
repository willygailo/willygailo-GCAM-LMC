package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class qeo extends qei {
    final qco c;

    public qeo(qbh qbhVar, qco qcoVar) {
        super(qbhVar);
        this.c = qcoVar;
    }

    @Override // defpackage.qbh
    protected final void h(qym qymVar) {
        qyl qylVar = this.b;
        qco qcoVar = this.c;
        if (!(qylVar instanceof Callable)) {
            qylVar.g(new qek(qymVar, qcoVar));
            return;
        }
        try {
            Object objCall = ((Callable) qylVar).call();
            if (objCall == null) {
                qjk.a(qymVar);
                return;
            }
            try {
                qyl qylVar2 = (qyl) qcoVar.a(objCall);
                qmd.W(qylVar2, "The mapper returned a null Publisher");
                if (!(qylVar2 instanceof Callable)) {
                    qylVar2.g(qymVar);
                    return;
                }
                try {
                    Object objCall2 = ((Callable) qylVar2).call();
                    if (objCall2 == null) {
                        qjk.a(qymVar);
                    } else {
                        qymVar.a(new qjl(qymVar, objCall2));
                    }
                } catch (Throwable th) {
                    qmd.Y(th);
                    qjk.d(th, qymVar);
                }
            } catch (Throwable th2) {
                qmd.Y(th2);
                qjk.d(th2, qymVar);
            }
        } catch (Throwable th3) {
            qmd.Y(th3);
            qjk.d(th3, qymVar);
        }
    }
}
