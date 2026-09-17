package androidx.window.java.layout;

import defpackage.fb;
import defpackage.qks;
import defpackage.qlh;
import defpackage.qlp;
import defpackage.qlw;
import defpackage.qmb;
import defpackage.qmd;
import defpackage.qmy;
import defpackage.qqj;
import defpackage.qtr;
import defpackage.qts;

/* JADX INFO: loaded from: classes.dex */
@qlw(b = "androidx.window.java.layout.WindowInfoRepositoryCallbackAdapter$addListener$1$1", c = "WindowInfoRepositoryCallbackAdapter.kt", d = "invokeSuspend", e = {112})
final class WindowInfoRepositoryCallbackAdapter$addListener$1$1 extends qmb implements qmy {
    final /* synthetic */ fb $consumer;
    final /* synthetic */ qtr $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoRepositoryCallbackAdapter$addListener$1$1(qtr qtrVar, fb fbVar, qlh qlhVar) {
        super(2, qlhVar);
        this.$flow = qtrVar;
        this.$consumer = fbVar;
    }

    @Override // defpackage.qls
    public final qlh create(Object obj, qlh qlhVar) {
        return new WindowInfoRepositoryCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, qlhVar);
    }

    @Override // defpackage.qmy
    public final Object invoke(qqj qqjVar, qlh qlhVar) {
        return ((WindowInfoRepositoryCallbackAdapter$addListener$1$1) create(qqjVar, qlhVar)).invokeSuspend(qks.a);
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                qmd.M(obj);
                qtr qtrVar = this.$flow;
                final fb fbVar = this.$consumer;
                qts qtsVar = new qts() { // from class: androidx.window.java.layout.WindowInfoRepositoryCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1
                    @Override // defpackage.qts
                    public Object emit(Object obj2, qlh qlhVar) {
                        fbVar.accept(obj2);
                        return qks.a;
                    }
                };
                this.label = 1;
                if (qtrVar.a(qtsVar, this) == qlpVar) {
                    return qlpVar;
                }
                break;
            case 1:
                qmd.M(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return qks.a;
    }
}
