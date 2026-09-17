package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", c = "ChannelFlow.kt", d = "invokeSuspend", e = {R.styleable.AppCompatTheme_controlBackground})
final class quc extends qmb implements qmy {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ qud c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public quc(qud qudVar, qlh qlhVar) {
        super(2, qlhVar);
        this.c = qudVar;
    }

    @Override // defpackage.qls
    public final qlh create(Object obj, qlh qlhVar) {
        quc qucVar = new quc(this.c, qlhVar);
        qucVar.b = obj;
        return qucVar;
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((quc) create((qte) obj, (qlh) obj2)).invokeSuspend(qks.a);
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (this.a) {
            case 0:
                qmd.M(obj);
                qte qteVar = (qte) this.b;
                qud qudVar = this.c;
                this.a = 1;
                quh quhVar = (quh) qudVar;
                qwo qwoVar = new qwo(quhVar.c);
                qur qurVar = new qur(qteVar);
                Object objA = quhVar.b.a(new quf((qrg) getContext().get(qrg.c), qwoVar, qteVar, qurVar), this);
                if (objA != qlp.COROUTINE_SUSPENDED) {
                    objA = qks.a;
                }
                if (objA == qlpVar) {
                    return qlpVar;
                }
                break;
            default:
                qmd.M(obj);
                break;
        }
        return qks.a;
    }
}
