package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", c = "ChannelFlow.kt", d = "invokeSuspend", e = {R.styleable.AppCompatTheme_windowFixedWidthMinor})
final class qub extends qmb implements qmy {
    int a;
    final /* synthetic */ qts b;
    final /* synthetic */ qud c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qub(qts qtsVar, qud qudVar, qlh qlhVar) {
        super(2, qlhVar);
        this.b = qtsVar;
        this.c = qudVar;
    }

    @Override // defpackage.qls
    public final qlh create(Object obj, qlh qlhVar) {
        qub qubVar = new qub(this.b, this.c, qlhVar);
        qubVar.d = obj;
        return qubVar;
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((qub) create((qqj) obj, (qlh) obj2)).invokeSuspend(qks.a);
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        Object obj2 = qlp.COROUTINE_SUSPENDED;
        switch (this.a) {
            case 0:
                qmd.M(obj);
                qqj qqjVar = (qqj) this.d;
                qts qtsVar = this.b;
                qtg qtgVarC = this.c.c(qqjVar);
                this.a = 1;
                Object objW = qnm.w(qtsVar, qtgVarC, true, this);
                if (objW != qlp.COROUTINE_SUSPENDED) {
                    objW = qks.a;
                }
                if (objW == obj2) {
                    return obj2;
                }
                break;
            default:
                qmd.M(obj);
                break;
        }
        return qks.a;
    }
}
