package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class hzn extends jxh {
    final /* synthetic */ pht a;

    public hzn(pht phtVar) {
        this.a = phtVar;
    }

    @Override // defpackage.jxg
    public final void a(PointF pointF) {
        hzo hzoVar = (hzo) mip.bY(this.a);
        if (hzoVar == null) {
            return;
        }
        hzoVar.a(pointF);
    }

    @Override // defpackage.jxf
    public final void b() {
        hzo hzoVar = (hzo) mip.bY(this.a);
        if (hzoVar == null) {
            return;
        }
        hzoVar.b();
    }

    @Override // defpackage.jxg
    public final void c(PointF pointF) {
        hzo hzoVar = (hzo) mip.bY(this.a);
        if (hzoVar == null) {
            return;
        }
        hzoVar.c(pointF);
    }
}
