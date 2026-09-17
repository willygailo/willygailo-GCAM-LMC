package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class ncq implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final /* synthetic */ int e;

    public ncq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i) {
        this.e = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public ncq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[] bArr) {
        this.e = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public ncq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[] cArr) {
        this.e = i;
        this.d = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
    }

    public ncq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[] sArr) {
        this.e = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.b = qkgVar4;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.e) {
            case 0:
                return new ncp(this.a, this.b, this.c, this.d);
            case 1:
                ((evv) this.b).a();
                return ope.H((mxo) (((ewk) this.d).b().g() ? this.c.get() : this.a.get()));
            case 2:
                nre nreVar = (nre) this.d.get();
                nmp nmpVar = (nmp) this.a.get();
                nrm nrmVar = (nrm) this.b.get();
                ohh ohhVar = (ohh) this.c.get();
                nreVar.getClass();
                nmpVar.getClass();
                nrmVar.getClass();
                ohhVar.getClass();
                return new nnv(nmpVar);
            default:
                return new nom((noq) this.c.get(), (File) this.d.get(), (ohh) this.a.get(), (nrm) this.b.get(), null, null, null);
        }
    }
}
