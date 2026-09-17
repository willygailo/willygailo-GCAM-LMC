package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cpi extends ldn implements cpl {
    private final ddf a;

    public cpi(ddf ddfVar, hup hupVar) {
        super(hupVar);
        this.a = ddfVar;
    }

    @Override // defpackage.ldn
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        return ldz.c(((htg) obj).name());
    }

    @Override // defpackage.ldn
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        return htg.a(((ldz) obj).name());
    }

    @Override // defpackage.ldn, defpackage.lco
    public final /* bridge */ /* synthetic */ Object fA() {
        ojc ojcVarA = this.a.a(dcu.b);
        if (!ojcVarA.g()) {
            return (ldz) super.fA();
        }
        if (((Integer) ojcVarA.c()).intValue() == 30) {
            return ldz.FPS_30;
        }
        if (((Integer) ojcVarA.c()).intValue() == 60) {
            return ldz.FPS_60;
        }
        return ((Integer) ojcVarA.c()).intValue() == 0 ? ldz.FPS_AUTO : (ldz) super.fA();
    }
}
