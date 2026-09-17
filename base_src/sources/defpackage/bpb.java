package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bpb implements lij {
    public final /* synthetic */ bpf a;
    private final /* synthetic */ int b;

    public /* synthetic */ bpb(bpf bpfVar, int i) {
        this.b = i;
        this.a = bpfVar;
    }

    @Override // defpackage.lij
    public final void fB(Object obj) {
        switch (this.b) {
            case 0:
                bpf bpfVar = this.a;
                bpo bpoVar = (bpo) obj;
                if (!bpfVar.c.k(ddl.br)) {
                    if (bpoVar.equals(bpo.AE_AF_LOCKED)) {
                        bpfVar.d.d();
                    } else if (bpoVar.equals(bpo.UNLOCKED)) {
                        bpfVar.d.f();
                        bpfVar.d();
                    }
                } else if (bpoVar.equals(bpo.AE_LOCKED)) {
                    bpfVar.d.d();
                } else if (bpoVar.equals(bpo.UNLOCKED)) {
                    bpfVar.d.e();
                }
                break;
            default:
                bpf bpfVar2 = this.a;
                PointF pointF = (PointF) obj;
                if (pointF.x >= 0.0f && pointF.y >= 0.0f) {
                    if (bpfVar2.b == lwd.FRONT) {
                        pointF.x = 1.0f - pointF.x;
                    }
                    bpfVar2.a.l(pointF);
                    break;
                }
                break;
        }
    }
}
