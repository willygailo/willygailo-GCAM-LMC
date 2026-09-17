package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
@qlw(b = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", c = "CoroutinesRoom.kt", d = "invokeSuspend", e = {})
public final class ahx extends qmb implements qmy {
    final /* synthetic */ Callable a;
    final /* synthetic */ qpn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahx(Callable callable, qpn qpnVar, qlh qlhVar) {
        super(2, qlhVar);
        this.a = callable;
        this.b = qpnVar;
    }

    @Override // defpackage.qls
    public final qlh create(Object obj, qlh qlhVar) {
        return new ahx(this.a, this.b, qlhVar);
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ahx) create((qqj) obj, (qlh) obj2)).invokeSuspend(qks.a);
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        qmd.M(obj);
        try {
            this.b.resumeWith(this.a.call());
        } catch (Throwable th) {
            this.b.resumeWith(qmd.L(th));
        }
        return qks.a;
    }
}
