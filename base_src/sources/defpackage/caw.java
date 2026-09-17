package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class caw extends jxi {
    public lwd a;
    cav b;
    public ghx c;
    public nle d;
    private final jrr e;
    private final cvo f;
    private final jcf g;

    public caw(jrr jrrVar, jcf jcfVar, lwf lwfVar, cvo cvoVar, bqg bqgVar, ddf ddfVar, dkm dkmVar) {
        this.e = jrrVar;
        this.g = jcfVar;
        this.f = cvoVar;
        bqgVar.i().c(cvoVar.a(new lij() { // from class: cau
            @Override // defpackage.lij
            public final void fB(Object obj) {
                caw cawVar = this.a;
                cwi cwiVar = (cwi) obj;
                synchronized (cawVar) {
                    if (cwiVar.a() != cawVar.a) {
                        cawVar.a = cwiVar.a();
                        cawVar.c = cwiVar.a;
                        cawVar.d = new nle(cawVar.c.f());
                    }
                }
            }
        }, pgr.INSTANCE));
        lwd lwdVarD = cvoVar.d();
        this.a = lwdVarD;
        lvs lvsVarB = dkmVar.b(lwfVar, ddfVar, lwdVarD);
        lvsVarB.getClass();
        this.d = new nle(lwfVar.f(lvsVarB).f());
    }

    @Override // defpackage.jxj
    public final synchronized boolean a(PointF pointF) {
        boolean z;
        if (this.d != null) {
            this.d.j(this.e.a(pointF, this.g.a(), this.f.d()));
            cav cavVar = this.b;
            if (cavVar != null) {
                ((cas) cavVar).i++;
            }
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
