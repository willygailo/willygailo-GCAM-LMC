package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fvc implements pys {
    private final qkg a;
    private final qkg b;

    public fvc(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static fvc a(qkg qkgVar, qkg qkgVar2) {
        return new fvc(qkgVar, qkgVar2);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List get() {
        fua fuaVar = ((fub) this.a).get();
        gxm gxmVar = ((djc) this.b).get();
        fvh[] fvhVarArr = new fvh[6];
        fvhVarArr[0] = new fve(1);
        fvhVarArr[1] = new fvd(true != gxmVar.e() ? 0.15f : 0.5f);
        fvhVarArr[2] = new fve(0);
        fvhVarArr[3] = gxmVar.e() ? fvq.h(fuaVar, fvb.b) : fvq.h(fuaVar, fvb.a);
        fvhVarArr[4] = new fvg(fuaVar);
        fvhVarArr[5] = new fve(2);
        return obr.aj(fvhVarArr);
    }
}
