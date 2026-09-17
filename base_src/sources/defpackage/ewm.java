package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ewm implements lij {
    public final /* synthetic */ exi a;
    private final /* synthetic */ int b;

    public /* synthetic */ ewm(exi exiVar, int i) {
        this.b = i;
        this.a = exiVar;
    }

    @Override // defpackage.lij
    public final void fB(Object obj) {
        switch (this.b) {
            case 0:
                exi exiVar = this.a;
                if (!((Boolean) obj).booleanValue()) {
                    exiVar.aj.c();
                } else {
                    exiVar.aj.e();
                }
                break;
            case 1:
                this.a.h.ak((hti) obj);
                break;
            case 2:
                exi exiVar2 = this.a;
                Boolean bool = (Boolean) obj;
                exiVar2.V.s(bool.booleanValue());
                if (!((fnj) exiVar2.w.get()).o) {
                    if (!bool.booleanValue()) {
                        exiVar2.h.ai(jrl.PHOTO);
                    } else {
                        exiVar2.h.i();
                    }
                }
                break;
            default:
                this.a.H(((Boolean) obj).booleanValue());
                break;
        }
    }
}
