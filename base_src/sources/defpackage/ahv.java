package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
@qlw(b = "androidx.room.CoroutinesRoom$Companion$execute$2", c = "CoroutinesRoom.kt", d = "invokeSuspend", e = {})
public final class ahv extends qmb implements qmy {
    final /* synthetic */ Callable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahv(Callable callable, qlh qlhVar) {
        super(2, qlhVar);
        this.a = callable;
    }

    @Override // defpackage.qls
    public final qlh create(Object obj, qlh qlhVar) {
        return new ahv(this.a, qlhVar);
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ahv) create((qqj) obj, (qlh) obj2)).invokeSuspend(qks.a);
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        qmd.M(obj);
        return this.a.call();
    }
}
