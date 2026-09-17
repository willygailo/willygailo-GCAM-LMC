package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes.dex */
@qlw(b = "androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1", c = "RoomDatabase.kt", d = "invokeSuspend", e = {R.styleable.AppCompatTheme_windowMinWidthMajor})
final class aik extends qmb implements qmy {
    int a;
    final /* synthetic */ qpn b;
    final /* synthetic */ qrg c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aik(qpn qpnVar, qrg qrgVar, qlh qlhVar) {
        super(2, qlhVar);
        this.b = qpnVar;
        this.c = qrgVar;
    }

    @Override // defpackage.qls
    public final qlh create(Object obj, qlh qlhVar) {
        aik aikVar = new aik(this.b, this.c, qlhVar);
        aikVar.d = obj;
        return aikVar;
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aik) create((qqj) obj, (qlh) obj2)).invokeSuspend(qks.a);
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        Object objG;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (this.a) {
            case 0:
                qmd.M(obj);
                qqj qqjVar = (qqj) this.d;
                qpn qpnVar = this.b;
                qlk qlkVar = qqjVar.hh().get(qlj.a);
                qlkVar.getClass();
                qpnVar.resumeWith(qlkVar);
                qrg qrgVar = this.c;
                this.a = 1;
                while (true) {
                    qro qroVar = (qro) qrgVar;
                    Object objV = qroVar.v();
                    if (!(objV instanceof qrb)) {
                        qnt.n(getContext());
                        objG = qks.a;
                    } else if (qroVar.t(objV) >= 0) {
                        qpo qpoVar = new qpo(qmd.c(this), 1);
                        qpoVar.r();
                        qpoVar.a(new qqs(qroVar.o(new qrw(qpoVar))));
                        objG = qpoVar.g();
                        if (objG != qlp.COROUTINE_SUSPENDED) {
                            objG = qks.a;
                        }
                        if (objG != qlp.COROUTINE_SUSPENDED) {
                            objG = qks.a;
                        }
                    }
                }
                if (objG == qlpVar) {
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
