package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", c = "Merge.kt", d = "invokeSuspend", e = {R.styleable.AppCompatTheme_editTextColor})
final class qug extends qmb implements qmy {
    int a;
    final /* synthetic */ qtr b;
    final /* synthetic */ qur c;
    final /* synthetic */ qwm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qug(qtr qtrVar, qur qurVar, qwm qwmVar, qlh qlhVar) {
        super(2, qlhVar);
        this.b = qtrVar;
        this.c = qurVar;
        this.d = qwmVar;
    }

    @Override // defpackage.qls
    public final qlh create(Object obj, qlh qlhVar) {
        return new qug(this.b, this.c, this.d, qlhVar);
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((qug) create((qqj) obj, (qlh) obj2)).invokeSuspend(qks.a);
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        try {
            switch (this.a) {
                case 0:
                    qmd.M(obj);
                    qtr qtrVar = this.b;
                    qur qurVar = this.c;
                    this.a = 1;
                    if (qtrVar.a(qurVar, this) == qlpVar) {
                        return qlpVar;
                    }
                    break;
                default:
                    qmd.M(obj);
                    break;
            }
            this.d.a();
            return qks.a;
        } catch (Throwable th) {
            this.d.a();
            throw th;
        }
    }
}
